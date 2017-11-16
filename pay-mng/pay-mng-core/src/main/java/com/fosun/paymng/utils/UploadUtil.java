package com.fosun.paymng.utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.huateng.scube.exception.ScubeBizException;


/**
 * <p>
 * description:
 * </p>
 * 
 * @author liqy
 * @since 2016年10月13日
 * @see
 */
public class UploadUtil {
	
    /**
     * @description 返回文件
     * @param filename
     * @return
     * @throws ScubeBizException
     * @author zhangyi003 2017-3-21
     */
    public static String uploadSftp(File filename) throws ScubeBizException {
    	String jsonResult = null;
    	String url = (String) ToolUtil.getProperties("storekeeper_api_sftp_upload");
    	String encodeName = "";
        //String url = propertiesLoader.getProperty("storekeeper_api_sftp_upload");
        RestTemplate rest = new RestTemplate();
        FileSystemResource resource = new FileSystemResource(filename);
        MultiValueMap<String, Object> param = new LinkedMultiValueMap<String, Object>();

        param.add("file", resource);
        param.add("bizGroup", "GJ_YUNTONG_SFTP");
        param.add("bizSub", resource.getFilename());
        param.add("sysName", "projects-yt");

        param.add("requestCode", "sftp_upload");
        param.add("invokerName", "sftp_upload");

        HttpEntity<MultiValueMap<String, Object>> httpEntity = new HttpEntity<MultiValueMap<String, Object>>(param);
        try {
            ResponseEntity<String> responseEntity = rest.exchange(url, HttpMethod.POST, httpEntity,
                    String.class);
            jsonResult = responseEntity.getBody();
			Map<String,Object> obj = (Map<String, Object>) JSON.parse(jsonResult);
			JSONObject data = (JSONObject) obj.get("data");
			encodeName = data.get("encodeName").toString();
        } catch (Exception e) {
        	e.printStackTrace();
            throw new ScubeBizException("影像服务器开了小差，请联系管理员");
        }

        return encodeName;
    }

    /**
     * @description 返回文件服务器上的ftp链接
     * @param encodeName
     * @return
     * @throws ScubeBizException
     * @author zhangyi003 2017-3-21
     */
    public static String getFile(String encodeName) throws ScubeBizException {
    	String jsonResult = null;
    	
    	String downloadApi = (String) ToolUtil.getProperties("storekeeper_api_sftp_download");
        //String downloadApi = propertiesLoader.getProperty("storekeeper_api_sftp_download");
        RestTemplate rest = new RestTemplate();
        String url = downloadApi+"?"
        		+ "bizGroup="+"GJ_YUNTONG_SFTP"
		        + "&bizSub="+encodeName
		        + "&encodeName="+encodeName
		        + "&sysName="+"projects-yt"
		        + "&requestCode="+"sftp_upload"
		        + "&invokerName="+"sftp_upload";
        System.out.println(url);
        try {
            jsonResult = rest.getForObject(url, String.class);
            System.out.println(jsonResult);
            
            Map<String,Object> obj = (Map<String, Object>) JSON.parse(jsonResult);            
            JSONObject data = (JSONObject) obj.get("data");
            jsonResult = data.get("realPath").toString();
             
        } catch (Exception e) {
        	e.printStackTrace();
        	throw new ScubeBizException("影像服务器开了小差，请联系管理员");
        }
        return jsonResult;
    }
    
    /**  
     * 下载远程文件并保存到本地  
     * @param remoteFilePath 远程文件路径   
     * @param localFilePath 本地文件路径  
     */
    public static void downloadFile(String remoteFilePath, String localFilePath)
    {
        URL urlfile = null;
        HttpURLConnection httpUrl = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        File f = new File(localFilePath);
        try
        {
            urlfile = new URL(remoteFilePath);
            httpUrl = (HttpURLConnection)urlfile.openConnection();
            httpUrl.connect();
            bis = new BufferedInputStream(httpUrl.getInputStream());
            bos = new BufferedOutputStream(new FileOutputStream(f));
            int len = 2048;
            byte[] b = new byte[len];
            while ((len = bis.read(b)) != -1)
            {
                bos.write(b, 0, len);
            }
            bos.flush();
            bis.close();
            httpUrl.disconnect();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            throw new ScubeBizException("下载文件失败");
        }
        finally
        {
            try
            {
                bis.close();
                bos.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
                throw new ScubeBizException("下载文件失败");
            }
        }
    }
    
    public static void main(String[] args) throws ScubeBizException {
//    	File f = new File("C:/Users/clz/Desktop/tmpFilePath/微信截图_201703311036152312.png");
//    	uploadSftp(f);
    	UploadUtil uu = new UploadUtil();
    	String ss = uu.getFile("MjAxNzA0MDYwODMyMTNfXzIwMTcwNDA2MDQzMjE1NTYzXzY1ZDhmYjM3LTZjNDItNGRhMy05YWNmLTU0ZjVlZThmZTk3My5wbmc=");
    	System.out.println(ss);
	}
}
