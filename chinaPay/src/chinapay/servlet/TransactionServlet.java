package chinapay.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chinapay.model.bean.TransactionBean;
import chinapay.util.Config;
import chinapay.PrivateKey;
import chinapay.SecureLink;

import chinapay.Base64;

/**
 * @author huang.xuting
 * 
 */

public class TransactionServlet extends HttpServlet {

	private static final long serialVersionUID = -8900442198891786032L;
	private static final String KEY_CHINAPAY_MERID = "chinapay.merid";
	private static final String PayCommit = "/OrderCommit.jsp";
	private static final String Payment = "/TransactionInput.jsp";
	private static final String PaymentUrl = "chinapay.payment.url";
	private static final String KEY_CHINAPAY_MERKEY_FILEPATH = "chinapay.merkey.filepath";

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("GBK");
		List errorList = new ArrayList();
		String MerKeyPath = null;
		String pay_url = null;
		String merId = null;
		try {
			Properties config = Config.getInstance().getProperties();
			MerKeyPath = config.getProperty(KEY_CHINAPAY_MERKEY_FILEPATH); // chinapay.merkey.filepath
			pay_url = config.getProperty(PaymentUrl); // chinapay.payment.url
			merId = config.getProperty(KEY_CHINAPAY_MERID);
		} catch (Exception e) {
			errorList.add("˽Կ��ʼ��ʧ�ܣ�");
		}

		System.out.println(MerKeyPath);

		if (!errorList.isEmpty()) {
			request.setAttribute("errors", errorList);
			request.getRequestDispatcher(Payment).forward(request, response);
			return;
		}

		// String merId = request.getParameter("MerId"); //15
		String curyId = request.getParameter("CuryId");// 3
		String transType = "0003";// 4
		String gateId = request.getParameter("GateId");
		String transAmt = request.getParameter("TransAmt");
		String version = request.getParameter("Version");

		SimpleDateFormat sf = new SimpleDateFormat("yyyyMMddHHmmss");
		SimpleDateFormat sf2 = new SimpleDateFormat("yyyyMMdd");

		Date dt = new Date();
		String orderNo = request.getParameter("OrdNo");
		if (orderNo.isEmpty()) {
			orderNo = "00" + sf.format(dt);
		}
		String transDate = request.getParameter("TransDate");
		if (transDate.isEmpty())
			transDate = sf2.format(dt);

		String openBankId = request.getParameter("OpenBankId");
		String cardType = request.getParameter("CardType");
		String cardNo = request.getParameter("CardNo");
		String certType = request.getParameter("CertType");
		String certId = request.getParameter("CertId");

		System.out.println(request.getParameter("UserName"));
		String usrName = toUnicode(request.getParameter("UserName"));
		String priv1 = toUnicode(request.getParameter("Priv1"));
		String purpose = toUnicode(request.getParameter("Purpose"));
		String termType = request.getParameter("termType");

		String chkValue = null;
		boolean buildOK = false;
		PrivateKey key = new PrivateKey();
		try {
			buildOK = key.buildKey(merId, 0, MerKeyPath);
			System.out.println(merId);
			System.out.println(buildOK);
		} catch (Exception e) {
			System.out.println("˽Կ����ʧ�ܣ�");
		}
		System.out.println("termType = "+ termType);
		String Data = merId + transDate + orderNo + transType + openBankId
				+ cardType + cardNo + usrName + certType + certId + curyId
				+ transAmt + priv1 + version + gateId + termType;
		System.out.println("�ַ�������ƴװ��" + Data);

		String plainData = new String(Base64.encode(Data.getBytes()));
		System.out.println("ת����Base64�����ݣ�" + plainData);

		SecureLink sl = new SecureLink(key);
		chkValue = sl.Sign(plainData);
		System.out.println("ǩ�����ݣ�" + chkValue);
		System.out.println("ǩ���ɹ���");

		TransactionBean pay = new TransactionBean();
		pay.setMerId(merId);
		pay.setOrdNo(orderNo);
		pay.setTransAmt(transAmt);
		pay.setTransDate(transDate);
		pay.setTransType(transType);
		pay.setVersion(version);
		pay.setCuryId(curyId);
		pay.setGateId(gateId);
		pay.setPriv1(priv1);
		pay.setTermType(termType);

		pay.setUserName(usrName);
		pay.setCertId(certId);
		pay.setCertType(certType);
		pay.setOpenBankId(openBankId);
		pay.setPurpose(purpose);
		pay.setCardNo(cardNo);
		pay.setCardType(cardType);
		pay.setChkValue(chkValue);

		System.out.println(pay.toString());

		request.setAttribute("payInput", pay);
		request.setAttribute("pay_url", pay_url);
		request.getRequestDispatcher(PayCommit).forward(request, response);
		return;

	}

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
