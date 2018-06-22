  
/**    
 * @Title: TencentResult.java  
 * @Package com.neo.domain  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author tangxl  
 * @date 2018年6月15日  
 * @version V1.0    
 */  
    
package com.neo.domain;

import java.util.Date;

/**  
 * @ClassName: TencentResult  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author tangxl  
 * @date 2018年6月15日  
 *    
 */

public class TencentResult {
	private String id;
	private String code;//代码
	private String name;//名字
	private String trade;//当前价格
	private String settlement;//昨收
	private String open;//今开
	private String volume;//成交量（手）
	private String out;//外盘
	private String in;//内盘
	private String b1;
	private String bv1;
	private String b2;
	private String bv2;
	private String b3;
	private String bv3;
	private String b4;
	private String bv4;
	private String b5;
	private String bv5;
	private String s1;
	private String sv1;
	private String s2;
	private String sv2;
	private String s3;
	private String sv3;
	private String s4;
	private String sv4;
	private String s5;
	private String sv5;
	private String obo;//最近逐笔成交
	private String time;//代码
	private String pricechange;//涨跌额
	private String changepercent;//涨跌幅
	private String top;//最高
	private String low;//最低
	private String bva;//价格/成交量（手）/成交额	
	private String amount;//成交额
	private String turnover;//换手率
	private String waves;//振幅
	private String famc;//流通市值
	private String total;//总市值
	private String pe;//市盈率
	private String lowPrice;
	private String topPrice;
	private String pb;//市净率
	private Date modified_time;
	
	
	/**  
	 * @return id
	 * @author tangxl  
	 * @date 2018年6月15日	
	 */
	
	public String getId() {
		return id;
	}


	
	/**  
	 * @param paramtheparamthe{bare_field_name} to set 
	 * @author tangxl  
	 * @date 2018年6月15日	 
	 */
	
	public void setId(String id) {
		this.id = id;
	}


	/**  
	 * @return pb
	 * @author tangxl  
	 * @date 2018年6月15日	
	 */
	
	public String getPb() {
		return pb;
	}

	
	/**  
	 * @param paramtheparamthe{bare_field_name} to set 
	 * @author tangxl  
	 * @date 2018年6月15日	 
	 */
	
	public void setPb(String pb) {
		this.pb = pb;
	}

	/**  
	 * @return code
	 * @author tangxl  
	 * @date 2018年6月15日	
	 */
	
	public String getCode() {
		return code;
	}
	
	/**  
	 * @param paramtheparamthe{bare_field_name} to set 
	 * @author tangxl  
	 * @date 2018年6月15日	 
	 */
	
	public void setCode(String code) {
		this.code = code;
	}
	
	/**  
	 * @return name
	 * @author tangxl  
	 * @date 2018年6月15日	
	 */
	
	public String getName() {
		return name;
	}
	
	/**  
	 * @param paramtheparamthe{bare_field_name} to set 
	 * @author tangxl  
	 * @date 2018年6月15日	 
	 */
	
	public void setName(String name) {
		this.name = name;
	}
	
	/**  
	 * @return trade
	 * @author tangxl  
	 * @date 2018年6月15日	
	 */
	
	public String getTrade() {
		return trade;
	}
	
	/**  
	 * @param paramtheparamthe{bare_field_name} to set 
	 * @author tangxl  
	 * @date 2018年6月15日	 
	 */
	
	public void setTrade(String trade) {
		this.trade = trade;
	}
	
	/**  
	 * @return settlement
	 * @author tangxl  
	 * @date 2018年6月15日	
	 */
	
	public String getSettlement() {
		return settlement;
	}
	
	/**  
	 * @param paramtheparamthe{bare_field_name} to set 
	 * @author tangxl  
	 * @date 2018年6月15日	 
	 */
	
	public void setSettlement(String settlement) {
		this.settlement = settlement;
	}
	
	/**  
	 * @return open
	 * @author tangxl  
	 * @date 2018年6月15日	
	 */
	
	public String getOpen() {
		return open;
	}
	
	/**  
	 * @param paramtheparamthe{bare_field_name} to set 
	 * @author tangxl  
	 * @date 2018年6月15日	 
	 */
	
	public void setOpen(String open) {
		this.open = open;
	}
	
	/**  
	 * @return volume
	 * @author tangxl  
	 * @date 2018年6月15日	
	 */
	
	public String getVolume() {
		return volume;
	}
	
	/**  
	 * @param paramtheparamthe{bare_field_name} to set 
	 * @author tangxl  
	 * @date 2018年6月15日	 
	 */
	
	public void setVolume(String volume) {
		this.volume = volume;
	}
	
	/**  
	 * @return out
	 * @author tangxl  
	 * @date 2018年6月15日	
	 */
	
	public String getOut() {
		return out;
	}
	
	/**  
	 * @param paramtheparamthe{bare_field_name} to set 
	 * @author tangxl  
	 * @date 2018年6月15日	 
	 */
	
	public void setOut(String out) {
		this.out = out;
	}
	
	/**  
	 * @return in
	 * @author tangxl  
	 * @date 2018年6月15日	
	 */
	
	public String getIn() {
		return in;
	}
	
	/**  
	 * @param paramtheparamthe{bare_field_name} to set 
	 * @author tangxl  
	 * @date 2018年6月15日	 
	 */
	
	public void setIn(String in) {
		this.in = in;
	}
	
	/**  
	 * @return b1
	 * @author tangxl  
	 * @date 2018年6月15日	
	 */
	
	public String getB1() {
		return b1;
	}
	
	/**  
	 * @param paramtheparamthe{bare_field_name} to set 
	 * @author tangxl  
	 * @date 2018年6月15日	 
	 */
	
	public void setB1(String b1) {
		this.b1 = b1;
	}
	
	/**  
	 * @return bv1
	 * @author tangxl  
	 * @date 2018年6月15日	
	 */
	
	public String getBv1() {
		return bv1;
	}
	
	/**  
	 * @param paramtheparamthe{bare_field_name} to set 
	 * @author tangxl  
	 * @date 2018年6月15日	 
	 */
	
	public void setBv1(String bv1) {
		this.bv1 = bv1;
	}
	
	/**  
	 * @return b2
	 * @author tangxl  
	 * @date 2018年6月15日	
	 */
	
	public String getB2() {
		return b2;
	}
	
	/**  
	 * @param paramtheparamthe{bare_field_name} to set 
	 * @author tangxl  
	 * @date 2018年6月15日	 
	 */
	
	public void setB2(String b2) {
		this.b2 = b2;
	}
	
	/**  
	 * @return bv2
	 * @author tangxl  
	 * @date 2018年6月15日	
	 */
	
	public String getBv2() {
		return bv2;
	}
	
	/**  
	 * @param paramtheparamthe{bare_field_name} to set 
	 * @author tangxl  
	 * @date 2018年6月15日	 
	 */
	
	public void setBv2(String bv2) {
		this.bv2 = bv2;
	}
	
	/**  
	 * @return b3
	 * @author tangxl  
	 * @date 2018年6月15日	
	 */
	
	public String getB3() {
		return b3;
	}
	
	/**  
	 * @param paramtheparamthe{bare_field_name} to set 
	 * @author tangxl  
	 * @date 2018年6月15日	 
	 */
	
	public void setB3(String b3) {
		this.b3 = b3;
	}
	
	/**  
	 * @return bv3
	 * @author tangxl  
	 * @date 2018年6月15日	
	 */
	
	public String getBv3() {
		return bv3;
	}
	
	/**  
	 * @param paramtheparamthe{bare_field_name} to set 
	 * @author tangxl  
	 * @date 2018年6月15日	 
	 */
	
	public void setBv3(String bv3) {
		this.bv3 = bv3;
	}
	
	/**  
	 * @return b4
	 * @author tangxl  
	 * @date 2018年6月15日	
	 */
	
	public String getB4() {
		return b4;
	}
	
	/**  
	 * @param paramtheparamthe{bare_field_name} to set 
	 * @author tangxl  
	 * @date 2018年6月15日	 
	 */
	
	public void setB4(String b4) {
		this.b4 = b4;
	}
	
	/**  
	 * @return bv4
	 * @author tangxl  
	 * @date 2018年6月15日	
	 */
	
	public String getBv4() {
		return bv4;
	}
	
	/**  
	 * @param paramtheparamthe{bare_field_name} to set 
	 * @author tangxl  
	 * @date 2018年6月15日	 
	 */
	
	public void setBv4(String bv4) {
		this.bv4 = bv4;
	}
	
	/**  
	 * @return b5
	 * @author tangxl  
	 * @date 2018年6月15日	
	 */
	
	public String getB5() {
		return b5;
	}
	
	/**  
	 * @param paramtheparamthe{bare_field_name} to set 
	 * @author tangxl  
	 * @date 2018年6月15日	 
	 */
	
	public void setB5(String b5) {
		this.b5 = b5;
	}
	
	/**  
	 * @return bv5
	 * @author tangxl  
	 * @date 2018年6月15日	
	 */
	
	public String getBv5() {
		return bv5;
	}
	
	/**  
	 * @param paramtheparamthe{bare_field_name} to set 
	 * @author tangxl  
	 * @date 2018年6月15日	 
	 */
	
	public void setBv5(String bv5) {
		this.bv5 = bv5;
	}
	
	/**  
	 * @return s1
	 * @author tangxl  
	 * @date 2018年6月15日	
	 */
	
	public String getS1() {
		return s1;
	}
	
	/**  
	 * @param paramtheparamthe{bare_field_name} to set 
	 * @author tangxl  
	 * @date 2018年6月15日	 
	 */
	
	public void setS1(String s1) {
		this.s1 = s1;
	}
	
	/**  
	 * @return sv1
	 * @author tangxl  
	 * @date 2018年6月15日	
	 */
	
	public String getSv1() {
		return sv1;
	}
	
	/**  
	 * @param paramtheparamthe{bare_field_name} to set 
	 * @author tangxl  
	 * @date 2018年6月15日	 
	 */
	
	public void setSv1(String sv1) {
		this.sv1 = sv1;
	}
	
	/**  
	 * @return s2
	 * @author tangxl  
	 * @date 2018年6月15日	
	 */
	
	public String getS2() {
		return s2;
	}
	
	/**  
	 * @param paramtheparamthe{bare_field_name} to set 
	 * @author tangxl  
	 * @date 2018年6月15日	 
	 */
	
	public void setS2(String s2) {
		this.s2 = s2;
	}
	
	/**  
	 * @return sv2
	 * @author tangxl  
	 * @date 2018年6月15日	
	 */
	
	public String getSv2() {
		return sv2;
	}
	
	/**  
	 * @param paramtheparamthe{bare_field_name} to set 
	 * @author tangxl  
	 * @date 2018年6月15日	 
	 */
	
	public void setSv2(String sv2) {
		this.sv2 = sv2;
	}
	
	/**  
	 * @return s3
	 * @author tangxl  
	 * @date 2018年6月15日	
	 */
	
	public String getS3() {
		return s3;
	}
	
	/**  
	 * @param paramtheparamthe{bare_field_name} to set 
	 * @author tangxl  
	 * @date 2018年6月15日	 
	 */
	
	public void setS3(String s3) {
		this.s3 = s3;
	}
	
	/**  
	 * @return sv3
	 * @author tangxl  
	 * @date 2018年6月15日	
	 */
	
	public String getSv3() {
		return sv3;
	}
	
	/**  
	 * @param paramtheparamthe{bare_field_name} to set 
	 * @author tangxl  
	 * @date 2018年6月15日	 
	 */
	
	public void setSv3(String sv3) {
		this.sv3 = sv3;
	}
	
	/**  
	 * @return s4
	 * @author tangxl  
	 * @date 2018年6月15日	
	 */
	
	public String getS4() {
		return s4;
	}
	
	/**  
	 * @param paramtheparamthe{bare_field_name} to set 
	 * @author tangxl  
	 * @date 2018年6月15日	 
	 */
	
	public void setS4(String s4) {
		this.s4 = s4;
	}
	
	/**  
	 * @return sv4
	 * @author tangxl  
	 * @date 2018年6月15日	
	 */
	
	public String getSv4() {
		return sv4;
	}
	
	/**  
	 * @param paramtheparamthe{bare_field_name} to set 
	 * @author tangxl  
	 * @date 2018年6月15日	 
	 */
	
	public void setSv4(String sv4) {
		this.sv4 = sv4;
	}
	
	/**  
	 * @return s5
	 * @author tangxl  
	 * @date 2018年6月15日	
	 */
	
	public String getS5() {
		return s5;
	}
	
	/**  
	 * @param paramtheparamthe{bare_field_name} to set 
	 * @author tangxl  
	 * @date 2018年6月15日	 
	 */
	
	public void setS5(String s5) {
		this.s5 = s5;
	}
	
	/**  
	 * @return sv5
	 * @author tangxl  
	 * @date 2018年6月15日	
	 */
	
	public String getSv5() {
		return sv5;
	}
	
	/**  
	 * @param paramtheparamthe{bare_field_name} to set 
	 * @author tangxl  
	 * @date 2018年6月15日	 
	 */
	
	public void setSv5(String sv5) {
		this.sv5 = sv5;
	}
	

	
	
	/**  
	 * @return obo
	 * @author tangxl  
	 * @date 2018年6月15日	
	 */
	
	public String getObo() {
		return obo;
	}



	
	/**  
	 * @param paramtheparamthe{bare_field_name} to set 
	 * @author tangxl  
	 * @date 2018年6月15日	 
	 */
	
	public void setObo(String obo) {
		this.obo = obo;
	}



	/**  
	 * @return time
	 * @author tangxl  
	 * @date 2018年6月15日	
	 */
	
	public String getTime() {
		return time;
	}
	
	/**  
	 * @param paramtheparamthe{bare_field_name} to set 
	 * @author tangxl  
	 * @date 2018年6月15日	 
	 */
	
	public void setTime(String time) {
		this.time = time;
	}
	
	/**  
	 * @return pricechange
	 * @author tangxl  
	 * @date 2018年6月15日	
	 */
	
	public String getPricechange() {
		return pricechange;
	}
	
	/**  
	 * @param paramtheparamthe{bare_field_name} to set 
	 * @author tangxl  
	 * @date 2018年6月15日	 
	 */
	
	public void setPricechange(String pricechange) {
		this.pricechange = pricechange;
	}
	
	/**  
	 * @return changepercent
	 * @author tangxl  
	 * @date 2018年6月15日	
	 */
	
	public String getChangepercent() {
		return changepercent;
	}
	
	/**  
	 * @param paramtheparamthe{bare_field_name} to set 
	 * @author tangxl  
	 * @date 2018年6月15日	 
	 */
	
	public void setChangepercent(String changepercent) {
		this.changepercent = changepercent;
	}
	
	/**  
	 * @return top
	 * @author tangxl  
	 * @date 2018年6月15日	
	 */
	
	public String getTop() {
		return top;
	}
	
	/**  
	 * @param paramtheparamthe{bare_field_name} to set 
	 * @author tangxl  
	 * @date 2018年6月15日	 
	 */
	
	public void setTop(String top) {
		this.top = top;
	}
	
	/**  
	 * @return low
	 * @author tangxl  
	 * @date 2018年6月15日	
	 */
	
	public String getLow() {
		return low;
	}
	
	/**  
	 * @param paramtheparamthe{bare_field_name} to set 
	 * @author tangxl  
	 * @date 2018年6月15日	 
	 */
	
	public void setLow(String low) {
		this.low = low;
	}
	
	/**  
	 * @return bva
	 * @author tangxl  
	 * @date 2018年6月15日	
	 */
	
	public String getBva() {
		return bva;
	}
	
	/**  
	 * @param paramtheparamthe{bare_field_name} to set 
	 * @author tangxl  
	 * @date 2018年6月15日	 
	 */
	
	public void setBva(String bva) {
		this.bva = bva;
	}
	
	/**  
	 * @return amount
	 * @author tangxl  
	 * @date 2018年6月15日	
	 */
	
	public String getAmount() {
		return amount;
	}
	
	/**  
	 * @param paramtheparamthe{bare_field_name} to set 
	 * @author tangxl  
	 * @date 2018年6月15日	 
	 */
	
	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	/**  
	 * @return turnover
	 * @author tangxl  
	 * @date 2018年6月15日	
	 */
	
	public String getTurnover() {
		return turnover;
	}
	
	/**  
	 * @param paramtheparamthe{bare_field_name} to set 
	 * @author tangxl  
	 * @date 2018年6月15日	 
	 */
	
	public void setTurnover(String turnover) {
		this.turnover = turnover;
	}
	
	/**  
	 * @return waves
	 * @author tangxl  
	 * @date 2018年6月15日	
	 */
	
	public String getWaves() {
		return waves;
	}
	
	/**  
	 * @param paramtheparamthe{bare_field_name} to set 
	 * @author tangxl  
	 * @date 2018年6月15日	 
	 */
	
	public void setWaves(String waves) {
		this.waves = waves;
	}
	
	/**  
	 * @return famc
	 * @author tangxl  
	 * @date 2018年6月15日	
	 */
	
	public String getFamc() {
		return famc;
	}
	
	/**  
	 * @param paramtheparamthe{bare_field_name} to set 
	 * @author tangxl  
	 * @date 2018年6月15日	 
	 */
	
	public void setFamc(String famc) {
		this.famc = famc;
	}
	
	/**  
	 * @return total
	 * @author tangxl  
	 * @date 2018年6月15日	
	 */
	
	public String getTotal() {
		return total;
	}
	
	/**  
	 * @param paramtheparamthe{bare_field_name} to set 
	 * @author tangxl  
	 * @date 2018年6月15日	 
	 */
	
	public void setTotal(String total) {
		this.total = total;
	}
	
	/**  
	 * @return pe
	 * @author tangxl  
	 * @date 2018年6月15日	
	 */
	
	public String getPe() {
		return pe;
	}
	
	/**  
	 * @param paramtheparamthe{bare_field_name} to set 
	 * @author tangxl  
	 * @date 2018年6月15日	 
	 */
	
	public void setPe(String pe) {
		this.pe = pe;
	}
	
	/**  
	 * @return lowPrice
	 * @author tangxl  
	 * @date 2018年6月15日	
	 */
	
	public String getLowPrice() {
		return lowPrice;
	}
	
	/**  
	 * @param paramtheparamthe{bare_field_name} to set 
	 * @author tangxl  
	 * @date 2018年6月15日	 
	 */
	
	public void setLowPrice(String lowPrice) {
		this.lowPrice = lowPrice;
	}
	
	/**  
	 * @return topPrice
	 * @author tangxl  
	 * @date 2018年6月15日	
	 */
	
	public String getTopPrice() {
		return topPrice;
	}
	
	/**  
	 * @param paramtheparamthe{bare_field_name} to set 
	 * @author tangxl  
	 * @date 2018年6月15日	 
	 */
	
	public void setTopPrice(String topPrice) {
		this.topPrice = topPrice;
	}



	
	/**  
	 * @return modified_time
	 * @author tangxl  
	 * @date 2018年6月15日	
	 */
	
	public Date getModified_time() {
		return modified_time;
	}



	
	/**  
	 * @param paramtheparamthe{bare_field_name} to set 
	 * @author tangxl  
	 * @date 2018年6月15日	 
	 */
	
	public void setModified_time(Date modified_time) {
		this.modified_time = modified_time;
	}





	
	
}
