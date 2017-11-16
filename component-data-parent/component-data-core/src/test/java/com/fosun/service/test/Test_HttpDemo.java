package com.fosun.service.test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Test;
import com.fosun.channel.util.HttpClientUtil;

/**
 * <p>测试请求核心系统DMZ
 */
public class Test_HttpDemo {
	
	//核心DMZ请求地址
	//SIT  wainet :116.228.223.181
	private String url = "http://116.228.223.181:10080/component-dmz/credit/dmzHttpReq.do";
//	private String url = "http://10.166.3.232:10080/component-dmz/credit/dmzHttpReq.do";
	//UAT
//	private String url = "http://10.166.0.170:10080/component-dmz/credit/dmzHttpReq.do";
	@Test
	public  void test_Rating(){
		//拼装请求地址
		String 	turl = url + "?serviceId=creditRiskService.riskRating";
		Map<String,Object> paramMap = new HashMap<String,Object>();
		//根据接口文档进行请求参数拼装（注意：key必须同接口文档一致，大小写敏感）
		Map<String,Object> creditRiskReq = new HashMap<String,Object>();
		creditRiskReq.put("creditReportType", "1");
		creditRiskReq.put("inFileId", "Z3JvdXAxL00wMC8wMC8zOS9DcVlLSFZseG82S0FZQjQ0QUFBeWpidVJqdkUyMC54bHN4");
		
		Map<String,Object> creditSignedInfo = new HashMap<String,Object>();
		creditSignedInfo.put("reportFlag", "1");
		creditSignedInfo.put("productType", "0");
		creditSignedInfo.put("requestCode", "auditor_api");
		
		Map<String,Object> user = new HashMap<String,Object>();
		Map<String,Object> creditLoanDemand = new HashMap<String,Object>();
		user.put("orderCode", "O111111");
		user.put("education", "1");
		user.put("name", "吴俊伟");
		user.put("marriage", "0");
		user.put("identity", "411526199108154810");
		user.put("residentStatus", "0");
		user.put("profession", "1");
		user.put("mobile", "13818346956");
		user.put("cardNo", "6228480402564890018");
		user.put("cardNos", "6228480402564890018");
		user.put("city", "HHHH");
		user.put("gender", "0");
		user.put("age", "30");
		creditLoanDemand.put("loanLimit", "300000");
		creditLoanDemand.put("loanTerms", "36");
		
		creditRiskReq.put("creditLoanDemand", creditLoanDemand);
		creditRiskReq.put("creditUser", user);
		creditRiskReq.put("creditSignedInfo", creditSignedInfo);
		paramMap.put("creditRiskReq", creditRiskReq);
		System.out.println();
		System.out.println();
		System.out.println("Req:=\t"+paramMap);
		try {
			String rtnJson = HttpClientUtil.sendPost(turl, paramMap);
			System.out.println();
			System.out.println();
			System.out.println("rtnJson===="+rtnJson);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public  void test_genTask(){
		//拼装请求地址
		String 	turl = url + "?serviceId=dataTaskService.genDataTask";
		Map<String,Object> paramMap = new HashMap<String,Object>();
		//根据接口文档进行请求参数拼装（注意：key必须同接口文档一致，大小写敏感）
		paramMap.put("channelNo", "01");
		Map<String,Object> dataTaskReq = new HashMap<String,Object>();
		dataTaskReq.put("taskType", "1");
		String str = "Z3JvdXAxL00wMC8wMC8zOS9DcVlLSFZseG82S0FZQjQ0QUFBeWpidVJqdkUyMC54bHN4";
		dataTaskReq.put("inFileId", str);
		paramMap.put("dataTaskReq", dataTaskReq);
		try {
			String rtnJson = HttpClientUtil.sendPost(turl, paramMap);
			System.out.println();
			System.out.println("Task===="+rtnJson.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//	@Test
//	public  void test_batgenTask(){
//		//拼装请求地址
//		String 	turl = url + "?serviceId=dataTaskService.genDataTask";
//		Map<String,Object> paramMap = new HashMap<String,Object>();
//		//根据接口文档进行请求参数拼装（注意：key必须同接口文档一致，大小写敏感）
//		paramMap.put("channelNo", "01");
//		Map<String,Object> dataTaskReq = new HashMap<String,Object>();
//		dataTaskReq.put("taskType", "1");
//		List<String> list = new ArrayList<String>();
//		list.add("MjAxNzA1MTYwNTMxNTFfXzIwMTcwNTE2MDEzMDQ1ODQ4XzMyODNlY2JkLTc2ZDAtNGM4OC1iMWQwLTYwOTY4NmEyZGRjYy54bHN4");
//		list.add("MjAxNzA1MTYwNjEzNTZfXzIwMTcwNTE2MDIxMjUwNTQwXzA2YWY1ZWU3LTFlNjQtNDllNC1hODU2LTg5ZWJiMGE0ODUwOS54bHN4");
//		list.add("MjAxNzA1MTYwNjE0MDZfXzIwMTcwNTE2MDIxMzAwNTI5Xzg0ZTNmNzA0LTVkNzYtNGRiOS1hODAyLTZlZGE2YzhkYTgyNi54bHN4");
//		list.add("MjAxNzA1MTYwNjE0MDlfXzIwMTcwNTE2MDIxMzAzNjY0XzQwZmQ4MjRjLWY5NmQtNGZmNi1hNjkxLTY3ZGQ3YWE2YTZmYS54bHN4");
//		list.add("MjAxNzA1MTYwNjE0MTJfXzIwMTcwNTE2MDIxMzA2NzQyX2QzNWViNDJmLWU4YTItNGQxNi04YmQwLWI2NzcxMmJkZjc4Zi54bHN4");
//		list.add("MjAxNzA1MTYwNjE0MTZfXzIwMTcwNTE2MDIxMzEwODkxXzc0MTVhNzAyLWFlYzUtNDMxYi1iNGY0LWRkZDY0OGYwOWJmOS54bHN4");
//		list.add("MjAxNzA1MTYwNjE0MThfXzIwMTcwNTE2MDIxMzEzMDgwX2ZjMjdiMmU5LTRjNGMtNGVmZi1iNDYwLWVmMTdmZjliNjg3NS54bHN4");
//		list.add("MjAxNzA1MTYwNjE0MjFfXzIwMTcwNTE2MDIxMzE1NDc1XzMwYWNhNzYzLWFlMDctNDhkYS04MDA2LTA5OTcyMWMxZjRkYS54bHN4");
//		list.add("MjAxNzA1MTYwNjE3NDVfXzIwMTcwNTE2MDIxNjM5MjA3X2VkODhmN2NjLTRjNmMtNDJjMC04MDA1LTA5ZTc0MTMxOTA0Ny54bHN4");
//		list.add("MjAxNzA1MTYwNjMxMjNfXzIwMTcwNTE2MDIzMDE3ODUzX2I2MDBjOTg4LTBmNGEtNDk4ZS1iMDM3LTdmNGMyY2FkMDVjOC54bHN4");
//		list.add("MjAxNzA1MTYwNjMxMzNfXzIwMTcwNTE2MDIzMDI3ODc1XzU3ZDhhMzI0LTNiZjUtNDRhYS04YWZjLTU1NDhhYmViYmFiZS54bHN4");
//		list.add("MjAxNzA1MTYwNjMxNDRfXzIwMTcwNTE2MDIzMDM4NzA5XzdjMGY0Mjc3LTZiY2EtNDhhYi1iYTUwLWI3NTgxMzU3ODM1NC54bHN4");
//		list.add("MjAxNzA1MTYwNjMxNTFfXzIwMTcwNTE2MDIzMDQ1Mjc1X2YyOWMwNDJjLWNmY2QtNDlkMC04ODFhLWQwNjAyODFhNGRiMS54bHN4");
//		list.add("MjAxNzA1MTYwNjU1NDNfXzIwMTcwNTE2MDI1NDM3OTcwXzdkMDAyY2NlLWFjOTAtNDI4ZC1iZWE0LWI1YjEzZjAyMjFhNi54bHN4");
//		list.add("MjAxNzA1MTYwNjU1NDlfXzIwMTcwNTE2MDI1NDQzNTIwX2I4MmE3OGI3LTllY2UtNGEzOS04ZmE3LWNhMDUzM2Y1NjVlNi54bHN4");
//		list.add("MjAxNzA1MTYwNjU3NDJfXzIwMTcwNTE2MDI1NjM2NjkwXzBlYTY0N2RmLTdhZDEtNDg1OC04YzA2LWMxY2IwZjRkMjY4MS54bHN4");
//		
//		for(String str : list){
//			dataTaskReq.put("inFileId", str);
//			paramMap.put("dataTaskReq", dataTaskReq);
//			try {
//				String rtnJson = HttpClientUtil.sendPost(turl, paramMap);
//				System.out.println("Bat_Task===="+rtnJson);
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//	}
	@Test
	public  void test_QueryTask(){
		//拼装请求地址
		String Qurl = url + "?serviceId=dataTaskService.queryDataTask";
		Map<String,Object> paramMap = new HashMap<String,Object>();
		//根据接口文档进行请求参数拼装（注意：key必须同接口文档一致，大小写敏感）
		paramMap.put("channelNo", "01");
		Map<String,Object> dataTaskReq = new HashMap<String,Object>();
		List<String> list = new ArrayList<String>();
		list.add("a3c31825402746918cc735920f33458c");
		list.add("6fc97dde5b694ab2ab9a5d69acce2534");
		dataTaskReq.put("taskIdList", list);
		paramMap.put("dataTaskReq", dataTaskReq);
		try {
			String rtnJson = HttpClientUtil.sendPost(Qurl, paramMap);
			System.out.println("QQQQQQQQQQQQQQQQQQQ=="+rtnJson);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
}
