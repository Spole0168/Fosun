package com.test.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import com.fosun.channel.mq.model.ReqMessage;
import com.fosun.channel.mq.model.ReqMsgHeader;
import com.fosun.channel.util.MessageUtil;
import com.fosun.pay.service.model.IdCheck;
import com.test.util.TestConstant;

/**
 * 
 *
 * @Copyright 
 *
 * <pre>
 * =================Modify Record=================
 * Modifier			date				Content
 * yunbo.wei		2017年8月13日			新增
 *
 * </pre>
 */
public class SendMsg2MqUtils {
	
	
	public static String send(String serviceName,Map<String, Object> paramMap) throws JMSException{ 
		String res = "";
		//建立连接工厂
		ActiveMQConnectionFactory fcy = new ActiveMQConnectionFactory();
		fcy.setBrokerURL(TestConstant.MQ_VALUE);
		fcy.setUseAsyncSend(true);
		
    	//获取请求目的地
    	Destination reqDestination = new ActiveMQQueue("PAY.REQ");
    	//返回的队列地址
    	final Destination rsqDestination = new ActiveMQQueue("PAY.RSP");
    	
    	final String correlationId = UUID.randomUUID().toString().replaceAll("-", "");
    	
    	
    	JmsTemplate  jmsTemplate = new org.springframework.jms.core.JmsTemplate();
    	jmsTemplate.setConnectionFactory(fcy);
    	jmsTemplate.setDeliveryMode(1);
    	jmsTemplate.setReceiveTimeout(30000);
    	
    	//请求报文
    	ReqMessage reqMessage = new ReqMessage();
    	//头
    	ReqMsgHeader msgHeader = new ReqMsgHeader();
    	msgHeader.setFromSysCode("test");
    	msgHeader.setService(serviceName);
    	SimpleDateFormat yyyyMMddHHmmss2 = new SimpleDateFormat("yyyyMMddHHmmss");
		msgHeader.setTimestamp(yyyyMMddHHmmss2.format(new Date()));
    	msgHeader.setToSysCode("PAY");
    	msgHeader.setTransNo(UUID.randomUUID().toString().replaceAll("-", ""));//交易ID
    	reqMessage.setMsgHeader(msgHeader);
    	
    	//参数
    	reqMessage.setParamMap(paramMap);
    	final String messageJson = MessageUtil.obj2Json(reqMessage);
    	System.out.println(serviceName+" Paramters:\t"+messageJson);
    	//发送
    	jmsTemplate.send(reqDestination, new MessageCreator() {  
            public Message createMessage(Session session) throws JMSException {  
            	TextMessage textMessage = session.createTextMessage(messageJson);
            	//设置返回队列为自己系统监控队列
            	textMessage.setJMSReplyTo(rsqDestination);
            	textMessage.setJMSCorrelationID(correlationId);
				return textMessage;
            }  
        }); 

    	//接收异步消息
        String filter = "JMSCorrelationID = '" + correlationId + "'"; 
        TextMessage rspMsg = (TextMessage) jmsTemplate.receiveSelected(rsqDestination, filter);
        if(rspMsg!=null){
        	System.out.println("客户端接收到Response消息："+rspMsg.getText());
        	res = rspMsg.getText();
        }else{  
        	System.out.println("======无消息返回，通讯超时!=======");
        	res = "";
        }

        return res;
	}

}
