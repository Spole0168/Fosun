package com.fosun.paymng.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PayMchntTransLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PayMchntTransLogExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected PayMchntTransLogExample(PayMchntTransLogExample example) {
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

        public Criteria andTransCdIsNull() {
            addCriterion("trans_cd is null");
            return (Criteria) this;
        }

        public Criteria andTransCdIsNotNull() {
            addCriterion("trans_cd is not null");
            return (Criteria) this;
        }

        public Criteria andTransCdEqualTo(String value) {
            addCriterion("trans_cd =", value, "transCd");
            return (Criteria) this;
        }

        public Criteria andTransCdNotEqualTo(String value) {
            addCriterion("trans_cd <>", value, "transCd");
            return (Criteria) this;
        }

        public Criteria andTransCdGreaterThan(String value) {
            addCriterion("trans_cd >", value, "transCd");
            return (Criteria) this;
        }

        public Criteria andTransCdGreaterThanOrEqualTo(String value) {
            addCriterion("trans_cd >=", value, "transCd");
            return (Criteria) this;
        }

        public Criteria andTransCdLessThan(String value) {
            addCriterion("trans_cd <", value, "transCd");
            return (Criteria) this;
        }

        public Criteria andTransCdLessThanOrEqualTo(String value) {
            addCriterion("trans_cd <=", value, "transCd");
            return (Criteria) this;
        }

        public Criteria andTransCdLike(String value) {
            addCriterion("trans_cd like", value, "transCd");
            return (Criteria) this;
        }

        public Criteria andTransCdNotLike(String value) {
            addCriterion("trans_cd not like", value, "transCd");
            return (Criteria) this;
        }

        public Criteria andTransCdIn(List<String> values) {
            addCriterion("trans_cd in", values, "transCd");
            return (Criteria) this;
        }

        public Criteria andTransCdNotIn(List<String> values) {
            addCriterion("trans_cd not in", values, "transCd");
            return (Criteria) this;
        }

        public Criteria andTransCdBetween(String value1, String value2) {
            addCriterion("trans_cd between", value1, value2, "transCd");
            return (Criteria) this;
        }

        public Criteria andTransCdNotBetween(String value1, String value2) {
            addCriterion("trans_cd not between", value1, value2, "transCd");
            return (Criteria) this;
        }

        public Criteria andTransVersionIsNull() {
            addCriterion("trans_version is null");
            return (Criteria) this;
        }

        public Criteria andTransVersionIsNotNull() {
            addCriterion("trans_version is not null");
            return (Criteria) this;
        }

        public Criteria andTransVersionEqualTo(String value) {
            addCriterion("trans_version =", value, "transVersion");
            return (Criteria) this;
        }

        public Criteria andTransVersionNotEqualTo(String value) {
            addCriterion("trans_version <>", value, "transVersion");
            return (Criteria) this;
        }

        public Criteria andTransVersionGreaterThan(String value) {
            addCriterion("trans_version >", value, "transVersion");
            return (Criteria) this;
        }

        public Criteria andTransVersionGreaterThanOrEqualTo(String value) {
            addCriterion("trans_version >=", value, "transVersion");
            return (Criteria) this;
        }

        public Criteria andTransVersionLessThan(String value) {
            addCriterion("trans_version <", value, "transVersion");
            return (Criteria) this;
        }

        public Criteria andTransVersionLessThanOrEqualTo(String value) {
            addCriterion("trans_version <=", value, "transVersion");
            return (Criteria) this;
        }

        public Criteria andTransVersionLike(String value) {
            addCriterion("trans_version like", value, "transVersion");
            return (Criteria) this;
        }

        public Criteria andTransVersionNotLike(String value) {
            addCriterion("trans_version not like", value, "transVersion");
            return (Criteria) this;
        }

        public Criteria andTransVersionIn(List<String> values) {
            addCriterion("trans_version in", values, "transVersion");
            return (Criteria) this;
        }

        public Criteria andTransVersionNotIn(List<String> values) {
            addCriterion("trans_version not in", values, "transVersion");
            return (Criteria) this;
        }

        public Criteria andTransVersionBetween(String value1, String value2) {
            addCriterion("trans_version between", value1, value2, "transVersion");
            return (Criteria) this;
        }

        public Criteria andTransVersionNotBetween(String value1, String value2) {
            addCriterion("trans_version not between", value1, value2, "transVersion");
            return (Criteria) this;
        }

        public Criteria andMchntIdIsNull() {
            addCriterion("mchnt_id is null");
            return (Criteria) this;
        }

        public Criteria andMchntIdIsNotNull() {
            addCriterion("mchnt_id is not null");
            return (Criteria) this;
        }

        public Criteria andMchntIdEqualTo(String value) {
            addCriterion("mchnt_id =", value, "mchntId");
            return (Criteria) this;
        }

        public Criteria andMchntIdNotEqualTo(String value) {
            addCriterion("mchnt_id <>", value, "mchntId");
            return (Criteria) this;
        }

        public Criteria andMchntIdGreaterThan(String value) {
            addCriterion("mchnt_id >", value, "mchntId");
            return (Criteria) this;
        }

        public Criteria andMchntIdGreaterThanOrEqualTo(String value) {
            addCriterion("mchnt_id >=", value, "mchntId");
            return (Criteria) this;
        }

        public Criteria andMchntIdLessThan(String value) {
            addCriterion("mchnt_id <", value, "mchntId");
            return (Criteria) this;
        }

        public Criteria andMchntIdLessThanOrEqualTo(String value) {
            addCriterion("mchnt_id <=", value, "mchntId");
            return (Criteria) this;
        }

        public Criteria andMchntIdLike(String value) {
            addCriterion("mchnt_id like", value, "mchntId");
            return (Criteria) this;
        }

        public Criteria andMchntIdNotLike(String value) {
            addCriterion("mchnt_id not like", value, "mchntId");
            return (Criteria) this;
        }

        public Criteria andMchntIdIn(List<String> values) {
            addCriterion("mchnt_id in", values, "mchntId");
            return (Criteria) this;
        }

        public Criteria andMchntIdNotIn(List<String> values) {
            addCriterion("mchnt_id not in", values, "mchntId");
            return (Criteria) this;
        }

        public Criteria andMchntIdBetween(String value1, String value2) {
            addCriterion("mchnt_id between", value1, value2, "mchntId");
            return (Criteria) this;
        }

        public Criteria andMchntIdNotBetween(String value1, String value2) {
            addCriterion("mchnt_id not between", value1, value2, "mchntId");
            return (Criteria) this;
        }

        public Criteria andMchntTransDtIsNull() {
            addCriterion("mchnt_trans_dt is null");
            return (Criteria) this;
        }

        public Criteria andMchntTransDtIsNotNull() {
            addCriterion("mchnt_trans_dt is not null");
            return (Criteria) this;
        }

        public Criteria andMchntTransDtEqualTo(String value) {
            addCriterion("mchnt_trans_dt =", value, "mchntTransDt");
            return (Criteria) this;
        }

        public Criteria andMchntTransDtNotEqualTo(String value) {
            addCriterion("mchnt_trans_dt <>", value, "mchntTransDt");
            return (Criteria) this;
        }

        public Criteria andMchntTransDtGreaterThan(String value) {
            addCriterion("mchnt_trans_dt >", value, "mchntTransDt");
            return (Criteria) this;
        }

        public Criteria andMchntTransDtGreaterThanOrEqualTo(String value) {
            addCriterion("mchnt_trans_dt >=", value, "mchntTransDt");
            return (Criteria) this;
        }

        public Criteria andMchntTransDtLessThan(String value) {
            addCriterion("mchnt_trans_dt <", value, "mchntTransDt");
            return (Criteria) this;
        }

        public Criteria andMchntTransDtLessThanOrEqualTo(String value) {
            addCriterion("mchnt_trans_dt <=", value, "mchntTransDt");
            return (Criteria) this;
        }

        public Criteria andMchntTransDtLike(String value) {
            addCriterion("mchnt_trans_dt like", value, "mchntTransDt");
            return (Criteria) this;
        }

        public Criteria andMchntTransDtNotLike(String value) {
            addCriterion("mchnt_trans_dt not like", value, "mchntTransDt");
            return (Criteria) this;
        }

        public Criteria andMchntTransDtIn(List<String> values) {
            addCriterion("mchnt_trans_dt in", values, "mchntTransDt");
            return (Criteria) this;
        }

        public Criteria andMchntTransDtNotIn(List<String> values) {
            addCriterion("mchnt_trans_dt not in", values, "mchntTransDt");
            return (Criteria) this;
        }

        public Criteria andMchntTransDtBetween(String value1, String value2) {
            addCriterion("mchnt_trans_dt between", value1, value2, "mchntTransDt");
            return (Criteria) this;
        }

        public Criteria andMchntTransDtNotBetween(String value1, String value2) {
            addCriterion("mchnt_trans_dt not between", value1, value2, "mchntTransDt");
            return (Criteria) this;
        }

        public Criteria andMchntTransTmsIsNull() {
            addCriterion("mchnt_trans_tms is null");
            return (Criteria) this;
        }

        public Criteria andMchntTransTmsIsNotNull() {
            addCriterion("mchnt_trans_tms is not null");
            return (Criteria) this;
        }

        public Criteria andMchntTransTmsEqualTo(String value) {
            addCriterion("mchnt_trans_tms =", value, "mchntTransTms");
            return (Criteria) this;
        }

        public Criteria andMchntTransTmsNotEqualTo(String value) {
            addCriterion("mchnt_trans_tms <>", value, "mchntTransTms");
            return (Criteria) this;
        }

        public Criteria andMchntTransTmsGreaterThan(String value) {
            addCriterion("mchnt_trans_tms >", value, "mchntTransTms");
            return (Criteria) this;
        }

        public Criteria andMchntTransTmsGreaterThanOrEqualTo(String value) {
            addCriterion("mchnt_trans_tms >=", value, "mchntTransTms");
            return (Criteria) this;
        }

        public Criteria andMchntTransTmsLessThan(String value) {
            addCriterion("mchnt_trans_tms <", value, "mchntTransTms");
            return (Criteria) this;
        }

        public Criteria andMchntTransTmsLessThanOrEqualTo(String value) {
            addCriterion("mchnt_trans_tms <=", value, "mchntTransTms");
            return (Criteria) this;
        }

        public Criteria andMchntTransTmsLike(String value) {
            addCriterion("mchnt_trans_tms like", value, "mchntTransTms");
            return (Criteria) this;
        }

        public Criteria andMchntTransTmsNotLike(String value) {
            addCriterion("mchnt_trans_tms not like", value, "mchntTransTms");
            return (Criteria) this;
        }

        public Criteria andMchntTransTmsIn(List<String> values) {
            addCriterion("mchnt_trans_tms in", values, "mchntTransTms");
            return (Criteria) this;
        }

        public Criteria andMchntTransTmsNotIn(List<String> values) {
            addCriterion("mchnt_trans_tms not in", values, "mchntTransTms");
            return (Criteria) this;
        }

        public Criteria andMchntTransTmsBetween(String value1, String value2) {
            addCriterion("mchnt_trans_tms between", value1, value2, "mchntTransTms");
            return (Criteria) this;
        }

        public Criteria andMchntTransTmsNotBetween(String value1, String value2) {
            addCriterion("mchnt_trans_tms not between", value1, value2, "mchntTransTms");
            return (Criteria) this;
        }

        public Criteria andMchntTransIdIsNull() {
            addCriterion("mchnt_trans_id is null");
            return (Criteria) this;
        }

        public Criteria andMchntTransIdIsNotNull() {
            addCriterion("mchnt_trans_id is not null");
            return (Criteria) this;
        }

        public Criteria andMchntTransIdEqualTo(String value) {
            addCriterion("mchnt_trans_id =", value, "mchntTransId");
            return (Criteria) this;
        }

        public Criteria andMchntTransIdNotEqualTo(String value) {
            addCriterion("mchnt_trans_id <>", value, "mchntTransId");
            return (Criteria) this;
        }

        public Criteria andMchntTransIdGreaterThan(String value) {
            addCriterion("mchnt_trans_id >", value, "mchntTransId");
            return (Criteria) this;
        }

        public Criteria andMchntTransIdGreaterThanOrEqualTo(String value) {
            addCriterion("mchnt_trans_id >=", value, "mchntTransId");
            return (Criteria) this;
        }

        public Criteria andMchntTransIdLessThan(String value) {
            addCriterion("mchnt_trans_id <", value, "mchntTransId");
            return (Criteria) this;
        }

        public Criteria andMchntTransIdLessThanOrEqualTo(String value) {
            addCriterion("mchnt_trans_id <=", value, "mchntTransId");
            return (Criteria) this;
        }

        public Criteria andMchntTransIdLike(String value) {
            addCriterion("mchnt_trans_id like", value, "mchntTransId");
            return (Criteria) this;
        }

        public Criteria andMchntTransIdNotLike(String value) {
            addCriterion("mchnt_trans_id not like", value, "mchntTransId");
            return (Criteria) this;
        }

        public Criteria andMchntTransIdIn(List<String> values) {
            addCriterion("mchnt_trans_id in", values, "mchntTransId");
            return (Criteria) this;
        }

        public Criteria andMchntTransIdNotIn(List<String> values) {
            addCriterion("mchnt_trans_id not in", values, "mchntTransId");
            return (Criteria) this;
        }

        public Criteria andMchntTransIdBetween(String value1, String value2) {
            addCriterion("mchnt_trans_id between", value1, value2, "mchntTransId");
            return (Criteria) this;
        }

        public Criteria andMchntTransIdNotBetween(String value1, String value2) {
            addCriterion("mchnt_trans_id not between", value1, value2, "mchntTransId");
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

        public Criteria andCorpAccBankNmIsNull() {
            addCriterion("corp_acc_bank_nm is null");
            return (Criteria) this;
        }

        public Criteria andCorpAccBankNmIsNotNull() {
            addCriterion("corp_acc_bank_nm is not null");
            return (Criteria) this;
        }

        public Criteria andCorpAccBankNmEqualTo(String value) {
            addCriterion("corp_acc_bank_nm =", value, "corpAccBankNm");
            return (Criteria) this;
        }

        public Criteria andCorpAccBankNmNotEqualTo(String value) {
            addCriterion("corp_acc_bank_nm <>", value, "corpAccBankNm");
            return (Criteria) this;
        }

        public Criteria andCorpAccBankNmGreaterThan(String value) {
            addCriterion("corp_acc_bank_nm >", value, "corpAccBankNm");
            return (Criteria) this;
        }

        public Criteria andCorpAccBankNmGreaterThanOrEqualTo(String value) {
            addCriterion("corp_acc_bank_nm >=", value, "corpAccBankNm");
            return (Criteria) this;
        }

        public Criteria andCorpAccBankNmLessThan(String value) {
            addCriterion("corp_acc_bank_nm <", value, "corpAccBankNm");
            return (Criteria) this;
        }

        public Criteria andCorpAccBankNmLessThanOrEqualTo(String value) {
            addCriterion("corp_acc_bank_nm <=", value, "corpAccBankNm");
            return (Criteria) this;
        }

        public Criteria andCorpAccBankNmLike(String value) {
            addCriterion("corp_acc_bank_nm like", value, "corpAccBankNm");
            return (Criteria) this;
        }

        public Criteria andCorpAccBankNmNotLike(String value) {
            addCriterion("corp_acc_bank_nm not like", value, "corpAccBankNm");
            return (Criteria) this;
        }

        public Criteria andCorpAccBankNmIn(List<String> values) {
            addCriterion("corp_acc_bank_nm in", values, "corpAccBankNm");
            return (Criteria) this;
        }

        public Criteria andCorpAccBankNmNotIn(List<String> values) {
            addCriterion("corp_acc_bank_nm not in", values, "corpAccBankNm");
            return (Criteria) this;
        }

        public Criteria andCorpAccBankNmBetween(String value1, String value2) {
            addCriterion("corp_acc_bank_nm between", value1, value2, "corpAccBankNm");
            return (Criteria) this;
        }

        public Criteria andCorpAccBankNmNotBetween(String value1, String value2) {
            addCriterion("corp_acc_bank_nm not between", value1, value2, "corpAccBankNm");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNull() {
            addCriterion("cust_id is null");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNotNull() {
            addCriterion("cust_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustIdEqualTo(String value) {
            addCriterion("cust_id =", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotEqualTo(String value) {
            addCriterion("cust_id <>", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThan(String value) {
            addCriterion("cust_id >", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThanOrEqualTo(String value) {
            addCriterion("cust_id >=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThan(String value) {
            addCriterion("cust_id <", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThanOrEqualTo(String value) {
            addCriterion("cust_id <=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLike(String value) {
            addCriterion("cust_id like", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotLike(String value) {
            addCriterion("cust_id not like", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdIn(List<String> values) {
            addCriterion("cust_id in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotIn(List<String> values) {
            addCriterion("cust_id not in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdBetween(String value1, String value2) {
            addCriterion("cust_id between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotBetween(String value1, String value2) {
            addCriterion("cust_id not between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andContractNoIsNull() {
            addCriterion("contract_no is null");
            return (Criteria) this;
        }

        public Criteria andContractNoIsNotNull() {
            addCriterion("contract_no is not null");
            return (Criteria) this;
        }

        public Criteria andContractNoEqualTo(String value) {
            addCriterion("contract_no =", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotEqualTo(String value) {
            addCriterion("contract_no <>", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoGreaterThan(String value) {
            addCriterion("contract_no >", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoGreaterThanOrEqualTo(String value) {
            addCriterion("contract_no >=", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoLessThan(String value) {
            addCriterion("contract_no <", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoLessThanOrEqualTo(String value) {
            addCriterion("contract_no <=", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoLike(String value) {
            addCriterion("contract_no like", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotLike(String value) {
            addCriterion("contract_no not like", value, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoIn(List<String> values) {
            addCriterion("contract_no in", values, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotIn(List<String> values) {
            addCriterion("contract_no not in", values, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoBetween(String value1, String value2) {
            addCriterion("contract_no between", value1, value2, "contractNo");
            return (Criteria) this;
        }

        public Criteria andContractNoNotBetween(String value1, String value2) {
            addCriterion("contract_no not between", value1, value2, "contractNo");
            return (Criteria) this;
        }

        public Criteria andTransAmtIsNull() {
            addCriterion("trans_amt is null");
            return (Criteria) this;
        }

        public Criteria andTransAmtIsNotNull() {
            addCriterion("trans_amt is not null");
            return (Criteria) this;
        }

        public Criteria andTransAmtEqualTo(Long value) {
            addCriterion("trans_amt =", value, "transAmt");
            return (Criteria) this;
        }

        public Criteria andTransAmtNotEqualTo(Long value) {
            addCriterion("trans_amt <>", value, "transAmt");
            return (Criteria) this;
        }

        public Criteria andTransAmtGreaterThan(Long value) {
            addCriterion("trans_amt >", value, "transAmt");
            return (Criteria) this;
        }

        public Criteria andTransAmtGreaterThanOrEqualTo(Long value) {
            addCriterion("trans_amt >=", value, "transAmt");
            return (Criteria) this;
        }

        public Criteria andTransAmtLessThan(Long value) {
            addCriterion("trans_amt <", value, "transAmt");
            return (Criteria) this;
        }

        public Criteria andTransAmtLessThanOrEqualTo(Long value) {
            addCriterion("trans_amt <=", value, "transAmt");
            return (Criteria) this;
        }

        public Criteria andTransAmtIn(List<Long> values) {
            addCriterion("trans_amt in", values, "transAmt");
            return (Criteria) this;
        }

        public Criteria andTransAmtNotIn(List<Long> values) {
            addCriterion("trans_amt not in", values, "transAmt");
            return (Criteria) this;
        }

        public Criteria andTransAmtBetween(Long value1, Long value2) {
            addCriterion("trans_amt between", value1, value2, "transAmt");
            return (Criteria) this;
        }

        public Criteria andTransAmtNotBetween(Long value1, Long value2) {
            addCriterion("trans_amt not between", value1, value2, "transAmt");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNull() {
            addCriterion("currency is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNotNull() {
            addCriterion("currency is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyEqualTo(String value) {
            addCriterion("currency =", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotEqualTo(String value) {
            addCriterion("currency <>", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThan(String value) {
            addCriterion("currency >", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("currency >=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThan(String value) {
            addCriterion("currency <", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThanOrEqualTo(String value) {
            addCriterion("currency <=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLike(String value) {
            addCriterion("currency like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotLike(String value) {
            addCriterion("currency not like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyIn(List<String> values) {
            addCriterion("currency in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotIn(List<String> values) {
            addCriterion("currency not in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyBetween(String value1, String value2) {
            addCriterion("currency between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotBetween(String value1, String value2) {
            addCriterion("currency not between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andTrueAmtIsNull() {
            addCriterion("true_amt is null");
            return (Criteria) this;
        }

        public Criteria andTrueAmtIsNotNull() {
            addCriterion("true_amt is not null");
            return (Criteria) this;
        }

        public Criteria andTrueAmtEqualTo(Long value) {
            addCriterion("true_amt =", value, "trueAmt");
            return (Criteria) this;
        }

        public Criteria andTrueAmtNotEqualTo(Long value) {
            addCriterion("true_amt <>", value, "trueAmt");
            return (Criteria) this;
        }

        public Criteria andTrueAmtGreaterThan(Long value) {
            addCriterion("true_amt >", value, "trueAmt");
            return (Criteria) this;
        }

        public Criteria andTrueAmtGreaterThanOrEqualTo(Long value) {
            addCriterion("true_amt >=", value, "trueAmt");
            return (Criteria) this;
        }

        public Criteria andTrueAmtLessThan(Long value) {
            addCriterion("true_amt <", value, "trueAmt");
            return (Criteria) this;
        }

        public Criteria andTrueAmtLessThanOrEqualTo(Long value) {
            addCriterion("true_amt <=", value, "trueAmt");
            return (Criteria) this;
        }

        public Criteria andTrueAmtIn(List<Long> values) {
            addCriterion("true_amt in", values, "trueAmt");
            return (Criteria) this;
        }

        public Criteria andTrueAmtNotIn(List<Long> values) {
            addCriterion("true_amt not in", values, "trueAmt");
            return (Criteria) this;
        }

        public Criteria andTrueAmtBetween(Long value1, Long value2) {
            addCriterion("true_amt between", value1, value2, "trueAmt");
            return (Criteria) this;
        }

        public Criteria andTrueAmtNotBetween(Long value1, Long value2) {
            addCriterion("true_amt not between", value1, value2, "trueAmt");
            return (Criteria) this;
        }

        public Criteria andPayeeBankNmIsNull() {
            addCriterion("payee_bank_nm is null");
            return (Criteria) this;
        }

        public Criteria andPayeeBankNmIsNotNull() {
            addCriterion("payee_bank_nm is not null");
            return (Criteria) this;
        }

        public Criteria andPayeeBankNmEqualTo(String value) {
            addCriterion("payee_bank_nm =", value, "payeeBankNm");
            return (Criteria) this;
        }

        public Criteria andPayeeBankNmNotEqualTo(String value) {
            addCriterion("payee_bank_nm <>", value, "payeeBankNm");
            return (Criteria) this;
        }

        public Criteria andPayeeBankNmGreaterThan(String value) {
            addCriterion("payee_bank_nm >", value, "payeeBankNm");
            return (Criteria) this;
        }

        public Criteria andPayeeBankNmGreaterThanOrEqualTo(String value) {
            addCriterion("payee_bank_nm >=", value, "payeeBankNm");
            return (Criteria) this;
        }

        public Criteria andPayeeBankNmLessThan(String value) {
            addCriterion("payee_bank_nm <", value, "payeeBankNm");
            return (Criteria) this;
        }

        public Criteria andPayeeBankNmLessThanOrEqualTo(String value) {
            addCriterion("payee_bank_nm <=", value, "payeeBankNm");
            return (Criteria) this;
        }

        public Criteria andPayeeBankNmLike(String value) {
            addCriterion("payee_bank_nm like", value, "payeeBankNm");
            return (Criteria) this;
        }

        public Criteria andPayeeBankNmNotLike(String value) {
            addCriterion("payee_bank_nm not like", value, "payeeBankNm");
            return (Criteria) this;
        }

        public Criteria andPayeeBankNmIn(List<String> values) {
            addCriterion("payee_bank_nm in", values, "payeeBankNm");
            return (Criteria) this;
        }

        public Criteria andPayeeBankNmNotIn(List<String> values) {
            addCriterion("payee_bank_nm not in", values, "payeeBankNm");
            return (Criteria) this;
        }

        public Criteria andPayeeBankNmBetween(String value1, String value2) {
            addCriterion("payee_bank_nm between", value1, value2, "payeeBankNm");
            return (Criteria) this;
        }

        public Criteria andPayeeBankNmNotBetween(String value1, String value2) {
            addCriterion("payee_bank_nm not between", value1, value2, "payeeBankNm");
            return (Criteria) this;
        }

        public Criteria andPayeeNmIsNull() {
            addCriterion("payee_nm is null");
            return (Criteria) this;
        }

        public Criteria andPayeeNmIsNotNull() {
            addCriterion("payee_nm is not null");
            return (Criteria) this;
        }

        public Criteria andPayeeNmEqualTo(String value) {
            addCriterion("payee_nm =", value, "payeeNm");
            return (Criteria) this;
        }

        public Criteria andPayeeNmNotEqualTo(String value) {
            addCriterion("payee_nm <>", value, "payeeNm");
            return (Criteria) this;
        }

        public Criteria andPayeeNmGreaterThan(String value) {
            addCriterion("payee_nm >", value, "payeeNm");
            return (Criteria) this;
        }

        public Criteria andPayeeNmGreaterThanOrEqualTo(String value) {
            addCriterion("payee_nm >=", value, "payeeNm");
            return (Criteria) this;
        }

        public Criteria andPayeeNmLessThan(String value) {
            addCriterion("payee_nm <", value, "payeeNm");
            return (Criteria) this;
        }

        public Criteria andPayeeNmLessThanOrEqualTo(String value) {
            addCriterion("payee_nm <=", value, "payeeNm");
            return (Criteria) this;
        }

        public Criteria andPayeeNmLike(String value) {
            addCriterion("payee_nm like", value, "payeeNm");
            return (Criteria) this;
        }

        public Criteria andPayeeNmNotLike(String value) {
            addCriterion("payee_nm not like", value, "payeeNm");
            return (Criteria) this;
        }

        public Criteria andPayeeNmIn(List<String> values) {
            addCriterion("payee_nm in", values, "payeeNm");
            return (Criteria) this;
        }

        public Criteria andPayeeNmNotIn(List<String> values) {
            addCriterion("payee_nm not in", values, "payeeNm");
            return (Criteria) this;
        }

        public Criteria andPayeeNmBetween(String value1, String value2) {
            addCriterion("payee_nm between", value1, value2, "payeeNm");
            return (Criteria) this;
        }

        public Criteria andPayeeNmNotBetween(String value1, String value2) {
            addCriterion("payee_nm not between", value1, value2, "payeeNm");
            return (Criteria) this;
        }

        public Criteria andPayeeAccIsNull() {
            addCriterion("payee_acc is null");
            return (Criteria) this;
        }

        public Criteria andPayeeAccIsNotNull() {
            addCriterion("payee_acc is not null");
            return (Criteria) this;
        }

        public Criteria andPayeeAccEqualTo(String value) {
            addCriterion("payee_acc =", value, "payeeAcc");
            return (Criteria) this;
        }

        public Criteria andPayeeAccNotEqualTo(String value) {
            addCriterion("payee_acc <>", value, "payeeAcc");
            return (Criteria) this;
        }

        public Criteria andPayeeAccGreaterThan(String value) {
            addCriterion("payee_acc >", value, "payeeAcc");
            return (Criteria) this;
        }

        public Criteria andPayeeAccGreaterThanOrEqualTo(String value) {
            addCriterion("payee_acc >=", value, "payeeAcc");
            return (Criteria) this;
        }

        public Criteria andPayeeAccLessThan(String value) {
            addCriterion("payee_acc <", value, "payeeAcc");
            return (Criteria) this;
        }

        public Criteria andPayeeAccLessThanOrEqualTo(String value) {
            addCriterion("payee_acc <=", value, "payeeAcc");
            return (Criteria) this;
        }

        public Criteria andPayeeAccLike(String value) {
            addCriterion("payee_acc like", value, "payeeAcc");
            return (Criteria) this;
        }

        public Criteria andPayeeAccNotLike(String value) {
            addCriterion("payee_acc not like", value, "payeeAcc");
            return (Criteria) this;
        }

        public Criteria andPayeeAccIn(List<String> values) {
            addCriterion("payee_acc in", values, "payeeAcc");
            return (Criteria) this;
        }

        public Criteria andPayeeAccNotIn(List<String> values) {
            addCriterion("payee_acc not in", values, "payeeAcc");
            return (Criteria) this;
        }

        public Criteria andPayeeAccBetween(String value1, String value2) {
            addCriterion("payee_acc between", value1, value2, "payeeAcc");
            return (Criteria) this;
        }

        public Criteria andPayeeAccNotBetween(String value1, String value2) {
            addCriterion("payee_acc not between", value1, value2, "payeeAcc");
            return (Criteria) this;
        }

        public Criteria andOrigTransSeqIdIsNull() {
            addCriterion("orig_trans_seq_id is null");
            return (Criteria) this;
        }

        public Criteria andOrigTransSeqIdIsNotNull() {
            addCriterion("orig_trans_seq_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrigTransSeqIdEqualTo(String value) {
            addCriterion("orig_trans_seq_id =", value, "origTransSeqId");
            return (Criteria) this;
        }

        public Criteria andOrigTransSeqIdNotEqualTo(String value) {
            addCriterion("orig_trans_seq_id <>", value, "origTransSeqId");
            return (Criteria) this;
        }

        public Criteria andOrigTransSeqIdGreaterThan(String value) {
            addCriterion("orig_trans_seq_id >", value, "origTransSeqId");
            return (Criteria) this;
        }

        public Criteria andOrigTransSeqIdGreaterThanOrEqualTo(String value) {
            addCriterion("orig_trans_seq_id >=", value, "origTransSeqId");
            return (Criteria) this;
        }

        public Criteria andOrigTransSeqIdLessThan(String value) {
            addCriterion("orig_trans_seq_id <", value, "origTransSeqId");
            return (Criteria) this;
        }

        public Criteria andOrigTransSeqIdLessThanOrEqualTo(String value) {
            addCriterion("orig_trans_seq_id <=", value, "origTransSeqId");
            return (Criteria) this;
        }

        public Criteria andOrigTransSeqIdLike(String value) {
            addCriterion("orig_trans_seq_id like", value, "origTransSeqId");
            return (Criteria) this;
        }

        public Criteria andOrigTransSeqIdNotLike(String value) {
            addCriterion("orig_trans_seq_id not like", value, "origTransSeqId");
            return (Criteria) this;
        }

        public Criteria andOrigTransSeqIdIn(List<String> values) {
            addCriterion("orig_trans_seq_id in", values, "origTransSeqId");
            return (Criteria) this;
        }

        public Criteria andOrigTransSeqIdNotIn(List<String> values) {
            addCriterion("orig_trans_seq_id not in", values, "origTransSeqId");
            return (Criteria) this;
        }

        public Criteria andOrigTransSeqIdBetween(String value1, String value2) {
            addCriterion("orig_trans_seq_id between", value1, value2, "origTransSeqId");
            return (Criteria) this;
        }

        public Criteria andOrigTransSeqIdNotBetween(String value1, String value2) {
            addCriterion("orig_trans_seq_id not between", value1, value2, "origTransSeqId");
            return (Criteria) this;
        }

        public Criteria andFrntRetUrlIsNull() {
            addCriterion("frnt_ret_url is null");
            return (Criteria) this;
        }

        public Criteria andFrntRetUrlIsNotNull() {
            addCriterion("frnt_ret_url is not null");
            return (Criteria) this;
        }

        public Criteria andFrntRetUrlEqualTo(String value) {
            addCriterion("frnt_ret_url =", value, "frntRetUrl");
            return (Criteria) this;
        }

        public Criteria andFrntRetUrlNotEqualTo(String value) {
            addCriterion("frnt_ret_url <>", value, "frntRetUrl");
            return (Criteria) this;
        }

        public Criteria andFrntRetUrlGreaterThan(String value) {
            addCriterion("frnt_ret_url >", value, "frntRetUrl");
            return (Criteria) this;
        }

        public Criteria andFrntRetUrlGreaterThanOrEqualTo(String value) {
            addCriterion("frnt_ret_url >=", value, "frntRetUrl");
            return (Criteria) this;
        }

        public Criteria andFrntRetUrlLessThan(String value) {
            addCriterion("frnt_ret_url <", value, "frntRetUrl");
            return (Criteria) this;
        }

        public Criteria andFrntRetUrlLessThanOrEqualTo(String value) {
            addCriterion("frnt_ret_url <=", value, "frntRetUrl");
            return (Criteria) this;
        }

        public Criteria andFrntRetUrlLike(String value) {
            addCriterion("frnt_ret_url like", value, "frntRetUrl");
            return (Criteria) this;
        }

        public Criteria andFrntRetUrlNotLike(String value) {
            addCriterion("frnt_ret_url not like", value, "frntRetUrl");
            return (Criteria) this;
        }

        public Criteria andFrntRetUrlIn(List<String> values) {
            addCriterion("frnt_ret_url in", values, "frntRetUrl");
            return (Criteria) this;
        }

        public Criteria andFrntRetUrlNotIn(List<String> values) {
            addCriterion("frnt_ret_url not in", values, "frntRetUrl");
            return (Criteria) this;
        }

        public Criteria andFrntRetUrlBetween(String value1, String value2) {
            addCriterion("frnt_ret_url between", value1, value2, "frntRetUrl");
            return (Criteria) this;
        }

        public Criteria andFrntRetUrlNotBetween(String value1, String value2) {
            addCriterion("frnt_ret_url not between", value1, value2, "frntRetUrl");
            return (Criteria) this;
        }

        public Criteria andBgRetUrlIsNull() {
            addCriterion("bg_ret_url is null");
            return (Criteria) this;
        }

        public Criteria andBgRetUrlIsNotNull() {
            addCriterion("bg_ret_url is not null");
            return (Criteria) this;
        }

        public Criteria andBgRetUrlEqualTo(String value) {
            addCriterion("bg_ret_url =", value, "bgRetUrl");
            return (Criteria) this;
        }

        public Criteria andBgRetUrlNotEqualTo(String value) {
            addCriterion("bg_ret_url <>", value, "bgRetUrl");
            return (Criteria) this;
        }

        public Criteria andBgRetUrlGreaterThan(String value) {
            addCriterion("bg_ret_url >", value, "bgRetUrl");
            return (Criteria) this;
        }

        public Criteria andBgRetUrlGreaterThanOrEqualTo(String value) {
            addCriterion("bg_ret_url >=", value, "bgRetUrl");
            return (Criteria) this;
        }

        public Criteria andBgRetUrlLessThan(String value) {
            addCriterion("bg_ret_url <", value, "bgRetUrl");
            return (Criteria) this;
        }

        public Criteria andBgRetUrlLessThanOrEqualTo(String value) {
            addCriterion("bg_ret_url <=", value, "bgRetUrl");
            return (Criteria) this;
        }

        public Criteria andBgRetUrlLike(String value) {
            addCriterion("bg_ret_url like", value, "bgRetUrl");
            return (Criteria) this;
        }

        public Criteria andBgRetUrlNotLike(String value) {
            addCriterion("bg_ret_url not like", value, "bgRetUrl");
            return (Criteria) this;
        }

        public Criteria andBgRetUrlIn(List<String> values) {
            addCriterion("bg_ret_url in", values, "bgRetUrl");
            return (Criteria) this;
        }

        public Criteria andBgRetUrlNotIn(List<String> values) {
            addCriterion("bg_ret_url not in", values, "bgRetUrl");
            return (Criteria) this;
        }

        public Criteria andBgRetUrlBetween(String value1, String value2) {
            addCriterion("bg_ret_url between", value1, value2, "bgRetUrl");
            return (Criteria) this;
        }

        public Criteria andBgRetUrlNotBetween(String value1, String value2) {
            addCriterion("bg_ret_url not between", value1, value2, "bgRetUrl");
            return (Criteria) this;
        }

        public Criteria andTransStIsNull() {
            addCriterion("trans_st is null");
            return (Criteria) this;
        }

        public Criteria andTransStIsNotNull() {
            addCriterion("trans_st is not null");
            return (Criteria) this;
        }

        public Criteria andTransStEqualTo(String value) {
            addCriterion("trans_st =", value, "transSt");
            return (Criteria) this;
        }

        public Criteria andTransStNotEqualTo(String value) {
            addCriterion("trans_st <>", value, "transSt");
            return (Criteria) this;
        }

        public Criteria andTransStGreaterThan(String value) {
            addCriterion("trans_st >", value, "transSt");
            return (Criteria) this;
        }

        public Criteria andTransStGreaterThanOrEqualTo(String value) {
            addCriterion("trans_st >=", value, "transSt");
            return (Criteria) this;
        }

        public Criteria andTransStLessThan(String value) {
            addCriterion("trans_st <", value, "transSt");
            return (Criteria) this;
        }

        public Criteria andTransStLessThanOrEqualTo(String value) {
            addCriterion("trans_st <=", value, "transSt");
            return (Criteria) this;
        }

        public Criteria andTransStLike(String value) {
            addCriterion("trans_st like", value, "transSt");
            return (Criteria) this;
        }

        public Criteria andTransStNotLike(String value) {
            addCriterion("trans_st not like", value, "transSt");
            return (Criteria) this;
        }

        public Criteria andTransStIn(List<String> values) {
            addCriterion("trans_st in", values, "transSt");
            return (Criteria) this;
        }

        public Criteria andTransStNotIn(List<String> values) {
            addCriterion("trans_st not in", values, "transSt");
            return (Criteria) this;
        }

        public Criteria andTransStBetween(String value1, String value2) {
            addCriterion("trans_st between", value1, value2, "transSt");
            return (Criteria) this;
        }

        public Criteria andTransStNotBetween(String value1, String value2) {
            addCriterion("trans_st not between", value1, value2, "transSt");
            return (Criteria) this;
        }

        public Criteria andMchntRspCdIsNull() {
            addCriterion("mchnt_rsp_cd is null");
            return (Criteria) this;
        }

        public Criteria andMchntRspCdIsNotNull() {
            addCriterion("mchnt_rsp_cd is not null");
            return (Criteria) this;
        }

        public Criteria andMchntRspCdEqualTo(String value) {
            addCriterion("mchnt_rsp_cd =", value, "mchntRspCd");
            return (Criteria) this;
        }

        public Criteria andMchntRspCdNotEqualTo(String value) {
            addCriterion("mchnt_rsp_cd <>", value, "mchntRspCd");
            return (Criteria) this;
        }

        public Criteria andMchntRspCdGreaterThan(String value) {
            addCriterion("mchnt_rsp_cd >", value, "mchntRspCd");
            return (Criteria) this;
        }

        public Criteria andMchntRspCdGreaterThanOrEqualTo(String value) {
            addCriterion("mchnt_rsp_cd >=", value, "mchntRspCd");
            return (Criteria) this;
        }

        public Criteria andMchntRspCdLessThan(String value) {
            addCriterion("mchnt_rsp_cd <", value, "mchntRspCd");
            return (Criteria) this;
        }

        public Criteria andMchntRspCdLessThanOrEqualTo(String value) {
            addCriterion("mchnt_rsp_cd <=", value, "mchntRspCd");
            return (Criteria) this;
        }

        public Criteria andMchntRspCdLike(String value) {
            addCriterion("mchnt_rsp_cd like", value, "mchntRspCd");
            return (Criteria) this;
        }

        public Criteria andMchntRspCdNotLike(String value) {
            addCriterion("mchnt_rsp_cd not like", value, "mchntRspCd");
            return (Criteria) this;
        }

        public Criteria andMchntRspCdIn(List<String> values) {
            addCriterion("mchnt_rsp_cd in", values, "mchntRspCd");
            return (Criteria) this;
        }

        public Criteria andMchntRspCdNotIn(List<String> values) {
            addCriterion("mchnt_rsp_cd not in", values, "mchntRspCd");
            return (Criteria) this;
        }

        public Criteria andMchntRspCdBetween(String value1, String value2) {
            addCriterion("mchnt_rsp_cd between", value1, value2, "mchntRspCd");
            return (Criteria) this;
        }

        public Criteria andMchntRspCdNotBetween(String value1, String value2) {
            addCriterion("mchnt_rsp_cd not between", value1, value2, "mchntRspCd");
            return (Criteria) this;
        }

        public Criteria andSysRspCdIsNull() {
            addCriterion("sys_rsp_cd is null");
            return (Criteria) this;
        }

        public Criteria andSysRspCdIsNotNull() {
            addCriterion("sys_rsp_cd is not null");
            return (Criteria) this;
        }

        public Criteria andSysRspCdEqualTo(String value) {
            addCriterion("sys_rsp_cd =", value, "sysRspCd");
            return (Criteria) this;
        }

        public Criteria andSysRspCdNotEqualTo(String value) {
            addCriterion("sys_rsp_cd <>", value, "sysRspCd");
            return (Criteria) this;
        }

        public Criteria andSysRspCdGreaterThan(String value) {
            addCriterion("sys_rsp_cd >", value, "sysRspCd");
            return (Criteria) this;
        }

        public Criteria andSysRspCdGreaterThanOrEqualTo(String value) {
            addCriterion("sys_rsp_cd >=", value, "sysRspCd");
            return (Criteria) this;
        }

        public Criteria andSysRspCdLessThan(String value) {
            addCriterion("sys_rsp_cd <", value, "sysRspCd");
            return (Criteria) this;
        }

        public Criteria andSysRspCdLessThanOrEqualTo(String value) {
            addCriterion("sys_rsp_cd <=", value, "sysRspCd");
            return (Criteria) this;
        }

        public Criteria andSysRspCdLike(String value) {
            addCriterion("sys_rsp_cd like", value, "sysRspCd");
            return (Criteria) this;
        }

        public Criteria andSysRspCdNotLike(String value) {
            addCriterion("sys_rsp_cd not like", value, "sysRspCd");
            return (Criteria) this;
        }

        public Criteria andSysRspCdIn(List<String> values) {
            addCriterion("sys_rsp_cd in", values, "sysRspCd");
            return (Criteria) this;
        }

        public Criteria andSysRspCdNotIn(List<String> values) {
            addCriterion("sys_rsp_cd not in", values, "sysRspCd");
            return (Criteria) this;
        }

        public Criteria andSysRspCdBetween(String value1, String value2) {
            addCriterion("sys_rsp_cd between", value1, value2, "sysRspCd");
            return (Criteria) this;
        }

        public Criteria andSysRspCdNotBetween(String value1, String value2) {
            addCriterion("sys_rsp_cd not between", value1, value2, "sysRspCd");
            return (Criteria) this;
        }

        public Criteria andSysTransDtIsNull() {
            addCriterion("sys_trans_dt is null");
            return (Criteria) this;
        }

        public Criteria andSysTransDtIsNotNull() {
            addCriterion("sys_trans_dt is not null");
            return (Criteria) this;
        }

        public Criteria andSysTransDtEqualTo(Date value) {
            addCriterion("sys_trans_dt =", value, "sysTransDt");
            return (Criteria) this;
        }

        public Criteria andSysTransDtNotEqualTo(Date value) {
            addCriterion("sys_trans_dt <>", value, "sysTransDt");
            return (Criteria) this;
        }

        public Criteria andSysTransDtGreaterThan(Date value) {
            addCriterion("sys_trans_dt >", value, "sysTransDt");
            return (Criteria) this;
        }

        public Criteria andSysTransDtGreaterThanOrEqualTo(Date value) {
            addCriterion("sys_trans_dt >=", value, "sysTransDt");
            return (Criteria) this;
        }

        public Criteria andSysTransDtLessThan(Date value) {
            addCriterion("sys_trans_dt <", value, "sysTransDt");
            return (Criteria) this;
        }

        public Criteria andSysTransDtLessThanOrEqualTo(Date value) {
            addCriterion("sys_trans_dt <=", value, "sysTransDt");
            return (Criteria) this;
        }

        public Criteria andSysTransDtIn(List<Date> values) {
            addCriterion("sys_trans_dt in", values, "sysTransDt");
            return (Criteria) this;
        }

        public Criteria andSysTransDtNotIn(List<Date> values) {
            addCriterion("sys_trans_dt not in", values, "sysTransDt");
            return (Criteria) this;
        }

        public Criteria andSysTransDtBetween(Date value1, Date value2) {
            addCriterion("sys_trans_dt between", value1, value2, "sysTransDt");
            return (Criteria) this;
        }

        public Criteria andSysTransDtNotBetween(Date value1, Date value2) {
            addCriterion("sys_trans_dt not between", value1, value2, "sysTransDt");
            return (Criteria) this;
        }

        public Criteria andSysTransIdIsNull() {
            addCriterion("sys_trans_id is null");
            return (Criteria) this;
        }

        public Criteria andSysTransIdIsNotNull() {
            addCriterion("sys_trans_id is not null");
            return (Criteria) this;
        }

        public Criteria andSysTransIdEqualTo(String value) {
            addCriterion("sys_trans_id =", value, "sysTransId");
            return (Criteria) this;
        }

        public Criteria andSysTransIdNotEqualTo(String value) {
            addCriterion("sys_trans_id <>", value, "sysTransId");
            return (Criteria) this;
        }

        public Criteria andSysTransIdGreaterThan(String value) {
            addCriterion("sys_trans_id >", value, "sysTransId");
            return (Criteria) this;
        }

        public Criteria andSysTransIdGreaterThanOrEqualTo(String value) {
            addCriterion("sys_trans_id >=", value, "sysTransId");
            return (Criteria) this;
        }

        public Criteria andSysTransIdLessThan(String value) {
            addCriterion("sys_trans_id <", value, "sysTransId");
            return (Criteria) this;
        }

        public Criteria andSysTransIdLessThanOrEqualTo(String value) {
            addCriterion("sys_trans_id <=", value, "sysTransId");
            return (Criteria) this;
        }

        public Criteria andSysTransIdLike(String value) {
            addCriterion("sys_trans_id like", value, "sysTransId");
            return (Criteria) this;
        }

        public Criteria andSysTransIdNotLike(String value) {
            addCriterion("sys_trans_id not like", value, "sysTransId");
            return (Criteria) this;
        }

        public Criteria andSysTransIdIn(List<String> values) {
            addCriterion("sys_trans_id in", values, "sysTransId");
            return (Criteria) this;
        }

        public Criteria andSysTransIdNotIn(List<String> values) {
            addCriterion("sys_trans_id not in", values, "sysTransId");
            return (Criteria) this;
        }

        public Criteria andSysTransIdBetween(String value1, String value2) {
            addCriterion("sys_trans_id between", value1, value2, "sysTransId");
            return (Criteria) this;
        }

        public Criteria andSysTransIdNotBetween(String value1, String value2) {
            addCriterion("sys_trans_id not between", value1, value2, "sysTransId");
            return (Criteria) this;
        }

        public Criteria andSysSettleDtIsNull() {
            addCriterion("sys_settle_dt is null");
            return (Criteria) this;
        }

        public Criteria andSysSettleDtIsNotNull() {
            addCriterion("sys_settle_dt is not null");
            return (Criteria) this;
        }

        public Criteria andSysSettleDtEqualTo(String value) {
            addCriterion("sys_settle_dt =", value, "sysSettleDt");
            return (Criteria) this;
        }

        public Criteria andSysSettleDtNotEqualTo(String value) {
            addCriterion("sys_settle_dt <>", value, "sysSettleDt");
            return (Criteria) this;
        }

        public Criteria andSysSettleDtGreaterThan(String value) {
            addCriterion("sys_settle_dt >", value, "sysSettleDt");
            return (Criteria) this;
        }

        public Criteria andSysSettleDtGreaterThanOrEqualTo(String value) {
            addCriterion("sys_settle_dt >=", value, "sysSettleDt");
            return (Criteria) this;
        }

        public Criteria andSysSettleDtLessThan(String value) {
            addCriterion("sys_settle_dt <", value, "sysSettleDt");
            return (Criteria) this;
        }

        public Criteria andSysSettleDtLessThanOrEqualTo(String value) {
            addCriterion("sys_settle_dt <=", value, "sysSettleDt");
            return (Criteria) this;
        }

        public Criteria andSysSettleDtLike(String value) {
            addCriterion("sys_settle_dt like", value, "sysSettleDt");
            return (Criteria) this;
        }

        public Criteria andSysSettleDtNotLike(String value) {
            addCriterion("sys_settle_dt not like", value, "sysSettleDt");
            return (Criteria) this;
        }

        public Criteria andSysSettleDtIn(List<String> values) {
            addCriterion("sys_settle_dt in", values, "sysSettleDt");
            return (Criteria) this;
        }

        public Criteria andSysSettleDtNotIn(List<String> values) {
            addCriterion("sys_settle_dt not in", values, "sysSettleDt");
            return (Criteria) this;
        }

        public Criteria andSysSettleDtBetween(String value1, String value2) {
            addCriterion("sys_settle_dt between", value1, value2, "sysSettleDt");
            return (Criteria) this;
        }

        public Criteria andSysSettleDtNotBetween(String value1, String value2) {
            addCriterion("sys_settle_dt not between", value1, value2, "sysSettleDt");
            return (Criteria) this;
        }

        public Criteria andReqIpIsNull() {
            addCriterion("req_ip is null");
            return (Criteria) this;
        }

        public Criteria andReqIpIsNotNull() {
            addCriterion("req_ip is not null");
            return (Criteria) this;
        }

        public Criteria andReqIpEqualTo(String value) {
            addCriterion("req_ip =", value, "reqIp");
            return (Criteria) this;
        }

        public Criteria andReqIpNotEqualTo(String value) {
            addCriterion("req_ip <>", value, "reqIp");
            return (Criteria) this;
        }

        public Criteria andReqIpGreaterThan(String value) {
            addCriterion("req_ip >", value, "reqIp");
            return (Criteria) this;
        }

        public Criteria andReqIpGreaterThanOrEqualTo(String value) {
            addCriterion("req_ip >=", value, "reqIp");
            return (Criteria) this;
        }

        public Criteria andReqIpLessThan(String value) {
            addCriterion("req_ip <", value, "reqIp");
            return (Criteria) this;
        }

        public Criteria andReqIpLessThanOrEqualTo(String value) {
            addCriterion("req_ip <=", value, "reqIp");
            return (Criteria) this;
        }

        public Criteria andReqIpLike(String value) {
            addCriterion("req_ip like", value, "reqIp");
            return (Criteria) this;
        }

        public Criteria andReqIpNotLike(String value) {
            addCriterion("req_ip not like", value, "reqIp");
            return (Criteria) this;
        }

        public Criteria andReqIpIn(List<String> values) {
            addCriterion("req_ip in", values, "reqIp");
            return (Criteria) this;
        }

        public Criteria andReqIpNotIn(List<String> values) {
            addCriterion("req_ip not in", values, "reqIp");
            return (Criteria) this;
        }

        public Criteria andReqIpBetween(String value1, String value2) {
            addCriterion("req_ip between", value1, value2, "reqIp");
            return (Criteria) this;
        }

        public Criteria andReqIpNotBetween(String value1, String value2) {
            addCriterion("req_ip not between", value1, value2, "reqIp");
            return (Criteria) this;
        }

        public Criteria andMsgExtIsNull() {
            addCriterion("msg_ext is null");
            return (Criteria) this;
        }

        public Criteria andMsgExtIsNotNull() {
            addCriterion("msg_ext is not null");
            return (Criteria) this;
        }

        public Criteria andMsgExtEqualTo(String value) {
            addCriterion("msg_ext =", value, "msgExt");
            return (Criteria) this;
        }

        public Criteria andMsgExtNotEqualTo(String value) {
            addCriterion("msg_ext <>", value, "msgExt");
            return (Criteria) this;
        }

        public Criteria andMsgExtGreaterThan(String value) {
            addCriterion("msg_ext >", value, "msgExt");
            return (Criteria) this;
        }

        public Criteria andMsgExtGreaterThanOrEqualTo(String value) {
            addCriterion("msg_ext >=", value, "msgExt");
            return (Criteria) this;
        }

        public Criteria andMsgExtLessThan(String value) {
            addCriterion("msg_ext <", value, "msgExt");
            return (Criteria) this;
        }

        public Criteria andMsgExtLessThanOrEqualTo(String value) {
            addCriterion("msg_ext <=", value, "msgExt");
            return (Criteria) this;
        }

        public Criteria andMsgExtLike(String value) {
            addCriterion("msg_ext like", value, "msgExt");
            return (Criteria) this;
        }

        public Criteria andMsgExtNotLike(String value) {
            addCriterion("msg_ext not like", value, "msgExt");
            return (Criteria) this;
        }

        public Criteria andMsgExtIn(List<String> values) {
            addCriterion("msg_ext in", values, "msgExt");
            return (Criteria) this;
        }

        public Criteria andMsgExtNotIn(List<String> values) {
            addCriterion("msg_ext not in", values, "msgExt");
            return (Criteria) this;
        }

        public Criteria andMsgExtBetween(String value1, String value2) {
            addCriterion("msg_ext between", value1, value2, "msgExt");
            return (Criteria) this;
        }

        public Criteria andMsgExtNotBetween(String value1, String value2) {
            addCriterion("msg_ext not between", value1, value2, "msgExt");
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