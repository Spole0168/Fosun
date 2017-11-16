package com.fosun.paymng.service.banklimit;
import com.fosun.paymng.model.PayBankLimit;
import com.huateng.base.common.beans.Page;
import com.huateng.scube.server.annotation.ScubeParam;


/**
 * 
 * @author along.wu
 * @date 2017年9月12日
 */
public interface BankLimitMngService{
	/**
	 * 查询银行限额信息
	 * @param pageNo
	 * @param pageSize
	 * @param payBankLimit
	 * @return
	 */
	public Page findBankLimitByPage(@ScubeParam("pageNo") int pageNo, @ScubeParam("pageSize") int pageSize,
			@ScubeParam("payBankLimit") PayBankLimit payBankLimit);
	/**
	 * 添加银行限额信息
	 * @param payBankLimit
	 * @return
	 */
	public String addBankLimit(@ScubeParam("payBankLimit")PayBankLimit payBankLimit);
	/**
	 * 删除银行限额信息
	 * @param payBankLimit
	 * @return
	 */
	public String deleteBankLimit(@ScubeParam("payBankLimit")PayBankLimit payBankLimit);
	
	/**
	 * 查询银行限额基础信息
	 * @param payBankLimit
	 * @return payBankLimit
	 */
	public PayBankLimit findBankLimitBaseInfo(@ScubeParam("payBankLimit")PayBankLimit payBankLimit);
}
