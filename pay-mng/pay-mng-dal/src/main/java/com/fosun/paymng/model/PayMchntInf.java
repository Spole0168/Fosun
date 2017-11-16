package com.fosun.paymng.model;

import java.io.Serializable;
import java.util.Date;

public class PayMchntInf implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * CHAR(10) 必填<br>
     * 商户ID
     */
    private String mchntId;

    /**
     * VARCHAR(64) 必填<br>
     * 商户名称
     */
    private String mchntNm;

    /**
     * VARCHAR(40) 必填<br>
     * 商户简称
     */
    private String mchntAbbr;

    /**
     * VARCHAR(64)<br>
     * 联系人姓名
     */
    private String contactPersonNm;

    /**
     * VARCHAR(30)<br>
     * 联系人电话
     */
    private String contactPhone;

    /**
     * VARCHAR(100)<br>
     * 联系人邮箱
     */
    private String contactMail;

    /**
     * VARCHAR(200)<br>
     * 对账通知URL
     */
    private String billRetUrl;

    /**
     * CHAR(1) 默认值[Y]<br>
     * 有效状态Y/N
     */
    private String mchntValidSt;

    /**
     * TIMESTAMP(19) 默认值[CURRENT_TIMESTAMP] 必填<br>
     * 记录插入时间
     */
    private Date recCrtTs;

    /**
     * VARCHAR(32)<br>
     * 记录插入操作员
     */
    private String recCrtOprId;

    /**
     * TIMESTAMP(19) 默认值[0000-00-00 00:00:00] 必填<br>
     * 最后更新时间
     */
    private Date recUpdTs;

    /**
     * VARCHAR(32)<br>
     * 最后更新操作员
     */
    private String recUpdOprId;

    /**
     * CHAR(10) 必填<br>
     * 获得 商户ID
     */
    public String getMchntId() {
        return mchntId;
    }

    /**
     * CHAR(10) 必填<br>
     * 设置 商户ID
     */
    public void setMchntId(String mchntId) {
        this.mchntId = mchntId == null ? null : mchntId.trim();
    }

    /**
     * VARCHAR(64) 必填<br>
     * 获得 商户名称
     */
    public String getMchntNm() {
        return mchntNm;
    }

    /**
     * VARCHAR(64) 必填<br>
     * 设置 商户名称
     */
    public void setMchntNm(String mchntNm) {
        this.mchntNm = mchntNm == null ? null : mchntNm.trim();
    }

    /**
     * VARCHAR(40) 必填<br>
     * 获得 商户简称
     */
    public String getMchntAbbr() {
        return mchntAbbr;
    }

    /**
     * VARCHAR(40) 必填<br>
     * 设置 商户简称
     */
    public void setMchntAbbr(String mchntAbbr) {
        this.mchntAbbr = mchntAbbr == null ? null : mchntAbbr.trim();
    }

    /**
     * VARCHAR(64)<br>
     * 获得 联系人姓名
     */
    public String getContactPersonNm() {
        return contactPersonNm;
    }

    /**
     * VARCHAR(64)<br>
     * 设置 联系人姓名
     */
    public void setContactPersonNm(String contactPersonNm) {
        this.contactPersonNm = contactPersonNm == null ? null : contactPersonNm.trim();
    }

    /**
     * VARCHAR(30)<br>
     * 获得 联系人电话
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * VARCHAR(30)<br>
     * 设置 联系人电话
     */
    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone == null ? null : contactPhone.trim();
    }

    /**
     * VARCHAR(100)<br>
     * 获得 联系人邮箱
     */
    public String getContactMail() {
        return contactMail;
    }

    /**
     * VARCHAR(100)<br>
     * 设置 联系人邮箱
     */
    public void setContactMail(String contactMail) {
        this.contactMail = contactMail == null ? null : contactMail.trim();
    }

    /**
     * VARCHAR(200)<br>
     * 获得 对账通知URL
     */
    public String getBillRetUrl() {
        return billRetUrl;
    }

    /**
     * VARCHAR(200)<br>
     * 设置 对账通知URL
     */
    public void setBillRetUrl(String billRetUrl) {
        this.billRetUrl = billRetUrl == null ? null : billRetUrl.trim();
    }

    /**
     * CHAR(1) 默认值[Y]<br>
     * 获得 有效状态Y/N
     */
    public String getMchntValidSt() {
        return mchntValidSt;
    }

    /**
     * CHAR(1) 默认值[Y]<br>
     * 设置 有效状态Y/N
     */
    public void setMchntValidSt(String mchntValidSt) {
        this.mchntValidSt = mchntValidSt == null ? null : mchntValidSt.trim();
    }

    /**
     * TIMESTAMP(19) 默认值[CURRENT_TIMESTAMP] 必填<br>
     * 获得 记录插入时间
     */
    public Date getRecCrtTs() {
        return recCrtTs;
    }

    /**
     * TIMESTAMP(19) 默认值[CURRENT_TIMESTAMP] 必填<br>
     * 设置 记录插入时间
     */
    public void setRecCrtTs(Date recCrtTs) {
        this.recCrtTs = recCrtTs;
    }

    /**
     * VARCHAR(32)<br>
     * 获得 记录插入操作员
     */
    public String getRecCrtOprId() {
        return recCrtOprId;
    }

    /**
     * VARCHAR(32)<br>
     * 设置 记录插入操作员
     */
    public void setRecCrtOprId(String recCrtOprId) {
        this.recCrtOprId = recCrtOprId == null ? null : recCrtOprId.trim();
    }

    /**
     * TIMESTAMP(19) 默认值[0000-00-00 00:00:00] 必填<br>
     * 获得 最后更新时间
     */
    public Date getRecUpdTs() {
        return recUpdTs;
    }

    /**
     * TIMESTAMP(19) 默认值[0000-00-00 00:00:00] 必填<br>
     * 设置 最后更新时间
     */
    public void setRecUpdTs(Date recUpdTs) {
        this.recUpdTs = recUpdTs;
    }

    /**
     * VARCHAR(32)<br>
     * 获得 最后更新操作员
     */
    public String getRecUpdOprId() {
        return recUpdOprId;
    }

    /**
     * VARCHAR(32)<br>
     * 设置 最后更新操作员
     */
    public void setRecUpdOprId(String recUpdOprId) {
        this.recUpdOprId = recUpdOprId == null ? null : recUpdOprId.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mchntId=").append(mchntId);
        sb.append(", mchntNm=").append(mchntNm);
        sb.append(", mchntAbbr=").append(mchntAbbr);
        sb.append(", contactPersonNm=").append(contactPersonNm);
        sb.append(", contactPhone=").append(contactPhone);
        sb.append(", contactMail=").append(contactMail);
        sb.append(", billRetUrl=").append(billRetUrl);
        sb.append(", mchntValidSt=").append(mchntValidSt);
        sb.append(", recCrtTs=").append(recCrtTs);
        sb.append(", recCrtOprId=").append(recCrtOprId);
        sb.append(", recUpdTs=").append(recUpdTs);
        sb.append(", recUpdOprId=").append(recUpdOprId);
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
        PayMchntInf other = (PayMchntInf) that;
        return (this.getMchntId() == null ? other.getMchntId() == null : this.getMchntId().equals(other.getMchntId()))
            && (this.getMchntNm() == null ? other.getMchntNm() == null : this.getMchntNm().equals(other.getMchntNm()))
            && (this.getMchntAbbr() == null ? other.getMchntAbbr() == null : this.getMchntAbbr().equals(other.getMchntAbbr()))
            && (this.getContactPersonNm() == null ? other.getContactPersonNm() == null : this.getContactPersonNm().equals(other.getContactPersonNm()))
            && (this.getContactPhone() == null ? other.getContactPhone() == null : this.getContactPhone().equals(other.getContactPhone()))
            && (this.getContactMail() == null ? other.getContactMail() == null : this.getContactMail().equals(other.getContactMail()))
            && (this.getBillRetUrl() == null ? other.getBillRetUrl() == null : this.getBillRetUrl().equals(other.getBillRetUrl()))
            && (this.getMchntValidSt() == null ? other.getMchntValidSt() == null : this.getMchntValidSt().equals(other.getMchntValidSt()))
            && (this.getRecCrtTs() == null ? other.getRecCrtTs() == null : this.getRecCrtTs().equals(other.getRecCrtTs()))
            && (this.getRecCrtOprId() == null ? other.getRecCrtOprId() == null : this.getRecCrtOprId().equals(other.getRecCrtOprId()))
            && (this.getRecUpdTs() == null ? other.getRecUpdTs() == null : this.getRecUpdTs().equals(other.getRecUpdTs()))
            && (this.getRecUpdOprId() == null ? other.getRecUpdOprId() == null : this.getRecUpdOprId().equals(other.getRecUpdOprId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMchntId() == null) ? 0 : getMchntId().hashCode());
        result = prime * result + ((getMchntNm() == null) ? 0 : getMchntNm().hashCode());
        result = prime * result + ((getMchntAbbr() == null) ? 0 : getMchntAbbr().hashCode());
        result = prime * result + ((getContactPersonNm() == null) ? 0 : getContactPersonNm().hashCode());
        result = prime * result + ((getContactPhone() == null) ? 0 : getContactPhone().hashCode());
        result = prime * result + ((getContactMail() == null) ? 0 : getContactMail().hashCode());
        result = prime * result + ((getBillRetUrl() == null) ? 0 : getBillRetUrl().hashCode());
        result = prime * result + ((getMchntValidSt() == null) ? 0 : getMchntValidSt().hashCode());
        result = prime * result + ((getRecCrtTs() == null) ? 0 : getRecCrtTs().hashCode());
        result = prime * result + ((getRecCrtOprId() == null) ? 0 : getRecCrtOprId().hashCode());
        result = prime * result + ((getRecUpdTs() == null) ? 0 : getRecUpdTs().hashCode());
        result = prime * result + ((getRecUpdOprId() == null) ? 0 : getRecUpdOprId().hashCode());
        return result;
    }
}