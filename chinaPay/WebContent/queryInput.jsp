<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<jsp:useBean id="errors" scope="request" class="java.util.ArrayList" />
<html> 
	<head>
		<title>QueryInput</title>
<meta http-equiv="Content-Type" content="text/html; charset=GBK" />	
<script type="text/javascript">

function checkForm(){
	var MerID=document.getElementById("merId");
	var OrdId=document.getElementById("ordId");
	var TransDate=document.getElementById("transDate");
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

</script>	
		
	</head>
	<body>
	<br>
	<br>
	<form method="post" action="./QuerySend" name="QuerySend" onSubmit="return checkForm();"> 
	<center><strong><font size="3">���ʲ�ѯ���ԣ�</font></strong></center>
	<br>
	<table border="1" cellspacing="1" cellpadding="1" height="300" bordercolor="#2B91D5" align="center" width="700">                 
				  <!--tr>
                    <td class="th20" ><strong>�̻��ţ�</strong></td>
                    <td class="td20left" onmouseout="this.style.backgroundColor=''" onmouseover="this.style.backgroundColor='#CCFFFF'"><input type="text" id="merId" name="MerId" value="808080080988041"/>(15λ���֣����</td>
                  </tr-->
                  <tr>
                    <td class="th20"><strong>���׶����ţ�</strong></td>
                    <td class="td20left" onmouseout="this.style.backgroundColor=''" onmouseover="this.style.backgroundColor='#CCFFFF'"><input type="text" id="ordId" name="OrdId" value="0020110802134723"/>(16λ���֣�ԭʼ���׶�����)</td>
                  </tr>
                  <tr>
                    <td class="th20"><strong>�������ڣ�</strong></td>
                    <td class="td20left" onmouseout="this.style.backgroundColor=''" onmouseover="this.style.backgroundColor='#CCFFFF'"><input type="text" id="transDate" name="TransDate" value="20110802"/>(8λ���֣�ԭʼ���׶�������)</td>
                  </tr>         
                  <tr>
                    <td class="th20"><strong>�������ͣ�</strong></td>
                    <td class="td20left" onmouseout="this.style.backgroundColor=''" onmouseover="this.style.backgroundColor='#CCFFFF'"><input type="text" name="TransType" value="0003"/>(4λ���֣����۽���Ϊ0003)</td>
                </tr>
                <tr>
                    <td class="th20"><strong>���ʲ�ѯ�ӿڰ汾��</strong></td>
                    <td class="td20left" onmouseout="this.style.backgroundColor=''" onmouseover="this.style.backgroundColor='#CCFFFF'"><input type="text" name="Version" value="20100831"/>(8λ���֣���ѯ�ӿڰ汾��) </td>
                  </tr>
                 <tr>
                    <td class="th20"><strong>�̻�������</strong></td>
                    <td class="td20left" onmouseout="this.style.backgroundColor=''" onmouseover="this.style.backgroundColor='#CCFFFF'"><input type="text" name="Priv1" value="Memo"/>����Ϊ�գ�</td>
                  </tr> 
                  
  </table>
  <br>
  	   <center>
	  	   <input type="submit" name="submitButton" value="�ύ" class="cmd"/>
		   <input type="reset" name="submitButton2" value="����" class="cmd"/>
	   </center>
</form>
<p><font color="blue">
ע�� <br>&nbsp;&nbsp;&nbsp;&nbsp;
1.Ŀǰ��ѯ���ܽ�֧�ֶԴ��۳ɹ������Ĳ�ѯ���������͵Ĳ�ѯ�ݲ�֧�֡�<br>&nbsp;&nbsp;&nbsp;&nbsp;
2.ʹ�ò�ѯ����ǰ����Ҫ��ǰ���̻����ڲ�ѯ�ķ�����IP����ChinaPay�������ú�ſ�ʹ�á�<br>&nbsp;&nbsp;&nbsp;&nbsp;
3.��ѯ����ÿ��IP��Ĭ�ϲ�ѯ���Ϊ30s��
</font></p>	
	   
	
</body>
</html>