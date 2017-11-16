package com.fosun.data.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import net.sf.json.JSONObject;

import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.fosun.component.base.exception.CommonException;
import com.fosun.component.base.util.UploadUtil;

public class FileUploadUtils {
	private static UploadUtil uu = new UploadUtil();

	public static String uploadFileSftp(File filename, String url)
			throws CommonException {
		String jsonResult = null;
		String encodeName = null;

		if (null != url && url.length() > 0) {
			RestTemplate rest = new RestTemplate();
			FileSystemResource resource = new FileSystemResource(filename);
			MultiValueMap<String, Object> param = new LinkedMultiValueMap<String, Object>();

			param.add("file", resource);
			param.add("bizGroup", "GJ_YUNTONG_SFTP");
			param.add("bizSub", resource.getFilename());
			param.add("sysName", "projects-yt");

			param.add("requestCode", "sftp_upload");
			param.add("invokerName", "sftp_upload");

			HttpEntity<MultiValueMap<String, Object>> httpEntity = new HttpEntity<MultiValueMap<String, Object>>(
					param);
			try {
				ResponseEntity<String> responseEntity = rest.exchange(url,
						HttpMethod.POST, httpEntity, String.class);
				jsonResult = responseEntity.getBody();
			} catch (Exception e) {
				throw new CommonException(e);
			}
		}
		if (null == url || url.length() == 0) {
			// 调用 影像系统
			jsonResult = uu.uploadSftp(filename);
		}
		JSONObject jsonObject = JSONObject.fromObject(jsonResult);
		String type = jsonObject.getString("type");
		if ("success".equals(type)) {
			String dataStr = jsonObject.getString("data");
			JSONObject dataJson = JSONObject.fromObject(dataStr);
			encodeName = dataJson.getString("encodeName");
		}
		return encodeName;
	}

	public static String getFilePath(String encodeName, String downloadApi)
			throws CommonException {
		String jsonResult = null;
		String realPath = null;
		if (null != downloadApi && downloadApi.length() > 0) {
			RestTemplate rest = new RestTemplate();
			String url = downloadApi + "?" + "bizGroup=" + "GJ_YUNTONG_SFTP"
					+ "&bizSub=" + encodeName + "&encodeName=" + encodeName
					+ "&sysName=" + "projects-yt" + "&requestCode="
					+ "sftp_upload" + "&invokerName=" + "sftp_upload";

			try {
				jsonResult = rest.getForObject(url, String.class);

			} catch (Exception e) {
				throw new CommonException(e);
			}
		}
		if (null == downloadApi || downloadApi.length() == 0) {
			// 调用 影像系统
			jsonResult = uu.getFile(encodeName);
		}
		JSONObject jsonObject = JSONObject.fromObject(jsonResult);
		String type = jsonObject.getString("type");

		if ("success".equals(type)) {
			String dataStr = jsonObject.getString("data");
			JSONObject dataJson = JSONObject.fromObject(dataStr);
			realPath = dataJson.getString("realPath");
		}
		return realPath;
	}

	public static void downloadFile(String remoteFilePath, String localFilePath) {
		URL urlfile = null;
		HttpURLConnection httpUrl = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		File f = new File(localFilePath);
		try {
			urlfile = new URL(remoteFilePath);
			httpUrl = (HttpURLConnection) urlfile.openConnection();
			httpUrl.connect();
			bis = new BufferedInputStream(httpUrl.getInputStream());
			bos = new BufferedOutputStream(new FileOutputStream(f));
			int len = 2048;
			byte[] b = new byte[len];
			while ((len = bis.read(b)) != -1) {
				bos.write(b, 0, len);
			}
			bos.flush();
			bis.close();
			httpUrl.disconnect();
		} catch (Exception e) {
			e.printStackTrace();
			throw new CommonException("999999","下载文件失败");
		} finally {
			try {
				bis.close();
				bis = null;
				bos.close();
				bos = null;
			} catch (IOException e) {
//				throw new CommonException("999999","下载文件失败");
			}
		}
	}

	/**
	 * 创建临时文件夹
	 * 
	 * @param destDirName
	 * @return
	 */
	public static boolean createDir(String destDirName) {
		File dir = new File(destDirName);
		if (!dir.exists()) {
			dir.mkdirs();
			return true;
		}
		return false;
	}
	/**
	 * <p> 删除临时目录下的指定临时文件
	 * @param fnlist ：要删除的文件名称
	 */
	public static void delFiles(List<String> fnlist) {
		String tempPath = PropertiesUtils.getPropertiesValue("temp_path");
		System.out.println(tempPath);
		File temp = new File(tempPath);
		if(null!=temp&&temp.length()>0){
			File[] flist = temp.listFiles();
			for(File tf : flist){
//				if (tf.isFile() && tf.exists() && fnlist.contains(tf.getName())) { 
				if (tf.isFile() && tf.exists() && DataUtil.isExistObjInList(fnlist, tf.getName())) { 
					try {
						tf.delete();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

	
}
