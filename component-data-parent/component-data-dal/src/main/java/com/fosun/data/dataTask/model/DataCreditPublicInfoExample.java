package com.fosun.data.dataTask.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataCreditPublicInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DataCreditPublicInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected DataCreditPublicInfoExample(DataCreditPublicInfoExample example) {
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

        public Criteria andRecordTaxesOwedIsNull() {
            addCriterion("record_taxes_owed is null");
            return (Criteria) this;
        }

        public Criteria andRecordTaxesOwedIsNotNull() {
            addCriterion("record_taxes_owed is not null");
            return (Criteria) this;
        }

        public Criteria andRecordTaxesOwedEqualTo(String value) {
            addCriterion("record_taxes_owed =", value, "recordTaxesOwed");
            return (Criteria) this;
        }

        public Criteria andRecordTaxesOwedNotEqualTo(String value) {
            addCriterion("record_taxes_owed <>", value, "recordTaxesOwed");
            return (Criteria) this;
        }

        public Criteria andRecordTaxesOwedGreaterThan(String value) {
            addCriterion("record_taxes_owed >", value, "recordTaxesOwed");
            return (Criteria) this;
        }

        public Criteria andRecordTaxesOwedGreaterThanOrEqualTo(String value) {
            addCriterion("record_taxes_owed >=", value, "recordTaxesOwed");
            return (Criteria) this;
        }

        public Criteria andRecordTaxesOwedLessThan(String value) {
            addCriterion("record_taxes_owed <", value, "recordTaxesOwed");
            return (Criteria) this;
        }

        public Criteria andRecordTaxesOwedLessThanOrEqualTo(String value) {
            addCriterion("record_taxes_owed <=", value, "recordTaxesOwed");
            return (Criteria) this;
        }

        public Criteria andRecordTaxesOwedLike(String value) {
            addCriterion("record_taxes_owed like", value, "recordTaxesOwed");
            return (Criteria) this;
        }

        public Criteria andRecordTaxesOwedNotLike(String value) {
            addCriterion("record_taxes_owed not like", value, "recordTaxesOwed");
            return (Criteria) this;
        }

        public Criteria andRecordTaxesOwedIn(List<String> values) {
            addCriterion("record_taxes_owed in", values, "recordTaxesOwed");
            return (Criteria) this;
        }

        public Criteria andRecordTaxesOwedNotIn(List<String> values) {
            addCriterion("record_taxes_owed not in", values, "recordTaxesOwed");
            return (Criteria) this;
        }

        public Criteria andRecordTaxesOwedBetween(String value1, String value2) {
            addCriterion("record_taxes_owed between", value1, value2, "recordTaxesOwed");
            return (Criteria) this;
        }

        public Criteria andRecordTaxesOwedNotBetween(String value1, String value2) {
            addCriterion("record_taxes_owed not between", value1, value2, "recordTaxesOwed");
            return (Criteria) this;
        }

        public Criteria andRecordCivilJudgmentIsNull() {
            addCriterion("record_civil_judgment is null");
            return (Criteria) this;
        }

        public Criteria andRecordCivilJudgmentIsNotNull() {
            addCriterion("record_civil_judgment is not null");
            return (Criteria) this;
        }

        public Criteria andRecordCivilJudgmentEqualTo(String value) {
            addCriterion("record_civil_judgment =", value, "recordCivilJudgment");
            return (Criteria) this;
        }

        public Criteria andRecordCivilJudgmentNotEqualTo(String value) {
            addCriterion("record_civil_judgment <>", value, "recordCivilJudgment");
            return (Criteria) this;
        }

        public Criteria andRecordCivilJudgmentGreaterThan(String value) {
            addCriterion("record_civil_judgment >", value, "recordCivilJudgment");
            return (Criteria) this;
        }

        public Criteria andRecordCivilJudgmentGreaterThanOrEqualTo(String value) {
            addCriterion("record_civil_judgment >=", value, "recordCivilJudgment");
            return (Criteria) this;
        }

        public Criteria andRecordCivilJudgmentLessThan(String value) {
            addCriterion("record_civil_judgment <", value, "recordCivilJudgment");
            return (Criteria) this;
        }

        public Criteria andRecordCivilJudgmentLessThanOrEqualTo(String value) {
            addCriterion("record_civil_judgment <=", value, "recordCivilJudgment");
            return (Criteria) this;
        }

        public Criteria andRecordCivilJudgmentLike(String value) {
            addCriterion("record_civil_judgment like", value, "recordCivilJudgment");
            return (Criteria) this;
        }

        public Criteria andRecordCivilJudgmentNotLike(String value) {
            addCriterion("record_civil_judgment not like", value, "recordCivilJudgment");
            return (Criteria) this;
        }

        public Criteria andRecordCivilJudgmentIn(List<String> values) {
            addCriterion("record_civil_judgment in", values, "recordCivilJudgment");
            return (Criteria) this;
        }

        public Criteria andRecordCivilJudgmentNotIn(List<String> values) {
            addCriterion("record_civil_judgment not in", values, "recordCivilJudgment");
            return (Criteria) this;
        }

        public Criteria andRecordCivilJudgmentBetween(String value1, String value2) {
            addCriterion("record_civil_judgment between", value1, value2, "recordCivilJudgment");
            return (Criteria) this;
        }

        public Criteria andRecordCivilJudgmentNotBetween(String value1, String value2) {
            addCriterion("record_civil_judgment not between", value1, value2, "recordCivilJudgment");
            return (Criteria) this;
        }

        public Criteria andRecordForceExecutionIsNull() {
            addCriterion("record_force_execution is null");
            return (Criteria) this;
        }

        public Criteria andRecordForceExecutionIsNotNull() {
            addCriterion("record_force_execution is not null");
            return (Criteria) this;
        }

        public Criteria andRecordForceExecutionEqualTo(String value) {
            addCriterion("record_force_execution =", value, "recordForceExecution");
            return (Criteria) this;
        }

        public Criteria andRecordForceExecutionNotEqualTo(String value) {
            addCriterion("record_force_execution <>", value, "recordForceExecution");
            return (Criteria) this;
        }

        public Criteria andRecordForceExecutionGreaterThan(String value) {
            addCriterion("record_force_execution >", value, "recordForceExecution");
            return (Criteria) this;
        }

        public Criteria andRecordForceExecutionGreaterThanOrEqualTo(String value) {
            addCriterion("record_force_execution >=", value, "recordForceExecution");
            return (Criteria) this;
        }

        public Criteria andRecordForceExecutionLessThan(String value) {
            addCriterion("record_force_execution <", value, "recordForceExecution");
            return (Criteria) this;
        }

        public Criteria andRecordForceExecutionLessThanOrEqualTo(String value) {
            addCriterion("record_force_execution <=", value, "recordForceExecution");
            return (Criteria) this;
        }

        public Criteria andRecordForceExecutionLike(String value) {
            addCriterion("record_force_execution like", value, "recordForceExecution");
            return (Criteria) this;
        }

        public Criteria andRecordForceExecutionNotLike(String value) {
            addCriterion("record_force_execution not like", value, "recordForceExecution");
            return (Criteria) this;
        }

        public Criteria andRecordForceExecutionIn(List<String> values) {
            addCriterion("record_force_execution in", values, "recordForceExecution");
            return (Criteria) this;
        }

        public Criteria andRecordForceExecutionNotIn(List<String> values) {
            addCriterion("record_force_execution not in", values, "recordForceExecution");
            return (Criteria) this;
        }

        public Criteria andRecordForceExecutionBetween(String value1, String value2) {
            addCriterion("record_force_execution between", value1, value2, "recordForceExecution");
            return (Criteria) this;
        }

        public Criteria andRecordForceExecutionNotBetween(String value1, String value2) {
            addCriterion("record_force_execution not between", value1, value2, "recordForceExecution");
            return (Criteria) this;
        }

        public Criteria andRecordAdminSanctionIsNull() {
            addCriterion("record_admin_sanction is null");
            return (Criteria) this;
        }

        public Criteria andRecordAdminSanctionIsNotNull() {
            addCriterion("record_admin_sanction is not null");
            return (Criteria) this;
        }

        public Criteria andRecordAdminSanctionEqualTo(String value) {
            addCriterion("record_admin_sanction =", value, "recordAdminSanction");
            return (Criteria) this;
        }

        public Criteria andRecordAdminSanctionNotEqualTo(String value) {
            addCriterion("record_admin_sanction <>", value, "recordAdminSanction");
            return (Criteria) this;
        }

        public Criteria andRecordAdminSanctionGreaterThan(String value) {
            addCriterion("record_admin_sanction >", value, "recordAdminSanction");
            return (Criteria) this;
        }

        public Criteria andRecordAdminSanctionGreaterThanOrEqualTo(String value) {
            addCriterion("record_admin_sanction >=", value, "recordAdminSanction");
            return (Criteria) this;
        }

        public Criteria andRecordAdminSanctionLessThan(String value) {
            addCriterion("record_admin_sanction <", value, "recordAdminSanction");
            return (Criteria) this;
        }

        public Criteria andRecordAdminSanctionLessThanOrEqualTo(String value) {
            addCriterion("record_admin_sanction <=", value, "recordAdminSanction");
            return (Criteria) this;
        }

        public Criteria andRecordAdminSanctionLike(String value) {
            addCriterion("record_admin_sanction like", value, "recordAdminSanction");
            return (Criteria) this;
        }

        public Criteria andRecordAdminSanctionNotLike(String value) {
            addCriterion("record_admin_sanction not like", value, "recordAdminSanction");
            return (Criteria) this;
        }

        public Criteria andRecordAdminSanctionIn(List<String> values) {
            addCriterion("record_admin_sanction in", values, "recordAdminSanction");
            return (Criteria) this;
        }

        public Criteria andRecordAdminSanctionNotIn(List<String> values) {
            addCriterion("record_admin_sanction not in", values, "recordAdminSanction");
            return (Criteria) this;
        }

        public Criteria andRecordAdminSanctionBetween(String value1, String value2) {
            addCriterion("record_admin_sanction between", value1, value2, "recordAdminSanction");
            return (Criteria) this;
        }

        public Criteria andRecordAdminSanctionNotBetween(String value1, String value2) {
            addCriterion("record_admin_sanction not between", value1, value2, "recordAdminSanction");
            return (Criteria) this;
        }

        public Criteria andRecordTelecomArrearsIsNull() {
            addCriterion("record_telecom_arrears is null");
            return (Criteria) this;
        }

        public Criteria andRecordTelecomArrearsIsNotNull() {
            addCriterion("record_telecom_arrears is not null");
            return (Criteria) this;
        }

        public Criteria andRecordTelecomArrearsEqualTo(String value) {
            addCriterion("record_telecom_arrears =", value, "recordTelecomArrears");
            return (Criteria) this;
        }

        public Criteria andRecordTelecomArrearsNotEqualTo(String value) {
            addCriterion("record_telecom_arrears <>", value, "recordTelecomArrears");
            return (Criteria) this;
        }

        public Criteria andRecordTelecomArrearsGreaterThan(String value) {
            addCriterion("record_telecom_arrears >", value, "recordTelecomArrears");
            return (Criteria) this;
        }

        public Criteria andRecordTelecomArrearsGreaterThanOrEqualTo(String value) {
            addCriterion("record_telecom_arrears >=", value, "recordTelecomArrears");
            return (Criteria) this;
        }

        public Criteria andRecordTelecomArrearsLessThan(String value) {
            addCriterion("record_telecom_arrears <", value, "recordTelecomArrears");
            return (Criteria) this;
        }

        public Criteria andRecordTelecomArrearsLessThanOrEqualTo(String value) {
            addCriterion("record_telecom_arrears <=", value, "recordTelecomArrears");
            return (Criteria) this;
        }

        public Criteria andRecordTelecomArrearsLike(String value) {
            addCriterion("record_telecom_arrears like", value, "recordTelecomArrears");
            return (Criteria) this;
        }

        public Criteria andRecordTelecomArrearsNotLike(String value) {
            addCriterion("record_telecom_arrears not like", value, "recordTelecomArrears");
            return (Criteria) this;
        }

        public Criteria andRecordTelecomArrearsIn(List<String> values) {
            addCriterion("record_telecom_arrears in", values, "recordTelecomArrears");
            return (Criteria) this;
        }

        public Criteria andRecordTelecomArrearsNotIn(List<String> values) {
            addCriterion("record_telecom_arrears not in", values, "recordTelecomArrears");
            return (Criteria) this;
        }

        public Criteria andRecordTelecomArrearsBetween(String value1, String value2) {
            addCriterion("record_telecom_arrears between", value1, value2, "recordTelecomArrears");
            return (Criteria) this;
        }

        public Criteria andRecordTelecomArrearsNotBetween(String value1, String value2) {
            addCriterion("record_telecom_arrears not between", value1, value2, "recordTelecomArrears");
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