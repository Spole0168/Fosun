package com.fosun.paymng.model;

import java.io.Serializable;
import java.util.Date;

public class PayBillFileDtl implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * VARCHAR(36) 必填<br>
     * 序列号
     */
    private String id;

    /**
     * VARCHAR(36)<br>
     * 商户对账文件ID
     */
    private String mchntFileId;

    /**
     * VARCHAR(36)<br>
     * 渠道对账文件ID
     */
    private String chnlFileId;

    /**
     * VARCHAR(8)<br>
     * 系统对账日期
     */
    private String checkDate;

    /**
     * CHAR(2) 必填<br>
     * 渠道号
     */
    private String chnlId;

    /**
     * VARCHAR(36)<br>
     * 渠道商户代码
     */
    private String chnlMchntId;

    /**
     * VARCHAR(32)<br>
     * 到支付渠道的流水号
     */
    private String sendOrderId;

    /**
     * CHAR(10)<br>
     * 商户号
     */
    private String mchntId;

    /**
     * VARCHAR(36)<br>
     * 商户订单号
     */
    private String mchntOrderId;

    /**
     * VARCHAR(14)<br>
     * 商户交易日期
     */
    private String mchntTransDt;

    /**
     * VARCHAR(36)<br>
     * 系统交易流水号
     */
    private String sysTransId;

    /**
     * CHAR(8)<br>
     * 系统清算日期
     */
    private String sysSettleDt;

    /**
     * CHAR(4)<br>
     * 交易代码
     */
    private String transCd;

    /**
     * DECIMAL(12) 必填<br>
     * 交易金额以分为单位
     */
    private Long transAmt;

    /**
     * CHAR(3)<br>
     * 交易币种
     */
    private String currency;

    /**
     * DECIMAL(12)<br>
     * 实际完成金额单位：分
     */
    private Long trueAmt;

    /**
     * DECIMAL(12)<br>
     * 交易手续费
     */
    private Long transFee;

    /**
     * VARCHAR(14)<br>
     * 渠道交易日期时间
     */
    private String chnlTransTms;

    /**
     * VARCHAR(36)<br>
     * 渠道交易标识码
     */
    private String chnlTransId;

    /**
     * VARCHAR(32)<br>
     * 原商户订单号
     */
    private String origSndOrderId;

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
     * VARCHAR(36) 必填<br>
     * 获得 序列号
     */
    public String getId() {
        return id;
    }

    /**
     * VARCHAR(36) 必填<br>
     * 设置 序列号
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * VARCHAR(36)<br>
     * 获得 商户对账文件ID
     */
    public String getMchntFileId() {
        return mchntFileId;
    }

    /**
     * VARCHAR(36)<br>
     * 设置 商户对账文件ID
     */
    public void setMchntFileId(String mchntFileId) {
        this.mchntFileId = mchntFileId == null ? null : mchntFileId.trim();
    }

    /**
     * VARCHAR(36)<br>
     * 获得 渠道对账文件ID
     */
    public String getChnlFileId() {
        return chnlFileId;
    }

    /**
     * VARCHAR(36)<br>
     * 设置 渠道对账文件ID
     */
    public void setChnlFileId(String chnlFileId) {
        this.chnlFileId = chnlFileId == null ? null : chnlFileId.trim();
    }

    /**
     * VARCHAR(8)<br>
     * 获得 系统对账日期
     */
    public String getCheckDate() {
        return checkDate;
    }

    /**
     * VARCHAR(8)<br>
     * 设置 系统对账日期
     */
    public void setCheckDate(String checkDate) {
        this.checkDate = checkDate == null ? null : checkDate.trim();
    }

    /**
     * CHAR(2) 必填<br>
     * 获得 渠道号
     */
    public String getChnlId() {
        return chnlId;
    }

    /**
     * CHAR(2) 必填<br>
     * 设置 渠道号
     */
    public void setChnlId(String chnlId) {
        this.chnlId = chnlId == null ? null : chnlId.trim();
    }

    /**
     * VARCHAR(36)<br>
     * 获得 渠道商户代码
     */
    public String getChnlMchntId() {
        return chnlMchntId;
    }

    /**
     * VARCHAR(36)<br>
     * 设置 渠道商户代码
     */
    public void setChnlMchntId(String chnlMchntId) {
        this.chnlMchntId = chnlMchntId == null ? null : chnlMchntId.trim();
    }

    /**
     * VARCHAR(32)<br>
     * 获得 到支付渠道的流水号
     */
    public String getSendOrderId() {
        return sendOrderId;
    }

    /**
     * VARCHAR(32)<br>
     * 设置 到支付渠道的流水号
     */
    public void setSendOrderId(String sendOrderId) {
        this.sendOrderId = sendOrderId == null ? null : sendOrderId.trim();
    }

    /**
     * CHAR(10)<br>
     * 获得 商户号
     */
    public String getMchntId() {
        return mchntId;
    }

    /**
     * CHAR(10)<br>
     * 设置 商户号
     */
    public void setMchntId(String mchntId) {
        this.mchntId = mchntId == null ? null : mchntId.trim();
    }

    /**
     * VARCHAR(36)<br>
     * 获得 商户订单号
     */
    public String getMchntOrderId() {
        return mchntOrderId;
    }

    /**
     * VARCHAR(36)<br>
     * 设置 商户订单号
     */
    public void setMchntOrderId(String mchntOrderId) {
        this.mchntOrderId = mchntOrderId == null ? null : mchntOrderId.trim();
    }

    /**
     * VARCHAR(14)<br>
     * 获得 商户交易日期
     */
    public String getMchntTransDt() {
        return mchntTransDt;
    }

    /**
     * VARCHAR(14)<br>
     * 设置 商户交易日期
     */
    public void setMchntTransDt(String mchntTransDt) {
        this.mchntTransDt = mchntTransDt == null ? null : mchntTransDt.trim();
    }

    /**
     * VARCHAR(36)<br>
     * 获得 系统交易流水号
     */
    public String getSysTransId() {
        return sysTransId;
    }

    /**
     * VARCHAR(36)<br>
     * 设置 系统交易流水号
     */
    public void setSysTransId(String sysTransId) {
        this.sysTransId = sysTransId == null ? null : sysTransId.trim();
    }

    /**
     * CHAR(8)<br>
     * 获得 系统清算日期
     */
    public String getSysSettleDt() {
        return sysSettleDt;
    }

    /**
     * CHAR(8)<br>
     * 设置 系统清算日期
     */
    public void setSysSettleDt(String sysSettleDt) {
        this.sysSettleDt = sysSettleDt == null ? null : sysSettleDt.trim();
    }

    /**
     * CHAR(4)<br>
     * 获得 交易代码
     */
    public String getTransCd() {
        return transCd;
    }

    /**
     * CHAR(4)<br>
     * 设置 交易代码
     */
    public void setTransCd(String transCd) {
        this.transCd = transCd == null ? null : transCd.trim();
    }

    /**
     * DECIMAL(12) 必填<br>
     * 获得 交易金额以分为单位
     */
    public Long getTransAmt() {
        return transAmt;
    }

    /**
     * DECIMAL(12) 必填<br>
     * 设置 交易金额以分为单位
     */
    public void setTransAmt(Long transAmt) {
        this.transAmt = transAmt;
    }

    /**
     * CHAR(3)<br>
     * 获得 交易币种
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * CHAR(3)<br>
     * 设置 交易币种
     */
    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    /**
     * DECIMAL(12)<br>
     * 获得 实际完成金额单位：分
     */
    public Long getTrueAmt() {
        return trueAmt;
    }

    /**
     * DECIMAL(12)<br>
     * 设置 实际完成金额单位：分
     */
    public void setTrueAmt(Long trueAmt) {
        this.trueAmt = trueAmt;
    }

    /**
     * DECIMAL(12)<br>
     * 获得 交易手续费
     */
    public Long getTransFee() {
        return transFee;
    }

    /**
     * DECIMAL(12)<br>
     * 设置 交易手续费
     */
    public void setTransFee(Long transFee) {
        this.transFee = transFee;
    }

    /**
     * VARCHAR(14)<br>
     * 获得 渠道交易日期时间
     */
    public String getChnlTransTms() {
        return chnlTransTms;
    }

    /**
     * VARCHAR(14)<br>
     * 设置 渠道交易日期时间
     */
    public void setChnlTransTms(String chnlTransTms) {
        this.chnlTransTms = chnlTransTms == null ? null : chnlTransTms.trim();
    }

    /**
     * VARCHAR(36)<br>
     * 获得 渠道交易标识码
     */
    public String getChnlTransId() {
        return chnlTransId;
    }

    /**
     * VARCHAR(36)<br>
     * 设置 渠道交易标识码
     */
    public void setChnlTransId(String chnlTransId) {
        this.chnlTransId = chnlTransId == null ? null : chnlTransId.trim();
    }

    /**
     * VARCHAR(32)<br>
     * 获得 原商户订单号
     */
    public String getOrigSndOrderId() {
        return origSndOrderId;
    }

    /**
     * VARCHAR(32)<br>
     * 设置 原商户订单号
     */
    public void setOrigSndOrderId(String origSndOrderId) {
        this.origSndOrderId = origSndOrderId == null ? null : origSndOrderId.trim();
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", mchntFileId=").append(mchntFileId);
        sb.append(", chnlFileId=").append(chnlFileId);
        sb.append(", checkDate=").append(checkDate);
        sb.append(", chnlId=").append(chnlId);
        sb.append(", chnlMchntId=").append(chnlMchntId);
        sb.append(", sendOrderId=").append(sendOrderId);
        sb.append(", mchntId=").append(mchntId);
        sb.append(", mchntOrderId=").append(mchntOrderId);
        sb.append(", mchntTransDt=").append(mchntTransDt);
        sb.append(", sysTransId=").append(sysTransId);
        sb.append(", sysSettleDt=").append(sysSettleDt);
        sb.append(", transCd=").append(transCd);
        sb.append(", transAmt=").append(transAmt);
        sb.append(", currency=").append(currency);
        sb.append(", trueAmt=").append(trueAmt);
        sb.append(", transFee=").append(transFee);
        sb.append(", chnlTransTms=").append(chnlTransTms);
        sb.append(", chnlTransId=").append(chnlTransId);
        sb.append(", origSndOrderId=").append(origSndOrderId);
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
        PayBillFileDtl other = (PayBillFileDtl) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMchntFileId() == null ? other.getMchntFileId() == null : this.getMchntFileId().equals(other.getMchntFileId()))
            && (this.getChnlFileId() == null ? other.getChnlFileId() == null : this.getChnlFileId().equals(other.getChnlFileId()))
            && (this.getCheckDate() == null ? other.getCheckDate() == null : this.getCheckDate().equals(other.getCheckDate()))
            && (this.getChnlId() == null ? other.getChnlId() == null : this.getChnlId().equals(other.getChnlId()))
            && (this.getChnlMchntId() == null ? other.getChnlMchntId() == null : this.getChnlMchntId().equals(other.getChnlMchntId()))
            && (this.getSendOrderId() == null ? other.getSendOrderId() == null : this.getSendOrderId().equals(other.getSendOrderId()))
            && (this.getMchntId() == null ? other.getMchntId() == null : this.getMchntId().equals(other.getMchntId()))
            && (this.getMchntOrderId() == null ? other.getMchntOrderId() == null : this.getMchntOrderId().equals(other.getMchntOrderId()))
            && (this.getMchntTransDt() == null ? other.getMchntTransDt() == null : this.getMchntTransDt().equals(other.getMchntTransDt()))
            && (this.getSysTransId() == null ? other.getSysTransId() == null : this.getSysTransId().equals(other.getSysTransId()))
            && (this.getSysSettleDt() == null ? other.getSysSettleDt() == null : this.getSysSettleDt().equals(other.getSysSettleDt()))
            && (this.getTransCd() == null ? other.getTransCd() == null : this.getTransCd().equals(other.getTransCd()))
            && (this.getTransAmt() == null ? other.getTransAmt() == null : this.getTransAmt().equals(other.getTransAmt()))
            && (this.getCurrency() == null ? other.getCurrency() == null : this.getCurrency().equals(other.getCurrency()))
            && (this.getTrueAmt() == null ? other.getTrueAmt() == null : this.getTrueAmt().equals(other.getTrueAmt()))
            && (this.getTransFee() == null ? other.getTransFee() == null : this.getTransFee().equals(other.getTransFee()))
            && (this.getChnlTransTms() == null ? other.getChnlTransTms() == null : this.getChnlTransTms().equals(other.getChnlTransTms()))
            && (this.getChnlTransId() == null ? other.getChnlTransId() == null : this.getChnlTransId().equals(other.getChnlTransId()))
            && (this.getOrigSndOrderId() == null ? other.getOrigSndOrderId() == null : this.getOrigSndOrderId().equals(other.getOrigSndOrderId()))
            && (this.getRecCrtTs() == null ? other.getRecCrtTs() == null : this.getRecCrtTs().equals(other.getRecCrtTs()))
            && (this.getRecCrtOprId() == null ? other.getRecCrtOprId() == null : this.getRecCrtOprId().equals(other.getRecCrtOprId()))
            && (this.getRecUpdTs() == null ? other.getRecUpdTs() == null : this.getRecUpdTs().equals(other.getRecUpdTs()))
            && (this.getRecUpdOprId() == null ? other.getRecUpdOprId() == null : this.getRecUpdOprId().equals(other.getRecUpdOprId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMchntFileId() == null) ? 0 : getMchntFileId().hashCode());
        result = prime * result + ((getChnlFileId() == null) ? 0 : getChnlFileId().hashCode());
        result = prime * result + ((getCheckDate() == null) ? 0 : getCheckDate().hashCode());
        result = prime * result + ((getChnlId() == null) ? 0 : getChnlId().hashCode());
        result = prime * result + ((getChnlMchntId() == null) ? 0 : getChnlMchntId().hashCode());
        result = prime * result + ((getSendOrderId() == null) ? 0 : getSendOrderId().hashCode());
        result = prime * result + ((getMchntId() == null) ? 0 : getMchntId().hashCode());
        result = prime * result + ((getMchntOrderId() == null) ? 0 : getMchntOrderId().hashCode());
        result = prime * result + ((getMchntTransDt() == null) ? 0 : getMchntTransDt().hashCode());
        result = prime * result + ((getSysTransId() == null) ? 0 : getSysTransId().hashCode());
        result = prime * result + ((getSysSettleDt() == null) ? 0 : getSysSettleDt().hashCode());
        result = prime * result + ((getTransCd() == null) ? 0 : getTransCd().hashCode());
        result = prime * result + ((getTransAmt() == null) ? 0 : getTransAmt().hashCode());
        result = prime * result + ((getCurrency() == null) ? 0 : getCurrency().hashCode());
        result = prime * result + ((getTrueAmt() == null) ? 0 : getTrueAmt().hashCode());
        result = prime * result + ((getTransFee() == null) ? 0 : getTransFee().hashCode());
        result = prime * result + ((getChnlTransTms() == null) ? 0 : getChnlTransTms().hashCode());
        result = prime * result + ((getChnlTransId() == null) ? 0 : getChnlTransId().hashCode());
        result = prime * result + ((getOrigSndOrderId() == null) ? 0 : getOrigSndOrderId().hashCode());
        result = prime * result + ((getRecCrtTs() == null) ? 0 : getRecCrtTs().hashCode());
        result = prime * result + ((getRecCrtOprId() == null) ? 0 : getRecCrtOprId().hashCode());
        result = prime * result + ((getRecUpdTs() == null) ? 0 : getRecUpdTs().hashCode());
        result = prime * result + ((getRecUpdOprId() == null) ? 0 : getRecUpdOprId().hashCode());
        return result;
    }
}