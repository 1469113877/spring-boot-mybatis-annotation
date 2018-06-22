  
/**    
 * @Title: SourceScheduler.java  
 * @Package com.neo.scheduler  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author tangxl  
 * @date 2018年6月14日  
 * @version V1.0    
 */  
    
package com.neo.scheduler;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.neo.api.GOSEEK;
import com.neo.api.JUHE;
import com.neo.api.Tencent;
import com.neo.domain.PageData;
import com.neo.domain.TencentResult;
import com.neo.mapper.SourceMapper;

import ch.qos.logback.core.joran.conditional.IfAction;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**  
 * @ClassName: SourceScheduler  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author tangxl  
 * @date 2018年6月14日  
 *    
 */
@Component
public class SourceScheduler {
	@Resource
	private SourceMapper sourceMapper;

 
//	@Scheduled(cron="0/2 * * * * ?")
    /*@Scheduled(cron="0 0/20 16 * * ?")*///在每天下午4点到5点期间的每20分钟触发
	@Scheduled(cron="0/3 * 9-15 * * ?")
	public void executeSourceDowload() {
		PageData date = sourceMapper.selectDate();
		if(date == null || (date != null && StringUtils.equals(date.getString("type"), "0"))) {
			PageData pageData = new PageData();
			pageData.put("startPage", 0);
			pageData.put("endPage", 500);
			List<PageData> codes= new ArrayList<PageData>();
			do {
				codes= sourceMapper.getCodeBypage(pageData);
				pageData.put("startPage", (Integer)pageData.get("startPage")+500);
				List<String> list = new ArrayList<String>();
				for(PageData code : codes) {
					list.add(code.getString("code"));
				}
				List<TencentResult> result = Tencent.getRequest(StringUtils.join(list.toArray(), ","));
				sourceMapper.insert(result);
		    	sourceMapper.insertBs(result);
		    	sourceMapper.insertInfo(result);
			}while(codes.size() == 500);
		}
	}
	
	@Scheduled(cron="0 0 0 * * ?")
	public void move2() {
		sourceMapper.insertNotTodaySource2();
		sourceMapper.deleteNotTodaySource();
		sourceMapper.insertNotTodayBs2();
		sourceMapper.deleteNotTodayBs();
		sourceMapper.insertNotTodayInfo2();
		sourceMapper.deleteNotTodayInfo();
	}
	
	@Scheduled(cron="0 0 1 * * ?")
	public void refreshDate() {
		PageData date = new PageData(); 
		String isholiday = GOSEEK.getRequest();
		date.put("date", new java.util.Date());
		date.put("type", isholiday);
		sourceMapper.insertDate(date);
	}

	@Scheduled(cron="0 0 2,3,4 * * ?")
	public void refreshCode() {
		PageData date = sourceMapper.selectDate();
		if(date == null || (date != null && StringUtils.equals(date.getString("type"), "0"))) {
			requestAndSave();
		}
	}
	
	public void requestAndSave() {
		JSONObject object7 = JUHE.getRequest7(1,4);
		JSONObject object6 = JUHE.getRequest6(1,4);
		JSONObject result7 = object7.getJSONObject("result");
		JSONArray data7 = result7.getJSONArray("data");
		JSONArray total = new JSONArray();
		int num = result7.getInt("num");
		int page = result7.getInt("page");
		int totalCount = result7.getInt("totalCount");
		while ((totalCount-page*num)/num>-1) {
			if(page > 1) {
				object7 = JUHE.getRequest7(page,4);
				result7 = object7.getJSONObject("result");
				data7 = result7.getJSONArray("data");
				num = result7.getInt("num");
			}
			total.addAll(data7);
			page++;
		}
		
		JSONObject result6 = object6.getJSONObject("result");
		JSONArray data6 = result6.getJSONArray("data");
		num = result6.getInt("num");
		page = result6.getInt("page");
		totalCount = result6.getInt("totalCount");
		while ((totalCount-page*num)/num>-1) {
			if(page > 1) {
				object6 = JUHE.getRequest6(page,4);
				result6 = object6.getJSONObject("result");
				data6 = result6.getJSONArray("data");
				num = result6.getInt("num");
			}
			total.addAll(data6);
			page++;
		}
		
		if(result7.getInt("totalCount")+result6.getInt("totalCount") == total.size()) {
			sourceMapper.deleteCode();
			save(total);
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(new Date())+":"+result7.getInt("totalCount")+" "+result6.getInt("totalCount")+" "+total.size());
	}
	
	public void save(JSONArray data){
		for(int i=0;i<data.size();i++){
			JSONObject share = data.getJSONObject(i);
			PageData pageData = new PageData();
			pageData.put("code", StringUtils.lowerCase(share.getString("symbol")));
			sourceMapper.insertCode(pageData);
		}
	}
	

}
