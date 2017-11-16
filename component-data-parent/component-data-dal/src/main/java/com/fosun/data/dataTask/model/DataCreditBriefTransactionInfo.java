package com.fosun.data.dataTask.model;

import java.io.Serializable;
import java.util.Date;

public class DataCreditBriefTransactionInfo implements Serializable {
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
     * VARCHAR(50)<br>
     * 信贷交易信息明细 -- 类型：0-信用卡；1-住房贷款；2-其他贷款
     */
    private String transactionType;

    /**
     * VARCHAR(50)<br>
     * 信贷交易信息明细--是否发生过逾期：0-是；1-否
     */
    private String transactionIsOverdue;

    /**
     * VARCHAR(50)<br>
     * 信贷交易信息明细--发放时间
     */
    private String transactionIssueDate;

    /**
     * VARCHAR(50)<br>
     * 信贷交易信息明细--截至时间
     */
    private String transactionDueDate;

    /**
     * VARCHAR(50)<br>
     * 信贷交易信息明细--发卡机构
     */
    private String operateCreditBranch;

    /**
     * VARCHAR(50)<br>
     * 信贷交易信息明细--账户状态
     */
    private String accountState;

    /**
     * VARCHAR(22)<br>
     * 信贷交易信息明细--信用额度
     */
    private String transactionCreditAmountTotal;

    /**
     * VARCHAR(22)<br>
     * 信贷交易信息明细--已使用额度
     */
    private String transactionUsedCreditAmount;

    /**
     * VARCHAR(22)<br>
     * 信贷交易信息明细--逾期金额
     */
    private String transactionOverdueAmount;

    /**
     * VARCHAR(50)<br>
     * 信贷交易信息明细--最近5年逾期次数
     */
    private String overTimes5ys;

    /**
     * VARCHAR(50)<br>
     * 信贷交易信息明细--最近5年90天以上逾期次数
     */
    private String overTimes5ys90ds;

    /**
     * VARCHAR(50)<br>
     * 信贷交易信息明细--贷款机构
     */
    private String loanBranch;

    /**
     * VARCHAR(50)<br>
     * 信贷交易信息明细--到期时间
     */
    private String transactionEndDate;

    /**
     * VARCHAR(22)<br>
     * 信贷交易信息明细--额度
     */
    private String transactionLoanAmount;

    /**
     * VARCHAR(22)<br>
     * 信贷交易信息明细--余额
     */
    private String transactionLeftCreditAmount;

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
     * VARCHAR(50)<br>
     * 获得 信贷交易信息明细 -- 类型：0-信用卡；1-住房贷款；2-其他贷款
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * VARCHAR(50)<br>
     * 设置 信贷交易信息明细 -- 类型：0-信用卡；1-住房贷款；2-其他贷款
     */
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType == null ? null : transactionType.trim();
    }

    /**
     * VARCHAR(50)<br>
     * 获得 信贷交易信息明细--是否发生过逾期：0-是；1-否
     */
    public String getTransactionIsOverdue() {
        return transactionIsOverdue;
    }

    /**
     * VARCHAR(50)<br>
     * 设置 信贷交易信息明细--是否发生过逾期：0-是；1-否
     */
    public void setTransactionIsOverdue(String transactionIsOverdue) {
        this.transactionIsOverdue = transactionIsOverdue == null ? null : transactionIsOverdue.trim();
    }

    /**
     * VARCHAR(50)<br>
     * 获得 信贷交易信息明细--发放时间
     */
    public String getTransactionIssueDate() {
        return transactionIssueDate;
    }

    /**
     * VARCHAR(50)<br>
     * 设置 信贷交易信息明细--发放时间
     */
    public void setTransactionIssueDate(String transactionIssueDate) {
        this.transactionIssueDate = transactionIssueDate == null ? null : transactionIssueDate.trim();
    }

    /**
     * VARCHAR(50)<br>
     * 获得 信贷交易信息明细--截至时间
     */
    public String getTransactionDueDate() {
        return transactionDueDate;
    }

    /**
     * VARCHAR(50)<br>
     * 设置 信贷交易信息明细--截至时间
     */
    public void setTransactionDueDate(String transactionDueDate) {
        this.transactionDueDate = transactionDueDate == null ? null : transactionDueDate.trim();
    }

    /**
     * VARCHAR(50)<br>
     * 获得 信贷交易信息明细--发卡机构
     */
    public String getOperateCreditBranch() {
        return operateCreditBranch;
    }

    /**
     * VARCHAR(50)<br>
     * 设置 信贷交易信息明细--发卡机构
     */
    public void setOperateCreditBranch(String operateCreditBranch) {
        this.operateCreditBranch = operateCreditBranch == null ? null : operateCreditBranch.trim();
    }

    /**
     * VARCHAR(50)<br>
     * 获得 信贷交易信息明细--账户状态
     */
    public String getAccountState() {
        return accountState;
    }

    /**
     * VARCHAR(50)<br>
     * 设置 信贷交易信息明细--账户状态
     */
    public void setAccountState(String accountState) {
        this.accountState = accountState == null ? null : accountState.trim();
    }

    /**
     * VARCHAR(22)<br>
     * 获得 信贷交易信息明细--信用额度
     */
    public String getTransactionCreditAmountTotal() {
        return transactionCreditAmountTotal;
    }

    /**
     * VARCHAR(22)<br>
     * 设置 信贷交易信息明细--信用额度
     */
    public void setTransactionCreditAmountTotal(String transactionCreditAmountTotal) {
        this.transactionCreditAmountTotal = transactionCreditAmountTotal == null ? null : transactionCreditAmountTotal.trim();
    }

    /**
     * VARCHAR(22)<br>
     * 获得 信贷交易信息明细--已使用额度
     */
    public String getTransactionUsedCreditAmount() {
        return transactionUsedCreditAmount;
    }

    /**
     * VARCHAR(22)<br>
     * 设置 信贷交易信息明细--已使用额度
     */
    public void setTransactionUsedCreditAmount(String transactionUsedCreditAmount) {
        this.transactionUsedCreditAmount = transactionUsedCreditAmount == null ? null : transactionUsedCreditAmount.trim();
    }

    /**
     * VARCHAR(22)<br>
     * 获得 信贷交易信息明细--逾期金额
     */
    public String getTransactionOverdueAmount() {
        return transactionOverdueAmount;
    }

    /**
     * VARCHAR(22)<br>
     * 设置 信贷交易信息明细--逾期金额
     */
    public void setTransactionOverdueAmount(String transactionOverdueAmount) {
        this.transactionOverdueAmount = transactionOverdueAmount == null ? null : transactionOverdueAmount.trim();
    }

    /**
     * VARCHAR(50)<br>
     * 获得 信贷交易信息明细--最近5年逾期次数
     */
    public String getOverTimes5ys() {
        return overTimes5ys;
    }

    /**
     * VARCHAR(50)<br>
     * 设置 信贷交易信息明细--最近5年逾期次数
     */
    public void setOverTimes5ys(String overTimes5ys) {
        this.overTimes5ys = overTimes5ys == null ? null : overTimes5ys.trim();
    }

    /**
     * VARCHAR(50)<br>
     * 获得 信贷交易信息明细--最近5年90天以上逾期次数
     */
    public String getOverTimes5ys90ds() {
        return overTimes5ys90ds;
    }

    /**
     * VARCHAR(50)<br>
     * 设置 信贷交易信息明细--最近5年90天以上逾期次数
     */
    public void setOverTimes5ys90ds(String overTimes5ys90ds) {
        this.overTimes5ys90ds = overTimes5ys90ds == null ? null : overTimes5ys90ds.trim();
    }

    /**
     * VARCHAR(50)<br>
     * 获得 信贷交易信息明细--贷款机构
     */
    public String getLoanBranch() {
        return loanBranch;
    }

    /**
     * VARCHAR(50)<br>
     * 设置 信贷交易信息明细--贷款机构
     */
    public void setLoanBranch(String loanBranch) {
        this.loanBranch = loanBranch == null ? null : loanBranch.trim();
    }

    /**
     * VARCHAR(50)<br>
     * 获得 信贷交易信息明细--到期时间
     */
    public String getTransactionEndDate() {
        return transactionEndDate;
    }

    /**
     * VARCHAR(50)<br>
     * 设置 信贷交易信息明细--到期时间
     */
    public void setTransactionEndDate(String transactionEndDate) {
        this.transactionEndDate = transactionEndDate == null ? null : transactionEndDate.trim();
    }

    /**
     * VARCHAR(22)<br>
     * 获得 信贷交易信息明细--额度
     */
    public String getTransactionLoanAmount() {
        return transactionLoanAmount;
    }

    /**
     * VARCHAR(22)<br>
     * 设置 信贷交易信息明细--额度
     */
    public void setTransactionLoanAmount(String transactionLoanAmount) {
        this.transactionLoanAmount = transactionLoanAmount == null ? null : transactionLoanAmount.trim();
    }

    /**
     * VARCHAR(22)<br>
     * 获得 信贷交易信息明细--余额
     */
    public String getTransactionLeftCreditAmount() {
        return transactionLeftCreditAmount;
    }

    /**
     * VARCHAR(22)<br>
     * 设置 信贷交易信息明细--余额
     */
    public void setTransactionLeftCreditAmount(String transactionLeftCreditAmount) {
        this.transactionLeftCreditAmount = transactionLeftCreditAmount == null ? null : transactionLeftCreditAmount.trim();
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
        sb.append(", transactionType=").append(transactionType);
        sb.append(", transactionIsOverdue=").append(transactionIsOverdue);
        sb.append(", transactionIssueDate=").append(transactionIssueDate);
        sb.append(", transactionDueDate=").append(transactionDueDate);
        sb.append(", operateCreditBranch=").append(operateCreditBranch);
        sb.append(", accountState=").append(accountState);
        sb.append(", transactionCreditAmountTotal=").append(transactionCreditAmountTotal);
        sb.append(", transactionUsedCreditAmount=").append(transactionUsedCreditAmount);
        sb.append(", transactionOverdueAmount=").append(transactionOverdueAmount);
        sb.append(", overTimes5ys=").append(overTimes5ys);
        sb.append(", overTimes5ys90ds=").append(overTimes5ys90ds);
        sb.append(", loanBranch=").append(loanBranch);
        sb.append(", transactionEndDate=").append(transactionEndDate);
        sb.append(", transactionLoanAmount=").append(transactionLoanAmount);
        sb.append(", transactionLeftCreditAmount=").append(transactionLeftCreditAmount);
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
        DataCreditBriefTransactionInfo other = (DataCreditBriefTransactionInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreditReportId() == null ? other.getCreditReportId() == null : this.getCreditReportId().equals(other.getCreditReportId()))
            && (this.getCreditReportType() == null ? other.getCreditReportType() == null : this.getCreditReportType().equals(other.getCreditReportType()))
            && (this.getTransactionType() == null ? other.getTransactionType() == null : this.getTransactionType().equals(other.getTransactionType()))
            && (this.getTransactionIsOverdue() == null ? other.getTransactionIsOverdue() == null : this.getTransactionIsOverdue().equals(other.getTransactionIsOverdue()))
            && (this.getTransactionIssueDate() == null ? other.getTransactionIssueDate() == null : this.getTransactionIssueDate().equals(other.getTransactionIssueDate()))
            && (this.getTransactionDueDate() == null ? other.getTransactionDueDate() == null : this.getTransactionDueDate().equals(other.getTransactionDueDate()))
            && (this.getOperateCreditBranch() == null ? other.getOperateCreditBranch() == null : this.getOperateCreditBranch().equals(other.getOperateCreditBranch()))
            && (this.getAccountState() == null ? other.getAccountState() == null : this.getAccountState().equals(other.getAccountState()))
            && (this.getTransactionCreditAmountTotal() == null ? other.getTransactionCreditAmountTotal() == null : this.getTransactionCreditAmountTotal().equals(other.getTransactionCreditAmountTotal()))
            && (this.getTransactionUsedCreditAmount() == null ? other.getTransactionUsedCreditAmount() == null : this.getTransactionUsedCreditAmount().equals(other.getTransactionUsedCreditAmount()))
            && (this.getTransactionOverdueAmount() == null ? other.getTransactionOverdueAmount() == null : this.getTransactionOverdueAmount().equals(other.getTransactionOverdueAmount()))
            && (this.getOverTimes5ys() == null ? other.getOverTimes5ys() == null : this.getOverTimes5ys().equals(other.getOverTimes5ys()))
            && (this.getOverTimes5ys90ds() == null ? other.getOverTimes5ys90ds() == null : this.getOverTimes5ys90ds().equals(other.getOverTimes5ys90ds()))
            && (this.getLoanBranch() == null ? other.getLoanBranch() == null : this.getLoanBranch().equals(other.getLoanBranch()))
            && (this.getTransactionEndDate() == null ? other.getTransactionEndDate() == null : this.getTransactionEndDate().equals(other.getTransactionEndDate()))
            && (this.getTransactionLoanAmount() == null ? other.getTransactionLoanAmount() == null : this.getTransactionLoanAmount().equals(other.getTransactionLoanAmount()))
            && (this.getTransactionLeftCreditAmount() == null ? other.getTransactionLeftCreditAmount() == null : this.getTransactionLeftCreditAmount().equals(other.getTransactionLeftCreditAmount()))
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
        result = prime * result + ((getTransactionType() == null) ? 0 : getTransactionType().hashCode());
        result = prime * result + ((getTransactionIsOverdue() == null) ? 0 : getTransactionIsOverdue().hashCode());
        result = prime * result + ((getTransactionIssueDate() == null) ? 0 : getTransactionIssueDate().hashCode());
        result = prime * result + ((getTransactionDueDate() == null) ? 0 : getTransactionDueDate().hashCode());
        result = prime * result + ((getOperateCreditBranch() == null) ? 0 : getOperateCreditBranch().hashCode());
        result = prime * result + ((getAccountState() == null) ? 0 : getAccountState().hashCode());
        result = prime * result + ((getTransactionCreditAmountTotal() == null) ? 0 : getTransactionCreditAmountTotal().hashCode());
        result = prime * result + ((getTransactionUsedCreditAmount() == null) ? 0 : getTransactionUsedCreditAmount().hashCode());
        result = prime * result + ((getTransactionOverdueAmount() == null) ? 0 : getTransactionOverdueAmount().hashCode());
        result = prime * result + ((getOverTimes5ys() == null) ? 0 : getOverTimes5ys().hashCode());
        result = prime * result + ((getOverTimes5ys90ds() == null) ? 0 : getOverTimes5ys90ds().hashCode());
        result = prime * result + ((getLoanBranch() == null) ? 0 : getLoanBranch().hashCode());
        result = prime * result + ((getTransactionEndDate() == null) ? 0 : getTransactionEndDate().hashCode());
        result = prime * result + ((getTransactionLoanAmount() == null) ? 0 : getTransactionLoanAmount().hashCode());
        result = prime * result + ((getTransactionLeftCreditAmount() == null) ? 0 : getTransactionLeftCreditAmount().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        result = prime * result + ((getCreatedDt() == null) ? 0 : getCreatedDt().hashCode());
        result = prime * result + ((getUpdatetimedBy() == null) ? 0 : getUpdatetimedBy().hashCode());
        result = prime * result + ((getUpdatetimedDt() == null) ? 0 : getUpdatetimedDt().hashCode());
        return result;
    }
}