  
/**    
 * @Title: Tencent.java  
 * @Package com.neo.api  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author tangxl  
 * @date 2018年6月15日  
 * @version V1.0    
 */  
    
package com.neo.api;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.neo.domain.TencentResult;

/**  
 * @ClassName: Tencent  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author tangxl  
 * @date 2018年6月15日  
 *    
 */

public class Tencent {
    public static final String DEF_CHATSET = "GB2312";
    public static final int DEF_CONN_TIMEOUT = 30000;
    public static final int DEF_READ_TIMEOUT = 30000;
    public static String userAgent =  "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/29.0.1547.66 Safari/537.36";
    
    //8.腾迅股票数据接口
    public static List<TencentResult> getRequest(String codes){
        String result =null;
        String url ="http://qt.gtimg.cn";//请求接口地址
        Map params = new HashMap();//请求参数
            params.put("q",codes);//您申请的APPKEY
        try {
            result =net(url, params, "GET");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return parse(result);
    }
	
	public static String getKey(String code) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		return sdf.format(new Date())+code;
	}
	
    public static List<TencentResult> parse(String tencent) {
    	List<TencentResult> r = new ArrayList<TencentResult>();
    	for(String s0: tencent.split(";")) {
    		TencentResult tencentResult= new TencentResult();
    		tencentResult.setModified_time(new Date());
    		String code = "";
    		for(int i = 0 ; i < s0.split("=").length ;i++) {
    			String[] a0 = s0.split("=");
    			if(i == 0) {
    				code = a0[i].replace("v_", "");
    				tencentResult.setId(getKey(code));
    			}else if (i == 1) {
    				String[] a1 = a0[i].split("~");
    				for(int j = 0 ; j < a1.length ; j++) {
    					if (j == 1) {
    						tencentResult.setName(a1[j]);
    					}else if (j == 2) {
    						tencentResult.setCode(code);
    					}else if (j == 3) {
    						tencentResult.setTrade(a1[j]);
						}else if (j == 4) {
							tencentResult.setSettlement(a1[j]);
						}else if (j == 5) {
							tencentResult.setOpen(a1[j]);
						}else if (j == 6) {
							tencentResult.setVolume(a1[j]);
						}else if (j == 7) {
							tencentResult.setOut(a1[j]);
						}else if (j == 8) {
							tencentResult.setIn(a1[j]);
						}else if (j == 9) {
							tencentResult.setB1(a1[j]);
						}else if (j == 10) {
							tencentResult.setBv1(a1[j]);
						}else if (j == 11) {
							tencentResult.setB2(a1[j]);
						}else if (j == 12) {
							tencentResult.setBv2(a1[j]);
						}else if (j == 13) {
							tencentResult.setB3(a1[j]);
						}else if (j == 14) {
							tencentResult.setBv3(a1[j]);
						}else if (j == 15) {
							tencentResult.setB4(a1[j]);
						}else if (j == 16) {
							tencentResult.setBv4(a1[j]);
						}else if (j == 17) {
							tencentResult.setB5(a1[j]);
						}else if (j == 18) {
							tencentResult.setBv5(a1[j]);
						}else if (j == 19) {
							tencentResult.setS1(a1[j]);
						}else if (j == 20) {
							tencentResult.setSv1(a1[j]);
						}else if (j == 21) {
							tencentResult.setS2(a1[j]);
						}else if (j == 22) {
							tencentResult.setSv2(a1[j]);
						}else if (j == 23) {
							tencentResult.setS3(a1[j]);
						}else if (j == 24) {
							tencentResult.setSv3(a1[j]);
						}else if (j == 25) {
							tencentResult.setS4(a1[j]);
						}else if (j == 26) {
							tencentResult.setSv4(a1[j]);
						}else if (j == 27) {
							tencentResult.setS5(a1[j]);
						}else if (j == 28) {
							tencentResult.setSv5(a1[j]);
						}else if (j == 29) {
							tencentResult.setObo(a1[j]);
						}else if (j == 30) {
							tencentResult.setTime(a1[j]);
						}else if (j == 31) {
							tencentResult.setPricechange(a1[j]);
						}else if (j == 32) {
							tencentResult.setChangepercent(a1[j]);
						}else if (j == 33) {
							tencentResult.setTop(a1[j]);
						}else if (j == 34) {
							tencentResult.setLow(a1[j]);
						}else if (j == 35) {
							tencentResult.setBva(a1[j]);
						}else if (j == 36) {

						}else if (j == 37) {
							tencentResult.setAmount(a1[j]);
						}else if (j == 38) {
							tencentResult.setTurnover(a1[j]);
						}else if (j == 39) {
							tencentResult.setPb(a1[j]);
						}else if (j == 40) {

						}else if (j == 41) {

						}else if (j == 42) {

						}else if (j == 43) {
							tencentResult.setWaves(a1[j]);
						}else if (j == 44) {
							tencentResult.setFamc(a1[j]);
						}else if (j == 45) {
							tencentResult.setTotal(a1[j]);
						}else if (j == 46) {
							tencentResult.setPe(a1[j]);
						}else if (j == 47) {
							tencentResult.setTopPrice(a1[j]);
						}else if (j == 48	) {
							tencentResult.setLowPrice(a1[j]);
						}
    				}
				}
    		}
    		r.add(tencentResult);
    	}
    	return r;
    }
    
    /**
    *
    * @param strUrl 请求地址
    * @param params 请求参数
    * @param method 请求方法
    * @return  网络请求字符串
    * @throws Exception
    */
   public static String net(String strUrl, Map params,String method) throws Exception {
       HttpURLConnection conn = null;
       BufferedReader reader = null;
       String rs = null;
       try {
           StringBuffer sb = new StringBuffer();
           if(method==null || method.equals("GET")){
               strUrl = strUrl+"?"+urlencode(params);
           }
           URL url = new URL(strUrl);
           conn = (HttpURLConnection) url.openConnection();
           if(method==null || method.equals("GET")){
               conn.setRequestMethod("GET");
           }else{
               conn.setRequestMethod("POST");
               conn.setDoOutput(true);
           }
           conn.setRequestProperty("User-agent", userAgent);
           conn.setUseCaches(false);
           conn.setConnectTimeout(DEF_CONN_TIMEOUT);
           conn.setReadTimeout(DEF_READ_TIMEOUT);
           conn.setInstanceFollowRedirects(false);
           conn.connect();
           if (params!= null && method.equals("POST")) {
               try {
                   DataOutputStream out = new DataOutputStream(conn.getOutputStream());
                       out.writeBytes(urlencode(params));
               } catch (Exception e) {
                   // TODO: handle exception
               }
           }
           InputStream is = conn.getInputStream();
           reader = new BufferedReader(new InputStreamReader(is, DEF_CHATSET));
           String strRead = null;
           while ((strRead = reader.readLine()) != null) {
               sb.append(strRead);
           }
           rs = sb.toString();
       } catch (IOException e) {
           e.printStackTrace();
       } finally {
           if (reader != null) {
               reader.close();
           }
           if (conn != null) {
               conn.disconnect();
           }
       }
       return rs;
   }

   //将map型转为请求参数型
   public static String urlencode(Map<String,Object>data) {
       StringBuilder sb = new StringBuilder();
       for (Map.Entry i : data.entrySet()) {
           try {
               sb.append(i.getKey()).append("=").append(URLEncoder.encode(i.getValue()+"","UTF-8")).append("&");
           } catch (UnsupportedEncodingException e) {
               e.printStackTrace();
           }
       }
       return sb.toString();
   }
}
