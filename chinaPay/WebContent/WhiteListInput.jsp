<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ page import="java.util.*"%>
<jsp:useBean id="errors" scope="request" class="java.util.ArrayList" />
<html> 
	<head>
		<title>WhiteListInput</title>
<meta http-equiv="Content-Type" content="text/html; charset=GBK" />	
<script type="text/javascript">

function checkForm(){
	var MerID=document.getElementById("merId");
	var UserName=document.getElementById("userName");
	var CertId=document.getElementById("certId");
	var CardNo=document.getElementById("cardNo");
	var Mobile=document.getElementById("mobile");
	if(Mobile.value.length ==0){
			alert("�ֻ��Ų���Ϊ�գ�");
			return false;
			Mobile.onblur();
			}
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
	else{
	document.loginForm.submit();
	}
}

</script>	
		
	</head>

	<body>
	<br>
	<br>
	<form method="post" action="./WhiteList" name="WhiteList" onSubmit="return checkForm();"> 
	<center><strong><font size="3">��������Ϣ��</font></strong></center>
	<br>
	<table border="1" cellspacing="1" cellpadding="1" height="300" bordercolor="#2B91D5" align="center" width="700">                 
				  <!--tr>
                    <td class="th20" ><strong>�̻��ţ�</strong></td>
                    <td class="td20left" onmouseout="this.style.backgroundColor=''" onmouseover="this.style.backgroundColor='#CCFFFF'"><input type="text" id="merId" name="MerId" value="808080080988041"/>(15λ���֣����</td>
                  </tr-->
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
                    <td class="td20left" onmouseout="this.style.backgroundColor=''" onmouseover="this.style.backgroundColor='#CCFFFF'"><input type="text" id="certId" name="CertId" value="120221198606121111"/>�����</td>
                  </tr>                 
				  <tr>
                    <td class="th20" ><strong>�ֿ���������</strong></td>
                    <td class="td20left" onmouseout="this.style.backgroundColor=''" onmouseover="this.style.backgroundColor='#CCFFFF'"><input type="text" id="userName" name="UserName" value="�û���"/>(���</td>
                  </tr>
                    <tr>
                    <td class="th20"><strong>����/�ۺţ�</strong></td>
                    <td class="td20left" onmouseout="this.style.backgroundColor=''" onmouseover="this.style.backgroundColor='#CCFFFF'"><input type="text" id="cardNo" name="CardNo" value="900758403049921833"/>�����</td>
                </tr> 
                <tr>
                    <td class="th20"><strong>�ֻ����룺</strong></td>
                    <td class="td20left" onmouseout="this.style.backgroundColor=''" onmouseover="this.style.backgroundColor='#CCFFFF'"><input type="text" id="mobile" name="Mobile" value="13916666665"/>�����</td>
                </tr> 
                <tr>
                    <td class="th20"><strong>סַ��</strong></td>
                    <td class="td20left" onmouseout="this.style.backgroundColor=''" onmouseover="this.style.backgroundColor='#CCFFFF'"><input type="text" name="Address" value="�ֿ��˵�ַ"/>��ѡ�</td>
                </tr> 
                <tr>
                    <td class="th20"><strong>���䣺</strong></td>
                    <td class="td20left" onmouseout="this.style.backgroundColor=''" onmouseover="this.style.backgroundColor='#CCFFFF'"><input type="text" name="Email" value="ABC@ChinaPay.com"/>��ѡ�</td>
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