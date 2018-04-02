package com.spring.controller;

import com.spring.pojo.Account;
import com.spring.pojo.Trade;
import com.spring.service.AccountService;
import com.spring.service.TradeService;
import org.apache.commons.lang.math.NumberUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@Controller

@SessionAttributes(names = {"account"}, types = {String.class})
public class AccountController {
    @Autowired
    private AccountService accountService;
    @Autowired
    private TradeService tradeService;

    @PostMapping("Lo_gin")
    public ModelAndView Login(String accountId,String password){
        Account account = accountService.check(password,accountId);
        ModelAndView mv = new ModelAndView();
        if(account==null){
            mv.setViewName("Login");
            mv.addObject("check","false");
            return mv;
        }
        mv.setViewName("Index");
        mv.addObject("account",account);
        return mv;
    }
    @GetMapping(value = "balance")
    public ModelAndView balance(
            @RequestParam(value = "Id") String id){
        Double money = accountService.findmoney(id);
        ModelAndView mv = new ModelAndView();
        mv.addObject("money",money);
        mv.setViewName("Remaining");
        return mv;
    }

    @GetMapping(value = "tradeRecord")
    public ModelAndView data(String start_time,String end_time){
        ModelAndView mv = new ModelAndView();
        String start[] = start_time.split("-");
        String end[] = end_time.split("-");
        Integer Smonth = NumberUtils.createInteger(start[1]);
        Integer Emonth = NumberUtils.createInteger(end[1]);
        Integer Sday = NumberUtils.createInteger(start[2]);
        Integer Eday = NumberUtils.createInteger(end[2]);
        if(start[0].equals(end[0])&&(Smonth-Emonth==1||Smonth==Emonth)&&(Sday==Eday||(Sday-Eday)<30)){
            List<Trade> trades = tradeService.findByDate(start_time);
            mv.addObject("trades",trades);
            mv.setViewName("TradeRecord_Success");
        }else{
            mv.setViewName("TradeRecord");
            mv.addObject("check","flase");
        }
        return mv;
    }
    @PostMapping("transfer")
    public ModelAndView transfer(String receive_account,String receive_money,
                                 @RequestParam(value = "Id") String id){
        ModelAndView mv = new ModelAndView();
        Double now = accountService.findmoney(id);
        Double save = NumberUtils.createDouble(receive_money);
        System.out.println(now+"\t"+save);
        if(now<save||accountService.findmoney(receive_account)==null){
            mv.setViewName("Transfer");
            mv.addObject("check","flase");
        }else{
            int b = accountService.transfer(save,id);
            int a = accountService.setmoney(save,receive_account);
            int c = tradeService.insert(id,receive_account,save);
            mv.setViewName("Transfer_Success");
            String last []={receive_account,receive_money};
            mv.addObject("Ok",last);
        }
        return mv;
    }
    //TradeRecord
    @GetMapping(value = "Trade_Record")
    public String ssss(){
        return "TradeRecord";
    }
    //Transfer
    @GetMapping(value = "Trans_fer")
    public String ss(){
        return "Transfer";
    }
    @GetMapping(value = "Ind_ex")
    public String sqqs(){
        return "Index";
    }

    @GetMapping(value = "test")
    public String asda(){
        return "test";
    }

}
