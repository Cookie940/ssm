package com.spring.pojo;

import java.io.Serializable;

public class Account implements Serializable {
    private static final long serialVersionUID = -1972983723445220948L;
    private String accountId;
    private String password;
    private Double remaining;

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", password='" + password + '\'' +
                ", remaining=" + remaining +
                '}';
    }

    public Account() {
    }

    public Account(String accountId, String password, Double remaining) {

        this.accountId = accountId;
        this.password = password;
        this.remaining = remaining;
    }

    public String getAccountId() {

        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getRemaining() {
        return remaining;
    }

    public void setRemaining(Double remaining) {
        this.remaining = remaining;
    }
}
