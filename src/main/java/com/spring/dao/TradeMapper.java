package com.spring.dao;

import com.spring.pojo.Trade;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TradeMapper {
    @Select("select * FROM Trade where TradeTime BETWEEN #{start_time} and now()")
    List<Trade> findByDate(@Param("start_time") String start_time);
    @Insert("insert into Trade(accountId,tradeType,tradeMoney,TradeTime,TradeDigest) " +
            "value(#{accountId},'transfer',#{save},now(),#{id})")
    int insert(@Param("accountId") String accountId,@Param("save") Double save,@Param("id") String id);
}
