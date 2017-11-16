package com.test;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.huateng.base.logTrace.utils.TraceNoUtils;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration({"classpath:test_spring-dao.xml"})
//@Transactional
//@TransactionConfiguration(defaultRollback=true)
public class MainTest{
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	//@Autowired
//	ExtCustBlklstBaseDAO dao;
    
	@Before
	public void init() throws Exception{
		TraceNoUtils.newTraceNo();
	}
	
	@Test
	public void test(){
		
	}                                   
} 