package com.fosun.service.test;



import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import net.sf.json.JSONObject;

import org.junit.Test;

import com.fosun.component.base.util.BeanUtil;
import com.fosun.component.base.util.HttpRequestUtil;
import com.fosun.data.util.DataConstant;
import com.fosun.data.util.DataUtil;
import com.fosun.data.util.ExcelsUtils;
import com.fosun.data.util.ExcelsUtils.Point;
import com.fosun.data.util.FileUploadUtils;
import com.fosun.data.util.PropertiesUtils;
import com.fosun.data.util.ServiceUtils;

/**
 * 接口测试类
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
public class DemoTest {
	

	@Test
	public void test_UUID(){
		String taskId = UUID.randomUUID().toString().replaceAll("-", "");
		System.out.println("taskId="+taskId.length());
	}
	@Test
	public void test_Excel(){
		try {
			List<List<String>> readExcel = ExcelsUtils.readExcel(new File("D://Creadit_108.xlsx"));
			for(int i=0;i<readExcel.size();i++){
				List<String> ll = readExcel.get(i);
				if(i == 1){
					ll.add("zhuangtai");
					ll.add("memo");
				}
				if(i>1){
					ll.add("欺诈");
				}
				readExcel.set(i, ll);
			}
			ExcelsUtils.createExcel(readExcel, "D://resultGood1.xlsx",2);
			ExcelsUtils.writeExcel(readExcel, "D://resultGood1.xlsx");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void test_FileUpload(){
		String upUrl = null;
		upUrl = PropertiesUtils.getPropertiesValue("storekeeper_api_sftp_upload");
		String fid = "";
		fid = FileUploadUtils.uploadFileSftp(new File("D://apps//ExcelTemplate//Fraud6.xlsx"),upUrl);
		System.out.println(fid);
	}
	@Test
	public void test_FilePath(){
		String downUrl =null;
		downUrl = PropertiesUtils.getPropertiesValue("storekeeper_api_sftp_download");
		String fid = "Z3JvdXAxL00wMC8wMC8wQS9DcVlLSFZsVEVyR0FDYzl1QUFCZGNXUFpGUFE0MS54bHN4";//MjAxNzA1MTIwOTI3MzNfXzIwMTcwNTEyMDUyNzMyODA0XzU3Y2JkOGY0LTNlYTktNDBlYS1iYmQ4LTU0NGNiYzA5MDlmNS54bHN4
		String filePath = "D://Credit2017042801.xlsx";
		filePath = FileUploadUtils.getFilePath(fid,downUrl);
		System.out.println(filePath);
	}
	@Test
	public void test_FileDownload(){
		String downUrl =null;
		downUrl = PropertiesUtils.getPropertiesValue("storekeeper_api_sftp_download");
		String fid = "Z3JvdXAxL00wMC8wMC80Ri9DcVlLSFZtajU1V0FXR01iQUFBc2MxR0hiV003Ny54bHN4";//MjAxNzA1MTIwOTI3MzNfXzIwMTcwNTEyMDUyNzMyODA0XzU3Y2JkOGY0LTNlYTktNDBlYS1iYmQ4LTU0NGNiYzA5MDlmNS54bHN4
		String filePath = "D://Credit2017042801.xlsx";
		filePath = FileUploadUtils.getFilePath(fid,downUrl);
		String lpath = "/apps/config/data-app/temp/"+DataUtil.getUuid()+"."+ExcelsUtils.xlsx;
		System.out.println(lpath);
		FileUploadUtils.downloadFile(filePath,lpath);
	}
	/**
	 * 批量下载
	 */
	@Test
	public void test_FileDownload_Bat(){
		String downUrl =null;
		downUrl = PropertiesUtils.getPropertiesValue("storekeeper_api_sftp_download");
		List<String> list=new ArrayList<String>();
	    list.add("MjAxNzA1MTYwNTMxNTFfXzIwMTcwNTE2MDEzMDQ1ODQ4XzMyODNlY2JkLTc2ZDAtNGM4OC1iMWQwLTYwOTY4NmEyZGRjYy54bHN4");
	    list.add("MjAxNzA1MTYwNjEzNTZfXzIwMTcwNTE2MDIxMjUwNTQwXzA2YWY1ZWU3LTFlNjQtNDllNC1hODU2LTg5ZWJiMGE0ODUwOS54bHN4");
	    list.add("MjAxNzA1MTYwNjE0MDZfXzIwMTcwNTE2MDIxMzAwNTI5Xzg0ZTNmNzA0LTVkNzYtNGRiOS1hODAyLTZlZGE2YzhkYTgyNi54bHN4");
	    list.add("MjAxNzA1MTYwNjE0MDlfXzIwMTcwNTE2MDIxMzAzNjY0XzQwZmQ4MjRjLWY5NmQtNGZmNi1hNjkxLTY3ZGQ3YWE2YTZmYS54bHN4");
	    list.add("MjAxNzA1MTYwNjE0MTJfXzIwMTcwNTE2MDIxMzA2NzQyX2QzNWViNDJmLWU4YTItNGQxNi04YmQwLWI2NzcxMmJkZjc4Zi54bHN4");
	    list.add("MjAxNzA1MTYwNjE0MTZfXzIwMTcwNTE2MDIxMzEwODkxXzc0MTVhNzAyLWFlYzUtNDMxYi1iNGY0LWRkZDY0OGYwOWJmOS54bHN4");
	    list.add("MjAxNzA1MTYwNjE0MThfXzIwMTcwNTE2MDIxMzEzMDgwX2ZjMjdiMmU5LTRjNGMtNGVmZi1iNDYwLWVmMTdmZjliNjg3NS54bHN4");
	    list.add("MjAxNzA1MTYwNjE0MjFfXzIwMTcwNTE2MDIxMzE1NDc1XzMwYWNhNzYzLWFlMDctNDhkYS04MDA2LTA5OTcyMWMxZjRkYS54bHN4");
	    list.add("MjAxNzA1MTYwNjE3NDVfXzIwMTcwNTE2MDIxNjM5MjA3X2VkODhmN2NjLTRjNmMtNDJjMC04MDA1LTA5ZTc0MTMxOTA0Ny54bHN4");
	    list.add("MjAxNzA1MTYwNjMxMjNfXzIwMTcwNTE2MDIzMDE3ODUzX2I2MDBjOTg4LTBmNGEtNDk4ZS1iMDM3LTdmNGMyY2FkMDVjOC54bHN4");
	    list.add("MjAxNzA1MTYwNjMxMzNfXzIwMTcwNTE2MDIzMDI3ODc1XzU3ZDhhMzI0LTNiZjUtNDRhYS04YWZjLTU1NDhhYmViYmFiZS54bHN4");
	    list.add("MjAxNzA1MTYwNjMxNDRfXzIwMTcwNTE2MDIzMDM4NzA5XzdjMGY0Mjc3LTZiY2EtNDhhYi1iYTUwLWI3NTgxMzU3ODM1NC54bHN4");
	    list.add("MjAxNzA1MTYwNjMxNTFfXzIwMTcwNTE2MDIzMDQ1Mjc1X2YyOWMwNDJjLWNmY2QtNDlkMC04ODFhLWQwNjAyODFhNGRiMS54bHN4");
	    list.add("MjAxNzA1MTYwNjU1NDNfXzIwMTcwNTE2MDI1NDM3OTcwXzdkMDAyY2NlLWFjOTAtNDI4ZC1iZWE0LWI1YjEzZjAyMjFhNi54bHN4");
	    list.add("MjAxNzA1MTYwNjU1NDlfXzIwMTcwNTE2MDI1NDQzNTIwX2I4MmE3OGI3LTllY2UtNGEzOS04ZmE3LWNhMDUzM2Y1NjVlNi54bHN4");
	    list.add("MjAxNzA1MTYwNjU3NDJfXzIwMTcwNTE2MDI1NjM2NjkwXzBlYTY0N2RmLTdhZDEtNDg1OC04YzA2LWMxY2IwZjRkMjY4MS54bHN4");
	    list.add("MjAxNzA1MTkwMzEwMDhfX0NyZWRpdDIwMTcwNDI4MDA4Lnhsc3g=");
	    list.add("MjAxNzA1MTkwMzI2MjBfXzIwMTcwNTE5MTEyNzEyNTY1X2MyN2ViMTI3LWE0NDgtNGY4Ni05NDNkLTgxM2E2OGI4NTQ3NS54bHN4");
		for (int i = 0; i < list.size(); i++) {
			String fid = list.get(i);
			String filePath = FileUploadUtils.getFilePath(fid,downUrl);
			String lpath = "/apps/config/data-app/temp/"+DataUtil.getUuid()+"."+ExcelsUtils.xlsx;
			System.out.println(fid);
			System.out.println(lpath);
			FileUploadUtils.downloadFile(filePath,lpath);
		}
	}
	
	@Test
	public void test_createDir(){ 
		String zpUrl = PropertiesUtils.getPropertiesValue("temp_path");
		FileUploadUtils.createDir(zpUrl);
	}
	@Test
	public void test_delDir(){ 
		List<String> li = new ArrayList<String>();
		li.add("5823c73290c14fef8114c648e46808bc.xlsx");
		li.add("ssss/qqq/aaaa.txt");
		
		
		FileUploadUtils.delFiles(li);
	}
	
	
	
}
