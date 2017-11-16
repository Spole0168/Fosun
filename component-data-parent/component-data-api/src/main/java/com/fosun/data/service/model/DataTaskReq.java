/**
 * 
 */
package com.fosun.data.service.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

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
@ApiModel(value="DataTaskReq")
public class DataTaskReq implements Serializable{
	
	@ApiModelProperty(name="channelNo",value="渠道编号")
	private String channelNo;
	@ApiModelProperty(name="taskType",value="任务类型")
	private String taskType;
	@ApiModelProperty(name="inFileId",value="文件id")
	private String inFileId;
	
	@ApiModelProperty(name="taskId",value="任务编号")
	private String taskId;
	
	@ApiModelProperty(name="taskIdList",value="批量的返回结果信息")
	private List<String> taskIdList;
	
	private int paramType;
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

	public String getTaskType() {
		return taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}


	public String getInFileId() {
		return inFileId;
	}

	public void setInFileId(String inFileId) {
		this.inFileId = inFileId;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public List<String> getTaskIdList() {
		return taskIdList;
	}

	public void setTaskIdList(List<String> taskIdList) {
		this.taskIdList = taskIdList;
	}


	public int getParamType() {
		return paramType;
	}

	public void setParamType(int paramType) {
		this.paramType = paramType;
	}

	@Override
	public String toString() {
		return "DataTaskReq [channelNo=" + channelNo + ", taskType=" + taskType
				+ ", inFileId=" + inFileId + ", taskId=" + taskId
				+ ", taskIdList=" + taskIdList + "]";
	}


	
	
}
