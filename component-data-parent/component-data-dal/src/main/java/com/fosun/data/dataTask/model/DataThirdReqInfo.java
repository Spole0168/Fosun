package com.fosun.data.dataTask.model;

import java.io.Serializable;
import java.util.Date;

public class DataThirdReqInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * CHAR(32) 必填<br>
     * 主键
     */
    private String id;

    /**
     * VARCHAR(50)<br>
     * 任务状态任务类型
     */
    private String taskType;

    /**
     * VARCHAR(50)<br>
     * 用于之后查询任务状态任务编号
     */
    private String taskId;

    /**
     * VARCHAR(50)<br>
     * 请求编码 --对应的记录的id
     */
    private String reqNo;

    /**
     * VARCHAR(50)<br>
     * 请求系统名称
     */
    private String reqSysName;

    /**
     * TIMESTAMP(19)<br>
     * 请求时间
     */
    private Date reqDt;

    /**
     * VARCHAR(50)<br>
     * 请求参数-姓名
     */
    private String reqParamName;

    /**
     * VARCHAR(50)<br>
     * 请求参数-身份证号
     */
    private String reqParamIdentity;

    /**
     * VARCHAR(50)<br>
     * 请求参数-手机号
     */
    private String reqParamMobile;

    /**
     * VARCHAR(50)<br>
     * 请求参数-接口名称
     */
    private String reqParamInterfaceName;

    /**
     * CHAR(1)<br>
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
     * 请求参数
     */
    private String reqParamContent;

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
     * 获得 任务状态任务类型
     */
    public String getTaskType() {
        return taskType;
    }

    /**
     * VARCHAR(50)<br>
     * 设置 任务状态任务类型
     */
    public void setTaskType(String taskType) {
        this.taskType = taskType == null ? null : taskType.trim();
    }

    /**
     * VARCHAR(50)<br>
     * 获得 用于之后查询任务状态任务编号
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * VARCHAR(50)<br>
     * 设置 用于之后查询任务状态任务编号
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId == null ? null : taskId.trim();
    }

    /**
     * VARCHAR(50)<br>
     * 获得 请求编码 --对应的记录的id
     */
    public String getReqNo() {
        return reqNo;
    }

    /**
     * VARCHAR(50)<br>
     * 设置 请求编码 --对应的记录的id
     */
    public void setReqNo(String reqNo) {
        this.reqNo = reqNo == null ? null : reqNo.trim();
    }

    /**
     * VARCHAR(50)<br>
     * 获得 请求系统名称
     */
    public String getReqSysName() {
        return reqSysName;
    }

    /**
     * VARCHAR(50)<br>
     * 设置 请求系统名称
     */
    public void setReqSysName(String reqSysName) {
        this.reqSysName = reqSysName == null ? null : reqSysName.trim();
    }

    /**
     * TIMESTAMP(19)<br>
     * 获得 请求时间
     */
    public Date getReqDt() {
        return reqDt;
    }

    /**
     * TIMESTAMP(19)<br>
     * 设置 请求时间
     */
    public void setReqDt(Date reqDt) {
        this.reqDt = reqDt;
    }

    /**
     * VARCHAR(50)<br>
     * 获得 请求参数-姓名
     */
    public String getReqParamName() {
        return reqParamName;
    }

    /**
     * VARCHAR(50)<br>
     * 设置 请求参数-姓名
     */
    public void setReqParamName(String reqParamName) {
        this.reqParamName = reqParamName == null ? null : reqParamName.trim();
    }

    /**
     * VARCHAR(50)<br>
     * 获得 请求参数-身份证号
     */
    public String getReqParamIdentity() {
        return reqParamIdentity;
    }

    /**
     * VARCHAR(50)<br>
     * 设置 请求参数-身份证号
     */
    public void setReqParamIdentity(String reqParamIdentity) {
        this.reqParamIdentity = reqParamIdentity == null ? null : reqParamIdentity.trim();
    }

    /**
     * VARCHAR(50)<br>
     * 获得 请求参数-手机号
     */
    public String getReqParamMobile() {
        return reqParamMobile;
    }

    /**
     * VARCHAR(50)<br>
     * 设置 请求参数-手机号
     */
    public void setReqParamMobile(String reqParamMobile) {
        this.reqParamMobile = reqParamMobile == null ? null : reqParamMobile.trim();
    }

    /**
     * VARCHAR(50)<br>
     * 获得 请求参数-接口名称
     */
    public String getReqParamInterfaceName() {
        return reqParamInterfaceName;
    }

    /**
     * VARCHAR(50)<br>
     * 设置 请求参数-接口名称
     */
    public void setReqParamInterfaceName(String reqParamInterfaceName) {
        this.reqParamInterfaceName = reqParamInterfaceName == null ? null : reqParamInterfaceName.trim();
    }

    /**
     * CHAR(1)<br>
     * 获得 逻辑删除标志，0：未删除，1：已删除
     */
    public String getFlag() {
        return flag;
    }

    /**
     * CHAR(1)<br>
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
     * 获得 请求参数
     */
    public String getReqParamContent() {
        return reqParamContent;
    }

    /**
     * LONGVARCHAR(2147483647)<br>
     * 设置 请求参数
     */
    public void setReqParamContent(String reqParamContent) {
        this.reqParamContent = reqParamContent == null ? null : reqParamContent.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", taskType=").append(taskType);
        sb.append(", taskId=").append(taskId);
        sb.append(", reqNo=").append(reqNo);
        sb.append(", reqSysName=").append(reqSysName);
        sb.append(", reqDt=").append(reqDt);
        sb.append(", reqParamName=").append(reqParamName);
        sb.append(", reqParamIdentity=").append(reqParamIdentity);
        sb.append(", reqParamMobile=").append(reqParamMobile);
        sb.append(", reqParamInterfaceName=").append(reqParamInterfaceName);
        sb.append(", flag=").append(flag);
        sb.append(", version=").append(version);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", createdDt=").append(createdDt);
        sb.append(", updatetimedBy=").append(updatetimedBy);
        sb.append(", updatetimedDt=").append(updatetimedDt);
        sb.append(", reqParamContent=").append(reqParamContent);
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
        DataThirdReqInfo other = (DataThirdReqInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTaskType() == null ? other.getTaskType() == null : this.getTaskType().equals(other.getTaskType()))
            && (this.getTaskId() == null ? other.getTaskId() == null : this.getTaskId().equals(other.getTaskId()))
            && (this.getReqNo() == null ? other.getReqNo() == null : this.getReqNo().equals(other.getReqNo()))
            && (this.getReqSysName() == null ? other.getReqSysName() == null : this.getReqSysName().equals(other.getReqSysName()))
            && (this.getReqDt() == null ? other.getReqDt() == null : this.getReqDt().equals(other.getReqDt()))
            && (this.getReqParamName() == null ? other.getReqParamName() == null : this.getReqParamName().equals(other.getReqParamName()))
            && (this.getReqParamIdentity() == null ? other.getReqParamIdentity() == null : this.getReqParamIdentity().equals(other.getReqParamIdentity()))
            && (this.getReqParamMobile() == null ? other.getReqParamMobile() == null : this.getReqParamMobile().equals(other.getReqParamMobile()))
            && (this.getReqParamInterfaceName() == null ? other.getReqParamInterfaceName() == null : this.getReqParamInterfaceName().equals(other.getReqParamInterfaceName()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getCreatedBy() == null ? other.getCreatedBy() == null : this.getCreatedBy().equals(other.getCreatedBy()))
            && (this.getCreatedDt() == null ? other.getCreatedDt() == null : this.getCreatedDt().equals(other.getCreatedDt()))
            && (this.getUpdatetimedBy() == null ? other.getUpdatetimedBy() == null : this.getUpdatetimedBy().equals(other.getUpdatetimedBy()))
            && (this.getUpdatetimedDt() == null ? other.getUpdatetimedDt() == null : this.getUpdatetimedDt().equals(other.getUpdatetimedDt()))
            && (this.getReqParamContent() == null ? other.getReqParamContent() == null : this.getReqParamContent().equals(other.getReqParamContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTaskType() == null) ? 0 : getTaskType().hashCode());
        result = prime * result + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        result = prime * result + ((getReqNo() == null) ? 0 : getReqNo().hashCode());
        result = prime * result + ((getReqSysName() == null) ? 0 : getReqSysName().hashCode());
        result = prime * result + ((getReqDt() == null) ? 0 : getReqDt().hashCode());
        result = prime * result + ((getReqParamName() == null) ? 0 : getReqParamName().hashCode());
        result = prime * result + ((getReqParamIdentity() == null) ? 0 : getReqParamIdentity().hashCode());
        result = prime * result + ((getReqParamMobile() == null) ? 0 : getReqParamMobile().hashCode());
        result = prime * result + ((getReqParamInterfaceName() == null) ? 0 : getReqParamInterfaceName().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        result = prime * result + ((getCreatedDt() == null) ? 0 : getCreatedDt().hashCode());
        result = prime * result + ((getUpdatetimedBy() == null) ? 0 : getUpdatetimedBy().hashCode());
        result = prime * result + ((getUpdatetimedDt() == null) ? 0 : getUpdatetimedDt().hashCode());
        result = prime * result + ((getReqParamContent() == null) ? 0 : getReqParamContent().hashCode());
        return result;
    }
}