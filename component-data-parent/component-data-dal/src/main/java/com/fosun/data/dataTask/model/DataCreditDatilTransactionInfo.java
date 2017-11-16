package com.fosun.data.dataTask.model;

import java.io.Serializable;
import java.util.Date;

public class DataCreditDatilTransactionInfo implements Serializable {
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
     * 信贷交易信息明细 -- 类型：0-贷款;1-贷记卡
     */
    private String transactionType;

    /**
     * VARCHAR(50)<br>
     * 信贷交易信息明细--发放日期
     */
    private String transactionIssueDate;

    /**
     * VARCHAR(22)<br>
     * 信贷交易信息明细--贷款金额
     */
    private String transactionLoanAmount;

    /**
     * VARCHAR(300)<br>
     * 信贷交易信息明细--贷款种类
     */
    private String transactionLoanType;

    /**
     * VARCHAR(300)<br>
     * 信贷交易信息明细--贷款机构 || 发卡机构
     */
    private String transactionBranch;

    /**
     * VARCHAR(300)<br>
     * 信贷交易信息明细--抵押类型
     */
    private String transactionLoanMortgageType;

    /**
     * VARCHAR(20)<br>
     * 信贷交易信息明细--期数
     */
    private String transactionLoanTrem;

    /**
     * VARCHAR(20)<br>
     * 信贷交易信息明细--状态
     */
    private String transactionStatus;

    /**
     * VARCHAR(50)<br>
     * 信贷交易信息明细--到期日期
     */
    private String ransactionLoanDueDate;

    /**
     * VARCHAR(100)<br>
     * 信贷交易信息明细--五级分类
     */
    private String ransactionLoan5classType;

    /**
     * VARCHAR(22)<br>
     * 信贷交易信息明细--本金余额
     */
    private String ransactionLoanLeftPrincipalAmount;

    /**
     * VARCHAR(22)<br>
     * 信贷交易信息明细--本月应还
     */
    private String ransactionThismonthReturnAmount;

    /**
     * VARCHAR(22)<br>
     * 信贷交易信息明细--本月实还
     */
    private String ransactionThismonthReturnedAmount;

    /**
     * VARCHAR(300)<br>
     * 信贷交易信息明细--最近24期逾期状态
     */
    private String ransactionLast24termOverdueStatus;

    /**
     * VARCHAR(22)<br>
     * 信贷交易信息明细--授信额度
     */
    private String transactionCreditAmountTotal;

    /**
     * VARCHAR(22)<br>
     * 信贷交易信息明细--共享额度
     */
    private String transactionShareCreditAmountTotal;

    /**
     * VARCHAR(22)<br>
     * 信贷交易信息明细--已用额度
     */
    private String transactionUsedCreditAmount;

    /**
     * VARCHAR(22)<br>
     * 信贷交易信息明细--最大使用额度
     */
    private String transactionMaxUsedCreditAmount;

    /**
     * VARCHAR(22)<br>
     * 信贷交易信息明细--最近6个月平均使用额度
     */
    private String transactionLast6monthUsedCreditAmountAvg;

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
     * VARCHAR(20)<br>
     * 信贷交易信息明细--币种
     */
    private String ransactionCurrency;

    /**
     * VARCHAR(20)<br>
     * 信贷交易信息明细--当前逾期金额
     */
    private String ransactionCurrentOverdueAmount;

    /**
     * VARCHAR(20)<br>
     * 信贷交易信息明细--逾期31-60天未还本金
     */
    private String ransactionOverdue3160daysAmount;

    /**
     * VARCHAR(20)<br>
     * 信贷交易信息明细--逾期61-90天未还本金
     */
    private String ransactionOverdue6190daysAmount;

    /**
     * VARCHAR(20)<br>
     * 信贷交易信息明细--逾期91-180天未还本金
     */
    private String ransactionOverdue91180daysAmount;

    /**
     * VARCHAR(20)<br>
     * 信贷交易信息明细--逾期180天以上未还本金
     */
    private String ransactionOverduemore180daysAmount;

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
     * 获得 信贷交易信息明细 -- 类型：0-贷款;1-贷记卡
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * VARCHAR(50)<br>
     * 设置 信贷交易信息明细 -- 类型：0-贷款;1-贷记卡
     */
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType == null ? null : transactionType.trim();
    }

    /**
     * VARCHAR(50)<br>
     * 获得 信贷交易信息明细--发放日期
     */
    public String getTransactionIssueDate() {
        return transactionIssueDate;
    }

    /**
     * VARCHAR(50)<br>
     * 设置 信贷交易信息明细--发放日期
     */
    public void setTransactionIssueDate(String transactionIssueDate) {
        this.transactionIssueDate = transactionIssueDate == null ? null : transactionIssueDate.trim();
    }

    /**
     * VARCHAR(22)<br>
     * 获得 信贷交易信息明细--贷款金额
     */
    public String getTransactionLoanAmount() {
        return transactionLoanAmount;
    }

    /**
     * VARCHAR(22)<br>
     * 设置 信贷交易信息明细--贷款金额
     */
    public void setTransactionLoanAmount(String transactionLoanAmount) {
        this.transactionLoanAmount = transactionLoanAmount == null ? null : transactionLoanAmount.trim();
    }

    /**
     * VARCHAR(300)<br>
     * 获得 信贷交易信息明细--贷款种类
     */
    public String getTransactionLoanType() {
        return transactionLoanType;
    }

    /**
     * VARCHAR(300)<br>
     * 设置 信贷交易信息明细--贷款种类
     */
    public void setTransactionLoanType(String transactionLoanType) {
        this.transactionLoanType = transactionLoanType == null ? null : transactionLoanType.trim();
    }

    /**
     * VARCHAR(300)<br>
     * 获得 信贷交易信息明细--贷款机构 || 发卡机构
     */
    public String getTransactionBranch() {
        return transactionBranch;
    }

    /**
     * VARCHAR(300)<br>
     * 设置 信贷交易信息明细--贷款机构 || 发卡机构
     */
    public void setTransactionBranch(String transactionBranch) {
        this.transactionBranch = transactionBranch == null ? null : transactionBranch.trim();
    }

    /**
     * VARCHAR(300)<br>
     * 获得 信贷交易信息明细--抵押类型
     */
    public String getTransactionLoanMortgageType() {
        return transactionLoanMortgageType;
    }

    /**
     * VARCHAR(300)<br>
     * 设置 信贷交易信息明细--抵押类型
     */
    public void setTransactionLoanMortgageType(String transactionLoanMortgageType) {
        this.transactionLoanMortgageType = transactionLoanMortgageType == null ? null : transactionLoanMortgageType.trim();
    }

    /**
     * VARCHAR(20)<br>
     * 获得 信贷交易信息明细--期数
     */
    public String getTransactionLoanTrem() {
        return transactionLoanTrem;
    }

    /**
     * VARCHAR(20)<br>
     * 设置 信贷交易信息明细--期数
     */
    public void setTransactionLoanTrem(String transactionLoanTrem) {
        this.transactionLoanTrem = transactionLoanTrem == null ? null : transactionLoanTrem.trim();
    }

    /**
     * VARCHAR(20)<br>
     * 获得 信贷交易信息明细--状态
     */
    public String getTransactionStatus() {
        return transactionStatus;
    }

    /**
     * VARCHAR(20)<br>
     * 设置 信贷交易信息明细--状态
     */
    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus == null ? null : transactionStatus.trim();
    }

    /**
     * VARCHAR(50)<br>
     * 获得 信贷交易信息明细--到期日期
     */
    public String getRansactionLoanDueDate() {
        return ransactionLoanDueDate;
    }

    /**
     * VARCHAR(50)<br>
     * 设置 信贷交易信息明细--到期日期
     */
    public void setRansactionLoanDueDate(String ransactionLoanDueDate) {
        this.ransactionLoanDueDate = ransactionLoanDueDate == null ? null : ransactionLoanDueDate.trim();
    }

    /**
     * VARCHAR(100)<br>
     * 获得 信贷交易信息明细--五级分类
     */
    public String getRansactionLoan5classType() {
        return ransactionLoan5classType;
    }

    /**
     * VARCHAR(100)<br>
     * 设置 信贷交易信息明细--五级分类
     */
    public void setRansactionLoan5classType(String ransactionLoan5classType) {
        this.ransactionLoan5classType = ransactionLoan5classType == null ? null : ransactionLoan5classType.trim();
    }

    /**
     * VARCHAR(22)<br>
     * 获得 信贷交易信息明细--本金余额
     */
    public String getRansactionLoanLeftPrincipalAmount() {
        return ransactionLoanLeftPrincipalAmount;
    }

    /**
     * VARCHAR(22)<br>
     * 设置 信贷交易信息明细--本金余额
     */
    public void setRansactionLoanLeftPrincipalAmount(String ransactionLoanLeftPrincipalAmount) {
        this.ransactionLoanLeftPrincipalAmount = ransactionLoanLeftPrincipalAmount == null ? null : ransactionLoanLeftPrincipalAmount.trim();
    }

    /**
     * VARCHAR(22)<br>
     * 获得 信贷交易信息明细--本月应还
     */
    public String getRansactionThismonthReturnAmount() {
        return ransactionThismonthReturnAmount;
    }

    /**
     * VARCHAR(22)<br>
     * 设置 信贷交易信息明细--本月应还
     */
    public void setRansactionThismonthReturnAmount(String ransactionThismonthReturnAmount) {
        this.ransactionThismonthReturnAmount = ransactionThismonthReturnAmount == null ? null : ransactionThismonthReturnAmount.trim();
    }

    /**
     * VARCHAR(22)<br>
     * 获得 信贷交易信息明细--本月实还
     */
    public String getRansactionThismonthReturnedAmount() {
        return ransactionThismonthReturnedAmount;
    }

    /**
     * VARCHAR(22)<br>
     * 设置 信贷交易信息明细--本月实还
     */
    public void setRansactionThismonthReturnedAmount(String ransactionThismonthReturnedAmount) {
        this.ransactionThismonthReturnedAmount = ransactionThismonthReturnedAmount == null ? null : ransactionThismonthReturnedAmount.trim();
    }

    /**
     * VARCHAR(300)<br>
     * 获得 信贷交易信息明细--最近24期逾期状态
     */
    public String getRansactionLast24termOverdueStatus() {
        return ransactionLast24termOverdueStatus;
    }

    /**
     * VARCHAR(300)<br>
     * 设置 信贷交易信息明细--最近24期逾期状态
     */
    public void setRansactionLast24termOverdueStatus(String ransactionLast24termOverdueStatus) {
        this.ransactionLast24termOverdueStatus = ransactionLast24termOverdueStatus == null ? null : ransactionLast24termOverdueStatus.trim();
    }

    /**
     * VARCHAR(22)<br>
     * 获得 信贷交易信息明细--授信额度
     */
    public String getTransactionCreditAmountTotal() {
        return transactionCreditAmountTotal;
    }

    /**
     * VARCHAR(22)<br>
     * 设置 信贷交易信息明细--授信额度
     */
    public void setTransactionCreditAmountTotal(String transactionCreditAmountTotal) {
        this.transactionCreditAmountTotal = transactionCreditAmountTotal == null ? null : transactionCreditAmountTotal.trim();
    }

    /**
     * VARCHAR(22)<br>
     * 获得 信贷交易信息明细--共享额度
     */
    public String getTransactionShareCreditAmountTotal() {
        return transactionShareCreditAmountTotal;
    }

    /**
     * VARCHAR(22)<br>
     * 设置 信贷交易信息明细--共享额度
     */
    public void setTransactionShareCreditAmountTotal(String transactionShareCreditAmountTotal) {
        this.transactionShareCreditAmountTotal = transactionShareCreditAmountTotal == null ? null : transactionShareCreditAmountTotal.trim();
    }

    /**
     * VARCHAR(22)<br>
     * 获得 信贷交易信息明细--已用额度
     */
    public String getTransactionUsedCreditAmount() {
        return transactionUsedCreditAmount;
    }

    /**
     * VARCHAR(22)<br>
     * 设置 信贷交易信息明细--已用额度
     */
    public void setTransactionUsedCreditAmount(String transactionUsedCreditAmount) {
        this.transactionUsedCreditAmount = transactionUsedCreditAmount == null ? null : transactionUsedCreditAmount.trim();
    }

    /**
     * VARCHAR(22)<br>
     * 获得 信贷交易信息明细--最大使用额度
     */
    public String getTransactionMaxUsedCreditAmount() {
        return transactionMaxUsedCreditAmount;
    }

    /**
     * VARCHAR(22)<br>
     * 设置 信贷交易信息明细--最大使用额度
     */
    public void setTransactionMaxUsedCreditAmount(String transactionMaxUsedCreditAmount) {
        this.transactionMaxUsedCreditAmount = transactionMaxUsedCreditAmount == null ? null : transactionMaxUsedCreditAmount.trim();
    }

    /**
     * VARCHAR(22)<br>
     * 获得 信贷交易信息明细--最近6个月平均使用额度
     */
    public String getTransactionLast6monthUsedCreditAmountAvg() {
        return transactionLast6monthUsedCreditAmountAvg;
    }

    /**
     * VARCHAR(22)<br>
     * 设置 信贷交易信息明细--最近6个月平均使用额度
     */
    public void setTransactionLast6monthUsedCreditAmountAvg(String transactionLast6monthUsedCreditAmountAvg) {
        this.transactionLast6monthUsedCreditAmountAvg = transactionLast6monthUsedCreditAmountAvg == null ? null : transactionLast6monthUsedCreditAmountAvg.trim();
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

    /**
     * VARCHAR(20)<br>
     * 获得 信贷交易信息明细--币种
     */
    public String getRansactionCurrency() {
        return ransactionCurrency;
    }

    /**
     * VARCHAR(20)<br>
     * 设置 信贷交易信息明细--币种
     */
    public void setRansactionCurrency(String ransactionCurrency) {
        this.ransactionCurrency = ransactionCurrency == null ? null : ransactionCurrency.trim();
    }

    /**
     * VARCHAR(20)<br>
     * 获得 信贷交易信息明细--当前逾期金额
     */
    public String getRansactionCurrentOverdueAmount() {
        return ransactionCurrentOverdueAmount;
    }

    /**
     * VARCHAR(20)<br>
     * 设置 信贷交易信息明细--当前逾期金额
     */
    public void setRansactionCurrentOverdueAmount(String ransactionCurrentOverdueAmount) {
        this.ransactionCurrentOverdueAmount = ransactionCurrentOverdueAmount == null ? null : ransactionCurrentOverdueAmount.trim();
    }

    /**
     * VARCHAR(20)<br>
     * 获得 信贷交易信息明细--逾期31-60天未还本金
     */
    public String getRansactionOverdue3160daysAmount() {
        return ransactionOverdue3160daysAmount;
    }

    /**
     * VARCHAR(20)<br>
     * 设置 信贷交易信息明细--逾期31-60天未还本金
     */
    public void setRansactionOverdue3160daysAmount(String ransactionOverdue3160daysAmount) {
        this.ransactionOverdue3160daysAmount = ransactionOverdue3160daysAmount == null ? null : ransactionOverdue3160daysAmount.trim();
    }

    /**
     * VARCHAR(20)<br>
     * 获得 信贷交易信息明细--逾期61-90天未还本金
     */
    public String getRansactionOverdue6190daysAmount() {
        return ransactionOverdue6190daysAmount;
    }

    /**
     * VARCHAR(20)<br>
     * 设置 信贷交易信息明细--逾期61-90天未还本金
     */
    public void setRansactionOverdue6190daysAmount(String ransactionOverdue6190daysAmount) {
        this.ransactionOverdue6190daysAmount = ransactionOverdue6190daysAmount == null ? null : ransactionOverdue6190daysAmount.trim();
    }

    /**
     * VARCHAR(20)<br>
     * 获得 信贷交易信息明细--逾期91-180天未还本金
     */
    public String getRansactionOverdue91180daysAmount() {
        return ransactionOverdue91180daysAmount;
    }

    /**
     * VARCHAR(20)<br>
     * 设置 信贷交易信息明细--逾期91-180天未还本金
     */
    public void setRansactionOverdue91180daysAmount(String ransactionOverdue91180daysAmount) {
        this.ransactionOverdue91180daysAmount = ransactionOverdue91180daysAmount == null ? null : ransactionOverdue91180daysAmount.trim();
    }

    /**
     * VARCHAR(20)<br>
     * 获得 信贷交易信息明细--逾期180天以上未还本金
     */
    public String getRansactionOverduemore180daysAmount() {
        return ransactionOverduemore180daysAmount;
    }

    /**
     * VARCHAR(20)<br>
     * 设置 信贷交易信息明细--逾期180天以上未还本金
     */
    public void setRansactionOverduemore180daysAmount(String ransactionOverduemore180daysAmount) {
        this.ransactionOverduemore180daysAmount = ransactionOverduemore180daysAmount == null ? null : ransactionOverduemore180daysAmount.trim();
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
        sb.append(", transactionIssueDate=").append(transactionIssueDate);
        sb.append(", transactionLoanAmount=").append(transactionLoanAmount);
        sb.append(", transactionLoanType=").append(transactionLoanType);
        sb.append(", transactionBranch=").append(transactionBranch);
        sb.append(", transactionLoanMortgageType=").append(transactionLoanMortgageType);
        sb.append(", transactionLoanTrem=").append(transactionLoanTrem);
        sb.append(", transactionStatus=").append(transactionStatus);
        sb.append(", ransactionLoanDueDate=").append(ransactionLoanDueDate);
        sb.append(", ransactionLoan5classType=").append(ransactionLoan5classType);
        sb.append(", ransactionLoanLeftPrincipalAmount=").append(ransactionLoanLeftPrincipalAmount);
        sb.append(", ransactionThismonthReturnAmount=").append(ransactionThismonthReturnAmount);
        sb.append(", ransactionThismonthReturnedAmount=").append(ransactionThismonthReturnedAmount);
        sb.append(", ransactionLast24termOverdueStatus=").append(ransactionLast24termOverdueStatus);
        sb.append(", transactionCreditAmountTotal=").append(transactionCreditAmountTotal);
        sb.append(", transactionShareCreditAmountTotal=").append(transactionShareCreditAmountTotal);
        sb.append(", transactionUsedCreditAmount=").append(transactionUsedCreditAmount);
        sb.append(", transactionMaxUsedCreditAmount=").append(transactionMaxUsedCreditAmount);
        sb.append(", transactionLast6monthUsedCreditAmountAvg=").append(transactionLast6monthUsedCreditAmountAvg);
        sb.append(", flag=").append(flag);
        sb.append(", version=").append(version);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", createdDt=").append(createdDt);
        sb.append(", updatetimedBy=").append(updatetimedBy);
        sb.append(", updatetimedDt=").append(updatetimedDt);
        sb.append(", ransactionCurrency=").append(ransactionCurrency);
        sb.append(", ransactionCurrentOverdueAmount=").append(ransactionCurrentOverdueAmount);
        sb.append(", ransactionOverdue3160daysAmount=").append(ransactionOverdue3160daysAmount);
        sb.append(", ransactionOverdue6190daysAmount=").append(ransactionOverdue6190daysAmount);
        sb.append(", ransactionOverdue91180daysAmount=").append(ransactionOverdue91180daysAmount);
        sb.append(", ransactionOverduemore180daysAmount=").append(ransactionOverduemore180daysAmount);
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
        DataCreditDatilTransactionInfo other = (DataCreditDatilTransactionInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreditReportId() == null ? other.getCreditReportId() == null : this.getCreditReportId().equals(other.getCreditReportId()))
            && (this.getCreditReportType() == null ? other.getCreditReportType() == null : this.getCreditReportType().equals(other.getCreditReportType()))
            && (this.getTransactionType() == null ? other.getTransactionType() == null : this.getTransactionType().equals(other.getTransactionType()))
            && (this.getTransactionIssueDate() == null ? other.getTransactionIssueDate() == null : this.getTransactionIssueDate().equals(other.getTransactionIssueDate()))
            && (this.getTransactionLoanAmount() == null ? other.getTransactionLoanAmount() == null : this.getTransactionLoanAmount().equals(other.getTransactionLoanAmount()))
            && (this.getTransactionLoanType() == null ? other.getTransactionLoanType() == null : this.getTransactionLoanType().equals(other.getTransactionLoanType()))
            && (this.getTransactionBranch() == null ? other.getTransactionBranch() == null : this.getTransactionBranch().equals(other.getTransactionBranch()))
            && (this.getTransactionLoanMortgageType() == null ? other.getTransactionLoanMortgageType() == null : this.getTransactionLoanMortgageType().equals(other.getTransactionLoanMortgageType()))
            && (this.getTransactionLoanTrem() == null ? other.getTransactionLoanTrem() == null : this.getTransactionLoanTrem().equals(other.getTransactionLoanTrem()))
            && (this.getTransactionStatus() == null ? other.getTransactionStatus() == null : this.getTransactionStatus().equals(other.getTransactionStatus()))
            && (this.getRansactionLoanDueDate() == null ? other.getRansactionLoanDueDate() == null : this.getRansactionLoanDueDate().equals(other.getRansactionLoanDueDate()))
            && (this.getRansactionLoan5classType() == null ? other.getRansactionLoan5classType() == null : this.getRansactionLoan5classType().equals(other.getRansactionLoan5classType()))
            && (this.getRansactionLoanLeftPrincipalAmount() == null ? other.getRansactionLoanLeftPrincipalAmount() == null : this.getRansactionLoanLeftPrincipalAmount().equals(other.getRansactionLoanLeftPrincipalAmount()))
            && (this.getRansactionThismonthReturnAmount() == null ? other.getRansactionThismonthReturnAmount() == null : this.getRansactionThismonthReturnAmount().equals(other.getRansactionThismonthReturnAmount()))
            && (this.getRansactionThismonthReturnedAmount() == null ? other.getRansactionThismonthReturnedAmount() == null : this.getRansactionThismonthReturnedAmount().equals(other.getRansactionThismonthReturnedAmount()))
            && (this.getRansactionLast24termOverdueStatus() == null ? other.getRansactionLast24termOverdueStatus() == null : this.getRansactionLast24termOverdueStatus().equals(other.getRansactionLast24termOverdueStatus()))
            && (this.getTransactionCreditAmountTotal() == null ? other.getTransactionCreditAmountTotal() == null : this.getTransactionCreditAmountTotal().equals(other.getTransactionCreditAmountTotal()))
            && (this.getTransactionShareCreditAmountTotal() == null ? other.getTransactionShareCreditAmountTotal() == null : this.getTransactionShareCreditAmountTotal().equals(other.getTransactionShareCreditAmountTotal()))
            && (this.getTransactionUsedCreditAmount() == null ? other.getTransactionUsedCreditAmount() == null : this.getTransactionUsedCreditAmount().equals(other.getTransactionUsedCreditAmount()))
            && (this.getTransactionMaxUsedCreditAmount() == null ? other.getTransactionMaxUsedCreditAmount() == null : this.getTransactionMaxUsedCreditAmount().equals(other.getTransactionMaxUsedCreditAmount()))
            && (this.getTransactionLast6monthUsedCreditAmountAvg() == null ? other.getTransactionLast6monthUsedCreditAmountAvg() == null : this.getTransactionLast6monthUsedCreditAmountAvg().equals(other.getTransactionLast6monthUsedCreditAmountAvg()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getCreatedBy() == null ? other.getCreatedBy() == null : this.getCreatedBy().equals(other.getCreatedBy()))
            && (this.getCreatedDt() == null ? other.getCreatedDt() == null : this.getCreatedDt().equals(other.getCreatedDt()))
            && (this.getUpdatetimedBy() == null ? other.getUpdatetimedBy() == null : this.getUpdatetimedBy().equals(other.getUpdatetimedBy()))
            && (this.getUpdatetimedDt() == null ? other.getUpdatetimedDt() == null : this.getUpdatetimedDt().equals(other.getUpdatetimedDt()))
            && (this.getRansactionCurrency() == null ? other.getRansactionCurrency() == null : this.getRansactionCurrency().equals(other.getRansactionCurrency()))
            && (this.getRansactionCurrentOverdueAmount() == null ? other.getRansactionCurrentOverdueAmount() == null : this.getRansactionCurrentOverdueAmount().equals(other.getRansactionCurrentOverdueAmount()))
            && (this.getRansactionOverdue3160daysAmount() == null ? other.getRansactionOverdue3160daysAmount() == null : this.getRansactionOverdue3160daysAmount().equals(other.getRansactionOverdue3160daysAmount()))
            && (this.getRansactionOverdue6190daysAmount() == null ? other.getRansactionOverdue6190daysAmount() == null : this.getRansactionOverdue6190daysAmount().equals(other.getRansactionOverdue6190daysAmount()))
            && (this.getRansactionOverdue91180daysAmount() == null ? other.getRansactionOverdue91180daysAmount() == null : this.getRansactionOverdue91180daysAmount().equals(other.getRansactionOverdue91180daysAmount()))
            && (this.getRansactionOverduemore180daysAmount() == null ? other.getRansactionOverduemore180daysAmount() == null : this.getRansactionOverduemore180daysAmount().equals(other.getRansactionOverduemore180daysAmount()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCreditReportId() == null) ? 0 : getCreditReportId().hashCode());
        result = prime * result + ((getCreditReportType() == null) ? 0 : getCreditReportType().hashCode());
        result = prime * result + ((getTransactionType() == null) ? 0 : getTransactionType().hashCode());
        result = prime * result + ((getTransactionIssueDate() == null) ? 0 : getTransactionIssueDate().hashCode());
        result = prime * result + ((getTransactionLoanAmount() == null) ? 0 : getTransactionLoanAmount().hashCode());
        result = prime * result + ((getTransactionLoanType() == null) ? 0 : getTransactionLoanType().hashCode());
        result = prime * result + ((getTransactionBranch() == null) ? 0 : getTransactionBranch().hashCode());
        result = prime * result + ((getTransactionLoanMortgageType() == null) ? 0 : getTransactionLoanMortgageType().hashCode());
        result = prime * result + ((getTransactionLoanTrem() == null) ? 0 : getTransactionLoanTrem().hashCode());
        result = prime * result + ((getTransactionStatus() == null) ? 0 : getTransactionStatus().hashCode());
        result = prime * result + ((getRansactionLoanDueDate() == null) ? 0 : getRansactionLoanDueDate().hashCode());
        result = prime * result + ((getRansactionLoan5classType() == null) ? 0 : getRansactionLoan5classType().hashCode());
        result = prime * result + ((getRansactionLoanLeftPrincipalAmount() == null) ? 0 : getRansactionLoanLeftPrincipalAmount().hashCode());
        result = prime * result + ((getRansactionThismonthReturnAmount() == null) ? 0 : getRansactionThismonthReturnAmount().hashCode());
        result = prime * result + ((getRansactionThismonthReturnedAmount() == null) ? 0 : getRansactionThismonthReturnedAmount().hashCode());
        result = prime * result + ((getRansactionLast24termOverdueStatus() == null) ? 0 : getRansactionLast24termOverdueStatus().hashCode());
        result = prime * result + ((getTransactionCreditAmountTotal() == null) ? 0 : getTransactionCreditAmountTotal().hashCode());
        result = prime * result + ((getTransactionShareCreditAmountTotal() == null) ? 0 : getTransactionShareCreditAmountTotal().hashCode());
        result = prime * result + ((getTransactionUsedCreditAmount() == null) ? 0 : getTransactionUsedCreditAmount().hashCode());
        result = prime * result + ((getTransactionMaxUsedCreditAmount() == null) ? 0 : getTransactionMaxUsedCreditAmount().hashCode());
        result = prime * result + ((getTransactionLast6monthUsedCreditAmountAvg() == null) ? 0 : getTransactionLast6monthUsedCreditAmountAvg().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        result = prime * result + ((getCreatedDt() == null) ? 0 : getCreatedDt().hashCode());
        result = prime * result + ((getUpdatetimedBy() == null) ? 0 : getUpdatetimedBy().hashCode());
        result = prime * result + ((getUpdatetimedDt() == null) ? 0 : getUpdatetimedDt().hashCode());
        result = prime * result + ((getRansactionCurrency() == null) ? 0 : getRansactionCurrency().hashCode());
        result = prime * result + ((getRansactionCurrentOverdueAmount() == null) ? 0 : getRansactionCurrentOverdueAmount().hashCode());
        result = prime * result + ((getRansactionOverdue3160daysAmount() == null) ? 0 : getRansactionOverdue3160daysAmount().hashCode());
        result = prime * result + ((getRansactionOverdue6190daysAmount() == null) ? 0 : getRansactionOverdue6190daysAmount().hashCode());
        result = prime * result + ((getRansactionOverdue91180daysAmount() == null) ? 0 : getRansactionOverdue91180daysAmount().hashCode());
        result = prime * result + ((getRansactionOverduemore180daysAmount() == null) ? 0 : getRansactionOverduemore180daysAmount().hashCode());
        return result;
    }
}