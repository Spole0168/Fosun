package com.fosun.paymng.model;

import java.io.Serializable;

public class PayFundCfg implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * VARCHAR(32) 默认值[] 必填<br>
     * 
     */
    private String id;

    /**
     * VARCHAR(2)<br>
     * 
     */
    private String payType;

    /**
     * CHAR(10)<br>
     * 商户代码
     */
    private String mchntId;

    /**
     * VARCHAR(10)<br>
     * 
     */
    private String fundCode;

    /**
     * VARCHAR(100)<br>
     * 
     */
    private String fundName;

    /**
     * VARCHAR(20)<br>
     * 
     */
    private String actNo;

    /**
     * VARCHAR(100)<br>
     * 私钥
     */
    private String pfxFileName;

    /**
     * VARCHAR(100)<br>
     * 公钥
     */
    private String pubFileName;

    /**
     * VARCHAR(30)<br>
     * 保护密码
     */
    private String priPsd;

    /**
     * CHAR(1)<br>
     * 对账表示Y/N
     */
    private String billFlag;

    /**
     * VARCHAR(30)<br>
     * 接入终端号
     */
    private String terminal;

    /**
     * VARCHAR(32) 默认值[] 必填<br>
     * 获得 
     */
    public String getId() {
        return id;
    }

    /**
     * VARCHAR(32) 默认值[] 必填<br>
     * 设置 
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
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
     * VARCHAR(10)<br>
     * 获得 
     */
    public String getFundCode() {
        return fundCode;
    }

    /**
     * VARCHAR(10)<br>
     * 设置 
     */
    public void setFundCode(String fundCode) {
        this.fundCode = fundCode == null ? null : fundCode.trim();
    }

    /**
     * VARCHAR(100)<br>
     * 获得 
     */
    public String getFundName() {
        return fundName;
    }

    /**
     * VARCHAR(100)<br>
     * 设置 
     */
    public void setFundName(String fundName) {
        this.fundName = fundName == null ? null : fundName.trim();
    }

    /**
     * VARCHAR(20)<br>
     * 获得 
     */
    public String getActNo() {
        return actNo;
    }

    /**
     * VARCHAR(20)<br>
     * 设置 
     */
    public void setActNo(String actNo) {
        this.actNo = actNo == null ? null : actNo.trim();
    }

    /**
     * VARCHAR(100)<br>
     * 获得 私钥
     */
    public String getPfxFileName() {
        return pfxFileName;
    }

    /**
     * VARCHAR(100)<br>
     * 设置 私钥
     */
    public void setPfxFileName(String pfxFileName) {
        this.pfxFileName = pfxFileName == null ? null : pfxFileName.trim();
    }

    /**
     * VARCHAR(100)<br>
     * 获得 公钥
     */
    public String getPubFileName() {
        return pubFileName;
    }

    /**
     * VARCHAR(100)<br>
     * 设置 公钥
     */
    public void setPubFileName(String pubFileName) {
        this.pubFileName = pubFileName == null ? null : pubFileName.trim();
    }

    /**
     * VARCHAR(30)<br>
     * 获得 保护密码
     */
    public String getPriPsd() {
        return priPsd;
    }

    /**
     * VARCHAR(30)<br>
     * 设置 保护密码
     */
    public void setPriPsd(String priPsd) {
        this.priPsd = priPsd == null ? null : priPsd.trim();
    }

    /**
     * CHAR(1)<br>
     * 获得 对账表示Y/N
     */
    public String getBillFlag() {
        return billFlag;
    }

    /**
     * CHAR(1)<br>
     * 设置 对账表示Y/N
     */
    public void setBillFlag(String billFlag) {
        this.billFlag = billFlag == null ? null : billFlag.trim();
    }

    /**
     * VARCHAR(30)<br>
     * 获得 接入终端号
     */
    public String getTerminal() {
        return terminal;
    }

    /**
     * VARCHAR(30)<br>
     * 设置 接入终端号
     */
    public void setTerminal(String terminal) {
        this.terminal = terminal == null ? null : terminal.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", payType=").append(payType);
        sb.append(", mchntId=").append(mchntId);
        sb.append(", fundCode=").append(fundCode);
        sb.append(", fundName=").append(fundName);
        sb.append(", actNo=").append(actNo);
        sb.append(", pfxFileName=").append(pfxFileName);
        sb.append(", pubFileName=").append(pubFileName);
        sb.append(", priPsd=").append(priPsd);
        sb.append(", billFlag=").append(billFlag);
        sb.append(", terminal=").append(terminal);
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
        PayFundCfg other = (PayFundCfg) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPayType() == null ? other.getPayType() == null : this.getPayType().equals(other.getPayType()))
            && (this.getMchntId() == null ? other.getMchntId() == null : this.getMchntId().equals(other.getMchntId()))
            && (this.getFundCode() == null ? other.getFundCode() == null : this.getFundCode().equals(other.getFundCode()))
            && (this.getFundName() == null ? other.getFundName() == null : this.getFundName().equals(other.getFundName()))
            && (this.getActNo() == null ? other.getActNo() == null : this.getActNo().equals(other.getActNo()))
            && (this.getPfxFileName() == null ? other.getPfxFileName() == null : this.getPfxFileName().equals(other.getPfxFileName()))
            && (this.getPubFileName() == null ? other.getPubFileName() == null : this.getPubFileName().equals(other.getPubFileName()))
            && (this.getPriPsd() == null ? other.getPriPsd() == null : this.getPriPsd().equals(other.getPriPsd()))
            && (this.getBillFlag() == null ? other.getBillFlag() == null : this.getBillFlag().equals(other.getBillFlag()))
            && (this.getTerminal() == null ? other.getTerminal() == null : this.getTerminal().equals(other.getTerminal()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPayType() == null) ? 0 : getPayType().hashCode());
        result = prime * result + ((getMchntId() == null) ? 0 : getMchntId().hashCode());
        result = prime * result + ((getFundCode() == null) ? 0 : getFundCode().hashCode());
        result = prime * result + ((getFundName() == null) ? 0 : getFundName().hashCode());
        result = prime * result + ((getActNo() == null) ? 0 : getActNo().hashCode());
        result = prime * result + ((getPfxFileName() == null) ? 0 : getPfxFileName().hashCode());
        result = prime * result + ((getPubFileName() == null) ? 0 : getPubFileName().hashCode());
        result = prime * result + ((getPriPsd() == null) ? 0 : getPriPsd().hashCode());
        result = prime * result + ((getBillFlag() == null) ? 0 : getBillFlag().hashCode());
        result = prime * result + ((getTerminal() == null) ? 0 : getTerminal().hashCode());
        return result;
    }
}