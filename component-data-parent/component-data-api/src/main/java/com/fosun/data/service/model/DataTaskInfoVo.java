package com.fosun.data.service.model;


public class DataTaskInfoVo {
	private String taskId;
	private String taskType;
	
	private String status;
	private String outFileId;
	private String inFileId;
	
	
	private String respCode;
	private String respMsg;
	
	public String getTaskId() {
		return taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getTaskType() {
		return taskType;
	}
	public void setTaskType(String taskType) {
		this.taskType = taskType;
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
	public String getInFileId() {
		return inFileId;
	}
	public void setInFileId(String inFileId) {
		this.inFileId = inFileId;
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
	@Override
	public String toString() {
		return "DataTaskInfoVo [taskId=" + taskId + ", taskType=" + taskType
				+ ", status=" + status + ", outFileId=" + outFileId
				+ ", inFileId=" + inFileId + ", respCode=" + respCode
				+ ", respMsg=" + respMsg + "]";
	}
	
	
}
