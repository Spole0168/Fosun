package com.fosun.data.dataTask.model;

import java.io.Serializable;
import java.util.Date;

public class DataCreditReportInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * CHAR(32) 必填<br>
     * 主键
     */
    private String id;

    /**
     * VARCHAR(50)<br>
     * 报告类型：0-简版；1-详版
     */
    private String creditReportType;

    /**
     * VARCHAR(300)<br>
     * 报告编号id
     */
    private String creditReportId;

    /**
     * VARCHAR(50)<br>
     * 报告时间
     */
    private String creditReportDt;

    /**
     * VARCHAR(50)<br>
     * 出生日期
     */
    private String creditPersonBrithDt;

    /**
     * VARCHAR(50)<br>
     * 姓名
     */
    private String creditPersonName;

    /**
     * VARCHAR(50)<br>
     * 证件类型
     */
    private String creditPersonIdType;

    /**
     * VARCHAR(50)<br>
     * 证件号码
     */
    private String creditPersonIdNum;

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
     * 获得 报告时间
     */
    public String getCreditReportDt() {
        return creditReportDt;
    }

    /**
     * VARCHAR(50)<br>
     * 设置 报告时间
     */
    public void setCreditReportDt(String creditReportDt) {
        this.creditReportDt = creditReportDt == null ? null : creditReportDt.trim();
    }

    /**
     * VARCHAR(50)<br>
     * 获得 出生日期
     */
    public String getCreditPersonBrithDt() {
        return creditPersonBrithDt;
    }

    /**
     * VARCHAR(50)<br>
     * 设置 出生日期
     */
    public void setCreditPersonBrithDt(String creditPersonBrithDt) {
        this.creditPersonBrithDt = creditPersonBrithDt == null ? null : creditPersonBrithDt.trim();
    }

    /**
     * VARCHAR(50)<br>
     * 获得 姓名
     */
    public String getCreditPersonName() {
        return creditPersonName;
    }

    /**
     * VARCHAR(50)<br>
     * 设置 姓名
     */
    public void setCreditPersonName(String creditPersonName) {
        this.creditPersonName = creditPersonName == null ? null : creditPersonName.trim();
    }

    /**
     * VARCHAR(50)<br>
     * 获得 证件类型
     */
    public String getCreditPersonIdType() {
        return creditPersonIdType;
    }

    /**
     * VARCHAR(50)<br>
     * 设置 证件类型
     */
    public void setCreditPersonIdType(String creditPersonIdType) {
        this.creditPersonIdType = creditPersonIdType == null ? null : creditPersonIdType.trim();
    }

    /**
     * VARCHAR(50)<br>
     * 获得 证件号码
     */
    public String getCreditPersonIdNum() {
        return creditPersonIdNum;
    }

    /**
     * VARCHAR(50)<br>
     * 设置 证件号码
     */
    public void setCreditPersonIdNum(String creditPersonIdNum) {
        this.creditPersonIdNum = creditPersonIdNum == null ? null : creditPersonIdNum.trim();
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
        sb.append(", creditReportType=").append(creditReportType);
        sb.append(", creditReportId=").append(creditReportId);
        sb.append(", creditReportDt=").append(creditReportDt);
        sb.append(", creditPersonBrithDt=").append(creditPersonBrithDt);
        sb.append(", creditPersonName=").append(creditPersonName);
        sb.append(", creditPersonIdType=").append(creditPersonIdType);
        sb.append(", creditPersonIdNum=").append(creditPersonIdNum);
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
        DataCreditReportInfo other = (DataCreditReportInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreditReportType() == null ? other.getCreditReportType() == null : this.getCreditReportType().equals(other.getCreditReportType()))
            && (this.getCreditReportId() == null ? other.getCreditReportId() == null : this.getCreditReportId().equals(other.getCreditReportId()))
            && (this.getCreditReportDt() == null ? other.getCreditReportDt() == null : this.getCreditReportDt().equals(other.getCreditReportDt()))
            && (this.getCreditPersonBrithDt() == null ? other.getCreditPersonBrithDt() == null : this.getCreditPersonBrithDt().equals(other.getCreditPersonBrithDt()))
            && (this.getCreditPersonName() == null ? other.getCreditPersonName() == null : this.getCreditPersonName().equals(other.getCreditPersonName()))
            && (this.getCreditPersonIdType() == null ? other.getCreditPersonIdType() == null : this.getCreditPersonIdType().equals(other.getCreditPersonIdType()))
            && (this.getCreditPersonIdNum() == null ? other.getCreditPersonIdNum() == null : this.getCreditPersonIdNum().equals(other.getCreditPersonIdNum()))
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
        result = prime * result + ((getCreditReportType() == null) ? 0 : getCreditReportType().hashCode());
        result = prime * result + ((getCreditReportId() == null) ? 0 : getCreditReportId().hashCode());
        result = prime * result + ((getCreditReportDt() == null) ? 0 : getCreditReportDt().hashCode());
        result = prime * result + ((getCreditPersonBrithDt() == null) ? 0 : getCreditPersonBrithDt().hashCode());
        result = prime * result + ((getCreditPersonName() == null) ? 0 : getCreditPersonName().hashCode());
        result = prime * result + ((getCreditPersonIdType() == null) ? 0 : getCreditPersonIdType().hashCode());
        result = prime * result + ((getCreditPersonIdNum() == null) ? 0 : getCreditPersonIdNum().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        result = prime * result + ((getCreatedDt() == null) ? 0 : getCreatedDt().hashCode());
        result = prime * result + ((getUpdatetimedBy() == null) ? 0 : getUpdatetimedBy().hashCode());
        result = prime * result + ((getUpdatetimedDt() == null) ? 0 : getUpdatetimedDt().hashCode());
        return result;
    }
}