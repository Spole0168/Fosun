package com.fosun.paymng.constant;

public class ErrorMsgConstant {
	
	/**
	 * @param name
	 * @return
	 */	
	//系统级错误
	public static final String SYSTEM_ERROR = "50010000"; //系統錯誤
	public static final String PARSE_PARAM_ERROR = "50010001"; //解析参数异常
	public static final String UPDATING_SERVER_ERROR = "50010002"; //服务升级中

	//业务级错误	
	public static final String ICCS_CU_10010001 = "操作失败!"; //
	public static final String ICCS_CU_10010002 = "字段长度超限!"; //
	public static final String ICCS_CU_10010003 = "存在相同渠道的银行限额信息!"; //
}
