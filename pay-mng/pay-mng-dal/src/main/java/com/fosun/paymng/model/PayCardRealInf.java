package com.fosun.paymng.model;

import java.io.Serializable;
import java.util.Date;

public class PayCardRealInf implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * VARCHAR(36) 必填<br>
     * 主键
     */
    private String recSeqId;

    /**
     * CHAR(1) 必填<br>
     * 账户类型1：个人 2：企业
     */
    private String bankAccTp;

    /**
     * VARCHAR(30) 必填<br>
     * 银行账户
     */
    private String bankAcctNo;

    /**
     * VARCHAR(128) 必填<br>
     * 账户开户名
     */
    private String bankAcctNm;

    /**
     * CHAR(2)<br>
     * 证件类型01：身份证；02：军官证；03：护照；04: 回乡证；05: 台胞证；06: 警官证；07: 士兵证；99: 其他证件；
     */
    private String certTp;

    /**
     * VARCHAR(30)<br>
     * 证件号码
     */
    private String certNo;

    /**
     * VARCHAR(15)<br>
     * 银行预留手机号
     */
    private String cardPhone;

    /**
     * VARCHAR(8)<br>
     * 银行ID
     */
    private String bankId;

    /**
     * VARCHAR(36)<br>
     * 商户交易流水号
     */
    private String transSeqId;

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
     * 最后修改操作员
     */
    private String recUpdOprId;

    /**
     * VARCHAR(32)<br>
     * 最后修改交易名
     */
    private String recUpdTransId;

    /**
     * VARCHAR(36) 必填<br>
     * 获得 主键
     */
    public String getRecSeqId() {
        return recSeqId;
    }

    /**
     * VARCHAR(36) 必填<br>
     * 设置 主键
     */
    public void setRecSeqId(String recSeqId) {
        this.recSeqId = recSeqId == null ? null : recSeqId.trim();
    }

    /**
     * CHAR(1) 必填<br>
     * 获得 账户类型1：个人 2：企业
     */
    public String getBankAccTp() {
        return bankAccTp;
    }

    /**
     * CHAR(1) 必填<br>
     * 设置 账户类型1：个人 2：企业
     */
    public void setBankAccTp(String bankAccTp) {
        this.bankAccTp = bankAccTp == null ? null : bankAccTp.trim();
    }

    /**
     * VARCHAR(30) 必填<br>
     * 获得 银行账户
     */
    public String getBankAcctNo() {
        return bankAcctNo;
    }

    /**
     * VARCHAR(30) 必填<br>
     * 设置 银行账户
     */
    public void setBankAcctNo(String bankAcctNo) {
        this.bankAcctNo = bankAcctNo == null ? null : bankAcctNo.trim();
    }

    /**
     * VARCHAR(128) 必填<br>
     * 获得 账户开户名
     */
    public String getBankAcctNm() {
        return bankAcctNm;
    }

    /**
     * VARCHAR(128) 必填<br>
     * 设置 账户开户名
     */
    public void setBankAcctNm(String bankAcctNm) {
        this.bankAcctNm = bankAcctNm == null ? null : bankAcctNm.trim();
    }

    /**
     * CHAR(2)<br>
     * 获得 证件类型01：身份证；02：军官证；03：护照；04: 回乡证；05: 台胞证；06: 警官证；07: 士兵证；99: 其他证件；
     */
    public String getCertTp() {
        return certTp;
    }

    /**
     * CHAR(2)<br>
     * 设置 证件类型01：身份证；02：军官证；03：护照；04: 回乡证；05: 台胞证；06: 警官证；07: 士兵证；99: 其他证件；
     */
    public void setCertTp(String certTp) {
        this.certTp = certTp == null ? null : certTp.trim();
    }

    /**
     * VARCHAR(30)<br>
     * 获得 证件号码
     */
    public String getCertNo() {
        return certNo;
    }

    /**
     * VARCHAR(30)<br>
     * 设置 证件号码
     */
    public void setCertNo(String certNo) {
        this.certNo = certNo == null ? null : certNo.trim();
    }

    /**
     * VARCHAR(15)<br>
     * 获得 银行预留手机号
     */
    public String getCardPhone() {
        return cardPhone;
    }

    /**
     * VARCHAR(15)<br>
     * 设置 银行预留手机号
     */
    public void setCardPhone(String cardPhone) {
        this.cardPhone = cardPhone == null ? null : cardPhone.trim();
    }

    /**
     * VARCHAR(8)<br>
     * 获得 银行ID
     */
    public String getBankId() {
        return bankId;
    }

    /**
     * VARCHAR(8)<br>
     * 设置 银行ID
     */
    public void setBankId(String bankId) {
        this.bankId = bankId == null ? null : bankId.trim();
    }

    /**
     * VARCHAR(36)<br>
     * 获得 商户交易流水号
     */
    public String getTransSeqId() {
        return transSeqId;
    }

    /**
     * VARCHAR(36)<br>
     * 设置 商户交易流水号
     */
    public void setTransSeqId(String transSeqId) {
        this.transSeqId = transSeqId == null ? null : transSeqId.trim();
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
     * 获得 最后修改操作员
     */
    public String getRecUpdOprId() {
        return recUpdOprId;
    }

    /**
     * VARCHAR(32)<br>
     * 设置 最后修改操作员
     */
    public void setRecUpdOprId(String recUpdOprId) {
        this.recUpdOprId = recUpdOprId == null ? null : recUpdOprId.trim();
    }

    /**
     * VARCHAR(32)<br>
     * 获得 最后修改交易名
     */
    public String getRecUpdTransId() {
        return recUpdTransId;
    }

    /**
     * VARCHAR(32)<br>
     * 设置 最后修改交易名
     */
    public void setRecUpdTransId(String recUpdTransId) {
        this.recUpdTransId = recUpdTransId == null ? null : recUpdTransId.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", recSeqId=").append(recSeqId);
        sb.append(", bankAccTp=").append(bankAccTp);
        sb.append(", bankAcctNo=").append(bankAcctNo);
        sb.append(", bankAcctNm=").append(bankAcctNm);
        sb.append(", certTp=").append(certTp);
        sb.append(", certNo=").append(certNo);
        sb.append(", cardPhone=").append(cardPhone);
        sb.append(", bankId=").append(bankId);
        sb.append(", transSeqId=").append(transSeqId);
        sb.append(", recCrtTs=").append(recCrtTs);
        sb.append(", recCrtOprId=").append(recCrtOprId);
        sb.append(", recUpdTs=").append(recUpdTs);
        sb.append(", recUpdOprId=").append(recUpdOprId);
        sb.append(", recUpdTransId=").append(recUpdTransId);
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
        PayCardRealInf other = (PayCardRealInf) that;
        return (this.getRecSeqId() == null ? other.getRecSeqId() == null : this.getRecSeqId().equals(other.getRecSeqId()))
            && (this.getBankAccTp() == null ? other.getBankAccTp() == null : this.getBankAccTp().equals(other.getBankAccTp()))
            && (this.getBankAcctNo() == null ? other.getBankAcctNo() == null : this.getBankAcctNo().equals(other.getBankAcctNo()))
            && (this.getBankAcctNm() == null ? other.getBankAcctNm() == null : this.getBankAcctNm().equals(other.getBankAcctNm()))
            && (this.getCertTp() == null ? other.getCertTp() == null : this.getCertTp().equals(other.getCertTp()))
            && (this.getCertNo() == null ? other.getCertNo() == null : this.getCertNo().equals(other.getCertNo()))
            && (this.getCardPhone() == null ? other.getCardPhone() == null : this.getCardPhone().equals(other.getCardPhone()))
            && (this.getBankId() == null ? other.getBankId() == null : this.getBankId().equals(other.getBankId()))
            && (this.getTransSeqId() == null ? other.getTransSeqId() == null : this.getTransSeqId().equals(other.getTransSeqId()))
            && (this.getRecCrtTs() == null ? other.getRecCrtTs() == null : this.getRecCrtTs().equals(other.getRecCrtTs()))
            && (this.getRecCrtOprId() == null ? other.getRecCrtOprId() == null : this.getRecCrtOprId().equals(other.getRecCrtOprId()))
            && (this.getRecUpdTs() == null ? other.getRecUpdTs() == null : this.getRecUpdTs().equals(other.getRecUpdTs()))
            && (this.getRecUpdOprId() == null ? other.getRecUpdOprId() == null : this.getRecUpdOprId().equals(other.getRecUpdOprId()))
            && (this.getRecUpdTransId() == null ? other.getRecUpdTransId() == null : this.getRecUpdTransId().equals(other.getRecUpdTransId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRecSeqId() == null) ? 0 : getRecSeqId().hashCode());
        result = prime * result + ((getBankAccTp() == null) ? 0 : getBankAccTp().hashCode());
        result = prime * result + ((getBankAcctNo() == null) ? 0 : getBankAcctNo().hashCode());
        result = prime * result + ((getBankAcctNm() == null) ? 0 : getBankAcctNm().hashCode());
        result = prime * result + ((getCertTp() == null) ? 0 : getCertTp().hashCode());
        result = prime * result + ((getCertNo() == null) ? 0 : getCertNo().hashCode());
        result = prime * result + ((getCardPhone() == null) ? 0 : getCardPhone().hashCode());
        result = prime * result + ((getBankId() == null) ? 0 : getBankId().hashCode());
        result = prime * result + ((getTransSeqId() == null) ? 0 : getTransSeqId().hashCode());
        result = prime * result + ((getRecCrtTs() == null) ? 0 : getRecCrtTs().hashCode());
        result = prime * result + ((getRecCrtOprId() == null) ? 0 : getRecCrtOprId().hashCode());
        result = prime * result + ((getRecUpdTs() == null) ? 0 : getRecUpdTs().hashCode());
        result = prime * result + ((getRecUpdOprId() == null) ? 0 : getRecUpdOprId().hashCode());
        result = prime * result + ((getRecUpdTransId() == null) ? 0 : getRecUpdTransId().hashCode());
        return result;
    }
}