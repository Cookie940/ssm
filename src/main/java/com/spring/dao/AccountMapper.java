package com.spring.dao;

import com.spring.pojo.Account;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountMapper {
    @Select("select accountid,password,Remaining from account where password=#{password} and accountid=#{accountId} ")
    Account check(
            @Param("password") String password,
            @Param("accountId") String accountId);

    @Select("select remaining from account where accountid=#{accountId}")
    Double findmoney(@Param("accountId") String accountId);

    @Update("update account set remaining = remaining+#{remaining} where accountid=#{accountId}")
    int setmoney(
                 @Param("remaining") Double remaining,
                 @Param("accountId")String accountId);

    @Update("update account set remaining =(remaining- #{remaining})-(#{remaining}*0.05) where accountid=#{accountId}")
    int transfer( @Param("remaining") Double remaining,
                  @Param("accountId")String accountId);
}
