/**
 * 
 */
package com.fosun.data.service.model;

import java.io.Serializable;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 *
 * @author 	abudula
 * @date 	2017年5月6日
 * @Copyright 
 *
 * <pre>
 * =================Modify Record=================
 * Modifier			date				Content
 * yunbo.wei		2017年5月6日			新增
 *
 * </pre>
 */
@ApiModel(value="DataTaskRep")
public class DataTaskRep implements Serializable{
	
	@ApiModelProperty(name="channelNo",value="渠道编号")
	private String channelNo;
	@ApiModelProperty(name="respCode",value="返回码")
	private String respCode;
	@ApiModelProperty(name="respMsg",value="返回信息")
	private String respMsg;
	
	@ApiModelProperty(name="taskId",value="任务编号")
	private String taskId;
	@ApiModelProperty(name="status",value="任务状态")
	private String status;
	@ApiModelProperty(name="outFileId",value="结果文件id")
	private String outFileId;
	
	@ApiModelProperty(name="repList",value="批量的返回结果信息")
	private List<DataTaskInfoVo> repList;

	/**
	 * @return the channelNo
	 */
	public String getChannelNo() {
		return channelNo;
	}

	/**
	 * @param channelNo the channelNo to set
	 */
	public void setChannelNo(String channelNo) {
		this.channelNo = channelNo;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getRespCode() {
		return respCode;
	}

	public void setRespCode(String respCode) {
		this.respCode = respCode;
	}

	public String getRespMsg() {
		return respMsg;
	}

	public void setRespMsg(String respMsg) {
		this.respMsg = respMsg;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getOutFileId() {
		return outFileId;
	}

	public void setOutFileId(String outFileId) {
		this.outFileId = outFileId;
	}

	public List<DataTaskInfoVo> getRepList() {
		return repList;
	}

	public void setRepList(List<DataTaskInfoVo> repList) {
		this.repList = repList;
	}

	@Override
	public String toString() {
		return "DataTaskRep [channelNo=" + channelNo + ", respCode=" + respCode
				+ ", respMsg=" + respMsg + ", taskId=" + taskId + ", status="
				+ status + ", outFileId=" + outFileId + ", repList=" + repList
				+ "]";
	}

	

}
