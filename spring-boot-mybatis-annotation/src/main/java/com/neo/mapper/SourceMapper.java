package com.neo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.neo.domain.PageData;
import com.neo.domain.TencentResult;
import com.neo.entity.Source;

public interface SourceMapper {
	
	@Insert({ "insert into code(code) "
			+ "values(#{code})" })	
	int insertCode(PageData record);
	
	@Delete({"delete from code"})
	int deleteCode();
	
	@Select("select *from code order by code asc LIMIT ${startPage},${endPage}")
	List<PageData> getCodeBypage(PageData pageData);
    
    @Select("select *from source")
    List<PageData> selectAll();
    
    @Select("SELECT *from source where code = #{code} ORDER BY create_time desc LIMIT 2;")
    List<PageData> selectLimit2NewSource(Source record);
    
    @Insert({
 	      "<script>                                                                                                                                                                                                                                                                          "                                                                                                            
		 +"		INSERT INTO source(id, code, name, changepercent, trade, pricechange, volume , obo, bva, turnover, waves, lowPrice, topPrice, modified_time, amount )                                                                                                                        "                                                                                                           
		 +"		values                                                                                                                                                                                                                                                                       "                                                                                                        
		 +"		<foreach item='item'  collection='list' separator=','>                                                                                                                                                                                                                       "                                                                                                               
		 +"			(#{item.id},#{item.code}, #{item.name}, #{item.changepercent}, #{item.trade}, #{item.pricechange},#{item.volume}, #{item.obo}, #{item.bva},#{item.turnover}, #{item.waves}, #{item.lowPrice}, #{item.topPrice}, #{item.modified_time,jdbcType=TIMESTAMP}, #{item.amount})"
		 +"		</foreach> 		                                                                                                                                                                                                                                                             "
		 +"		ON DUPLICATE KEY UPDATE                                                                                                                                                                                                                                                      "                                                                                                           
		 +"		id = VALUES(id),code = VALUES(code),                                                                                                                                                                                                                                         "
		 +"		name = VALUES(name),changepercent = VALUES(changepercent),                                                                                                                                                                                                                   "
		 +"		trade=VALUES(trade),pricechange=VALUES(pricechange),                                                                                                                                                                                                                         "
		 +"		volume=VALUES(volume),obo=VALUES(obo),bva=VALUES(bva),                                                                                                                                                                                                                       "
		 +"		turnover=VALUES(turnover),waves=VALUES(waves),                                                                                                                                                                                                                               "
		 +"		lowPrice=VALUES(lowPrice),topPrice=VALUES(topPrice),                                                                                                                                                                                                                         "
		 +"		modified_time=VALUES(modified_time),amount=VALUES(amount)                                                                                                                                                                                                                    "                                                                                                                                                                            
		 +"</script>                                                                                                                                                                                                                                                                         "                                                                                                            
    })
	int insert(List<TencentResult> result);
    
    @Insert({
    	  "<script>                                                                                                                                                                                                                                                                                                                                           "
		 +" INSERT INTO bs(id, code, name, b1, b2, b3, b4 , b5, s1, s2, s3, s4, s5, bv1, bv2, bv3, bv4 , bv5, sv1, sv2, sv3, sv4, sv5,modified_time)                                                                                                                                                                                                          "    
		 +" values                                                                                                                                                                                                                                                                                                                                            "
		 +" <foreach item='item'  collection='list' separator=','>                                                                                                                                                                                                                                                                                            "
		 +" 	(#{item.id},#{item.code}, #{item.name}, #{item.b1}, #{item.b2}, #{item.b3},#{item.b4}, #{item.b5}, #{item.s1},#{item.s2}, #{item.s3}, #{item.s4}, #{item.s5}, #{item.bv1}, #{item.bv2}, #{item.bv3},#{item.bv4}, #{item.bv5}, #{item.sv1},#{item.sv2}, #{item.sv3}, #{item.sv4}, #{item.sv5}, #{item.modified_time,jdbcType=TIMESTAMP})       "
		 +" </foreach>                                                                                                                                                                                                                                                                                                                                        "
		 +" ON DUPLICATE KEY UPDATE                                                                                                                                                                                                                                                                                                                           "
		 +" id = VALUES(id),code = VALUES(code),                                                                                                                                                                                                                                                                                                              "
		 +" name = VALUES(name),b1 = VALUES(b1),                                                                                                                                                                                                                                                                                                              "
		 +" b2=VALUES(b2),b3=VALUES(b3),                                                                                                                                                                                                                                                                                                                      "
		 +" b4=VALUES(b4),b5=VALUES(b5),                                                                                                                                                                                                                                                                                                                      "
		 +" s1=VALUES(s1),s2=VALUES(s2),                                                                                                                                                                                                                                                                                                                      "
		 +" s3=VALUES(s3),s4=VALUES(s4),                                                                                                                                                                                                                                                                                                                      "
		 +" s5=VALUES(s5),bv1 = VALUES(bv1),                                                                                                                                                                                                                                                                                                                  "
		 +" bv2=VALUES(bv2),bv3=VALUES(bv3),                                                                                                                                                                                                                                                                                                                  "
		 +" bv4=VALUES(bv4),bv5=VALUES(bv5),                                                                                                                                                                                                                                                                                                                  "
		 +" sv1=VALUES(sv1),sv2=VALUES(sv2),                                                                                                                                                                                                                                                                                                                  "
		 +" sv3=VALUES(sv3),sv4=VALUES(sv4),                                                                                                                                                                                                                                                                                                                  "
		 +" sv5=VALUES(sv5),modified_time=VALUES(modified_time)                                                                                                                                                                                                                                                                                               "
		 +"</script>                                                                                                                                                                                                                                                                                                                                          "
    })
	int insertBs(List<TencentResult> result);
    
    @Insert({
    	  "<script>                                                                                                                                                                      "
 	     +" INSERT INTO info(id, code, name, famc, settlement, open, pe , pb, total, modified_time)                                                                                      "
		 +" values                                                                                                                                                                       "
		 +" <foreach item='item'  collection='list' separator=','>                                                                                                                       "
		 +" 	(#{item.id},#{item.code}, #{item.name}, #{item.famc}, #{item.settlement}, #{item.open},#{item.pe}, #{item.pb}, #{item.total}, #{item.modified_time,jdbcType=TIMESTAMP})  "
		 +" </foreach>                                                                                                                                                                   "
		 +" ON DUPLICATE KEY UPDATE                                                                                                                                                      "
		 +" id = VALUES(id),code = VALUES(code),                                                                                                                                         "
		 +" name = VALUES(name),famc = VALUES(famc),                                                                                                                                     "
		 +" settlement=VALUES(settlement),open=VALUES(open),                                                                                                                             "
		 +" pe=VALUES(pe),pb=VALUES(pb),total=VALUES(total),modified_time=VALUES(modified_time)                                                                                          "
		 +"</script>                                                                                                                                                                     "
    })
	int insertInfo(List<TencentResult> result);
    
    @Delete({
    	"DELETE from source where DATE_FORMAT(modified_time,'%Y-%m-%d')<>DATE_FORMAT(NOW(),'%Y-%m-%d')"
    })
    int deleteNotTodaySource();
    
    @Insert({
    	"INSERT into source2 (SELECT * from source where DATE_FORMAT(modified_time,'%Y-%m-%d')<>DATE_FORMAT(NOW(),'%Y-%m-%d'))"
    })
    int insertNotTodaySource2();
    
    @Delete({
    	"DELETE from bs where DATE_FORMAT(modified_time,'%Y-%m-%d')<>DATE_FORMAT(NOW(),'%Y-%m-%d')"
    })
    int deleteNotTodayBs();
    
    @Insert({
    	"INSERT into bs2 (SELECT * from bs where DATE_FORMAT(modified_time,'%Y-%m-%d')<>DATE_FORMAT(NOW(),'%Y-%m-%d'))"
    })
    int insertNotTodayBs2();
    
    @Delete({
    	"DELETE from info where DATE_FORMAT(modified_time,'%Y-%m-%d')<>DATE_FORMAT(NOW(),'%Y-%m-%d')"
    })
    int deleteNotTodayInfo();
    
    @Insert({
    	"INSERT into info2 (SELECT * from info where DATE_FORMAT(modified_time,'%Y-%m-%d')<>DATE_FORMAT(NOW(),'%Y-%m-%d'))"
    })
    int insertNotTodayInfo2();
    
    @Insert({
    	"INSERT into date(date,type) values(#{date,jdbcType=DATE},#{type}) ON DUPLICATE KEY UPDATE date=VALUES(date),type=VALUES(TYPE)"
    })
    int insertDate(PageData pageData);
    
    @Select({
    	"SELECT * FROM `date` WHERE date = DATE_FORMAT(NOW(),'%Y-%m-%d')"
    })
    PageData selectDate();
}