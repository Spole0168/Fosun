package com.fosun.paymng.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class PayBankLimit extends PayBankLimitKey implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * VARCHAR(100)<br>
     * 
     */
    private String bankName;

    /**
     * DECIMAL(18,2)<br>
     * 
     */
    private BigDecimal singleLmt;

    /**
     * DECIMAL(18,2)<br>
     * 
     */
    private BigDecimal dayLmt;

    /**
     * VARCHAR(100)<br>
     * 获得 
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * VARCHAR(100)<br>
     * 设置 
     */
    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    /**
     * DECIMAL(18,2)<br>
     * 获得 
     */
    public BigDecimal getSingleLmt() {
        return singleLmt;
    }

    /**
     * DECIMAL(18,2)<br>
     * 设置 
     */
    public void setSingleLmt(BigDecimal singleLmt) {
        this.singleLmt = singleLmt;
    }

    /**
     * DECIMAL(18,2)<br>
     * 获得 
     */
    public BigDecimal getDayLmt() {
        return dayLmt;
    }

    /**
     * DECIMAL(18,2)<br>
     * 设置 
     */
    public void setDayLmt(BigDecimal dayLmt) {
        this.dayLmt = dayLmt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", bankName=").append(bankName);
        sb.append(", singleLmt=").append(singleLmt);
        sb.append(", dayLmt=").append(dayLmt);
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
        PayBankLimit other = (PayBankLimit) that;
        return (this.getPayType() == null ? other.getPayType() == null : this.getPayType().equals(other.getPayType()))
            && (this.getBankType() == null ? other.getBankType() == null : this.getBankType().equals(other.getBankType()))
            && (this.getBankName() == null ? other.getBankName() == null : this.getBankName().equals(other.getBankName()))
            && (this.getSingleLmt() == null ? other.getSingleLmt() == null : this.getSingleLmt().equals(other.getSingleLmt()))
            && (this.getDayLmt() == null ? other.getDayLmt() == null : this.getDayLmt().equals(other.getDayLmt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPayType() == null) ? 0 : getPayType().hashCode());
        result = prime * result + ((getBankType() == null) ? 0 : getBankType().hashCode());
        result = prime * result + ((getBankName() == null) ? 0 : getBankName().hashCode());
        result = prime * result + ((getSingleLmt() == null) ? 0 : getSingleLmt().hashCode());
        result = prime * result + ((getDayLmt() == null) ? 0 : getDayLmt().hashCode());
        return result;
    }
}