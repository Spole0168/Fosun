package com.fosun.paymng.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PayTransRecordInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * VARCHAR(32) 必填<br>
     * 
     */
    private String id;

    /**
     * VARCHAR(50)<br>
     * 
     */
    private String transNo;

    /**
     * CHAR(10)<br>
     * 商户代码
     */
    private String mchntId;

    /**
     * VARCHAR(32) 必填<br>
     * 
     */
    private String orderId;

    /**
     * VARCHAR(2)<br>
     * 
     */
    private String busiType;

    /**
     * VARCHAR(2)<br>
     * 
     */
    private String status;

    /**
     * DECIMAL(18,2)<br>
     * 
     */
    private BigDecimal orderAmt;

    /**
     * VARCHAR(100)<br>
     * 
     */
    private String serialNo;

    /**
     * VARCHAR(100)<br>
     * 
     */
    private String callbackServerId;

    /**
     * TIMESTAMP(19) 默认值[CURRENT_TIMESTAMP]<br>
     * 
     */
    private Date crtTime;

    /**
     * TIMESTAMP(19) 默认值[0000-00-00 00:00:00]<br>
     * 
     */
    private Date updateTime;

    /**
     * VARCHAR(14)<br>
     * 
     */
    private String succIime;

    /**
     * DECIMAL(18,2)<br>
     * 
     */
    private BigDecimal succAmt;

    /**
     * VARCHAR(2)<br>
     * 
     */
    private String payType;

    /**
     * VARCHAR(20)<br>
     * 
     */
    private String fundCode;

    /**
     * VARCHAR(32)<br>
     * 
     */
    private String productCode;

    /**
     * VARCHAR(8)<br>
     * 
     */
    private String transDate;

    /**
     * VARCHAR(32) 必填<br>
     * 获得 
     */
    public String getId() {
        return id;
    }

    /**
     * VARCHAR(32) 必填<br>
     * 设置 
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * VARCHAR(50)<br>
     * 获得 
     */
    public String getTransNo() {
        return transNo;
    }

    /**
     * VARCHAR(50)<br>
     * 设置 
     */
    public void setTransNo(String transNo) {
        this.transNo = transNo == null ? null : transNo.trim();
    }

    /**
     * CHAR(10)<br>
     * 获得 商户代码
     */
    public String getMchntId() {
        return mchntId;
    }

    /**
     * CHAR(10)<br>
     * 设置 商户代码
     */
    public void setMchntId(String mchntId) {
        this.mchntId = mchntId == null ? null : mchntId.trim();
    }

    /**
     * VARCHAR(32) 必填<br>
     * 获得 
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * VARCHAR(32) 必填<br>
     * 设置 
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * VARCHAR(2)<br>
     * 获得 
     */
    public String getBusiType() {
        return busiType;
    }

    /**
     * VARCHAR(2)<br>
     * 设置 
     */
    public void setBusiType(String busiType) {
        this.busiType = busiType == null ? null : busiType.trim();
    }

    /**
     * VARCHAR(2)<br>
     * 获得 
     */
    public String getStatus() {
        return status;
    }

    /**
     * VARCHAR(2)<br>
     * 设置 
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * DECIMAL(18,2)<br>
     * 获得 
     */
    public BigDecimal getOrderAmt() {
        return orderAmt;
    }

    /**
     * DECIMAL(18,2)<br>
     * 设置 
     */
    public void setOrderAmt(BigDecimal orderAmt) {
        this.orderAmt = orderAmt;
    }

    /**
     * VARCHAR(100)<br>
     * 获得 
     */
    public String getSerialNo() {
        return serialNo;
    }

    /**
     * VARCHAR(100)<br>
     * 设置 
     */
    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo == null ? null : serialNo.trim();
    }

    /**
     * VARCHAR(100)<br>
     * 获得 
     */
    public String getCallbackServerId() {
        return callbackServerId;
    }

    /**
     * VARCHAR(100)<br>
     * 设置 
     */
    public void setCallbackServerId(String callbackServerId) {
        this.callbackServerId = callbackServerId == null ? null : callbackServerId.trim();
    }

    /**
     * TIMESTAMP(19) 默认值[CURRENT_TIMESTAMP]<br>
     * 获得 
     */
    public Date getCrtTime() {
        return crtTime;
    }

    /**
     * TIMESTAMP(19) 默认值[CURRENT_TIMESTAMP]<br>
     * 设置 
     */
    public void setCrtTime(Date crtTime) {
        this.crtTime = crtTime;
    }

    /**
     * TIMESTAMP(19) 默认值[0000-00-00 00:00:00]<br>
     * 获得 
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * TIMESTAMP(19) 默认值[0000-00-00 00:00:00]<br>
     * 设置 
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * VARCHAR(14)<br>
     * 获得 
     */
    public String getSuccIime() {
        return succIime;
    }

    /**
     * VARCHAR(14)<br>
     * 设置 
     */
    public void setSuccIime(String succIime) {
        this.succIime = succIime == null ? null : succIime.trim();
    }

    /**
     * DECIMAL(18,2)<br>
     * 获得 
     */
    public BigDecimal getSuccAmt() {
        return succAmt;
    }

    /**
     * DECIMAL(18,2)<br>
     * 设置 
     */
    public void setSuccAmt(BigDecimal succAmt) {
        this.succAmt = succAmt;
    }

    /**
     * VARCHAR(2)<br>
     * 获得 
     */
    public String getPayType() {
        return payType;
    }

    /**
     * VARCHAR(2)<br>
     * 设置 
     */
    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    /**
     * VARCHAR(20)<br>
     * 获得 
     */
    public String getFundCode() {
        return fundCode;
    }

    /**
     * VARCHAR(20)<br>
     * 设置 
     */
    public void setFundCode(String fundCode) {
        this.fundCode = fundCode == null ? null : fundCode.trim();
    }

    /**
     * VARCHAR(32)<br>
     * 获得 
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * VARCHAR(32)<br>
     * 设置 
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    /**
     * VARCHAR(8)<br>
     * 获得 
     */
    public String getTransDate() {
        return transDate;
    }

    /**
     * VARCHAR(8)<br>
     * 设置 
     */
    public void setTransDate(String transDate) {
        this.transDate = transDate == null ? null : transDate.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", transNo=").append(transNo);
        sb.append(", mchntId=").append(mchntId);
        sb.append(", orderId=").append(orderId);
        sb.append(", busiType=").append(busiType);
        sb.append(", status=").append(status);
        sb.append(", orderAmt=").append(orderAmt);
        sb.append(", serialNo=").append(serialNo);
        sb.append(", callbackServerId=").append(callbackServerId);
        sb.append(", crtTime=").append(crtTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", succIime=").append(succIime);
        sb.append(", succAmt=").append(succAmt);
        sb.append(", payType=").append(payType);
        sb.append(", fundCode=").append(fundCode);
        sb.append(", productCode=").append(productCode);
        sb.append(", transDate=").append(transDate);
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
        PayTransRecordInfo other = (PayTransRecordInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTransNo() == null ? other.getTransNo() == null : this.getTransNo().equals(other.getTransNo()))
            && (this.getMchntId() == null ? other.getMchntId() == null : this.getMchntId().equals(other.getMchntId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getBusiType() == null ? other.getBusiType() == null : this.getBusiType().equals(other.getBusiType()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getOrderAmt() == null ? other.getOrderAmt() == null : this.getOrderAmt().equals(other.getOrderAmt()))
            && (this.getSerialNo() == null ? other.getSerialNo() == null : this.getSerialNo().equals(other.getSerialNo()))
            && (this.getCallbackServerId() == null ? other.getCallbackServerId() == null : this.getCallbackServerId().equals(other.getCallbackServerId()))
            && (this.getCrtTime() == null ? other.getCrtTime() == null : this.getCrtTime().equals(other.getCrtTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getSuccIime() == null ? other.getSuccIime() == null : this.getSuccIime().equals(other.getSuccIime()))
            && (this.getSuccAmt() == null ? other.getSuccAmt() == null : this.getSuccAmt().equals(other.getSuccAmt()))
            && (this.getPayType() == null ? other.getPayType() == null : this.getPayType().equals(other.getPayType()))
            && (this.getFundCode() == null ? other.getFundCode() == null : this.getFundCode().equals(other.getFundCode()))
            && (this.getProductCode() == null ? other.getProductCode() == null : this.getProductCode().equals(other.getProductCode()))
            && (this.getTransDate() == null ? other.getTransDate() == null : this.getTransDate().equals(other.getTransDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTransNo() == null) ? 0 : getTransNo().hashCode());
        result = prime * result + ((getMchntId() == null) ? 0 : getMchntId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getBusiType() == null) ? 0 : getBusiType().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getOrderAmt() == null) ? 0 : getOrderAmt().hashCode());
        result = prime * result + ((getSerialNo() == null) ? 0 : getSerialNo().hashCode());
        result = prime * result + ((getCallbackServerId() == null) ? 0 : getCallbackServerId().hashCode());
        result = prime * result + ((getCrtTime() == null) ? 0 : getCrtTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getSuccIime() == null) ? 0 : getSuccIime().hashCode());
        result = prime * result + ((getSuccAmt() == null) ? 0 : getSuccAmt().hashCode());
        result = prime * result + ((getPayType() == null) ? 0 : getPayType().hashCode());
        result = prime * result + ((getFundCode() == null) ? 0 : getFundCode().hashCode());
        result = prime * result + ((getProductCode() == null) ? 0 : getProductCode().hashCode());
        result = prime * result + ((getTransDate() == null) ? 0 : getTransDate().hashCode());
        return result;
    }
}