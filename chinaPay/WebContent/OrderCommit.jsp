<%@ page language="java" import="chinapay.model.bean.*" pageEncoding="GBK"%>
<%@ page import="java.util.*"%>
<jsp:useBean id="payInput" scope="request" class="chinapay.model.bean.TransactionBean" />
<html>
  <head>
    
    <title>TransactionCommit.jsp</title>
    <meta http-equiv="Content-Type" content="text/html; charset=GBK" />
  </head>
  
  <body>
 	   <center><strong><font size="3"> ������Ϣ��</font></strong></center><br>
 	   <form name="oraform" action="TransactionReturn" method="POST" >
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
	String  TermType = payInput.getTermType();

%>	
  <table  border="1" cellspacing="0" cellpadding="0" width="650"  bordercolor="#2B91D5" align="center">
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
		  <td>�������У�</td>
		  <td><%= OpenBankId %></td>
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
		  <td>����汾��:</td>
		  <td><%= Version  %></td>
	  </tr> 
	
	  <tr>
		  <td>֧�����غ�:</td>
		  <td><%= GateId  %></td>
	  </tr>   
	
	  <tr>
		  <td>˽����:</td>
		  <td><%= Priv1 %></td>
	  </tr>
	  <tr>
		  <td>��;:</td>
		  <td><%= Purpose %></td>
	  </tr>
	  <tr>
		  <td>��������:</td>
		  <td><%= TermType %></td>
	  </tr>
	  <tr>
		  <td>����ǩ��:</td>
		  <td width="500" style="word-break:break-all">
                     <%= ChkValue %>
                </td>
	  </tr>
  </table>
<input type=hidden name="merId" value="<%=MerId%>">
<input type=hidden name="orderNo" value="<%=OrdId%>">
<input type=hidden name="transAmt" value="<%=TransAmt%>">
<input type=hidden name="curyId" value="156">
<input type=hidden name="transDate" value="<%=TransDate%>">
<input type=hidden name="transType" value="<%=TransType%>">
<input type=hidden name="version" value="<%=Version%>">
<input type=hidden name="priv1" value="<%=Priv1%>">
<input type=hidden name="chkValue" value="<%=ChkValue%>">
<input type=hidden name="gateId" value="<%=GateId%>">
<input type=hidden name="usrName" value="<%=UserName%>">
<input type=hidden name="certType" value="<%=CertType%>">
<input type=hidden name="certId" value="<%=CertId%>">
<input type=hidden name="openBankId" value="<%=OpenBankId%>">
<input type=hidden name="cardType" value="<%=CardType%>">
<input type=hidden name="cardNo" value="<%=CardNo%>">
<input type=hidden name="purpose" value="<%=Purpose%>">
<input type=hidden name="termType" value="<%=TermType%>">
    <br>
  	   <center>
	  	   <input type="submit" name="submitButton" value="�ύ" class="cmd"/>
	   </center>
	   <br>
       <center>
  	   <a href="./index.jsp">����</a></center><br><br><br>
  	</form>
  </body>
</html>
