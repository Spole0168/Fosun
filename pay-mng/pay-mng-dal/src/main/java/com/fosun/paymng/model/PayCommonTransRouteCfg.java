package com.fosun.paymng.model;

import java.io.Serializable;
import java.util.Date;

public class PayCommonTransRouteCfg implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * CHAR(4) 必填<br>
     * 交易代码
     */
    private String transCd;

    /**
     * CHAR(2) 必填<br>
     * 渠道ID01—统统付02—银联
     */
    private String chnlId;

    /**
     * INTEGER(10) 必填<br>
     * 数字越大优先级越高
     */
    private Integer priority;

    /**
     * TIMESTAMP(19) 默认值[CURRENT_TIMESTAMP] 必填<br>
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
     * CHAR(4) 必填<br>
     * 获得 交易代码
     */
    public String getTransCd() {
        return transCd;
    }

    /**
     * CHAR(4) 必填<br>
     * 设置 交易代码
     */
    public void setTransCd(String transCd) {
        this.transCd = transCd == null ? null : transCd.trim();
    }

    /**
     * CHAR(2) 必填<br>
     * 获得 渠道ID01—统统付02—银联
     */
    public String getChnlId() {
        return chnlId;
    }

    /**
     * CHAR(2) 必填<br>
     * 设置 渠道ID01—统统付02—银联
     */
    public void setChnlId(String chnlId) {
        this.chnlId = chnlId == null ? null : chnlId.trim();
    }

    /**
     * INTEGER(10) 必填<br>
     * 获得 数字越大优先级越高
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * INTEGER(10) 必填<br>
     * 设置 数字越大优先级越高
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * TIMESTAMP(19) 默认值[CURRENT_TIMESTAMP] 必填<br>
     * 获得 记录插入时间
     */
    public Date getRecCrtTs() {
        return recCrtTs;
    }

    /**
     * TIMESTAMP(19) 默认值[CURRENT_TIMESTAMP] 必填<br>
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", transCd=").append(transCd);
        sb.append(", chnlId=").append(chnlId);
        sb.append(", priority=").append(priority);
        sb.append(", recCrtTs=").append(recCrtTs);
        sb.append(", recCrtOprId=").append(recCrtOprId);
        sb.append(", recUpdTs=").append(recUpdTs);
        sb.append(", recUpdOprId=").append(recUpdOprId);
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
        PayCommonTransRouteCfg other = (PayCommonTransRouteCfg) that;
        return (this.getTransCd() == null ? other.getTransCd() == null : this.getTransCd().equals(other.getTransCd()))
            && (this.getChnlId() == null ? other.getChnlId() == null : this.getChnlId().equals(other.getChnlId()))
            && (this.getPriority() == null ? other.getPriority() == null : this.getPriority().equals(other.getPriority()))
            && (this.getRecCrtTs() == null ? other.getRecCrtTs() == null : this.getRecCrtTs().equals(other.getRecCrtTs()))
            && (this.getRecCrtOprId() == null ? other.getRecCrtOprId() == null : this.getRecCrtOprId().equals(other.getRecCrtOprId()))
            && (this.getRecUpdTs() == null ? other.getRecUpdTs() == null : this.getRecUpdTs().equals(other.getRecUpdTs()))
            && (this.getRecUpdOprId() == null ? other.getRecUpdOprId() == null : this.getRecUpdOprId().equals(other.getRecUpdOprId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTransCd() == null) ? 0 : getTransCd().hashCode());
        result = prime * result + ((getChnlId() == null) ? 0 : getChnlId().hashCode());
        result = prime * result + ((getPriority() == null) ? 0 : getPriority().hashCode());
        result = prime * result + ((getRecCrtTs() == null) ? 0 : getRecCrtTs().hashCode());
        result = prime * result + ((getRecCrtOprId() == null) ? 0 : getRecCrtOprId().hashCode());
        result = prime * result + ((getRecUpdTs() == null) ? 0 : getRecUpdTs().hashCode());
        result = prime * result + ((getRecUpdOprId() == null) ? 0 : getRecUpdOprId().hashCode());
        return result;
    }
}