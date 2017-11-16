package com.fosun.paymng.model;

import java.io.Serializable;
import java.util.Date;

public class PayMchntTransLog implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * VARCHAR(36) 必填<br>
     * 交易序列号
     */
    private String transSeqId;

    /**
     * CHAR(4) 必填<br>
     * 交易代码;1001-银行卡鉴权;1002-代扣签约;1003-转账卡签约（登记）;1101-订单查询;1102-转账卡查询;1103-转账到账查询;1201--转账卡删除;1301-商户对账文件下载;2001-代扣;2010-代付（提现）;2020-退款;3001-代扣签约通知;3002-代扣通知;3003-转账到账通知;3004-商户对账文件通知;
     */
    private String transCd;

    /**
     * CHAR(5)<br>
     * 交易版本号，默认1.0.0
     */
    private String transVersion;

    /**
     * CHAR(10) 必填<br>
     * 商户代码
     */
    private String mchntId;

    /**
     * CHAR(8) 必填<br>
     * 商户交易日期,YYYYMMDD
     */
    private String mchntTransDt;

    /**
     * CHAR(6)<br>
     * 商户交易日期时间,HHMMSS 
     */
    private String mchntTransTms;

    /**
     * VARCHAR(36) 必填<br>
     * 商户请求流水号，商户内唯一
     */
    private String mchntTransId;

    /**
     * CHAR(1)<br>
     * 银行账户类型 1：个人  2：企业
     */
    private String bankAccTp;

    /**
     * VARCHAR(32)<br>
     * 银行账户
     */
    private String bankAcctNo;

    /**
     * VARCHAR(128)<br>
     * 银行账户开户姓名
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
     * VARCHAR(64)<br>
     * 开户行名称
     */
    private String corpAccBankNm;

    /**
     * VARCHAR(32)<br>
     * 客户号
     */
    private String custId;

    /**
     * VARCHAR(32)<br>
     * 合同号
     */
    private String contractNo;

    /**
     * DECIMAL(12)<br>
     * 交易金额,以分为单位
     */
    private Long transAmt;

    /**
     * CHAR(3)<br>
     * 交易币种，固定156
     */
    private String currency;

    /**
     * DECIMAL(12)<br>
     * 实际完成金额,以分为单位
     */
    private Long trueAmt;

    /**
     * VARCHAR(64)<br>
     * 收款方开户银行名称
     */
    private String payeeBankNm;

    /**
     * VARCHAR(64)<br>
     * 收款方开户名称
     */
    private String payeeNm;

    /**
     * VARCHAR(32)<br>
     * 收款方账号
     */
    private String payeeAcc;

    /**
     * VARCHAR(36)<br>
     * 原交易流水号，本表主键
     */
    private String origTransSeqId;

    /**
     * VARCHAR(256)<br>
     * 商户前台返回URL
     */
    private String frntRetUrl;

    /**
     * VARCHAR(256)<br>
     * 商户后台返回URL
     */
    private String bgRetUrl;

    /**
     * CHAR(1)<br>
     * 交易状态
     */
    private String transSt;

    /**
     * CHAR(2)<br>
     * 商户应答码00-成功;01-处理中;02-交易失败;03-部分成功
     */
    private String mchntRspCd;

    /**
     * CHAR(4)<br>
     * 系统应答码 0000-成功;0001-处理中;0002-交易失败;0003-部分成功
     */
    private String sysRspCd;

    /**
     * TIMESTAMP(19) 默认值[CURRENT_TIMESTAMP] 必填<br>
     * 系统内部交易日期
     */
    private Date sysTransDt;

    /**
     * VARCHAR(32)<br>
     * 系统内部交易流水号
     */
    private String sysTransId;

    /**
     * CHAR(8)<br>
     * 系统清算日期
     */
    private String sysSettleDt;

    /**
     * VARCHAR(64)<br>
     * 发起IP
     */
    private String reqIp;

    /**
     * VARCHAR(256)<br>
     * 附加信息
     */
    private String msgExt;

    /**
     * TIMESTAMP(19) 默认值[0000-00-00 00:00:00] 必填<br>
     * 记录插入时间
     */
    private Date recCrtTs;

    /**
     * VARCHAR(32) 必填<br>
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
     * 获得 交易序列号
     */
    public String getTransSeqId() {
        return transSeqId;
    }

    /**
     * VARCHAR(36) 必填<br>
     * 设置 交易序列号
     */
    public void setTransSeqId(String transSeqId) {
        this.transSeqId = transSeqId == null ? null : transSeqId.trim();
    }

    /**
     * CHAR(4) 必填<br>
     * 获得 交易代码;1001-银行卡鉴权;1002-代扣签约;1003-转账卡签约（登记）;1101-订单查询;1102-转账卡查询;1103-转账到账查询;1201--转账卡删除;1301-商户对账文件下载;2001-代扣;2010-代付（提现）;2020-退款;3001-代扣签约通知;3002-代扣通知;3003-转账到账通知;3004-商户对账文件通知;
     */
    public String getTransCd() {
        return transCd;
    }

    /**
     * CHAR(4) 必填<br>
     * 设置 交易代码;1001-银行卡鉴权;1002-代扣签约;1003-转账卡签约（登记）;1101-订单查询;1102-转账卡查询;1103-转账到账查询;1201--转账卡删除;1301-商户对账文件下载;2001-代扣;2010-代付（提现）;2020-退款;3001-代扣签约通知;3002-代扣通知;3003-转账到账通知;3004-商户对账文件通知;
     */
    public void setTransCd(String transCd) {
        this.transCd = transCd == null ? null : transCd.trim();
    }

    /**
     * CHAR(5)<br>
     * 获得 交易版本号，默认1.0.0
     */
    public String getTransVersion() {
        return transVersion;
    }

    /**
     * CHAR(5)<br>
     * 设置 交易版本号，默认1.0.0
     */
    public void setTransVersion(String transVersion) {
        this.transVersion = transVersion == null ? null : transVersion.trim();
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
     * CHAR(8) 必填<br>
     * 获得 商户交易日期,YYYYMMDD
     */
    public String getMchntTransDt() {
        return mchntTransDt;
    }

    /**
     * CHAR(8) 必填<br>
     * 设置 商户交易日期,YYYYMMDD
     */
    public void setMchntTransDt(String mchntTransDt) {
        this.mchntTransDt = mchntTransDt == null ? null : mchntTransDt.trim();
    }

    /**
     * CHAR(6)<br>
     * 获得 商户交易日期时间,HHMMSS 
     */
    public String getMchntTransTms() {
        return mchntTransTms;
    }

    /**
     * CHAR(6)<br>
     * 设置 商户交易日期时间,HHMMSS 
     */
    public void setMchntTransTms(String mchntTransTms) {
        this.mchntTransTms = mchntTransTms == null ? null : mchntTransTms.trim();
    }

    /**
     * VARCHAR(36) 必填<br>
     * 获得 商户请求流水号，商户内唯一
     */
    public String getMchntTransId() {
        return mchntTransId;
    }

    /**
     * VARCHAR(36) 必填<br>
     * 设置 商户请求流水号，商户内唯一
     */
    public void setMchntTransId(String mchntTransId) {
        this.mchntTransId = mchntTransId == null ? null : mchntTransId.trim();
    }

    /**
     * CHAR(1)<br>
     * 获得 银行账户类型 1：个人  2：企业
     */
    public String getBankAccTp() {
        return bankAccTp;
    }

    /**
     * CHAR(1)<br>
     * 设置 银行账户类型 1：个人  2：企业
     */
    public void setBankAccTp(String bankAccTp) {
        this.bankAccTp = bankAccTp == null ? null : bankAccTp.trim();
    }

    /**
     * VARCHAR(32)<br>
     * 获得 银行账户
     */
    public String getBankAcctNo() {
        return bankAcctNo;
    }

    /**
     * VARCHAR(32)<br>
     * 设置 银行账户
     */
    public void setBankAcctNo(String bankAcctNo) {
        this.bankAcctNo = bankAcctNo == null ? null : bankAcctNo.trim();
    }

    /**
     * VARCHAR(128)<br>
     * 获得 银行账户开户姓名
     */
    public String getBankAcctNm() {
        return bankAcctNm;
    }

    /**
     * VARCHAR(128)<br>
     * 设置 银行账户开户姓名
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
     * VARCHAR(64)<br>
     * 获得 开户行名称
     */
    public String getCorpAccBankNm() {
        return corpAccBankNm;
    }

    /**
     * VARCHAR(64)<br>
     * 设置 开户行名称
     */
    public void setCorpAccBankNm(String corpAccBankNm) {
        this.corpAccBankNm = corpAccBankNm == null ? null : corpAccBankNm.trim();
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
     * VARCHAR(32)<br>
     * 获得 合同号
     */
    public String getContractNo() {
        return contractNo;
    }

    /**
     * VARCHAR(32)<br>
     * 设置 合同号
     */
    public void setContractNo(String contractNo) {
        this.contractNo = contractNo == null ? null : contractNo.trim();
    }

    /**
     * DECIMAL(12)<br>
     * 获得 交易金额,以分为单位
     */
    public Long getTransAmt() {
        return transAmt;
    }

    /**
     * DECIMAL(12)<br>
     * 设置 交易金额,以分为单位
     */
    public void setTransAmt(Long transAmt) {
        this.transAmt = transAmt;
    }

    /**
     * CHAR(3)<br>
     * 获得 交易币种，固定156
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * CHAR(3)<br>
     * 设置 交易币种，固定156
     */
    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    /**
     * DECIMAL(12)<br>
     * 获得 实际完成金额,以分为单位
     */
    public Long getTrueAmt() {
        return trueAmt;
    }

    /**
     * DECIMAL(12)<br>
     * 设置 实际完成金额,以分为单位
     */
    public void setTrueAmt(Long trueAmt) {
        this.trueAmt = trueAmt;
    }

    /**
     * VARCHAR(64)<br>
     * 获得 收款方开户银行名称
     */
    public String getPayeeBankNm() {
        return payeeBankNm;
    }

    /**
     * VARCHAR(64)<br>
     * 设置 收款方开户银行名称
     */
    public void setPayeeBankNm(String payeeBankNm) {
        this.payeeBankNm = payeeBankNm == null ? null : payeeBankNm.trim();
    }

    /**
     * VARCHAR(64)<br>
     * 获得 收款方开户名称
     */
    public String getPayeeNm() {
        return payeeNm;
    }

    /**
     * VARCHAR(64)<br>
     * 设置 收款方开户名称
     */
    public void setPayeeNm(String payeeNm) {
        this.payeeNm = payeeNm == null ? null : payeeNm.trim();
    }

    /**
     * VARCHAR(32)<br>
     * 获得 收款方账号
     */
    public String getPayeeAcc() {
        return payeeAcc;
    }

    /**
     * VARCHAR(32)<br>
     * 设置 收款方账号
     */
    public void setPayeeAcc(String payeeAcc) {
        this.payeeAcc = payeeAcc == null ? null : payeeAcc.trim();
    }

    /**
     * VARCHAR(36)<br>
     * 获得 原交易流水号，本表主键
     */
    public String getOrigTransSeqId() {
        return origTransSeqId;
    }

    /**
     * VARCHAR(36)<br>
     * 设置 原交易流水号，本表主键
     */
    public void setOrigTransSeqId(String origTransSeqId) {
        this.origTransSeqId = origTransSeqId == null ? null : origTransSeqId.trim();
    }

    /**
     * VARCHAR(256)<br>
     * 获得 商户前台返回URL
     */
    public String getFrntRetUrl() {
        return frntRetUrl;
    }

    /**
     * VARCHAR(256)<br>
     * 设置 商户前台返回URL
     */
    public void setFrntRetUrl(String frntRetUrl) {
        this.frntRetUrl = frntRetUrl == null ? null : frntRetUrl.trim();
    }

    /**
     * VARCHAR(256)<br>
     * 获得 商户后台返回URL
     */
    public String getBgRetUrl() {
        return bgRetUrl;
    }

    /**
     * VARCHAR(256)<br>
     * 设置 商户后台返回URL
     */
    public void setBgRetUrl(String bgRetUrl) {
        this.bgRetUrl = bgRetUrl == null ? null : bgRetUrl.trim();
    }

    /**
     * CHAR(1)<br>
     * 获得 交易状态
     */
    public String getTransSt() {
        return transSt;
    }

    /**
     * CHAR(1)<br>
     * 设置 交易状态
     */
    public void setTransSt(String transSt) {
        this.transSt = transSt == null ? null : transSt.trim();
    }

    /**
     * CHAR(2)<br>
     * 获得 商户应答码00-成功;01-处理中;02-交易失败;03-部分成功
     */
    public String getMchntRspCd() {
        return mchntRspCd;
    }

    /**
     * CHAR(2)<br>
     * 设置 商户应答码00-成功;01-处理中;02-交易失败;03-部分成功
     */
    public void setMchntRspCd(String mchntRspCd) {
        this.mchntRspCd = mchntRspCd == null ? null : mchntRspCd.trim();
    }

    /**
     * CHAR(4)<br>
     * 获得 系统应答码 0000-成功;0001-处理中;0002-交易失败;0003-部分成功
     */
    public String getSysRspCd() {
        return sysRspCd;
    }

    /**
     * CHAR(4)<br>
     * 设置 系统应答码 0000-成功;0001-处理中;0002-交易失败;0003-部分成功
     */
    public void setSysRspCd(String sysRspCd) {
        this.sysRspCd = sysRspCd == null ? null : sysRspCd.trim();
    }

    /**
     * TIMESTAMP(19) 默认值[CURRENT_TIMESTAMP] 必填<br>
     * 获得 系统内部交易日期
     */
    public Date getSysTransDt() {
        return sysTransDt;
    }

    /**
     * TIMESTAMP(19) 默认值[CURRENT_TIMESTAMP] 必填<br>
     * 设置 系统内部交易日期
     */
    public void setSysTransDt(Date sysTransDt) {
        this.sysTransDt = sysTransDt;
    }

    /**
     * VARCHAR(32)<br>
     * 获得 系统内部交易流水号
     */
    public String getSysTransId() {
        return sysTransId;
    }

    /**
     * VARCHAR(32)<br>
     * 设置 系统内部交易流水号
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
     * VARCHAR(64)<br>
     * 获得 发起IP
     */
    public String getReqIp() {
        return reqIp;
    }

    /**
     * VARCHAR(64)<br>
     * 设置 发起IP
     */
    public void setReqIp(String reqIp) {
        this.reqIp = reqIp == null ? null : reqIp.trim();
    }

    /**
     * VARCHAR(256)<br>
     * 获得 附加信息
     */
    public String getMsgExt() {
        return msgExt;
    }

    /**
     * VARCHAR(256)<br>
     * 设置 附加信息
     */
    public void setMsgExt(String msgExt) {
        this.msgExt = msgExt == null ? null : msgExt.trim();
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
     * VARCHAR(32) 必填<br>
     * 获得 记录插入操作员
     */
    public String getRecCrtOprId() {
        return recCrtOprId;
    }

    /**
     * VARCHAR(32) 必填<br>
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
        sb.append(", transSeqId=").append(transSeqId);
        sb.append(", transCd=").append(transCd);
        sb.append(", transVersion=").append(transVersion);
        sb.append(", mchntId=").append(mchntId);
        sb.append(", mchntTransDt=").append(mchntTransDt);
        sb.append(", mchntTransTms=").append(mchntTransTms);
        sb.append(", mchntTransId=").append(mchntTransId);
        sb.append(", bankAccTp=").append(bankAccTp);
        sb.append(", bankAcctNo=").append(bankAcctNo);
        sb.append(", bankAcctNm=").append(bankAcctNm);
        sb.append(", certTp=").append(certTp);
        sb.append(", certNo=").append(certNo);
        sb.append(", cardPhone=").append(cardPhone);
        sb.append(", corpAccBankNm=").append(corpAccBankNm);
        sb.append(", custId=").append(custId);
        sb.append(", contractNo=").append(contractNo);
        sb.append(", transAmt=").append(transAmt);
        sb.append(", currency=").append(currency);
        sb.append(", trueAmt=").append(trueAmt);
        sb.append(", payeeBankNm=").append(payeeBankNm);
        sb.append(", payeeNm=").append(payeeNm);
        sb.append(", payeeAcc=").append(payeeAcc);
        sb.append(", origTransSeqId=").append(origTransSeqId);
        sb.append(", frntRetUrl=").append(frntRetUrl);
        sb.append(", bgRetUrl=").append(bgRetUrl);
        sb.append(", transSt=").append(transSt);
        sb.append(", mchntRspCd=").append(mchntRspCd);
        sb.append(", sysRspCd=").append(sysRspCd);
        sb.append(", sysTransDt=").append(sysTransDt);
        sb.append(", sysTransId=").append(sysTransId);
        sb.append(", sysSettleDt=").append(sysSettleDt);
        sb.append(", reqIp=").append(reqIp);
        sb.append(", msgExt=").append(msgExt);
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
        PayMchntTransLog other = (PayMchntTransLog) that;
        return (this.getTransSeqId() == null ? other.getTransSeqId() == null : this.getTransSeqId().equals(other.getTransSeqId()))
            && (this.getTransCd() == null ? other.getTransCd() == null : this.getTransCd().equals(other.getTransCd()))
            && (this.getTransVersion() == null ? other.getTransVersion() == null : this.getTransVersion().equals(other.getTransVersion()))
            && (this.getMchntId() == null ? other.getMchntId() == null : this.getMchntId().equals(other.getMchntId()))
            && (this.getMchntTransDt() == null ? other.getMchntTransDt() == null : this.getMchntTransDt().equals(other.getMchntTransDt()))
            && (this.getMchntTransTms() == null ? other.getMchntTransTms() == null : this.getMchntTransTms().equals(other.getMchntTransTms()))
            && (this.getMchntTransId() == null ? other.getMchntTransId() == null : this.getMchntTransId().equals(other.getMchntTransId()))
            && (this.getBankAccTp() == null ? other.getBankAccTp() == null : this.getBankAccTp().equals(other.getBankAccTp()))
            && (this.getBankAcctNo() == null ? other.getBankAcctNo() == null : this.getBankAcctNo().equals(other.getBankAcctNo()))
            && (this.getBankAcctNm() == null ? other.getBankAcctNm() == null : this.getBankAcctNm().equals(other.getBankAcctNm()))
            && (this.getCertTp() == null ? other.getCertTp() == null : this.getCertTp().equals(other.getCertTp()))
            && (this.getCertNo() == null ? other.getCertNo() == null : this.getCertNo().equals(other.getCertNo()))
            && (this.getCardPhone() == null ? other.getCardPhone() == null : this.getCardPhone().equals(other.getCardPhone()))
            && (this.getCorpAccBankNm() == null ? other.getCorpAccBankNm() == null : this.getCorpAccBankNm().equals(other.getCorpAccBankNm()))
            && (this.getCustId() == null ? other.getCustId() == null : this.getCustId().equals(other.getCustId()))
            && (this.getContractNo() == null ? other.getContractNo() == null : this.getContractNo().equals(other.getContractNo()))
            && (this.getTransAmt() == null ? other.getTransAmt() == null : this.getTransAmt().equals(other.getTransAmt()))
            && (this.getCurrency() == null ? other.getCurrency() == null : this.getCurrency().equals(other.getCurrency()))
            && (this.getTrueAmt() == null ? other.getTrueAmt() == null : this.getTrueAmt().equals(other.getTrueAmt()))
            && (this.getPayeeBankNm() == null ? other.getPayeeBankNm() == null : this.getPayeeBankNm().equals(other.getPayeeBankNm()))
            && (this.getPayeeNm() == null ? other.getPayeeNm() == null : this.getPayeeNm().equals(other.getPayeeNm()))
            && (this.getPayeeAcc() == null ? other.getPayeeAcc() == null : this.getPayeeAcc().equals(other.getPayeeAcc()))
            && (this.getOrigTransSeqId() == null ? other.getOrigTransSeqId() == null : this.getOrigTransSeqId().equals(other.getOrigTransSeqId()))
            && (this.getFrntRetUrl() == null ? other.getFrntRetUrl() == null : this.getFrntRetUrl().equals(other.getFrntRetUrl()))
            && (this.getBgRetUrl() == null ? other.getBgRetUrl() == null : this.getBgRetUrl().equals(other.getBgRetUrl()))
            && (this.getTransSt() == null ? other.getTransSt() == null : this.getTransSt().equals(other.getTransSt()))
            && (this.getMchntRspCd() == null ? other.getMchntRspCd() == null : this.getMchntRspCd().equals(other.getMchntRspCd()))
            && (this.getSysRspCd() == null ? other.getSysRspCd() == null : this.getSysRspCd().equals(other.getSysRspCd()))
            && (this.getSysTransDt() == null ? other.getSysTransDt() == null : this.getSysTransDt().equals(other.getSysTransDt()))
            && (this.getSysTransId() == null ? other.getSysTransId() == null : this.getSysTransId().equals(other.getSysTransId()))
            && (this.getSysSettleDt() == null ? other.getSysSettleDt() == null : this.getSysSettleDt().equals(other.getSysSettleDt()))
            && (this.getReqIp() == null ? other.getReqIp() == null : this.getReqIp().equals(other.getReqIp()))
            && (this.getMsgExt() == null ? other.getMsgExt() == null : this.getMsgExt().equals(other.getMsgExt()))
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
        result = prime * result + ((getTransSeqId() == null) ? 0 : getTransSeqId().hashCode());
        result = prime * result + ((getTransCd() == null) ? 0 : getTransCd().hashCode());
        result = prime * result + ((getTransVersion() == null) ? 0 : getTransVersion().hashCode());
        result = prime * result + ((getMchntId() == null) ? 0 : getMchntId().hashCode());
        result = prime * result + ((getMchntTransDt() == null) ? 0 : getMchntTransDt().hashCode());
        result = prime * result + ((getMchntTransTms() == null) ? 0 : getMchntTransTms().hashCode());
        result = prime * result + ((getMchntTransId() == null) ? 0 : getMchntTransId().hashCode());
        result = prime * result + ((getBankAccTp() == null) ? 0 : getBankAccTp().hashCode());
        result = prime * result + ((getBankAcctNo() == null) ? 0 : getBankAcctNo().hashCode());
        result = prime * result + ((getBankAcctNm() == null) ? 0 : getBankAcctNm().hashCode());
        result = prime * result + ((getCertTp() == null) ? 0 : getCertTp().hashCode());
        result = prime * result + ((getCertNo() == null) ? 0 : getCertNo().hashCode());
        result = prime * result + ((getCardPhone() == null) ? 0 : getCardPhone().hashCode());
        result = prime * result + ((getCorpAccBankNm() == null) ? 0 : getCorpAccBankNm().hashCode());
        result = prime * result + ((getCustId() == null) ? 0 : getCustId().hashCode());
        result = prime * result + ((getContractNo() == null) ? 0 : getContractNo().hashCode());
        result = prime * result + ((getTransAmt() == null) ? 0 : getTransAmt().hashCode());
        result = prime * result + ((getCurrency() == null) ? 0 : getCurrency().hashCode());
        result = prime * result + ((getTrueAmt() == null) ? 0 : getTrueAmt().hashCode());
        result = prime * result + ((getPayeeBankNm() == null) ? 0 : getPayeeBankNm().hashCode());
        result = prime * result + ((getPayeeNm() == null) ? 0 : getPayeeNm().hashCode());
        result = prime * result + ((getPayeeAcc() == null) ? 0 : getPayeeAcc().hashCode());
        result = prime * result + ((getOrigTransSeqId() == null) ? 0 : getOrigTransSeqId().hashCode());
        result = prime * result + ((getFrntRetUrl() == null) ? 0 : getFrntRetUrl().hashCode());
        result = prime * result + ((getBgRetUrl() == null) ? 0 : getBgRetUrl().hashCode());
        result = prime * result + ((getTransSt() == null) ? 0 : getTransSt().hashCode());
        result = prime * result + ((getMchntRspCd() == null) ? 0 : getMchntRspCd().hashCode());
        result = prime * result + ((getSysRspCd() == null) ? 0 : getSysRspCd().hashCode());
        result = prime * result + ((getSysTransDt() == null) ? 0 : getSysTransDt().hashCode());
        result = prime * result + ((getSysTransId() == null) ? 0 : getSysTransId().hashCode());
        result = prime * result + ((getSysSettleDt() == null) ? 0 : getSysSettleDt().hashCode());
        result = prime * result + ((getReqIp() == null) ? 0 : getReqIp().hashCode());
        result = prime * result + ((getMsgExt() == null) ? 0 : getMsgExt().hashCode());
        result = prime * result + ((getRecCrtTs() == null) ? 0 : getRecCrtTs().hashCode());
        result = prime * result + ((getRecCrtOprId() == null) ? 0 : getRecCrtOprId().hashCode());
        result = prime * result + ((getRecUpdTs() == null) ? 0 : getRecUpdTs().hashCode());
        result = prime * result + ((getRecUpdOprId() == null) ? 0 : getRecUpdOprId().hashCode());
        result = prime * result + ((getRecUpdTransId() == null) ? 0 : getRecUpdTransId().hashCode());
        return result;
    }
}