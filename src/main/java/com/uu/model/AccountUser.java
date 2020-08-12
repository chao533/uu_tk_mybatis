package com.uu.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "uu_account_user")
public class AccountUser {
    /**
     * 编号
     */
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String userId;

    /**
     * 余额：消费返利
     */
    @Column(name = "account_balance")
    private BigDecimal accountBalance;

    /**
     * 奖励金不能提现
     */
    @Column(name = "account_bonus")
    private BigDecimal accountBonus;

    private Date crttime;

    private Date lmdtime;

    /**
     * 获取编号
     *
     * @return user_id - 编号
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置编号
     *
     * @param userId 编号
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取余额：消费返利
     *
     * @return account_balance - 余额：消费返利
     */
    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    /**
     * 设置余额：消费返利
     *
     * @param accountBalance 余额：消费返利
     */
    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }

    /**
     * 获取奖励金不能提现
     *
     * @return account_bonus - 奖励金不能提现
     */
    public BigDecimal getAccountBonus() {
        return accountBonus;
    }

    /**
     * 设置奖励金不能提现
     *
     * @param accountBonus 奖励金不能提现
     */
    public void setAccountBonus(BigDecimal accountBonus) {
        this.accountBonus = accountBonus;
    }

    /**
     * @return crttime
     */
    public Date getCrttime() {
        return crttime;
    }

    /**
     * @param crttime
     */
    public void setCrttime(Date crttime) {
        this.crttime = crttime;
    }

    /**
     * @return lmdtime
     */
    public Date getLmdtime() {
        return lmdtime;
    }

    /**
     * @param lmdtime
     */
    public void setLmdtime(Date lmdtime) {
        this.lmdtime = lmdtime;
    }
}