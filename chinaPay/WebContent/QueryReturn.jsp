<%@ page language="java" import="chinapay.model.bean.*" pageEncoding="GBK"%>
<%@ page import="java.util.*"%>
<jsp:useBean id="payInput" scope="request" class="chinapay.model.bean.TransactionBean" />
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>QueryReturn.jsp</title>
    <meta http-equiv="Content-Type" content="text/html; charset=GBK" />
  </head>
  
  <body>
 	   <center><strong><font size="3"> Chinapay��̨������Ϣ��</font></strong></center><br>
 	   <%
	String  MerId = payInput.getMerId();
	String  OrdId = payInput.getOrdNo();
	String  TransDate = payInput.getTransDate();
	String  TransType = payInput.getTransType();
	String  TransAmt = payInput.getTransAmt();
	String  CuryId = payInput.getCuryId();
	String  GateId = payInput.getGateId();
	String  Version	= payInput.getVersion();
	String  ChkValue = payInput.getChkValue();
	String  Priv1 = payInput.getPriv1();
	String  Purpose = payInput.getPurpose();
	String  UserName = payInput.getUserName();
	String  CardNo = payInput.getCardNo();
	String  CardType = payInput.getCardType();
	String  OpenBankId = payInput.getOpenBankId();
	String  CertId = payInput.getCertId();
	String  CertType = payInput.getCertType();
	String  ResposeCode = payInput.getResponseCode();
	String  TransStat = payInput.getTransStatus();

%>	
  <table  border="1" cellspacing="0" cellpadding="0" width="550"  bordercolor="#2B91D5" align="center">
	   <tr>
	     <td colspan="2"><center><font color="blue"> ����״̬��Ϣ </font></center></td>
	  </tr>
	  <tr>
		  <td>����Ӧ����:</td>
		  <td><%= ResposeCode %></td>
	  </tr>
		   
	  <tr>
		  <td>����״̬��</td>
		  <td><%= TransStat %></td>
	   </tr>
	  <tr>
	     <td colspan="2"><center><font color="blue"> �������п���Ϣ </font></center></td>
	  </tr>
	  <tr>
		  <td>�ֿ�������:</td>
		  <td><%= UserName %></td>
	  </tr>
		   
	  <tr>
		  <td>֤�����ͣ�</td>
		  <td><%= CertType %></td>
	   </tr>
	   <tr>
		  <td>֤�����룺</td>
		  <td><%= CertId %></td>
	  </tr>
	  
	  <tr>
		  <td>�������к�:</td>
		  <td><%= OpenBankId  %></td>
	  </tr> 
	  <tr>
		  <td>���۱�־��</td>
		  <td><%= CardType  %></td>
	  </tr>
	  <tr>
		  <td>����/�ۺţ�</td>
		  <td><%= CardNo  %></td>
	  </tr> 
	  <tr>
	     <td colspan="2"><center><font color="blue"> �̻�������Ϣ </font></center></td>
	  </tr>  
	  <tr>
		  <td>�̻���:</td>
		  <td><%= MerId %></td>
	  </tr>		   
	  <tr>
		  <td>������:</td>
		  <td><%= OrdId %></td>
	   </tr>
	   <tr>
		  <td>���׽��:</td>
		  <td><%= TransAmt %></td>
	  </tr>
	  <tr>
		  <td>���ױ���:</td>
		  <td><%= CuryId %></td>
	  </tr>
	  <tr>
		  <td>��������:</td>
		  <td><%= TransDate  %></td>
	  </tr>
	  <tr>
		  <td>��������:</td>
		  <td><%= TransType  %></td>
	  </tr>  
	
	  <tr>
		  <td>˽����:</td>
		  <td><%= Priv1 %></td>
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
