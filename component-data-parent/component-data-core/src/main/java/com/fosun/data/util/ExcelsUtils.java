/**
 * 
 */
package com.fosun.data.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fosun.component.base.exception.CommonException;
import com.fosun.data.dataTask.dto.CreditReportDto;
import com.fosun.data.dataTask.model.DataCreditBriefOutlineInfo;
import com.fosun.data.dataTask.model.DataCreditBriefTransactionInfo;
import com.fosun.data.dataTask.model.DataCreditDatilOutlineInfo;
import com.fosun.data.dataTask.model.DataCreditDatilTransactionInfo;
import com.fosun.data.dataTask.model.DataCreditPublicInfo;
import com.fosun.data.dataTask.model.DataCreditQueryInfo;
import com.fosun.data.dataTask.model.DataCreditReportInfo;

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
public class ExcelsUtils {
	Logger logger = LoggerFactory.getLogger(ExcelsUtils.class);
	public final static String xls = "xls";
	public final static String xlsx = "xlsx";

	/**
	 * excel 文件中要读取单元格的坐标信息
	 * @author Spole
	 *
	 */
	public static class Point{
		/**
		 * excel 文件中要读取单元格的表单的序号 从零开始
		 */
		private int sheetNum;
		/**
		 * excel 文件中 要读取单元格的所在行   从零开始
		 */
		private int x;
		/**
		 * excel 文件中 要读取单元格的所在列   从零开始
		 */
		private int y;
		public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x = x;
		}
		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y = y;
		}
		
		public int getSheetNum() {
			return sheetNum;
		}
		public void setSheetNum(int sheetNum) {
			this.sheetNum = sheetNum;
		}
		/**
		 * <p> 构造函数
		 * <p> @param sheetNum  excel 文件中要读取单元格的表单的序号 从零开始
		 * <p> @param x  excel 文件中 要读取单元格的所在行   从零开始
		 * <p> @param y  excel 文件中 要读取单元格的所在列   从零开始
		 */
		public Point(int sheetNum, int x, int y) {
			super();
			this.sheetNum = sheetNum;
			this.x = x;
			this.y = y;
		}
	}
	/**
	 * <p> 读取指定的Excel文件内容
	 * @param file
	 *            读取的文件
	 * @return List<List<String>> 返回文件中的内容
	 * @throws IOException
	 */
	public static List<List<String>> readExcel(File file)throws IOException{
		// 获得Workbook工作薄对象
		Workbook workbook = null;
		// 创建返回对象，把每行中的值作为一个数组，所有行作为一个集合返回
		List<List<String>> list = new ArrayList<List<String>>();
		try {
			workbook = getWorkBook(file);
			if (workbook != null) {
				for (int sheetNum = 0; sheetNum < workbook.getNumberOfSheets(); sheetNum++) {
					// 获得当前sheet工作表
					Sheet sheet = workbook.getSheetAt(sheetNum);
					if (sheet == null) {
						continue;
					}
					// 获得当前sheet的结束行
					int lastRowNum = sheet.getLastRowNum();
					for (int rowNum = 0; rowNum <= lastRowNum; rowNum++) {
						// 获得当前行
						Row row = sheet.getRow(rowNum);
						if (row == null) {
							continue;
						}
						// 获得当前行的列数row
						int lastCellNum = row.getLastCellNum();
						ArrayList<String> rowList = new ArrayList<String>();
						// 循环当前列
						for (int cellNum = 0; cellNum < lastCellNum; cellNum++) {
							Cell cell = row.getCell(cellNum);
							String cellData = getCell2StringValue(cell);
							rowList.add(cellData);
						}
						list.add(rowList);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(null!=workbook){
				workbook.close();
				workbook = null;
			}
		}
		return list;
	}

	/**
	 * <p> 把指定的list写入指定的要创建的文件中
	 * <p>@param list 要写入Excel文件的list数组
	 * <p> @param resultFileName 生成文件的名称 默认生成2010版本
	 * @throws IOException
	 */
	public static String createExcel(List<List<String>> list, String filePath,int totalLine)throws IOException{
		if (null != list && list.size() > 0) {
			FileOutputStream fos = null;
			try {
				int rowNum = totalLine==0?2:totalLine;
				fos = new FileOutputStream(filePath);
				XSSFWorkbook newxssfWorkbook = new XSSFWorkbook();
				XSSFSheet newsheet = newxssfWorkbook.createSheet("申请单处理结果");
				for (int i = 0; i < rowNum; i++) {
					List<String> cell = list.get(i);// 可能是对象
					if (null == cell || cell.size() == 0) {
						continue;
					}
					XSSFRow newrow = newsheet.createRow(i);
					int cellLength = cell.size();
					for (int j = 0; j < cellLength; j++) {
						String cellData = null;
						try {
							cellData = cell.get(j);
						} catch (Exception e) {
							cellData = null;
						}
						if (null != cellData && cellData.length() > 0) {
							newrow.createCell(j).setCellValue(cellData);
						}
					}

				}
				newxssfWorkbook.write(fos);
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				if(null!=fos){
					fos.close();
					fos = null;
				}
			}
		} else {
			System.out.println("参数有误");
		}
		return filePath;
	}

	/**
	 * <p>在已经存在的excel 中写入数据
	 * @param list
	 * @param resultFileName
	 * @param writeStartLine
	 * @return
	 * @throws IOException
	 */
	public static String writeExcel(List<List<String>> list,
			String resultFileName) throws IOException {
		if (null != list && list.size() > 0) {
			Workbook workBook = getWorkBook(new File(resultFileName));
			Sheet sheet = workBook.getSheet("申请单处理结果");
			int lastRowNo = sheet.getLastRowNum();
			for (int i = 2; i < list.size(); i++) {
				List<String> arr = list.get(i);
				if (null == arr || arr.size() == 0) {
					continue;
				}
				Row createRow = sheet.createRow(lastRowNo - 1 + i);
				for (int j = 0; j < arr.size(); j++) {
					createRow.createCell(j).setCellValue(arr.get(j));
				}
			}
			FileOutputStream fileOut = null;
			try {
				fileOut = new FileOutputStream(resultFileName);
				workBook.write(fileOut);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}finally{
				if(null!=fileOut){
					fileOut.close();
					fileOut = null;
				}
			}
		}
		return null;
	}

	/**
	 * 
	 * @param file
	 *            Excel文件内容java
	 * @return Workbook
	 * @throws IOException
	 */
	private static Workbook getWorkBook(File file) throws IOException {
		// 判断文件是否存在
		if (null == file) {
			throw new FileNotFoundException("文件不存在！");
		}
		// 获得文件名
		String fileName = file.getName();
		// 判断文件是否是excel文件
		if (!fileName.endsWith(xls) && !fileName.endsWith(xlsx)) {
			throw new IOException(fileName + "不是excel文件");
		}
		// 创建Workbook工作薄对象，表示整个excel
		Workbook workbook = null;
		try {
			// 获取excel文件的io流
			InputStream is = new FileInputStream(file);
			// 根据文件后缀名不同(xls和xlsx)获得不同的Workbook实现类对象
			if (fileName.endsWith(xls)) {
				// 2003
				workbook = new HSSFWorkbook(is);
			} else if (fileName.endsWith(xlsx)) {
				// 2007
				workbook = new XSSFWorkbook(is);
			}
		} catch (IOException e) {
		}finally{
//			if(null!=workbook){
//				workbook.close();
//				workbook = null;
//			}
		}
		return workbook;
	}

	/**
	 * <p>
	 * 获取单元格数据内容为字符串类型的数据
	 * 
	 * @param cell
	 * @return
	 */
	private static String getCell2StringValue(Cell cell) {
		String strCell = DataConstant.EXCEL_CELL_BLANK;
		if (cell == null) {
			return strCell;
		}
		switch (cell.getCellType()) {
		case Cell.CELL_TYPE_NUMERIC:
			//科学计数的数字问题  //日期问题
			String  dataFormat = ","+cell.getCellStyle().getDataFormat()+",";
			String  dataFormatString = cell.getCellStyle().getDataFormatString();
			if (HSSFDateUtil.isCellDateFormatted(cell)||null==dataFormatString||
					(DataConstant.EXCEL_CELL_DATAFORMAT_VALUE.contains(dataFormat)&&dataFormatString.matches(DataConstant.EXCEL_CELL_DATAFORMATSTRING_REG))
					) {
            	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
            	strCell = simpleDateFormat.format(cell.getDateCellValue());  
                break;  
            }else {  
            	Object value = cell.getNumericCellValue();  
                //这里处理 数字的科学计算法  
            	strCell  = value.toString();
                if(strCell.contains("E")){  
                    DecimalFormat bdf=new DecimalFormat("#");  
                    strCell = bdf.format(value);  
                }
                break;  
            } 
		case Cell.CELL_TYPE_STRING:
			strCell = "".equals(cell.getStringCellValue().trim()) ? DataConstant.EXCEL_CELL_BLANK
					: cell.getStringCellValue();
			break;
		case Cell.CELL_TYPE_BLANK:
			strCell = DataConstant.EXCEL_CELL_BLANK;
			break;
		case Cell.CELL_TYPE_BOOLEAN:
			strCell = String.valueOf(cell.getBooleanCellValue());
			break;
		default:
			strCell = DataConstant.EXCEL_CELL_BLANK;
			break;
		}
		return strCell;
	}

	
	
	/**
 * 
 * <p> description : 根据指定的配置信息读取excel种内容写入指定的对象中
 * <p> author   : Spole
 * <p> date 	: 2017年6月15日
 * <p> methodName ：readExcelSpecifyCells
 * <p> paramters  : @param file
 * <p> paramters  : @param config
 * <p> paramters  : @param target
 * <p> paramters  : @throws Exception
 * <p> return	: void
 */
	public static void readExcelSpecifyCells(File file,
			Map<String, Point> config, Object target) throws CommonException {
		if(null==target||null==config||config.size()==0){
			throw new CommonException("9999","参错误--配置信息或者写入对象不可为空");
		}
		Class targetClass = target.getClass();// 得到对象的Class
		Field[] targetFields = targetClass.getDeclaredFields();// 得到Class对象的所有属性
		// 获得Workbook工作薄对象
		Workbook workbook = null;
		try {
			workbook = getWorkBook(file);
		} catch (IOException e1) {
			throw new CommonException("9999","参错误--文件不存在");
		}
		if (workbook != null) {
			// 获得第一个页签内容
			int sheetTotalNum = workbook.getNumberOfSheets();
			Sheet[] sheetArr = new Sheet[sheetTotalNum];
			for (int sheetNum = 0; sheetNum < sheetTotalNum; sheetNum++) {
				// 获得指定excel中所有的表单sheet
				sheetArr[sheetNum] = workbook.getSheetAt(sheetNum);
			}
			for (String key : config.keySet()) {
				// ""name key
				Point point = config.get(key);
				String val = getStringValue(sheetArr[point.getSheetNum()],
						point.getX(), point.getY());
				String methodName = key.substring(0, 1).toUpperCase()
						+ key.substring(1);
				for (Field targetField : targetFields) {
					Class targetType = targetField.getType();// 目标属性类型
					String targetName = targetField.getName();// 目标对象的属性名
					if (targetName.equals(key)) {
						Object value = DataUtil.trans2Type(val, targetType);
						try {
							Method setMethod = targetClass.getMethod("set"
									+ methodName, targetType);// 属性对应的set方法
							setMethod.invoke(target, value);// 执行目标对象的set方法
							break;// 为了提高效率。
						} catch (Exception e) {
							break;// 为了提高效率。
						}
	
					}
				}
			}
	
		}
	}

	/**
	 * 
	 * <p> description : 读取征信报告的内容
	 * <p> author   : Spole
	 * <p> date 	: 2017年6月2日
	 * <p> methodName ：readDetailCreditReport
	 * <p> paramters  : @param file
	 * <p> paramters  : @return
	 * <p> paramters  : @throws IOException
	 * <p> return	: CreditReportDto
	 * <p>
	 * <p>
	 */
	public static CreditReportDto readDetailCreditReport(File file)
			throws IOException {
		CreditReportDto report = new CreditReportDto();
		report.setCreditReportType(DataConstant.CREDIT_REPORT_TYPE_DETAIL_VALUE);
		DataCreditReportInfo dataCreditReportInfo = new DataCreditReportInfo();
		DataCreditDatilOutlineInfo dataCreditDatilOutlineInfo = new DataCreditDatilOutlineInfo();
		DataCreditPublicInfo dataCreditPublicInfo = new DataCreditPublicInfo();
		List<DataCreditDatilTransactionInfo> datilLoanTransList = new ArrayList<DataCreditDatilTransactionInfo>();
		List<DataCreditDatilTransactionInfo> datilCreditCardTransList = new ArrayList<DataCreditDatilTransactionInfo>();
		List<DataCreditQueryInfo> queryList = new ArrayList<DataCreditQueryInfo>();
		
		// 获得Workbook工作薄对象
		Workbook workbook = null;
		try {
			workbook = getWorkBook(file);
			if (workbook != null) {
				int sheetNum = workbook.getNumberOfSheets();
				//获得第一个页签内容
				Sheet sheet = workbook.getSheetAt(0);
				int row=0 ,cell=0; //Excel Line  
				int i,j;
				i= row; 
				String creditReportId = getStringValue(sheet,i,2);
				//报告  头部
				dataCreditReportInfo.setCreditReportId(creditReportId);
				dataCreditReportInfo.setCreditReportType(DataConstant.CREDIT_REPORT_TYPE_DETAIL_VALUE);
				dataCreditReportInfo.setCreditReportDt(getStringValue(sheet,i,4));
				dataCreditReportInfo.setCreditPersonBrithDt(getStringValue(sheet,i,6));	
				row = 2;
				i = row;
				dataCreditReportInfo.setCreditPersonName(getStringValue(sheet,i,2));
				dataCreditReportInfo.setCreditPersonIdType(getStringValue(sheet,i,4));
				dataCreditReportInfo.setCreditPersonIdNum(getStringValue(sheet,i,6));
				//报告  详版信息概要
				dataCreditDatilOutlineInfo.setCreditReportId(creditReportId);
				row = 7;
				i = row;
				dataCreditDatilOutlineInfo.setHouseLoanNum(getStringValue(sheet,i,1));
				dataCreditDatilOutlineInfo.setOtherLoanNum(getStringValue(sheet,i,2));
				row = 9;
				i = row;
				dataCreditDatilOutlineInfo.setBadDebtsNum(getStringValue(sheet,i,2));
				dataCreditDatilOutlineInfo.setAssetDisposalNum(getStringValue(sheet,i,4));
				dataCreditDatilOutlineInfo.setAssurerNum(getStringValue(sheet,i,6));
				row = 14;
				cell=1;
				i = row;
				j= cell;
				dataCreditDatilOutlineInfo.setUnclearedLoanLegalpersonTotal(getStringValue(sheet,i,j++));
				dataCreditDatilOutlineInfo.setUnclearedLoanBranchTotal(getStringValue(sheet,i,j++));
				dataCreditDatilOutlineInfo.setUnclearedLoanNumTotal(getStringValue(sheet,i,j++));
				dataCreditDatilOutlineInfo.setUnclearedLoanSignlamountTotal(getStringValue(sheet,i,j++));
				dataCreditDatilOutlineInfo.setUnclearedLoanLeftamountTotal(getStringValue(sheet,i,j++));
				dataCreditDatilOutlineInfo.setUnclearedLoanLast5mouthPayAvg(getStringValue(sheet,i,j++));
				row = 18;
				cell=1;
				i = row;
				j= cell;
				dataCreditDatilOutlineInfo.setNoCancellationCreditLegalpersonTotal(getStringValue(sheet,i,j++));
				dataCreditDatilOutlineInfo.setNoCancellationCreditBranchTotal(getStringValue(sheet,i,j++));
				dataCreditDatilOutlineInfo.setNoCancellationCreditAccountTotal(getStringValue(sheet,i,j++));
				dataCreditDatilOutlineInfo.setNoCancellationCreditAmountTotal(getStringValue(sheet,i,j++));
				dataCreditDatilOutlineInfo.setNoCancellationCreditSingleMaxAmountTotal(getStringValue(sheet,i,j++));
				dataCreditDatilOutlineInfo.setNoCancellationCreditSingleMinAmountTotal(getStringValue(sheet,i,j++));
				dataCreditDatilOutlineInfo.setNoCancellationCreditUsedAmountTotal(getStringValue(sheet,i,j++));
				dataCreditDatilOutlineInfo.setNoCancellationCreditLast6mouthPayAvg(getStringValue(sheet,i,j++));
				row = 20;
				i = row;
				dataCreditDatilOutlineInfo.setGuaranteeOtherNum(getStringValue(sheet,i,2));
				dataCreditDatilOutlineInfo.setBadLoansTotalNum(getStringValue(sheet,i,4));
				
				//报告  信贷交易信息明细 -贷款  发放日期	贷款金额	贷款种类	贷款机构	抵押类型	期数	状态	截至日期	五级分类	本金余额	本月应还	本月实还	最近24个月还款记录																							
				row = 24;
				i = row;
				String issueDt = null;
				while((issueDt = getStringValue(sheet,++i,2)).length()>5&& i< 101+row){
					DataCreditDatilTransactionInfo loanTran = new DataCreditDatilTransactionInfo();
					loanTran.setCreditReportId(creditReportId);
					loanTran.setTransactionType(DataConstant.CREDIT_REPORT_DETAIL_TRANSTYPE_LOAN);
					j= 2;
					loanTran.setTransactionIssueDate(getStringValue(sheet,i,j++));
					loanTran.setTransactionLoanAmount(getStringValue(sheet,i,j++));
					loanTran.setTransactionLoanType(getStringValue(sheet,i,j++));
					loanTran.setTransactionBranch(getStringValue(sheet,i,j++));
					loanTran.setTransactionLoanMortgageType(getStringValue(sheet,i,j++));
					loanTran.setTransactionLoanTrem(getStringValue(sheet,i,j++));
					loanTran.setTransactionStatus(getStringValue(sheet,i,j++));
					loanTran.setRansactionLoanDueDate(getStringValue(sheet,i,j++));
					loanTran.setRansactionLoan5classType(getStringValue(sheet,i,j++));
					loanTran.setRansactionLoanLeftPrincipalAmount(getStringValue(sheet,i,j++));
					loanTran.setRansactionThismonthReturnAmount(getStringValue(sheet,i,j++));
					loanTran.setRansactionThismonthReturnedAmount(getStringValue(sheet,i,j++));
					//新增列
					loanTran.setRansactionCurrentOverdueAmount(getStringValue(sheet,i,j++));
					loanTran.setRansactionOverdue3160daysAmount(getStringValue(sheet,i,j++));
					loanTran.setRansactionOverdue6190daysAmount(getStringValue(sheet,i,j++));
					loanTran.setRansactionOverdue91180daysAmount(getStringValue(sheet,i,j++));
					loanTran.setRansactionOverduemore180daysAmount(getStringValue(sheet,i,j++));
					
					String ransactionLast24termOverdueStatus ="";
					for(int k=0;k<24;k++){
						ransactionLast24termOverdueStatus = ransactionLast24termOverdueStatus  + getStringValue(sheet,i,j++) + DataConstant.EXCEL_CELL_SEPARATOR;
					}
					ransactionLast24termOverdueStatus = ransactionLast24termOverdueStatus.substring(0, ransactionLast24termOverdueStatus.length()-2);
					loanTran.setRansactionLast24termOverdueStatus(ransactionLast24termOverdueStatus);
					datilLoanTransList.add(loanTran);
				}
				//报告  信贷交易信息明细 -贷记卡  发放日期	发卡机构	授信额度	状态	共享额度	已用额度	最近6个月平均使用额度	最大使用额度	本月应还	本月实还		最近24个月还款记录																							
				row = 127;
				i = row;
				issueDt = null;
				while((issueDt = getStringValue(sheet,++i,2)).length()>5&&i<31+row){
					DataCreditDatilTransactionInfo creditCardTran = new DataCreditDatilTransactionInfo();
					creditCardTran.setCreditReportId(creditReportId);
					creditCardTran.setTransactionType(DataConstant.CREDIT_REPORT_DETAIL_TRANSTYPE_CREDIT_CARD);
					j = 2;
					//发放日期	授信额度	状态	共享额度	已用额度	最近6个月平均使用额度	最大使用额度	           本月应还	 本月实还			  最近24期逾期状态																							
					creditCardTran.setTransactionIssueDate(getStringValue(sheet,i,j++));
					creditCardTran.setTransactionBranch(getStringValue(sheet,i,j++));
					creditCardTran.setTransactionCreditAmountTotal(getStringValue(sheet,i,j++));
					creditCardTran.setRansactionCurrency(getStringValue(sheet,i,j++));
					creditCardTran.setTransactionStatus(getStringValue(sheet,i,j++));
					creditCardTran.setTransactionShareCreditAmountTotal(getStringValue(sheet,i,j++));
					creditCardTran.setTransactionUsedCreditAmount(getStringValue(sheet,i,j++));
					creditCardTran.setTransactionLast6monthUsedCreditAmountAvg(getStringValue(sheet,i,j++));
					creditCardTran.setTransactionMaxUsedCreditAmount(getStringValue(sheet,i,j++));
					creditCardTran.setRansactionThismonthReturnAmount(getStringValue(sheet,i,j++));
					creditCardTran.setRansactionThismonthReturnedAmount(getStringValue(sheet,i,j++));
					creditCardTran.setRansactionCurrentOverdueAmount(getStringValue(sheet,i,j++));
					String ransactionLast24termOverdueStatus ="";
					for(int k=0;k<24;k++){
						ransactionLast24termOverdueStatus = ransactionLast24termOverdueStatus  + getStringValue(sheet,i,j++) + DataConstant.EXCEL_CELL_SEPARATOR;
					}
					ransactionLast24termOverdueStatus = ransactionLast24termOverdueStatus.substring(0, ransactionLast24termOverdueStatus.length()-2);
					creditCardTran.setRansactionLast24termOverdueStatus(ransactionLast24termOverdueStatus);
					datilCreditCardTransList.add(creditCardTran);
				}
				
				//报告  公共记录
				i = 160;
				dataCreditPublicInfo.setCreditReportId(creditReportId);
				dataCreditPublicInfo.setRecordTaxesOwed(getStringValue(sheet,i++,2));
				dataCreditPublicInfo.setRecordCivilJudgment(getStringValue(sheet,i++,2));
				dataCreditPublicInfo.setRecordForceExecution(getStringValue(sheet,i++,2));
				dataCreditPublicInfo.setRecordAdminSanction(getStringValue(sheet,i++,2));
				dataCreditPublicInfo.setRecordTelecomArrears(getStringValue(sheet,i++,2));
				//报告  查询记录
				row = 167;
				i = row;
				String queryDt = "";
				while((queryDt = getStringValue(sheet,++i,2)).length()>5&&i<31+row){
					DataCreditQueryInfo queryRecord = new DataCreditQueryInfo();
					queryRecord.setCreditReportId(creditReportId);
					queryRecord.setQueryDt(queryDt);
					queryRecord.setQueryReason(getStringValue(sheet,i,3));
					queryList.add(queryRecord);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != workbook) {
				workbook.close();
				workbook = null;
			}
		}
		report.setDataCreditReportInfo(dataCreditReportInfo);
		report.setDataCreditDatilOutlineInfo(dataCreditDatilOutlineInfo);
		report.setDatilCreditCardTransList(datilCreditCardTransList);
		report.setDatilLoanTransList(datilLoanTransList);
		report.setDataCreditPublicInfo(dataCreditPublicInfo);
		report.setQueryList(queryList);
		return report;
	}
	
	
	
	
	/**
	 * 
	 * <p> description : 读取简版征信报告的内容
	 * <p> author   : wuhongzhao
	 * <p> date 	: 2017年6月2日
	 * <p> methodName ：readSampleCreditReport
	 * <p> paramters  : @param file
	 * <p> paramters  : @return
	 * <p> paramters  : @throws IOException
	 * <p> return	: CreditReportDto
	 * <p>
	 * <p>
	 */
	public static CreditReportDto readSampleCreditReport(File file)
			throws IOException {
		CreditReportDto detailReport = new CreditReportDto();
		detailReport.setCreditReportType(DataConstant.CREDIT_REPORT_TYPE_BRIEF_VALUE);
		
		//信用报告信息表
		DataCreditReportInfo dataCreditReportInfo = new DataCreditReportInfo();
		//简版概要信息表
		DataCreditBriefOutlineInfo dataCreditBriefOutlineInfo = new DataCreditBriefOutlineInfo();
		//简版 信贷交易信息明细
		//报告  信贷交易信息明细 -信用卡
		 List<DataCreditBriefTransactionInfo> briefCreditCardTransList=new ArrayList<DataCreditBriefTransactionInfo>();
		//报告  信贷交易信息明细 -房贷
		 List<DataCreditBriefTransactionInfo> briefHouseLoanTransList=new ArrayList<DataCreditBriefTransactionInfo>();
		//报告  信贷交易信息明细 -其他贷款
		 List<DataCreditBriefTransactionInfo> briefOtherLoanTransList=new ArrayList<DataCreditBriefTransactionInfo>();
		//公共记录
		DataCreditPublicInfo dataCreditPublicInfo = new DataCreditPublicInfo();
		//查询记录
		List<DataCreditQueryInfo> queryList = new ArrayList<DataCreditQueryInfo>();
	
		// 获得Workbook工作薄对象
		Workbook workbook = null;
		try {
			workbook = getWorkBook(file);
			if (workbook != null) {
				//获得第一个页签内容
				Sheet sheet = workbook.getSheetAt(0);
				String creditReportId = getStringValue(sheet,0,2);
				//报告  头部
				dataCreditReportInfo.setCreditReportId(creditReportId);
				dataCreditReportInfo.setCreditReportDt(getStringValue(sheet,0,4));
				
				dataCreditReportInfo.setCreditPersonName(getStringValue(sheet,2,2));
				dataCreditReportInfo.setCreditPersonIdType(getStringValue(sheet,2,4));
				dataCreditReportInfo.setCreditPersonIdNum(getStringValue(sheet,2,6));
				//报告  简版信息概要
				
				dataCreditBriefOutlineInfo.setCreditReportId(creditReportId);
				dataCreditBriefOutlineInfo.setOverdueAssetDisposalNum(getStringValue(sheet,5,2));
				dataCreditBriefOutlineInfo.setOverdueAssurerNum(getStringValue(sheet,5,4));
				
				dataCreditBriefOutlineInfo.setCreditNum(getStringValue(sheet,8,2));
				dataCreditBriefOutlineInfo.setHouseLoanNum(getStringValue(sheet,8,3));
				dataCreditBriefOutlineInfo.setOtherLoanNum(getStringValue(sheet,8,4));
				
				dataCreditBriefOutlineInfo.setUnclearedCreditNum(getStringValue(sheet,9,2));
				dataCreditBriefOutlineInfo.setUnclearedHouseLoanNum(getStringValue(sheet,9,3));
				dataCreditBriefOutlineInfo.setUnclearedOtherLoanNum(getStringValue(sheet,9,4));
				
				dataCreditBriefOutlineInfo.setOverdueCreditNum(getStringValue(sheet,10,2));
				dataCreditBriefOutlineInfo.setOverdueHouseLoanNum(getStringValue(sheet,10,3));
				dataCreditBriefOutlineInfo.setOverdueOtherLoanNum(getStringValue(sheet,10,4));
				
				dataCreditBriefOutlineInfo.setOverdue90dCreditNum(getStringValue(sheet,11,2));
				dataCreditBriefOutlineInfo.setOverdue90dHouseLoanNum(getStringValue(sheet,11,3));
				dataCreditBriefOutlineInfo.setOverdue90dOtherLoanNum(getStringValue(sheet,11,4));
				
				dataCreditBriefOutlineInfo.setGuaranteeCreditNum(getStringValue(sheet,12,2));
				dataCreditBriefOutlineInfo.setGuaranteeHouseLoanNum(getStringValue(sheet,12,3));
				dataCreditBriefOutlineInfo.setGuaranteeOtherNum(getStringValue(sheet,12,4));
				
				
				
				//报告  信贷交易信息明细 -信用卡
				int i = 15;
				String issueDt = null;
				while((issueDt = getStringValue(sheet,++i,3)).trim().length()>0&&i<66){
					DataCreditBriefTransactionInfo creditCard = new DataCreditBriefTransactionInfo();
					creditCard.setCreditReportId(creditReportId);
					creditCard.setTransactionType(DataConstant.CREDIT_REPORT_SAMPLE_CREDIT_CARD);
					int j = 2;
					creditCard.setTransactionIsOverdue(getStringValue(sheet,i,j++));
					creditCard.setTransactionIssueDate(getStringValue(sheet,i,j++));
					creditCard.setTransactionDueDate(getStringValue(sheet,i,j++));
					creditCard.setOperateCreditBranch(getStringValue(sheet,i,j++));
					creditCard.setAccountState(getStringValue(sheet,i,j++));
					creditCard.setTransactionCreditAmountTotal(getStringValue(sheet,i,j++));
					creditCard.setTransactionUsedCreditAmount(getStringValue(sheet,i,j++));
					creditCard.setTransactionOverdueAmount(getStringValue(sheet,i,j++));
					creditCard.setOverTimes5ys(getStringValue(sheet,i,j++));
					creditCard.setOverTimes5ys90ds(getStringValue(sheet,i,j++));
					briefCreditCardTransList.add(creditCard);
				}
				//报告  信贷交易信息明细 -住房贷款
				i = 68;
				System.out.println();
				issueDt = null;
				while((issueDt = getStringValue(sheet,++i,3)).trim().length()>0&&i<119){
					DataCreditBriefTransactionInfo houseTran = new DataCreditBriefTransactionInfo();
					houseTran.setCreditReportId(creditReportId);
					houseTran.setTransactionType(DataConstant.CREDIT_REPORT_SAMPLE_HOUSE_TRANSTYPE_LOAN);
					int j = 2;
					houseTran.setTransactionIsOverdue(getStringValue(sheet,i,j++));
					houseTran.setTransactionIssueDate(getStringValue(sheet,i,j++));
					houseTran.setTransactionLoanAmount(getStringValue(sheet,i,j++));
					houseTran.setTransactionEndDate(getStringValue(sheet,i,j++));
					houseTran.setTransactionDueDate(getStringValue(sheet,i,j++));
					houseTran.setLoanBranch(getStringValue(sheet,i,j++));
					houseTran.setAccountState(getStringValue(sheet,i,j++));
					houseTran.setTransactionLeftCreditAmount(getStringValue(sheet,i,j++));
					houseTran.setTransactionOverdueAmount(getStringValue(sheet,i,j++));
					houseTran.setOverTimes5ys(getStringValue(sheet,i,j++));
					houseTran.setOverTimes5ys90ds(getStringValue(sheet,i,j++));
					briefHouseLoanTransList.add(houseTran);
				}
				//报告  信贷交易信息明细 -其他贷款
				i = 120;
				issueDt = null;
				while((issueDt = getStringValue(sheet,++i,3)).trim().length()>0&&i<321){
					DataCreditBriefTransactionInfo otherTran = new DataCreditBriefTransactionInfo();
					otherTran.setCreditReportId(creditReportId);
					otherTran.setTransactionType(DataConstant.CREDIT_REPORT_OTHER_TRANSTYPE_LOAN);
					int j = 2;
					otherTran.setTransactionIsOverdue(getStringValue(sheet,i,j++));
					otherTran.setTransactionIssueDate(getStringValue(sheet,i,j++));
					otherTran.setTransactionLoanAmount(getStringValue(sheet,i,j++));
					otherTran.setTransactionEndDate(getStringValue(sheet,i,j++));
					otherTran.setTransactionDueDate(getStringValue(sheet,i,j++));
					otherTran.setLoanBranch(getStringValue(sheet,i,j++));
					otherTran.setAccountState(getStringValue(sheet,i,j++));
					otherTran.setTransactionLeftCreditAmount(getStringValue(sheet,i,j++));
					otherTran.setTransactionOverdueAmount(getStringValue(sheet,i,j++));
					otherTran.setOverTimes5ys(getStringValue(sheet,i,j++));
					otherTran.setOverTimes5ys90ds(getStringValue(sheet,i,j++));
					briefOtherLoanTransList.add(otherTran);
				}
				//报告  公共记录
				i = 323;
				dataCreditPublicInfo.setCreditReportId(creditReportId);
				dataCreditPublicInfo.setRecordTaxesOwed(getStringValue(sheet,i++,2));
				dataCreditPublicInfo.setRecordCivilJudgment(getStringValue(sheet,i++,2));
				dataCreditPublicInfo.setRecordForceExecution(getStringValue(sheet,i++,2));
				dataCreditPublicInfo.setRecordAdminSanction(getStringValue(sheet,i++,2));
				dataCreditPublicInfo.setRecordTelecomArrears(getStringValue(sheet,i++,2));
				//报告  查询记录
				i = 329;
				String queryDt = "";
				while((queryDt = getStringValue(sheet,++i,2)).trim().length()>5&&i<360){
					DataCreditQueryInfo queryRecord = new DataCreditQueryInfo();
					queryRecord.setCreditReportId(creditReportId);
					queryRecord.setQueryDt(queryDt);
					queryRecord.setQueryReason(getStringValue(sheet,i,3));
					queryList.add(queryRecord);
				}
				//通过互联网查询次数
				dataCreditBriefOutlineInfo.setByInternetQueryNum(getStringValue(sheet,361,2));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != workbook) {
				workbook.close();
				workbook = null;
			}
		}
		detailReport.setDataCreditReportInfo(dataCreditReportInfo);
		detailReport.setDataCreditBriefOutlineInfo(dataCreditBriefOutlineInfo);
		detailReport.setBriefCreditCardTransList(briefCreditCardTransList);
		detailReport.setBriefHouseLoanTransList(briefHouseLoanTransList);
		detailReport.setBriefOtherLoanTransList(briefOtherLoanTransList);
		detailReport.setDataCreditPublicInfo(dataCreditPublicInfo);
		detailReport.setQueryList(queryList);
		return detailReport;
	}
	/**
	 * 
	 * <p> description : 获得指定单元格的内容  不存在或者为空，返回空
	 * <p> author   : Spole
	 * <p> date 	: 2017年6月2日
	 * <p> methodName ：getStringValue
	 * <p> paramters  : @param sheet
	 * <p> paramters  : @param rowNum
	 * <p> paramters  : @param cellNum
	 * <p> paramters  : @return
	 * <p> return	: String
	 * <p>
	 * <p>
	 */
	private static String getStringValue(Sheet sheet,int rowNum,int cellNum) {
		int lastRowNum = sheet.getLastRowNum();
		if(rowNum > lastRowNum){
			return " ";
		}
		Row row = sheet.getRow(rowNum);
		int lastCellNum;
		try {
			lastCellNum = row.getLastCellNum();
		} catch (Exception e1) {
			return " ";
		}
		if(cellNum > lastCellNum){
			return " ";
		}
		Cell cell;
		try {
			cell = row.getCell(cellNum);
		} catch (Exception e) {
			return " ";
		}
		return getCell2StringValue(cell);
		
	}

	public static CreditReportDto readCreditReport(File file, String reportType) throws Exception {
		if(DataConstant.CREDIT_REPORT_TYPE_DETAIL_KEY.equals(reportType)){
			return readDetailCreditReport(file);
		}
		if(DataConstant.CREDIT_REPORT_TYPE_BRIEF_KEY.equals(reportType)){
			//TODO
			return readSampleCreditReport(file);
		}
		//
		return null;
	}
	
	
}
