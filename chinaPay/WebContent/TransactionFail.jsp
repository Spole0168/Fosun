<%@ page language="java" import="chinapay.model.bean.*" pageEncoding="GBK"%>
<%@ page import="java.util.*"%>
<jsp:useBean id="payInput" scope="request" class="chinapay.model.bean.TransactionBean" />
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>TransFail.jsp</title>
    <meta http-equiv="Content-Type" content="text/html; charset=GBK" />
  </head>
  
  <body>
 	   <center><strong><font size="3"> Chinapay��̨������Ϣ��</font></strong></center><br>
 	   <%
	String  Message = payInput.getMessage();
	String  ResposeCode = payInput.getResponseCode();
	String  TransStat = payInput.getTransStatus();

%>	
  <table  border="1" cellspacing="0" cellpadding="0" width="500"  bordercolor="#2B91D5" align="center">
	   <tr>
	     <td colspan="2"><center><font color="blue"> ����״̬��Ϣ </font></center></td>
	  </tr>
	  <tr>
		  <td>����Ӧ����:</td>
		  <td><%= ResposeCode %></td>
	  </tr>
	  <tr>
		  <td>���״�����Ϣ:</td>
		  <td><%= Message %></td>
	  </tr>
		   
	  <tr>
		  <td>����״̬��</td>
		  <td><%= TransStat %></td>
	   </tr>

	  <tr>
	     <td colspan="2"><center><font color="red"> ��ǩ������ȷ��</font></center></td>
	  </tr>
  </table>

	   <br>
       <center>
  	<a href="./index.jsp">����</a></center><br><br><br>
  </body>
</html>
