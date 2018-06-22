  
/**    
 * @Title: BaseController.java  
 * @Package com.bywin.controller  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author tangxl  
 * @date 2018年6月5日  
 * @version V1.0    
 */  
    
package com.neo.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.neo.domain.PageData;


/**  
 * @ClassName: BaseController  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author tangxl  
 * @date 2018年6月5日  
 *    
 */
@RestController
public class BaseController {
	public PageData getPageData(){
		return new PageData(this.getRequest());
	}
	
	/**得到ModelAndView
	 * @return
	 */
	public ModelAndView getModelAndView(){
		return new ModelAndView();
	}
	
	/**得到request对象
	 * @return
	 */
	public HttpServletRequest getRequest() {
		HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
		return request;
	}
	
	public String get32UUID(){
		String uuid = UUID.randomUUID().toString().trim().replaceAll("-", "");
		return uuid;
	}
	
	//java获取当前月的天数
	public int getDayOfMonth(){
	   Calendar aCalendar = Calendar.getInstance(Locale.CHINA);
	   int day=aCalendar.getActualMaximum(Calendar.DATE);
	   return day;
	}
	
	/**获取当前时间格式化后的日期
	 * @return
	 */
	public Date getDateTimeNow() { 
	        // 创建日期对象 
	        Date d = new Date(); 
	        // 给定模式 
	        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
	        // public final String format(Date date)  

	        String s = sdf.format(d); 
	        Date dateTrans=null;
	        try { 
		         dateTrans = sdf.parse(s); 
	        } catch (Exception e) {  
		            e.printStackTrace();  
		    } 
	        return dateTrans;
	}
	
	/**获取当前时间格式化后的日期
	 * @return
	 */
	public Date getDateNow() { 
	        // 创建日期对象 
	        Date d = new Date(); 
	        // 给定模式 
	        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
	        // public final String format(Date date)  

	        String s = sdf.format(d); 
	        Date dateTrans=null;
	        try { 
		         dateTrans = sdf.parse(s); 
	        } catch (Exception e) {  
		            e.printStackTrace();  
		    } 
	        return dateTrans;
	}
	
	/**代入字符串时间，格式化为日期格式
	 * @return
	 */
	public String formatDateToString(Date date) { 
	        // 给定模式 
	        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
	        String dateTrans=null;
	        try { 
		         dateTrans = sdf.format(date); 
	        } catch (Exception e) {  
		            e.printStackTrace();  
		    } 
	        return dateTrans;
	}
	
	/**代入字符串时间，格式化为日期格式
	 * @return
	 */
	public String formatDateTimeToString(Date date) { 
	        // 给定模式 
	        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
	        String dateTrans=null;
	        try { 
		         dateTrans = sdf.format(date); 
	        } catch (Exception e) {  
		            e.printStackTrace();  
		    } 
	        return dateTrans;
	}
	
	/**代入字符串时间，格式化为日期格式
	 * @return
	 */
	public Date formatStringToDate(String date) { 
	        // 给定模式 
	        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
	        Date dateTrans=null;
	        try { 
		         dateTrans = sdf.parse(date); 
	        } catch (Exception e) {  
		            e.printStackTrace();  
		    } 
	        return dateTrans;
	}
	
	/**代入字符串时间，格式化为日期格式
	 * @return "yyyy-MM-dd HH:mm:ss"
	 */
	public Date formatStringToDateTime(String date) { 
	        // 给定模式 
	        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
	        Date dateTrans=null;
	        try { 
		         dateTrans = sdf.parse(date); 
	        } catch (Exception e) {  
		            e.printStackTrace();  
		    } 
	        return dateTrans;
	}

	/**代入字符串时间，格式化为日期格式
	 * @return "HH:mm:ss"
	 */
	public Date formatStringToTime(String date) { 
	        // 给定模式 
	        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss"); 
	        Date dateTrans=null;
	        try { 
		         dateTrans = sdf.parse(date); 
	        } catch (Exception e) {  
		            e.printStackTrace();  
		    } 
	        return dateTrans;
	}
	
	/**
	 * 
	 *功能：过滤空字符串
	 *@param keyWords
	 *@return String
	 *
	 */
	public String trimString(String keyWords) {
		if (keyWords!=null && !"".equals(keyWords)) {
			return keyWords.trim();
		}else {
			return keyWords;
		}
	}
}
