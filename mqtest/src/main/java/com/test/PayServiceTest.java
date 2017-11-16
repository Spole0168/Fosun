package com.test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.jms.JMSException;

import net.sf.json.JSONObject;

import org.junit.Test;

import com.fosun.pay.service.model.CashierReqVO;
import com.fosun.pay.service.model.IdCheck;
import com.fosun.pay.service.model.OpenAccount;
import com.fosun.pay.service.model.PayForAnotherVO;
import com.fosun.pay.service.model.WithholdSignVo;
import com.fosun.pay.service.model.WithholdVO;
import com.test.util.SendMsg2MqUtils;

public class PayServiceTest {
	
	@Test
	public void test_idCheck(){
		//服务名称  验证身份证、银行卡、手机号 实名认证 OK
		String serviceName = "PayService.idCheck";
    	//参数
    	Map<String, Object> paramMap = new HashMap<String, Object>();
    	//String payType,IdCheck idCheck,String interfaceTransNo
//    	paramMap.put("payType", "01");
    	IdCheck idCheck = new IdCheck();
    	idCheck.setMchntCode("1000000002");
    	idCheck.setAuthType("2");
    	//idCheck.setCardNo("6214850212331638");//宝付-招商银行，3/4要素认证
    	idCheck.setCardNo("6217000830000123038"); //宝付-建行，用于2要素认证
    	idCheck.setCreNo("370102198202130072");
    	idCheck.setPhoneNo("15111111111");
    	idCheck.setUserName("李运芬");
    	//idCheck.setFundCode("GXXD");//资金方，商户代码
    	paramMap.put("idCheck",idCheck);
    	paramMap.put("interfaceTransNo", null);
    	
    	String res = null;
    	try {
    		res = SendMsg2MqUtils.send(serviceName, paramMap);
		} catch (JMSException e) {
			System.out.println("出现异常"+e);
			return ;
		}
    	if(null==res||res.trim().length()==0){
    		return;
    	}
    	JSONObject resJson = JSONObject.fromObject(res);
    	Object rsp = resJson.get("rspBody");
    	JSONObject rspBody = JSONObject.fromObject(rsp);
    	Object rtnMap =  rspBody.get("rtnMap");
    	JSONObject rtnMapJson = JSONObject.fromObject(rtnMap);
    	String respCode = (String) rtnMapJson.get("respCode");
    	System.out.println(respCode);
    	assertEquals(respCode,"000000");
	}
	
	@Test
	public void test_smsSend(){
		//服务名称   发送短信
		String serviceName = "PayService.smsSend";
		//参数
		
    	Map<String, Object> paramMap = new HashMap<String, Object>();
    	paramMap.put("mchntCode","1000000002");
    	paramMap.put("payType","01");
    	paramMap.put("phoneNo","15921401626");
    	paramMap.put("custNo","custNo15921401626");
    	paramMap.put("interfaceTransNo", null);
		
		String res = null;
		try {
			res = SendMsg2MqUtils.send(serviceName, paramMap);
		} catch (JMSException e) {
			System.out.println("出现异常"+e);
			return ;
		}
		if(null==res||res.trim().length()==0){
    		return;
    	}
    	JSONObject resJson = JSONObject.fromObject(res);
    	Object rsp = resJson.get("rspBody");
    	JSONObject rspBody = JSONObject.fromObject(rsp);
    	Object rtnMap =  rspBody.get("rtnMap");
    	JSONObject rtnMapJson = JSONObject.fromObject(rtnMap);
    	String respCode = (String) rtnMapJson.get("resp_code");
    	System.out.println(respCode);
    	assertEquals(respCode,"000000");
	}

	@Test
	public void test_withholdSign(){
		//服务名称 代扣签约
		String serviceName = "PayService.withholdSign";
	   	//参数
    	Map<String, Object> paramMap = new HashMap<String, Object>();
    	//String payType,WithholdSignVo withholdSignVo,String interfaceTransNo
    	paramMap.put("payType", "01");//支付方式(01:商盟支付)
    	WithholdSignVo withholdSignVo = new WithholdSignVo();
    	withholdSignVo.setMchntCode("1000000002");
    	withholdSignVo.setMerCstNo("1000000022");//客户号
    	withholdSignVo.setPhoneNo("15921401626");//银行预留手机号
    	withholdSignVo.setCreNo("370102198202130071");//证件号 
    	withholdSignVo.setCardNo("6202001422860685");//银行卡号
    	withholdSignVo.setUserName("颜丙伟");//用户姓名
    	withholdSignVo.setBankType("ICBC");//银行编号
    	withholdSignVo.setStartDate("201808151800");//代扣协议生效时间(可为空) 
    	withholdSignVo.setEndDate("201908161800");//代扣协议失效时间(可为空) 
    	withholdSignVo.setProductCode("102001XDD01");//项目编号
    	
    	paramMap.put("withholdSignVo", withholdSignVo);
    	paramMap.put("interfaceTransNo", null);
		
		String res = null;
		try {
			res = SendMsg2MqUtils.send(serviceName, paramMap);
		} catch (JMSException e) {
			System.out.println("出现异常"+e);
			return ;
		}
		if(null==res||res.trim().length()==0){
			return;
		}
		JSONObject resJson = JSONObject.fromObject(res);
		Object rsp = resJson.get("rspBody");
		JSONObject rspBody = JSONObject.fromObject(rsp);
		Object rtnMap =  rspBody.get("rtnMap");
		JSONObject rtnMapJson = JSONObject.fromObject(rtnMap);
		String respCode = (String) rtnMapJson.get("respCode");
		System.out.println(respCode);
		assertEquals(respCode,"000000");
	}
	
	@Test
	public void test_payForAnother(){
		//服务名称 放款/代付
		String serviceName = "PayService.payForAnother";
		//参数
		Map<String, Object> paramMap = new HashMap<String, Object>();
		// String payType,WithholdVo withholdVo,String interfaceTransNo
		paramMap.put("payType", "01");//支付方式(01:商盟支付)
		PayForAnotherVO payForAnotherVO = new PayForAnotherVO();
		payForAnotherVO.setMchntCode("1000000002");
		payForAnotherVO.setMerCstNo("1000000022");//客户号
		payForAnotherVO.setBankType("ICBC");//银行类型
		payForAnotherVO.setUserName("颜丙伟");//用户姓名
		payForAnotherVO.setCardNo("6202001422860685");//银行卡号
		payForAnotherVO.setCreNo("370102198202130071");//证件号码
		payForAnotherVO.setOrderAmt("60.20");//代扣还款金额
		payForAnotherVO.setFeeAmt("0");
		payForAnotherVO.setProductCode("102001XDD01");//项目编号
		payForAnotherVO.setOrderId("20170718130308RPAY0000000X1706");
		payForAnotherVO.setNotifyUrl("http://localhost:18081/component-dmz/credit/sumpayForAnotherCallBack");//后台通知地址

		paramMap.put("payForAnotherVO", payForAnotherVO);
		
		paramMap.put("interfaceTransNo", null);
		
		String res = null;
		try {
			res = SendMsg2MqUtils.send(serviceName, paramMap);
		} catch (JMSException e) {
			System.out.println("出现异常"+e);
			return ;
		}
		if(null==res||res.trim().length()==0){
			return;
		}
		JSONObject resJson = JSONObject.fromObject(res);
		Object rsp = resJson.get("rspBody");
		JSONObject rspBody = JSONObject.fromObject(rsp);
		Object rtnMap =  rspBody.get("rtnMap");
		JSONObject rtnMapJson = JSONObject.fromObject(rtnMap);
		String respCode = (String) rtnMapJson.get("respCode");
		System.out.println(respCode);
		assertEquals(respCode,"000000");
	}
	
	@Test
	public void test_payForAnotherCallBack(){
		//服务名称 放款/代付回调
		String serviceName = "PayService.payForAnotherCallBack";
		// 参数  String payType,String jsonStr,String interfaceTransNo
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("payType", "01");//支付方式(01:商盟支付)
		String jsonStr = "";
		paramMap.put("jsonStr", jsonStr);
		paramMap.put("interfaceTransNo", null);
		
		String res = null;
		try {
			res = SendMsg2MqUtils.send(serviceName, paramMap);
		} catch (JMSException e) {
			System.out.println("出现异常"+e);
			return ;
		}
		System.out.println(res);
	}
	
	@Test
	public void test_pay(){
		//服务名称 代扣
		String serviceName = "PayService.pay";
		// 参数
		Map<String, Object> paramMap = new HashMap<String, Object>();
		// String payType,WithholdVo withholdVo,String interfaceTransNo
		paramMap.put("payType", "01");//支付方式(01:商盟支付)
		WithholdVO withholdVO = new WithholdVO();
		withholdVO.setMchntCode("1000000002");
//	   	withholdVO.setOrderId("20170718130308RPAY0000000X1709");
		String orderId = "20170718130308RPAY0000000X";
		Random r = new Random();
		for(int i =0;i<4;i++){
			orderId = orderId+r.nextInt(9);
		}
	   	withholdVO.setOrderId(orderId);
		withholdVO.setOrderAmt("60.20");//代扣还款金额
		withholdVO.setMerCstNo("1000000022");//客户号
		withholdVO.setBankType("ICBC");//银行类型
		withholdVO.setCardNo("6202001422860685");//银行卡号
		withholdVO.setPhoneNo("15921401626");//手机号
		withholdVO.setUserName("颜丙伟");//用户姓名
		withholdVO.setCreNo("370102198202130071");//证件号码
		withholdVO.setNotifyUrl("http://localhost:18081");//后台通知地址
		withholdVO.setAgreeCode("pro20170828122118742928");//代扣协议号
		withholdVO.setProductCode("102001XDD01");//项目编号
		paramMap.put("withholdVO", withholdVO);
		
		paramMap.put("interfaceTransNo", null);
		
		String res = null;
		try {
			res = SendMsg2MqUtils.send(serviceName, paramMap);
		} catch (JMSException e) {
			System.out.println("出现异常"+e);
			return ;
		}
		if(null==res||res.trim().length()==0){
			return;
		}
		JSONObject resJson = JSONObject.fromObject(res);
		Object rsp = resJson.get("rspBody");
		JSONObject rspBody = JSONObject.fromObject(rsp);
		Object rtnMap =  rspBody.get("rtnMap");
		JSONObject rtnMapJson = JSONObject.fromObject(rtnMap);
		String respCode = (String) rtnMapJson.get("respCode");
		System.out.println(respCode);
		assertEquals(respCode,"000000");
	}
	
	@Test
	public void test_payCallBack(){
		//服务名称 代扣
		String serviceName = "PayService.payCallBack";
		// 参数 String payType,String jsonStr,String interfaceTransNo
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("payType", "01");//支付方式(01:商盟支付)
		String jsonStr = "";
		paramMap.put("jsonStr", jsonStr);
		paramMap.put("interfaceTransNo", null);
		
		String res = null;
		try {
			res = SendMsg2MqUtils.send(serviceName, paramMap);
		} catch (JMSException e) {
			System.out.println("出现异常"+e);
			return ;
		}
		System.out.println(res);
		
	}
	
	@Test
	public void test_transferForAnother(){
		//服务名称  转账 OK
		String serviceName = "PayService.transferForAnother";
		// 参数
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		String res = null;
		try {
			res = SendMsg2MqUtils.send(serviceName, paramMap);
		} catch (JMSException e) {
			System.out.println("出现异常"+e);
			return ;
		}
		if(null==res||res.trim().length()==0){
			return;
		}
		JSONObject resJson = JSONObject.fromObject(res);
		Object rsp = resJson.get("rspBody");
		JSONObject rspBody = JSONObject.fromObject(rsp);
		Object rtnMap =  rspBody.get("rtnMap");
		JSONObject rtnMapJson = JSONObject.fromObject(rtnMap);
		String respCode = (String) rtnMapJson.get("respCode");
		System.out.println(respCode);
		assertEquals(respCode,"000000");
	}
	
	@Test
	public void test_queryBankLimitByBankType(){
		//服务名称 查询银行限额表 OK
		String serviceName = "PayService.queryBankLimitByBankType";
		// 参数
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("payType", "01");//支付方式(01:商盟支付)
		paramMap.put("bankType", "ABC");//支付方式(01:商盟支付)
		String res = null;
		try {
			res = SendMsg2MqUtils.send(serviceName, paramMap);
		} catch (JMSException e) {
			System.out.println("出现异常"+e);
			return ;
		}
		System.out.println(res);
	}
	
	
	
	
	/////////////////////////////////////////////////////////////////////
	
	
	
	
	//"errorMsg":"Value for payType cannot be null"
	@Test
	public void test_queryOrderInfo(){
		//服务名称     
		String serviceName = "PayService.queryOrderInfo";
		// 参数 
		Map<String, Object> paramMap = new HashMap<String, Object>();
		//String mchntCode,String orderId,String queryOrderType,String interfaceTransNo
		paramMap.put("orderId", "0020170901141626");//订单号
		paramMap.put("queryOrderType", "02");//订单查询方式(01：查询本地 02：查询远程支付 03：先查询本地如果不是终态再查询远程（推荐）)
		paramMap.put("mchntCode", "1000000002");
		paramMap.put("interfaceTransNo", null);
		String res = null;
		try {
			res = SendMsg2MqUtils.send(serviceName, paramMap);
		} catch (JMSException e) {
			System.out.println("出现异常"+e);
			return ;
		}
		if(null==res||res.trim().length()==0){
			return;
		}
		JSONObject resJson = JSONObject.fromObject(res);
		Object rsp = resJson.get("rspBody");
		JSONObject rspBody = JSONObject.fromObject(rsp);
		Object rtnMap =  rspBody.get("rtnMap");
		JSONObject rtnMapJson = JSONObject.fromObject(rtnMap);
		String respCode = (String) rtnMapJson.get("respCode");
		System.out.println(respCode);
		assertEquals(respCode,"000000");
	}
	
	@Test
	public void test_queryCheckFileList(){
		//服务名称  查询对账文件列表
		String serviceName = "PayService.queryCheckFileList";
		// 参数
		Map<String, Object> paramMap = new HashMap<String, Object>();
		// String mchntCode,String payType,String checkDate
		paramMap.put("mchntCode", "1000000002");
		paramMap.put("payType", "01");//支付方式(01:商盟支付)
		paramMap.put("checkDate", "20170817");//要查询的对账日期(yyyyMMdd)
		
		String res = null;
		try {
			res = SendMsg2MqUtils.send(serviceName, paramMap);
		} catch (JMSException e) {
			System.out.println("出现异常"+e);
			return ;
		}
	}
	
	@Test
	public void test_billNoticeCallBack(){
		//服务名称  查询对账文件列表
		String serviceName = "PayService.billNoticeCallBack";
		// 参数String payType,String fileName
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("payType", "01");//支付方式(01:商盟支付)
		paramMap.put("fileName", "20170727");//要查询的对账日期(yyyyMMdd)
		paramMap.put("interfaceTransNo", null);
		
		String res = null;
		try {
			res = SendMsg2MqUtils.send(serviceName, paramMap);
		} catch (JMSException e) {
			System.out.println("出现异常"+e);
			return ;
		}
		System.out.println(res);
		
	}
	
	@Test
	public void test_openAccountNo(){
		//服务名称 代扣签约
		String serviceName = "PayService.openAccountNo";
		//参数
		Map<String, Object> paramMap = new HashMap<String, Object>();
		//String payType,WithholdSignVo withholdSignVo,String interfaceTransNo
		paramMap.put("payType", "01");//支付方式(01:商盟支付)
		OpenAccount openAccount = new OpenAccount();
		
		openAccount.setMchntCode("1000000002");
		openAccount.setPhoneNo("15921401626");
		openAccount.setMerCstNo("1000000022");
		openAccount.setCreType("01");
		openAccount.setCreNo("370102198202130071");
		openAccount.setCardNo("6202001422860685");//银行卡号
		openAccount.setUserName("颜丙伟");//用户姓名
		openAccount.setBankType("ICBC");//银行编号
		openAccount.setProductCode("102001XDD01");//项目编号
		openAccount.setVerifyCode("134688");
		paramMap.put("openAccount", openAccount);
		paramMap.put("interfaceTransNo", null);
		
		String res = null;
		try {
			res = SendMsg2MqUtils.send(serviceName, paramMap);
		} catch (JMSException e) {
			System.out.println("出现异常"+e);
			return ;
		}
	}
	
	@Test
	public void test_initCashierReqParams(){
		//服务名称 代扣签约
		String serviceName = "PayService.initCashierReqParams";
		//参数
		
		//参数String payType,CashierReqVO cashierReqVO
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("payType", "01");//支付方式(01:商盟支付)
		CashierReqVO cro = new CashierReqVO();
		
		cro.setMchntCode("1000000002");
		cro.setActNo("1000000022");
		cro.setOrderId("201709052004PAY00000000001501");
		cro.setRtnMoney("20.68");
		cro.setReturnUrl("www.baidu.com");
		cro.setNotifyUrl("www.baidu.com");
		cro.setProductCode("102001XDD01");
		paramMap.put("cashierReqVO", cro);
		paramMap.put("interfaceTransNo", null);
		
		String res = null;
		try {
			res = SendMsg2MqUtils.send(serviceName, paramMap);
		} catch (JMSException e) {
			System.out.println("出现异常"+e);
			return ;
		}
	}

	
	
	@Test
	public void test_str(){
		String chnlTransTms = "20170828094316";
		System.out.println(chnlTransTms.length());
		chnlTransTms = chnlTransTms.substring(0, 8);
		System.out.println(chnlTransTms);
	}
}
