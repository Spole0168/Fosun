package com.fosun.paymng.model;

import java.io.Serializable;
import java.util.Date;

public class PayCardContractInf implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * VARCHAR(36) 必填<br>
     * 记录序列号
     */
    private String recSeqId;

    /**
     * CHAR(10) 必填<br>
     * 商户代码
     */
    private String mchntId;

    /**
     * CHAR(4)<br>
     * 签约代码，交易码 2001-代扣
     */
    private String transCd;

    /**
     * CHAR(2) 必填<br>
     * 签约渠道01—统统付02—银联
     */
    private String transChnl;

    /**
     * VARCHAR(32)<br>
     * 签约合同号
     */
    private String contractNo;

    /**
     * TIMESTAMP(19)<br>
     * 合同开始日期
     */
    private Date contractStartdt;

    /**
     * TIMESTAMP(19)<br>
     * 合同结束日期
     */
    private Date contractEnddt;

    /**
     * CHAR(1) 必填<br>
     * 账户类型1：个人2：企业
     */
    private String bankAccTp;

    /**
     * VARCHAR(30)<br>
     * 银行账户,卡号或企业账户号
     */
    private String bankAcctNo;

    /**
     * VARCHAR(128)<br>
     * 开户名
     */
    private String bankAcctNm;

    /**
     * CHAR(2)<br>
     * 证件类型01：身份证；02：军官证；03：护照；04: 回乡证；05: 台胞证；06: 警官证；07: 士兵证；99: 其他证件；
     */
    private String certTp;

    /**
     * VARCHAR(32)<br>
     * 证件号码
     */
    private String certNo;

    /**
     * VARCHAR(15)<br>
     * 银行预留手机号
     */
    private String cardPhone;

    /**
     * CHAR(8)<br>
     * 发卡行代码
     */
    private String bankId;

    /**
     * VARCHAR(32)<br>
     * 客户号
     */
    private String custId;

    /**
     * VARCHAR(36)<br>
     * 交易流水号
     */
    private String transSeqId;

    /**
     * VARCHAR(256)<br>
     * 后台返回地址
     */
    private String bgRetUrl;

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
     * VARBINARY(64)<br>
     * 开户行名称
     */
    private byte[] corpAccBankNm;

    /**
     * VARCHAR(36) 必填<br>
     * 获得 记录序列号
     */
    public String getRecSeqId() {
        return recSeqId;
    }

    /**
     * VARCHAR(36) 必填<br>
     * 设置 记录序列号
     */
    public void setRecSeqId(String recSeqId) {
        this.recSeqId = recSeqId == null ? null : recSeqId.trim();
    }

    /**
     * CHAR(10) 必填<br>
     * 获得 商户代码
     */
    public String getMchntId() {
        return mchntId;
    }

    /**
     * CHAR(10) 必填<br>
     * 设置 商户代码
     */
    public void setMchntId(String mchntId) {
        this.mchntId = mchntId == null ? null : mchntId.trim();
    }

    /**
     * CHAR(4)<br>
     * 获得 签约代码，交易码 2001-代扣
     */
    public String getTransCd() {
        return transCd;
    }

    /**
     * CHAR(4)<br>
     * 设置 签约代码，交易码 2001-代扣
     */
    public void setTransCd(String transCd) {
        this.transCd = transCd == null ? null : transCd.trim();
    }

    /**
     * CHAR(2) 必填<br>
     * 获得 签约渠道01—统统付02—银联
     */
    public String getTransChnl() {
        return transChnl;
    }

    /**
     * CHAR(2) 必填<br>
     * 设置 签约渠道01—统统付02—银联
     */
    public void setTransChnl(String transChnl) {
        this.transChnl = transChnl == null ? null : transChnl.trim();
    }

    /**
     * VARCHAR(32)<br>
     * 获得 签约合同号
     */
    public String getContractNo() {
        return contractNo;
    }

    /**
     * VARCHAR(32)<br>
     * 设置 签约合同号
     */
    public void setContractNo(String contractNo) {
        this.contractNo = contractNo == null ? null : contractNo.trim();
    }

    /**
     * TIMESTAMP(19)<br>
     * 获得 合同开始日期
     */
    public Date getContractStartdt() {
        return contractStartdt;
    }

    /**
     * TIMESTAMP(19)<br>
     * 设置 合同开始日期
     */
    public void setContractStartdt(Date contractStartdt) {
        this.contractStartdt = contractStartdt;
    }

    /**
     * TIMESTAMP(19)<br>
     * 获得 合同结束日期
     */
    public Date getContractEnddt() {
        return contractEnddt;
    }

    /**
     * TIMESTAMP(19)<br>
     * 设置 合同结束日期
     */
    public void setContractEnddt(Date contractEnddt) {
        this.contractEnddt = contractEnddt;
    }

    /**
     * CHAR(1) 必填<br>
     * 获得 账户类型1：个人2：企业
     */
    public String getBankAccTp() {
        return bankAccTp;
    }

    /**
     * CHAR(1) 必填<br>
     * 设置 账户类型1：个人2：企业
     */
    public void setBankAccTp(String bankAccTp) {
        this.bankAccTp = bankAccTp == null ? null : bankAccTp.trim();
    }

    /**
     * VARCHAR(30)<br>
     * 获得 银行账户,卡号或企业账户号
     */
    public String getBankAcctNo() {
        return bankAcctNo;
    }

    /**
     * VARCHAR(30)<br>
     * 设置 银行账户,卡号或企业账户号
     */
    public void setBankAcctNo(String bankAcctNo) {
        this.bankAcctNo = bankAcctNo == null ? null : bankAcctNo.trim();
    }

    /**
     * VARCHAR(128)<br>
     * 获得 开户名
     */
    public String getBankAcctNm() {
        return bankAcctNm;
    }

    /**
     * VARCHAR(128)<br>
     * 设置 开户名
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
     * VARCHAR(32)<br>
     * 获得 证件号码
     */
    public String getCertNo() {
        return certNo;
    }

    /**
     * VARCHAR(32)<br>
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
     * CHAR(8)<br>
     * 获得 发卡行代码
     */
    public String getBankId() {
        return bankId;
    }

    /**
     * CHAR(8)<br>
     * 设置 发卡行代码
     */
    public void setBankId(String bankId) {
        this.bankId = bankId == null ? null : bankId.trim();
    }

    /**
     * VARCHAR(32)<br>
     * 获得 客户号
     */
    public String getCustId() {
        return custId;
    }

    /**
     * VARCHAR(32)<br>
     * 设置 客户号
     */
    public void setCustId(String custId) {
        this.custId = custId == null ? null : custId.trim();
    }

    /**
     * VARCHAR(36)<br>
     * 获得 交易流水号
     */
    public String getTransSeqId() {
        return transSeqId;
    }

    /**
     * VARCHAR(36)<br>
     * 设置 交易流水号
     */
    public void setTransSeqId(String transSeqId) {
        this.transSeqId = transSeqId == null ? null : transSeqId.trim();
    }

    /**
     * VARCHAR(256)<br>
     * 获得 后台返回地址
     */
    public String getBgRetUrl() {
        return bgRetUrl;
    }

    /**
     * VARCHAR(256)<br>
     * 设置 后台返回地址
     */
    public void setBgRetUrl(String bgRetUrl) {
        this.bgRetUrl = bgRetUrl == null ? null : bgRetUrl.trim();
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
     * VARBINARY(64)<br>
     * 获得 开户行名称
     */
    public byte[] getCorpAccBankNm() {
        return corpAccBankNm;
    }

    /**
     * VARBINARY(64)<br>
     * 设置 开户行名称
     */
    public void setCorpAccBankNm(byte[] corpAccBankNm) {
        this.corpAccBankNm = corpAccBankNm;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", recSeqId=").append(recSeqId);
        sb.append(", mchntId=").append(mchntId);
        sb.append(", transCd=").append(transCd);
        sb.append(", transChnl=").append(transChnl);
        sb.append(", contractNo=").append(contractNo);
        sb.append(", contractStartdt=").append(contractStartdt);
        sb.append(", contractEnddt=").append(contractEnddt);
        sb.append(", bankAccTp=").append(bankAccTp);
        sb.append(", bankAcctNo=").append(bankAcctNo);
        sb.append(", bankAcctNm=").append(bankAcctNm);
        sb.append(", certTp=").append(certTp);
        sb.append(", certNo=").append(certNo);
        sb.append(", cardPhone=").append(cardPhone);
        sb.append(", bankId=").append(bankId);
        sb.append(", custId=").append(custId);
        sb.append(", transSeqId=").append(transSeqId);
        sb.append(", bgRetUrl=").append(bgRetUrl);
        sb.append(", recCrtTs=").append(recCrtTs);
        sb.append(", recCrtOprId=").append(recCrtOprId);
        sb.append(", recUpdTs=").append(recUpdTs);
        sb.append(", recUpdOprId=").append(recUpdOprId);
        sb.append(", corpAccBankNm=").append(corpAccBankNm);
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
        PayCardContractInf other = (PayCardContractInf) that;
        return (this.getRecSeqId() == null ? other.getRecSeqId() == null : this.getRecSeqId().equals(other.getRecSeqId()))
            && (this.getMchntId() == null ? other.getMchntId() == null : this.getMchntId().equals(other.getMchntId()))
            && (this.getTransCd() == null ? other.getTransCd() == null : this.getTransCd().equals(other.getTransCd()))
            && (this.getTransChnl() == null ? other.getTransChnl() == null : this.getTransChnl().equals(other.getTransChnl()))
            && (this.getContractNo() == null ? other.getContractNo() == null : this.getContractNo().equals(other.getContractNo()))
            && (this.getContractStartdt() == null ? other.getContractStartdt() == null : this.getContractStartdt().equals(other.getContractStartdt()))
            && (this.getContractEnddt() == null ? other.getContractEnddt() == null : this.getContractEnddt().equals(other.getContractEnddt()))
            && (this.getBankAccTp() == null ? other.getBankAccTp() == null : this.getBankAccTp().equals(other.getBankAccTp()))
            && (this.getBankAcctNo() == null ? other.getBankAcctNo() == null : this.getBankAcctNo().equals(other.getBankAcctNo()))
            && (this.getBankAcctNm() == null ? other.getBankAcctNm() == null : this.getBankAcctNm().equals(other.getBankAcctNm()))
            && (this.getCertTp() == null ? other.getCertTp() == null : this.getCertTp().equals(other.getCertTp()))
            && (this.getCertNo() == null ? other.getCertNo() == null : this.getCertNo().equals(other.getCertNo()))
            && (this.getCardPhone() == null ? other.getCardPhone() == null : this.getCardPhone().equals(other.getCardPhone()))
            && (this.getBankId() == null ? other.getBankId() == null : this.getBankId().equals(other.getBankId()))
            && (this.getCustId() == null ? other.getCustId() == null : this.getCustId().equals(other.getCustId()))
            && (this.getTransSeqId() == null ? other.getTransSeqId() == null : this.getTransSeqId().equals(other.getTransSeqId()))
            && (this.getBgRetUrl() == null ? other.getBgRetUrl() == null : this.getBgRetUrl().equals(other.getBgRetUrl()))
            && (this.getRecCrtTs() == null ? other.getRecCrtTs() == null : this.getRecCrtTs().equals(other.getRecCrtTs()))
            && (this.getRecCrtOprId() == null ? other.getRecCrtOprId() == null : this.getRecCrtOprId().equals(other.getRecCrtOprId()))
            && (this.getRecUpdTs() == null ? other.getRecUpdTs() == null : this.getRecUpdTs().equals(other.getRecUpdTs()))
            && (this.getRecUpdOprId() == null ? other.getRecUpdOprId() == null : this.getRecUpdOprId().equals(other.getRecUpdOprId()))
            && (this.getCorpAccBankNm() == null ? other.getCorpAccBankNm() == null : this.getCorpAccBankNm().equals(other.getCorpAccBankNm()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRecSeqId() == null) ? 0 : getRecSeqId().hashCode());
        result = prime * result + ((getMchntId() == null) ? 0 : getMchntId().hashCode());
        result = prime * result + ((getTransCd() == null) ? 0 : getTransCd().hashCode());
        result = prime * result + ((getTransChnl() == null) ? 0 : getTransChnl().hashCode());
        result = prime * result + ((getContractNo() == null) ? 0 : getContractNo().hashCode());
        result = prime * result + ((getContractStartdt() == null) ? 0 : getContractStartdt().hashCode());
        result = prime * result + ((getContractEnddt() == null) ? 0 : getContractEnddt().hashCode());
        result = prime * result + ((getBankAccTp() == null) ? 0 : getBankAccTp().hashCode());
        result = prime * result + ((getBankAcctNo() == null) ? 0 : getBankAcctNo().hashCode());
        result = prime * result + ((getBankAcctNm() == null) ? 0 : getBankAcctNm().hashCode());
        result = prime * result + ((getCertTp() == null) ? 0 : getCertTp().hashCode());
        result = prime * result + ((getCertNo() == null) ? 0 : getCertNo().hashCode());
        result = prime * result + ((getCardPhone() == null) ? 0 : getCardPhone().hashCode());
        result = prime * result + ((getBankId() == null) ? 0 : getBankId().hashCode());
        result = prime * result + ((getCustId() == null) ? 0 : getCustId().hashCode());
        result = prime * result + ((getTransSeqId() == null) ? 0 : getTransSeqId().hashCode());
        result = prime * result + ((getBgRetUrl() == null) ? 0 : getBgRetUrl().hashCode());
        result = prime * result + ((getRecCrtTs() == null) ? 0 : getRecCrtTs().hashCode());
        result = prime * result + ((getRecCrtOprId() == null) ? 0 : getRecCrtOprId().hashCode());
        result = prime * result + ((getRecUpdTs() == null) ? 0 : getRecUpdTs().hashCode());
        result = prime * result + ((getRecUpdOprId() == null) ? 0 : getRecUpdOprId().hashCode());
        result = prime * result + ((getCorpAccBankNm() == null) ? 0 : getCorpAccBankNm().hashCode());
        return result;
    }
}