package com.fosun.service.test;

import com.alibaba.fastjson.JSONObject;
import com.antgroup.zmxy.openplatform.api.DefaultZhimaClient;
import com.antgroup.zmxy.openplatform.api.ZhimaApiException;
import com.antgroup.zmxy.openplatform.api.request.ZhimaCreditAntifraudRiskListRequest;
import com.antgroup.zmxy.openplatform.api.request.ZhimaCreditAntifraudScoreGetRequest;
import com.antgroup.zmxy.openplatform.api.request.ZhimaCreditAntifraudVerifyRequest;
import com.antgroup.zmxy.openplatform.api.response.ZhimaCreditAntifraudRiskListResponse;
import com.antgroup.zmxy.openplatform.api.response.ZhimaCreditAntifraudScoreGetResponse;
import com.antgroup.zmxy.openplatform.api.response.ZhimaCreditAntifraudVerifyResponse;
import com.fosun.data.util.PropertiesUtils;


public class ZMXYTest {
	
	//芝麻开放平台地址
    private String gatewayUrl     = PropertiesUtils.getPropertiesValue("zmxy.gatewayUrl");
    //商户应用 Id
    private String appId          = PropertiesUtils.getPropertiesValue("zmxy.appId");
    //商户 RSA 公钥
    private String zhimaPublicKey  = PropertiesUtils.getPropertiesValue("zmxy.zhimaPublicKey");
    //芝麻 RSA 私钥
    private String privateKey = PropertiesUtils.getPropertiesValue("zmxy.privateKey");

    
    /***
     * 欺诈关注清单
     */
    public void  testZhimaCreditAntifraudRiskList() {
        ZhimaCreditAntifraudRiskListRequest req = new ZhimaCreditAntifraudRiskListRequest();
        req.setChannel("apppc");
        req.setPlatform("zmop");
        req.setProductCode("w1010100003000001283");// 必要参数 
        req.setTransactionId("20161127233347987676212309253");// 必要参数 
        req.setCertType("IDENTITY_CARD");// 必要参数 
        req.setCertNo("640202199007164686");// 必要参数 
        req.setName("牛德华");// 必要参数 
        req.setMobile("15843991158");// 
        req.setEmail("jnlxhy@alitest.com");// 
        req.setBankCard("20110602436748024138");// 
        req.setAddress("杭州市西湖区天目山路266号");// 
        req.setIp("101.247.161.1");// 
        req.setMac("44-45-53-54-00-00");// 
        req.setWifimac("00-00-00-00-00-E0");// 
        req.setImei("868331011992179");// 
        DefaultZhimaClient client = new DefaultZhimaClient(gatewayUrl, appId, privateKey, zhimaPublicKey);
        try {
            ZhimaCreditAntifraudRiskListResponse response =(ZhimaCreditAntifraudRiskListResponse)client.execute(req);
            System.out.println(response.getBody());
        } catch (ZhimaApiException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * 欺诈信息验证
     */
    public void  testZhimaCreditAntifraudVerify() {
        ZhimaCreditAntifraudVerifyRequest req = new ZhimaCreditAntifraudVerifyRequest();
        req.setChannel("apppc");
        req.setPlatform("zmop");
        req.setProductCode("w1010100000000002859");// 必要参数 
        req.setTransactionId("20151127233347987676212309252");// 必要参数 
        req.setCertNo("640202199007164686");// 必要参数 
        req.setCertType("IDENTITY_CARD");// 必要参数 
        req.setName("牛德华");// 必要参数 
        req.setMobile("15843991158");// 
        req.setEmail("jnlxhy@alitest.com");// 
        req.setBankCard("20110602436748024138");// 
        req.setAddress("杭州市西湖区天目山路266号");// 
        req.setIp("101.247.161.1");// 
        req.setMac("44-45-53-54-00-00");// 
        req.setWifimac("00-00-00-00-00-E0");// 
        req.setImei("868331011992179");// 
        DefaultZhimaClient client = new DefaultZhimaClient(gatewayUrl, appId, privateKey, zhimaPublicKey);
        try {
            ZhimaCreditAntifraudVerifyResponse response =(ZhimaCreditAntifraudVerifyResponse)client.execute(req);
            System.out.println(response.getBody());
        } catch (ZhimaApiException e) {
            e.printStackTrace();
        }
    }

    /***
     * 申请欺诈评分
     */
    public void  testZhimaCreditAntifraudScoreGet() {
        ZhimaCreditAntifraudScoreGetRequest req = new ZhimaCreditAntifraudScoreGetRequest();
        req.setChannel("apppc");
        req.setPlatform("zmop");
        req.setProductCode("w1010100003000001100");// 必要参数 
        req.setTransactionId("2017628946578161498614417816");// 必要参数 
        req.setCertType("IDENTITY_CARD");// 必要参数 
        req.setCertNo("640202199007164686");// 必要参数 
        req.setName("牛德华");// 必要参数 
        req.setMobile("15843991158");// 
        req.setEmail("jnlxhy@alitest.com");// 
        req.setBankCard("20110602436748024138");// 
        req.setAddress("杭州市西湖区天目山路266号");// 
        req.setIp("101.247.161.1");// 
        req.setMac("44-45-53-54-00-00");// 
        req.setWifimac("00-00-00-00-00-E0");// 
        req.setImei("868331011992179");// 
        DefaultZhimaClient client = new DefaultZhimaClient(gatewayUrl, appId, privateKey, zhimaPublicKey);
        try {
            ZhimaCreditAntifraudScoreGetResponse response =(ZhimaCreditAntifraudScoreGetResponse)client.execute(req);
            JSONObject json;  
            json = JSONObject.parseObject(response.getBody());  
            System.err.println(json); 
            System.out.println(response.getBody());
        } catch (ZhimaApiException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
    	ZMXYTest result = new  ZMXYTest();
        result.testZhimaCreditAntifraudRiskList();
        result.testZhimaCreditAntifraudVerify();
        result.testZhimaCreditAntifraudScoreGet();
//    	Calendar calendar = Calendar.getInstance();  
//        int year = calendar.get(Calendar.YEAR);  
//        int month = calendar.get(Calendar.MONTH) + 1;  
//        int day = calendar.get(Calendar.DAY_OF_MONTH);
//        int hour = calendar.get(Calendar.HOUR_OF_DAY);
//        int minute = calendar.get(Calendar.MINUTE);  
//        int second = calendar.get(Calendar.SECOND);
//        int millisecond = calendar.get(Calendar.MILLISECOND);
//        StringBuffer sb = new StringBuffer();
//        sb.append(year).append(month).append(day).append(hour).append(minute).append(second).append(millisecond).append(Calendar.getInstance().getTimeInMillis());
//        System.out.println(year + "" + month + "" + day +""+ hour + "" + minute + "" + second+ "" + millisecond + "" + Calendar.getInstance().getTimeInMillis());  
//    	System.out.println(sb.toString());
    }

	
	
}
