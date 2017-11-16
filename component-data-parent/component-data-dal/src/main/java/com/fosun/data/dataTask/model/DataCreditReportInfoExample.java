package com.fosun.data.dataTask.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataCreditReportInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DataCreditReportInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected DataCreditReportInfoExample(DataCreditReportInfoExample example) {
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

        public Criteria andCreditReportDtIsNull() {
            addCriterion("credit_report_dt is null");
            return (Criteria) this;
        }

        public Criteria andCreditReportDtIsNotNull() {
            addCriterion("credit_report_dt is not null");
            return (Criteria) this;
        }

        public Criteria andCreditReportDtEqualTo(String value) {
            addCriterion("credit_report_dt =", value, "creditReportDt");
            return (Criteria) this;
        }

        public Criteria andCreditReportDtNotEqualTo(String value) {
            addCriterion("credit_report_dt <>", value, "creditReportDt");
            return (Criteria) this;
        }

        public Criteria andCreditReportDtGreaterThan(String value) {
            addCriterion("credit_report_dt >", value, "creditReportDt");
            return (Criteria) this;
        }

        public Criteria andCreditReportDtGreaterThanOrEqualTo(String value) {
            addCriterion("credit_report_dt >=", value, "creditReportDt");
            return (Criteria) this;
        }

        public Criteria andCreditReportDtLessThan(String value) {
            addCriterion("credit_report_dt <", value, "creditReportDt");
            return (Criteria) this;
        }

        public Criteria andCreditReportDtLessThanOrEqualTo(String value) {
            addCriterion("credit_report_dt <=", value, "creditReportDt");
            return (Criteria) this;
        }

        public Criteria andCreditReportDtLike(String value) {
            addCriterion("credit_report_dt like", value, "creditReportDt");
            return (Criteria) this;
        }

        public Criteria andCreditReportDtNotLike(String value) {
            addCriterion("credit_report_dt not like", value, "creditReportDt");
            return (Criteria) this;
        }

        public Criteria andCreditReportDtIn(List<String> values) {
            addCriterion("credit_report_dt in", values, "creditReportDt");
            return (Criteria) this;
        }

        public Criteria andCreditReportDtNotIn(List<String> values) {
            addCriterion("credit_report_dt not in", values, "creditReportDt");
            return (Criteria) this;
        }

        public Criteria andCreditReportDtBetween(String value1, String value2) {
            addCriterion("credit_report_dt between", value1, value2, "creditReportDt");
            return (Criteria) this;
        }

        public Criteria andCreditReportDtNotBetween(String value1, String value2) {
            addCriterion("credit_report_dt not between", value1, value2, "creditReportDt");
            return (Criteria) this;
        }

        public Criteria andCreditPersonBrithDtIsNull() {
            addCriterion("credit_person_brith_dt is null");
            return (Criteria) this;
        }

        public Criteria andCreditPersonBrithDtIsNotNull() {
            addCriterion("credit_person_brith_dt is not null");
            return (Criteria) this;
        }

        public Criteria andCreditPersonBrithDtEqualTo(String value) {
            addCriterion("credit_person_brith_dt =", value, "creditPersonBrithDt");
            return (Criteria) this;
        }

        public Criteria andCreditPersonBrithDtNotEqualTo(String value) {
            addCriterion("credit_person_brith_dt <>", value, "creditPersonBrithDt");
            return (Criteria) this;
        }

        public Criteria andCreditPersonBrithDtGreaterThan(String value) {
            addCriterion("credit_person_brith_dt >", value, "creditPersonBrithDt");
            return (Criteria) this;
        }

        public Criteria andCreditPersonBrithDtGreaterThanOrEqualTo(String value) {
            addCriterion("credit_person_brith_dt >=", value, "creditPersonBrithDt");
            return (Criteria) this;
        }

        public Criteria andCreditPersonBrithDtLessThan(String value) {
            addCriterion("credit_person_brith_dt <", value, "creditPersonBrithDt");
            return (Criteria) this;
        }

        public Criteria andCreditPersonBrithDtLessThanOrEqualTo(String value) {
            addCriterion("credit_person_brith_dt <=", value, "creditPersonBrithDt");
            return (Criteria) this;
        }

        public Criteria andCreditPersonBrithDtLike(String value) {
            addCriterion("credit_person_brith_dt like", value, "creditPersonBrithDt");
            return (Criteria) this;
        }

        public Criteria andCreditPersonBrithDtNotLike(String value) {
            addCriterion("credit_person_brith_dt not like", value, "creditPersonBrithDt");
            return (Criteria) this;
        }

        public Criteria andCreditPersonBrithDtIn(List<String> values) {
            addCriterion("credit_person_brith_dt in", values, "creditPersonBrithDt");
            return (Criteria) this;
        }

        public Criteria andCreditPersonBrithDtNotIn(List<String> values) {
            addCriterion("credit_person_brith_dt not in", values, "creditPersonBrithDt");
            return (Criteria) this;
        }

        public Criteria andCreditPersonBrithDtBetween(String value1, String value2) {
            addCriterion("credit_person_brith_dt between", value1, value2, "creditPersonBrithDt");
            return (Criteria) this;
        }

        public Criteria andCreditPersonBrithDtNotBetween(String value1, String value2) {
            addCriterion("credit_person_brith_dt not between", value1, value2, "creditPersonBrithDt");
            return (Criteria) this;
        }

        public Criteria andCreditPersonNameIsNull() {
            addCriterion("credit_person_name is null");
            return (Criteria) this;
        }

        public Criteria andCreditPersonNameIsNotNull() {
            addCriterion("credit_person_name is not null");
            return (Criteria) this;
        }

        public Criteria andCreditPersonNameEqualTo(String value) {
            addCriterion("credit_person_name =", value, "creditPersonName");
            return (Criteria) this;
        }

        public Criteria andCreditPersonNameNotEqualTo(String value) {
            addCriterion("credit_person_name <>", value, "creditPersonName");
            return (Criteria) this;
        }

        public Criteria andCreditPersonNameGreaterThan(String value) {
            addCriterion("credit_person_name >", value, "creditPersonName");
            return (Criteria) this;
        }

        public Criteria andCreditPersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("credit_person_name >=", value, "creditPersonName");
            return (Criteria) this;
        }

        public Criteria andCreditPersonNameLessThan(String value) {
            addCriterion("credit_person_name <", value, "creditPersonName");
            return (Criteria) this;
        }

        public Criteria andCreditPersonNameLessThanOrEqualTo(String value) {
            addCriterion("credit_person_name <=", value, "creditPersonName");
            return (Criteria) this;
        }

        public Criteria andCreditPersonNameLike(String value) {
            addCriterion("credit_person_name like", value, "creditPersonName");
            return (Criteria) this;
        }

        public Criteria andCreditPersonNameNotLike(String value) {
            addCriterion("credit_person_name not like", value, "creditPersonName");
            return (Criteria) this;
        }

        public Criteria andCreditPersonNameIn(List<String> values) {
            addCriterion("credit_person_name in", values, "creditPersonName");
            return (Criteria) this;
        }

        public Criteria andCreditPersonNameNotIn(List<String> values) {
            addCriterion("credit_person_name not in", values, "creditPersonName");
            return (Criteria) this;
        }

        public Criteria andCreditPersonNameBetween(String value1, String value2) {
            addCriterion("credit_person_name between", value1, value2, "creditPersonName");
            return (Criteria) this;
        }

        public Criteria andCreditPersonNameNotBetween(String value1, String value2) {
            addCriterion("credit_person_name not between", value1, value2, "creditPersonName");
            return (Criteria) this;
        }

        public Criteria andCreditPersonIdTypeIsNull() {
            addCriterion("credit_person_id_type is null");
            return (Criteria) this;
        }

        public Criteria andCreditPersonIdTypeIsNotNull() {
            addCriterion("credit_person_id_type is not null");
            return (Criteria) this;
        }

        public Criteria andCreditPersonIdTypeEqualTo(String value) {
            addCriterion("credit_person_id_type =", value, "creditPersonIdType");
            return (Criteria) this;
        }

        public Criteria andCreditPersonIdTypeNotEqualTo(String value) {
            addCriterion("credit_person_id_type <>", value, "creditPersonIdType");
            return (Criteria) this;
        }

        public Criteria andCreditPersonIdTypeGreaterThan(String value) {
            addCriterion("credit_person_id_type >", value, "creditPersonIdType");
            return (Criteria) this;
        }

        public Criteria andCreditPersonIdTypeGreaterThanOrEqualTo(String value) {
            addCriterion("credit_person_id_type >=", value, "creditPersonIdType");
            return (Criteria) this;
        }

        public Criteria andCreditPersonIdTypeLessThan(String value) {
            addCriterion("credit_person_id_type <", value, "creditPersonIdType");
            return (Criteria) this;
        }

        public Criteria andCreditPersonIdTypeLessThanOrEqualTo(String value) {
            addCriterion("credit_person_id_type <=", value, "creditPersonIdType");
            return (Criteria) this;
        }

        public Criteria andCreditPersonIdTypeLike(String value) {
            addCriterion("credit_person_id_type like", value, "creditPersonIdType");
            return (Criteria) this;
        }

        public Criteria andCreditPersonIdTypeNotLike(String value) {
            addCriterion("credit_person_id_type not like", value, "creditPersonIdType");
            return (Criteria) this;
        }

        public Criteria andCreditPersonIdTypeIn(List<String> values) {
            addCriterion("credit_person_id_type in", values, "creditPersonIdType");
            return (Criteria) this;
        }

        public Criteria andCreditPersonIdTypeNotIn(List<String> values) {
            addCriterion("credit_person_id_type not in", values, "creditPersonIdType");
            return (Criteria) this;
        }

        public Criteria andCreditPersonIdTypeBetween(String value1, String value2) {
            addCriterion("credit_person_id_type between", value1, value2, "creditPersonIdType");
            return (Criteria) this;
        }

        public Criteria andCreditPersonIdTypeNotBetween(String value1, String value2) {
            addCriterion("credit_person_id_type not between", value1, value2, "creditPersonIdType");
            return (Criteria) this;
        }

        public Criteria andCreditPersonIdNumIsNull() {
            addCriterion("credit_person_id_num is null");
            return (Criteria) this;
        }

        public Criteria andCreditPersonIdNumIsNotNull() {
            addCriterion("credit_person_id_num is not null");
            return (Criteria) this;
        }

        public Criteria andCreditPersonIdNumEqualTo(String value) {
            addCriterion("credit_person_id_num =", value, "creditPersonIdNum");
            return (Criteria) this;
        }

        public Criteria andCreditPersonIdNumNotEqualTo(String value) {
            addCriterion("credit_person_id_num <>", value, "creditPersonIdNum");
            return (Criteria) this;
        }

        public Criteria andCreditPersonIdNumGreaterThan(String value) {
            addCriterion("credit_person_id_num >", value, "creditPersonIdNum");
            return (Criteria) this;
        }

        public Criteria andCreditPersonIdNumGreaterThanOrEqualTo(String value) {
            addCriterion("credit_person_id_num >=", value, "creditPersonIdNum");
            return (Criteria) this;
        }

        public Criteria andCreditPersonIdNumLessThan(String value) {
            addCriterion("credit_person_id_num <", value, "creditPersonIdNum");
            return (Criteria) this;
        }

        public Criteria andCreditPersonIdNumLessThanOrEqualTo(String value) {
            addCriterion("credit_person_id_num <=", value, "creditPersonIdNum");
            return (Criteria) this;
        }

        public Criteria andCreditPersonIdNumLike(String value) {
            addCriterion("credit_person_id_num like", value, "creditPersonIdNum");
            return (Criteria) this;
        }

        public Criteria andCreditPersonIdNumNotLike(String value) {
            addCriterion("credit_person_id_num not like", value, "creditPersonIdNum");
            return (Criteria) this;
        }

        public Criteria andCreditPersonIdNumIn(List<String> values) {
            addCriterion("credit_person_id_num in", values, "creditPersonIdNum");
            return (Criteria) this;
        }

        public Criteria andCreditPersonIdNumNotIn(List<String> values) {
            addCriterion("credit_person_id_num not in", values, "creditPersonIdNum");
            return (Criteria) this;
        }

        public Criteria andCreditPersonIdNumBetween(String value1, String value2) {
            addCriterion("credit_person_id_num between", value1, value2, "creditPersonIdNum");
            return (Criteria) this;
        }

        public Criteria andCreditPersonIdNumNotBetween(String value1, String value2) {
            addCriterion("credit_person_id_num not between", value1, value2, "creditPersonIdNum");
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