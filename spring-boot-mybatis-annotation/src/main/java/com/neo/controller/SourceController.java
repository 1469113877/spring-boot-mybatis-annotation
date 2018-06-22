package com.neo.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neo.api.GOSEEK;
import com.neo.api.JUHE;
import com.neo.api.Tencent;
import com.neo.domain.PageData;
import com.neo.domain.TencentResult;
import com.neo.mapper.SourceMapper;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;


@RestController
public class SourceController extends BaseController{
	@Resource
	private SourceMapper sourceMapper;
	
	@RequestMapping("/refresh")
	public String refresh() {
		PageData request = this.getPageData();
		if(StringUtils.isNotBlank(request.getString("table"))) {
			String table = request.getString("table");
			if(StringUtils.equals(table, "other")) {
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
			}else if(StringUtils.equals(table, "code")) {
				requestAndSave();
			}else if(StringUtils.equals(table, "date")) {
				PageData date = new PageData(); 
				String isholiday = GOSEEK.getRequest();
				date.put("date", new java.util.Date());
				date.put("type", isholiday);
				sourceMapper.insertDate(date);
			}
		}

		return "successs";
	}
	
	@RequestMapping("/move2")
	public String move2() {
		sourceMapper.insertNotTodaySource2();
		sourceMapper.deleteNotTodaySource();
		sourceMapper.insertNotTodayBs2();
		sourceMapper.deleteNotTodayBs();
		sourceMapper.insertNotTodayInfo2();
		sourceMapper.deleteNotTodayInfo();
		return "successs";
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
		System.out.println(result7.getInt("totalCount")+" "+result6.getInt("totalCount")+" "+total.size());
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