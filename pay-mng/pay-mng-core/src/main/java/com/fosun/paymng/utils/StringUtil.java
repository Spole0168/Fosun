package com.fosun.paymng.utils;

public class StringUtil {

	/**
	 * 检查传入的字符串是否为空或空字符串
	 * @param s
	 * @return
	 */
	public static boolean stringCheck(String s) {
		
		if(null != s && !"".equals(s)) {
			return true;
		}
		
		return false;
	}
	
	public static String stringTrim(String s) {
		if(null == s) return s;
		return s.trim();
	}
	
	public static void main(String[] args) {
		String s = "1";
		System.out.println(stringCheck(s));
	}
}
