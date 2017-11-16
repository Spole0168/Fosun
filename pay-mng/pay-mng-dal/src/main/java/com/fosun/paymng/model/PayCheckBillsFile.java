package com.fosun.paymng.model;

import java.io.Serializable;
import java.util.Date;

public class PayCheckBillsFile implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * VARCHAR(32) 默认值[] 必填<br>
     * 主键
     */
    private String id;

    /**
     * VARCHAR(2)<br>
     * 支付类型;00平台商户01商盟统统付02银联
     */
    private String payType;

    /**
     * VARCHAR(36)<br>
     * 渠道商户代码
     */
    private String chnlMchntId;

    /**
     * VARCHAR(8)<br>
     * 清算日期
     */
    private String checkDate;

    /**
     * VARCHAR(256)<br>
     * 文件名
     */
    private String fileName;

    /**
     * VARCHAR(100)<br>
     * 影像文件名
     */
    private String imageId;

    /**
     * VARCHAR(20)<br>
     * 渠道商户代码/接入账户号
     */
    private String fundCode;

    /**
     * TIMESTAMP(19)<br>
     * 创建时间
     */
    private Date crtTime;

    /**
     * TIMESTAMP(19)<br>
     * 更新时间
     */
    private Date updateTime;

    /**
     * CHAR(10)<br>
     * 商户号
     */
    private String mchntId;

    /**
     * INTEGER(10)<br>
     * 渠道对账文件数
     */
    private Integer chnlFileSum;

    /**
     * INTEGER(10)<br>
     * 文件索引
     */
    private Integer chnlFileIdx;

    /**
     * CHAR(1)<br>
     * 文件状态;文件状态0-未生成1-已生成2-处理中
     */
    private String fileStatus;

    /**
     * VARCHAR(32) 默认值[] 必填<br>
     * 获得 主键
     */
    public String getId() {
        return id;
    }

    /**
     * VARCHAR(32) 默认值[] 必填<br>
     * 设置 主键
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * VARCHAR(2)<br>
     * 获得 支付类型;00平台商户01商盟统统付02银联
     */
    public String getPayType() {
        return payType;
    }

    /**
     * VARCHAR(2)<br>
     * 设置 支付类型;00平台商户01商盟统统付02银联
     */
    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    /**
     * VARCHAR(36)<br>
     * 获得 渠道商户代码
     */
    public String getChnlMchntId() {
        return chnlMchntId;
    }

    /**
     * VARCHAR(36)<br>
     * 设置 渠道商户代码
     */
    public void setChnlMchntId(String chnlMchntId) {
        this.chnlMchntId = chnlMchntId == null ? null : chnlMchntId.trim();
    }

    /**
     * VARCHAR(8)<br>
     * 获得 清算日期
     */
    public String getCheckDate() {
        return checkDate;
    }

    /**
     * VARCHAR(8)<br>
     * 设置 清算日期
     */
    public void setCheckDate(String checkDate) {
        this.checkDate = checkDate == null ? null : checkDate.trim();
    }

    /**
     * VARCHAR(256)<br>
     * 获得 文件名
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * VARCHAR(256)<br>
     * 设置 文件名
     */
    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    /**
     * VARCHAR(100)<br>
     * 获得 影像文件名
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * VARCHAR(100)<br>
     * 设置 影像文件名
     */
    public void setImageId(String imageId) {
        this.imageId = imageId == null ? null : imageId.trim();
    }

    /**
     * VARCHAR(20)<br>
     * 获得 渠道商户代码/接入账户号
     */
    public String getFundCode() {
        return fundCode;
    }

    /**
     * VARCHAR(20)<br>
     * 设置 渠道商户代码/接入账户号
     */
    public void setFundCode(String fundCode) {
        this.fundCode = fundCode == null ? null : fundCode.trim();
    }

    /**
     * TIMESTAMP(19)<br>
     * 获得 创建时间
     */
    public Date getCrtTime() {
        return crtTime;
    }

    /**
     * TIMESTAMP(19)<br>
     * 设置 创建时间
     */
    public void setCrtTime(Date crtTime) {
        this.crtTime = crtTime;
    }

    /**
     * TIMESTAMP(19)<br>
     * 获得 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * TIMESTAMP(19)<br>
     * 设置 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * CHAR(10)<br>
     * 获得 商户号
     */
    public String getMchntId() {
        return mchntId;
    }

    /**
     * CHAR(10)<br>
     * 设置 商户号
     */
    public void setMchntId(String mchntId) {
        this.mchntId = mchntId == null ? null : mchntId.trim();
    }

    /**
     * INTEGER(10)<br>
     * 获得 渠道对账文件数
     */
    public Integer getChnlFileSum() {
        return chnlFileSum;
    }

    /**
     * INTEGER(10)<br>
     * 设置 渠道对账文件数
     */
    public void setChnlFileSum(Integer chnlFileSum) {
        this.chnlFileSum = chnlFileSum;
    }

    /**
     * INTEGER(10)<br>
     * 获得 文件索引
     */
    public Integer getChnlFileIdx() {
        return chnlFileIdx;
    }

    /**
     * INTEGER(10)<br>
     * 设置 文件索引
     */
    public void setChnlFileIdx(Integer chnlFileIdx) {
        this.chnlFileIdx = chnlFileIdx;
    }

    /**
     * CHAR(1)<br>
     * 获得 文件状态;文件状态0-未生成1-已生成2-处理中
     */
    public String getFileStatus() {
        return fileStatus;
    }

    /**
     * CHAR(1)<br>
     * 设置 文件状态;文件状态0-未生成1-已生成2-处理中
     */
    public void setFileStatus(String fileStatus) {
        this.fileStatus = fileStatus == null ? null : fileStatus.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", payType=").append(payType);
        sb.append(", chnlMchntId=").append(chnlMchntId);
        sb.append(", checkDate=").append(checkDate);
        sb.append(", fileName=").append(fileName);
        sb.append(", imageId=").append(imageId);
        sb.append(", fundCode=").append(fundCode);
        sb.append(", crtTime=").append(crtTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", mchntId=").append(mchntId);
        sb.append(", chnlFileSum=").append(chnlFileSum);
        sb.append(", chnlFileIdx=").append(chnlFileIdx);
        sb.append(", fileStatus=").append(fileStatus);
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
        PayCheckBillsFile other = (PayCheckBillsFile) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPayType() == null ? other.getPayType() == null : this.getPayType().equals(other.getPayType()))
            && (this.getChnlMchntId() == null ? other.getChnlMchntId() == null : this.getChnlMchntId().equals(other.getChnlMchntId()))
            && (this.getCheckDate() == null ? other.getCheckDate() == null : this.getCheckDate().equals(other.getCheckDate()))
            && (this.getFileName() == null ? other.getFileName() == null : this.getFileName().equals(other.getFileName()))
            && (this.getImageId() == null ? other.getImageId() == null : this.getImageId().equals(other.getImageId()))
            && (this.getFundCode() == null ? other.getFundCode() == null : this.getFundCode().equals(other.getFundCode()))
            && (this.getCrtTime() == null ? other.getCrtTime() == null : this.getCrtTime().equals(other.getCrtTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getMchntId() == null ? other.getMchntId() == null : this.getMchntId().equals(other.getMchntId()))
            && (this.getChnlFileSum() == null ? other.getChnlFileSum() == null : this.getChnlFileSum().equals(other.getChnlFileSum()))
            && (this.getChnlFileIdx() == null ? other.getChnlFileIdx() == null : this.getChnlFileIdx().equals(other.getChnlFileIdx()))
            && (this.getFileStatus() == null ? other.getFileStatus() == null : this.getFileStatus().equals(other.getFileStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPayType() == null) ? 0 : getPayType().hashCode());
        result = prime * result + ((getChnlMchntId() == null) ? 0 : getChnlMchntId().hashCode());
        result = prime * result + ((getCheckDate() == null) ? 0 : getCheckDate().hashCode());
        result = prime * result + ((getFileName() == null) ? 0 : getFileName().hashCode());
        result = prime * result + ((getImageId() == null) ? 0 : getImageId().hashCode());
        result = prime * result + ((getFundCode() == null) ? 0 : getFundCode().hashCode());
        result = prime * result + ((getCrtTime() == null) ? 0 : getCrtTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getMchntId() == null) ? 0 : getMchntId().hashCode());
        result = prime * result + ((getChnlFileSum() == null) ? 0 : getChnlFileSum().hashCode());
        result = prime * result + ((getChnlFileIdx() == null) ? 0 : getChnlFileIdx().hashCode());
        result = prime * result + ((getFileStatus() == null) ? 0 : getFileStatus().hashCode());
        return result;
    }
}