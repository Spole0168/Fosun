package com.fosun.data.dataTask.model;

import java.io.Serializable;
import java.util.Date;

public class DataFileApplyInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * CHAR(32) 必填<br>
     * 主键
     */
    private String id;

    /**
     * VARCHAR(68)<br>
     * 文件id
     */
    private String inFileId;

    /**
     * VARCHAR(50)<br>
     * 任务编号
     */
    private String taskId;

    /**
     * VARCHAR(50)<br>
     * 请求编码
     */
    private String reqNo;

    /**
     * VARCHAR(60)<br>
     * 是否是欺诈数据
     */
    private String isFraud;

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
     * LONGVARCHAR(2147483647)<br>
     * 原始数据
     */
    private String excelContent;

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
     * VARCHAR(68)<br>
     * 获得 文件id
     */
    public String getInFileId() {
        return inFileId;
    }

    /**
     * VARCHAR(68)<br>
     * 设置 文件id
     */
    public void setInFileId(String inFileId) {
        this.inFileId = inFileId == null ? null : inFileId.trim();
    }

    /**
     * VARCHAR(50)<br>
     * 获得 任务编号
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * VARCHAR(50)<br>
     * 设置 任务编号
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId == null ? null : taskId.trim();
    }

    /**
     * VARCHAR(50)<br>
     * 获得 请求编码
     */
    public String getReqNo() {
        return reqNo;
    }

    /**
     * VARCHAR(50)<br>
     * 设置 请求编码
     */
    public void setReqNo(String reqNo) {
        this.reqNo = reqNo == null ? null : reqNo.trim();
    }

    /**
     * VARCHAR(60)<br>
     * 获得 是否是欺诈数据
     */
    public String getIsFraud() {
        return isFraud;
    }

    /**
     * VARCHAR(60)<br>
     * 设置 是否是欺诈数据
     */
    public void setIsFraud(String isFraud) {
        this.isFraud = isFraud == null ? null : isFraud.trim();
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
     * LONGVARCHAR(2147483647)<br>
     * 获得 原始数据
     */
    public String getExcelContent() {
        return excelContent;
    }

    /**
     * LONGVARCHAR(2147483647)<br>
     * 设置 原始数据
     */
    public void setExcelContent(String excelContent) {
        this.excelContent = excelContent == null ? null : excelContent.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", inFileId=").append(inFileId);
        sb.append(", taskId=").append(taskId);
        sb.append(", reqNo=").append(reqNo);
        sb.append(", isFraud=").append(isFraud);
        sb.append(", flag=").append(flag);
        sb.append(", version=").append(version);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", createdDt=").append(createdDt);
        sb.append(", updatetimedBy=").append(updatetimedBy);
        sb.append(", updatetimedDt=").append(updatetimedDt);
        sb.append(", excelContent=").append(excelContent);
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
        DataFileApplyInfo other = (DataFileApplyInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getInFileId() == null ? other.getInFileId() == null : this.getInFileId().equals(other.getInFileId()))
            && (this.getTaskId() == null ? other.getTaskId() == null : this.getTaskId().equals(other.getTaskId()))
            && (this.getReqNo() == null ? other.getReqNo() == null : this.getReqNo().equals(other.getReqNo()))
            && (this.getIsFraud() == null ? other.getIsFraud() == null : this.getIsFraud().equals(other.getIsFraud()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getCreatedBy() == null ? other.getCreatedBy() == null : this.getCreatedBy().equals(other.getCreatedBy()))
            && (this.getCreatedDt() == null ? other.getCreatedDt() == null : this.getCreatedDt().equals(other.getCreatedDt()))
            && (this.getUpdatetimedBy() == null ? other.getUpdatetimedBy() == null : this.getUpdatetimedBy().equals(other.getUpdatetimedBy()))
            && (this.getUpdatetimedDt() == null ? other.getUpdatetimedDt() == null : this.getUpdatetimedDt().equals(other.getUpdatetimedDt()))
            && (this.getExcelContent() == null ? other.getExcelContent() == null : this.getExcelContent().equals(other.getExcelContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getInFileId() == null) ? 0 : getInFileId().hashCode());
        result = prime * result + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        result = prime * result + ((getReqNo() == null) ? 0 : getReqNo().hashCode());
        result = prime * result + ((getIsFraud() == null) ? 0 : getIsFraud().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        result = prime * result + ((getCreatedDt() == null) ? 0 : getCreatedDt().hashCode());
        result = prime * result + ((getUpdatetimedBy() == null) ? 0 : getUpdatetimedBy().hashCode());
        result = prime * result + ((getUpdatetimedDt() == null) ? 0 : getUpdatetimedDt().hashCode());
        result = prime * result + ((getExcelContent() == null) ? 0 : getExcelContent().hashCode());
        return result;
    }
}