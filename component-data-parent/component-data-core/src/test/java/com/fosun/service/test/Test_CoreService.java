package com.fosun.service.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.fosun.component.base.util.PropertyConfigure;
import com.fosun.data.service.CreditRiskService;
import com.fosun.data.service.DataTaskService;
import com.fosun.data.service.model.CreditRiskRep;
import com.fosun.data.service.model.CreditRiskReq;
import com.fosun.data.service.model.DataTaskRep;
import com.fosun.data.service.model.DataTaskReq;
import com.fosun.data.service.model.vo.CreditLoanDemand;
import com.fosun.data.service.model.vo.CreditSignedInfo;
import com.fosun.data.service.model.vo.CreditUser;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:test_spring-service.xml"})
//@ContextConfiguration(locations = { "/test_spring-service.xml" })
@Transactional
@TransactionConfiguration(defaultRollback=false)
public class Test_CoreService {
	
	@Autowired
	private DataTaskService service;
	@Autowired
	private CreditRiskService creditRiskService;
	
	
	DataTaskReq req =new DataTaskReq();
	CreditRiskReq creq = new CreditRiskReq();
	 
	/**
	 * 
	 * <p> description : 
	 * <p> author   : Spole
	 * <p> date 	: 2017年8月29日
	 * <p> methodName ：test_Rating
	 * <p> paramters  : @throws Exception
	 * <p> return	: void
	 * <p> todo     : TODO  征信评分单元测试
	 * <p>
	 * <p>
	 */
	@Test
	public void test_Rating() throws Exception{
		CreditUser cu = new CreditUser();
		cu.setOrderCode("AAAAAAAAAAAAAAA");
		cu.setName("吴俊伟");
		cu.setMobile("13818346956");
		cu.setCity("shanghai");
		cu.setIdentity("411526199108154810");
		cu.setEducation("1");
		cu.setMarriage("0");
		cu.setProfession("1");
		cu.setResidentStatus("0");
		cu.setCardNo("6228480402564890018");
		cu.setCardNos("6228480402564890018");
		CreditLoanDemand creditLoanDemand = new CreditLoanDemand();
		creditLoanDemand.setLoanLimit("50000");
		creditLoanDemand.setLoanTerms("12");
		CreditSignedInfo  creditSignedInfo = new CreditSignedInfo();
		creq.setCreditUser(cu);
		creq.setCreditLoanDemand(creditLoanDemand);
		creq.setCreditSignedInfo(creditSignedInfo);
		creq.setInFileId("Z3JvdXAxL00wMC8wMC81MC9DcVlLSFZtbEsxV0FaaXVLQUFCZmZnOXJneUU1MC54bHN4");
		creq.setCreditReportType("0");
		CreditRiskRep genDataTask = creditRiskService.riskRating(creq);
		
		System.out.println("=============================="+genDataTask);
	}
	/**
	 * 
	 * <p> description : 
	 * <p> author   : Spole
	 * <p> date 	: 2017年8月29日
	 * <p> methodName ：test_queryMerchant
	 * <p> paramters  : @throws Exception
	 * <p> return	: void
	 * <p> todo     : TODO  商户
	 * <p>
	 * <p>
	 */
	@Test
	public void test_queryMerchant() throws Exception{
		DataTaskRep genDataTask = service.queryMerchant("102310054110987","102310054110987");
		
		System.out.println("=============================="+genDataTask);
	}
	/**
	 * 
	 * <p> description : 
	 * <p> author   : Spole
	 * <p> date 	: 2017年8月29日
	 * <p> methodName ：test_genDataTask
	 * <p> paramters  : @throws Exception
	 * <p> return	: void
	 * <p> todo     : TODO 反欺诈
	 * <p>
	 * <p>
	 */
	@Test
	public void test_genDataTask() throws Exception{
		String inFileId = "Z3JvdXAxL00wMC8wMC8zOS9DcVlLSFZseG82S0FZQjQ0QUFBeWpidVJqdkUyMC54bHN4";
		req.setTaskType("1");
		req.setInFileId(inFileId);
		DataTaskRep genDataTask = service.genDataTask(req);
		
		System.out.println("=============================="+genDataTask);
	}
	/**
	 * 
	 * <p> description : 
	 * <p> author   : Spole
	 * <p> date 	: 2017年8月29日
	 * <p> methodName ：test_queryDataTask
	 * <p> paramters  : @throws Exception
	 * <p> return	: void
	 * <p> todo     : TODO
	 * <p>
	 * <p>
	 */
	
	@Test
	public void test_queryDataTask() throws Exception{
		String task = "6b3e349b17c544c383caff16e33de279";
		List<String> taskIdList = new ArrayList<>();
		taskIdList.add(task);
		req.setTaskIdList(taskIdList);
		DataTaskRep genDataTask = service.queryDataTask(req);
		System.out.println("=============================="+genDataTask);
		System.out.println("=============================="+genDataTask.getRepList().get(0).toString());
		
	}
	
	
}
