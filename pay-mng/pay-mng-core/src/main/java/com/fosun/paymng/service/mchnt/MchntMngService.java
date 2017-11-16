package com.fosun.paymng.service.mchnt;
import com.fosun.paymng.model.PayMchntInf;
import com.huateng.base.common.beans.Page;
import com.huateng.scube.server.annotation.ScubeParam;

/**
 * @author Sherlock
 * 
 */
//
public interface MchntMngService{
	/**
	 * 查詢商戶信息
	 * @param pageNo
	 * @param pageSize
	 * @param mchntInfo
	 * @return
	 */
	public Page findMchntInfosByPage(@ScubeParam("pageNo") int pageNo, @ScubeParam("pageSize") int pageSize,
			@ScubeParam("mchntInfo") PayMchntInf mchntInfo);
	/**
	 * 添加商户
	 * @param mchntInfo
	 * @return
	 */
	public String addMchntInf(@ScubeParam("mchntInfo")PayMchntInf mchntInfo);
	/**
	 * 删除商户
	 * @param mchntInfo
	 * @return
	 */
	public String deleteMchntInfo(@ScubeParam("mchntInfo")PayMchntInf mchntInfo);
	
	/**
	 * 查询商户基础信息
	 * @param mchntId
	 * @return PayMchntInf
	 */
	public PayMchntInf findMchntBaseInfo(@ScubeParam("mchntId")String mchntId);
}
