package chinapay.model.bean;

/**
 * @author huang.xuting
 * 
 */

public class TransactionBean { 
	private String MerId; // �̻��ţ�15λ
	private String OrdNo; // �����ţ�16λ
	private String TransAmt; // ��������λ�֣���12λ
	private String CuryId; // ���֣�3λ
	private String TransDate; // ��������yyyyMMdd,8λ
	private String TransType; // �������ͣ�4λ
	private String Version; // �汾�ţ�8λ
	private String GateId; // ���ر�ţ�4λ
	private String Priv1; // ˽���򣬲�����60�ֽ�
	private String ChkValue; // ��������ǩ����256�ֽ�
	private String TransStatus; // ����״̬��4λ
	private String OpenBankId; // �����кţ�4λ
	private String CardType; // ���۱�־��1λ
	private String CardNo; // ����/�ۺţ�25λ
	private String UserName; // �ֿ���������20λ
	private String CertType; // ֤�����ͣ�2λ
	private String CertId; // ֤���ţ�25λ
	private String purpose; // ��;��20λ
	private String ResponseCode; // ����Ӧ���룬2λ
	private String Message; // ������Ϣ��unicode��
	private String TermType;//��������

	// �����������ֶ�
	private String Mobile; // �ֻ����룬�䳤40λ
	private String Address; // סַ���䳤512λ
	private String Email; // ���䣬�䳤40λ

	public String toString() {
		return new StringBuffer("{merId=").append(MerId).append(", transType=")
				.append(TransType).append(", orderNo=").append(OrdNo).append(
						", transDate=").append(TransDate).append(", version=")
				.append(Version).append(", priv1=").append(Priv1).append(
						", chkValue=").append(ChkValue).append(", TermType=")
						.append(TermType).append("}").toString();
	}

	public String getOrdNo() {
		return OrdNo;
	}

	public void setOrdNo(String ordNo) {
		OrdNo = ordNo;
	}

	public String getChkValue() {
		return ChkValue;
	}

	public void setChkValue(String chkValue) {
		ChkValue = chkValue;
	}

	public String getTransStatus() {
		return TransStatus;
	}

	public void setTransStatus(String transStatus) {
		TransStatus = transStatus;
	}

	public String getOpenBankId() {
		return OpenBankId;
	}

	public void setOpenBankId(String openBankId) {
		OpenBankId = openBankId;
	}

	public String getCardType() {
		return CardType;
	}

	public void setCardType(String cardType) {
		CardType = cardType;
	}

	public String getCardNo() {
		return CardNo;
	}

	public void setCardNo(String cardNo) {
		CardNo = cardNo;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getCertType() {
		return CertType;
	}

	public void setCertType(String certType) {
		CertType = certType;
	}

	public String getCertId() {
		return CertId;
	}

	public void setCertId(String certId) {
		CertId = certId;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public void setMerId(String merId) {
		MerId = merId;
	}

	public String getMerId() {
		return MerId;
	}

	public void setTransAmt(String transAmt) {
		TransAmt = transAmt;
	}

	public String getTransAmt() {
		return TransAmt;
	}

	public void setCuryId(String curyId) {
		CuryId = curyId;
	}

	public String getCuryId() {
		return CuryId;
	}

	public void setTransDate(String transDate) {
		TransDate = transDate;
	}

	public String getTransDate() {
		return TransDate;
	}

	public void setTransType(String transType) {
		TransType = transType;
	}

	public String getTransType() {
		return TransType;
	}

	public void setVersion(String version) {
		Version = version;
	}

	public String getVersion() {
		return Version;
	}

	public void setGateId(String gateId) {
		GateId = gateId;
	}

	public String getGateId() {
		return GateId;
	}

	public void setPriv1(String priv1) {
		Priv1 = priv1;
	}

	public String getPriv1() {
		return Priv1;
	}

	public void setResponseCode(String responseCode) {
		ResponseCode = responseCode;
	}

	public String getResponseCode() {
		return ResponseCode;
	}

	public void setMessage(String message) {
		Message = message;
	}

	public String getMessage() {
		return Message;
	}

	public String getMobile() {
		return Mobile;
	}

	public void setMobile(String mobile) {
		Mobile = mobile;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getTermType() {
		System.out.println("CALL getTermType and the value is ---- "+ TermType);
		return TermType;
	}

	public void setTermType(String termType) {
		System.out.println("CALL TermType and the value is ---- "+ TermType);
		TermType = termType;
	}

	
}
