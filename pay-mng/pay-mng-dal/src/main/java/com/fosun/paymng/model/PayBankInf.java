package com.fosun.paymng.model;

import java.io.Serializable;
import java.util.Date;

public class PayBankInf implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * CHAR(8) 必填<br>
     * 银行ID
     */
    private String bankId;

    /**
     * VARCHAR(15) 必填<br>
     * 银行英文名称
     */
    private String bankEcd;

    /**
     * VARCHAR(15)<br>
     * 国际电汇码
     */
    private String swiftCode;

    /**
     * VARCHAR(128) 必填<br>
     * 银行名称
     */
    private String bankNm;

    /**
     * VARCHAR(128)<br>
     * 银行图片
     */
    private String imageUrl;

    /**
     * INTEGER(10)<br>
     * 显示排序
     */
    private Integer dispOrder;

    /**
     * CHAR(1) 默认值[Y] 必填<br>
     * 银行状态Y/N
     */
    private String validSt;

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
     * CHAR(8) 必填<br>
     * 获得 银行ID
     */
    public String getBankId() {
        return bankId;
    }

    /**
     * CHAR(8) 必填<br>
     * 设置 银行ID
     */
    public void setBankId(String bankId) {
        this.bankId = bankId == null ? null : bankId.trim();
    }

    /**
     * VARCHAR(15) 必填<br>
     * 获得 银行英文名称
     */
    public String getBankEcd() {
        return bankEcd;
    }

    /**
     * VARCHAR(15) 必填<br>
     * 设置 银行英文名称
     */
    public void setBankEcd(String bankEcd) {
        this.bankEcd = bankEcd == null ? null : bankEcd.trim();
    }

    /**
     * VARCHAR(15)<br>
     * 获得 国际电汇码
     */
    public String getSwiftCode() {
        return swiftCode;
    }

    /**
     * VARCHAR(15)<br>
     * 设置 国际电汇码
     */
    public void setSwiftCode(String swiftCode) {
        this.swiftCode = swiftCode == null ? null : swiftCode.trim();
    }

    /**
     * VARCHAR(128) 必填<br>
     * 获得 银行名称
     */
    public String getBankNm() {
        return bankNm;
    }

    /**
     * VARCHAR(128) 必填<br>
     * 设置 银行名称
     */
    public void setBankNm(String bankNm) {
        this.bankNm = bankNm == null ? null : bankNm.trim();
    }

    /**
     * VARCHAR(128)<br>
     * 获得 银行图片
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * VARCHAR(128)<br>
     * 设置 银行图片
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }

    /**
     * INTEGER(10)<br>
     * 获得 显示排序
     */
    public Integer getDispOrder() {
        return dispOrder;
    }

    /**
     * INTEGER(10)<br>
     * 设置 显示排序
     */
    public void setDispOrder(Integer dispOrder) {
        this.dispOrder = dispOrder;
    }

    /**
     * CHAR(1) 默认值[Y] 必填<br>
     * 获得 银行状态Y/N
     */
    public String getValidSt() {
        return validSt;
    }

    /**
     * CHAR(1) 默认值[Y] 必填<br>
     * 设置 银行状态Y/N
     */
    public void setValidSt(String validSt) {
        this.validSt = validSt == null ? null : validSt.trim();
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
        sb.append(", bankId=").append(bankId);
        sb.append(", bankEcd=").append(bankEcd);
        sb.append(", swiftCode=").append(swiftCode);
        sb.append(", bankNm=").append(bankNm);
        sb.append(", imageUrl=").append(imageUrl);
        sb.append(", dispOrder=").append(dispOrder);
        sb.append(", validSt=").append(validSt);
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
        PayBankInf other = (PayBankInf) that;
        return (this.getBankId() == null ? other.getBankId() == null : this.getBankId().equals(other.getBankId()))
            && (this.getBankEcd() == null ? other.getBankEcd() == null : this.getBankEcd().equals(other.getBankEcd()))
            && (this.getSwiftCode() == null ? other.getSwiftCode() == null : this.getSwiftCode().equals(other.getSwiftCode()))
            && (this.getBankNm() == null ? other.getBankNm() == null : this.getBankNm().equals(other.getBankNm()))
            && (this.getImageUrl() == null ? other.getImageUrl() == null : this.getImageUrl().equals(other.getImageUrl()))
            && (this.getDispOrder() == null ? other.getDispOrder() == null : this.getDispOrder().equals(other.getDispOrder()))
            && (this.getValidSt() == null ? other.getValidSt() == null : this.getValidSt().equals(other.getValidSt()))
            && (this.getRecCrtTs() == null ? other.getRecCrtTs() == null : this.getRecCrtTs().equals(other.getRecCrtTs()))
            && (this.getRecCrtOprId() == null ? other.getRecCrtOprId() == null : this.getRecCrtOprId().equals(other.getRecCrtOprId()))
            && (this.getRecUpdTs() == null ? other.getRecUpdTs() == null : this.getRecUpdTs().equals(other.getRecUpdTs()))
            && (this.getRecUpdOprId() == null ? other.getRecUpdOprId() == null : this.getRecUpdOprId().equals(other.getRecUpdOprId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBankId() == null) ? 0 : getBankId().hashCode());
        result = prime * result + ((getBankEcd() == null) ? 0 : getBankEcd().hashCode());
        result = prime * result + ((getSwiftCode() == null) ? 0 : getSwiftCode().hashCode());
        result = prime * result + ((getBankNm() == null) ? 0 : getBankNm().hashCode());
        result = prime * result + ((getImageUrl() == null) ? 0 : getImageUrl().hashCode());
        result = prime * result + ((getDispOrder() == null) ? 0 : getDispOrder().hashCode());
        result = prime * result + ((getValidSt() == null) ? 0 : getValidSt().hashCode());
        result = prime * result + ((getRecCrtTs() == null) ? 0 : getRecCrtTs().hashCode());
        result = prime * result + ((getRecCrtOprId() == null) ? 0 : getRecCrtOprId().hashCode());
        result = prime * result + ((getRecUpdTs() == null) ? 0 : getRecUpdTs().hashCode());
        result = prime * result + ((getRecUpdOprId() == null) ? 0 : getRecUpdOprId().hashCode());
        return result;
    }
}