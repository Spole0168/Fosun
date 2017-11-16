package com.fosun.data.dataTask.model;

import java.io.Serializable;
import java.util.Date;

public class DataCreditPublicInfo implements Serializable {
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
     * VARCHAR(10)<br>
     * 欠税记录   0-无 1-有
     */
    private String recordTaxesOwed;

    /**
     * VARCHAR(10)<br>
     * 民事判决记录0-无 1-有
     */
    private String recordCivilJudgment;

    /**
     * VARCHAR(10)<br>
     * 强制执行记录0-无 1-有
     */
    private String recordForceExecution;

    /**
     * VARCHAR(10)<br>
     * 行政处罚记录0-无 1-有
     */
    private String recordAdminSanction;

    /**
     * VARCHAR(10)<br>
     * 电信欠费信息0-无 1-有
     */
    private String recordTelecomArrears;

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
     * VARCHAR(10)<br>
     * 获得 欠税记录   0-无 1-有
     */
    public String getRecordTaxesOwed() {
        return recordTaxesOwed;
    }

    /**
     * VARCHAR(10)<br>
     * 设置 欠税记录   0-无 1-有
     */
    public void setRecordTaxesOwed(String recordTaxesOwed) {
        this.recordTaxesOwed = recordTaxesOwed == null ? null : recordTaxesOwed.trim();
    }

    /**
     * VARCHAR(10)<br>
     * 获得 民事判决记录0-无 1-有
     */
    public String getRecordCivilJudgment() {
        return recordCivilJudgment;
    }

    /**
     * VARCHAR(10)<br>
     * 设置 民事判决记录0-无 1-有
     */
    public void setRecordCivilJudgment(String recordCivilJudgment) {
        this.recordCivilJudgment = recordCivilJudgment == null ? null : recordCivilJudgment.trim();
    }

    /**
     * VARCHAR(10)<br>
     * 获得 强制执行记录0-无 1-有
     */
    public String getRecordForceExecution() {
        return recordForceExecution;
    }

    /**
     * VARCHAR(10)<br>
     * 设置 强制执行记录0-无 1-有
     */
    public void setRecordForceExecution(String recordForceExecution) {
        this.recordForceExecution = recordForceExecution == null ? null : recordForceExecution.trim();
    }

    /**
     * VARCHAR(10)<br>
     * 获得 行政处罚记录0-无 1-有
     */
    public String getRecordAdminSanction() {
        return recordAdminSanction;
    }

    /**
     * VARCHAR(10)<br>
     * 设置 行政处罚记录0-无 1-有
     */
    public void setRecordAdminSanction(String recordAdminSanction) {
        this.recordAdminSanction = recordAdminSanction == null ? null : recordAdminSanction.trim();
    }

    /**
     * VARCHAR(10)<br>
     * 获得 电信欠费信息0-无 1-有
     */
    public String getRecordTelecomArrears() {
        return recordTelecomArrears;
    }

    /**
     * VARCHAR(10)<br>
     * 设置 电信欠费信息0-无 1-有
     */
    public void setRecordTelecomArrears(String recordTelecomArrears) {
        this.recordTelecomArrears = recordTelecomArrears == null ? null : recordTelecomArrears.trim();
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
        sb.append(", recordTaxesOwed=").append(recordTaxesOwed);
        sb.append(", recordCivilJudgment=").append(recordCivilJudgment);
        sb.append(", recordForceExecution=").append(recordForceExecution);
        sb.append(", recordAdminSanction=").append(recordAdminSanction);
        sb.append(", recordTelecomArrears=").append(recordTelecomArrears);
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
        DataCreditPublicInfo other = (DataCreditPublicInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreditReportId() == null ? other.getCreditReportId() == null : this.getCreditReportId().equals(other.getCreditReportId()))
            && (this.getCreditReportType() == null ? other.getCreditReportType() == null : this.getCreditReportType().equals(other.getCreditReportType()))
            && (this.getRecordTaxesOwed() == null ? other.getRecordTaxesOwed() == null : this.getRecordTaxesOwed().equals(other.getRecordTaxesOwed()))
            && (this.getRecordCivilJudgment() == null ? other.getRecordCivilJudgment() == null : this.getRecordCivilJudgment().equals(other.getRecordCivilJudgment()))
            && (this.getRecordForceExecution() == null ? other.getRecordForceExecution() == null : this.getRecordForceExecution().equals(other.getRecordForceExecution()))
            && (this.getRecordAdminSanction() == null ? other.getRecordAdminSanction() == null : this.getRecordAdminSanction().equals(other.getRecordAdminSanction()))
            && (this.getRecordTelecomArrears() == null ? other.getRecordTelecomArrears() == null : this.getRecordTelecomArrears().equals(other.getRecordTelecomArrears()))
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
        result = prime * result + ((getRecordTaxesOwed() == null) ? 0 : getRecordTaxesOwed().hashCode());
        result = prime * result + ((getRecordCivilJudgment() == null) ? 0 : getRecordCivilJudgment().hashCode());
        result = prime * result + ((getRecordForceExecution() == null) ? 0 : getRecordForceExecution().hashCode());
        result = prime * result + ((getRecordAdminSanction() == null) ? 0 : getRecordAdminSanction().hashCode());
        result = prime * result + ((getRecordTelecomArrears() == null) ? 0 : getRecordTelecomArrears().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        result = prime * result + ((getCreatedDt() == null) ? 0 : getCreatedDt().hashCode());
        result = prime * result + ((getUpdatetimedBy() == null) ? 0 : getUpdatetimedBy().hashCode());
        result = prime * result + ((getUpdatetimedDt() == null) ? 0 : getUpdatetimedDt().hashCode());
        return result;
    }
}