package com.spring;

import com.spring.pojo.Account;
import com.spring.pojo.Trade;
import com.spring.service.AccountService;
import com.spring.service.TradeService;
import org.apache.commons.lang.math.NumberUtils;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Testa {
    private AccountService accountService;
    private TradeService tradeService;

    @Test
    public void check(){
        Account account =accountService.check("12345","12345");
        System.out.println(account);
    }
    @Test
    public void findmoney(){
        Double d = accountService.findmoney("12345");
        System.out.println(d);
    }
    @Test
    public void setmoney(){
        int a = accountService.setmoney(100d,"12345");
        System.out.println(a);
    }
    @Test
    public void s(){
        int a = accountService.transfer(1000d,"12345");
        if(a>0){
            this.findmoney();
        }
    }
    @Test
    public void da(){
//        List<Trade> list = tradeService.findByDate("2018-03-11","2018-03-18");
//        for (Trade a :tradeService.findByDate("2018-03-11","2018-03-18")){
//            System.out.println(a);
//        }
        List<Trade> list =new ArrayList<>();
        System.out.println(list.size());
    }

    @Test
    public void as(){
        int a =tradeService.insert("12345","123456",100d);
        System.out.println(a);
    }


    @Before
    public void inti(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
        accountService = ctx.getBean("accountService",AccountService.class);
        tradeService = ctx.getBean("tradeService",TradeService.class);
    }

}
