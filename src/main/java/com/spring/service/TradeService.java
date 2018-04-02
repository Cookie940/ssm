package com.spring.service;

import com.spring.dao.TradeMapper;
import com.spring.pojo.Trade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
@Service
@Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED)
public class TradeService{
    @Autowired
    private TradeMapper tradeMapper;

    public List<Trade> findByDate(String start_time) {
        return tradeMapper.findByDate(start_time);
    }

    public int insert(String id, String accountId, Double save) {
        return tradeMapper.insert(accountId,save,id);
    }

}
