package com.fosun.data.util;

public class DataConstant {
	//创建人
	public static final String CREATER = "ADMIN";	
	public static final String UPDATER = "ADMIN";	
	
	//任务状态 请求状态：0-不存在； 1处理中，2：完成，3：错误
	public static final String TASK_NOT_IN_DATASERVICE = "0";	
	public static final String TASK_STATUS_DOING = "1";	
	public static final String TASK_STATUS_DONE = "2";	
	public static final String TASK_STATUS_ERROR = "3";	
	
	//欺诈信息 0-不通过 （欺诈） 1-通过 正常数据 2异常。
	public static final String IS_FRAUD_INFO = "0";	
	public static final String IS_NOT_FRAUD_INFO = "1";	
	public static final String FRAUD_RESULT_ERROR = "2";	
	//字符串分隔符   不能使用这些  '$', '(', ')', '*', '+', '.', '[', ']', '?', '\\', '^', '{', '}', '|'
	public static final String EXCEL_CELL_SEPARATOR = "&@";
	public static final String EXCEL_CELL_BLANK = " ";
	public static final String EXCEL_CELL_DATAFORMAT_VALUE = ",14,15,19,22,31,57,58,176,177,178,179,180,181,182,183,185,186,187,188,189,190,191,192,193,194,195,196,197,198,199,200,201,202,203,204,205,206,207,210,211,212,";
	public static final String EXCEL_CELL_DATAFORMATSTRING_REG = ".*(yy|804|409|mm|m/d|月|reserved).*";
	
	public static final String PRODUCTTYPE = "12";
	public static final String REPORTFLAG  = "0";
	
	//-----------征信报告-----------------//
	//报告类型：0-简版；1-详版
	public static final String CREDIT_REPORT_TYPE_BRIEF_KEY  = "0";
	public static final String CREDIT_REPORT_TYPE_DETAIL_KEY  = "1";
	public static final String CREDIT_REPORT_TYPE_BRIEF_VALUE  = "简版";
	public static final String CREDIT_REPORT_TYPE_DETAIL_VALUE  = "详版";
	//信贷交易信息明细 -- 类型：0-贷款;1-贷记卡
	public static final String CREDIT_REPORT_DETAIL_TRANSTYPE_LOAN  = "贷款";
	public static final String CREDIT_REPORT_DETAIL_TRANSTYPE_CREDIT_CARD  = "贷记卡";
	
	//简版信贷交易信息明细 -- 类型：0-信用卡;1-住房贷款;2-其他贷款
	public static final String CREDIT_REPORT_SAMPLE_CREDIT_CARD  = "信用卡";
	public static final String CREDIT_REPORT_SAMPLE_HOUSE_TRANSTYPE_LOAN  = "住房贷款";
	public static final String CREDIT_REPORT_OTHER_TRANSTYPE_LOAN  = "其他贷款";
	
	//详版
	public static final String PERSONAL_BUSINES_LOANS  = "个人经营性贷款";
	public static final String PLEDGE_ASSURE  = "抵押";//担保
	public static final String GROUP_ASSURE  = "组合";//担保
	public static final String CLEARED_LOANS_STATUS  = "结清";//结清
	public static final String NORMAL_LOANS_STATUS  = "正常";//正常
	
	
	public static final double HOUSE_LOAN_BASE_RATE  = 0.0475;//房贷月还金额时当前同期人行基准利率
	public static final double OTHER_LOAN_BASE_RATE  = 0.0588;//其他贷款月还金额时当前同期人行基准利率
	
	
}
