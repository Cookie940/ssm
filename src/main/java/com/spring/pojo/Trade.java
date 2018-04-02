package com.spring.pojo;

import java.io.Serializable;
import java.util.Date;

public class Trade implements Serializable {
    private static final long serialVersionUID = 2407238335929873075L;
    private Integer id;
    private Integer accountId;
    private String tradeType;
    private Double tradeMoney;
    private Date tradeTime;
    private String tradeDigest;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public Double getTradeMoney() {
        return tradeMoney;
    }

    public void setTradeMoney(Double tradeMoney) {
        this.tradeMoney = tradeMoney;
    }

    public Date getTradeTime() {
        return tradeTime;
    }

    public void setTradetime(Date tradeTime) {
        this.tradeTime = tradeTime;
    }

    public String getTradeDigest() {
        return tradeDigest;
    }

    public void setTradeDigest(String tradeDigest) {
        this.tradeDigest = tradeDigest;
    }

    @Override
    public String toString() {
        return "Trade{" +
                "id=" + id +
                ", accountId=" + accountId +
                ", tradeType='" + tradeType + '\'' +
                ", tradeMoney=" + tradeMoney +
                ", tradeTime=" + tradeTime +
                ", tradeDigest='" + tradeDigest + '\'' +
                '}';
    }

    public Trade() {
    }

    public Trade(Integer id, Integer accountId, String tradeType, Double tradeMoney, Date tradeTime, String tradeDigest) {

        this.id = id;
        this.accountId = accountId;
        this.tradeType = tradeType;
        this.tradeMoney = tradeMoney;
        this.tradeTime = tradeTime;
        this.tradeDigest = tradeDigest;
    }
}
