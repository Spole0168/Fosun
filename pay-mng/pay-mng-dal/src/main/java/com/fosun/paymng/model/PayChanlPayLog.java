package com.fosun.paymng.model;

import java.io.Serializable;
import java.util.Date;

public class PayChanlPayLog implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * VARCHAR(36) 必填<br>
     * 支付流水号
     */
    private String transPayId;

    /**
     * VARCHAR(36) 必填<br>
     * PAY_MCHNT_TRANS_LOG表主键
     */
    private String transSeqId;

    /**
     * INTEGER(10) 必填<br>
     * 执行顺序号
     */
    private Integer executeSeqId;

    /**
     * DECIMAL(12) 必填<br>
     * 交易金额,以分为单位
     */
    private Long transAmt;

    /**
     * CHAR(3)<br>
     * 交易币种,固定156
     */
    private String currency;

    /**
     * CHAR(1) 必填<br>
     * 交易状态;0-处理中 1-失败 2-成功 3-部分成功 9-状态未明
     */
    private String transSt;

    /**
     * VARCHAR(16)<br>
     * 渠道应答码
     */
    private String chnlRspCd;

    /**
     * TIMESTAMP(19) 默认值[CURRENT_TIMESTAMP] 必填<br>
     * 系统交易日期时间
     */
    private Date sysTransTms;

    /**
     * VARCHAR(32)<br>
     * 内部订单号,到支付渠道的流水号
     */
    private String sendOrderId;

    /**
     * CHAR(2) 必填<br>
     * 交易渠道01—统统付 02—银联
     */
    private String transChnl;

    /**
     * VARCHAR(20)<br>
     * 渠道接入账户/渠道商户代码
     */
    private String chnlActNo;

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
     * VARCHAR(8)<br>
     * 渠道清算日期YYYYMMDD
     */
    private String chnlSettleDt;

    /**
     * TIMESTAMP(19) 默认值[0000-00-00 00:00:00] 必填<br>
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
     * 获得 支付流水号
     */
    public String getTransPayId() {
        return transPayId;
    }

    /**
     * VARCHAR(36) 必填<br>
     * 设置 支付流水号
     */
    public void setTransPayId(String transPayId) {
        this.transPayId = transPayId == null ? null : transPayId.trim();
    }

    /**
     * VARCHAR(36) 必填<br>
     * 获得 PAY_MCHNT_TRANS_LOG表主键
     */
    public String getTransSeqId() {
        return transSeqId;
    }

    /**
     * VARCHAR(36) 必填<br>
     * 设置 PAY_MCHNT_TRANS_LOG表主键
     */
    public void setTransSeqId(String transSeqId) {
        this.transSeqId = transSeqId == null ? null : transSeqId.trim();
    }

    /**
     * INTEGER(10) 必填<br>
     * 获得 执行顺序号
     */
    public Integer getExecuteSeqId() {
        return executeSeqId;
    }

    /**
     * INTEGER(10) 必填<br>
     * 设置 执行顺序号
     */
    public void setExecuteSeqId(Integer executeSeqId) {
        this.executeSeqId = executeSeqId;
    }

    /**
     * DECIMAL(12) 必填<br>
     * 获得 交易金额,以分为单位
     */
    public Long getTransAmt() {
        return transAmt;
    }

    /**
     * DECIMAL(12) 必填<br>
     * 设置 交易金额,以分为单位
     */
    public void setTransAmt(Long transAmt) {
        this.transAmt = transAmt;
    }

    /**
     * CHAR(3)<br>
     * 获得 交易币种,固定156
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * CHAR(3)<br>
     * 设置 交易币种,固定156
     */
    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    /**
     * CHAR(1) 必填<br>
     * 获得 交易状态;0-处理中 1-失败 2-成功 3-部分成功 9-状态未明
     */
    public String getTransSt() {
        return transSt;
    }

    /**
     * CHAR(1) 必填<br>
     * 设置 交易状态;0-处理中 1-失败 2-成功 3-部分成功 9-状态未明
     */
    public void setTransSt(String transSt) {
        this.transSt = transSt == null ? null : transSt.trim();
    }

    /**
     * VARCHAR(16)<br>
     * 获得 渠道应答码
     */
    public String getChnlRspCd() {
        return chnlRspCd;
    }

    /**
     * VARCHAR(16)<br>
     * 设置 渠道应答码
     */
    public void setChnlRspCd(String chnlRspCd) {
        this.chnlRspCd = chnlRspCd == null ? null : chnlRspCd.trim();
    }

    /**
     * TIMESTAMP(19) 默认值[CURRENT_TIMESTAMP] 必填<br>
     * 获得 系统交易日期时间
     */
    public Date getSysTransTms() {
        return sysTransTms;
    }

    /**
     * TIMESTAMP(19) 默认值[CURRENT_TIMESTAMP] 必填<br>
     * 设置 系统交易日期时间
     */
    public void setSysTransTms(Date sysTransTms) {
        this.sysTransTms = sysTransTms;
    }

    /**
     * VARCHAR(32)<br>
     * 获得 内部订单号,到支付渠道的流水号
     */
    public String getSendOrderId() {
        return sendOrderId;
    }

    /**
     * VARCHAR(32)<br>
     * 设置 内部订单号,到支付渠道的流水号
     */
    public void setSendOrderId(String sendOrderId) {
        this.sendOrderId = sendOrderId == null ? null : sendOrderId.trim();
    }

    /**
     * CHAR(2) 必填<br>
     * 获得 交易渠道01—统统付 02—银联
     */
    public String getTransChnl() {
        return transChnl;
    }

    /**
     * CHAR(2) 必填<br>
     * 设置 交易渠道01—统统付 02—银联
     */
    public void setTransChnl(String transChnl) {
        this.transChnl = transChnl == null ? null : transChnl.trim();
    }

    /**
     * VARCHAR(20)<br>
     * 获得 渠道接入账户/渠道商户代码
     */
    public String getChnlActNo() {
        return chnlActNo;
    }

    /**
     * VARCHAR(20)<br>
     * 设置 渠道接入账户/渠道商户代码
     */
    public void setChnlActNo(String chnlActNo) {
        this.chnlActNo = chnlActNo == null ? null : chnlActNo.trim();
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
     * VARCHAR(8)<br>
     * 获得 渠道清算日期YYYYMMDD
     */
    public String getChnlSettleDt() {
        return chnlSettleDt;
    }

    /**
     * VARCHAR(8)<br>
     * 设置 渠道清算日期YYYYMMDD
     */
    public void setChnlSettleDt(String chnlSettleDt) {
        this.chnlSettleDt = chnlSettleDt == null ? null : chnlSettleDt.trim();
    }

    /**
     * TIMESTAMP(19) 默认值[0000-00-00 00:00:00] 必填<br>
     * 获得 记录插入时间
     */
    public Date getRecCrtTs() {
        return recCrtTs;
    }

    /**
     * TIMESTAMP(19) 默认值[0000-00-00 00:00:00] 必填<br>
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
        sb.append(", transPayId=").append(transPayId);
        sb.append(", transSeqId=").append(transSeqId);
        sb.append(", executeSeqId=").append(executeSeqId);
        sb.append(", transAmt=").append(transAmt);
        sb.append(", currency=").append(currency);
        sb.append(", transSt=").append(transSt);
        sb.append(", chnlRspCd=").append(chnlRspCd);
        sb.append(", sysTransTms=").append(sysTransTms);
        sb.append(", sendOrderId=").append(sendOrderId);
        sb.append(", transChnl=").append(transChnl);
        sb.append(", chnlActNo=").append(chnlActNo);
        sb.append(", chnlTransTms=").append(chnlTransTms);
        sb.append(", chnlTransId=").append(chnlTransId);
        sb.append(", chnlSettleDt=").append(chnlSettleDt);
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
        PayChanlPayLog other = (PayChanlPayLog) that;
        return (this.getTransPayId() == null ? other.getTransPayId() == null : this.getTransPayId().equals(other.getTransPayId()))
            && (this.getTransSeqId() == null ? other.getTransSeqId() == null : this.getTransSeqId().equals(other.getTransSeqId()))
            && (this.getExecuteSeqId() == null ? other.getExecuteSeqId() == null : this.getExecuteSeqId().equals(other.getExecuteSeqId()))
            && (this.getTransAmt() == null ? other.getTransAmt() == null : this.getTransAmt().equals(other.getTransAmt()))
            && (this.getCurrency() == null ? other.getCurrency() == null : this.getCurrency().equals(other.getCurrency()))
            && (this.getTransSt() == null ? other.getTransSt() == null : this.getTransSt().equals(other.getTransSt()))
            && (this.getChnlRspCd() == null ? other.getChnlRspCd() == null : this.getChnlRspCd().equals(other.getChnlRspCd()))
            && (this.getSysTransTms() == null ? other.getSysTransTms() == null : this.getSysTransTms().equals(other.getSysTransTms()))
            && (this.getSendOrderId() == null ? other.getSendOrderId() == null : this.getSendOrderId().equals(other.getSendOrderId()))
            && (this.getTransChnl() == null ? other.getTransChnl() == null : this.getTransChnl().equals(other.getTransChnl()))
            && (this.getChnlActNo() == null ? other.getChnlActNo() == null : this.getChnlActNo().equals(other.getChnlActNo()))
            && (this.getChnlTransTms() == null ? other.getChnlTransTms() == null : this.getChnlTransTms().equals(other.getChnlTransTms()))
            && (this.getChnlTransId() == null ? other.getChnlTransId() == null : this.getChnlTransId().equals(other.getChnlTransId()))
            && (this.getChnlSettleDt() == null ? other.getChnlSettleDt() == null : this.getChnlSettleDt().equals(other.getChnlSettleDt()))
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
        result = prime * result + ((getTransPayId() == null) ? 0 : getTransPayId().hashCode());
        result = prime * result + ((getTransSeqId() == null) ? 0 : getTransSeqId().hashCode());
        result = prime * result + ((getExecuteSeqId() == null) ? 0 : getExecuteSeqId().hashCode());
        result = prime * result + ((getTransAmt() == null) ? 0 : getTransAmt().hashCode());
        result = prime * result + ((getCurrency() == null) ? 0 : getCurrency().hashCode());
        result = prime * result + ((getTransSt() == null) ? 0 : getTransSt().hashCode());
        result = prime * result + ((getChnlRspCd() == null) ? 0 : getChnlRspCd().hashCode());
        result = prime * result + ((getSysTransTms() == null) ? 0 : getSysTransTms().hashCode());
        result = prime * result + ((getSendOrderId() == null) ? 0 : getSendOrderId().hashCode());
        result = prime * result + ((getTransChnl() == null) ? 0 : getTransChnl().hashCode());
        result = prime * result + ((getChnlActNo() == null) ? 0 : getChnlActNo().hashCode());
        result = prime * result + ((getChnlTransTms() == null) ? 0 : getChnlTransTms().hashCode());
        result = prime * result + ((getChnlTransId() == null) ? 0 : getChnlTransId().hashCode());
        result = prime * result + ((getChnlSettleDt() == null) ? 0 : getChnlSettleDt().hashCode());
        result = prime * result + ((getRecCrtTs() == null) ? 0 : getRecCrtTs().hashCode());
        result = prime * result + ((getRecCrtOprId() == null) ? 0 : getRecCrtOprId().hashCode());
        result = prime * result + ((getRecUpdTs() == null) ? 0 : getRecUpdTs().hashCode());
        result = prime * result + ((getRecUpdOprId() == null) ? 0 : getRecUpdOprId().hashCode());
        result = prime * result + ((getRecUpdTransId() == null) ? 0 : getRecUpdTransId().hashCode());
        return result;
    }
}