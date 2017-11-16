package com.fosun.data.dataTask.model;

import java.io.Serializable;
import java.util.Date;

public class DataCreditBriefOutlineInfo implements Serializable {
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
     * VARCHAR(50)<br>
     * 报告类型：0-简版；1-详版
     */
    private String creditReportType;

    /**
     * VARCHAR(20)<br>
     * 信息概要-发生过逾期的账户数--资产处置笔数
     */
    private String overdueAssetDisposalNum;

    /**
     * VARCHAR(20)<br>
     * 信息概要-发生过逾期的账户数--保证人代偿数
     */
    private String overdueAssurerNum;

    /**
     * VARCHAR(20)<br>
     * 信息概要-账户数-信用卡数
     */
    private String creditNum;

    /**
     * VARCHAR(20)<br>
     * 信息概要-账户数-住房贷款数目
     */
    private String houseLoanNum;

    /**
     * VARCHAR(20)<br>
     * 信息概要-账户数-其他贷款数目
     */
    private String otherLoanNum;

    /**
     * VARCHAR(20)<br>
     * 信息概要-未结清/未销户账户数--信用卡数
     */
    private String unclearedCreditNum;

    /**
     * VARCHAR(20)<br>
     * 信息概要-未结清/未销户账户数--住房贷款数目
     */
    private String unclearedHouseLoanNum;

    /**
     * VARCHAR(20)<br>
     * 信息概要-未结清/未销户账户数--其他贷款数目
     */
    private String unclearedOtherLoanNum;

    /**
     * VARCHAR(20)<br>
     * 信息概要-为他人担保笔数--信用卡数
     */
    private String guaranteeCreditNum;

    /**
     * VARCHAR(20)<br>
     * 信息概要-为他人担保笔数--住房贷款数目
     */
    private String guaranteeHouseLoanNum;

    /**
     * VARCHAR(20)<br>
     * 信息概要-为他人担保笔数--其他贷款数目
     */
    private String guaranteeOtherNum;

    /**
     * VARCHAR(20)<br>
     * 信息概要-发生过逾期的账户数--信用卡数
     */
    private String overdueCreditNum;

    /**
     * VARCHAR(20)<br>
     * 信息概要-发生过逾期的账户数--住房贷款数目
     */
    private String overdueHouseLoanNum;

    /**
     * VARCHAR(20)<br>
     * 信息概要-发生过逾期的账户数--其他贷款数目
     */
    private String overdueOtherLoanNum;

    /**
     * VARCHAR(20)<br>
     * 信息概要-发生过90天以上逾期的账户数-信用卡数
     */
    private String overdue90dCreditNum;

    /**
     * VARCHAR(20)<br>
     * 信息概要-发生过90天以上逾期的账户数-住房贷款数目
     */
    private String overdue90dHouseLoanNum;

    /**
     * VARCHAR(20)<br>
     * 信息概要-发生过90天以上逾期的账户数-其他贷款数目
     */
    private String overdue90dOtherLoanNum;

    /**
     * VARCHAR(20)<br>
     * 信息概要-通过互联网查询次数
     */
    private String byInternetQueryNum;

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
     * VARCHAR(50)<br>
     * 获得 报告类型：0-简版；1-详版
     */
    public String getCreditReportType() {
        return creditReportType;
    }

    /**
     * VARCHAR(50)<br>
     * 设置 报告类型：0-简版；1-详版
     */
    public void setCreditReportType(String creditReportType) {
        this.creditReportType = creditReportType == null ? null : creditReportType.trim();
    }

    /**
     * VARCHAR(20)<br>
     * 获得 信息概要-发生过逾期的账户数--资产处置笔数
     */
    public String getOverdueAssetDisposalNum() {
        return overdueAssetDisposalNum;
    }

    /**
     * VARCHAR(20)<br>
     * 设置 信息概要-发生过逾期的账户数--资产处置笔数
     */
    public void setOverdueAssetDisposalNum(String overdueAssetDisposalNum) {
        this.overdueAssetDisposalNum = overdueAssetDisposalNum == null ? null : overdueAssetDisposalNum.trim();
    }

    /**
     * VARCHAR(20)<br>
     * 获得 信息概要-发生过逾期的账户数--保证人代偿数
     */
    public String getOverdueAssurerNum() {
        return overdueAssurerNum;
    }

    /**
     * VARCHAR(20)<br>
     * 设置 信息概要-发生过逾期的账户数--保证人代偿数
     */
    public void setOverdueAssurerNum(String overdueAssurerNum) {
        this.overdueAssurerNum = overdueAssurerNum == null ? null : overdueAssurerNum.trim();
    }

    /**
     * VARCHAR(20)<br>
     * 获得 信息概要-账户数-信用卡数
     */
    public String getCreditNum() {
        return creditNum;
    }

    /**
     * VARCHAR(20)<br>
     * 设置 信息概要-账户数-信用卡数
     */
    public void setCreditNum(String creditNum) {
        this.creditNum = creditNum == null ? null : creditNum.trim();
    }

    /**
     * VARCHAR(20)<br>
     * 获得 信息概要-账户数-住房贷款数目
     */
    public String getHouseLoanNum() {
        return houseLoanNum;
    }

    /**
     * VARCHAR(20)<br>
     * 设置 信息概要-账户数-住房贷款数目
     */
    public void setHouseLoanNum(String houseLoanNum) {
        this.houseLoanNum = houseLoanNum == null ? null : houseLoanNum.trim();
    }

    /**
     * VARCHAR(20)<br>
     * 获得 信息概要-账户数-其他贷款数目
     */
    public String getOtherLoanNum() {
        return otherLoanNum;
    }

    /**
     * VARCHAR(20)<br>
     * 设置 信息概要-账户数-其他贷款数目
     */
    public void setOtherLoanNum(String otherLoanNum) {
        this.otherLoanNum = otherLoanNum == null ? null : otherLoanNum.trim();
    }

    /**
     * VARCHAR(20)<br>
     * 获得 信息概要-未结清/未销户账户数--信用卡数
     */
    public String getUnclearedCreditNum() {
        return unclearedCreditNum;
    }

    /**
     * VARCHAR(20)<br>
     * 设置 信息概要-未结清/未销户账户数--信用卡数
     */
    public void setUnclearedCreditNum(String unclearedCreditNum) {
        this.unclearedCreditNum = unclearedCreditNum == null ? null : unclearedCreditNum.trim();
    }

    /**
     * VARCHAR(20)<br>
     * 获得 信息概要-未结清/未销户账户数--住房贷款数目
     */
    public String getUnclearedHouseLoanNum() {
        return unclearedHouseLoanNum;
    }

    /**
     * VARCHAR(20)<br>
     * 设置 信息概要-未结清/未销户账户数--住房贷款数目
     */
    public void setUnclearedHouseLoanNum(String unclearedHouseLoanNum) {
        this.unclearedHouseLoanNum = unclearedHouseLoanNum == null ? null : unclearedHouseLoanNum.trim();
    }

    /**
     * VARCHAR(20)<br>
     * 获得 信息概要-未结清/未销户账户数--其他贷款数目
     */
    public String getUnclearedOtherLoanNum() {
        return unclearedOtherLoanNum;
    }

    /**
     * VARCHAR(20)<br>
     * 设置 信息概要-未结清/未销户账户数--其他贷款数目
     */
    public void setUnclearedOtherLoanNum(String unclearedOtherLoanNum) {
        this.unclearedOtherLoanNum = unclearedOtherLoanNum == null ? null : unclearedOtherLoanNum.trim();
    }

    /**
     * VARCHAR(20)<br>
     * 获得 信息概要-为他人担保笔数--信用卡数
     */
    public String getGuaranteeCreditNum() {
        return guaranteeCreditNum;
    }

    /**
     * VARCHAR(20)<br>
     * 设置 信息概要-为他人担保笔数--信用卡数
     */
    public void setGuaranteeCreditNum(String guaranteeCreditNum) {
        this.guaranteeCreditNum = guaranteeCreditNum == null ? null : guaranteeCreditNum.trim();
    }

    /**
     * VARCHAR(20)<br>
     * 获得 信息概要-为他人担保笔数--住房贷款数目
     */
    public String getGuaranteeHouseLoanNum() {
        return guaranteeHouseLoanNum;
    }

    /**
     * VARCHAR(20)<br>
     * 设置 信息概要-为他人担保笔数--住房贷款数目
     */
    public void setGuaranteeHouseLoanNum(String guaranteeHouseLoanNum) {
        this.guaranteeHouseLoanNum = guaranteeHouseLoanNum == null ? null : guaranteeHouseLoanNum.trim();
    }

    /**
     * VARCHAR(20)<br>
     * 获得 信息概要-为他人担保笔数--其他贷款数目
     */
    public String getGuaranteeOtherNum() {
        return guaranteeOtherNum;
    }

    /**
     * VARCHAR(20)<br>
     * 设置 信息概要-为他人担保笔数--其他贷款数目
     */
    public void setGuaranteeOtherNum(String guaranteeOtherNum) {
        this.guaranteeOtherNum = guaranteeOtherNum == null ? null : guaranteeOtherNum.trim();
    }

    /**
     * VARCHAR(20)<br>
     * 获得 信息概要-发生过逾期的账户数--信用卡数
     */
    public String getOverdueCreditNum() {
        return overdueCreditNum;
    }

    /**
     * VARCHAR(20)<br>
     * 设置 信息概要-发生过逾期的账户数--信用卡数
     */
    public void setOverdueCreditNum(String overdueCreditNum) {
        this.overdueCreditNum = overdueCreditNum == null ? null : overdueCreditNum.trim();
    }

    /**
     * VARCHAR(20)<br>
     * 获得 信息概要-发生过逾期的账户数--住房贷款数目
     */
    public String getOverdueHouseLoanNum() {
        return overdueHouseLoanNum;
    }

    /**
     * VARCHAR(20)<br>
     * 设置 信息概要-发生过逾期的账户数--住房贷款数目
     */
    public void setOverdueHouseLoanNum(String overdueHouseLoanNum) {
        this.overdueHouseLoanNum = overdueHouseLoanNum == null ? null : overdueHouseLoanNum.trim();
    }

    /**
     * VARCHAR(20)<br>
     * 获得 信息概要-发生过逾期的账户数--其他贷款数目
     */
    public String getOverdueOtherLoanNum() {
        return overdueOtherLoanNum;
    }

    /**
     * VARCHAR(20)<br>
     * 设置 信息概要-发生过逾期的账户数--其他贷款数目
     */
    public void setOverdueOtherLoanNum(String overdueOtherLoanNum) {
        this.overdueOtherLoanNum = overdueOtherLoanNum == null ? null : overdueOtherLoanNum.trim();
    }

    /**
     * VARCHAR(20)<br>
     * 获得 信息概要-发生过90天以上逾期的账户数-信用卡数
     */
    public String getOverdue90dCreditNum() {
        return overdue90dCreditNum;
    }

    /**
     * VARCHAR(20)<br>
     * 设置 信息概要-发生过90天以上逾期的账户数-信用卡数
     */
    public void setOverdue90dCreditNum(String overdue90dCreditNum) {
        this.overdue90dCreditNum = overdue90dCreditNum == null ? null : overdue90dCreditNum.trim();
    }

    /**
     * VARCHAR(20)<br>
     * 获得 信息概要-发生过90天以上逾期的账户数-住房贷款数目
     */
    public String getOverdue90dHouseLoanNum() {
        return overdue90dHouseLoanNum;
    }

    /**
     * VARCHAR(20)<br>
     * 设置 信息概要-发生过90天以上逾期的账户数-住房贷款数目
     */
    public void setOverdue90dHouseLoanNum(String overdue90dHouseLoanNum) {
        this.overdue90dHouseLoanNum = overdue90dHouseLoanNum == null ? null : overdue90dHouseLoanNum.trim();
    }

    /**
     * VARCHAR(20)<br>
     * 获得 信息概要-发生过90天以上逾期的账户数-其他贷款数目
     */
    public String getOverdue90dOtherLoanNum() {
        return overdue90dOtherLoanNum;
    }

    /**
     * VARCHAR(20)<br>
     * 设置 信息概要-发生过90天以上逾期的账户数-其他贷款数目
     */
    public void setOverdue90dOtherLoanNum(String overdue90dOtherLoanNum) {
        this.overdue90dOtherLoanNum = overdue90dOtherLoanNum == null ? null : overdue90dOtherLoanNum.trim();
    }

    /**
     * VARCHAR(20)<br>
     * 获得 信息概要-通过互联网查询次数
     */
    public String getByInternetQueryNum() {
        return byInternetQueryNum;
    }

    /**
     * VARCHAR(20)<br>
     * 设置 信息概要-通过互联网查询次数
     */
    public void setByInternetQueryNum(String byInternetQueryNum) {
        this.byInternetQueryNum = byInternetQueryNum == null ? null : byInternetQueryNum.trim();
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
        sb.append(", creditReportType=").append(creditReportType);
        sb.append(", overdueAssetDisposalNum=").append(overdueAssetDisposalNum);
        sb.append(", overdueAssurerNum=").append(overdueAssurerNum);
        sb.append(", creditNum=").append(creditNum);
        sb.append(", houseLoanNum=").append(houseLoanNum);
        sb.append(", otherLoanNum=").append(otherLoanNum);
        sb.append(", unclearedCreditNum=").append(unclearedCreditNum);
        sb.append(", unclearedHouseLoanNum=").append(unclearedHouseLoanNum);
        sb.append(", unclearedOtherLoanNum=").append(unclearedOtherLoanNum);
        sb.append(", guaranteeCreditNum=").append(guaranteeCreditNum);
        sb.append(", guaranteeHouseLoanNum=").append(guaranteeHouseLoanNum);
        sb.append(", guaranteeOtherNum=").append(guaranteeOtherNum);
        sb.append(", overdueCreditNum=").append(overdueCreditNum);
        sb.append(", overdueHouseLoanNum=").append(overdueHouseLoanNum);
        sb.append(", overdueOtherLoanNum=").append(overdueOtherLoanNum);
        sb.append(", overdue90dCreditNum=").append(overdue90dCreditNum);
        sb.append(", overdue90dHouseLoanNum=").append(overdue90dHouseLoanNum);
        sb.append(", overdue90dOtherLoanNum=").append(overdue90dOtherLoanNum);
        sb.append(", byInternetQueryNum=").append(byInternetQueryNum);
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
        DataCreditBriefOutlineInfo other = (DataCreditBriefOutlineInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreditReportId() == null ? other.getCreditReportId() == null : this.getCreditReportId().equals(other.getCreditReportId()))
            && (this.getCreditReportType() == null ? other.getCreditReportType() == null : this.getCreditReportType().equals(other.getCreditReportType()))
            && (this.getOverdueAssetDisposalNum() == null ? other.getOverdueAssetDisposalNum() == null : this.getOverdueAssetDisposalNum().equals(other.getOverdueAssetDisposalNum()))
            && (this.getOverdueAssurerNum() == null ? other.getOverdueAssurerNum() == null : this.getOverdueAssurerNum().equals(other.getOverdueAssurerNum()))
            && (this.getCreditNum() == null ? other.getCreditNum() == null : this.getCreditNum().equals(other.getCreditNum()))
            && (this.getHouseLoanNum() == null ? other.getHouseLoanNum() == null : this.getHouseLoanNum().equals(other.getHouseLoanNum()))
            && (this.getOtherLoanNum() == null ? other.getOtherLoanNum() == null : this.getOtherLoanNum().equals(other.getOtherLoanNum()))
            && (this.getUnclearedCreditNum() == null ? other.getUnclearedCreditNum() == null : this.getUnclearedCreditNum().equals(other.getUnclearedCreditNum()))
            && (this.getUnclearedHouseLoanNum() == null ? other.getUnclearedHouseLoanNum() == null : this.getUnclearedHouseLoanNum().equals(other.getUnclearedHouseLoanNum()))
            && (this.getUnclearedOtherLoanNum() == null ? other.getUnclearedOtherLoanNum() == null : this.getUnclearedOtherLoanNum().equals(other.getUnclearedOtherLoanNum()))
            && (this.getGuaranteeCreditNum() == null ? other.getGuaranteeCreditNum() == null : this.getGuaranteeCreditNum().equals(other.getGuaranteeCreditNum()))
            && (this.getGuaranteeHouseLoanNum() == null ? other.getGuaranteeHouseLoanNum() == null : this.getGuaranteeHouseLoanNum().equals(other.getGuaranteeHouseLoanNum()))
            && (this.getGuaranteeOtherNum() == null ? other.getGuaranteeOtherNum() == null : this.getGuaranteeOtherNum().equals(other.getGuaranteeOtherNum()))
            && (this.getOverdueCreditNum() == null ? other.getOverdueCreditNum() == null : this.getOverdueCreditNum().equals(other.getOverdueCreditNum()))
            && (this.getOverdueHouseLoanNum() == null ? other.getOverdueHouseLoanNum() == null : this.getOverdueHouseLoanNum().equals(other.getOverdueHouseLoanNum()))
            && (this.getOverdueOtherLoanNum() == null ? other.getOverdueOtherLoanNum() == null : this.getOverdueOtherLoanNum().equals(other.getOverdueOtherLoanNum()))
            && (this.getOverdue90dCreditNum() == null ? other.getOverdue90dCreditNum() == null : this.getOverdue90dCreditNum().equals(other.getOverdue90dCreditNum()))
            && (this.getOverdue90dHouseLoanNum() == null ? other.getOverdue90dHouseLoanNum() == null : this.getOverdue90dHouseLoanNum().equals(other.getOverdue90dHouseLoanNum()))
            && (this.getOverdue90dOtherLoanNum() == null ? other.getOverdue90dOtherLoanNum() == null : this.getOverdue90dOtherLoanNum().equals(other.getOverdue90dOtherLoanNum()))
            && (this.getByInternetQueryNum() == null ? other.getByInternetQueryNum() == null : this.getByInternetQueryNum().equals(other.getByInternetQueryNum()))
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
        result = prime * result + ((getCreditReportType() == null) ? 0 : getCreditReportType().hashCode());
        result = prime * result + ((getOverdueAssetDisposalNum() == null) ? 0 : getOverdueAssetDisposalNum().hashCode());
        result = prime * result + ((getOverdueAssurerNum() == null) ? 0 : getOverdueAssurerNum().hashCode());
        result = prime * result + ((getCreditNum() == null) ? 0 : getCreditNum().hashCode());
        result = prime * result + ((getHouseLoanNum() == null) ? 0 : getHouseLoanNum().hashCode());
        result = prime * result + ((getOtherLoanNum() == null) ? 0 : getOtherLoanNum().hashCode());
        result = prime * result + ((getUnclearedCreditNum() == null) ? 0 : getUnclearedCreditNum().hashCode());
        result = prime * result + ((getUnclearedHouseLoanNum() == null) ? 0 : getUnclearedHouseLoanNum().hashCode());
        result = prime * result + ((getUnclearedOtherLoanNum() == null) ? 0 : getUnclearedOtherLoanNum().hashCode());
        result = prime * result + ((getGuaranteeCreditNum() == null) ? 0 : getGuaranteeCreditNum().hashCode());
        result = prime * result + ((getGuaranteeHouseLoanNum() == null) ? 0 : getGuaranteeHouseLoanNum().hashCode());
        result = prime * result + ((getGuaranteeOtherNum() == null) ? 0 : getGuaranteeOtherNum().hashCode());
        result = prime * result + ((getOverdueCreditNum() == null) ? 0 : getOverdueCreditNum().hashCode());
        result = prime * result + ((getOverdueHouseLoanNum() == null) ? 0 : getOverdueHouseLoanNum().hashCode());
        result = prime * result + ((getOverdueOtherLoanNum() == null) ? 0 : getOverdueOtherLoanNum().hashCode());
        result = prime * result + ((getOverdue90dCreditNum() == null) ? 0 : getOverdue90dCreditNum().hashCode());
        result = prime * result + ((getOverdue90dHouseLoanNum() == null) ? 0 : getOverdue90dHouseLoanNum().hashCode());
        result = prime * result + ((getOverdue90dOtherLoanNum() == null) ? 0 : getOverdue90dOtherLoanNum().hashCode());
        result = prime * result + ((getByInternetQueryNum() == null) ? 0 : getByInternetQueryNum().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        result = prime * result + ((getCreatedDt() == null) ? 0 : getCreatedDt().hashCode());
        result = prime * result + ((getUpdatetimedBy() == null) ? 0 : getUpdatetimedBy().hashCode());
        result = prime * result + ((getUpdatetimedDt() == null) ? 0 : getUpdatetimedDt().hashCode());
        return result;
    }
}