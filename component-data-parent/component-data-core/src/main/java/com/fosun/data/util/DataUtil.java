/**
 * 
 */
package com.fosun.data.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import net.sf.json.JSONObject;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fosun.component.base.exception.CommonException;
import com.fosun.component.base.util.StringUtil;
import com.fosun.data.dataTask.dto.CreditReportDto;
import com.fosun.data.dataTask.model.DataCreditBriefOutlineInfo;
import com.fosun.data.dataTask.model.DataCreditBriefTransactionInfo;
import com.fosun.data.dataTask.model.DataCreditDatilOutlineInfo;
import com.fosun.data.dataTask.model.DataCreditDatilTransactionInfo;
import com.fosun.data.dataTask.model.DataCreditQueryInfo;
import com.fosun.data.service.model.vo.CreditBriefReport;
import com.fosun.data.service.model.vo.CreditDetailReport;

/**
 * 
 *
 * @author abudula
 * @date 2017年3月22日
 * @Copyright
 *
 *            <pre>
 * =================Modify Record=================
 * Modifier			date				Content
 * yunbo.wei		2017年3月22日			新增
 *
 * </pre>
 */
public class DataUtil {
	static Logger logger = LoggerFactory.getLogger(DataUtil.class);
	/**
	 * <p> 把list转化为用指定分隔符分割的字符串
	 * @param list
	 * @param regex
	 * @return
	 */
	public static String transList2String(List<String> list,String regex){
		String res = null;
		String separator = null == regex?",":regex;
		StringBuffer sb = new StringBuffer();
		if(null!=list&&list.size()>0){
			for(String str:list){
				if(null==str||str.length()==0){
					sb.append(" ");
				}else{
					sb.append(str);
				}
				sb.append(separator);
			}
			res = sb.substring(0, sb.length()-separator.length()).toString();
		}
		return res;
	}
	/**
	 * <p>把字符串用指定分隔符分割后转化为List
	 * @param orgStr
	 * @param regex
	 * @return
	 */
	public static List<String> transString2List(String orgStr,String regex){
		List<String> res = null;
		if(null!=orgStr&orgStr.length()>0){
			String separator = null == regex?",":regex;
			res = new ArrayList<String>();
			String[] arr = orgStr.split(separator);
			for(int i=0;i<arr.length;i++){
				if(null==arr[i]||arr[i].length()==0){
					res.add(" ");
				}else{
					res.add(arr[i].toString());
				}
			}
		}
		return res;
	}
	/**
	 * <p> 生成UUID
	 * @return
	 */
	public static String getUuid(){
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
	/**
	 * 
	 * <p> description : 根据文件的影像id把文件下载到临时目录中
	 * <p> author   : Spole
	 * <p> date 	: 2017年6月6日
	 * <p> methodName ：downExcelFile
	 * <p> paramters  : @param fid
	 * <p> paramters  : @return
	 * <p> paramters  : @throws CommonException
	 * <p> return	: String
	 * <p>
	 * <p>
	 */
	public static String downExcelFile(String fid)
			throws CommonException {
		if(null==fid || fid.length()==0){
			//抛出参数异常
			throw new CommonException("100001", "dataTaskReq -inFileId 参数为空");
		}
		if(fid.length() > 150){
			//抛出参数异常
			throw new CommonException("100011", "dataTaskReq -inFileId 过长"+ fid.length());
		}
		String durl = PropertiesUtils.getPropertiesValue("storekeeper_api_sftp_download");
		//a.先查询该input_fid 在影像系统中是否存在，若不存在，抛出异常。否则 下载文件
		String remotePath;
		try {
			remotePath = FileUploadUtils.getFilePath(fid,durl);
		} catch (CommonException e) {
			throw new CommonException("100022", "下载文件异常");
		}
		if(null==remotePath || remotePath.length()==0){
			//抛出参数异常
//			logger.error("文件不存在    参数问题 dataTaskReq="+dataTaskReq);
			throw new CommonException("100002", "输入的文件id 在影响系统中 不存在");
		}
		
		String tempPath = PropertiesUtils.getPropertiesValue("temp_path");
		FileUploadUtils.createDir(tempPath);
		//兼容2003文件下载
		String fileTypeStr = remotePath.trim().substring(remotePath.length()-4, remotePath.length());
		String tempFile = null;
		if(fileTypeStr.contains(ExcelsUtils.xlsx)){//2010
			tempFile = tempPath+fid+"."+ExcelsUtils.xlsx;
		}else if(fileTypeStr.contains(ExcelsUtils.xls)){//2003
			tempFile = tempPath+fid+"."+ExcelsUtils.xls;
		}else{
			throw new CommonException("100005", "输入的文件id 对应文件不是Excel 文件信息:"+remotePath);
		}
		//下载到本地临时目录中
		FileUploadUtils.downloadFile(remotePath.trim(), tempFile);
		return tempFile;
	}
	
	/**
	 * <p> description :  判断指定的List<String> 中 每一项中是否包含字符串Str
	 * <p> author   : Spole
	 * <p> date 	: 2017年6月5日
	 * <p> methodName ：isExistObjInList
	 * <p> paramters  : @param ls
	 * <p> paramters  : @param str
	 * <p> paramters  : @return
	 * <p> return	: boolean
	 * <p>
	 * <p>
	 */
	public static boolean isExistObjInList(List<String> ls,String str){
		boolean res = false;
		if(null==ls){
			return res;
		}
		for(String temp : ls){
			if(temp.contains(str)){
				return true;
			}
		}
		return res;
	}
	/**
	 * <p> description :  合并json
	 * <p> author   : Spole
	 * <p> date 	: 2017年6月8日
	 * <p> methodName ：union2Json
	 * <p> paramters  : @param json1
	 * <p> paramters  : @param json2
	 * <p> paramters  : @return
	 * <p> return	: JSONObject
	 * <p> todo     : TODO
	 * <p>
	 * <p>
	 */
	public static JSONObject union2Json(JSONObject json1,JSONObject json2){
		if(null==json1||json1.isEmpty()){
			json1 = new JSONObject();
		}
		Iterator<String> keys = json2.keys();
		while(keys.hasNext()){
			String key = keys.next();
			String val = json2.getString(key);
			if(null!=val&& val.length()>0){
				json1.put(key, val);
			}
		}
		return json1;
	}
	/**
	 * <p> description : 根据征信报告的dto生成风险评估 征信模块json
	 * <p> author   : Spole
	 * <p> date 	: 2017年6月8日
	 * <p> methodName ：transReportDto2Json
	 * <p> paramters  : @param reportDto
	 * <p> paramters  : @return
	 * <p> paramters  : @throws ParseException
	 * <p> return	: JSONObject
	 * <p> todo     : TODO
	 * <p>
	 * <p>
	 */
	public static JSONObject transReportDto2Json(CreditReportDto reportDto){
		JSONObject reportJson = new JSONObject();
		String reportType = reportDto.getCreditReportType().trim();
		if(DataConstant.CREDIT_REPORT_TYPE_DETAIL_VALUE.equals(reportType)){
			CreditDetailReport dr = transReportDto2DitalBean(reportDto);
			reportJson = JSONObject.fromObject(dr);
		}
		if(DataConstant.CREDIT_REPORT_TYPE_BRIEF_VALUE.equals(reportType)){
			CreditBriefReport cr = transReportDto2BriefBean(reportDto);
			reportJson = JSONObject.fromObject(cr);
		}
		return reportJson;
	}
	/**
	 * 
	 * @param reportDto
	 * @return
	 */
	private static CreditBriefReport transReportDto2BriefBean(CreditReportDto reportDto) {
		String reportDate=reportDto.getDataCreditReportInfo().getCreditReportDt();//报告日期
		CreditBriefReport briefReport=new CreditBriefReport();
		DataCreditBriefOutlineInfo dataCreditBriefOutlineInfo = reportDto.getDataCreditBriefOutlineInfo();
		List<DataCreditQueryInfo> queryList = reportDto.getQueryList();
		List<DataCreditBriefTransactionInfo> transList = reportDto.getBriefCreditCardTransList();
		transList.addAll(reportDto.getBriefHouseLoanTransList());
		transList.addAll(reportDto.getBriefOtherLoanTransList());
		double		overdueTimesInL5Y = 0	; 		//过去5年的逾期次数
		double		overdueMoreThan90DL5Y = 0	;	//过去5年90天以上逾期次数
		double		MOBNeverOverdueAccount = 0	;	//从未逾期账户距今最长账龄
		List		houseLoanRetunMs = new ArrayList()	;//房贷已还款月份
		List		houseLoanAmountM = new ArrayList()	;//房贷月还金额
		List		otherLoanAmountM = new ArrayList()	;//其他贷款月还金额
		double		monthlyDebts = 0;
		
		double overAccSum = 0;					//逾期账户总数（3）
		double creditAccSum = 0;				//账户总数
		double queryTimesL6M = 0;				//最近6个月审批查询次数
		double cardTotalAmount = 0;				//信用卡总额度
		double cardUsedAmount = 0;				//信用卡使用额度
		
		double otherMonthTotalAmount = 0;		//其他贷款的月还金额 总额
		double maxOldCardDt = 0; 		//申请人信用卡最长账龄
		
		for(DataCreditBriefTransactionInfo trans :transList){
			//1.过去5年的逾期次数SUM(信用卡+房贷+其他贷款的最近5年逾期次数) 注：信用卡的“状态”除去“未激活”
			//2.将 信用卡、住房贷款、其他贷款中的“最近5年90天以上逾期次数”进行加总 注：信用卡的“状态”除去“未激活”
			double o5y = 0;
			if(!"未激活".equals(trans.getAccountState())){
				o5y = ConvertUtil.parseDouble(trans.getOverTimes5ys());
				double o5y90ds =  ConvertUtil.parseDouble(trans.getOverTimes5ys90ds());
				overdueTimesInL5Y = overdueTimesInL5Y + o5y;
				overdueMoreThan90DL5Y = overdueMoreThan90DL5Y + o5y90ds;
			}
			if(o5y <= 0){
				 double temp = ConvertUtil.computer2DtStrMonths(trans.getTransactionIssueDate(), reportDate);
				 if(temp > MOBNeverOverdueAccount){
					 MOBNeverOverdueAccount = temp;
				 }
			}
			//transactionType = 信用卡 
			if("信用卡".equals(trans.getTransactionType())){
				//信用卡明细中，所有账户中最早开户的账户，“发放时间”到“报告时间”的月份数（所有账户状态）.compareTo(trans.getTransactionIssueDate())>0
				double term = ConvertUtil.computer2DtStrMonths(reportDate, trans.getTransactionIssueDate());
				if(maxOldCardDt < term){
					maxOldCardDt = term;
				}
				//信用卡的SUM（信用额度） SUM(已使用额度)
				double totalAmount = ConvertUtil.parseDouble(trans.getTransactionCreditAmountTotal());
				double usedAmount = ConvertUtil.parseDouble(trans.getTransactionUsedCreditAmount());
				cardTotalAmount = cardTotalAmount + totalAmount;
				cardUsedAmount = cardUsedAmount + usedAmount;
			}
			if("住房贷款".equals(trans.getTransactionType())&&"正常".equals(trans.getAccountState())){
				houseLoanRetunMs.add(ConvertUtil.computer2DtStrMonths(trans.getTransactionIssueDate(), reportDate));
				double leftLoanAmount =ConvertUtil.parseDouble(trans.getTransactionLeftCreditAmount());
				double leftTermMonth = ConvertUtil.computer2DtStrMonths(trans.getTransactionEndDate(), reportDate);
				houseLoanAmountM.add(ConvertUtil.computerLoanMonthReturnAmount(DataConstant.HOUSE_LOAN_BASE_RATE, leftTermMonth, leftLoanAmount));
			}
			if("其他贷款".equals(trans.getTransactionType())){
				double leftLoanAmount = ConvertUtil.parseDouble(trans.getTransactionLeftCreditAmount());
				double leftTermMonth = ConvertUtil.computer2DtStrMonths(trans.getTransactionEndDate(), reportDate);
				double otherLoanAmount = ConvertUtil.computerLoanMonthReturnAmount(DataConstant.OTHER_LOAN_BASE_RATE, leftTermMonth, leftLoanAmount);
				otherMonthTotalAmount = otherMonthTotalAmount +otherLoanAmount;
				otherLoanAmountM.add(otherLoanAmount);
			}
			
		}
		
		for(DataCreditQueryInfo qury :queryList){
			if(qury.getQueryReason().contains("审批") && ConvertUtil.computer2DtStrMonths(qury.getQueryDt(), reportDate)<=6 ){
				queryTimesL6M  = queryTimesL6M + 1;
			}
		}
		//过去5年的逾期次数
		briefReport.setOverdueTimesInL5Y(ConvertUtil.transDouble2intStr(overdueTimesInL5Y));
		//过去5年90天以上逾期次数
		briefReport.setOverdueMoreThan90DL5Y(ConvertUtil.transDouble2intStr(overdueMoreThan90DL5Y));
		////发生过90天以上逾期账户数（信用卡+房贷+其他贷款）
		double allOverdueNum90D = ConvertUtil.parseDouble(dataCreditBriefOutlineInfo.getOverdue90dCreditNum())
				+ ConvertUtil.parseDouble(dataCreditBriefOutlineInfo.getOverdue90dHouseLoanNum())
				+ ConvertUtil.parseDouble(dataCreditBriefOutlineInfo.getOverdue90dOtherLoanNum());
		briefReport.setAllOverdueNum90D(ConvertUtil.transDouble2intStr(allOverdueNum90D));
		//有过逾期的账户占比
		//逾期账户总数 -- 概要获取
		overAccSum = ConvertUtil.parseDouble(dataCreditBriefOutlineInfo.getOverdueCreditNum())
				+ ConvertUtil.parseDouble(dataCreditBriefOutlineInfo.getOverdueHouseLoanNum())
				+ ConvertUtil.parseDouble(dataCreditBriefOutlineInfo.getOverdueOtherLoanNum());
		//账户总数  -- 概要获取
		creditAccSum = ConvertUtil.parseDouble(dataCreditBriefOutlineInfo.getCreditNum())
				+ ConvertUtil.parseDouble(dataCreditBriefOutlineInfo.getHouseLoanNum())
				+ ConvertUtil.parseDouble(dataCreditBriefOutlineInfo.getOtherLoanNum());
		briefReport.setOverdueAccountRate(ConvertUtil.returnRate(overAccSum, creditAccSum));
		//申请人信用卡最长账龄
		briefReport.setCCMOB(ConvertUtil.transDouble2intStr(maxOldCardDt));
		//从未逾期账户距今最长账龄
		briefReport.setMOBNeverOverdueAccount(ConvertUtil.transDouble2intStr(MOBNeverOverdueAccount));
		//贷记卡额度使用率
		briefReport.setCCUtilizationRate(ConvertUtil.returnRate(cardUsedAmount, cardTotalAmount));
		//资产处置信息笔数
		briefReport.setAssetsDisposalNumS(ConvertUtil.transDoubleStr2intStr(dataCreditBriefOutlineInfo.getOverdueAssetDisposalNum()));
		//保证人代偿信息笔数
		briefReport.setGuaranteeRepayNumS(ConvertUtil.transDoubleStr2intStr(dataCreditBriefOutlineInfo.getOverdueAssurerNum()));
		//最近6个月审批查询次数
		briefReport.setInqueryTimesL6M(ConvertUtil.transDouble2intStr(queryTimesL6M));
		//房贷已还款月份
		briefReport.setHouseLoanRetunMs(houseLoanRetunMs);
		//房贷月还金额
		briefReport.setHouseLoanAmountM(houseLoanAmountM);
		//其他贷款月还金额
		briefReport.setOtherLoanAmountM(otherLoanAmountM);
		//月负债额 SUM（SUM（信用卡明细中的已使用额度）*0.1，SUM（其他贷款的月还金额））
		monthlyDebts = 0.1 * cardUsedAmount + otherMonthTotalAmount;
		briefReport.setMonthlyDebts(monthlyDebts+"");
		
		return briefReport;
		
	}

	/**
	 * <p> description : 生成详版 必输 json
	 * <p> author   : Spole
	 * <p> date 	: 2017年6月8日
	 * <p> methodName ：transReportDto2DitalBean
	 * <p> paramters  : @param reportDto
	 * <p> return	: CreditDetailReport
	 * <p> update date:2017年6月13日14:48:49
	 * <p>
	 */
	private static CreditDetailReport transReportDto2DitalBean(CreditReportDto reportDto) {
		String lastRepaymentRate = null;
		String utilizationRateOfCC = null;
		String houseLoanNum = null;
		String unclearedMortgageLoanRate = null;
		String JYLoanNonOverdueRateL12M = null;
		String CCRepaymentRate = null;
		String CCutilizationOver30NumRate;
		CreditDetailReport report = new CreditDetailReport();
		
		DataCreditDatilOutlineInfo dataCreditDatilOutlineInfo = reportDto.getDataCreditDatilOutlineInfo();
		List<DataCreditDatilTransactionInfo> datilLoanTransList=reportDto.getDatilLoanTransList();
		List<DataCreditDatilTransactionInfo> datilCreditCardTransList=reportDto.getDatilCreditCardTransList();
		Integer inqueryTimesL6M = 0 ,inqueryTimesL12M =0,CCUtilizationOver100Num=0,CCUtilizationOver30Num=0;
		String reportDate=reportDto.getDataCreditReportInfo().getCreditReportDt();//报告日期
	
		//贷记卡明细
		String ransactionThismonthReturnedAmount=null;//本月实还
		String ransactionThismonthReturnAmount=null;//本月应还
		Double thisMonthReturnedAmount=0.00;//本月实还
		Double thismonthReturnAmount=0.00;//本月应还
		
		String transactionUsedCreditAmount = null;//已用额度
		Double userdCreditAmount=0.00;
		
		String transactionShareCreditAmountTotal=null;//共享额度
		Double shareCreditAmountTotal=0.00;
		
		Integer months=0;
		String transactionIssueDate=null;//发放时间		
		List<Integer> maxMonths_credit=new ArrayList<Integer>();//信用卡月份数
		List<Integer> maxMonths_all=new ArrayList<Integer>();//贷款和信用卡最大月份数
		
		List<Integer> L6M=new ArrayList<Integer>();//近6个月贷款、贷记卡最大逾期期数
		List<Integer> L12M=new ArrayList<Integer>();//近12个月贷款、贷记卡最大逾期期数
		List<Integer> L24M=new ArrayList<Integer>();//近24个月贷款、贷记卡最大逾期期数
		
//		Integer maxOverdueL6M=0;
//		Integer maxOverdueL24M=0;
		Integer maxOverdueL12M=0;//近12个月贷款最大逾期期数
		List<Integer> maxOverdueL12M_max = new ArrayList<>();
		
		//近6个月贷款、贷记卡最大逾期期数		
		Integer CLmaxOverdueL6M=0;
		Integer CLmaxOverdueL12M=0;
		Integer CLmaxOverdueL24M=0;
		
		Integer CLOverdueM2PlusL6M=0;
		Integer CLOverdueM1PlusL12M=0;		
		Integer CLOverdueM2PlusL12M=0;		
		Integer CLOverdueM1PlusL24M=0;			
		Integer CLOverdueM2PlusL24M=0;			
		
//		String transactionLast6monthUsedCreditAmountAvg=null;//最近六个月平均使用额度
//		Double last6monthUsedCreditAmountAvg=0.00;
		String ransactionLast24termOverdueStatus=null;//最近24个月还款记录
		
		Integer overdueLoanNumber_loan=0;
		Integer overdueLoanNumber_credit=0;
		Integer overdueLoanNumber_L6M=0;//近6个月逾期总次数
		Integer monthsOfOverdueL24M=0;//近24个月逾期的月份数
//		Integer monthsOfOverdueL24M_loan=0;//近24个月逾期的月份数——贷款
//		Integer monthsOfOverdueL24M_card=0;//近24个月逾期的月份数——信用卡
		List<String> monthsOfOverdueL24M_List = new ArrayList<>();
		List<String> monthsOfOverdueL24M_loanList = new ArrayList<>();
		List<String> monthsOfOverdueL24M_cardList = new ArrayList<>();
		Integer totalOverdueTimesL12M=0;//信贷账户最近12个月逾期次数之和
		Integer worstOverdueL12M=null;//信贷账户最近12个月最坏逾期状态 (最大值)
		List<Integer> worstOverdueL12M_max=new ArrayList<Integer>();//信贷账户最近12个月最坏逾期状态 (最大值)
		Integer JYLoanNonOverdueRateL12M_fenzi=0;//过去12个月经营类贷款从未逾期账户占比
		Integer JYLoanNonOverdueRateL12M_fenmu=0;
		Integer creditAccountNum=0;//信贷总账户数
		Integer overdueAccountRateL6M=0;
		Integer unclearedMortgageLoan_fenzi=0;//未结清抵押贷款比例
		Integer unclearedMortgageLoan_fenmu=0;
		Integer OverdueMonthToNow=0;//最近一次逾期距今月份数
		List<Integer> OverdueMonthToNow_max=new ArrayList<Integer>();
		
		//贷款明细
		for (DataCreditDatilTransactionInfo dataCreditDatilTransactionInfo : datilLoanTransList) {
			transactionIssueDate=dataCreditDatilTransactionInfo.getTransactionIssueDate();
			ransactionLast24termOverdueStatus=dataCreditDatilTransactionInfo.getRansactionLast24termOverdueStatus();
			//从未逾期账户最长账龄
			if(StringUtils.isNotBlank(transactionIssueDate)){
				//信用卡明细、住房贷款明细，24个月中没有数字大于0的账户，“发放时间”到“报告时间”的月份数
				//68表示Excel为空字符，后台以“&@”拼接之后的长度，实际中此字符串都是有值的
				if(ransactionLast24termOverdueStatus.length()!=68){
					//匹配数字，true表示有逾期，有赋值0，非true表示没有，没有的话 就进行计算
					if(ConvertUtil.getStr(ransactionLast24termOverdueStatus, 24).matches("[\\S]*[0-9]+[\\S]*")){
						months=0;
					}
					else{
						months=ConvertUtil.getMonthDiff(reportDate,transactionIssueDate);
						maxMonths_all.add(months);
					}
				}
				else{
					maxMonths_all.add(0);
				}
				//近6个月贷款、贷记卡最大逾期期数		
				if(ConvertUtil.getMaxNum(ransactionLast24termOverdueStatus, 6) > 0 ){
					CLmaxOverdueL6M=ConvertUtil.getMaxNum(ransactionLast24termOverdueStatus, 6);
					L6M.add(CLmaxOverdueL6M);
				}
				//近12个月贷款、贷记卡最大逾期期数		
				if(ConvertUtil.getMaxNum(ransactionLast24termOverdueStatus, 12) > 0 ){
					CLmaxOverdueL12M=ConvertUtil.getMaxNum(ransactionLast24termOverdueStatus, 12);
					L12M.add(CLmaxOverdueL12M);
				}
				//近24个月贷款、贷记卡最大逾期期数		
				if(ConvertUtil.getMaxNum(ransactionLast24termOverdueStatus, 24) > 0 ){
					CLmaxOverdueL24M=ConvertUtil.getMaxNum(ransactionLast24termOverdueStatus, 24);
					L24M.add(CLmaxOverdueL24M);
				}
				//贷款贷记卡近6个月M2+逾期次数      贷款明细与信用卡明细中，所有“最近24个月还款记录”中，在19-24格中，>=2的次数总和
				if(ConvertUtil.getIntCount(ransactionLast24termOverdueStatus,6,2) > 0 ){
					CLOverdueM2PlusL6M=ConvertUtil.getIntCount(ransactionLast24termOverdueStatus,6,2);
				}
				//贷款贷记卡近12个月M1+逾期次数      贷款明细与信用卡明细中，所有“最近24个月还款记录”中，在13-24格中，>=1的次数总和
				if(ConvertUtil.getIntCount(ransactionLast24termOverdueStatus,12,1) > 0 ){
					CLOverdueM1PlusL12M=ConvertUtil.getIntCount(ransactionLast24termOverdueStatus,12,1);
				}
				//贷款贷记卡近12个月M2+逾期次数     贷款明细与信用卡明细中，所有“最近24个月还款记录”中，在13-24格中，>=2的次数总和
				if(ConvertUtil.getIntCount(ransactionLast24termOverdueStatus,12,2) > 0 ){
					CLOverdueM2PlusL12M=ConvertUtil.getIntCount(ransactionLast24termOverdueStatus,12,2);
				}
				//贷款贷记卡近24个月M1+逾期次数      贷款明细与信用卡明细中，所有“最近24个月还款记录”中，在1-24格中，>=1的次数总和
				if(ConvertUtil.getIntCount(ransactionLast24termOverdueStatus,24,1) > 0 ){
					CLOverdueM1PlusL24M=ConvertUtil.getIntCount(ransactionLast24termOverdueStatus,24,1);
				}
				//贷款贷记卡近24个月M2+逾期次数      贷款明细与信用卡明细中，所有“最近24个月还款记录”中，在1-24格中，>=2的次数总和
				if(ConvertUtil.getIntCount(ransactionLast24termOverdueStatus,24,2) > 0 ){
					CLOverdueM2PlusL24M=ConvertUtil.getIntCount(ransactionLast24termOverdueStatus,24,2);
				}
				//状态为逾期的贷款账户数	>0
				if(ConvertUtil.getIntCount(ransactionLast24termOverdueStatus,24,0) > 0 ){
					overdueLoanNumber_loan=ConvertUtil.getIntCount(ransactionLast24termOverdueStatus,24,0);
				}
				//近6个月逾期总次数 
				if(ConvertUtil.getSum(ransactionLast24termOverdueStatus,6) > 0 ){
					overdueLoanNumber_L6M=ConvertUtil.getSum(ransactionLast24termOverdueStatus,6);
				}
				//最近一次逾期距今月份数
				if(ConvertUtil.getIntLastMonth(ransactionLast24termOverdueStatus, 24) > 0 ){
					OverdueMonthToNow=24 - ConvertUtil.getIntLastMonth(ransactionLast24termOverdueStatus, 24);
					OverdueMonthToNow_max.add(OverdueMonthToNow);
				}
				//近24个月逾期的月份数  贷款明细与信用卡明细中，所有“最近24个月还款记录”中，有逾期账户的月份数（每个竖条中，若有>0的记录，则记为1，再求和）
				monthsOfOverdueL24M_loanList.add(ransactionLast24termOverdueStatus);
				monthsOfOverdueL24M_List.add(ransactionLast24termOverdueStatus);
//				if(ConvertUtil.getMonthCount(monthsOfOverdueL24M_loanList) > 0 ){
//					monthsOfOverdueL24M_loan= ConvertUtil.getMonthCount(monthsOfOverdueL24M_loanList);
//					
//				}
				//近12个月贷款最大逾期期数
				if(ConvertUtil.getMaxNum(ransactionLast24termOverdueStatus, 12) > 0 ){
					maxOverdueL12M= ConvertUtil.getMaxNum(ransactionLast24termOverdueStatus, 12); 
					maxOverdueL12M_max.add(maxOverdueL12M);
				}
				//信贷账户最近12个月逾期次数之和
				if(ConvertUtil.getSum(ransactionLast24termOverdueStatus,12) > 0 ){
					totalOverdueTimesL12M=ConvertUtil.getSum(ransactionLast24termOverdueStatus,12);
				}
				//信贷账户最近12个月最坏逾期状态 (最大值)
				if(ConvertUtil.getMaxNum(ransactionLast24termOverdueStatus, 12) > 0 ){
					worstOverdueL12M_max.add(ConvertUtil.getMaxNum(ransactionLast24termOverdueStatus, 12));
				}
				//过去12个月经营类贷款从未逾期账户占比   12个月中未逾期贷款账户数/个人经营性贷款账户数		
				if(dataCreditDatilTransactionInfo.getTransactionLoanType().contains(DataConstant.PERSONAL_BUSINES_LOANS)){
					//匹配数字，表示逾期的账户数
					if(ConvertUtil.getStr(ransactionLast24termOverdueStatus, 12).matches("[\\S]*[0-9]+[\\S]*")){
						JYLoanNonOverdueRateL12M_fenzi++;
					}
					//分母
					JYLoanNonOverdueRateL12M_fenmu++;
				}
				
				 //未结清抵押贷款比例           未结清抵押贷款/分母是抵押类型是抵押担保和 组合担保
				if(dataCreditDatilTransactionInfo.getTransactionLoanMortgageType().contains(DataConstant.PLEDGE_ASSURE) ||
						dataCreditDatilTransactionInfo.getTransactionLoanMortgageType().contains(DataConstant.GROUP_ASSURE)){
					//未结清抵押贷款比例       分子
					if(!dataCreditDatilTransactionInfo.getTransactionStatus().contains(DataConstant.CLEARED_LOANS_STATUS)){
						unclearedMortgageLoan_fenzi++;
					}
					//分母
					unclearedMortgageLoan_fenmu++;
				}
				//信贷账户总账户数   贷款状态是正常和结清；贷记卡状态是正常
//				if(dataCreditDatilTransactionInfo.getTransactionStatus().contains(DataConstant.NORMAL_LOANS_STATUS) ||
//						dataCreditDatilTransactionInfo.getTransactionStatus().contains(DataConstant.CLEARED_LOANS_STATUS)){
//					creditAccountNum++;
//				}
				if(StringUtil.isNotEmpty(dataCreditDatilTransactionInfo.getTransactionStatus())&&!"结清,销户".contains(dataCreditDatilTransactionInfo.getTransactionStatus())){
					creditAccountNum++;
				}
				//近六个月逾期的账户占比    贷款明细与信用卡明细中，所有“最近24个月还款记录”中状态为“正常”的客户，分子为19-24格中有>0的账户数量，分母为账户总数
				if(ConvertUtil.getStr(ransactionLast24termOverdueStatus, 6).matches("[\\S]*[0-9]+[\\S]*")){
					overdueAccountRateL6M++;
				}
			}
		}
		//信用卡明细
		for (DataCreditDatilTransactionInfo dataCreditDatilTransactionInfo : datilCreditCardTransList) {
			transactionIssueDate=dataCreditDatilTransactionInfo.getTransactionIssueDate();
			ransactionLast24termOverdueStatus=dataCreditDatilTransactionInfo.getRansactionLast24termOverdueStatus();
			//从未逾期账户最长账龄
			if(StringUtils.isNotBlank(transactionIssueDate)){
				//信用卡明细、住房贷款明细，24个月中没有数字大于0的账户，“发放时间”到“报告时间”的月份数
				//68表示Excel为空字符，后台以“&@”拼接之后的长度，实际中此字符串都是有值的
				if(ransactionLast24termOverdueStatus.length()!=68){
					//匹配数字，true表示有逾期，有赋值0，非true表示没有，没有的话 就进行计算
					if(ConvertUtil.getStr(ransactionLast24termOverdueStatus, 24).matches("[\\S]*[0-9]+[\\S]*")){
						months=0;
					}
					else{
						months=ConvertUtil.getMonthDiff(reportDate,transactionIssueDate);
						maxMonths_all.add(months);
					}
				}
				else{
					maxMonths_all.add(0);
				}
			}
			//近6个月贷款、贷记卡最大逾期期数		
			if(ConvertUtil.getMaxNum(ransactionLast24termOverdueStatus, 6) > 0 ){
				CLmaxOverdueL6M=ConvertUtil.getMaxNum(ransactionLast24termOverdueStatus, 6);
				L6M.add(CLmaxOverdueL6M);
			}
			//近12个月贷款、贷记卡最大逾期期数		
			if(ConvertUtil.getMaxNum(ransactionLast24termOverdueStatus, 12) > 0 ){
				CLmaxOverdueL12M=ConvertUtil.getMaxNum(ransactionLast24termOverdueStatus, 12);
				L12M.add(CLmaxOverdueL12M);
			}
			//近24个月贷款、贷记卡最大逾期期数		
			if(ConvertUtil.getMaxNum(ransactionLast24termOverdueStatus, 24) > 0 ){
				CLmaxOverdueL24M=ConvertUtil.getMaxNum(ransactionLast24termOverdueStatus, 24);
				L24M.add(CLmaxOverdueL24M);
			}
			//贷款贷记卡近6个月M2+逾期次数      贷款明细与信用卡明细中，所有“最近24个月还款记录”中，在19-24格中，>=2的次数总和
			if(ConvertUtil.getIntCount(ransactionLast24termOverdueStatus,6,2) > 0 ){
				CLOverdueM2PlusL6M=CLOverdueM2PlusL6M+ ConvertUtil.getIntCount(ransactionLast24termOverdueStatus,6,2);
			}
			//贷款贷记卡近12个月M1+逾期次数      贷款明细与信用卡明细中，所有“最近24个月还款记录”中，在13-24格中，>=1的次数总和
			if(ConvertUtil.getIntCount(ransactionLast24termOverdueStatus,12,1) > 0 ){
				CLOverdueM1PlusL12M=CLOverdueM1PlusL12M+ ConvertUtil.getIntCount(ransactionLast24termOverdueStatus,12,1);
			}
			//贷款贷记卡近12个月M2+逾期次数     贷款明细与信用卡明细中，所有“最近24个月还款记录”中，在13-24格中，>=2的次数总和
			if(ConvertUtil.getIntCount(ransactionLast24termOverdueStatus,12,2) > 0 ){
				CLOverdueM2PlusL12M=CLOverdueM2PlusL12M+ ConvertUtil.getIntCount(ransactionLast24termOverdueStatus,12,2);
			}
			//贷款贷记卡近24个月M1+逾期次数      贷款明细与信用卡明细中，所有“最近24个月还款记录”中，在1-24格中，>=1的次数总和
			if(ConvertUtil.getIntCount(ransactionLast24termOverdueStatus,24,1) > 0 ){
				CLOverdueM1PlusL24M=CLOverdueM1PlusL24M+ ConvertUtil.getIntCount(ransactionLast24termOverdueStatus,24,1);
			}
			//贷款贷记卡近24个月M2+逾期次数      贷款明细与信用卡明细中，所有“最近24个月还款记录”中，在1-24格中，>=2的次数总和
			if(ConvertUtil.getIntCount(ransactionLast24termOverdueStatus,24,2) > 0 ){
				CLOverdueM2PlusL24M=CLOverdueM1PlusL24M+ ConvertUtil.getIntCount(ransactionLast24termOverdueStatus,24,2);
			}
			//状态为逾期的贷记卡账户数	>0
			if(ConvertUtil.getIntCount(ransactionLast24termOverdueStatus,24,0) > 0 ){
				overdueLoanNumber_credit=ConvertUtil.getIntCount(ransactionLast24termOverdueStatus,24,0);
			}
			//近6个月逾期总次数 
			if(ConvertUtil.getSum(ransactionLast24termOverdueStatus,6) > 0 ){
				overdueLoanNumber_L6M=overdueLoanNumber_L6M + ConvertUtil.getSum(ransactionLast24termOverdueStatus,6);
			}
			//最近一次逾期距今月份数
			if(ConvertUtil.getIntLastMonth(ransactionLast24termOverdueStatus, 24) > 0 ){
				OverdueMonthToNow=24 - ConvertUtil.getIntLastMonth(ransactionLast24termOverdueStatus, 24);
				OverdueMonthToNow_max.add(OverdueMonthToNow);
			}
			//近24个月逾期的月份数  贷款明细与信用卡明细中，所有“最近24个月还款记录”中，有逾期账户的月份数（每个竖条中，若有>0的记录，则记为1，再求和）
			monthsOfOverdueL24M_cardList.add(ransactionLast24termOverdueStatus);
			monthsOfOverdueL24M_List.add(ransactionLast24termOverdueStatus);
//			if(ConvertUtil.getMonthCount(monthsOfOverdueL24M_cardList) > 0 ){
//				monthsOfOverdueL24M_card= ConvertUtil.getMonthCount(monthsOfOverdueL24M_cardList);
//			}
			//信贷账户最近12个月逾期次数之和
			if(ConvertUtil.getSum(ransactionLast24termOverdueStatus,12) > 0 ){
				totalOverdueTimesL12M= totalOverdueTimesL12M + ConvertUtil.getSum(ransactionLast24termOverdueStatus,12);
			}
			//信贷账户最近12个月最坏逾期状态 (最大值)
			if(ConvertUtil.getMaxNum(ransactionLast24termOverdueStatus, 12) > 0 ){
				worstOverdueL12M_max.add(ConvertUtil.getMaxNum(ransactionLast24termOverdueStatus, 12));
			}
			//信贷账户总账户数   贷款状态是正常和结清；贷记卡状态是正常
			if(DataConstant.NORMAL_LOANS_STATUS.equals(dataCreditDatilTransactionInfo.getTransactionStatus())){
				creditAccountNum++;
			}
			//近六个月逾期的账户占比    贷款明细与信用卡明细中，所有“最近24个月还款记录”中状态为“正常”的客户，分子为19-24格中有>0的账户数量，分母为账户总数
			if(ConvertUtil.getStr(ransactionLast24termOverdueStatus, 6).matches("[\\S]*[0-9]+[\\S]*")){
				overdueAccountRateL6M++;
			}
			//申请人信用卡最长账龄  信用卡明细中，所有账户中最早开户的账户，“发放时间”到“报告时间”的月份数
			if(StringUtils.isNotBlank(transactionIssueDate)){
				months=ConvertUtil.getMonthDiff(reportDate,transactionIssueDate);
				maxMonths_credit.add(months);
			}
			//未结清贷记卡还款率     贷记卡状态正常的，实还/应还		
			if(StringUtils.isNotBlank(dataCreditDatilTransactionInfo.getTransactionStatus()) && 
					DataConstant.NORMAL_LOANS_STATUS.equals(dataCreditDatilTransactionInfo.getTransactionStatus())){
				//本月实还
				if(StringUtils.isNotBlank(dataCreditDatilTransactionInfo.getRansactionThismonthReturnedAmount())){
					ransactionThismonthReturnedAmount=dataCreditDatilTransactionInfo.getRansactionThismonthReturnedAmount();
					thisMonthReturnedAmount=thisMonthReturnedAmount+ConvertUtil.parseDouble(ransactionThismonthReturnedAmount);
				}
				//本月应还
				if(StringUtils.isNotBlank(dataCreditDatilTransactionInfo.getRansactionThismonthReturnAmount())){
					ransactionThismonthReturnAmount=dataCreditDatilTransactionInfo.getRansactionThismonthReturnAmount();
					thismonthReturnAmount=thismonthReturnAmount+ConvertUtil.parseDouble(ransactionThismonthReturnAmount);
				}
			}
			//共享额度
			if(StringUtils.isNotBlank(dataCreditDatilTransactionInfo.getTransactionShareCreditAmountTotal())){
				transactionShareCreditAmountTotal=dataCreditDatilTransactionInfo.getTransactionShareCreditAmountTotal();
				shareCreditAmountTotal=shareCreditAmountTotal+ConvertUtil.parseDouble(transactionShareCreditAmountTotal);
			}
			if(StringUtils.isNotBlank(dataCreditDatilTransactionInfo.getTransactionUsedCreditAmount())){
				transactionUsedCreditAmount=dataCreditDatilTransactionInfo.getTransactionUsedCreditAmount();
				userdCreditAmount=userdCreditAmount+ConvertUtil.parseDouble(transactionUsedCreditAmount);
				//信用卡额度使用率超过100%的账户数
				utilizationRateOfCC=ConvertUtil.returnRate(userdCreditAmount, shareCreditAmountTotal);
				if(ConvertUtil.parseDouble(utilizationRateOfCC)>=1){
					CCUtilizationOver100Num++;
				}
				//信用卡额度使用率超过30%的账户占比
				if(ConvertUtil.parseDouble(utilizationRateOfCC)>=0.3){
					CCUtilizationOver30Num++;
				}
			}
		}
		//查询记录
		String queryDate=null;
		boolean compareDate=false;
		boolean compareDate2=false;
		for(DataCreditQueryInfo query : reportDto.getQueryList()){
			queryDate=query.getQueryDt();
			if(StringUtils.isNotBlank(queryDate)){
				//近6个月审批查询次数
				try {
					compareDate=ConvertUtil.compareDate(ConvertUtil.getPastDateStr(queryDate, 6), reportDate);
					if(query.getQueryReason().contains("审批") && compareDate){
						inqueryTimesL6M++;
					}
					//近12个月审批查询次数
					compareDate2=ConvertUtil.compareDate(ConvertUtil.getPastDateStr(queryDate, 12), reportDate);
					if(query.getQueryReason().contains("审批") && compareDate2){
						inqueryTimesL12M++;
					}
				} catch (ParseException e) {
					// TODO Auto-generated catch block
				}
				
			}
		}
		
		//信贷账户最近12个月最坏逾期状态
		worstOverdueL12M=worstOverdueL12M_max.size()>0?Collections.max(worstOverdueL12M_max):0;
		report.setWorstOverdueL12M(worstOverdueL12M.toString());
		
		//最近一次逾期距今月份数
		OverdueMonthToNow = OverdueMonthToNow_max.size()>0?Collections.max(OverdueMonthToNow_max):0;
		report.setOverdueMonthToNow(OverdueMonthToNow.toString());
		
		//未结清贷记卡还款率
		CCRepaymentRate=ConvertUtil.returnRate(thisMonthReturnedAmount, thismonthReturnAmount);
		logger.info(thisMonthReturnedAmount+"分子*****分母"+thismonthReturnAmount);
		logger.info("未结清贷记卡还款率:"+CCRepaymentRate);
		report.setCCRepaymentRate(CCRepaymentRate);
		//信用卡上期账单还款率
	    lastRepaymentRate=ConvertUtil.returnRate(thisMonthReturnedAmount, thismonthReturnAmount);
	    logger.info(thisMonthReturnedAmount+"分子*****分母"+thismonthReturnAmount);
	    logger.info("信用卡上期账单还款率:"+lastRepaymentRate);
	    report.setLastRepaymentRate(lastRepaymentRate);
		//过去12个月经营类贷款从未逾期账户占比
	    Double JYLoanNonOverdueRate_L12M=0.00;
	    //分母不能为0
	    if(JYLoanNonOverdueRateL12M_fenmu!=0){
	    	JYLoanNonOverdueRateL12M=ConvertUtil.returnRate(JYLoanNonOverdueRateL12M_fenzi.doubleValue(), JYLoanNonOverdueRateL12M_fenmu.doubleValue());//小数
			JYLoanNonOverdueRate_L12M = 1-ConvertUtil.parseDouble(JYLoanNonOverdueRateL12M);//1-逾期占比=未逾期占比
	    }
		logger.info(JYLoanNonOverdueRateL12M_fenzi+"分子*****分母"+JYLoanNonOverdueRateL12M_fenmu);
		logger.info("过去12个月经营类贷款从未逾期账户占比:"+JYLoanNonOverdueRate_L12M);
		report.setJYLoanNonOverdueRateL12M(JYLoanNonOverdueRate_L12M.toString());
	    //未结清抵押贷款比例
		unclearedMortgageLoanRate=ConvertUtil.returnRate(unclearedMortgageLoan_fenzi.doubleValue(),unclearedMortgageLoan_fenmu.doubleValue());
		logger.info(unclearedMortgageLoan_fenzi+"分子*****分母"+unclearedMortgageLoan_fenmu);
		logger.info("未结清抵押贷款比例:"+unclearedMortgageLoanRate);
		report.setUnclearedMortgageLoanRate(unclearedMortgageLoanRate.toString());
	    //近六个月逾期的账户占比
		String overdueAccountRate_L6M=ConvertUtil.returnRate(overdueAccountRateL6M.doubleValue(), creditAccountNum.doubleValue());
		logger.info(overdueAccountRateL6M+"分子*****分母"+creditAccountNum);
		logger.info("近六个月逾期的账户占比:"+overdueAccountRate_L6M);
//		overdueAccountRate_L6M = ConvertUtil.returnRate(Double.valueOf(over6mAccNO),Double.valueOf(accNo));
		report.setOverdueAccountRateL6M(overdueAccountRate_L6M);
		//信用卡额度使用率超过30%的账户占比
		CCutilizationOver30NumRate=ConvertUtil.returnRate(CCUtilizationOver30Num.doubleValue(), creditAccountNum.doubleValue());
		logger.info(CCUtilizationOver30Num+"分子*****分母"+creditAccountNum);
		logger.info("额度使用率超过30%的账户占比:"+CCutilizationOver30NumRate);
		report.setCCutilizationOver30NumRate(CCutilizationOver30NumRate);
	    //贷记卡额度使用率
	    utilizationRateOfCC=ConvertUtil.returnRate(userdCreditAmount, shareCreditAmountTotal);	
	    logger.info(userdCreditAmount+"分子*****分母"+shareCreditAmountTotal);
	    logger.info("贷记卡额度使用率:"+utilizationRateOfCC);
	    report.setUtilizationRateOfCC(utilizationRateOfCC);

		//近6个月信用卡平均余额
		String CCAvergeBalanceL6M = null;
		if(StringUtils.isNotBlank(dataCreditDatilOutlineInfo.getHouseLoanNum())){
			CCAvergeBalanceL6M=dataCreditDatilOutlineInfo.getNoCancellationCreditLast6mouthPayAvg();
		}
		report.setCCAvergeBalanceL6M(CCAvergeBalanceL6M);
		//近6个月逾期总次数
		report.setCLOverdueL6M(overdueLoanNumber_L6M.toString());
		//近24个月逾期的月份数
//		monthsOfOverdueL24M=monthsOfOverdueL24M_loan+monthsOfOverdueL24M_card;
		
		monthsOfOverdueL24M = ConvertUtil.getMonthCount(monthsOfOverdueL24M_List);
		report.setMonthsOfOverdueL24M(monthsOfOverdueL24M.toString());
		//近12个月贷款最大逾期期数
		maxOverdueL12M=maxOverdueL12M_max.size()>0?Collections.max(maxOverdueL12M_max):0;
		report.setMaxOverdueL12M(maxOverdueL12M.toString());
		//信贷账户最近12个月逾期次数之和
		report.setTotalOverdueTimesL12M(totalOverdueTimesL12M.toString());
	    
	    report.setInqueryTimesL6M(inqueryTimesL6M.toString());//近6个月审批查询次数
	    report.setCreditAccountNum(creditAccountNum.toString());//信贷账户总账户数
	    
	    if(StringUtils.isBlank(dataCreditDatilOutlineInfo.getHouseLoanNum())){
	    	houseLoanNum="9999";
		}
	    else{
	    	 houseLoanNum=dataCreditDatilOutlineInfo.getHouseLoanNum();//房贷笔数
	    }
	    report.setHouseLoanNum(houseLoanNum);
	    report.setInqueryTimesL12M(inqueryTimesL12M.toString());//近12个月审批查询次数
	    report.setCCUtilizationOver100Num(CCUtilizationOver100Num.toString());//信用卡额度使用率超过100%的账户数
		Integer CCMOB = maxMonths_credit.size()>0?Collections.max(maxMonths_credit):0;//信用卡最长账龄
		Integer MOBNeverOverdueAccount = maxMonths_all.size()>0?Collections.max(maxMonths_all):0;//从未逾期账户最长账龄
    	report.setCCMOB(CCMOB.toString());
 	    report.setMOBNeverOverdueAccount(MOBNeverOverdueAccount.toString());
    	
    	//状态为逾期的贷款账户数
    	report.setOverdueLoanNumber(overdueLoanNumber_loan.toString());
    	//状态为逾期的贷记卡账户数		
    	report.setOverdueCCNumber(overdueLoanNumber_credit.toString());
    	
    	//近6个月贷款、贷记卡最大逾期期数		
    	CLmaxOverdueL6M = L6M.size()>0?Collections.max(L6M):0;
	    report.setCLmaxOverdueL6M(CLmaxOverdueL6M.toString());
	    CLmaxOverdueL12M = L12M.size()>0?Collections.max(L12M):0;
	    report.setCLmaxOverdueL12M(CLmaxOverdueL12M.toString());
	    CLmaxOverdueL24M = L24M.size()>0?Collections.max(L24M):0;
	    report.setCLmaxOverdueL24M(CLmaxOverdueL24M.toString());
	    
	    //贷款贷记卡近6个月M2+逾期次数		
		report.setCLOverdueM2PlusL6M(CLOverdueM2PlusL6M.toString());
		report.setCLOverdueM1PlusL12M(CLOverdueM1PlusL12M.toString());
		report.setCLOverdueM2PlusL12M(CLOverdueM2PlusL12M.toString());
		report.setCLOverdueM1PlusL24M(CLOverdueM1PlusL24M.toString());
		report.setCLOverdueM2PlusL24M(CLOverdueM2PlusL24M.toString());
		return report;
	}
	public static Object trans2Type(String val, Class targetType) {
		Object obj = null;
		if(targetType.equals(Integer.class)){
			try {
				obj = Integer.valueOf(val);
			} catch (Exception e) {
				obj = 0;
			}
		}
		if(targetType.equals(Short.class)){
			try {
				obj = Short.valueOf(val);
			} catch (Exception e1) {
				obj = 0;
			}
		}
		if(targetType.equals(Long.class)){
			try {
				obj = Long.valueOf(val);
			} catch (Exception e1) {
				obj = 0L;
			}
		}
		if(targetType.equals(Double.class)){
			try {
				obj = Double.valueOf(val);
			} catch (Exception e1) {
				obj = 0.0;
			}
		}
		if(targetType.equals(Float.class)){
			try {
				obj = Float.valueOf(val);
			} catch (Exception e1) {
				obj = 0f;
			}
		}
		if(targetType.equals(Boolean.class)){
			try {
				obj = Boolean.valueOf(val);
			} catch (Exception e1) {
				obj = Boolean.FALSE;
			}
		}
		if(targetType.equals(Byte.class)){
			try {
				obj = Byte.valueOf(val);
			} catch (Exception e1) {
				obj = 0;
			}
		}
		if(targetType.toString().contains("Date")){
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");  
			try {
				obj = simpleDateFormat.parseObject(val);
			} catch (Exception e1) {
				obj = new Date();
			}
		}
		if(targetType.equals(String.class)){
			obj = val;
		}
		return obj;
	}
}
