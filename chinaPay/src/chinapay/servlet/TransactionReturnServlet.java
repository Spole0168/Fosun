package chinapay.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.httpclient.*;
import org.apache.commons.httpclient.methods.*;
import org.apache.commons.httpclient.params.HttpMethodParams;

import chinapay.Base64;
import chinapay.PrivateKey;
import chinapay.SecureLink;
import chinapay.model.bean.TransactionBean;
import chinapay.util.Config;

/**
 * @author huang.xuting
 * 
 */

public class TransactionReturnServlet extends HttpServlet {

	private static final String Payment = "/TransactionInput.jsp";
	private static final String PaymentUrl = "chinapay.payment.url";
	private static final String KEY_CHINAPAY_MERKEY_FILEPATH = "chinapay.merkey.filepath";
	private static final String KEY_CHINAPAY_PUBKEY_FILEPATH = "chinapay.pubkey.filepath";

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("GBK");
		List errorList = new ArrayList();
		String MerKeyPath = null;
		String PubKeyPath = null;
		String pay_url = null;
		try {
			Properties config = Config.getInstance().getProperties();
			MerKeyPath = config.getProperty(KEY_CHINAPAY_MERKEY_FILEPATH);
			PubKeyPath = config.getProperty(KEY_CHINAPAY_PUBKEY_FILEPATH);// chinapay.merkey.filepath
			pay_url = config.getProperty(PaymentUrl); // chinapay.payment.url
		} catch (Exception e) {
			errorList.add("˽Կ��ʼ��ʧ�ܣ�");
		}

		System.out.println(MerKeyPath);
		System.out.println(PubKeyPath);

		if (!errorList.isEmpty()) {
			request.setAttribute("errors", errorList);
			request.getRequestDispatcher(Payment).forward(request, response);
			return;
		}

		// ��ȡҳ������
		String merId = request.getParameter("merId"); // 15
		String curyId = request.getParameter("curyId");// 3
		String transType = request.getParameter("transType");
		String gateId = request.getParameter("gateId");
		String transAmt = request.getParameter("transAmt");
		String version = request.getParameter("version");
		String orderNo = request.getParameter("orderNo");
		String transDate = request.getParameter("transDate");
		String openBankId = request.getParameter("openBankId");
		String cardType = request.getParameter("cardType");
		String cardNo = request.getParameter("cardNo");
		String certType = request.getParameter("certType");
		String certId = request.getParameter("certId");
		String usrName = request.getParameter("usrName"); // Test data!
		String priv1 = request.getParameter("priv1");
		String purpose = request.getParameter("purpose");
		String chkValue = request.getParameter("chkValue");
		String termType = request.getParameter("termType");
		
		System.out.println("Test by ReturnServlet = " +  termType);

		// ����Chinapay��̨
		HttpClient httpClient = new HttpClient();
		System.out.println("HttpClient����������");
		httpClient.getParams().setParameter(
				HttpMethodParams.HTTP_CONTENT_CHARSET, "GBK");
		String url = pay_url;
		System.out.println(url);
		PostMethod postMethod = new PostMethod(url);
		System.out.println("Post����������");

		// ������������ֵ
		NameValuePair[] data = { new NameValuePair("merId", merId),
				new NameValuePair("transDate", transDate),
				new NameValuePair("orderNo", orderNo),
				new NameValuePair("transType", transType),
				new NameValuePair("openBankId", openBankId),
				new NameValuePair("cardType", cardType),
				new NameValuePair("cardNo", cardNo),
				new NameValuePair("usrName", usrName),
				new NameValuePair("certType", certType),
				new NameValuePair("certId", certId),
				new NameValuePair("curyId", curyId),
				new NameValuePair("transAmt", transAmt),
				new NameValuePair("purpose", purpose),
				new NameValuePair("priv1", priv1),
				new NameValuePair("version", version),
				new NameValuePair("gateId", gateId),
				new NameValuePair("termType",termType),
				new NameValuePair("chkValue", chkValue) };

		System.out.println(data);

		// ������ֵ����postMethod��
		postMethod.setRequestBody(data);
		// ִ��postMethod
		int statusCode = 0;
		try {
			statusCode = httpClient.executeMethod(postMethod);
		} catch (HttpException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// ��ȡ����
		InputStream resInputStream = null;
		try {
			resInputStream = postMethod.getResponseBodyAsStream();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// ��������
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				resInputStream));
		String tempBf = null;
		StringBuffer html = new StringBuffer();
		while ((tempBf = reader.readLine()) != null) {

			html.append(tempBf);
		}
		String resMes = html.toString();
		System.out.println(resMes);
		int dex = resMes.lastIndexOf("=");

		//��ȡ����Ӧ������
		String str[] = resMes.split("&");
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		System.out.println(str.length);

		//���׳ɹ�Ӧ��
		if (str.length == 16) {
			int Res_Code = str[0].indexOf("=");
			int Res_merId = str[1].indexOf("=");
			int Res_transDate = str[2].indexOf("=");
			int Res_orderNo = str[3].indexOf("=");
			int Res_transAmt = str[4].indexOf("=");
			int Res_curyId = str[5].indexOf("=");
			int Res_transType = str[6].indexOf("=");
			int Res_priv1 = str[7].indexOf("=");
			int Res_transStat = str[8].indexOf("=");
			int Res_gateId = str[9].indexOf("=");
			int Res_cardType = str[10].indexOf("=");
			int Res_cardNo = str[11].indexOf("=");
			int Res_userName = str[12].indexOf("=");
			int Res_certType = str[13].indexOf("=");
			int Res_certId = str[14].indexOf("=");
			int Res_chkValue = str[15].indexOf("=");

			String responseCode = str[0].substring(Res_Code + 1);
			String MerId = str[1].substring(Res_merId + 1);
			String TransDate = str[2].substring(Res_transDate + 1);
			String OrderNo = str[3].substring(Res_orderNo + 1);
			String TransAmt = str[4].substring(Res_transAmt + 1);
			String CuryId = str[5].substring(Res_curyId + 1);
			String TransType = str[6].substring(Res_transType + 1);
			String Priv1 = str[7].substring(Res_priv1 + 1);
			String TransStat = str[8].substring(Res_transStat + 1);
			//transStat��ʾ����״̬,ֻ��"1001"��ʾ���۳ɹ�������״̬����ʾ����ʧ��
			
			String GateId = str[9].substring(Res_gateId + 1);
			String CardType = str[10].substring(Res_cardType + 1);
			String CardNo = str[11].substring(Res_cardNo + 1);
			String UserName = str[12].substring(Res_userName + 1);
			String CertType = str[13].substring(Res_certType + 1);
			String CertId = str[14].substring(Res_certId + 1);
			String ChkValue = str[15].substring(Res_chkValue + 1);

			System.out.println("responseCode=" + responseCode);
			System.out.println("merId=" + MerId);
			System.out.println("transDate=" + TransDate);
			System.out.println("orderNo=" + OrderNo);
			System.out.println("transAmt=" + TransAmt);
			System.out.println("curyId=" + CuryId);
			System.out.println("transType=" + TransType);
			System.out.println("priv1=" + tozhCN(Priv1));
			System.out.println("transStat=" + TransStat);
			System.out.println("gateId=" + GateId);
			System.out.println("cardType=" + CardType);
			System.out.println("cardNo=" + CardNo);
			System.out.println("userName=" + tozhCN(UserName));
			System.out.println("certId=" + CertId);
			System.out.println("certType=" + CertType);
			System.out.println("chkValue=" + ChkValue);

			String responseData = responseCode + MerId + TransDate + OrderNo
					+ TransAmt + CuryId + TransType + Priv1 + TransStat
					+ GateId + CardType + CardNo + UserName + CertType + CertId;
			System.out.println(responseData);

			String traData = new String(Base64.encode(responseData.getBytes()));
			System.out.println(traData);

			String tiakong = resMes.substring(0, dex + 1);
			String tian2 = new String(Base64.encode(tiakong.getBytes()));

			// ���յ���ChinaPayӦ�𴫻ص���ν�����ǩ
			boolean buildOK = false;
			boolean res = false;
			int KeyUsage = 0;
			PrivateKey key = new PrivateKey();
			try {
				buildOK = key.buildKey("999999999999999", KeyUsage, PubKeyPath);
				System.out.println("��Կ�����ɹ���");
			} catch (Exception e) {
				// e.printStackTrace();
			}
			if (!buildOK) {
				System.out.println("build error!");
				errorList.add("build error!");
			}
			if (!errorList.isEmpty()) {
				request.setAttribute("errors", errorList);
				return;
			}

			SecureLink sl = new SecureLink(key);
			res = sl.verifyAuthToken(tian2, resMes.substring(dex + 1));
			System.out.println(res);

			// �����ݴ�����ʾҳ��
			TransactionBean pay = new TransactionBean();
			pay.setResponseCode(responseCode);
			pay.setMerId(MerId);
			pay.setOrdNo(OrderNo);
			pay.setTransAmt(TransAmt);
			pay.setTransDate(TransDate);
			pay.setTransType(TransType);
			pay.setCuryId(CuryId);
			pay.setGateId(GateId);
			pay.setPriv1(tozhCN(Priv1));
			pay.setUserName(tozhCN(UserName));
			pay.setCertId(CertId);
			pay.setCertType(CertType);
			pay.setCardNo(CardNo);
			pay.setCardType(CardType);
			pay.setTransStatus(TransStat);

			request.setAttribute("payInput", pay);

			if (res) {
				System.out.println("��ǩ������ȷ!");
				//��֤ǩ������ͨ����һ��Ҫ�ж�����״̬�����Ƿ�Ϊ"1001"��ʵ�ִ������̻����б�д
				
				request.getRequestDispatcher("./TransactionReturn.jsp")
						.forward(request, response);

			} else {
				System.out.println("ǩ�����ݲ�ƥ�䣡");
				request.getRequestDispatcher("./VerifyFail.jsp").forward(
						request, response);
			}
			return;
		}

		//����ʧ��Ӧ��
		if (str.length == 4) {
			int Res_Code = str[0].indexOf("=");
			int Res_transStat = str[1].indexOf("=");
			int Res_message = str[2].indexOf("=");
			int Res_chkValue = str[3].indexOf("=");

			String responseCode = str[0].substring(Res_Code + 1);
			String TransStat = str[1].substring(Res_transStat + 1);
			String Message = str[2].substring(Res_message + 1);
			String ChkValue = str[3].substring(Res_chkValue + 1);

			System.out.println(Message);

			System.out.println("responseCode=" + responseCode);
			System.out.println("message=" + tozhCN(Message)); // ��ת��Ϊ�����ַ�
			System.out.println("transStat=" + TransStat);
			System.out.println("chkValue=" + ChkValue);

			String tiakong = resMes.substring(0, dex + 1);
			String tian2 = new String(Base64.encode(tiakong.getBytes()));

			// ���յ���ChinaPayӦ�𴫻ص���ν�����ǩ
			boolean buildOK = false;
			boolean res = false;
			int KeyUsage = 0;
			PrivateKey key = new PrivateKey();
			try {
				buildOK = key.buildKey("999999999999999", KeyUsage, PubKeyPath);
				System.out.println("��Կ�����ɹ���");
			} catch (Exception e) {
				// e.printStackTrace();
			}
			if (!buildOK) {
				System.out.println("build error!");
				errorList.add("build error!");
			}
			if (!errorList.isEmpty()) {
				request.setAttribute("errors", errorList);
				return;
			}

			SecureLink sl = new SecureLink(key);
			res = sl.verifyAuthToken(tian2, resMes.substring(dex + 1));
			System.out.println(res);
			TransactionBean pay = new TransactionBean();
			pay.setResponseCode(responseCode);
			pay.setMessage(tozhCN(Message));
			pay.setTransStatus(TransStat);
			request.setAttribute("payInput", pay);

			if (res) {
				System.out.println("��ǩ������ȷ!");
				request.getRequestDispatcher("./TransactionFail.jsp").forward(
						request, response);

			} else {
				System.out.println("ǩ�����ݲ�ƥ�䣡");
				request.getRequestDispatcher("./VerifyFail.jsp").forward(
						request, response);
			}
		}

	}

	// ��Unicode��ת��Ϊ����
	public static String tozhCN(String unicode) {
		StringBuffer gbk = new StringBuffer();
		String hex[] = unicode.split("\\\\u");
		for (int i = 1; i < hex.length; i++) { // ע��Ҫ�� 1 ��ʼ�������Ǵ�0��ʼ����һ���ǿա�
			int data = Integer.parseInt(hex[i], 16); // ��16������ת��Ϊ 10���Ƶ����ݡ�
			gbk.append((char) data); // ǿ��ת��Ϊchar���;������ǵ������ַ��ˡ�
		}
		System.out.println("���Ǵ� Unicode���� ת��Ϊ �����ַ�: " + gbk.toString());
		return gbk.toString();
	}

	// ���ַ���ת��ΪUnicode��
	public static String toUnicode(String zhStr) {
		StringBuffer unicode = new StringBuffer();
		for (int i = 0; i < zhStr.length(); i++) {
			char c = zhStr.charAt(i);
			unicode.append("\\u" + Integer.toHexString(c));
		}
		System.out.println(unicode.toString());
		System.out.println(zhStr + "ת��Ϊunicode��ɹ���");
		return unicode.toString();
	}

}
