package com.fosun.paymng.utils;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class ToolUtil {
	// 组织机构代码
	public static boolean isOrganizationCode(String str) {
		Pattern p = Pattern.compile("^[A-Z\\d]{8}\\-[A-Z\\d]+$");
		Matcher m = p.matcher(str);
		if (str.length() != 10 || !m.matches()) {
			return false;
		}
		return true;
	}
	
	// 统一社会信用代码	
	public static boolean isUnifiedSocialCreditCode(String str) {
		Pattern p = Pattern.compile("^[A-Z0-9]+$");
		Matcher m = p.matcher(str);
		if (str.length() != 18 || !m.matches() || str.indexOf("I") > -1 || str.indexOf("O") > -1
				|| str.indexOf("Z") > -1 || str.indexOf("S") > -1 || str.indexOf("V") > -1
				|| isInteger(str.substring(17)) != true) {
			return false;
		}
		return true;
	}
	
	// 手机号码
	public static boolean isMobile(String str) {
		Pattern p = Pattern.compile("^[0-9]+$");
		Matcher m = p.matcher(str);
		if (str.length() != 11 || !m.matches() || Long.parseLong(str) < 0) {
			return false;
		}
		return true;
	}

	// 邮箱
	public static boolean isMail(String str) {
		String p = "^\\w+((-\\w+)|(\\.\\w+))*\\@[A-Za-z0-9]+((\\.|-)[A-Za-z0-9]+)*\\.[A-Za-z0-9]+$";
		str = str.replaceAll(" ", "");
		boolean rs = Pattern.matches(p, str);
		return rs;
	}

	// 日期
	public static boolean isDate(String dateString, String pattern) {
		boolean isDate = true;
		if (pattern == null || pattern.trim().equals("")) {
			pattern = "yyyyMMdd";
		}
		DateFormat df = new SimpleDateFormat(pattern);
		try {
			df.parse(dateString);
		} catch (Exception e) {
			isDate = false;
		}
		return isDate;
	}

	// 日期比较
	public static int dateCompare(String date1, String date2, String pattern) {
		if (pattern == null || pattern.trim().equals("")) {
			pattern = "yyyyMMdd";
		}
		DateFormat df = new SimpleDateFormat(pattern);
		try {
			Date dt1 = df.parse(date1);
			Date dt2 = df.parse(date2);
			if (dt1.getTime() > dt2.getTime()) {
				return 1;
			} else if (dt1.getTime() < dt2.getTime()) {
				return -1;
			} else if (dt1.getTime() == dt2.getTime()) {
				return 0;
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return 0;
	}

	//字符串转日期
	public static Date stringToDate(String str) {
		String pattern = "yyyy-MM-dd HH:mm:ss";
		Date date = new Date();
		DateFormat df = new SimpleDateFormat(pattern);
		try {
			date = df.parse(str);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return date;
	}
	
	//日期转字符串
	public static String dateToString(Date date) {
		String pattern = "yyyyMMdd";
		DateFormat df = new SimpleDateFormat(pattern);
		String str = "";
		try {
			str = df.format(date);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return str;
	}
	
	//日期转字符串
	public static String dateToString2(Date date) {
		String pattern = "yyyy-MM-dd HH:mm:ss";
		DateFormat df = new SimpleDateFormat(pattern);
		String str = "";
		try {
			str = df.format(date);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return str;
	}
	
	// 整数
	public static boolean isInteger(String str) {
		Pattern p = Pattern.compile("[0-9]+");
		Matcher m = p.matcher(str);
		if (!m.matches()) {
			return false;
		}
		return true;
	}

	// 整数和两位小数
	public static boolean isMoney(String str) {
		Pattern p = Pattern.compile("^[0-9]{1,12}+(.[0-9]{1,2})?$");
		Matcher m = p.matcher(str);
		if (!m.matches()) {
			return false;
		}
		return true;
	}

	// 百分比
	public static boolean isPercent(String str) {
		Pattern p = Pattern.compile("^[0-9]{1,3}+(.[0-9]{1,2})?$");
		Matcher m = p.matcher(str);
		if (!m.matches()) {
			return false;
		}
		return true;
	}
	
	// 两位整数和六位小数
	public static boolean isRate(String str) {
		Pattern p = Pattern.compile("^[0-9]{1,2}+(.[0-9]{1,6})?$");
		Matcher m = p.matcher(str);
		if (!m.matches()) {
			return false;
		}
		return true;
	}
	
	// 数字英文
	public static boolean isMe(String str) {
		Pattern p = Pattern.compile("[a-zA-Z0-9]+");
		Matcher m = p.matcher(str);
		if (!m.matches()) {
			return false;
		}
		return true;
	}

	// 数字英文中文
	public static boolean isMec(String str) {
		Pattern p = Pattern.compile("[a-zA-Z0-9\\u4E00-\\u9FA5_\\?,.:;~!@#$%^&*()_+\\？，。：；~！@#￥%……&*（）——+]+");
		Matcher m = p.matcher(str);
		if (!m.matches()) {
			return false;
		}
		return true;
	}
	
	// 整数和两位小数金额
	public static BigDecimal decimalMoney(BigDecimal str) {
		BigDecimal money = new BigDecimal(0);
		if (str == null) {
			money = new BigDecimal(0.00);
		} else if (!(str.toString().indexOf(".") > 0)) {
			money = (new BigDecimal(str + ".00"));
		} else {
			money = str;
		}
		return money;
	}
	
	// 检查传入的字符串是否为空或空字符串
	public static boolean stringCheck(String s) {
		if (null != s && !"".equals(s)) {
			return true;
		}
		return false;
	}
	
	// 身份证
	public static boolean isCard(String certNo) {
		if (certNo == null || (certNo.length() != 15 && certNo.length() != 18))
			return false;
		final char[] cs = certNo.toUpperCase().toCharArray();
		// 校验位数
		int power = 0;
		for (int i = 0; i < cs.length; i++) {
			if (i == cs.length - 1 && cs[i] == 'X')
				break;// 最后一位可以是X或x
			if (cs[i] < '0' || cs[i] > '9')
				return false;
			if (i < cs.length - 1) {
				power += (cs[i] - '0') * POWER_LIST[i];
			}
		}
		// 校验区位码
		if (!zoneNum.containsKey(Integer.valueOf(certNo.substring(0, 2)))) {
			return false;
		}
		// 校验年份
		String year = certNo.length() == 15 ? getIdcardCalendar() + certNo.substring(6, 8) : certNo.substring(6, 10);
		final int iyear = Integer.parseInt(year);
		if (iyear < 1900 || iyear > Calendar.getInstance().get(Calendar.YEAR))
			return false;// 1900年的PASS，超过今年的PASS
		// 校验月份
		String month = certNo.length() == 15 ? certNo.substring(8, 10) : certNo.substring(10, 12);
		final int imonth = Integer.parseInt(month);
		if (imonth < 1 || imonth > 12) {
			return false;
		}
		// 校验天数
		String day = certNo.length() == 15 ? certNo.substring(10, 12) : certNo.substring(12, 14);
		final int iday = Integer.parseInt(day);
		if (iday < 1 || iday > 31)
			return false;
		// 校验校验码
		if (certNo.length() == 15)
			return true;
		return cs[cs.length - 1] == PARITYBIT[power % 11];

	}

	final static int[] PARITYBIT = { '1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2', '1' };
	final static int[] POWER_LIST = { 7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2 };

	private static int getIdcardCalendar() {
		GregorianCalendar curDay = new GregorianCalendar();
		int curYear = curDay.get(Calendar.YEAR);
		int year2bit = Integer.parseInt(String.valueOf(curYear).substring(0, 2)) - 1;
		return year2bit;
	}

	final static Map<Integer, String> zoneNum = new HashMap<Integer, String>();

	static {
		zoneNum.put(11, "北京");
		zoneNum.put(12, "天津");
		zoneNum.put(13, "河北");
		zoneNum.put(14, "山西");
		zoneNum.put(15, "内蒙古");
		zoneNum.put(21, "辽宁");
		zoneNum.put(22, "吉林");
		zoneNum.put(23, "黑龙江");
		zoneNum.put(31, "上海");
		zoneNum.put(32, "江苏");
		zoneNum.put(33, "浙江");
		zoneNum.put(34, "安徽");
		zoneNum.put(35, "福建");
		zoneNum.put(36, "江西");
		zoneNum.put(37, "山东");
		zoneNum.put(41, "河南");
		zoneNum.put(42, "湖北");
		zoneNum.put(43, "湖南");
		zoneNum.put(44, "广东");
		zoneNum.put(45, "广西");
		zoneNum.put(46, "海南");
		zoneNum.put(50, "重庆");
		zoneNum.put(51, "四川");
		zoneNum.put(52, "贵州");
		zoneNum.put(53, "云南");
		zoneNum.put(54, "西藏");
		zoneNum.put(61, "陕西");
		zoneNum.put(62, "甘肃");
		zoneNum.put(63, "青海");
		zoneNum.put(64, "宁夏");
		zoneNum.put(65, "新疆");
		zoneNum.put(71, "台湾");
		zoneNum.put(81, "香港");
		zoneNum.put(82, "澳门");
		zoneNum.put(91, "外国");
	}
	
	// 生成4位随机数字
	public static String getRadom4Num() {
		String result = "";
		for (int i = 0; i < 4; i++) {
			result += String.valueOf(new Random().nextInt(10));
		}
		return result;
	}
	
	/**
	 * @description 获取配置文件属性
	 * @param param
	 * @return
	 * @author htrad0021
	 * @date 2016-11-25
	 */
	public static String getProperties(String param) {
		String property = "";
		Properties prop = new Properties();
		InputStream in = null;
		try {
			// TODO 上线修改
			// in = new BufferedInputStream(new
			// FileInputStream("/D:/workspace/config/iccs/iccs-pre/config.properties"));
			in = new BufferedInputStream(new FileInputStream("/apps/config/iccs/iccs-cu/config.properties"));
			prop.load(in);
			property = prop.getProperty(param);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return property;
	}
	
	public static String getMsTimestamp(Date date){
		DateFormat format = new SimpleDateFormat("yyyyMMddhhmmssSSS");
		return format.format(date);
	}
	
	public static String encodeBase64File(String path) throws Exception {
		File file = new File(path);
		FileInputStream inputFile = new FileInputStream(file);
		byte[] buffer = new byte[(int) file.length()];
		inputFile.read(buffer);
		inputFile.close();
		return new BASE64Encoder().encode(buffer);

	}
	/**
	 * 将base64字符解码保存文件
	 * 
	 * @param base64Code
	 * @param targetPath
	 * @throws Exception
	 */

	public static void decoderBase64File(String base64Code, String targetPath)
			throws Exception {
		byte[] buffer = new BASE64Decoder().decodeBuffer(base64Code);
		FileOutputStream out = new FileOutputStream(targetPath);
		out.write(buffer);
		out.close();

	}
	public static Date getEndDateByDays(Date startDate, int days) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(startDate);
		calendar.add(Calendar.DAY_OF_YEAR, days);

		return calendar.getTime();
	}
	
	public static void main(String[] args) {
		System.out.println(isCard("652324198508040051"));
	}
}
