<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<jsp:useBean id="errors" scope="request" class="java.util.ArrayList" />
<html> 
	<head>
		<title>TransactionInput.jsp</title>
<meta http-equiv="Content-Type" content="text/html; charset=GBK" />
<script type="text/javascript"><!--

function checkForm(){
	var MerID=document.getElementById("merId");
	var OrdId=document.getElementById("ordNo");
	var TransAmt=document.getElementById("transAmt");
	var TransDate=document.getElementById("transDate");
	var UserName=document.getElementById("userName");
	var CertId=document.getElementById("certId");
	var CardNo=document.getElementById("cardNo");
	if(UserName.value.length ==0){
			alert("�ֿ�����������Ϊ�գ�");
			return false;
			UserName.onblur();
			}
	if(CertId.value.length==0){
			alert("֤�����벻��Ϊ�գ�");
			return false;
			CertId.onblur();
			}
	if(CardNo.value.length==0){
			alert("���Ż��ۺŲ���Ϊ�գ�");
			return false;
			CardNo.onblur();
			}	
	
//	if(MerID.value.length !==15){
//			alert("�̻��ų��ȷǷ���");
//			return false;
//			MerID.onblur();
//			}
	if(OrdId.value.length!==0){
			if(OrdId.value.length!==16){
			alert("�����ų��ȷǷ���");
			return false;
			OrdId.onblur();
			}
			}
	if(TransAmt.value.length!==12){
			alert("���׽��ȷǷ���");
			return false;
			TransAmt.onblur();
			}
	if(TransDate.value.length!==0){
	        if(TransDate.value.length!==8){
			alert("���ڳ��ȷǷ���");
			return false;
			TransDate.onblur();
			}
			}		
	else{
	document.loginForm.submit();
	}
}

--></script>	
		
	</head>

	<body>
	<form method="post" action="./Transaction" name="Transaction" onSubmit="return checkForm();"> 
		<center><strong><font size="3" color="blue">�������п���Ϣ��</font></strong></center>
	<br>
	<table border="1" cellspacing="1" cellpadding="1" height="200" bordercolor="#2B91D5" align="center" width="700">                 
				  <tr>
                    <td class="th20" ><strong>�ֿ���������</strong></td>
                    <td class="td20left" onmouseout="this.style.backgroundColor=''" onmouseover="this.style.backgroundColor='#CCFFFF'"><input type="text" id="userName" name="UserName" value="����"/>(���</td>
                  </tr>
                  <tr>
                    <td class="th20"><strong>֤�����ͣ�</strong></td>
                    <td width="500"><select size="1" name="CertType">
                    <option selected value="01">���֤</option>
                    <option value="02">����֤</option>
                    <option value="03">����</option>
                    <option value="04">���ڲ�</option>
                    <option value="05">����֤</option>
                    <option value="06">����</option>
                    </select></td>
                    </tr>
                  <tr>
                    <td class="th20"><strong>֤�����룺</strong></td>
                    <td class="td20left" onmouseout="this.style.backgroundColor=''" onmouseover="this.style.backgroundColor='#CCFFFF'"><input type="text" id="certId" name="CertId" value="120221198606121502"/>�����</td>
                  </tr>
                  <tr>
                    <td class="th20"><strong>�������У�</strong></td>
                    <td width="500"><select size="1" name="OpenBankId">
                    <option selected value="0102">��������</option>
                    <option value="0103">ũҵ����</option>
                    <option value="0105">��������</option>
                    <option value="0301">��ͨ����</option>
                    <option value="0308">��������</option>
                    <option value="0305">��������</option>
                    <option value="0302">��������</option>
                    <option value="0306">�㶫��չ����</option>
                    <option value="0307">�չ����</option>
                    <option value="0309">��ҵ����</option>
                    <option value="0303">�й��������</option>
                    <option value="0410">�й�ƽ������</option>
                    <option value="0100">�ʴ�</option>
                    </select></td>
                   </tr> 
                  <tr>
                    <td class="th20"><strong>���۱�־��</strong></td>
                    <td class="td20left" onmouseout="this.style.backgroundColor=''" onmouseover="this.style.backgroundColor='#CCFFFF'">
                    <input type="radio" name="CardType" value="0" checked="checked">��
				    <input type="radio" name="CardType" value="1">��</td>
                  </tr>         
                  <tr>
                    <td class="th20"><strong>����/�ۺţ�</strong></td>
                    <td class="td20left" onmouseout="this.style.backgroundColor=''" onmouseover="this.style.backgroundColor='#CCFFFF'"><input type="text" id="cardNo" name="CardNo" value="900758403049921840"/>�����</td>
                </tr>                  
    </table>
    <br>
    <br>
	<center><strong><font size="3" color="blue">������Ϣ��</font></strong></center>
	<br>
	<table border="1" cellspacing="1" cellpadding="1" height="300" bordercolor="#2B91D5" align="center" width="700">                 
				  <!--tr>
                    <td class="th20" ><strong>�̻��ţ�</strong></td>
                    <td class="td20left" onmouseout="this.style.backgroundColor=''" onmouseover="this.style.backgroundColor='#CCFFFF'"><input type="text" id="merId" name="MerId"/>(15λ���֣�</td>
                  </tr-->
                  <tr>
                    <td class="th20"><strong>���׶����ţ�</strong></td>
                    <td class="td20left" onmouseout="this.style.backgroundColor=''" onmouseover="this.style.backgroundColor='#CCFFFF'"><input type="text" id="ordNo" name="OrdNo"/>(16λ���֣�������ϵͳ�Զ�����)</td>
                  </tr>
                  <tr>
                    <td class="th20"><strong>���׽��֣���</strong></td>
                    <td class="td20left" onmouseout="this.style.backgroundColor=''" onmouseover="this.style.backgroundColor='#CCFFFF'"><input type="text" id="transAmt" name="TransAmt" value="000000000001"/>(12λ����,����Ĭ�Ͻ��Ϊ1��) </td>
                  </tr>
                  <tr>
                    <td class="th20"><strong>���֣�</strong></td>
                    <td class="td20left" onmouseout="this.style.backgroundColor=''" onmouseover="this.style.backgroundColor='#CCFFFF'"><input type="text" name="CuryId" value="156" />(3λ���֣��̶�Ϊ�����156��</td>
                  </tr> 
                  <tr>
                    <td class="th20"><strong>�������ڣ�</strong></td>
                    <td class="td20left" onmouseout="this.style.backgroundColor=''" onmouseover="this.style.backgroundColor='#CCFFFF'"><input type="text" id="transDate" name="TransDate"/>(8λ���֣�����ϵͳĬ��Ϊ��ǰ����)</td>
                  </tr>         
                  <tr>
                    <td class="th20"><strong>�������ͣ�</strong></td>
                    <td class="td20left" onmouseout="this.style.backgroundColor=''" onmouseover="this.style.backgroundColor='#CCFFFF'"><input type="text" name="TransType" value="0003"/>(4λ���֣����۽���Ϊ0003)</td>
                </tr>
                <tr>
                    <td class="th20"><strong>�ӿڰ汾��</strong></td>
                    <td class="td20left" onmouseout="this.style.backgroundColor=''" onmouseover="this.style.backgroundColor='#CCFFFF'"><input type="text" name="Version" value="20150304"/>(8λ���֣����۰汾��Ϊ20150304)</td>
                </tr>
                  <tr>
                    <td class="th20"><strong>���أ�</strong></td>
                    <td class="td20left" onmouseout="this.style.backgroundColor=''" onmouseover="this.style.backgroundColor='#CCFFFF'"><input type="text" name="GateId" value="7008"/>(4λ���֣�Chinapay���غ�Ϊ7008)</td>
                </tr>
                    <tr>
                    <td class="th20"><strong>�̻�˽����</strong></td>
                    <td class="td20left" onmouseout="this.style.backgroundColor=''" onmouseover="this.style.backgroundColor='#CCFFFF'"><input type="text" name="Priv1" value="Memo"/>�Ǳ��루��Ϊ�գ�</td>
                  </tr>
                  <tr>
                    <td class="th20"><strong>��;��</strong></td>
                    <td class="td20left" onmouseout="this.style.backgroundColor=''" onmouseover="this.style.backgroundColor='#CCFFFF'"><input type="text" name="Purpose" value="Memo"/>�Ǳ��루��Ϊ�գ�</td>
                  </tr> 
                   <tr>
                    <td class="th20"><strong>�������ͣ�</strong></td>
                    <td class="td20left" onmouseout="this.style.backgroundColor=''" onmouseover="this.style.backgroundColor='#CCFFFF'">
                    <select size="1" name="termType">
                    <option selected value="">��ѡ��</option>
                    <option  value="07">07��������</option>
                    <option  value="08">08���ƶ���</option>
                    </select>�Ǳ��루��Ϊ�գ�</td>
                  </tr> 
                  
  </table>
  <br>
  	   <center>
	  	   <input type="submit" name="submitButton" value="�ύ" class="cmd"/>
		   <input type="reset" name="submitButton2" value="����" class="cmd"/>
	   </center>
</form>
	
	   
	
</body>
</html>