package com.fosun.data.dataTask.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataCreditBriefOutlineInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DataCreditBriefOutlineInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected DataCreditBriefOutlineInfoExample(DataCreditBriefOutlineInfoExample example) {
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

        public Criteria andCreditReportTypeIsNull() {
            addCriterion("credit_report_type is null");
            return (Criteria) this;
        }

        public Criteria andCreditReportTypeIsNotNull() {
            addCriterion("credit_report_type is not null");
            return (Criteria) this;
        }

        public Criteria andCreditReportTypeEqualTo(String value) {
            addCriterion("credit_report_type =", value, "creditReportType");
            return (Criteria) this;
        }

        public Criteria andCreditReportTypeNotEqualTo(String value) {
            addCriterion("credit_report_type <>", value, "creditReportType");
            return (Criteria) this;
        }

        public Criteria andCreditReportTypeGreaterThan(String value) {
            addCriterion("credit_report_type >", value, "creditReportType");
            return (Criteria) this;
        }

        public Criteria andCreditReportTypeGreaterThanOrEqualTo(String value) {
            addCriterion("credit_report_type >=", value, "creditReportType");
            return (Criteria) this;
        }

        public Criteria andCreditReportTypeLessThan(String value) {
            addCriterion("credit_report_type <", value, "creditReportType");
            return (Criteria) this;
        }

        public Criteria andCreditReportTypeLessThanOrEqualTo(String value) {
            addCriterion("credit_report_type <=", value, "creditReportType");
            return (Criteria) this;
        }

        public Criteria andCreditReportTypeLike(String value) {
            addCriterion("credit_report_type like", value, "creditReportType");
            return (Criteria) this;
        }

        public Criteria andCreditReportTypeNotLike(String value) {
            addCriterion("credit_report_type not like", value, "creditReportType");
            return (Criteria) this;
        }

        public Criteria andCreditReportTypeIn(List<String> values) {
            addCriterion("credit_report_type in", values, "creditReportType");
            return (Criteria) this;
        }

        public Criteria andCreditReportTypeNotIn(List<String> values) {
            addCriterion("credit_report_type not in", values, "creditReportType");
            return (Criteria) this;
        }

        public Criteria andCreditReportTypeBetween(String value1, String value2) {
            addCriterion("credit_report_type between", value1, value2, "creditReportType");
            return (Criteria) this;
        }

        public Criteria andCreditReportTypeNotBetween(String value1, String value2) {
            addCriterion("credit_report_type not between", value1, value2, "creditReportType");
            return (Criteria) this;
        }

        public Criteria andOverdueAssetDisposalNumIsNull() {
            addCriterion("overdue_asset_disposal_num is null");
            return (Criteria) this;
        }

        public Criteria andOverdueAssetDisposalNumIsNotNull() {
            addCriterion("overdue_asset_disposal_num is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueAssetDisposalNumEqualTo(String value) {
            addCriterion("overdue_asset_disposal_num =", value, "overdueAssetDisposalNum");
            return (Criteria) this;
        }

        public Criteria andOverdueAssetDisposalNumNotEqualTo(String value) {
            addCriterion("overdue_asset_disposal_num <>", value, "overdueAssetDisposalNum");
            return (Criteria) this;
        }

        public Criteria andOverdueAssetDisposalNumGreaterThan(String value) {
            addCriterion("overdue_asset_disposal_num >", value, "overdueAssetDisposalNum");
            return (Criteria) this;
        }

        public Criteria andOverdueAssetDisposalNumGreaterThanOrEqualTo(String value) {
            addCriterion("overdue_asset_disposal_num >=", value, "overdueAssetDisposalNum");
            return (Criteria) this;
        }

        public Criteria andOverdueAssetDisposalNumLessThan(String value) {
            addCriterion("overdue_asset_disposal_num <", value, "overdueAssetDisposalNum");
            return (Criteria) this;
        }

        public Criteria andOverdueAssetDisposalNumLessThanOrEqualTo(String value) {
            addCriterion("overdue_asset_disposal_num <=", value, "overdueAssetDisposalNum");
            return (Criteria) this;
        }

        public Criteria andOverdueAssetDisposalNumLike(String value) {
            addCriterion("overdue_asset_disposal_num like", value, "overdueAssetDisposalNum");
            return (Criteria) this;
        }

        public Criteria andOverdueAssetDisposalNumNotLike(String value) {
            addCriterion("overdue_asset_disposal_num not like", value, "overdueAssetDisposalNum");
            return (Criteria) this;
        }

        public Criteria andOverdueAssetDisposalNumIn(List<String> values) {
            addCriterion("overdue_asset_disposal_num in", values, "overdueAssetDisposalNum");
            return (Criteria) this;
        }

        public Criteria andOverdueAssetDisposalNumNotIn(List<String> values) {
            addCriterion("overdue_asset_disposal_num not in", values, "overdueAssetDisposalNum");
            return (Criteria) this;
        }

        public Criteria andOverdueAssetDisposalNumBetween(String value1, String value2) {
            addCriterion("overdue_asset_disposal_num between", value1, value2, "overdueAssetDisposalNum");
            return (Criteria) this;
        }

        public Criteria andOverdueAssetDisposalNumNotBetween(String value1, String value2) {
            addCriterion("overdue_asset_disposal_num not between", value1, value2, "overdueAssetDisposalNum");
            return (Criteria) this;
        }

        public Criteria andOverdueAssurerNumIsNull() {
            addCriterion("overdue_assurer_num is null");
            return (Criteria) this;
        }

        public Criteria andOverdueAssurerNumIsNotNull() {
            addCriterion("overdue_assurer_num is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueAssurerNumEqualTo(String value) {
            addCriterion("overdue_assurer_num =", value, "overdueAssurerNum");
            return (Criteria) this;
        }

        public Criteria andOverdueAssurerNumNotEqualTo(String value) {
            addCriterion("overdue_assurer_num <>", value, "overdueAssurerNum");
            return (Criteria) this;
        }

        public Criteria andOverdueAssurerNumGreaterThan(String value) {
            addCriterion("overdue_assurer_num >", value, "overdueAssurerNum");
            return (Criteria) this;
        }

        public Criteria andOverdueAssurerNumGreaterThanOrEqualTo(String value) {
            addCriterion("overdue_assurer_num >=", value, "overdueAssurerNum");
            return (Criteria) this;
        }

        public Criteria andOverdueAssurerNumLessThan(String value) {
            addCriterion("overdue_assurer_num <", value, "overdueAssurerNum");
            return (Criteria) this;
        }

        public Criteria andOverdueAssurerNumLessThanOrEqualTo(String value) {
            addCriterion("overdue_assurer_num <=", value, "overdueAssurerNum");
            return (Criteria) this;
        }

        public Criteria andOverdueAssurerNumLike(String value) {
            addCriterion("overdue_assurer_num like", value, "overdueAssurerNum");
            return (Criteria) this;
        }

        public Criteria andOverdueAssurerNumNotLike(String value) {
            addCriterion("overdue_assurer_num not like", value, "overdueAssurerNum");
            return (Criteria) this;
        }

        public Criteria andOverdueAssurerNumIn(List<String> values) {
            addCriterion("overdue_assurer_num in", values, "overdueAssurerNum");
            return (Criteria) this;
        }

        public Criteria andOverdueAssurerNumNotIn(List<String> values) {
            addCriterion("overdue_assurer_num not in", values, "overdueAssurerNum");
            return (Criteria) this;
        }

        public Criteria andOverdueAssurerNumBetween(String value1, String value2) {
            addCriterion("overdue_assurer_num between", value1, value2, "overdueAssurerNum");
            return (Criteria) this;
        }

        public Criteria andOverdueAssurerNumNotBetween(String value1, String value2) {
            addCriterion("overdue_assurer_num not between", value1, value2, "overdueAssurerNum");
            return (Criteria) this;
        }

        public Criteria andCreditNumIsNull() {
            addCriterion("credit_num is null");
            return (Criteria) this;
        }

        public Criteria andCreditNumIsNotNull() {
            addCriterion("credit_num is not null");
            return (Criteria) this;
        }

        public Criteria andCreditNumEqualTo(String value) {
            addCriterion("credit_num =", value, "creditNum");
            return (Criteria) this;
        }

        public Criteria andCreditNumNotEqualTo(String value) {
            addCriterion("credit_num <>", value, "creditNum");
            return (Criteria) this;
        }

        public Criteria andCreditNumGreaterThan(String value) {
            addCriterion("credit_num >", value, "creditNum");
            return (Criteria) this;
        }

        public Criteria andCreditNumGreaterThanOrEqualTo(String value) {
            addCriterion("credit_num >=", value, "creditNum");
            return (Criteria) this;
        }

        public Criteria andCreditNumLessThan(String value) {
            addCriterion("credit_num <", value, "creditNum");
            return (Criteria) this;
        }

        public Criteria andCreditNumLessThanOrEqualTo(String value) {
            addCriterion("credit_num <=", value, "creditNum");
            return (Criteria) this;
        }

        public Criteria andCreditNumLike(String value) {
            addCriterion("credit_num like", value, "creditNum");
            return (Criteria) this;
        }

        public Criteria andCreditNumNotLike(String value) {
            addCriterion("credit_num not like", value, "creditNum");
            return (Criteria) this;
        }

        public Criteria andCreditNumIn(List<String> values) {
            addCriterion("credit_num in", values, "creditNum");
            return (Criteria) this;
        }

        public Criteria andCreditNumNotIn(List<String> values) {
            addCriterion("credit_num not in", values, "creditNum");
            return (Criteria) this;
        }

        public Criteria andCreditNumBetween(String value1, String value2) {
            addCriterion("credit_num between", value1, value2, "creditNum");
            return (Criteria) this;
        }

        public Criteria andCreditNumNotBetween(String value1, String value2) {
            addCriterion("credit_num not between", value1, value2, "creditNum");
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

        public Criteria andUnclearedCreditNumIsNull() {
            addCriterion("uncleared_credit_num is null");
            return (Criteria) this;
        }

        public Criteria andUnclearedCreditNumIsNotNull() {
            addCriterion("uncleared_credit_num is not null");
            return (Criteria) this;
        }

        public Criteria andUnclearedCreditNumEqualTo(String value) {
            addCriterion("uncleared_credit_num =", value, "unclearedCreditNum");
            return (Criteria) this;
        }

        public Criteria andUnclearedCreditNumNotEqualTo(String value) {
            addCriterion("uncleared_credit_num <>", value, "unclearedCreditNum");
            return (Criteria) this;
        }

        public Criteria andUnclearedCreditNumGreaterThan(String value) {
            addCriterion("uncleared_credit_num >", value, "unclearedCreditNum");
            return (Criteria) this;
        }

        public Criteria andUnclearedCreditNumGreaterThanOrEqualTo(String value) {
            addCriterion("uncleared_credit_num >=", value, "unclearedCreditNum");
            return (Criteria) this;
        }

        public Criteria andUnclearedCreditNumLessThan(String value) {
            addCriterion("uncleared_credit_num <", value, "unclearedCreditNum");
            return (Criteria) this;
        }

        public Criteria andUnclearedCreditNumLessThanOrEqualTo(String value) {
            addCriterion("uncleared_credit_num <=", value, "unclearedCreditNum");
            return (Criteria) this;
        }

        public Criteria andUnclearedCreditNumLike(String value) {
            addCriterion("uncleared_credit_num like", value, "unclearedCreditNum");
            return (Criteria) this;
        }

        public Criteria andUnclearedCreditNumNotLike(String value) {
            addCriterion("uncleared_credit_num not like", value, "unclearedCreditNum");
            return (Criteria) this;
        }

        public Criteria andUnclearedCreditNumIn(List<String> values) {
            addCriterion("uncleared_credit_num in", values, "unclearedCreditNum");
            return (Criteria) this;
        }

        public Criteria andUnclearedCreditNumNotIn(List<String> values) {
            addCriterion("uncleared_credit_num not in", values, "unclearedCreditNum");
            return (Criteria) this;
        }

        public Criteria andUnclearedCreditNumBetween(String value1, String value2) {
            addCriterion("uncleared_credit_num between", value1, value2, "unclearedCreditNum");
            return (Criteria) this;
        }

        public Criteria andUnclearedCreditNumNotBetween(String value1, String value2) {
            addCriterion("uncleared_credit_num not between", value1, value2, "unclearedCreditNum");
            return (Criteria) this;
        }

        public Criteria andUnclearedHouseLoanNumIsNull() {
            addCriterion("uncleared_house_loan_num is null");
            return (Criteria) this;
        }

        public Criteria andUnclearedHouseLoanNumIsNotNull() {
            addCriterion("uncleared_house_loan_num is not null");
            return (Criteria) this;
        }

        public Criteria andUnclearedHouseLoanNumEqualTo(String value) {
            addCriterion("uncleared_house_loan_num =", value, "unclearedHouseLoanNum");
            return (Criteria) this;
        }

        public Criteria andUnclearedHouseLoanNumNotEqualTo(String value) {
            addCriterion("uncleared_house_loan_num <>", value, "unclearedHouseLoanNum");
            return (Criteria) this;
        }

        public Criteria andUnclearedHouseLoanNumGreaterThan(String value) {
            addCriterion("uncleared_house_loan_num >", value, "unclearedHouseLoanNum");
            return (Criteria) this;
        }

        public Criteria andUnclearedHouseLoanNumGreaterThanOrEqualTo(String value) {
            addCriterion("uncleared_house_loan_num >=", value, "unclearedHouseLoanNum");
            return (Criteria) this;
        }

        public Criteria andUnclearedHouseLoanNumLessThan(String value) {
            addCriterion("uncleared_house_loan_num <", value, "unclearedHouseLoanNum");
            return (Criteria) this;
        }

        public Criteria andUnclearedHouseLoanNumLessThanOrEqualTo(String value) {
            addCriterion("uncleared_house_loan_num <=", value, "unclearedHouseLoanNum");
            return (Criteria) this;
        }

        public Criteria andUnclearedHouseLoanNumLike(String value) {
            addCriterion("uncleared_house_loan_num like", value, "unclearedHouseLoanNum");
            return (Criteria) this;
        }

        public Criteria andUnclearedHouseLoanNumNotLike(String value) {
            addCriterion("uncleared_house_loan_num not like", value, "unclearedHouseLoanNum");
            return (Criteria) this;
        }

        public Criteria andUnclearedHouseLoanNumIn(List<String> values) {
            addCriterion("uncleared_house_loan_num in", values, "unclearedHouseLoanNum");
            return (Criteria) this;
        }

        public Criteria andUnclearedHouseLoanNumNotIn(List<String> values) {
            addCriterion("uncleared_house_loan_num not in", values, "unclearedHouseLoanNum");
            return (Criteria) this;
        }

        public Criteria andUnclearedHouseLoanNumBetween(String value1, String value2) {
            addCriterion("uncleared_house_loan_num between", value1, value2, "unclearedHouseLoanNum");
            return (Criteria) this;
        }

        public Criteria andUnclearedHouseLoanNumNotBetween(String value1, String value2) {
            addCriterion("uncleared_house_loan_num not between", value1, value2, "unclearedHouseLoanNum");
            return (Criteria) this;
        }

        public Criteria andUnclearedOtherLoanNumIsNull() {
            addCriterion("uncleared_other_loan_num is null");
            return (Criteria) this;
        }

        public Criteria andUnclearedOtherLoanNumIsNotNull() {
            addCriterion("uncleared_other_loan_num is not null");
            return (Criteria) this;
        }

        public Criteria andUnclearedOtherLoanNumEqualTo(String value) {
            addCriterion("uncleared_other_loan_num =", value, "unclearedOtherLoanNum");
            return (Criteria) this;
        }

        public Criteria andUnclearedOtherLoanNumNotEqualTo(String value) {
            addCriterion("uncleared_other_loan_num <>", value, "unclearedOtherLoanNum");
            return (Criteria) this;
        }

        public Criteria andUnclearedOtherLoanNumGreaterThan(String value) {
            addCriterion("uncleared_other_loan_num >", value, "unclearedOtherLoanNum");
            return (Criteria) this;
        }

        public Criteria andUnclearedOtherLoanNumGreaterThanOrEqualTo(String value) {
            addCriterion("uncleared_other_loan_num >=", value, "unclearedOtherLoanNum");
            return (Criteria) this;
        }

        public Criteria andUnclearedOtherLoanNumLessThan(String value) {
            addCriterion("uncleared_other_loan_num <", value, "unclearedOtherLoanNum");
            return (Criteria) this;
        }

        public Criteria andUnclearedOtherLoanNumLessThanOrEqualTo(String value) {
            addCriterion("uncleared_other_loan_num <=", value, "unclearedOtherLoanNum");
            return (Criteria) this;
        }

        public Criteria andUnclearedOtherLoanNumLike(String value) {
            addCriterion("uncleared_other_loan_num like", value, "unclearedOtherLoanNum");
            return (Criteria) this;
        }

        public Criteria andUnclearedOtherLoanNumNotLike(String value) {
            addCriterion("uncleared_other_loan_num not like", value, "unclearedOtherLoanNum");
            return (Criteria) this;
        }

        public Criteria andUnclearedOtherLoanNumIn(List<String> values) {
            addCriterion("uncleared_other_loan_num in", values, "unclearedOtherLoanNum");
            return (Criteria) this;
        }

        public Criteria andUnclearedOtherLoanNumNotIn(List<String> values) {
            addCriterion("uncleared_other_loan_num not in", values, "unclearedOtherLoanNum");
            return (Criteria) this;
        }

        public Criteria andUnclearedOtherLoanNumBetween(String value1, String value2) {
            addCriterion("uncleared_other_loan_num between", value1, value2, "unclearedOtherLoanNum");
            return (Criteria) this;
        }

        public Criteria andUnclearedOtherLoanNumNotBetween(String value1, String value2) {
            addCriterion("uncleared_other_loan_num not between", value1, value2, "unclearedOtherLoanNum");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCreditNumIsNull() {
            addCriterion("guarantee_credit_num is null");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCreditNumIsNotNull() {
            addCriterion("guarantee_credit_num is not null");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCreditNumEqualTo(String value) {
            addCriterion("guarantee_credit_num =", value, "guaranteeCreditNum");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCreditNumNotEqualTo(String value) {
            addCriterion("guarantee_credit_num <>", value, "guaranteeCreditNum");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCreditNumGreaterThan(String value) {
            addCriterion("guarantee_credit_num >", value, "guaranteeCreditNum");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCreditNumGreaterThanOrEqualTo(String value) {
            addCriterion("guarantee_credit_num >=", value, "guaranteeCreditNum");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCreditNumLessThan(String value) {
            addCriterion("guarantee_credit_num <", value, "guaranteeCreditNum");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCreditNumLessThanOrEqualTo(String value) {
            addCriterion("guarantee_credit_num <=", value, "guaranteeCreditNum");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCreditNumLike(String value) {
            addCriterion("guarantee_credit_num like", value, "guaranteeCreditNum");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCreditNumNotLike(String value) {
            addCriterion("guarantee_credit_num not like", value, "guaranteeCreditNum");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCreditNumIn(List<String> values) {
            addCriterion("guarantee_credit_num in", values, "guaranteeCreditNum");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCreditNumNotIn(List<String> values) {
            addCriterion("guarantee_credit_num not in", values, "guaranteeCreditNum");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCreditNumBetween(String value1, String value2) {
            addCriterion("guarantee_credit_num between", value1, value2, "guaranteeCreditNum");
            return (Criteria) this;
        }

        public Criteria andGuaranteeCreditNumNotBetween(String value1, String value2) {
            addCriterion("guarantee_credit_num not between", value1, value2, "guaranteeCreditNum");
            return (Criteria) this;
        }

        public Criteria andGuaranteeHouseLoanNumIsNull() {
            addCriterion("guarantee_house_loan_num is null");
            return (Criteria) this;
        }

        public Criteria andGuaranteeHouseLoanNumIsNotNull() {
            addCriterion("guarantee_house_loan_num is not null");
            return (Criteria) this;
        }

        public Criteria andGuaranteeHouseLoanNumEqualTo(String value) {
            addCriterion("guarantee_house_loan_num =", value, "guaranteeHouseLoanNum");
            return (Criteria) this;
        }

        public Criteria andGuaranteeHouseLoanNumNotEqualTo(String value) {
            addCriterion("guarantee_house_loan_num <>", value, "guaranteeHouseLoanNum");
            return (Criteria) this;
        }

        public Criteria andGuaranteeHouseLoanNumGreaterThan(String value) {
            addCriterion("guarantee_house_loan_num >", value, "guaranteeHouseLoanNum");
            return (Criteria) this;
        }

        public Criteria andGuaranteeHouseLoanNumGreaterThanOrEqualTo(String value) {
            addCriterion("guarantee_house_loan_num >=", value, "guaranteeHouseLoanNum");
            return (Criteria) this;
        }

        public Criteria andGuaranteeHouseLoanNumLessThan(String value) {
            addCriterion("guarantee_house_loan_num <", value, "guaranteeHouseLoanNum");
            return (Criteria) this;
        }

        public Criteria andGuaranteeHouseLoanNumLessThanOrEqualTo(String value) {
            addCriterion("guarantee_house_loan_num <=", value, "guaranteeHouseLoanNum");
            return (Criteria) this;
        }

        public Criteria andGuaranteeHouseLoanNumLike(String value) {
            addCriterion("guarantee_house_loan_num like", value, "guaranteeHouseLoanNum");
            return (Criteria) this;
        }

        public Criteria andGuaranteeHouseLoanNumNotLike(String value) {
            addCriterion("guarantee_house_loan_num not like", value, "guaranteeHouseLoanNum");
            return (Criteria) this;
        }

        public Criteria andGuaranteeHouseLoanNumIn(List<String> values) {
            addCriterion("guarantee_house_loan_num in", values, "guaranteeHouseLoanNum");
            return (Criteria) this;
        }

        public Criteria andGuaranteeHouseLoanNumNotIn(List<String> values) {
            addCriterion("guarantee_house_loan_num not in", values, "guaranteeHouseLoanNum");
            return (Criteria) this;
        }

        public Criteria andGuaranteeHouseLoanNumBetween(String value1, String value2) {
            addCriterion("guarantee_house_loan_num between", value1, value2, "guaranteeHouseLoanNum");
            return (Criteria) this;
        }

        public Criteria andGuaranteeHouseLoanNumNotBetween(String value1, String value2) {
            addCriterion("guarantee_house_loan_num not between", value1, value2, "guaranteeHouseLoanNum");
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

        public Criteria andOverdueCreditNumIsNull() {
            addCriterion("overdue_credit_num is null");
            return (Criteria) this;
        }

        public Criteria andOverdueCreditNumIsNotNull() {
            addCriterion("overdue_credit_num is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueCreditNumEqualTo(String value) {
            addCriterion("overdue_credit_num =", value, "overdueCreditNum");
            return (Criteria) this;
        }

        public Criteria andOverdueCreditNumNotEqualTo(String value) {
            addCriterion("overdue_credit_num <>", value, "overdueCreditNum");
            return (Criteria) this;
        }

        public Criteria andOverdueCreditNumGreaterThan(String value) {
            addCriterion("overdue_credit_num >", value, "overdueCreditNum");
            return (Criteria) this;
        }

        public Criteria andOverdueCreditNumGreaterThanOrEqualTo(String value) {
            addCriterion("overdue_credit_num >=", value, "overdueCreditNum");
            return (Criteria) this;
        }

        public Criteria andOverdueCreditNumLessThan(String value) {
            addCriterion("overdue_credit_num <", value, "overdueCreditNum");
            return (Criteria) this;
        }

        public Criteria andOverdueCreditNumLessThanOrEqualTo(String value) {
            addCriterion("overdue_credit_num <=", value, "overdueCreditNum");
            return (Criteria) this;
        }

        public Criteria andOverdueCreditNumLike(String value) {
            addCriterion("overdue_credit_num like", value, "overdueCreditNum");
            return (Criteria) this;
        }

        public Criteria andOverdueCreditNumNotLike(String value) {
            addCriterion("overdue_credit_num not like", value, "overdueCreditNum");
            return (Criteria) this;
        }

        public Criteria andOverdueCreditNumIn(List<String> values) {
            addCriterion("overdue_credit_num in", values, "overdueCreditNum");
            return (Criteria) this;
        }

        public Criteria andOverdueCreditNumNotIn(List<String> values) {
            addCriterion("overdue_credit_num not in", values, "overdueCreditNum");
            return (Criteria) this;
        }

        public Criteria andOverdueCreditNumBetween(String value1, String value2) {
            addCriterion("overdue_credit_num between", value1, value2, "overdueCreditNum");
            return (Criteria) this;
        }

        public Criteria andOverdueCreditNumNotBetween(String value1, String value2) {
            addCriterion("overdue_credit_num not between", value1, value2, "overdueCreditNum");
            return (Criteria) this;
        }

        public Criteria andOverdueHouseLoanNumIsNull() {
            addCriterion("overdue_house_loan_num is null");
            return (Criteria) this;
        }

        public Criteria andOverdueHouseLoanNumIsNotNull() {
            addCriterion("overdue_house_loan_num is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueHouseLoanNumEqualTo(String value) {
            addCriterion("overdue_house_loan_num =", value, "overdueHouseLoanNum");
            return (Criteria) this;
        }

        public Criteria andOverdueHouseLoanNumNotEqualTo(String value) {
            addCriterion("overdue_house_loan_num <>", value, "overdueHouseLoanNum");
            return (Criteria) this;
        }

        public Criteria andOverdueHouseLoanNumGreaterThan(String value) {
            addCriterion("overdue_house_loan_num >", value, "overdueHouseLoanNum");
            return (Criteria) this;
        }

        public Criteria andOverdueHouseLoanNumGreaterThanOrEqualTo(String value) {
            addCriterion("overdue_house_loan_num >=", value, "overdueHouseLoanNum");
            return (Criteria) this;
        }

        public Criteria andOverdueHouseLoanNumLessThan(String value) {
            addCriterion("overdue_house_loan_num <", value, "overdueHouseLoanNum");
            return (Criteria) this;
        }

        public Criteria andOverdueHouseLoanNumLessThanOrEqualTo(String value) {
            addCriterion("overdue_house_loan_num <=", value, "overdueHouseLoanNum");
            return (Criteria) this;
        }

        public Criteria andOverdueHouseLoanNumLike(String value) {
            addCriterion("overdue_house_loan_num like", value, "overdueHouseLoanNum");
            return (Criteria) this;
        }

        public Criteria andOverdueHouseLoanNumNotLike(String value) {
            addCriterion("overdue_house_loan_num not like", value, "overdueHouseLoanNum");
            return (Criteria) this;
        }

        public Criteria andOverdueHouseLoanNumIn(List<String> values) {
            addCriterion("overdue_house_loan_num in", values, "overdueHouseLoanNum");
            return (Criteria) this;
        }

        public Criteria andOverdueHouseLoanNumNotIn(List<String> values) {
            addCriterion("overdue_house_loan_num not in", values, "overdueHouseLoanNum");
            return (Criteria) this;
        }

        public Criteria andOverdueHouseLoanNumBetween(String value1, String value2) {
            addCriterion("overdue_house_loan_num between", value1, value2, "overdueHouseLoanNum");
            return (Criteria) this;
        }

        public Criteria andOverdueHouseLoanNumNotBetween(String value1, String value2) {
            addCriterion("overdue_house_loan_num not between", value1, value2, "overdueHouseLoanNum");
            return (Criteria) this;
        }

        public Criteria andOverdueOtherLoanNumIsNull() {
            addCriterion("overdue_other_loan_num is null");
            return (Criteria) this;
        }

        public Criteria andOverdueOtherLoanNumIsNotNull() {
            addCriterion("overdue_other_loan_num is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueOtherLoanNumEqualTo(String value) {
            addCriterion("overdue_other_loan_num =", value, "overdueOtherLoanNum");
            return (Criteria) this;
        }

        public Criteria andOverdueOtherLoanNumNotEqualTo(String value) {
            addCriterion("overdue_other_loan_num <>", value, "overdueOtherLoanNum");
            return (Criteria) this;
        }

        public Criteria andOverdueOtherLoanNumGreaterThan(String value) {
            addCriterion("overdue_other_loan_num >", value, "overdueOtherLoanNum");
            return (Criteria) this;
        }

        public Criteria andOverdueOtherLoanNumGreaterThanOrEqualTo(String value) {
            addCriterion("overdue_other_loan_num >=", value, "overdueOtherLoanNum");
            return (Criteria) this;
        }

        public Criteria andOverdueOtherLoanNumLessThan(String value) {
            addCriterion("overdue_other_loan_num <", value, "overdueOtherLoanNum");
            return (Criteria) this;
        }

        public Criteria andOverdueOtherLoanNumLessThanOrEqualTo(String value) {
            addCriterion("overdue_other_loan_num <=", value, "overdueOtherLoanNum");
            return (Criteria) this;
        }

        public Criteria andOverdueOtherLoanNumLike(String value) {
            addCriterion("overdue_other_loan_num like", value, "overdueOtherLoanNum");
            return (Criteria) this;
        }

        public Criteria andOverdueOtherLoanNumNotLike(String value) {
            addCriterion("overdue_other_loan_num not like", value, "overdueOtherLoanNum");
            return (Criteria) this;
        }

        public Criteria andOverdueOtherLoanNumIn(List<String> values) {
            addCriterion("overdue_other_loan_num in", values, "overdueOtherLoanNum");
            return (Criteria) this;
        }

        public Criteria andOverdueOtherLoanNumNotIn(List<String> values) {
            addCriterion("overdue_other_loan_num not in", values, "overdueOtherLoanNum");
            return (Criteria) this;
        }

        public Criteria andOverdueOtherLoanNumBetween(String value1, String value2) {
            addCriterion("overdue_other_loan_num between", value1, value2, "overdueOtherLoanNum");
            return (Criteria) this;
        }

        public Criteria andOverdueOtherLoanNumNotBetween(String value1, String value2) {
            addCriterion("overdue_other_loan_num not between", value1, value2, "overdueOtherLoanNum");
            return (Criteria) this;
        }

        public Criteria andOverdue90dCreditNumIsNull() {
            addCriterion("overdue90d_credit_num is null");
            return (Criteria) this;
        }

        public Criteria andOverdue90dCreditNumIsNotNull() {
            addCriterion("overdue90d_credit_num is not null");
            return (Criteria) this;
        }

        public Criteria andOverdue90dCreditNumEqualTo(String value) {
            addCriterion("overdue90d_credit_num =", value, "overdue90dCreditNum");
            return (Criteria) this;
        }

        public Criteria andOverdue90dCreditNumNotEqualTo(String value) {
            addCriterion("overdue90d_credit_num <>", value, "overdue90dCreditNum");
            return (Criteria) this;
        }

        public Criteria andOverdue90dCreditNumGreaterThan(String value) {
            addCriterion("overdue90d_credit_num >", value, "overdue90dCreditNum");
            return (Criteria) this;
        }

        public Criteria andOverdue90dCreditNumGreaterThanOrEqualTo(String value) {
            addCriterion("overdue90d_credit_num >=", value, "overdue90dCreditNum");
            return (Criteria) this;
        }

        public Criteria andOverdue90dCreditNumLessThan(String value) {
            addCriterion("overdue90d_credit_num <", value, "overdue90dCreditNum");
            return (Criteria) this;
        }

        public Criteria andOverdue90dCreditNumLessThanOrEqualTo(String value) {
            addCriterion("overdue90d_credit_num <=", value, "overdue90dCreditNum");
            return (Criteria) this;
        }

        public Criteria andOverdue90dCreditNumLike(String value) {
            addCriterion("overdue90d_credit_num like", value, "overdue90dCreditNum");
            return (Criteria) this;
        }

        public Criteria andOverdue90dCreditNumNotLike(String value) {
            addCriterion("overdue90d_credit_num not like", value, "overdue90dCreditNum");
            return (Criteria) this;
        }

        public Criteria andOverdue90dCreditNumIn(List<String> values) {
            addCriterion("overdue90d_credit_num in", values, "overdue90dCreditNum");
            return (Criteria) this;
        }

        public Criteria andOverdue90dCreditNumNotIn(List<String> values) {
            addCriterion("overdue90d_credit_num not in", values, "overdue90dCreditNum");
            return (Criteria) this;
        }

        public Criteria andOverdue90dCreditNumBetween(String value1, String value2) {
            addCriterion("overdue90d_credit_num between", value1, value2, "overdue90dCreditNum");
            return (Criteria) this;
        }

        public Criteria andOverdue90dCreditNumNotBetween(String value1, String value2) {
            addCriterion("overdue90d_credit_num not between", value1, value2, "overdue90dCreditNum");
            return (Criteria) this;
        }

        public Criteria andOverdue90dHouseLoanNumIsNull() {
            addCriterion("overdue90d_house_loan_num is null");
            return (Criteria) this;
        }

        public Criteria andOverdue90dHouseLoanNumIsNotNull() {
            addCriterion("overdue90d_house_loan_num is not null");
            return (Criteria) this;
        }

        public Criteria andOverdue90dHouseLoanNumEqualTo(String value) {
            addCriterion("overdue90d_house_loan_num =", value, "overdue90dHouseLoanNum");
            return (Criteria) this;
        }

        public Criteria andOverdue90dHouseLoanNumNotEqualTo(String value) {
            addCriterion("overdue90d_house_loan_num <>", value, "overdue90dHouseLoanNum");
            return (Criteria) this;
        }

        public Criteria andOverdue90dHouseLoanNumGreaterThan(String value) {
            addCriterion("overdue90d_house_loan_num >", value, "overdue90dHouseLoanNum");
            return (Criteria) this;
        }

        public Criteria andOverdue90dHouseLoanNumGreaterThanOrEqualTo(String value) {
            addCriterion("overdue90d_house_loan_num >=", value, "overdue90dHouseLoanNum");
            return (Criteria) this;
        }

        public Criteria andOverdue90dHouseLoanNumLessThan(String value) {
            addCriterion("overdue90d_house_loan_num <", value, "overdue90dHouseLoanNum");
            return (Criteria) this;
        }

        public Criteria andOverdue90dHouseLoanNumLessThanOrEqualTo(String value) {
            addCriterion("overdue90d_house_loan_num <=", value, "overdue90dHouseLoanNum");
            return (Criteria) this;
        }

        public Criteria andOverdue90dHouseLoanNumLike(String value) {
            addCriterion("overdue90d_house_loan_num like", value, "overdue90dHouseLoanNum");
            return (Criteria) this;
        }

        public Criteria andOverdue90dHouseLoanNumNotLike(String value) {
            addCriterion("overdue90d_house_loan_num not like", value, "overdue90dHouseLoanNum");
            return (Criteria) this;
        }

        public Criteria andOverdue90dHouseLoanNumIn(List<String> values) {
            addCriterion("overdue90d_house_loan_num in", values, "overdue90dHouseLoanNum");
            return (Criteria) this;
        }

        public Criteria andOverdue90dHouseLoanNumNotIn(List<String> values) {
            addCriterion("overdue90d_house_loan_num not in", values, "overdue90dHouseLoanNum");
            return (Criteria) this;
        }

        public Criteria andOverdue90dHouseLoanNumBetween(String value1, String value2) {
            addCriterion("overdue90d_house_loan_num between", value1, value2, "overdue90dHouseLoanNum");
            return (Criteria) this;
        }

        public Criteria andOverdue90dHouseLoanNumNotBetween(String value1, String value2) {
            addCriterion("overdue90d_house_loan_num not between", value1, value2, "overdue90dHouseLoanNum");
            return (Criteria) this;
        }

        public Criteria andOverdue90dOtherLoanNumIsNull() {
            addCriterion("overdue90d_other_loan_num is null");
            return (Criteria) this;
        }

        public Criteria andOverdue90dOtherLoanNumIsNotNull() {
            addCriterion("overdue90d_other_loan_num is not null");
            return (Criteria) this;
        }

        public Criteria andOverdue90dOtherLoanNumEqualTo(String value) {
            addCriterion("overdue90d_other_loan_num =", value, "overdue90dOtherLoanNum");
            return (Criteria) this;
        }

        public Criteria andOverdue90dOtherLoanNumNotEqualTo(String value) {
            addCriterion("overdue90d_other_loan_num <>", value, "overdue90dOtherLoanNum");
            return (Criteria) this;
        }

        public Criteria andOverdue90dOtherLoanNumGreaterThan(String value) {
            addCriterion("overdue90d_other_loan_num >", value, "overdue90dOtherLoanNum");
            return (Criteria) this;
        }

        public Criteria andOverdue90dOtherLoanNumGreaterThanOrEqualTo(String value) {
            addCriterion("overdue90d_other_loan_num >=", value, "overdue90dOtherLoanNum");
            return (Criteria) this;
        }

        public Criteria andOverdue90dOtherLoanNumLessThan(String value) {
            addCriterion("overdue90d_other_loan_num <", value, "overdue90dOtherLoanNum");
            return (Criteria) this;
        }

        public Criteria andOverdue90dOtherLoanNumLessThanOrEqualTo(String value) {
            addCriterion("overdue90d_other_loan_num <=", value, "overdue90dOtherLoanNum");
            return (Criteria) this;
        }

        public Criteria andOverdue90dOtherLoanNumLike(String value) {
            addCriterion("overdue90d_other_loan_num like", value, "overdue90dOtherLoanNum");
            return (Criteria) this;
        }

        public Criteria andOverdue90dOtherLoanNumNotLike(String value) {
            addCriterion("overdue90d_other_loan_num not like", value, "overdue90dOtherLoanNum");
            return (Criteria) this;
        }

        public Criteria andOverdue90dOtherLoanNumIn(List<String> values) {
            addCriterion("overdue90d_other_loan_num in", values, "overdue90dOtherLoanNum");
            return (Criteria) this;
        }

        public Criteria andOverdue90dOtherLoanNumNotIn(List<String> values) {
            addCriterion("overdue90d_other_loan_num not in", values, "overdue90dOtherLoanNum");
            return (Criteria) this;
        }

        public Criteria andOverdue90dOtherLoanNumBetween(String value1, String value2) {
            addCriterion("overdue90d_other_loan_num between", value1, value2, "overdue90dOtherLoanNum");
            return (Criteria) this;
        }

        public Criteria andOverdue90dOtherLoanNumNotBetween(String value1, String value2) {
            addCriterion("overdue90d_other_loan_num not between", value1, value2, "overdue90dOtherLoanNum");
            return (Criteria) this;
        }

        public Criteria andByInternetQueryNumIsNull() {
            addCriterion("by_internet_query_num is null");
            return (Criteria) this;
        }

        public Criteria andByInternetQueryNumIsNotNull() {
            addCriterion("by_internet_query_num is not null");
            return (Criteria) this;
        }

        public Criteria andByInternetQueryNumEqualTo(String value) {
            addCriterion("by_internet_query_num =", value, "byInternetQueryNum");
            return (Criteria) this;
        }

        public Criteria andByInternetQueryNumNotEqualTo(String value) {
            addCriterion("by_internet_query_num <>", value, "byInternetQueryNum");
            return (Criteria) this;
        }

        public Criteria andByInternetQueryNumGreaterThan(String value) {
            addCriterion("by_internet_query_num >", value, "byInternetQueryNum");
            return (Criteria) this;
        }

        public Criteria andByInternetQueryNumGreaterThanOrEqualTo(String value) {
            addCriterion("by_internet_query_num >=", value, "byInternetQueryNum");
            return (Criteria) this;
        }

        public Criteria andByInternetQueryNumLessThan(String value) {
            addCriterion("by_internet_query_num <", value, "byInternetQueryNum");
            return (Criteria) this;
        }

        public Criteria andByInternetQueryNumLessThanOrEqualTo(String value) {
            addCriterion("by_internet_query_num <=", value, "byInternetQueryNum");
            return (Criteria) this;
        }

        public Criteria andByInternetQueryNumLike(String value) {
            addCriterion("by_internet_query_num like", value, "byInternetQueryNum");
            return (Criteria) this;
        }

        public Criteria andByInternetQueryNumNotLike(String value) {
            addCriterion("by_internet_query_num not like", value, "byInternetQueryNum");
            return (Criteria) this;
        }

        public Criteria andByInternetQueryNumIn(List<String> values) {
            addCriterion("by_internet_query_num in", values, "byInternetQueryNum");
            return (Criteria) this;
        }

        public Criteria andByInternetQueryNumNotIn(List<String> values) {
            addCriterion("by_internet_query_num not in", values, "byInternetQueryNum");
            return (Criteria) this;
        }

        public Criteria andByInternetQueryNumBetween(String value1, String value2) {
            addCriterion("by_internet_query_num between", value1, value2, "byInternetQueryNum");
            return (Criteria) this;
        }

        public Criteria andByInternetQueryNumNotBetween(String value1, String value2) {
            addCriterion("by_internet_query_num not between", value1, value2, "byInternetQueryNum");
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