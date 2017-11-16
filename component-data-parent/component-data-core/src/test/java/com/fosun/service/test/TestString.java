package com.fosun.service.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.junit.Before;
import org.junit.Test;

import com.fosun.data.util.DataUtil;
import com.fosun.data.util.ExcelsUtils;
import com.fosun.data.util.FileUploadUtils;
import com.fosun.data.util.PropertiesUtils;

public class TestString {
	@Before
	public void bf(){
		
	}
	@Test
	public void test_List2String(){
		List<String> stu = new ArrayList<String>();
		List<String> stu2 = new ArrayList<String>();
		stu.add("John");
		stu.add(null);
		stu.add("Mary");
		stu.add("");
		stu.add("Rose");
		
		stu2.add("1111");
		stu2.add("222");
		stu2.add("33");
		System.out.println(stu);
		stu.addAll(stu2);
		System.out.println(stu);
	}
	@Test
	public void test_String2List(){
		List<String> stu = null;
		System.out.println(stu);
		String org = "John, , Mary, , Rose";
		stu = Arrays.asList(org.split(","));
		System.out.println(stu);
	}
	@Test
	public void test_StringList(){
		String regex = "&";
		String allStuNames = "John&&null&Mary&Rose";
		System.out.println("String :"+allStuNames);
//		for(String ss : allStuNames.split(regex)){
//			System.out.println(ss);
//		}
		List<String> stu = DataUtil.transString2List(allStuNames, regex);
		System.out.println("list:="+stu);
		String join = DataUtil.transList2String(stu, regex);
		System.out.println("String:="+join);
	}
	@Test
	public void test_str(){
		
		
	}
}
