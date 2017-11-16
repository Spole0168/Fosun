package com.fosun.data.dataTask.model;

import java.io.Serializable;

public class DataTask implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * CHAR(32)<br>
     * 
     */
    private String id;

    /**
     * CHAR(2)<br>
     * 
     */
    private String channelNo;

    /**
     * CHAR(32)<br>
     * 获得 
     */
    public String getId() {
        return id;
    }

    /**
     * CHAR(32)<br>
     * 设置 
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * CHAR(2)<br>
     * 获得 
     */
    public String getChannelNo() {
        return channelNo;
    }

    /**
     * CHAR(2)<br>
     * 设置 
     */
    public void setChannelNo(String channelNo) {
        this.channelNo = channelNo == null ? null : channelNo.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", channelNo=").append(channelNo);
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
        DataTask other = (DataTask) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getChannelNo() == null ? other.getChannelNo() == null : this.getChannelNo().equals(other.getChannelNo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getChannelNo() == null) ? 0 : getChannelNo().hashCode());
        return result;
    }
}