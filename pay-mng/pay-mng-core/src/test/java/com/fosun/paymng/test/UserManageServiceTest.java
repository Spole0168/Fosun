package com.fosun.paymng.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 简要描述类的作用
 *
 * @author huateng
 * @date 2016年7月6日
 * @Copyright Shanghai Huateng Software Systems Co., Ltd.
 *
 *            <pre>
 * =================Modify Record=================
 * Modifier			date			Content
 * huateng			2016年7月6日			新增
 *
 * </pre>
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration({"classpath:test_spring-service.xml"})
//@Transactional
//@TransactionConfiguration(defaultRollback=true)
public class UserManageServiceTest {
	
	@Autowired
//	private UserManageService userManageService;
	
	@Test
	public void test() throws Exception{
		
	}

	
	/*public static void main(String[] args) throws Exception {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:test_spring-service.xml");

		UserManageService userManageService = ctx.getBean("userManageService", UserManageService.class);
		System.out.println(userManageService.findOrgUserByName("name")); //
		System.out.println("service start...");
	}
*/
}
