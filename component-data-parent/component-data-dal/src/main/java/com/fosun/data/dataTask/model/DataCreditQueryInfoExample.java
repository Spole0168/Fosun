package com.fosun.data.dataTask.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataCreditQueryInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DataCreditQueryInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected DataCreditQueryInfoExample(DataCreditQueryInfoExample example) {
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

        public Criteria andQueryDtIsNull() {
            addCriterion("query_dt is null");
            return (Criteria) this;
        }

        public Criteria andQueryDtIsNotNull() {
            addCriterion("query_dt is not null");
            return (Criteria) this;
        }

        public Criteria andQueryDtEqualTo(String value) {
            addCriterion("query_dt =", value, "queryDt");
            return (Criteria) this;
        }

        public Criteria andQueryDtNotEqualTo(String value) {
            addCriterion("query_dt <>", value, "queryDt");
            return (Criteria) this;
        }

        public Criteria andQueryDtGreaterThan(String value) {
            addCriterion("query_dt >", value, "queryDt");
            return (Criteria) this;
        }

        public Criteria andQueryDtGreaterThanOrEqualTo(String value) {
            addCriterion("query_dt >=", value, "queryDt");
            return (Criteria) this;
        }

        public Criteria andQueryDtLessThan(String value) {
            addCriterion("query_dt <", value, "queryDt");
            return (Criteria) this;
        }

        public Criteria andQueryDtLessThanOrEqualTo(String value) {
            addCriterion("query_dt <=", value, "queryDt");
            return (Criteria) this;
        }

        public Criteria andQueryDtLike(String value) {
            addCriterion("query_dt like", value, "queryDt");
            return (Criteria) this;
        }

        public Criteria andQueryDtNotLike(String value) {
            addCriterion("query_dt not like", value, "queryDt");
            return (Criteria) this;
        }

        public Criteria andQueryDtIn(List<String> values) {
            addCriterion("query_dt in", values, "queryDt");
            return (Criteria) this;
        }

        public Criteria andQueryDtNotIn(List<String> values) {
            addCriterion("query_dt not in", values, "queryDt");
            return (Criteria) this;
        }

        public Criteria andQueryDtBetween(String value1, String value2) {
            addCriterion("query_dt between", value1, value2, "queryDt");
            return (Criteria) this;
        }

        public Criteria andQueryDtNotBetween(String value1, String value2) {
            addCriterion("query_dt not between", value1, value2, "queryDt");
            return (Criteria) this;
        }

        public Criteria andQueryReasonIsNull() {
            addCriterion("query_reason is null");
            return (Criteria) this;
        }

        public Criteria andQueryReasonIsNotNull() {
            addCriterion("query_reason is not null");
            return (Criteria) this;
        }

        public Criteria andQueryReasonEqualTo(String value) {
            addCriterion("query_reason =", value, "queryReason");
            return (Criteria) this;
        }

        public Criteria andQueryReasonNotEqualTo(String value) {
            addCriterion("query_reason <>", value, "queryReason");
            return (Criteria) this;
        }

        public Criteria andQueryReasonGreaterThan(String value) {
            addCriterion("query_reason >", value, "queryReason");
            return (Criteria) this;
        }

        public Criteria andQueryReasonGreaterThanOrEqualTo(String value) {
            addCriterion("query_reason >=", value, "queryReason");
            return (Criteria) this;
        }

        public Criteria andQueryReasonLessThan(String value) {
            addCriterion("query_reason <", value, "queryReason");
            return (Criteria) this;
        }

        public Criteria andQueryReasonLessThanOrEqualTo(String value) {
            addCriterion("query_reason <=", value, "queryReason");
            return (Criteria) this;
        }

        public Criteria andQueryReasonLike(String value) {
            addCriterion("query_reason like", value, "queryReason");
            return (Criteria) this;
        }

        public Criteria andQueryReasonNotLike(String value) {
            addCriterion("query_reason not like", value, "queryReason");
            return (Criteria) this;
        }

        public Criteria andQueryReasonIn(List<String> values) {
            addCriterion("query_reason in", values, "queryReason");
            return (Criteria) this;
        }

        public Criteria andQueryReasonNotIn(List<String> values) {
            addCriterion("query_reason not in", values, "queryReason");
            return (Criteria) this;
        }

        public Criteria andQueryReasonBetween(String value1, String value2) {
            addCriterion("query_reason between", value1, value2, "queryReason");
            return (Criteria) this;
        }

        public Criteria andQueryReasonNotBetween(String value1, String value2) {
            addCriterion("query_reason not between", value1, value2, "queryReason");
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