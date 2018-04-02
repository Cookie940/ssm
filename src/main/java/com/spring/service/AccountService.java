package com.spring.service;

import com.spring.dao.AccountMapper;
import com.spring.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED)
public class AccountService {
    @Autowired
    private AccountMapper accountMapper;


    public Account check(String password, String accountId) {
        return accountMapper.check(password,accountId);
    }


    public Double findmoney(String accountId) {
        return accountMapper.findmoney(accountId);
    }


    public int setmoney(Double remaining, String accountId) {
        return accountMapper.setmoney(remaining, accountId);
    }


    public int transfer(Double remaining, String accountId) {
        return accountMapper.transfer(remaining, accountId);
    }
}
