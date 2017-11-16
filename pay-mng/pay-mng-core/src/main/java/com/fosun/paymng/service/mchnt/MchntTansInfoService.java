package com.fosun.paymng.service.mchnt;

import java.util.List;

import com.fosun.paymng.model.PayChanlPayLog;
import com.fosun.paymng.model.PayMchntTransLog;
import com.huateng.base.common.beans.Page;
import com.huateng.scube.server.annotation.ScubeParam;

public interface MchntTansInfoService {
	/**
	 * 分页显示 商户 订单信息
	 * @param pageNo
	 * @param pageSize
	 * @param transLog
	 * @return
	 */
	public Page queryTransLogByPage(
			@ScubeParam("pageNo") int pageNo, 
			@ScubeParam("pageSize") int pageSize,
			@ScubeParam("transLog") PayMchntTransLog transLog);
	/**
	 * 根据订单号 获取订单详情信息
	 * @param transSeqId
	 * @return
	 */
	public PayMchntTransLog getTransLogById(@ScubeParam("transSeqId")String transSeqId);
	/**
	 * 根据订单号 获取所有交易数据
	 * @param transSeqId
	 * @return
	 */
	public List<PayChanlPayLog> queryPayLogsList(@ScubeParam("transSeqId")String transSeqId);
	
	
}
