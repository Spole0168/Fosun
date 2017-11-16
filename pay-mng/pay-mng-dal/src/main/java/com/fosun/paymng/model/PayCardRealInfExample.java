package com.fosun.paymng.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PayCardRealInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PayCardRealInfExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected PayCardRealInfExample(PayCardRealInfExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
        this.distinct = example.distinct;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<String> criteriaWithoutValue;

        protected List<Map<String, Object>> criteriaWithSingleValue;

        protected List<Map<String, Object>> criteriaWithListValue;

        protected List<Map<String, Object>> criteriaWithBetweenValue;

        protected GeneratedCriteria() {
            super();
            criteriaWithoutValue = new ArrayList<String>();
            criteriaWithSingleValue = new ArrayList<Map<String, Object>>();
            criteriaWithListValue = new ArrayList<Map<String, Object>>();
            criteriaWithBetweenValue = new ArrayList<Map<String, Object>>();
        }

        public boolean isValid() {
            return criteriaWithoutValue.size() > 0
                || criteriaWithSingleValue.size() > 0
                || criteriaWithListValue.size() > 0
                || criteriaWithBetweenValue.size() > 0;
        }

        public List<String> getCriteriaWithoutValue() {
            return criteriaWithoutValue;
        }

        public List<Map<String, Object>> getCriteriaWithSingleValue() {
            return criteriaWithSingleValue;
        }

        public List<Map<String, Object>> getCriteriaWithListValue() {
            return criteriaWithListValue;
        }

        public List<Map<String, Object>> getCriteriaWithBetweenValue() {
            return criteriaWithBetweenValue;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteriaWithoutValue.add(condition);
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("value", value);
            criteriaWithSingleValue.add(map);
        }

        protected void addCriterion(String condition, List<? extends Object> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", values);
            criteriaWithListValue.add(map);
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            List<Object> list = new ArrayList<Object>();
            list.add(value1);
            list.add(value2);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", list);
            criteriaWithBetweenValue.add(map);
        }

        public Criteria andRecSeqIdIsNull() {
            addCriterion("rec_seq_id is null");
            return (Criteria) this;
        }

        public Criteria andRecSeqIdIsNotNull() {
            addCriterion("rec_seq_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecSeqIdEqualTo(String value) {
            addCriterion("rec_seq_id =", value, "recSeqId");
            return (Criteria) this;
        }

        public Criteria andRecSeqIdNotEqualTo(String value) {
            addCriterion("rec_seq_id <>", value, "recSeqId");
            return (Criteria) this;
        }

        public Criteria andRecSeqIdGreaterThan(String value) {
            addCriterion("rec_seq_id >", value, "recSeqId");
            return (Criteria) this;
        }

        public Criteria andRecSeqIdGreaterThanOrEqualTo(String value) {
            addCriterion("rec_seq_id >=", value, "recSeqId");
            return (Criteria) this;
        }

        public Criteria andRecSeqIdLessThan(String value) {
            addCriterion("rec_seq_id <", value, "recSeqId");
            return (Criteria) this;
        }

        public Criteria andRecSeqIdLessThanOrEqualTo(String value) {
            addCriterion("rec_seq_id <=", value, "recSeqId");
            return (Criteria) this;
        }

        public Criteria andRecSeqIdLike(String value) {
            addCriterion("rec_seq_id like", value, "recSeqId");
            return (Criteria) this;
        }

        public Criteria andRecSeqIdNotLike(String value) {
            addCriterion("rec_seq_id not like", value, "recSeqId");
            return (Criteria) this;
        }

        public Criteria andRecSeqIdIn(List<String> values) {
            addCriterion("rec_seq_id in", values, "recSeqId");
            return (Criteria) this;
        }

        public Criteria andRecSeqIdNotIn(List<String> values) {
            addCriterion("rec_seq_id not in", values, "recSeqId");
            return (Criteria) this;
        }

        public Criteria andRecSeqIdBetween(String value1, String value2) {
            addCriterion("rec_seq_id between", value1, value2, "recSeqId");
            return (Criteria) this;
        }

        public Criteria andRecSeqIdNotBetween(String value1, String value2) {
            addCriterion("rec_seq_id not between", value1, value2, "recSeqId");
            return (Criteria) this;
        }

        public Criteria andBankAccTpIsNull() {
            addCriterion("bank_acc_tp is null");
            return (Criteria) this;
        }

        public Criteria andBankAccTpIsNotNull() {
            addCriterion("bank_acc_tp is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccTpEqualTo(String value) {
            addCriterion("bank_acc_tp =", value, "bankAccTp");
            return (Criteria) this;
        }

        public Criteria andBankAccTpNotEqualTo(String value) {
            addCriterion("bank_acc_tp <>", value, "bankAccTp");
            return (Criteria) this;
        }

        public Criteria andBankAccTpGreaterThan(String value) {
            addCriterion("bank_acc_tp >", value, "bankAccTp");
            return (Criteria) this;
        }

        public Criteria andBankAccTpGreaterThanOrEqualTo(String value) {
            addCriterion("bank_acc_tp >=", value, "bankAccTp");
            return (Criteria) this;
        }

        public Criteria andBankAccTpLessThan(String value) {
            addCriterion("bank_acc_tp <", value, "bankAccTp");
            return (Criteria) this;
        }

        public Criteria andBankAccTpLessThanOrEqualTo(String value) {
            addCriterion("bank_acc_tp <=", value, "bankAccTp");
            return (Criteria) this;
        }

        public Criteria andBankAccTpLike(String value) {
            addCriterion("bank_acc_tp like", value, "bankAccTp");
            return (Criteria) this;
        }

        public Criteria andBankAccTpNotLike(String value) {
            addCriterion("bank_acc_tp not like", value, "bankAccTp");
            return (Criteria) this;
        }

        public Criteria andBankAccTpIn(List<String> values) {
            addCriterion("bank_acc_tp in", values, "bankAccTp");
            return (Criteria) this;
        }

        public Criteria andBankAccTpNotIn(List<String> values) {
            addCriterion("bank_acc_tp not in", values, "bankAccTp");
            return (Criteria) this;
        }

        public Criteria andBankAccTpBetween(String value1, String value2) {
            addCriterion("bank_acc_tp between", value1, value2, "bankAccTp");
            return (Criteria) this;
        }

        public Criteria andBankAccTpNotBetween(String value1, String value2) {
            addCriterion("bank_acc_tp not between", value1, value2, "bankAccTp");
            return (Criteria) this;
        }

        public Criteria andBankAcctNoIsNull() {
            addCriterion("bank_acct_no is null");
            return (Criteria) this;
        }

        public Criteria andBankAcctNoIsNotNull() {
            addCriterion("bank_acct_no is not null");
            return (Criteria) this;
        }

        public Criteria andBankAcctNoEqualTo(String value) {
            addCriterion("bank_acct_no =", value, "bankAcctNo");
            return (Criteria) this;
        }

        public Criteria andBankAcctNoNotEqualTo(String value) {
            addCriterion("bank_acct_no <>", value, "bankAcctNo");
            return (Criteria) this;
        }

        public Criteria andBankAcctNoGreaterThan(String value) {
            addCriterion("bank_acct_no >", value, "bankAcctNo");
            return (Criteria) this;
        }

        public Criteria andBankAcctNoGreaterThanOrEqualTo(String value) {
            addCriterion("bank_acct_no >=", value, "bankAcctNo");
            return (Criteria) this;
        }

        public Criteria andBankAcctNoLessThan(String value) {
            addCriterion("bank_acct_no <", value, "bankAcctNo");
            return (Criteria) this;
        }

        public Criteria andBankAcctNoLessThanOrEqualTo(String value) {
            addCriterion("bank_acct_no <=", value, "bankAcctNo");
            return (Criteria) this;
        }

        public Criteria andBankAcctNoLike(String value) {
            addCriterion("bank_acct_no like", value, "bankAcctNo");
            return (Criteria) this;
        }

        public Criteria andBankAcctNoNotLike(String value) {
            addCriterion("bank_acct_no not like", value, "bankAcctNo");
            return (Criteria) this;
        }

        public Criteria andBankAcctNoIn(List<String> values) {
            addCriterion("bank_acct_no in", values, "bankAcctNo");
            return (Criteria) this;
        }

        public Criteria andBankAcctNoNotIn(List<String> values) {
            addCriterion("bank_acct_no not in", values, "bankAcctNo");
            return (Criteria) this;
        }

        public Criteria andBankAcctNoBetween(String value1, String value2) {
            addCriterion("bank_acct_no between", value1, value2, "bankAcctNo");
            return (Criteria) this;
        }

        public Criteria andBankAcctNoNotBetween(String value1, String value2) {
            addCriterion("bank_acct_no not between", value1, value2, "bankAcctNo");
            return (Criteria) this;
        }

        public Criteria andBankAcctNmIsNull() {
            addCriterion("bank_acct_nm is null");
            return (Criteria) this;
        }

        public Criteria andBankAcctNmIsNotNull() {
            addCriterion("bank_acct_nm is not null");
            return (Criteria) this;
        }

        public Criteria andBankAcctNmEqualTo(String value) {
            addCriterion("bank_acct_nm =", value, "bankAcctNm");
            return (Criteria) this;
        }

        public Criteria andBankAcctNmNotEqualTo(String value) {
            addCriterion("bank_acct_nm <>", value, "bankAcctNm");
            return (Criteria) this;
        }

        public Criteria andBankAcctNmGreaterThan(String value) {
            addCriterion("bank_acct_nm >", value, "bankAcctNm");
            return (Criteria) this;
        }

        public Criteria andBankAcctNmGreaterThanOrEqualTo(String value) {
            addCriterion("bank_acct_nm >=", value, "bankAcctNm");
            return (Criteria) this;
        }

        public Criteria andBankAcctNmLessThan(String value) {
            addCriterion("bank_acct_nm <", value, "bankAcctNm");
            return (Criteria) this;
        }

        public Criteria andBankAcctNmLessThanOrEqualTo(String value) {
            addCriterion("bank_acct_nm <=", value, "bankAcctNm");
            return (Criteria) this;
        }

        public Criteria andBankAcctNmLike(String value) {
            addCriterion("bank_acct_nm like", value, "bankAcctNm");
            return (Criteria) this;
        }

        public Criteria andBankAcctNmNotLike(String value) {
            addCriterion("bank_acct_nm not like", value, "bankAcctNm");
            return (Criteria) this;
        }

        public Criteria andBankAcctNmIn(List<String> values) {
            addCriterion("bank_acct_nm in", values, "bankAcctNm");
            return (Criteria) this;
        }

        public Criteria andBankAcctNmNotIn(List<String> values) {
            addCriterion("bank_acct_nm not in", values, "bankAcctNm");
            return (Criteria) this;
        }

        public Criteria andBankAcctNmBetween(String value1, String value2) {
            addCriterion("bank_acct_nm between", value1, value2, "bankAcctNm");
            return (Criteria) this;
        }

        public Criteria andBankAcctNmNotBetween(String value1, String value2) {
            addCriterion("bank_acct_nm not between", value1, value2, "bankAcctNm");
            return (Criteria) this;
        }

        public Criteria andCertTpIsNull() {
            addCriterion("cert_tp is null");
            return (Criteria) this;
        }

        public Criteria andCertTpIsNotNull() {
            addCriterion("cert_tp is not null");
            return (Criteria) this;
        }

        public Criteria andCertTpEqualTo(String value) {
            addCriterion("cert_tp =", value, "certTp");
            return (Criteria) this;
        }

        public Criteria andCertTpNotEqualTo(String value) {
            addCriterion("cert_tp <>", value, "certTp");
            return (Criteria) this;
        }

        public Criteria andCertTpGreaterThan(String value) {
            addCriterion("cert_tp >", value, "certTp");
            return (Criteria) this;
        }

        public Criteria andCertTpGreaterThanOrEqualTo(String value) {
            addCriterion("cert_tp >=", value, "certTp");
            return (Criteria) this;
        }

        public Criteria andCertTpLessThan(String value) {
            addCriterion("cert_tp <", value, "certTp");
            return (Criteria) this;
        }

        public Criteria andCertTpLessThanOrEqualTo(String value) {
            addCriterion("cert_tp <=", value, "certTp");
            return (Criteria) this;
        }

        public Criteria andCertTpLike(String value) {
            addCriterion("cert_tp like", value, "certTp");
            return (Criteria) this;
        }

        public Criteria andCertTpNotLike(String value) {
            addCriterion("cert_tp not like", value, "certTp");
            return (Criteria) this;
        }

        public Criteria andCertTpIn(List<String> values) {
            addCriterion("cert_tp in", values, "certTp");
            return (Criteria) this;
        }

        public Criteria andCertTpNotIn(List<String> values) {
            addCriterion("cert_tp not in", values, "certTp");
            return (Criteria) this;
        }

        public Criteria andCertTpBetween(String value1, String value2) {
            addCriterion("cert_tp between", value1, value2, "certTp");
            return (Criteria) this;
        }

        public Criteria andCertTpNotBetween(String value1, String value2) {
            addCriterion("cert_tp not between", value1, value2, "certTp");
            return (Criteria) this;
        }

        public Criteria andCertNoIsNull() {
            addCriterion("cert_no is null");
            return (Criteria) this;
        }

        public Criteria andCertNoIsNotNull() {
            addCriterion("cert_no is not null");
            return (Criteria) this;
        }

        public Criteria andCertNoEqualTo(String value) {
            addCriterion("cert_no =", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoNotEqualTo(String value) {
            addCriterion("cert_no <>", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoGreaterThan(String value) {
            addCriterion("cert_no >", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoGreaterThanOrEqualTo(String value) {
            addCriterion("cert_no >=", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoLessThan(String value) {
            addCriterion("cert_no <", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoLessThanOrEqualTo(String value) {
            addCriterion("cert_no <=", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoLike(String value) {
            addCriterion("cert_no like", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoNotLike(String value) {
            addCriterion("cert_no not like", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoIn(List<String> values) {
            addCriterion("cert_no in", values, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoNotIn(List<String> values) {
            addCriterion("cert_no not in", values, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoBetween(String value1, String value2) {
            addCriterion("cert_no between", value1, value2, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoNotBetween(String value1, String value2) {
            addCriterion("cert_no not between", value1, value2, "certNo");
            return (Criteria) this;
        }

        public Criteria andCardPhoneIsNull() {
            addCriterion("card_phone is null");
            return (Criteria) this;
        }

        public Criteria andCardPhoneIsNotNull() {
            addCriterion("card_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCardPhoneEqualTo(String value) {
            addCriterion("card_phone =", value, "cardPhone");
            return (Criteria) this;
        }

        public Criteria andCardPhoneNotEqualTo(String value) {
            addCriterion("card_phone <>", value, "cardPhone");
            return (Criteria) this;
        }

        public Criteria andCardPhoneGreaterThan(String value) {
            addCriterion("card_phone >", value, "cardPhone");
            return (Criteria) this;
        }

        public Criteria andCardPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("card_phone >=", value, "cardPhone");
            return (Criteria) this;
        }

        public Criteria andCardPhoneLessThan(String value) {
            addCriterion("card_phone <", value, "cardPhone");
            return (Criteria) this;
        }

        public Criteria andCardPhoneLessThanOrEqualTo(String value) {
            addCriterion("card_phone <=", value, "cardPhone");
            return (Criteria) this;
        }

        public Criteria andCardPhoneLike(String value) {
            addCriterion("card_phone like", value, "cardPhone");
            return (Criteria) this;
        }

        public Criteria andCardPhoneNotLike(String value) {
            addCriterion("card_phone not like", value, "cardPhone");
            return (Criteria) this;
        }

        public Criteria andCardPhoneIn(List<String> values) {
            addCriterion("card_phone in", values, "cardPhone");
            return (Criteria) this;
        }

        public Criteria andCardPhoneNotIn(List<String> values) {
            addCriterion("card_phone not in", values, "cardPhone");
            return (Criteria) this;
        }

        public Criteria andCardPhoneBetween(String value1, String value2) {
            addCriterion("card_phone between", value1, value2, "cardPhone");
            return (Criteria) this;
        }

        public Criteria andCardPhoneNotBetween(String value1, String value2) {
            addCriterion("card_phone not between", value1, value2, "cardPhone");
            return (Criteria) this;
        }

        public Criteria andBankIdIsNull() {
            addCriterion("bank_id is null");
            return (Criteria) this;
        }

        public Criteria andBankIdIsNotNull() {
            addCriterion("bank_id is not null");
            return (Criteria) this;
        }

        public Criteria andBankIdEqualTo(String value) {
            addCriterion("bank_id =", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotEqualTo(String value) {
            addCriterion("bank_id <>", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdGreaterThan(String value) {
            addCriterion("bank_id >", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdGreaterThanOrEqualTo(String value) {
            addCriterion("bank_id >=", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLessThan(String value) {
            addCriterion("bank_id <", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLessThanOrEqualTo(String value) {
            addCriterion("bank_id <=", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLike(String value) {
            addCriterion("bank_id like", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotLike(String value) {
            addCriterion("bank_id not like", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdIn(List<String> values) {
            addCriterion("bank_id in", values, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotIn(List<String> values) {
            addCriterion("bank_id not in", values, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdBetween(String value1, String value2) {
            addCriterion("bank_id between", value1, value2, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotBetween(String value1, String value2) {
            addCriterion("bank_id not between", value1, value2, "bankId");
            return (Criteria) this;
        }

        public Criteria andTransSeqIdIsNull() {
            addCriterion("trans_seq_id is null");
            return (Criteria) this;
        }

        public Criteria andTransSeqIdIsNotNull() {
            addCriterion("trans_seq_id is not null");
            return (Criteria) this;
        }

        public Criteria andTransSeqIdEqualTo(String value) {
            addCriterion("trans_seq_id =", value, "transSeqId");
            return (Criteria) this;
        }

        public Criteria andTransSeqIdNotEqualTo(String value) {
            addCriterion("trans_seq_id <>", value, "transSeqId");
            return (Criteria) this;
        }

        public Criteria andTransSeqIdGreaterThan(String value) {
            addCriterion("trans_seq_id >", value, "transSeqId");
            return (Criteria) this;
        }

        public Criteria andTransSeqIdGreaterThanOrEqualTo(String value) {
            addCriterion("trans_seq_id >=", value, "transSeqId");
            return (Criteria) this;
        }

        public Criteria andTransSeqIdLessThan(String value) {
            addCriterion("trans_seq_id <", value, "transSeqId");
            return (Criteria) this;
        }

        public Criteria andTransSeqIdLessThanOrEqualTo(String value) {
            addCriterion("trans_seq_id <=", value, "transSeqId");
            return (Criteria) this;
        }

        public Criteria andTransSeqIdLike(String value) {
            addCriterion("trans_seq_id like", value, "transSeqId");
            return (Criteria) this;
        }

        public Criteria andTransSeqIdNotLike(String value) {
            addCriterion("trans_seq_id not like", value, "transSeqId");
            return (Criteria) this;
        }

        public Criteria andTransSeqIdIn(List<String> values) {
            addCriterion("trans_seq_id in", values, "transSeqId");
            return (Criteria) this;
        }

        public Criteria andTransSeqIdNotIn(List<String> values) {
            addCriterion("trans_seq_id not in", values, "transSeqId");
            return (Criteria) this;
        }

        public Criteria andTransSeqIdBetween(String value1, String value2) {
            addCriterion("trans_seq_id between", value1, value2, "transSeqId");
            return (Criteria) this;
        }

        public Criteria andTransSeqIdNotBetween(String value1, String value2) {
            addCriterion("trans_seq_id not between", value1, value2, "transSeqId");
            return (Criteria) this;
        }

        public Criteria andRecCrtTsIsNull() {
            addCriterion("rec_crt_ts is null");
            return (Criteria) this;
        }

        public Criteria andRecCrtTsIsNotNull() {
            addCriterion("rec_crt_ts is not null");
            return (Criteria) this;
        }

        public Criteria andRecCrtTsEqualTo(Date value) {
            addCriterion("rec_crt_ts =", value, "recCrtTs");
            return (Criteria) this;
        }

        public Criteria andRecCrtTsNotEqualTo(Date value) {
            addCriterion("rec_crt_ts <>", value, "recCrtTs");
            return (Criteria) this;
        }

        public Criteria andRecCrtTsGreaterThan(Date value) {
            addCriterion("rec_crt_ts >", value, "recCrtTs");
            return (Criteria) this;
        }

        public Criteria andRecCrtTsGreaterThanOrEqualTo(Date value) {
            addCriterion("rec_crt_ts >=", value, "recCrtTs");
            return (Criteria) this;
        }

        public Criteria andRecCrtTsLessThan(Date value) {
            addCriterion("rec_crt_ts <", value, "recCrtTs");
            return (Criteria) this;
        }

        public Criteria andRecCrtTsLessThanOrEqualTo(Date value) {
            addCriterion("rec_crt_ts <=", value, "recCrtTs");
            return (Criteria) this;
        }

        public Criteria andRecCrtTsIn(List<Date> values) {
            addCriterion("rec_crt_ts in", values, "recCrtTs");
            return (Criteria) this;
        }

        public Criteria andRecCrtTsNotIn(List<Date> values) {
            addCriterion("rec_crt_ts not in", values, "recCrtTs");
            return (Criteria) this;
        }

        public Criteria andRecCrtTsBetween(Date value1, Date value2) {
            addCriterion("rec_crt_ts between", value1, value2, "recCrtTs");
            return (Criteria) this;
        }

        public Criteria andRecCrtTsNotBetween(Date value1, Date value2) {
            addCriterion("rec_crt_ts not between", value1, value2, "recCrtTs");
            return (Criteria) this;
        }

        public Criteria andRecCrtOprIdIsNull() {
            addCriterion("rec_crt_opr_id is null");
            return (Criteria) this;
        }

        public Criteria andRecCrtOprIdIsNotNull() {
            addCriterion("rec_crt_opr_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecCrtOprIdEqualTo(String value) {
            addCriterion("rec_crt_opr_id =", value, "recCrtOprId");
            return (Criteria) this;
        }

        public Criteria andRecCrtOprIdNotEqualTo(String value) {
            addCriterion("rec_crt_opr_id <>", value, "recCrtOprId");
            return (Criteria) this;
        }

        public Criteria andRecCrtOprIdGreaterThan(String value) {
            addCriterion("rec_crt_opr_id >", value, "recCrtOprId");
            return (Criteria) this;
        }

        public Criteria andRecCrtOprIdGreaterThanOrEqualTo(String value) {
            addCriterion("rec_crt_opr_id >=", value, "recCrtOprId");
            return (Criteria) this;
        }

        public Criteria andRecCrtOprIdLessThan(String value) {
            addCriterion("rec_crt_opr_id <", value, "recCrtOprId");
            return (Criteria) this;
        }

        public Criteria andRecCrtOprIdLessThanOrEqualTo(String value) {
            addCriterion("rec_crt_opr_id <=", value, "recCrtOprId");
            return (Criteria) this;
        }

        public Criteria andRecCrtOprIdLike(String value) {
            addCriterion("rec_crt_opr_id like", value, "recCrtOprId");
            return (Criteria) this;
        }

        public Criteria andRecCrtOprIdNotLike(String value) {
            addCriterion("rec_crt_opr_id not like", value, "recCrtOprId");
            return (Criteria) this;
        }

        public Criteria andRecCrtOprIdIn(List<String> values) {
            addCriterion("rec_crt_opr_id in", values, "recCrtOprId");
            return (Criteria) this;
        }

        public Criteria andRecCrtOprIdNotIn(List<String> values) {
            addCriterion("rec_crt_opr_id not in", values, "recCrtOprId");
            return (Criteria) this;
        }

        public Criteria andRecCrtOprIdBetween(String value1, String value2) {
            addCriterion("rec_crt_opr_id between", value1, value2, "recCrtOprId");
            return (Criteria) this;
        }

        public Criteria andRecCrtOprIdNotBetween(String value1, String value2) {
            addCriterion("rec_crt_opr_id not between", value1, value2, "recCrtOprId");
            return (Criteria) this;
        }

        public Criteria andRecUpdTsIsNull() {
            addCriterion("rec_upd_ts is null");
            return (Criteria) this;
        }

        public Criteria andRecUpdTsIsNotNull() {
            addCriterion("rec_upd_ts is not null");
            return (Criteria) this;
        }

        public Criteria andRecUpdTsEqualTo(Date value) {
            addCriterion("rec_upd_ts =", value, "recUpdTs");
            return (Criteria) this;
        }

        public Criteria andRecUpdTsNotEqualTo(Date value) {
            addCriterion("rec_upd_ts <>", value, "recUpdTs");
            return (Criteria) this;
        }

        public Criteria andRecUpdTsGreaterThan(Date value) {
            addCriterion("rec_upd_ts >", value, "recUpdTs");
            return (Criteria) this;
        }

        public Criteria andRecUpdTsGreaterThanOrEqualTo(Date value) {
            addCriterion("rec_upd_ts >=", value, "recUpdTs");
            return (Criteria) this;
        }

        public Criteria andRecUpdTsLessThan(Date value) {
            addCriterion("rec_upd_ts <", value, "recUpdTs");
            return (Criteria) this;
        }

        public Criteria andRecUpdTsLessThanOrEqualTo(Date value) {
            addCriterion("rec_upd_ts <=", value, "recUpdTs");
            return (Criteria) this;
        }

        public Criteria andRecUpdTsIn(List<Date> values) {
            addCriterion("rec_upd_ts in", values, "recUpdTs");
            return (Criteria) this;
        }

        public Criteria andRecUpdTsNotIn(List<Date> values) {
            addCriterion("rec_upd_ts not in", values, "recUpdTs");
            return (Criteria) this;
        }

        public Criteria andRecUpdTsBetween(Date value1, Date value2) {
            addCriterion("rec_upd_ts between", value1, value2, "recUpdTs");
            return (Criteria) this;
        }

        public Criteria andRecUpdTsNotBetween(Date value1, Date value2) {
            addCriterion("rec_upd_ts not between", value1, value2, "recUpdTs");
            return (Criteria) this;
        }

        public Criteria andRecUpdOprIdIsNull() {
            addCriterion("rec_upd_opr_id is null");
            return (Criteria) this;
        }

        public Criteria andRecUpdOprIdIsNotNull() {
            addCriterion("rec_upd_opr_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecUpdOprIdEqualTo(String value) {
            addCriterion("rec_upd_opr_id =", value, "recUpdOprId");
            return (Criteria) this;
        }

        public Criteria andRecUpdOprIdNotEqualTo(String value) {
            addCriterion("rec_upd_opr_id <>", value, "recUpdOprId");
            return (Criteria) this;
        }

        public Criteria andRecUpdOprIdGreaterThan(String value) {
            addCriterion("rec_upd_opr_id >", value, "recUpdOprId");
            return (Criteria) this;
        }

        public Criteria andRecUpdOprIdGreaterThanOrEqualTo(String value) {
            addCriterion("rec_upd_opr_id >=", value, "recUpdOprId");
            return (Criteria) this;
        }

        public Criteria andRecUpdOprIdLessThan(String value) {
            addCriterion("rec_upd_opr_id <", value, "recUpdOprId");
            return (Criteria) this;
        }

        public Criteria andRecUpdOprIdLessThanOrEqualTo(String value) {
            addCriterion("rec_upd_opr_id <=", value, "recUpdOprId");
            return (Criteria) this;
        }

        public Criteria andRecUpdOprIdLike(String value) {
            addCriterion("rec_upd_opr_id like", value, "recUpdOprId");
            return (Criteria) this;
        }

        public Criteria andRecUpdOprIdNotLike(String value) {
            addCriterion("rec_upd_opr_id not like", value, "recUpdOprId");
            return (Criteria) this;
        }

        public Criteria andRecUpdOprIdIn(List<String> values) {
            addCriterion("rec_upd_opr_id in", values, "recUpdOprId");
            return (Criteria) this;
        }

        public Criteria andRecUpdOprIdNotIn(List<String> values) {
            addCriterion("rec_upd_opr_id not in", values, "recUpdOprId");
            return (Criteria) this;
        }

        public Criteria andRecUpdOprIdBetween(String value1, String value2) {
            addCriterion("rec_upd_opr_id between", value1, value2, "recUpdOprId");
            return (Criteria) this;
        }

        public Criteria andRecUpdOprIdNotBetween(String value1, String value2) {
            addCriterion("rec_upd_opr_id not between", value1, value2, "recUpdOprId");
            return (Criteria) this;
        }

        public Criteria andRecUpdTransIdIsNull() {
            addCriterion("rec_upd_trans_id is null");
            return (Criteria) this;
        }

        public Criteria andRecUpdTransIdIsNotNull() {
            addCriterion("rec_upd_trans_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecUpdTransIdEqualTo(String value) {
            addCriterion("rec_upd_trans_id =", value, "recUpdTransId");
            return (Criteria) this;
        }

        public Criteria andRecUpdTransIdNotEqualTo(String value) {
            addCriterion("rec_upd_trans_id <>", value, "recUpdTransId");
            return (Criteria) this;
        }

        public Criteria andRecUpdTransIdGreaterThan(String value) {
            addCriterion("rec_upd_trans_id >", value, "recUpdTransId");
            return (Criteria) this;
        }

        public Criteria andRecUpdTransIdGreaterThanOrEqualTo(String value) {
            addCriterion("rec_upd_trans_id >=", value, "recUpdTransId");
            return (Criteria) this;
        }

        public Criteria andRecUpdTransIdLessThan(String value) {
            addCriterion("rec_upd_trans_id <", value, "recUpdTransId");
            return (Criteria) this;
        }

        public Criteria andRecUpdTransIdLessThanOrEqualTo(String value) {
            addCriterion("rec_upd_trans_id <=", value, "recUpdTransId");
            return (Criteria) this;
        }

        public Criteria andRecUpdTransIdLike(String value) {
            addCriterion("rec_upd_trans_id like", value, "recUpdTransId");
            return (Criteria) this;
        }

        public Criteria andRecUpdTransIdNotLike(String value) {
            addCriterion("rec_upd_trans_id not like", value, "recUpdTransId");
            return (Criteria) this;
        }

        public Criteria andRecUpdTransIdIn(List<String> values) {
            addCriterion("rec_upd_trans_id in", values, "recUpdTransId");
            return (Criteria) this;
        }

        public Criteria andRecUpdTransIdNotIn(List<String> values) {
            addCriterion("rec_upd_trans_id not in", values, "recUpdTransId");
            return (Criteria) this;
        }

        public Criteria andRecUpdTransIdBetween(String value1, String value2) {
            addCriterion("rec_upd_trans_id between", value1, value2, "recUpdTransId");
            return (Criteria) this;
        }

        public Criteria andRecUpdTransIdNotBetween(String value1, String value2) {
            addCriterion("rec_upd_trans_id not between", value1, value2, "recUpdTransId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}