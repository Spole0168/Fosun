package com.fosun.paymng.model;

import java.io.Serializable;

public class PayBankLimitKey implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * VARCHAR(2) 必填<br>
     * 
     */
    private String payType;

    /**
     * VARCHAR(30) 必填<br>
     * 
     */
    private String bankType;

    /**
     * VARCHAR(2) 必填<br>
     * 获得 
     */
    public String getPayType() {
        return payType;
    }

    /**
     * VARCHAR(2) 必填<br>
     * 设置 
     */
    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    /**
     * VARCHAR(30) 必填<br>
     * 获得 
     */
    public String getBankType() {
        return bankType;
    }

    /**
     * VARCHAR(30) 必填<br>
     * 设置 
     */
    public void setBankType(String bankType) {
        this.bankType = bankType == null ? null : bankType.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", payType=").append(payType);
        sb.append(", bankType=").append(bankType);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        PayBankLimitKey other = (PayBankLimitKey) that;
        return (this.getPayType() == null ? other.getPayType() == null : this.getPayType().equals(other.getPayType()))
            && (this.getBankType() == null ? other.getBankType() == null : this.getBankType().equals(other.getBankType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPayType() == null) ? 0 : getPayType().hashCode());
        result = prime * result + ((getBankType() == null) ? 0 : getBankType().hashCode());
        return result;
    }
}