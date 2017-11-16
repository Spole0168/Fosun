package com.fosun.data.dataTask.model;

import java.io.Serializable;
import java.util.Date;

public class DataCreditDatilOutlineInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * CHAR(32) 必填<br>
     * 主键
     */
    private String id;

    /**
     * VARCHAR(300)<br>
     * 报告编号id
     */
    private String creditReportId;

    /**
     * VARCHAR(20)<br>
     * 资产处置笔数
     */
    private String assetDisposalNum;

    /**
     * VARCHAR(20)<br>
     * 保证人代偿数
     */
    private String assurerNum;

    /**
     * VARCHAR(20)<br>
     * 呆账笔数
     */
    private String badDebtsNum;

    /**
     * VARCHAR(20)<br>
     * 住房贷款数目
     */
    private String houseLoanNum;

    /**
     * VARCHAR(20)<br>
     * 其他贷款数目
     */
    private String otherLoanNum;

    /**
     * VARCHAR(20)<br>
     * 为他人担保笔数
     */
    private String guaranteeOtherNum;

    /**
     * VARCHAR(20)<br>
     * 不良贷款笔数
     */
    private String badLoansTotalNum;

    /**
     * VARCHAR(20)<br>
     * 未结清贷款信息汇总-贷款法人机构数
     */
    private String unclearedLoanLegalpersonTotal;

    /**
     * VARCHAR(20)<br>
     * 未结清贷款信息汇总-贷款机构数
     */
    private String unclearedLoanBranchTotal;

    /**
     * VARCHAR(20)<br>
     * 未结清贷款信息汇总-贷款总笔数
     */
    private String unclearedLoanNumTotal;

    /**
     * VARCHAR(22)<br>
     * 未结清贷款信息汇总-贷款合同总额
     */
    private String unclearedLoanSignlamountTotal;

    /**
     * VARCHAR(22)<br>
     * 未结清贷款信息汇总-贷款余额
     */
    private String unclearedLoanLeftamountTotal;

    /**
     * VARCHAR(22)<br>
     * 未结清贷款信息汇总-最近5个月平均应还款额
     */
    private String unclearedLoanLast5mouthPayAvg;

    /**
     * VARCHAR(20)<br>
     * 未销户贷记卡信息汇总-发卡法人机构数
     */
    private String noCancellationCreditLegalpersonTotal;

    /**
     * VARCHAR(20)<br>
     * 未销户贷记卡信息汇总-发卡机构数
     */
    private String noCancellationCreditBranchTotal;

    /**
     * VARCHAR(20)<br>
     * 未销户贷记卡信息汇总-账户数
     */
    private String noCancellationCreditAccountTotal;

    /**
     * VARCHAR(22)<br>
     * 未销户贷记卡信息汇总-授信总额
     */
    private String noCancellationCreditAmountTotal;

    /**
     * VARCHAR(22)<br>
     * 未销户贷记卡信息汇总-单家行最高授信额
     */
    private String noCancellationCreditSingleMaxAmountTotal;

    /**
     * VARCHAR(22)<br>
     * 未销户贷记卡信息汇总-单家行最低授信额
     */
    private String noCancellationCreditSingleMinAmountTotal;

    /**
     * VARCHAR(22)<br>
     * 未销户贷记卡信息汇总-已用额度
     */
    private String noCancellationCreditUsedAmountTotal;

    /**
     * VARCHAR(22)<br>
     * 未销户贷记卡信息汇总-最近6个月平均使用额度
     */
    private String noCancellationCreditLast6mouthPayAvg;

    /**
     * CHAR(1) 默认值[0] 必填<br>
     * 逻辑删除标志，0：未删除，1：已删除 
     */
    private String flag;

    /**
     * INTEGER(10)<br>
     * 乐观锁
     */
    private Integer version;

    /**
     * VARCHAR(50)<br>
     * 创建者
     */
    private String createdBy;

    /**
     * TIMESTAMP(19)<br>
     * 创建时间
     */
    private Date createdDt;

    /**
     * VARCHAR(50)<br>
     * 修改者
     */
    private String updatetimedBy;

    /**
     * TIMESTAMP(19)<br>
     * 修改时间
     */
    private Date updatetimedDt;

    /**
     * CHAR(32) 必填<br>
     * 获得 主键
     */
    public String getId() {
        return id;
    }

    /**
     * CHAR(32) 必填<br>
     * 设置 主键
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * VARCHAR(300)<br>
     * 获得 报告编号id
     */
    public String getCreditReportId() {
        return creditReportId;
    }

    /**
     * VARCHAR(300)<br>
     * 设置 报告编号id
     */
    public void setCreditReportId(String creditReportId) {
        this.creditReportId = creditReportId == null ? null : creditReportId.trim();
    }

    /**
     * VARCHAR(20)<br>
     * 获得 资产处置笔数
     */
    public String getAssetDisposalNum() {
        return assetDisposalNum;
    }

    /**
     * VARCHAR(20)<br>
     * 设置 资产处置笔数
     */
    public void setAssetDisposalNum(String assetDisposalNum) {
        this.assetDisposalNum = assetDisposalNum == null ? null : assetDisposalNum.trim();
    }

    /**
     * VARCHAR(20)<br>
     * 获得 保证人代偿数
     */
    public String getAssurerNum() {
        return assurerNum;
    }

    /**
     * VARCHAR(20)<br>
     * 设置 保证人代偿数
     */
    public void setAssurerNum(String assurerNum) {
        this.assurerNum = assurerNum == null ? null : assurerNum.trim();
    }

    /**
     * VARCHAR(20)<br>
     * 获得 呆账笔数
     */
    public String getBadDebtsNum() {
        return badDebtsNum;
    }

    /**
     * VARCHAR(20)<br>
     * 设置 呆账笔数
     */
    public void setBadDebtsNum(String badDebtsNum) {
        this.badDebtsNum = badDebtsNum == null ? null : badDebtsNum.trim();
    }

    /**
     * VARCHAR(20)<br>
     * 获得 住房贷款数目
     */
    public String getHouseLoanNum() {
        return houseLoanNum;
    }

    /**
     * VARCHAR(20)<br>
     * 设置 住房贷款数目
     */
    public void setHouseLoanNum(String houseLoanNum) {
        this.houseLoanNum = houseLoanNum == null ? null : houseLoanNum.trim();
    }

    /**
     * VARCHAR(20)<br>
     * 获得 其他贷款数目
     */
    public String getOtherLoanNum() {
        return otherLoanNum;
    }

    /**
     * VARCHAR(20)<br>
     * 设置 其他贷款数目
     */
    public void setOtherLoanNum(String otherLoanNum) {
        this.otherLoanNum = otherLoanNum == null ? null : otherLoanNum.trim();
    }

    /**
     * VARCHAR(20)<br>
     * 获得 为他人担保笔数
     */
    public String getGuaranteeOtherNum() {
        return guaranteeOtherNum;
    }

    /**
     * VARCHAR(20)<br>
     * 设置 为他人担保笔数
     */
    public void setGuaranteeOtherNum(String guaranteeOtherNum) {
        this.guaranteeOtherNum = guaranteeOtherNum == null ? null : guaranteeOtherNum.trim();
    }

    /**
     * VARCHAR(20)<br>
     * 获得 不良贷款笔数
     */
    public String getBadLoansTotalNum() {
        return badLoansTotalNum;
    }

    /**
     * VARCHAR(20)<br>
     * 设置 不良贷款笔数
     */
    public void setBadLoansTotalNum(String badLoansTotalNum) {
        this.badLoansTotalNum = badLoansTotalNum == null ? null : badLoansTotalNum.trim();
    }

    /**
     * VARCHAR(20)<br>
     * 获得 未结清贷款信息汇总-贷款法人机构数
     */
    public String getUnclearedLoanLegalpersonTotal() {
        return unclearedLoanLegalpersonTotal;
    }

    /**
     * VARCHAR(20)<br>
     * 设置 未结清贷款信息汇总-贷款法人机构数
     */
    public void setUnclearedLoanLegalpersonTotal(String unclearedLoanLegalpersonTotal) {
        this.unclearedLoanLegalpersonTotal = unclearedLoanLegalpersonTotal == null ? null : unclearedLoanLegalpersonTotal.trim();
    }

    /**
     * VARCHAR(20)<br>
     * 获得 未结清贷款信息汇总-贷款机构数
     */
    public String getUnclearedLoanBranchTotal() {
        return unclearedLoanBranchTotal;
    }

    /**
     * VARCHAR(20)<br>
     * 设置 未结清贷款信息汇总-贷款机构数
     */
    public void setUnclearedLoanBranchTotal(String unclearedLoanBranchTotal) {
        this.unclearedLoanBranchTotal = unclearedLoanBranchTotal == null ? null : unclearedLoanBranchTotal.trim();
    }

    /**
     * VARCHAR(20)<br>
     * 获得 未结清贷款信息汇总-贷款总笔数
     */
    public String getUnclearedLoanNumTotal() {
        return unclearedLoanNumTotal;
    }

    /**
     * VARCHAR(20)<br>
     * 设置 未结清贷款信息汇总-贷款总笔数
     */
    public void setUnclearedLoanNumTotal(String unclearedLoanNumTotal) {
        this.unclearedLoanNumTotal = unclearedLoanNumTotal == null ? null : unclearedLoanNumTotal.trim();
    }

    /**
     * VARCHAR(22)<br>
     * 获得 未结清贷款信息汇总-贷款合同总额
     */
    public String getUnclearedLoanSignlamountTotal() {
        return unclearedLoanSignlamountTotal;
    }

    /**
     * VARCHAR(22)<br>
     * 设置 未结清贷款信息汇总-贷款合同总额
     */
    public void setUnclearedLoanSignlamountTotal(String unclearedLoanSignlamountTotal) {
        this.unclearedLoanSignlamountTotal = unclearedLoanSignlamountTotal == null ? null : unclearedLoanSignlamountTotal.trim();
    }

    /**
     * VARCHAR(22)<br>
     * 获得 未结清贷款信息汇总-贷款余额
     */
    public String getUnclearedLoanLeftamountTotal() {
        return unclearedLoanLeftamountTotal;
    }

    /**
     * VARCHAR(22)<br>
     * 设置 未结清贷款信息汇总-贷款余额
     */
    public void setUnclearedLoanLeftamountTotal(String unclearedLoanLeftamountTotal) {
        this.unclearedLoanLeftamountTotal = unclearedLoanLeftamountTotal == null ? null : unclearedLoanLeftamountTotal.trim();
    }

    /**
     * VARCHAR(22)<br>
     * 获得 未结清贷款信息汇总-最近5个月平均应还款额
     */
    public String getUnclearedLoanLast5mouthPayAvg() {
        return unclearedLoanLast5mouthPayAvg;
    }

    /**
     * VARCHAR(22)<br>
     * 设置 未结清贷款信息汇总-最近5个月平均应还款额
     */
    public void setUnclearedLoanLast5mouthPayAvg(String unclearedLoanLast5mouthPayAvg) {
        this.unclearedLoanLast5mouthPayAvg = unclearedLoanLast5mouthPayAvg == null ? null : unclearedLoanLast5mouthPayAvg.trim();
    }

    /**
     * VARCHAR(20)<br>
     * 获得 未销户贷记卡信息汇总-发卡法人机构数
     */
    public String getNoCancellationCreditLegalpersonTotal() {
        return noCancellationCreditLegalpersonTotal;
    }

    /**
     * VARCHAR(20)<br>
     * 设置 未销户贷记卡信息汇总-发卡法人机构数
     */
    public void setNoCancellationCreditLegalpersonTotal(String noCancellationCreditLegalpersonTotal) {
        this.noCancellationCreditLegalpersonTotal = noCancellationCreditLegalpersonTotal == null ? null : noCancellationCreditLegalpersonTotal.trim();
    }

    /**
     * VARCHAR(20)<br>
     * 获得 未销户贷记卡信息汇总-发卡机构数
     */
    public String getNoCancellationCreditBranchTotal() {
        return noCancellationCreditBranchTotal;
    }

    /**
     * VARCHAR(20)<br>
     * 设置 未销户贷记卡信息汇总-发卡机构数
     */
    public void setNoCancellationCreditBranchTotal(String noCancellationCreditBranchTotal) {
        this.noCancellationCreditBranchTotal = noCancellationCreditBranchTotal == null ? null : noCancellationCreditBranchTotal.trim();
    }

    /**
     * VARCHAR(20)<br>
     * 获得 未销户贷记卡信息汇总-账户数
     */
    public String getNoCancellationCreditAccountTotal() {
        return noCancellationCreditAccountTotal;
    }

    /**
     * VARCHAR(20)<br>
     * 设置 未销户贷记卡信息汇总-账户数
     */
    public void setNoCancellationCreditAccountTotal(String noCancellationCreditAccountTotal) {
        this.noCancellationCreditAccountTotal = noCancellationCreditAccountTotal == null ? null : noCancellationCreditAccountTotal.trim();
    }

    /**
     * VARCHAR(22)<br>
     * 获得 未销户贷记卡信息汇总-授信总额
     */
    public String getNoCancellationCreditAmountTotal() {
        return noCancellationCreditAmountTotal;
    }

    /**
     * VARCHAR(22)<br>
     * 设置 未销户贷记卡信息汇总-授信总额
     */
    public void setNoCancellationCreditAmountTotal(String noCancellationCreditAmountTotal) {
        this.noCancellationCreditAmountTotal = noCancellationCreditAmountTotal == null ? null : noCancellationCreditAmountTotal.trim();
    }

    /**
     * VARCHAR(22)<br>
     * 获得 未销户贷记卡信息汇总-单家行最高授信额
     */
    public String getNoCancellationCreditSingleMaxAmountTotal() {
        return noCancellationCreditSingleMaxAmountTotal;
    }

    /**
     * VARCHAR(22)<br>
     * 设置 未销户贷记卡信息汇总-单家行最高授信额
     */
    public void setNoCancellationCreditSingleMaxAmountTotal(String noCancellationCreditSingleMaxAmountTotal) {
        this.noCancellationCreditSingleMaxAmountTotal = noCancellationCreditSingleMaxAmountTotal == null ? null : noCancellationCreditSingleMaxAmountTotal.trim();
    }

    /**
     * VARCHAR(22)<br>
     * 获得 未销户贷记卡信息汇总-单家行最低授信额
     */
    public String getNoCancellationCreditSingleMinAmountTotal() {
        return noCancellationCreditSingleMinAmountTotal;
    }

    /**
     * VARCHAR(22)<br>
     * 设置 未销户贷记卡信息汇总-单家行最低授信额
     */
    public void setNoCancellationCreditSingleMinAmountTotal(String noCancellationCreditSingleMinAmountTotal) {
        this.noCancellationCreditSingleMinAmountTotal = noCancellationCreditSingleMinAmountTotal == null ? null : noCancellationCreditSingleMinAmountTotal.trim();
    }

    /**
     * VARCHAR(22)<br>
     * 获得 未销户贷记卡信息汇总-已用额度
     */
    public String getNoCancellationCreditUsedAmountTotal() {
        return noCancellationCreditUsedAmountTotal;
    }

    /**
     * VARCHAR(22)<br>
     * 设置 未销户贷记卡信息汇总-已用额度
     */
    public void setNoCancellationCreditUsedAmountTotal(String noCancellationCreditUsedAmountTotal) {
        this.noCancellationCreditUsedAmountTotal = noCancellationCreditUsedAmountTotal == null ? null : noCancellationCreditUsedAmountTotal.trim();
    }

    /**
     * VARCHAR(22)<br>
     * 获得 未销户贷记卡信息汇总-最近6个月平均使用额度
     */
    public String getNoCancellationCreditLast6mouthPayAvg() {
        return noCancellationCreditLast6mouthPayAvg;
    }

    /**
     * VARCHAR(22)<br>
     * 设置 未销户贷记卡信息汇总-最近6个月平均使用额度
     */
    public void setNoCancellationCreditLast6mouthPayAvg(String noCancellationCreditLast6mouthPayAvg) {
        this.noCancellationCreditLast6mouthPayAvg = noCancellationCreditLast6mouthPayAvg == null ? null : noCancellationCreditLast6mouthPayAvg.trim();
    }

    /**
     * CHAR(1) 默认值[0] 必填<br>
     * 获得 逻辑删除标志，0：未删除，1：已删除 
     */
    public String getFlag() {
        return flag;
    }

    /**
     * CHAR(1) 默认值[0] 必填<br>
     * 设置 逻辑删除标志，0：未删除，1：已删除 
     */
    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    /**
     * INTEGER(10)<br>
     * 获得 乐观锁
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * INTEGER(10)<br>
     * 设置 乐观锁
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * VARCHAR(50)<br>
     * 获得 创建者
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * VARCHAR(50)<br>
     * 设置 创建者
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    /**
     * TIMESTAMP(19)<br>
     * 获得 创建时间
     */
    public Date getCreatedDt() {
        return createdDt;
    }

    /**
     * TIMESTAMP(19)<br>
     * 设置 创建时间
     */
    public void setCreatedDt(Date createdDt) {
        this.createdDt = createdDt;
    }

    /**
     * VARCHAR(50)<br>
     * 获得 修改者
     */
    public String getUpdatetimedBy() {
        return updatetimedBy;
    }

    /**
     * VARCHAR(50)<br>
     * 设置 修改者
     */
    public void setUpdatetimedBy(String updatetimedBy) {
        this.updatetimedBy = updatetimedBy == null ? null : updatetimedBy.trim();
    }

    /**
     * TIMESTAMP(19)<br>
     * 获得 修改时间
     */
    public Date getUpdatetimedDt() {
        return updatetimedDt;
    }

    /**
     * TIMESTAMP(19)<br>
     * 设置 修改时间
     */
    public void setUpdatetimedDt(Date updatetimedDt) {
        this.updatetimedDt = updatetimedDt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", creditReportId=").append(creditReportId);
        sb.append(", assetDisposalNum=").append(assetDisposalNum);
        sb.append(", assurerNum=").append(assurerNum);
        sb.append(", badDebtsNum=").append(badDebtsNum);
        sb.append(", houseLoanNum=").append(houseLoanNum);
        sb.append(", otherLoanNum=").append(otherLoanNum);
        sb.append(", guaranteeOtherNum=").append(guaranteeOtherNum);
        sb.append(", badLoansTotalNum=").append(badLoansTotalNum);
        sb.append(", unclearedLoanLegalpersonTotal=").append(unclearedLoanLegalpersonTotal);
        sb.append(", unclearedLoanBranchTotal=").append(unclearedLoanBranchTotal);
        sb.append(", unclearedLoanNumTotal=").append(unclearedLoanNumTotal);
        sb.append(", unclearedLoanSignlamountTotal=").append(unclearedLoanSignlamountTotal);
        sb.append(", unclearedLoanLeftamountTotal=").append(unclearedLoanLeftamountTotal);
        sb.append(", unclearedLoanLast5mouthPayAvg=").append(unclearedLoanLast5mouthPayAvg);
        sb.append(", noCancellationCreditLegalpersonTotal=").append(noCancellationCreditLegalpersonTotal);
        sb.append(", noCancellationCreditBranchTotal=").append(noCancellationCreditBranchTotal);
        sb.append(", noCancellationCreditAccountTotal=").append(noCancellationCreditAccountTotal);
        sb.append(", noCancellationCreditAmountTotal=").append(noCancellationCreditAmountTotal);
        sb.append(", noCancellationCreditSingleMaxAmountTotal=").append(noCancellationCreditSingleMaxAmountTotal);
        sb.append(", noCancellationCreditSingleMinAmountTotal=").append(noCancellationCreditSingleMinAmountTotal);
        sb.append(", noCancellationCreditUsedAmountTotal=").append(noCancellationCreditUsedAmountTotal);
        sb.append(", noCancellationCreditLast6mouthPayAvg=").append(noCancellationCreditLast6mouthPayAvg);
        sb.append(", flag=").append(flag);
        sb.append(", version=").append(version);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", createdDt=").append(createdDt);
        sb.append(", updatetimedBy=").append(updatetimedBy);
        sb.append(", updatetimedDt=").append(updatetimedDt);
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
        DataCreditDatilOutlineInfo other = (DataCreditDatilOutlineInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreditReportId() == null ? other.getCreditReportId() == null : this.getCreditReportId().equals(other.getCreditReportId()))
            && (this.getAssetDisposalNum() == null ? other.getAssetDisposalNum() == null : this.getAssetDisposalNum().equals(other.getAssetDisposalNum()))
            && (this.getAssurerNum() == null ? other.getAssurerNum() == null : this.getAssurerNum().equals(other.getAssurerNum()))
            && (this.getBadDebtsNum() == null ? other.getBadDebtsNum() == null : this.getBadDebtsNum().equals(other.getBadDebtsNum()))
            && (this.getHouseLoanNum() == null ? other.getHouseLoanNum() == null : this.getHouseLoanNum().equals(other.getHouseLoanNum()))
            && (this.getOtherLoanNum() == null ? other.getOtherLoanNum() == null : this.getOtherLoanNum().equals(other.getOtherLoanNum()))
            && (this.getGuaranteeOtherNum() == null ? other.getGuaranteeOtherNum() == null : this.getGuaranteeOtherNum().equals(other.getGuaranteeOtherNum()))
            && (this.getBadLoansTotalNum() == null ? other.getBadLoansTotalNum() == null : this.getBadLoansTotalNum().equals(other.getBadLoansTotalNum()))
            && (this.getUnclearedLoanLegalpersonTotal() == null ? other.getUnclearedLoanLegalpersonTotal() == null : this.getUnclearedLoanLegalpersonTotal().equals(other.getUnclearedLoanLegalpersonTotal()))
            && (this.getUnclearedLoanBranchTotal() == null ? other.getUnclearedLoanBranchTotal() == null : this.getUnclearedLoanBranchTotal().equals(other.getUnclearedLoanBranchTotal()))
            && (this.getUnclearedLoanNumTotal() == null ? other.getUnclearedLoanNumTotal() == null : this.getUnclearedLoanNumTotal().equals(other.getUnclearedLoanNumTotal()))
            && (this.getUnclearedLoanSignlamountTotal() == null ? other.getUnclearedLoanSignlamountTotal() == null : this.getUnclearedLoanSignlamountTotal().equals(other.getUnclearedLoanSignlamountTotal()))
            && (this.getUnclearedLoanLeftamountTotal() == null ? other.getUnclearedLoanLeftamountTotal() == null : this.getUnclearedLoanLeftamountTotal().equals(other.getUnclearedLoanLeftamountTotal()))
            && (this.getUnclearedLoanLast5mouthPayAvg() == null ? other.getUnclearedLoanLast5mouthPayAvg() == null : this.getUnclearedLoanLast5mouthPayAvg().equals(other.getUnclearedLoanLast5mouthPayAvg()))
            && (this.getNoCancellationCreditLegalpersonTotal() == null ? other.getNoCancellationCreditLegalpersonTotal() == null : this.getNoCancellationCreditLegalpersonTotal().equals(other.getNoCancellationCreditLegalpersonTotal()))
            && (this.getNoCancellationCreditBranchTotal() == null ? other.getNoCancellationCreditBranchTotal() == null : this.getNoCancellationCreditBranchTotal().equals(other.getNoCancellationCreditBranchTotal()))
            && (this.getNoCancellationCreditAccountTotal() == null ? other.getNoCancellationCreditAccountTotal() == null : this.getNoCancellationCreditAccountTotal().equals(other.getNoCancellationCreditAccountTotal()))
            && (this.getNoCancellationCreditAmountTotal() == null ? other.getNoCancellationCreditAmountTotal() == null : this.getNoCancellationCreditAmountTotal().equals(other.getNoCancellationCreditAmountTotal()))
            && (this.getNoCancellationCreditSingleMaxAmountTotal() == null ? other.getNoCancellationCreditSingleMaxAmountTotal() == null : this.getNoCancellationCreditSingleMaxAmountTotal().equals(other.getNoCancellationCreditSingleMaxAmountTotal()))
            && (this.getNoCancellationCreditSingleMinAmountTotal() == null ? other.getNoCancellationCreditSingleMinAmountTotal() == null : this.getNoCancellationCreditSingleMinAmountTotal().equals(other.getNoCancellationCreditSingleMinAmountTotal()))
            && (this.getNoCancellationCreditUsedAmountTotal() == null ? other.getNoCancellationCreditUsedAmountTotal() == null : this.getNoCancellationCreditUsedAmountTotal().equals(other.getNoCancellationCreditUsedAmountTotal()))
            && (this.getNoCancellationCreditLast6mouthPayAvg() == null ? other.getNoCancellationCreditLast6mouthPayAvg() == null : this.getNoCancellationCreditLast6mouthPayAvg().equals(other.getNoCancellationCreditLast6mouthPayAvg()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getCreatedBy() == null ? other.getCreatedBy() == null : this.getCreatedBy().equals(other.getCreatedBy()))
            && (this.getCreatedDt() == null ? other.getCreatedDt() == null : this.getCreatedDt().equals(other.getCreatedDt()))
            && (this.getUpdatetimedBy() == null ? other.getUpdatetimedBy() == null : this.getUpdatetimedBy().equals(other.getUpdatetimedBy()))
            && (this.getUpdatetimedDt() == null ? other.getUpdatetimedDt() == null : this.getUpdatetimedDt().equals(other.getUpdatetimedDt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCreditReportId() == null) ? 0 : getCreditReportId().hashCode());
        result = prime * result + ((getAssetDisposalNum() == null) ? 0 : getAssetDisposalNum().hashCode());
        result = prime * result + ((getAssurerNum() == null) ? 0 : getAssurerNum().hashCode());
        result = prime * result + ((getBadDebtsNum() == null) ? 0 : getBadDebtsNum().hashCode());
        result = prime * result + ((getHouseLoanNum() == null) ? 0 : getHouseLoanNum().hashCode());
        result = prime * result + ((getOtherLoanNum() == null) ? 0 : getOtherLoanNum().hashCode());
        result = prime * result + ((getGuaranteeOtherNum() == null) ? 0 : getGuaranteeOtherNum().hashCode());
        result = prime * result + ((getBadLoansTotalNum() == null) ? 0 : getBadLoansTotalNum().hashCode());
        result = prime * result + ((getUnclearedLoanLegalpersonTotal() == null) ? 0 : getUnclearedLoanLegalpersonTotal().hashCode());
        result = prime * result + ((getUnclearedLoanBranchTotal() == null) ? 0 : getUnclearedLoanBranchTotal().hashCode());
        result = prime * result + ((getUnclearedLoanNumTotal() == null) ? 0 : getUnclearedLoanNumTotal().hashCode());
        result = prime * result + ((getUnclearedLoanSignlamountTotal() == null) ? 0 : getUnclearedLoanSignlamountTotal().hashCode());
        result = prime * result + ((getUnclearedLoanLeftamountTotal() == null) ? 0 : getUnclearedLoanLeftamountTotal().hashCode());
        result = prime * result + ((getUnclearedLoanLast5mouthPayAvg() == null) ? 0 : getUnclearedLoanLast5mouthPayAvg().hashCode());
        result = prime * result + ((getNoCancellationCreditLegalpersonTotal() == null) ? 0 : getNoCancellationCreditLegalpersonTotal().hashCode());
        result = prime * result + ((getNoCancellationCreditBranchTotal() == null) ? 0 : getNoCancellationCreditBranchTotal().hashCode());
        result = prime * result + ((getNoCancellationCreditAccountTotal() == null) ? 0 : getNoCancellationCreditAccountTotal().hashCode());
        result = prime * result + ((getNoCancellationCreditAmountTotal() == null) ? 0 : getNoCancellationCreditAmountTotal().hashCode());
        result = prime * result + ((getNoCancellationCreditSingleMaxAmountTotal() == null) ? 0 : getNoCancellationCreditSingleMaxAmountTotal().hashCode());
        result = prime * result + ((getNoCancellationCreditSingleMinAmountTotal() == null) ? 0 : getNoCancellationCreditSingleMinAmountTotal().hashCode());
        result = prime * result + ((getNoCancellationCreditUsedAmountTotal() == null) ? 0 : getNoCancellationCreditUsedAmountTotal().hashCode());
        result = prime * result + ((getNoCancellationCreditLast6mouthPayAvg() == null) ? 0 : getNoCancellationCreditLast6mouthPayAvg().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        result = prime * result + ((getCreatedDt() == null) ? 0 : getCreatedDt().hashCode());
        result = prime * result + ((getUpdatetimedBy() == null) ? 0 : getUpdatetimedBy().hashCode());
        result = prime * result + ((getUpdatetimedDt() == null) ? 0 : getUpdatetimedDt().hashCode());
        return result;
    }
}