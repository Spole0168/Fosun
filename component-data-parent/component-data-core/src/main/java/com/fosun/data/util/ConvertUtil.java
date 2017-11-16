package com.fosun.data.util;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;

/**
 * 
 * @author wuhongzhao
 * @date 2017年6月13日12:08:02
 *
 */
public class ConvertUtil {
	
	/**
	 * 输入日期和月份，返回一个过去的字符串类型的时间
	 * 
	 * @param date
	 * @param a
	 * @return
	 * @throws ParseException
	 */
	public static String getPastDateStr(String date, Integer a)
			throws ParseException {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c;
		Date d = null;
		try {
			c = Calendar.getInstance();
			c.setTime(df.parse(date));
			c.add(Calendar.MONTH, a);
			d = c.getTime();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			d = new Date();
		}
//		System.out.println(df.format(d));
		return df.format(d);
	}
	
	/**  
	 * 比较两个日期之间的大小  
	 *   
	 * @param d1  
	 * @param d2  
	 * @return 前者大于后者返回true 反之false  
	 */    
	public static boolean compareDate(String d1, String d2) {   
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	    Calendar c1 = Calendar.getInstance();    
	    Calendar c2 = Calendar.getInstance();    
	    try {
			c1.setTime(sdf.parse(d1));
			c2.setTime(sdf.parse(d2));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			d1=sdf.format(new Date());
			d2=sdf.format(new Date());
		}   
//	    System.out.println(c1.getTime());
//	    if(c1.getTime().getTime()>=c2.getTime().getTime())
	    int result = c1.compareTo(c2);    
	    if (result > 0)    
	        return true;    
	    else    
	        return false;    
	} 
	
	/**
     *  获取两个日期相差的月数
     * @param d1    较大的日期
     * @param d2    较小的日期
     * @return  如果d1>d2返回 月数差 否则返回0
	 * @throws ParseException 
     */
    public static int getMonthDiff(String d1, String d2) {
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        try {
			c1.setTime(sdf.parse(d1));
			c2.setTime(sdf.parse(d2));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			d1=sdf.format(new Date());
			d2=sdf.format(new Date());
		}
        if(c1.getTimeInMillis() < c2.getTimeInMillis()) return 0;
        int year1 = c1.get(Calendar.YEAR);
        int year2 = c2.get(Calendar.YEAR);
        int month1 = c1.get(Calendar.MONTH);
        int month2 = c2.get(Calendar.MONTH);
        int day1 = c1.get(Calendar.DAY_OF_MONTH);
        int day2 = c2.get(Calendar.DAY_OF_MONTH);
        // 获取年的差值 假设 d1 = 2015-8-16  d2 = 2011-9-30
        int yearInterval = year1 - year2;
        // 如果 d1的 月-日 小于 d2的 月-日 那么 yearInterval-- 这样就得到了相差的年数
        if(month1 < month2 || month1 == month2 && day1 < day2) yearInterval --;
        // 获取月数差值
        int monthInterval =  (month1 + 12) - month2  ;
        if(day1 < day2) monthInterval --;
        monthInterval %= 12;
        return yearInterval * 12 + monthInterval;
    }
	
	/**
	 * 近24个月逾期的月份数  贷款明细与信用卡明细中，所有“最近24个月还款记录”中，有逾期账户的月份数（每个竖条中，若有>0的记录，则记为1，再求和）
	 * @param strL
	 * @return
	 */
	 public static Integer getMonthCount(List<String> strL){
    	 Map<Integer,String> result = new HashMap<>();
         for (String str : strL) {
             String[] strArray = str.split("&@");
             for (int i=0;i<strArray.length;i++) {
                 String s = strArray[i];
                 if(isNumeric(s)){
                     result.put(i,s);
                 }
             }
         }
//         System.out.println("大小"+result.size());
//         for (Integer integer : result.keySet()) {
//             System.out.println(integer+"----"+result.get(integer));
//         }
         return result.size();
    }

	 /**
	  * 匹配数字
	  * @param str
	  * @return
	  */
    public static boolean isNumeric(String str){
//        [0-9]*
        Pattern pattern = Pattern.compile("-?([1-9]\\d*\\.?\\d*)|(0\\.\\d*[1-9])");
        Matcher isNum = pattern.matcher(str);
        if( !isNum.matches() ){
            return false;
        }
        return true;
    }
	/**
	 * 指定位数 截取字符串,重新拼成一个字符串
	 * 
	 * @param str
	 * @param a
	 * @param b
	 * @return
	 */
	public static String getStr(String str, int a) {
		String[] strArray = null;
		String s = "";
		if(StringUtils.isNotBlank(str)){
			strArray = str.split("&@");
			if(a>strArray.length){
				a=strArray.length;
			}
			for (int i = strArray.length - a; i < strArray.length; i++) {
				s=s+strArray[i];
			}
		}
		return s;
	}

	/**
	 * 获取最近逾期的期数
	 * 
	 * @param str
	 * @param a
	 * @return
	 */
	public static int getIntLastMonth(String str, int a) {
		String[] strArray = null;
		int j = 0;
		double m;
		if(StringUtils.isNotBlank(str)){
			strArray = str.split("&@");
			if(a>strArray.length){
				a=strArray.length;
			}
			for (int i = strArray.length - a; i < strArray.length; i++) {
				try {
					m = Double.valueOf(strArray[i]);
					if (m > 0) {
						j = i + 1;
					}
				} catch (NumberFormatException e) {
				}
			}
		}
		return j;
	}

	/**
	 * String 转换为double
	 * 
	 * @param str
	 * @return
	 */
	public static double parseDouble(String str) {
		double d = 0;
		if (StringUtils.isNotBlank(str)) {
			try {
				d = Double.parseDouble(str);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		return d;

	}

	/**
	 * 指定位数 截取字符串,求是数字的总和
	 * 
	 * @param str
	 * @param a
	 * @return
	 */
	public static int getSum(String str, int a) {
		String[] strArray = null;
		double n = 0;
		double m;
		if(StringUtils.isNotBlank(str)){
			strArray = str.split("&@");
			if(a>strArray.length){
				a=strArray.length;
			}
			for (int i = strArray.length - a; i < strArray.length; i++) {
				try {
					 m = Double.valueOf(strArray[i]);
					if (m > 0) {
						n += m;
					}
				} catch (Exception e) {
					// e.printStackTrace();
					m=0;
				}
			}
		}
		return (int) n;
	}
	/**
	 * 指定位数 截取字符串,根据指定条件拿到总的次数
	 * 
	 * @param str
	 * @param a
	 * @param b
	 * @return
	 */
	public static int getIntCount(String str, int a, int b) {
		String[] strArray = null;
		int count = 0;
		if(StringUtils.isNotBlank(str)){
			strArray = str.split("&@");
			if(a>strArray.length){
				a=strArray.length;
			}
			for (int i = strArray.length - a; i < strArray.length; i++) {
				try {
					double m = Double.valueOf(strArray[i]);
					if (m >= b) {
						count++;
					}
				} catch (Exception e) {
					// e.printStackTrace();
				}
			}
		}
		return count;
	}

	/**
	 * 指定位数 截取字符串，拿到最大值
	 * 
	 * @param str
	 * @param a
	 * @return
	 */
	public static int getMaxNum(String str, int a) {
		String[] strArray = null;
		double maxTemp = -1;
		if(StringUtils.isNotBlank(str)){
			strArray = str.split("&@");
			if(a>strArray.length){
				a=strArray.length;
			}
			for (int i = strArray.length - a; i < strArray.length; i++) {
				try {
					double m = Double.valueOf(strArray[i]);
					if (maxTemp < m) {
						maxTemp = m;
					}
				} catch (Exception e) {
					// e.printStackTrace();
				}
			}
		}
		int max = (int) maxTemp;
		return max;
	}

	/**
	 * 保留小数点后面两位
	 * 
	 * @param a
	 * @param b 分母不能为0
	 * @return
	 */
	public static String returnRate(Double a, Double b) {
		BigDecimal bigDecimal = null;
		Double d =0.00;
		try {
			if(b>0){
				bigDecimal = new BigDecimal(a / b);
			    d = bigDecimal.setScale(4, BigDecimal.ROUND_HALF_UP).doubleValue();
			}
			else{
				d=0.00;
			}
		} catch (Exception e) {
			d=0.00;
		}
		return d.toString();
	}



	//2017年10月24日10:57:29 
	
	public static double computer2DtStrMonths(String dt1,String dt2){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
        Calendar bef = Calendar.getInstance();
        Calendar aft = Calendar.getInstance();
        try {
			bef.setTime(sdf.parse(dt1));
			aft.setTime(sdf.parse(dt2));
		} catch (ParseException e) {
			return -1;
		}
        double result = aft.get(Calendar.MONTH) - bef.get(Calendar.MONTH);
        double month = (aft.get(Calendar.YEAR) - bef.get(Calendar.YEAR)) * 12;
        return Math.abs(month + result);   
	}
	/**
	 * 计算贷款月还款额
	 * @param base
	 * @param leftTermMonth
	 * @param leftLoanAmount
	 * @return
	 */
	public static double computerLoanMonthReturnAmount(double base,double leftTermMonth,double leftLoanAmount){
		double res = 0;
		double r = base / 12;
		double pow = Math.pow( 1 + r, leftTermMonth);
		res = pow  /(pow-1) * r * leftLoanAmount;
		BigDecimal bg = new BigDecimal(res);
		return bg.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
	}
	/**
	 * double 类型去尾法 变成整数 字符串返回
	 * @param param
	 * @return
	 */
	public static String transDouble2intStr(double param){
		String res = "0";
		String temp = param +"";
		res = temp.substring(0, temp.lastIndexOf("."));
		return res;
	}
	/**
	 * String double 类型去尾法 变成整数 字符串返回
	 * @param param
	 * @return
	 */
	public static String transDoubleStr2intStr(String param){
		String res = "0";
		try {
			Double.parseDouble(param);
		} catch (NumberFormatException e) {
			return res;
		}
		String temp = param;
		res = temp.substring(0, temp.lastIndexOf("."));
		return res;
	}
	
}
