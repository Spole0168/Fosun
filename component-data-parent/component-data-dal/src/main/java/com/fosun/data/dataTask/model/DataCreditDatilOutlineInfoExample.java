package com.fosun.data.dataTask.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataCreditDatilOutlineInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DataCreditDatilOutlineInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected DataCreditDatilOutlineInfoExample(DataCreditDatilOutlineInfoExample example) {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCreditReportIdIsNull() {
            addCriterion("credit_report_id is null");
            return (Criteria) this;
        }

        public Criteria andCreditReportIdIsNotNull() {
            addCriterion("credit_report_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreditReportIdEqualTo(String value) {
            addCriterion("credit_report_id =", value, "creditReportId");
            return (Criteria) this;
        }

        public Criteria andCreditReportIdNotEqualTo(String value) {
            addCriterion("credit_report_id <>", value, "creditReportId");
            return (Criteria) this;
        }

        public Criteria andCreditReportIdGreaterThan(String value) {
            addCriterion("credit_report_id >", value, "creditReportId");
            return (Criteria) this;
        }

        public Criteria andCreditReportIdGreaterThanOrEqualTo(String value) {
            addCriterion("credit_report_id >=", value, "creditReportId");
            return (Criteria) this;
        }

        public Criteria andCreditReportIdLessThan(String value) {
            addCriterion("credit_report_id <", value, "creditReportId");
            return (Criteria) this;
        }

        public Criteria andCreditReportIdLessThanOrEqualTo(String value) {
            addCriterion("credit_report_id <=", value, "creditReportId");
            return (Criteria) this;
        }

        public Criteria andCreditReportIdLike(String value) {
            addCriterion("credit_report_id like", value, "creditReportId");
            return (Criteria) this;
        }

        public Criteria andCreditReportIdNotLike(String value) {
            addCriterion("credit_report_id not like", value, "creditReportId");
            return (Criteria) this;
        }

        public Criteria andCreditReportIdIn(List<String> values) {
            addCriterion("credit_report_id in", values, "creditReportId");
            return (Criteria) this;
        }

        public Criteria andCreditReportIdNotIn(List<String> values) {
            addCriterion("credit_report_id not in", values, "creditReportId");
            return (Criteria) this;
        }

        public Criteria andCreditReportIdBetween(String value1, String value2) {
            addCriterion("credit_report_id between", value1, value2, "creditReportId");
            return (Criteria) this;
        }

        public Criteria andCreditReportIdNotBetween(String value1, String value2) {
            addCriterion("credit_report_id not between", value1, value2, "creditReportId");
            return (Criteria) this;
        }

        public Criteria andAssetDisposalNumIsNull() {
            addCriterion("asset_disposal_num is null");
            return (Criteria) this;
        }

        public Criteria andAssetDisposalNumIsNotNull() {
            addCriterion("asset_disposal_num is not null");
            return (Criteria) this;
        }

        public Criteria andAssetDisposalNumEqualTo(String value) {
            addCriterion("asset_disposal_num =", value, "assetDisposalNum");
            return (Criteria) this;
        }

        public Criteria andAssetDisposalNumNotEqualTo(String value) {
            addCriterion("asset_disposal_num <>", value, "assetDisposalNum");
            return (Criteria) this;
        }

        public Criteria andAssetDisposalNumGreaterThan(String value) {
            addCriterion("asset_disposal_num >", value, "assetDisposalNum");
            return (Criteria) this;
        }

        public Criteria andAssetDisposalNumGreaterThanOrEqualTo(String value) {
            addCriterion("asset_disposal_num >=", value, "assetDisposalNum");
            return (Criteria) this;
        }

        public Criteria andAssetDisposalNumLessThan(String value) {
            addCriterion("asset_disposal_num <", value, "assetDisposalNum");
            return (Criteria) this;
        }

        public Criteria andAssetDisposalNumLessThanOrEqualTo(String value) {
            addCriterion("asset_disposal_num <=", value, "assetDisposalNum");
            return (Criteria) this;
        }

        public Criteria andAssetDisposalNumLike(String value) {
            addCriterion("asset_disposal_num like", value, "assetDisposalNum");
            return (Criteria) this;
        }

        public Criteria andAssetDisposalNumNotLike(String value) {
            addCriterion("asset_disposal_num not like", value, "assetDisposalNum");
            return (Criteria) this;
        }

        public Criteria andAssetDisposalNumIn(List<String> values) {
            addCriterion("asset_disposal_num in", values, "assetDisposalNum");
            return (Criteria) this;
        }

        public Criteria andAssetDisposalNumNotIn(List<String> values) {
            addCriterion("asset_disposal_num not in", values, "assetDisposalNum");
            return (Criteria) this;
        }

        public Criteria andAssetDisposalNumBetween(String value1, String value2) {
            addCriterion("asset_disposal_num between", value1, value2, "assetDisposalNum");
            return (Criteria) this;
        }

        public Criteria andAssetDisposalNumNotBetween(String value1, String value2) {
            addCriterion("asset_disposal_num not between", value1, value2, "assetDisposalNum");
            return (Criteria) this;
        }

        public Criteria andAssurerNumIsNull() {
            addCriterion("assurer_num is null");
            return (Criteria) this;
        }

        public Criteria andAssurerNumIsNotNull() {
            addCriterion("assurer_num is not null");
            return (Criteria) this;
        }

        public Criteria andAssurerNumEqualTo(String value) {
            addCriterion("assurer_num =", value, "assurerNum");
            return (Criteria) this;
        }

        public Criteria andAssurerNumNotEqualTo(String value) {
            addCriterion("assurer_num <>", value, "assurerNum");
            return (Criteria) this;
        }

        public Criteria andAssurerNumGreaterThan(String value) {
            addCriterion("assurer_num >", value, "assurerNum");
            return (Criteria) this;
        }

        public Criteria andAssurerNumGreaterThanOrEqualTo(String value) {
            addCriterion("assurer_num >=", value, "assurerNum");
            return (Criteria) this;
        }

        public Criteria andAssurerNumLessThan(String value) {
            addCriterion("assurer_num <", value, "assurerNum");
            return (Criteria) this;
        }

        public Criteria andAssurerNumLessThanOrEqualTo(String value) {
            addCriterion("assurer_num <=", value, "assurerNum");
            return (Criteria) this;
        }

        public Criteria andAssurerNumLike(String value) {
            addCriterion("assurer_num like", value, "assurerNum");
            return (Criteria) this;
        }

        public Criteria andAssurerNumNotLike(String value) {
            addCriterion("assurer_num not like", value, "assurerNum");
            return (Criteria) this;
        }

        public Criteria andAssurerNumIn(List<String> values) {
            addCriterion("assurer_num in", values, "assurerNum");
            return (Criteria) this;
        }

        public Criteria andAssurerNumNotIn(List<String> values) {
            addCriterion("assurer_num not in", values, "assurerNum");
            return (Criteria) this;
        }

        public Criteria andAssurerNumBetween(String value1, String value2) {
            addCriterion("assurer_num between", value1, value2, "assurerNum");
            return (Criteria) this;
        }

        public Criteria andAssurerNumNotBetween(String value1, String value2) {
            addCriterion("assurer_num not between", value1, value2, "assurerNum");
            return (Criteria) this;
        }

        public Criteria andBadDebtsNumIsNull() {
            addCriterion("bad_debts_num is null");
            return (Criteria) this;
        }

        public Criteria andBadDebtsNumIsNotNull() {
            addCriterion("bad_debts_num is not null");
            return (Criteria) this;
        }

        public Criteria andBadDebtsNumEqualTo(String value) {
            addCriterion("bad_debts_num =", value, "badDebtsNum");
            return (Criteria) this;
        }

        public Criteria andBadDebtsNumNotEqualTo(String value) {
            addCriterion("bad_debts_num <>", value, "badDebtsNum");
            return (Criteria) this;
        }

        public Criteria andBadDebtsNumGreaterThan(String value) {
            addCriterion("bad_debts_num >", value, "badDebtsNum");
            return (Criteria) this;
        }

        public Criteria andBadDebtsNumGreaterThanOrEqualTo(String value) {
            addCriterion("bad_debts_num >=", value, "badDebtsNum");
            return (Criteria) this;
        }

        public Criteria andBadDebtsNumLessThan(String value) {
            addCriterion("bad_debts_num <", value, "badDebtsNum");
            return (Criteria) this;
        }

        public Criteria andBadDebtsNumLessThanOrEqualTo(String value) {
            addCriterion("bad_debts_num <=", value, "badDebtsNum");
            return (Criteria) this;
        }

        public Criteria andBadDebtsNumLike(String value) {
            addCriterion("bad_debts_num like", value, "badDebtsNum");
            return (Criteria) this;
        }

        public Criteria andBadDebtsNumNotLike(String value) {
            addCriterion("bad_debts_num not like", value, "badDebtsNum");
            return (Criteria) this;
        }

        public Criteria andBadDebtsNumIn(List<String> values) {
            addCriterion("bad_debts_num in", values, "badDebtsNum");
            return (Criteria) this;
        }

        public Criteria andBadDebtsNumNotIn(List<String> values) {
            addCriterion("bad_debts_num not in", values, "badDebtsNum");
            return (Criteria) this;
        }

        public Criteria andBadDebtsNumBetween(String value1, String value2) {
            addCriterion("bad_debts_num between", value1, value2, "badDebtsNum");
            return (Criteria) this;
        }

        public Criteria andBadDebtsNumNotBetween(String value1, String value2) {
            addCriterion("bad_debts_num not between", value1, value2, "badDebtsNum");
            return (Criteria) this;
        }

        public Criteria andHouseLoanNumIsNull() {
            addCriterion("house_loan_num is null");
            return (Criteria) this;
        }

        public Criteria andHouseLoanNumIsNotNull() {
            addCriterion("house_loan_num is not null");
            return (Criteria) this;
        }

        public Criteria andHouseLoanNumEqualTo(String value) {
            addCriterion("house_loan_num =", value, "houseLoanNum");
            return (Criteria) this;
        }

        public Criteria andHouseLoanNumNotEqualTo(String value) {
            addCriterion("house_loan_num <>", value, "houseLoanNum");
            return (Criteria) this;
        }

        public Criteria andHouseLoanNumGreaterThan(String value) {
            addCriterion("house_loan_num >", value, "houseLoanNum");
            return (Criteria) this;
        }

        public Criteria andHouseLoanNumGreaterThanOrEqualTo(String value) {
            addCriterion("house_loan_num >=", value, "houseLoanNum");
            return (Criteria) this;
        }

        public Criteria andHouseLoanNumLessThan(String value) {
            addCriterion("house_loan_num <", value, "houseLoanNum");
            return (Criteria) this;
        }

        public Criteria andHouseLoanNumLessThanOrEqualTo(String value) {
            addCriterion("house_loan_num <=", value, "houseLoanNum");
            return (Criteria) this;
        }

        public Criteria andHouseLoanNumLike(String value) {
            addCriterion("house_loan_num like", value, "houseLoanNum");
            return (Criteria) this;
        }

        public Criteria andHouseLoanNumNotLike(String value) {
            addCriterion("house_loan_num not like", value, "houseLoanNum");
            return (Criteria) this;
        }

        public Criteria andHouseLoanNumIn(List<String> values) {
            addCriterion("house_loan_num in", values, "houseLoanNum");
            return (Criteria) this;
        }

        public Criteria andHouseLoanNumNotIn(List<String> values) {
            addCriterion("house_loan_num not in", values, "houseLoanNum");
            return (Criteria) this;
        }

        public Criteria andHouseLoanNumBetween(String value1, String value2) {
            addCriterion("house_loan_num between", value1, value2, "houseLoanNum");
            return (Criteria) this;
        }

        public Criteria andHouseLoanNumNotBetween(String value1, String value2) {
            addCriterion("house_loan_num not between", value1, value2, "houseLoanNum");
            return (Criteria) this;
        }

        public Criteria andOtherLoanNumIsNull() {
            addCriterion("other_loan_num is null");
            return (Criteria) this;
        }

        public Criteria andOtherLoanNumIsNotNull() {
            addCriterion("other_loan_num is not null");
            return (Criteria) this;
        }

        public Criteria andOtherLoanNumEqualTo(String value) {
            addCriterion("other_loan_num =", value, "otherLoanNum");
            return (Criteria) this;
        }

        public Criteria andOtherLoanNumNotEqualTo(String value) {
            addCriterion("other_loan_num <>", value, "otherLoanNum");
            return (Criteria) this;
        }

        public Criteria andOtherLoanNumGreaterThan(String value) {
            addCriterion("other_loan_num >", value, "otherLoanNum");
            return (Criteria) this;
        }

        public Criteria andOtherLoanNumGreaterThanOrEqualTo(String value) {
            addCriterion("other_loan_num >=", value, "otherLoanNum");
            return (Criteria) this;
        }

        public Criteria andOtherLoanNumLessThan(String value) {
            addCriterion("other_loan_num <", value, "otherLoanNum");
            return (Criteria) this;
        }

        public Criteria andOtherLoanNumLessThanOrEqualTo(String value) {
            addCriterion("other_loan_num <=", value, "otherLoanNum");
            return (Criteria) this;
        }

        public Criteria andOtherLoanNumLike(String value) {
            addCriterion("other_loan_num like", value, "otherLoanNum");
            return (Criteria) this;
        }

        public Criteria andOtherLoanNumNotLike(String value) {
            addCriterion("other_loan_num not like", value, "otherLoanNum");
            return (Criteria) this;
        }

        public Criteria andOtherLoanNumIn(List<String> values) {
            addCriterion("other_loan_num in", values, "otherLoanNum");
            return (Criteria) this;
        }

        public Criteria andOtherLoanNumNotIn(List<String> values) {
            addCriterion("other_loan_num not in", values, "otherLoanNum");
            return (Criteria) this;
        }

        public Criteria andOtherLoanNumBetween(String value1, String value2) {
            addCriterion("other_loan_num between", value1, value2, "otherLoanNum");
            return (Criteria) this;
        }

        public Criteria andOtherLoanNumNotBetween(String value1, String value2) {
            addCriterion("other_loan_num not between", value1, value2, "otherLoanNum");
            return (Criteria) this;
        }

        public Criteria andGuaranteeOtherNumIsNull() {
            addCriterion("guarantee_other_num is null");
            return (Criteria) this;
        }

        public Criteria andGuaranteeOtherNumIsNotNull() {
            addCriterion("guarantee_other_num is not null");
            return (Criteria) this;
        }

        public Criteria andGuaranteeOtherNumEqualTo(String value) {
            addCriterion("guarantee_other_num =", value, "guaranteeOtherNum");
            return (Criteria) this;
        }

        public Criteria andGuaranteeOtherNumNotEqualTo(String value) {
            addCriterion("guarantee_other_num <>", value, "guaranteeOtherNum");
            return (Criteria) this;
        }

        public Criteria andGuaranteeOtherNumGreaterThan(String value) {
            addCriterion("guarantee_other_num >", value, "guaranteeOtherNum");
            return (Criteria) this;
        }

        public Criteria andGuaranteeOtherNumGreaterThanOrEqualTo(String value) {
            addCriterion("guarantee_other_num >=", value, "guaranteeOtherNum");
            return (Criteria) this;
        }

        public Criteria andGuaranteeOtherNumLessThan(String value) {
            addCriterion("guarantee_other_num <", value, "guaranteeOtherNum");
            return (Criteria) this;
        }

        public Criteria andGuaranteeOtherNumLessThanOrEqualTo(String value) {
            addCriterion("guarantee_other_num <=", value, "guaranteeOtherNum");
            return (Criteria) this;
        }

        public Criteria andGuaranteeOtherNumLike(String value) {
            addCriterion("guarantee_other_num like", value, "guaranteeOtherNum");
            return (Criteria) this;
        }

        public Criteria andGuaranteeOtherNumNotLike(String value) {
            addCriterion("guarantee_other_num not like", value, "guaranteeOtherNum");
            return (Criteria) this;
        }

        public Criteria andGuaranteeOtherNumIn(List<String> values) {
            addCriterion("guarantee_other_num in", values, "guaranteeOtherNum");
            return (Criteria) this;
        }

        public Criteria andGuaranteeOtherNumNotIn(List<String> values) {
            addCriterion("guarantee_other_num not in", values, "guaranteeOtherNum");
            return (Criteria) this;
        }

        public Criteria andGuaranteeOtherNumBetween(String value1, String value2) {
            addCriterion("guarantee_other_num between", value1, value2, "guaranteeOtherNum");
            return (Criteria) this;
        }

        public Criteria andGuaranteeOtherNumNotBetween(String value1, String value2) {
            addCriterion("guarantee_other_num not between", value1, value2, "guaranteeOtherNum");
            return (Criteria) this;
        }

        public Criteria andBadLoansTotalNumIsNull() {
            addCriterion("bad_loans_total_num is null");
            return (Criteria) this;
        }

        public Criteria andBadLoansTotalNumIsNotNull() {
            addCriterion("bad_loans_total_num is not null");
            return (Criteria) this;
        }

        public Criteria andBadLoansTotalNumEqualTo(String value) {
            addCriterion("bad_loans_total_num =", value, "badLoansTotalNum");
            return (Criteria) this;
        }

        public Criteria andBadLoansTotalNumNotEqualTo(String value) {
            addCriterion("bad_loans_total_num <>", value, "badLoansTotalNum");
            return (Criteria) this;
        }

        public Criteria andBadLoansTotalNumGreaterThan(String value) {
            addCriterion("bad_loans_total_num >", value, "badLoansTotalNum");
            return (Criteria) this;
        }

        public Criteria andBadLoansTotalNumGreaterThanOrEqualTo(String value) {
            addCriterion("bad_loans_total_num >=", value, "badLoansTotalNum");
            return (Criteria) this;
        }

        public Criteria andBadLoansTotalNumLessThan(String value) {
            addCriterion("bad_loans_total_num <", value, "badLoansTotalNum");
            return (Criteria) this;
        }

        public Criteria andBadLoansTotalNumLessThanOrEqualTo(String value) {
            addCriterion("bad_loans_total_num <=", value, "badLoansTotalNum");
            return (Criteria) this;
        }

        public Criteria andBadLoansTotalNumLike(String value) {
            addCriterion("bad_loans_total_num like", value, "badLoansTotalNum");
            return (Criteria) this;
        }

        public Criteria andBadLoansTotalNumNotLike(String value) {
            addCriterion("bad_loans_total_num not like", value, "badLoansTotalNum");
            return (Criteria) this;
        }

        public Criteria andBadLoansTotalNumIn(List<String> values) {
            addCriterion("bad_loans_total_num in", values, "badLoansTotalNum");
            return (Criteria) this;
        }

        public Criteria andBadLoansTotalNumNotIn(List<String> values) {
            addCriterion("bad_loans_total_num not in", values, "badLoansTotalNum");
            return (Criteria) this;
        }

        public Criteria andBadLoansTotalNumBetween(String value1, String value2) {
            addCriterion("bad_loans_total_num between", value1, value2, "badLoansTotalNum");
            return (Criteria) this;
        }

        public Criteria andBadLoansTotalNumNotBetween(String value1, String value2) {
            addCriterion("bad_loans_total_num not between", value1, value2, "badLoansTotalNum");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanLegalpersonTotalIsNull() {
            addCriterion("uncleared_loan_legalperson_total is null");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanLegalpersonTotalIsNotNull() {
            addCriterion("uncleared_loan_legalperson_total is not null");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanLegalpersonTotalEqualTo(String value) {
            addCriterion("uncleared_loan_legalperson_total =", value, "unclearedLoanLegalpersonTotal");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanLegalpersonTotalNotEqualTo(String value) {
            addCriterion("uncleared_loan_legalperson_total <>", value, "unclearedLoanLegalpersonTotal");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanLegalpersonTotalGreaterThan(String value) {
            addCriterion("uncleared_loan_legalperson_total >", value, "unclearedLoanLegalpersonTotal");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanLegalpersonTotalGreaterThanOrEqualTo(String value) {
            addCriterion("uncleared_loan_legalperson_total >=", value, "unclearedLoanLegalpersonTotal");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanLegalpersonTotalLessThan(String value) {
            addCriterion("uncleared_loan_legalperson_total <", value, "unclearedLoanLegalpersonTotal");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanLegalpersonTotalLessThanOrEqualTo(String value) {
            addCriterion("uncleared_loan_legalperson_total <=", value, "unclearedLoanLegalpersonTotal");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanLegalpersonTotalLike(String value) {
            addCriterion("uncleared_loan_legalperson_total like", value, "unclearedLoanLegalpersonTotal");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanLegalpersonTotalNotLike(String value) {
            addCriterion("uncleared_loan_legalperson_total not like", value, "unclearedLoanLegalpersonTotal");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanLegalpersonTotalIn(List<String> values) {
            addCriterion("uncleared_loan_legalperson_total in", values, "unclearedLoanLegalpersonTotal");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanLegalpersonTotalNotIn(List<String> values) {
            addCriterion("uncleared_loan_legalperson_total not in", values, "unclearedLoanLegalpersonTotal");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanLegalpersonTotalBetween(String value1, String value2) {
            addCriterion("uncleared_loan_legalperson_total between", value1, value2, "unclearedLoanLegalpersonTotal");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanLegalpersonTotalNotBetween(String value1, String value2) {
            addCriterion("uncleared_loan_legalperson_total not between", value1, value2, "unclearedLoanLegalpersonTotal");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanBranchTotalIsNull() {
            addCriterion("uncleared_loan_branch_total is null");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanBranchTotalIsNotNull() {
            addCriterion("uncleared_loan_branch_total is not null");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanBranchTotalEqualTo(String value) {
            addCriterion("uncleared_loan_branch_total =", value, "unclearedLoanBranchTotal");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanBranchTotalNotEqualTo(String value) {
            addCriterion("uncleared_loan_branch_total <>", value, "unclearedLoanBranchTotal");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanBranchTotalGreaterThan(String value) {
            addCriterion("uncleared_loan_branch_total >", value, "unclearedLoanBranchTotal");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanBranchTotalGreaterThanOrEqualTo(String value) {
            addCriterion("uncleared_loan_branch_total >=", value, "unclearedLoanBranchTotal");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanBranchTotalLessThan(String value) {
            addCriterion("uncleared_loan_branch_total <", value, "unclearedLoanBranchTotal");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanBranchTotalLessThanOrEqualTo(String value) {
            addCriterion("uncleared_loan_branch_total <=", value, "unclearedLoanBranchTotal");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanBranchTotalLike(String value) {
            addCriterion("uncleared_loan_branch_total like", value, "unclearedLoanBranchTotal");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanBranchTotalNotLike(String value) {
            addCriterion("uncleared_loan_branch_total not like", value, "unclearedLoanBranchTotal");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanBranchTotalIn(List<String> values) {
            addCriterion("uncleared_loan_branch_total in", values, "unclearedLoanBranchTotal");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanBranchTotalNotIn(List<String> values) {
            addCriterion("uncleared_loan_branch_total not in", values, "unclearedLoanBranchTotal");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanBranchTotalBetween(String value1, String value2) {
            addCriterion("uncleared_loan_branch_total between", value1, value2, "unclearedLoanBranchTotal");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanBranchTotalNotBetween(String value1, String value2) {
            addCriterion("uncleared_loan_branch_total not between", value1, value2, "unclearedLoanBranchTotal");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanNumTotalIsNull() {
            addCriterion("uncleared_loan_num_total is null");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanNumTotalIsNotNull() {
            addCriterion("uncleared_loan_num_total is not null");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanNumTotalEqualTo(String value) {
            addCriterion("uncleared_loan_num_total =", value, "unclearedLoanNumTotal");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanNumTotalNotEqualTo(String value) {
            addCriterion("uncleared_loan_num_total <>", value, "unclearedLoanNumTotal");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanNumTotalGreaterThan(String value) {
            addCriterion("uncleared_loan_num_total >", value, "unclearedLoanNumTotal");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanNumTotalGreaterThanOrEqualTo(String value) {
            addCriterion("uncleared_loan_num_total >=", value, "unclearedLoanNumTotal");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanNumTotalLessThan(String value) {
            addCriterion("uncleared_loan_num_total <", value, "unclearedLoanNumTotal");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanNumTotalLessThanOrEqualTo(String value) {
            addCriterion("uncleared_loan_num_total <=", value, "unclearedLoanNumTotal");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanNumTotalLike(String value) {
            addCriterion("uncleared_loan_num_total like", value, "unclearedLoanNumTotal");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanNumTotalNotLike(String value) {
            addCriterion("uncleared_loan_num_total not like", value, "unclearedLoanNumTotal");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanNumTotalIn(List<String> values) {
            addCriterion("uncleared_loan_num_total in", values, "unclearedLoanNumTotal");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanNumTotalNotIn(List<String> values) {
            addCriterion("uncleared_loan_num_total not in", values, "unclearedLoanNumTotal");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanNumTotalBetween(String value1, String value2) {
            addCriterion("uncleared_loan_num_total between", value1, value2, "unclearedLoanNumTotal");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanNumTotalNotBetween(String value1, String value2) {
            addCriterion("uncleared_loan_num_total not between", value1, value2, "unclearedLoanNumTotal");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanSignlamountTotalIsNull() {
            addCriterion("uncleared_loan_signlamount_total is null");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanSignlamountTotalIsNotNull() {
            addCriterion("uncleared_loan_signlamount_total is not null");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanSignlamountTotalEqualTo(String value) {
            addCriterion("uncleared_loan_signlamount_total =", value, "unclearedLoanSignlamountTotal");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanSignlamountTotalNotEqualTo(String value) {
            addCriterion("uncleared_loan_signlamount_total <>", value, "unclearedLoanSignlamountTotal");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanSignlamountTotalGreaterThan(String value) {
            addCriterion("uncleared_loan_signlamount_total >", value, "unclearedLoanSignlamountTotal");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanSignlamountTotalGreaterThanOrEqualTo(String value) {
            addCriterion("uncleared_loan_signlamount_total >=", value, "unclearedLoanSignlamountTotal");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanSignlamountTotalLessThan(String value) {
            addCriterion("uncleared_loan_signlamount_total <", value, "unclearedLoanSignlamountTotal");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanSignlamountTotalLessThanOrEqualTo(String value) {
            addCriterion("uncleared_loan_signlamount_total <=", value, "unclearedLoanSignlamountTotal");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanSignlamountTotalLike(String value) {
            addCriterion("uncleared_loan_signlamount_total like", value, "unclearedLoanSignlamountTotal");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanSignlamountTotalNotLike(String value) {
            addCriterion("uncleared_loan_signlamount_total not like", value, "unclearedLoanSignlamountTotal");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanSignlamountTotalIn(List<String> values) {
            addCriterion("uncleared_loan_signlamount_total in", values, "unclearedLoanSignlamountTotal");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanSignlamountTotalNotIn(List<String> values) {
            addCriterion("uncleared_loan_signlamount_total not in", values, "unclearedLoanSignlamountTotal");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanSignlamountTotalBetween(String value1, String value2) {
            addCriterion("uncleared_loan_signlamount_total between", value1, value2, "unclearedLoanSignlamountTotal");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanSignlamountTotalNotBetween(String value1, String value2) {
            addCriterion("uncleared_loan_signlamount_total not between", value1, value2, "unclearedLoanSignlamountTotal");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanLeftamountTotalIsNull() {
            addCriterion("uncleared_loan_leftamount_total is null");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanLeftamountTotalIsNotNull() {
            addCriterion("uncleared_loan_leftamount_total is not null");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanLeftamountTotalEqualTo(String value) {
            addCriterion("uncleared_loan_leftamount_total =", value, "unclearedLoanLeftamountTotal");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanLeftamountTotalNotEqualTo(String value) {
            addCriterion("uncleared_loan_leftamount_total <>", value, "unclearedLoanLeftamountTotal");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanLeftamountTotalGreaterThan(String value) {
            addCriterion("uncleared_loan_leftamount_total >", value, "unclearedLoanLeftamountTotal");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanLeftamountTotalGreaterThanOrEqualTo(String value) {
            addCriterion("uncleared_loan_leftamount_total >=", value, "unclearedLoanLeftamountTotal");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanLeftamountTotalLessThan(String value) {
            addCriterion("uncleared_loan_leftamount_total <", value, "unclearedLoanLeftamountTotal");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanLeftamountTotalLessThanOrEqualTo(String value) {
            addCriterion("uncleared_loan_leftamount_total <=", value, "unclearedLoanLeftamountTotal");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanLeftamountTotalLike(String value) {
            addCriterion("uncleared_loan_leftamount_total like", value, "unclearedLoanLeftamountTotal");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanLeftamountTotalNotLike(String value) {
            addCriterion("uncleared_loan_leftamount_total not like", value, "unclearedLoanLeftamountTotal");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanLeftamountTotalIn(List<String> values) {
            addCriterion("uncleared_loan_leftamount_total in", values, "unclearedLoanLeftamountTotal");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanLeftamountTotalNotIn(List<String> values) {
            addCriterion("uncleared_loan_leftamount_total not in", values, "unclearedLoanLeftamountTotal");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanLeftamountTotalBetween(String value1, String value2) {
            addCriterion("uncleared_loan_leftamount_total between", value1, value2, "unclearedLoanLeftamountTotal");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanLeftamountTotalNotBetween(String value1, String value2) {
            addCriterion("uncleared_loan_leftamount_total not between", value1, value2, "unclearedLoanLeftamountTotal");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanLast5mouthPayAvgIsNull() {
            addCriterion("uncleared_loan_last5mouth_pay_avg is null");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanLast5mouthPayAvgIsNotNull() {
            addCriterion("uncleared_loan_last5mouth_pay_avg is not null");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanLast5mouthPayAvgEqualTo(String value) {
            addCriterion("uncleared_loan_last5mouth_pay_avg =", value, "unclearedLoanLast5mouthPayAvg");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanLast5mouthPayAvgNotEqualTo(String value) {
            addCriterion("uncleared_loan_last5mouth_pay_avg <>", value, "unclearedLoanLast5mouthPayAvg");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanLast5mouthPayAvgGreaterThan(String value) {
            addCriterion("uncleared_loan_last5mouth_pay_avg >", value, "unclearedLoanLast5mouthPayAvg");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanLast5mouthPayAvgGreaterThanOrEqualTo(String value) {
            addCriterion("uncleared_loan_last5mouth_pay_avg >=", value, "unclearedLoanLast5mouthPayAvg");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanLast5mouthPayAvgLessThan(String value) {
            addCriterion("uncleared_loan_last5mouth_pay_avg <", value, "unclearedLoanLast5mouthPayAvg");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanLast5mouthPayAvgLessThanOrEqualTo(String value) {
            addCriterion("uncleared_loan_last5mouth_pay_avg <=", value, "unclearedLoanLast5mouthPayAvg");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanLast5mouthPayAvgLike(String value) {
            addCriterion("uncleared_loan_last5mouth_pay_avg like", value, "unclearedLoanLast5mouthPayAvg");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanLast5mouthPayAvgNotLike(String value) {
            addCriterion("uncleared_loan_last5mouth_pay_avg not like", value, "unclearedLoanLast5mouthPayAvg");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanLast5mouthPayAvgIn(List<String> values) {
            addCriterion("uncleared_loan_last5mouth_pay_avg in", values, "unclearedLoanLast5mouthPayAvg");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanLast5mouthPayAvgNotIn(List<String> values) {
            addCriterion("uncleared_loan_last5mouth_pay_avg not in", values, "unclearedLoanLast5mouthPayAvg");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanLast5mouthPayAvgBetween(String value1, String value2) {
            addCriterion("uncleared_loan_last5mouth_pay_avg between", value1, value2, "unclearedLoanLast5mouthPayAvg");
            return (Criteria) this;
        }

        public Criteria andUnclearedLoanLast5mouthPayAvgNotBetween(String value1, String value2) {
            addCriterion("uncleared_loan_last5mouth_pay_avg not between", value1, value2, "unclearedLoanLast5mouthPayAvg");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditLegalpersonTotalIsNull() {
            addCriterion("no_cancellation_credit_legalperson_total is null");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditLegalpersonTotalIsNotNull() {
            addCriterion("no_cancellation_credit_legalperson_total is not null");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditLegalpersonTotalEqualTo(String value) {
            addCriterion("no_cancellation_credit_legalperson_total =", value, "noCancellationCreditLegalpersonTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditLegalpersonTotalNotEqualTo(String value) {
            addCriterion("no_cancellation_credit_legalperson_total <>", value, "noCancellationCreditLegalpersonTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditLegalpersonTotalGreaterThan(String value) {
            addCriterion("no_cancellation_credit_legalperson_total >", value, "noCancellationCreditLegalpersonTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditLegalpersonTotalGreaterThanOrEqualTo(String value) {
            addCriterion("no_cancellation_credit_legalperson_total >=", value, "noCancellationCreditLegalpersonTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditLegalpersonTotalLessThan(String value) {
            addCriterion("no_cancellation_credit_legalperson_total <", value, "noCancellationCreditLegalpersonTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditLegalpersonTotalLessThanOrEqualTo(String value) {
            addCriterion("no_cancellation_credit_legalperson_total <=", value, "noCancellationCreditLegalpersonTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditLegalpersonTotalLike(String value) {
            addCriterion("no_cancellation_credit_legalperson_total like", value, "noCancellationCreditLegalpersonTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditLegalpersonTotalNotLike(String value) {
            addCriterion("no_cancellation_credit_legalperson_total not like", value, "noCancellationCreditLegalpersonTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditLegalpersonTotalIn(List<String> values) {
            addCriterion("no_cancellation_credit_legalperson_total in", values, "noCancellationCreditLegalpersonTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditLegalpersonTotalNotIn(List<String> values) {
            addCriterion("no_cancellation_credit_legalperson_total not in", values, "noCancellationCreditLegalpersonTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditLegalpersonTotalBetween(String value1, String value2) {
            addCriterion("no_cancellation_credit_legalperson_total between", value1, value2, "noCancellationCreditLegalpersonTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditLegalpersonTotalNotBetween(String value1, String value2) {
            addCriterion("no_cancellation_credit_legalperson_total not between", value1, value2, "noCancellationCreditLegalpersonTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditBranchTotalIsNull() {
            addCriterion("no_cancellation_credit_branch_total is null");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditBranchTotalIsNotNull() {
            addCriterion("no_cancellation_credit_branch_total is not null");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditBranchTotalEqualTo(String value) {
            addCriterion("no_cancellation_credit_branch_total =", value, "noCancellationCreditBranchTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditBranchTotalNotEqualTo(String value) {
            addCriterion("no_cancellation_credit_branch_total <>", value, "noCancellationCreditBranchTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditBranchTotalGreaterThan(String value) {
            addCriterion("no_cancellation_credit_branch_total >", value, "noCancellationCreditBranchTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditBranchTotalGreaterThanOrEqualTo(String value) {
            addCriterion("no_cancellation_credit_branch_total >=", value, "noCancellationCreditBranchTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditBranchTotalLessThan(String value) {
            addCriterion("no_cancellation_credit_branch_total <", value, "noCancellationCreditBranchTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditBranchTotalLessThanOrEqualTo(String value) {
            addCriterion("no_cancellation_credit_branch_total <=", value, "noCancellationCreditBranchTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditBranchTotalLike(String value) {
            addCriterion("no_cancellation_credit_branch_total like", value, "noCancellationCreditBranchTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditBranchTotalNotLike(String value) {
            addCriterion("no_cancellation_credit_branch_total not like", value, "noCancellationCreditBranchTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditBranchTotalIn(List<String> values) {
            addCriterion("no_cancellation_credit_branch_total in", values, "noCancellationCreditBranchTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditBranchTotalNotIn(List<String> values) {
            addCriterion("no_cancellation_credit_branch_total not in", values, "noCancellationCreditBranchTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditBranchTotalBetween(String value1, String value2) {
            addCriterion("no_cancellation_credit_branch_total between", value1, value2, "noCancellationCreditBranchTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditBranchTotalNotBetween(String value1, String value2) {
            addCriterion("no_cancellation_credit_branch_total not between", value1, value2, "noCancellationCreditBranchTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditAccountTotalIsNull() {
            addCriterion("no_cancellation_credit_account_total is null");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditAccountTotalIsNotNull() {
            addCriterion("no_cancellation_credit_account_total is not null");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditAccountTotalEqualTo(String value) {
            addCriterion("no_cancellation_credit_account_total =", value, "noCancellationCreditAccountTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditAccountTotalNotEqualTo(String value) {
            addCriterion("no_cancellation_credit_account_total <>", value, "noCancellationCreditAccountTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditAccountTotalGreaterThan(String value) {
            addCriterion("no_cancellation_credit_account_total >", value, "noCancellationCreditAccountTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditAccountTotalGreaterThanOrEqualTo(String value) {
            addCriterion("no_cancellation_credit_account_total >=", value, "noCancellationCreditAccountTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditAccountTotalLessThan(String value) {
            addCriterion("no_cancellation_credit_account_total <", value, "noCancellationCreditAccountTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditAccountTotalLessThanOrEqualTo(String value) {
            addCriterion("no_cancellation_credit_account_total <=", value, "noCancellationCreditAccountTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditAccountTotalLike(String value) {
            addCriterion("no_cancellation_credit_account_total like", value, "noCancellationCreditAccountTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditAccountTotalNotLike(String value) {
            addCriterion("no_cancellation_credit_account_total not like", value, "noCancellationCreditAccountTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditAccountTotalIn(List<String> values) {
            addCriterion("no_cancellation_credit_account_total in", values, "noCancellationCreditAccountTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditAccountTotalNotIn(List<String> values) {
            addCriterion("no_cancellation_credit_account_total not in", values, "noCancellationCreditAccountTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditAccountTotalBetween(String value1, String value2) {
            addCriterion("no_cancellation_credit_account_total between", value1, value2, "noCancellationCreditAccountTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditAccountTotalNotBetween(String value1, String value2) {
            addCriterion("no_cancellation_credit_account_total not between", value1, value2, "noCancellationCreditAccountTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditAmountTotalIsNull() {
            addCriterion("no_cancellation_credit_amount_total is null");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditAmountTotalIsNotNull() {
            addCriterion("no_cancellation_credit_amount_total is not null");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditAmountTotalEqualTo(String value) {
            addCriterion("no_cancellation_credit_amount_total =", value, "noCancellationCreditAmountTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditAmountTotalNotEqualTo(String value) {
            addCriterion("no_cancellation_credit_amount_total <>", value, "noCancellationCreditAmountTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditAmountTotalGreaterThan(String value) {
            addCriterion("no_cancellation_credit_amount_total >", value, "noCancellationCreditAmountTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditAmountTotalGreaterThanOrEqualTo(String value) {
            addCriterion("no_cancellation_credit_amount_total >=", value, "noCancellationCreditAmountTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditAmountTotalLessThan(String value) {
            addCriterion("no_cancellation_credit_amount_total <", value, "noCancellationCreditAmountTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditAmountTotalLessThanOrEqualTo(String value) {
            addCriterion("no_cancellation_credit_amount_total <=", value, "noCancellationCreditAmountTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditAmountTotalLike(String value) {
            addCriterion("no_cancellation_credit_amount_total like", value, "noCancellationCreditAmountTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditAmountTotalNotLike(String value) {
            addCriterion("no_cancellation_credit_amount_total not like", value, "noCancellationCreditAmountTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditAmountTotalIn(List<String> values) {
            addCriterion("no_cancellation_credit_amount_total in", values, "noCancellationCreditAmountTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditAmountTotalNotIn(List<String> values) {
            addCriterion("no_cancellation_credit_amount_total not in", values, "noCancellationCreditAmountTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditAmountTotalBetween(String value1, String value2) {
            addCriterion("no_cancellation_credit_amount_total between", value1, value2, "noCancellationCreditAmountTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditAmountTotalNotBetween(String value1, String value2) {
            addCriterion("no_cancellation_credit_amount_total not between", value1, value2, "noCancellationCreditAmountTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditSingleMaxAmountTotalIsNull() {
            addCriterion("no_cancellation_credit_single_max_amount_total is null");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditSingleMaxAmountTotalIsNotNull() {
            addCriterion("no_cancellation_credit_single_max_amount_total is not null");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditSingleMaxAmountTotalEqualTo(String value) {
            addCriterion("no_cancellation_credit_single_max_amount_total =", value, "noCancellationCreditSingleMaxAmountTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditSingleMaxAmountTotalNotEqualTo(String value) {
            addCriterion("no_cancellation_credit_single_max_amount_total <>", value, "noCancellationCreditSingleMaxAmountTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditSingleMaxAmountTotalGreaterThan(String value) {
            addCriterion("no_cancellation_credit_single_max_amount_total >", value, "noCancellationCreditSingleMaxAmountTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditSingleMaxAmountTotalGreaterThanOrEqualTo(String value) {
            addCriterion("no_cancellation_credit_single_max_amount_total >=", value, "noCancellationCreditSingleMaxAmountTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditSingleMaxAmountTotalLessThan(String value) {
            addCriterion("no_cancellation_credit_single_max_amount_total <", value, "noCancellationCreditSingleMaxAmountTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditSingleMaxAmountTotalLessThanOrEqualTo(String value) {
            addCriterion("no_cancellation_credit_single_max_amount_total <=", value, "noCancellationCreditSingleMaxAmountTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditSingleMaxAmountTotalLike(String value) {
            addCriterion("no_cancellation_credit_single_max_amount_total like", value, "noCancellationCreditSingleMaxAmountTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditSingleMaxAmountTotalNotLike(String value) {
            addCriterion("no_cancellation_credit_single_max_amount_total not like", value, "noCancellationCreditSingleMaxAmountTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditSingleMaxAmountTotalIn(List<String> values) {
            addCriterion("no_cancellation_credit_single_max_amount_total in", values, "noCancellationCreditSingleMaxAmountTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditSingleMaxAmountTotalNotIn(List<String> values) {
            addCriterion("no_cancellation_credit_single_max_amount_total not in", values, "noCancellationCreditSingleMaxAmountTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditSingleMaxAmountTotalBetween(String value1, String value2) {
            addCriterion("no_cancellation_credit_single_max_amount_total between", value1, value2, "noCancellationCreditSingleMaxAmountTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditSingleMaxAmountTotalNotBetween(String value1, String value2) {
            addCriterion("no_cancellation_credit_single_max_amount_total not between", value1, value2, "noCancellationCreditSingleMaxAmountTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditSingleMinAmountTotalIsNull() {
            addCriterion("no_cancellation_credit_single_min_amount_total is null");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditSingleMinAmountTotalIsNotNull() {
            addCriterion("no_cancellation_credit_single_min_amount_total is not null");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditSingleMinAmountTotalEqualTo(String value) {
            addCriterion("no_cancellation_credit_single_min_amount_total =", value, "noCancellationCreditSingleMinAmountTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditSingleMinAmountTotalNotEqualTo(String value) {
            addCriterion("no_cancellation_credit_single_min_amount_total <>", value, "noCancellationCreditSingleMinAmountTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditSingleMinAmountTotalGreaterThan(String value) {
            addCriterion("no_cancellation_credit_single_min_amount_total >", value, "noCancellationCreditSingleMinAmountTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditSingleMinAmountTotalGreaterThanOrEqualTo(String value) {
            addCriterion("no_cancellation_credit_single_min_amount_total >=", value, "noCancellationCreditSingleMinAmountTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditSingleMinAmountTotalLessThan(String value) {
            addCriterion("no_cancellation_credit_single_min_amount_total <", value, "noCancellationCreditSingleMinAmountTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditSingleMinAmountTotalLessThanOrEqualTo(String value) {
            addCriterion("no_cancellation_credit_single_min_amount_total <=", value, "noCancellationCreditSingleMinAmountTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditSingleMinAmountTotalLike(String value) {
            addCriterion("no_cancellation_credit_single_min_amount_total like", value, "noCancellationCreditSingleMinAmountTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditSingleMinAmountTotalNotLike(String value) {
            addCriterion("no_cancellation_credit_single_min_amount_total not like", value, "noCancellationCreditSingleMinAmountTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditSingleMinAmountTotalIn(List<String> values) {
            addCriterion("no_cancellation_credit_single_min_amount_total in", values, "noCancellationCreditSingleMinAmountTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditSingleMinAmountTotalNotIn(List<String> values) {
            addCriterion("no_cancellation_credit_single_min_amount_total not in", values, "noCancellationCreditSingleMinAmountTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditSingleMinAmountTotalBetween(String value1, String value2) {
            addCriterion("no_cancellation_credit_single_min_amount_total between", value1, value2, "noCancellationCreditSingleMinAmountTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditSingleMinAmountTotalNotBetween(String value1, String value2) {
            addCriterion("no_cancellation_credit_single_min_amount_total not between", value1, value2, "noCancellationCreditSingleMinAmountTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditUsedAmountTotalIsNull() {
            addCriterion("no_cancellation_credit_used_amount_total is null");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditUsedAmountTotalIsNotNull() {
            addCriterion("no_cancellation_credit_used_amount_total is not null");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditUsedAmountTotalEqualTo(String value) {
            addCriterion("no_cancellation_credit_used_amount_total =", value, "noCancellationCreditUsedAmountTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditUsedAmountTotalNotEqualTo(String value) {
            addCriterion("no_cancellation_credit_used_amount_total <>", value, "noCancellationCreditUsedAmountTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditUsedAmountTotalGreaterThan(String value) {
            addCriterion("no_cancellation_credit_used_amount_total >", value, "noCancellationCreditUsedAmountTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditUsedAmountTotalGreaterThanOrEqualTo(String value) {
            addCriterion("no_cancellation_credit_used_amount_total >=", value, "noCancellationCreditUsedAmountTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditUsedAmountTotalLessThan(String value) {
            addCriterion("no_cancellation_credit_used_amount_total <", value, "noCancellationCreditUsedAmountTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditUsedAmountTotalLessThanOrEqualTo(String value) {
            addCriterion("no_cancellation_credit_used_amount_total <=", value, "noCancellationCreditUsedAmountTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditUsedAmountTotalLike(String value) {
            addCriterion("no_cancellation_credit_used_amount_total like", value, "noCancellationCreditUsedAmountTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditUsedAmountTotalNotLike(String value) {
            addCriterion("no_cancellation_credit_used_amount_total not like", value, "noCancellationCreditUsedAmountTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditUsedAmountTotalIn(List<String> values) {
            addCriterion("no_cancellation_credit_used_amount_total in", values, "noCancellationCreditUsedAmountTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditUsedAmountTotalNotIn(List<String> values) {
            addCriterion("no_cancellation_credit_used_amount_total not in", values, "noCancellationCreditUsedAmountTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditUsedAmountTotalBetween(String value1, String value2) {
            addCriterion("no_cancellation_credit_used_amount_total between", value1, value2, "noCancellationCreditUsedAmountTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditUsedAmountTotalNotBetween(String value1, String value2) {
            addCriterion("no_cancellation_credit_used_amount_total not between", value1, value2, "noCancellationCreditUsedAmountTotal");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditLast6mouthPayAvgIsNull() {
            addCriterion("no_cancellation_credit_last6mouth_pay_avg is null");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditLast6mouthPayAvgIsNotNull() {
            addCriterion("no_cancellation_credit_last6mouth_pay_avg is not null");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditLast6mouthPayAvgEqualTo(String value) {
            addCriterion("no_cancellation_credit_last6mouth_pay_avg =", value, "noCancellationCreditLast6mouthPayAvg");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditLast6mouthPayAvgNotEqualTo(String value) {
            addCriterion("no_cancellation_credit_last6mouth_pay_avg <>", value, "noCancellationCreditLast6mouthPayAvg");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditLast6mouthPayAvgGreaterThan(String value) {
            addCriterion("no_cancellation_credit_last6mouth_pay_avg >", value, "noCancellationCreditLast6mouthPayAvg");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditLast6mouthPayAvgGreaterThanOrEqualTo(String value) {
            addCriterion("no_cancellation_credit_last6mouth_pay_avg >=", value, "noCancellationCreditLast6mouthPayAvg");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditLast6mouthPayAvgLessThan(String value) {
            addCriterion("no_cancellation_credit_last6mouth_pay_avg <", value, "noCancellationCreditLast6mouthPayAvg");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditLast6mouthPayAvgLessThanOrEqualTo(String value) {
            addCriterion("no_cancellation_credit_last6mouth_pay_avg <=", value, "noCancellationCreditLast6mouthPayAvg");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditLast6mouthPayAvgLike(String value) {
            addCriterion("no_cancellation_credit_last6mouth_pay_avg like", value, "noCancellationCreditLast6mouthPayAvg");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditLast6mouthPayAvgNotLike(String value) {
            addCriterion("no_cancellation_credit_last6mouth_pay_avg not like", value, "noCancellationCreditLast6mouthPayAvg");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditLast6mouthPayAvgIn(List<String> values) {
            addCriterion("no_cancellation_credit_last6mouth_pay_avg in", values, "noCancellationCreditLast6mouthPayAvg");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditLast6mouthPayAvgNotIn(List<String> values) {
            addCriterion("no_cancellation_credit_last6mouth_pay_avg not in", values, "noCancellationCreditLast6mouthPayAvg");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditLast6mouthPayAvgBetween(String value1, String value2) {
            addCriterion("no_cancellation_credit_last6mouth_pay_avg between", value1, value2, "noCancellationCreditLast6mouthPayAvg");
            return (Criteria) this;
        }

        public Criteria andNoCancellationCreditLast6mouthPayAvgNotBetween(String value1, String value2) {
            addCriterion("no_cancellation_credit_last6mouth_pay_avg not between", value1, value2, "noCancellationCreditLast6mouthPayAvg");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(String value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(String value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(String value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(String value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(String value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(String value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLike(String value) {
            addCriterion("flag like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotLike(String value) {
            addCriterion("flag not like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<String> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<String> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(String value1, String value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(String value1, String value2) {
            addCriterion("flag not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Integer value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Integer value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Integer value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Integer value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Integer value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Integer> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Integer> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Integer value1, Integer value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("created_by is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("created_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(String value) {
            addCriterion("created_by =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(String value) {
            addCriterion("created_by <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(String value) {
            addCriterion("created_by >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(String value) {
            addCriterion("created_by >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(String value) {
            addCriterion("created_by <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(String value) {
            addCriterion("created_by <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLike(String value) {
            addCriterion("created_by like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotLike(String value) {
            addCriterion("created_by not like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<String> values) {
            addCriterion("created_by in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<String> values) {
            addCriterion("created_by not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(String value1, String value2) {
            addCriterion("created_by between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(String value1, String value2) {
            addCriterion("created_by not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedDtIsNull() {
            addCriterion("created_dt is null");
            return (Criteria) this;
        }

        public Criteria andCreatedDtIsNotNull() {
            addCriterion("created_dt is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedDtEqualTo(Date value) {
            addCriterion("created_dt =", value, "createdDt");
            return (Criteria) this;
        }

        public Criteria andCreatedDtNotEqualTo(Date value) {
            addCriterion("created_dt <>", value, "createdDt");
            return (Criteria) this;
        }

        public Criteria andCreatedDtGreaterThan(Date value) {
            addCriterion("created_dt >", value, "createdDt");
            return (Criteria) this;
        }

        public Criteria andCreatedDtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_dt >=", value, "createdDt");
            return (Criteria) this;
        }

        public Criteria andCreatedDtLessThan(Date value) {
            addCriterion("created_dt <", value, "createdDt");
            return (Criteria) this;
        }

        public Criteria andCreatedDtLessThanOrEqualTo(Date value) {
            addCriterion("created_dt <=", value, "createdDt");
            return (Criteria) this;
        }

        public Criteria andCreatedDtIn(List<Date> values) {
            addCriterion("created_dt in", values, "createdDt");
            return (Criteria) this;
        }

        public Criteria andCreatedDtNotIn(List<Date> values) {
            addCriterion("created_dt not in", values, "createdDt");
            return (Criteria) this;
        }

        public Criteria andCreatedDtBetween(Date value1, Date value2) {
            addCriterion("created_dt between", value1, value2, "createdDt");
            return (Criteria) this;
        }

        public Criteria andCreatedDtNotBetween(Date value1, Date value2) {
            addCriterion("created_dt not between", value1, value2, "createdDt");
            return (Criteria) this;
        }

        public Criteria andUpdatetimedByIsNull() {
            addCriterion("updatetimed_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimedByIsNotNull() {
            addCriterion("updatetimed_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimedByEqualTo(String value) {
            addCriterion("updatetimed_by =", value, "updatetimedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatetimedByNotEqualTo(String value) {
            addCriterion("updatetimed_by <>", value, "updatetimedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatetimedByGreaterThan(String value) {
            addCriterion("updatetimed_by >", value, "updatetimedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatetimedByGreaterThanOrEqualTo(String value) {
            addCriterion("updatetimed_by >=", value, "updatetimedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatetimedByLessThan(String value) {
            addCriterion("updatetimed_by <", value, "updatetimedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatetimedByLessThanOrEqualTo(String value) {
            addCriterion("updatetimed_by <=", value, "updatetimedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatetimedByLike(String value) {
            addCriterion("updatetimed_by like", value, "updatetimedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatetimedByNotLike(String value) {
            addCriterion("updatetimed_by not like", value, "updatetimedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatetimedByIn(List<String> values) {
            addCriterion("updatetimed_by in", values, "updatetimedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatetimedByNotIn(List<String> values) {
            addCriterion("updatetimed_by not in", values, "updatetimedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatetimedByBetween(String value1, String value2) {
            addCriterion("updatetimed_by between", value1, value2, "updatetimedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatetimedByNotBetween(String value1, String value2) {
            addCriterion("updatetimed_by not between", value1, value2, "updatetimedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatetimedDtIsNull() {
            addCriterion("updatetimed_dt is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimedDtIsNotNull() {
            addCriterion("updatetimed_dt is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimedDtEqualTo(Date value) {
            addCriterion("updatetimed_dt =", value, "updatetimedDt");
            return (Criteria) this;
        }

        public Criteria andUpdatetimedDtNotEqualTo(Date value) {
            addCriterion("updatetimed_dt <>", value, "updatetimedDt");
            return (Criteria) this;
        }

        public Criteria andUpdatetimedDtGreaterThan(Date value) {
            addCriterion("updatetimed_dt >", value, "updatetimedDt");
            return (Criteria) this;
        }

        public Criteria andUpdatetimedDtGreaterThanOrEqualTo(Date value) {
            addCriterion("updatetimed_dt >=", value, "updatetimedDt");
            return (Criteria) this;
        }

        public Criteria andUpdatetimedDtLessThan(Date value) {
            addCriterion("updatetimed_dt <", value, "updatetimedDt");
            return (Criteria) this;
        }

        public Criteria andUpdatetimedDtLessThanOrEqualTo(Date value) {
            addCriterion("updatetimed_dt <=", value, "updatetimedDt");
            return (Criteria) this;
        }

        public Criteria andUpdatetimedDtIn(List<Date> values) {
            addCriterion("updatetimed_dt in", values, "updatetimedDt");
            return (Criteria) this;
        }

        public Criteria andUpdatetimedDtNotIn(List<Date> values) {
            addCriterion("updatetimed_dt not in", values, "updatetimedDt");
            return (Criteria) this;
        }

        public Criteria andUpdatetimedDtBetween(Date value1, Date value2) {
            addCriterion("updatetimed_dt between", value1, value2, "updatetimedDt");
            return (Criteria) this;
        }

        public Criteria andUpdatetimedDtNotBetween(Date value1, Date value2) {
            addCriterion("updatetimed_dt not between", value1, value2, "updatetimedDt");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}