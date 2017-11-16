package com.fosun.data.dataTask.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataCreditBriefTransactionInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DataCreditBriefTransactionInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected DataCreditBriefTransactionInfoExample(DataCreditBriefTransactionInfoExample example) {
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

        public Criteria andTransactionTypeIsNull() {
            addCriterion("transaction_type is null");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeIsNotNull() {
            addCriterion("transaction_type is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeEqualTo(String value) {
            addCriterion("transaction_type =", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeNotEqualTo(String value) {
            addCriterion("transaction_type <>", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeGreaterThan(String value) {
            addCriterion("transaction_type >", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("transaction_type >=", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeLessThan(String value) {
            addCriterion("transaction_type <", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeLessThanOrEqualTo(String value) {
            addCriterion("transaction_type <=", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeLike(String value) {
            addCriterion("transaction_type like", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeNotLike(String value) {
            addCriterion("transaction_type not like", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeIn(List<String> values) {
            addCriterion("transaction_type in", values, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeNotIn(List<String> values) {
            addCriterion("transaction_type not in", values, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeBetween(String value1, String value2) {
            addCriterion("transaction_type between", value1, value2, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeNotBetween(String value1, String value2) {
            addCriterion("transaction_type not between", value1, value2, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionIsOverdueIsNull() {
            addCriterion("transaction_is_overdue is null");
            return (Criteria) this;
        }

        public Criteria andTransactionIsOverdueIsNotNull() {
            addCriterion("transaction_is_overdue is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionIsOverdueEqualTo(String value) {
            addCriterion("transaction_is_overdue =", value, "transactionIsOverdue");
            return (Criteria) this;
        }

        public Criteria andTransactionIsOverdueNotEqualTo(String value) {
            addCriterion("transaction_is_overdue <>", value, "transactionIsOverdue");
            return (Criteria) this;
        }

        public Criteria andTransactionIsOverdueGreaterThan(String value) {
            addCriterion("transaction_is_overdue >", value, "transactionIsOverdue");
            return (Criteria) this;
        }

        public Criteria andTransactionIsOverdueGreaterThanOrEqualTo(String value) {
            addCriterion("transaction_is_overdue >=", value, "transactionIsOverdue");
            return (Criteria) this;
        }

        public Criteria andTransactionIsOverdueLessThan(String value) {
            addCriterion("transaction_is_overdue <", value, "transactionIsOverdue");
            return (Criteria) this;
        }

        public Criteria andTransactionIsOverdueLessThanOrEqualTo(String value) {
            addCriterion("transaction_is_overdue <=", value, "transactionIsOverdue");
            return (Criteria) this;
        }

        public Criteria andTransactionIsOverdueLike(String value) {
            addCriterion("transaction_is_overdue like", value, "transactionIsOverdue");
            return (Criteria) this;
        }

        public Criteria andTransactionIsOverdueNotLike(String value) {
            addCriterion("transaction_is_overdue not like", value, "transactionIsOverdue");
            return (Criteria) this;
        }

        public Criteria andTransactionIsOverdueIn(List<String> values) {
            addCriterion("transaction_is_overdue in", values, "transactionIsOverdue");
            return (Criteria) this;
        }

        public Criteria andTransactionIsOverdueNotIn(List<String> values) {
            addCriterion("transaction_is_overdue not in", values, "transactionIsOverdue");
            return (Criteria) this;
        }

        public Criteria andTransactionIsOverdueBetween(String value1, String value2) {
            addCriterion("transaction_is_overdue between", value1, value2, "transactionIsOverdue");
            return (Criteria) this;
        }

        public Criteria andTransactionIsOverdueNotBetween(String value1, String value2) {
            addCriterion("transaction_is_overdue not between", value1, value2, "transactionIsOverdue");
            return (Criteria) this;
        }

        public Criteria andTransactionIssueDateIsNull() {
            addCriterion("transaction_issue_date is null");
            return (Criteria) this;
        }

        public Criteria andTransactionIssueDateIsNotNull() {
            addCriterion("transaction_issue_date is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionIssueDateEqualTo(String value) {
            addCriterion("transaction_issue_date =", value, "transactionIssueDate");
            return (Criteria) this;
        }

        public Criteria andTransactionIssueDateNotEqualTo(String value) {
            addCriterion("transaction_issue_date <>", value, "transactionIssueDate");
            return (Criteria) this;
        }

        public Criteria andTransactionIssueDateGreaterThan(String value) {
            addCriterion("transaction_issue_date >", value, "transactionIssueDate");
            return (Criteria) this;
        }

        public Criteria andTransactionIssueDateGreaterThanOrEqualTo(String value) {
            addCriterion("transaction_issue_date >=", value, "transactionIssueDate");
            return (Criteria) this;
        }

        public Criteria andTransactionIssueDateLessThan(String value) {
            addCriterion("transaction_issue_date <", value, "transactionIssueDate");
            return (Criteria) this;
        }

        public Criteria andTransactionIssueDateLessThanOrEqualTo(String value) {
            addCriterion("transaction_issue_date <=", value, "transactionIssueDate");
            return (Criteria) this;
        }

        public Criteria andTransactionIssueDateLike(String value) {
            addCriterion("transaction_issue_date like", value, "transactionIssueDate");
            return (Criteria) this;
        }

        public Criteria andTransactionIssueDateNotLike(String value) {
            addCriterion("transaction_issue_date not like", value, "transactionIssueDate");
            return (Criteria) this;
        }

        public Criteria andTransactionIssueDateIn(List<String> values) {
            addCriterion("transaction_issue_date in", values, "transactionIssueDate");
            return (Criteria) this;
        }

        public Criteria andTransactionIssueDateNotIn(List<String> values) {
            addCriterion("transaction_issue_date not in", values, "transactionIssueDate");
            return (Criteria) this;
        }

        public Criteria andTransactionIssueDateBetween(String value1, String value2) {
            addCriterion("transaction_issue_date between", value1, value2, "transactionIssueDate");
            return (Criteria) this;
        }

        public Criteria andTransactionIssueDateNotBetween(String value1, String value2) {
            addCriterion("transaction_issue_date not between", value1, value2, "transactionIssueDate");
            return (Criteria) this;
        }

        public Criteria andTransactionDueDateIsNull() {
            addCriterion("transaction_due_date is null");
            return (Criteria) this;
        }

        public Criteria andTransactionDueDateIsNotNull() {
            addCriterion("transaction_due_date is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionDueDateEqualTo(String value) {
            addCriterion("transaction_due_date =", value, "transactionDueDate");
            return (Criteria) this;
        }

        public Criteria andTransactionDueDateNotEqualTo(String value) {
            addCriterion("transaction_due_date <>", value, "transactionDueDate");
            return (Criteria) this;
        }

        public Criteria andTransactionDueDateGreaterThan(String value) {
            addCriterion("transaction_due_date >", value, "transactionDueDate");
            return (Criteria) this;
        }

        public Criteria andTransactionDueDateGreaterThanOrEqualTo(String value) {
            addCriterion("transaction_due_date >=", value, "transactionDueDate");
            return (Criteria) this;
        }

        public Criteria andTransactionDueDateLessThan(String value) {
            addCriterion("transaction_due_date <", value, "transactionDueDate");
            return (Criteria) this;
        }

        public Criteria andTransactionDueDateLessThanOrEqualTo(String value) {
            addCriterion("transaction_due_date <=", value, "transactionDueDate");
            return (Criteria) this;
        }

        public Criteria andTransactionDueDateLike(String value) {
            addCriterion("transaction_due_date like", value, "transactionDueDate");
            return (Criteria) this;
        }

        public Criteria andTransactionDueDateNotLike(String value) {
            addCriterion("transaction_due_date not like", value, "transactionDueDate");
            return (Criteria) this;
        }

        public Criteria andTransactionDueDateIn(List<String> values) {
            addCriterion("transaction_due_date in", values, "transactionDueDate");
            return (Criteria) this;
        }

        public Criteria andTransactionDueDateNotIn(List<String> values) {
            addCriterion("transaction_due_date not in", values, "transactionDueDate");
            return (Criteria) this;
        }

        public Criteria andTransactionDueDateBetween(String value1, String value2) {
            addCriterion("transaction_due_date between", value1, value2, "transactionDueDate");
            return (Criteria) this;
        }

        public Criteria andTransactionDueDateNotBetween(String value1, String value2) {
            addCriterion("transaction_due_date not between", value1, value2, "transactionDueDate");
            return (Criteria) this;
        }

        public Criteria andOperateCreditBranchIsNull() {
            addCriterion("operate_credit_branch is null");
            return (Criteria) this;
        }

        public Criteria andOperateCreditBranchIsNotNull() {
            addCriterion("operate_credit_branch is not null");
            return (Criteria) this;
        }

        public Criteria andOperateCreditBranchEqualTo(String value) {
            addCriterion("operate_credit_branch =", value, "operateCreditBranch");
            return (Criteria) this;
        }

        public Criteria andOperateCreditBranchNotEqualTo(String value) {
            addCriterion("operate_credit_branch <>", value, "operateCreditBranch");
            return (Criteria) this;
        }

        public Criteria andOperateCreditBranchGreaterThan(String value) {
            addCriterion("operate_credit_branch >", value, "operateCreditBranch");
            return (Criteria) this;
        }

        public Criteria andOperateCreditBranchGreaterThanOrEqualTo(String value) {
            addCriterion("operate_credit_branch >=", value, "operateCreditBranch");
            return (Criteria) this;
        }

        public Criteria andOperateCreditBranchLessThan(String value) {
            addCriterion("operate_credit_branch <", value, "operateCreditBranch");
            return (Criteria) this;
        }

        public Criteria andOperateCreditBranchLessThanOrEqualTo(String value) {
            addCriterion("operate_credit_branch <=", value, "operateCreditBranch");
            return (Criteria) this;
        }

        public Criteria andOperateCreditBranchLike(String value) {
            addCriterion("operate_credit_branch like", value, "operateCreditBranch");
            return (Criteria) this;
        }

        public Criteria andOperateCreditBranchNotLike(String value) {
            addCriterion("operate_credit_branch not like", value, "operateCreditBranch");
            return (Criteria) this;
        }

        public Criteria andOperateCreditBranchIn(List<String> values) {
            addCriterion("operate_credit_branch in", values, "operateCreditBranch");
            return (Criteria) this;
        }

        public Criteria andOperateCreditBranchNotIn(List<String> values) {
            addCriterion("operate_credit_branch not in", values, "operateCreditBranch");
            return (Criteria) this;
        }

        public Criteria andOperateCreditBranchBetween(String value1, String value2) {
            addCriterion("operate_credit_branch between", value1, value2, "operateCreditBranch");
            return (Criteria) this;
        }

        public Criteria andOperateCreditBranchNotBetween(String value1, String value2) {
            addCriterion("operate_credit_branch not between", value1, value2, "operateCreditBranch");
            return (Criteria) this;
        }

        public Criteria andAccountStateIsNull() {
            addCriterion("account_state is null");
            return (Criteria) this;
        }

        public Criteria andAccountStateIsNotNull() {
            addCriterion("account_state is not null");
            return (Criteria) this;
        }

        public Criteria andAccountStateEqualTo(String value) {
            addCriterion("account_state =", value, "accountState");
            return (Criteria) this;
        }

        public Criteria andAccountStateNotEqualTo(String value) {
            addCriterion("account_state <>", value, "accountState");
            return (Criteria) this;
        }

        public Criteria andAccountStateGreaterThan(String value) {
            addCriterion("account_state >", value, "accountState");
            return (Criteria) this;
        }

        public Criteria andAccountStateGreaterThanOrEqualTo(String value) {
            addCriterion("account_state >=", value, "accountState");
            return (Criteria) this;
        }

        public Criteria andAccountStateLessThan(String value) {
            addCriterion("account_state <", value, "accountState");
            return (Criteria) this;
        }

        public Criteria andAccountStateLessThanOrEqualTo(String value) {
            addCriterion("account_state <=", value, "accountState");
            return (Criteria) this;
        }

        public Criteria andAccountStateLike(String value) {
            addCriterion("account_state like", value, "accountState");
            return (Criteria) this;
        }

        public Criteria andAccountStateNotLike(String value) {
            addCriterion("account_state not like", value, "accountState");
            return (Criteria) this;
        }

        public Criteria andAccountStateIn(List<String> values) {
            addCriterion("account_state in", values, "accountState");
            return (Criteria) this;
        }

        public Criteria andAccountStateNotIn(List<String> values) {
            addCriterion("account_state not in", values, "accountState");
            return (Criteria) this;
        }

        public Criteria andAccountStateBetween(String value1, String value2) {
            addCriterion("account_state between", value1, value2, "accountState");
            return (Criteria) this;
        }

        public Criteria andAccountStateNotBetween(String value1, String value2) {
            addCriterion("account_state not between", value1, value2, "accountState");
            return (Criteria) this;
        }

        public Criteria andTransactionCreditAmountTotalIsNull() {
            addCriterion("transaction_credit_amount_total is null");
            return (Criteria) this;
        }

        public Criteria andTransactionCreditAmountTotalIsNotNull() {
            addCriterion("transaction_credit_amount_total is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionCreditAmountTotalEqualTo(String value) {
            addCriterion("transaction_credit_amount_total =", value, "transactionCreditAmountTotal");
            return (Criteria) this;
        }

        public Criteria andTransactionCreditAmountTotalNotEqualTo(String value) {
            addCriterion("transaction_credit_amount_total <>", value, "transactionCreditAmountTotal");
            return (Criteria) this;
        }

        public Criteria andTransactionCreditAmountTotalGreaterThan(String value) {
            addCriterion("transaction_credit_amount_total >", value, "transactionCreditAmountTotal");
            return (Criteria) this;
        }

        public Criteria andTransactionCreditAmountTotalGreaterThanOrEqualTo(String value) {
            addCriterion("transaction_credit_amount_total >=", value, "transactionCreditAmountTotal");
            return (Criteria) this;
        }

        public Criteria andTransactionCreditAmountTotalLessThan(String value) {
            addCriterion("transaction_credit_amount_total <", value, "transactionCreditAmountTotal");
            return (Criteria) this;
        }

        public Criteria andTransactionCreditAmountTotalLessThanOrEqualTo(String value) {
            addCriterion("transaction_credit_amount_total <=", value, "transactionCreditAmountTotal");
            return (Criteria) this;
        }

        public Criteria andTransactionCreditAmountTotalLike(String value) {
            addCriterion("transaction_credit_amount_total like", value, "transactionCreditAmountTotal");
            return (Criteria) this;
        }

        public Criteria andTransactionCreditAmountTotalNotLike(String value) {
            addCriterion("transaction_credit_amount_total not like", value, "transactionCreditAmountTotal");
            return (Criteria) this;
        }

        public Criteria andTransactionCreditAmountTotalIn(List<String> values) {
            addCriterion("transaction_credit_amount_total in", values, "transactionCreditAmountTotal");
            return (Criteria) this;
        }

        public Criteria andTransactionCreditAmountTotalNotIn(List<String> values) {
            addCriterion("transaction_credit_amount_total not in", values, "transactionCreditAmountTotal");
            return (Criteria) this;
        }

        public Criteria andTransactionCreditAmountTotalBetween(String value1, String value2) {
            addCriterion("transaction_credit_amount_total between", value1, value2, "transactionCreditAmountTotal");
            return (Criteria) this;
        }

        public Criteria andTransactionCreditAmountTotalNotBetween(String value1, String value2) {
            addCriterion("transaction_credit_amount_total not between", value1, value2, "transactionCreditAmountTotal");
            return (Criteria) this;
        }

        public Criteria andTransactionUsedCreditAmountIsNull() {
            addCriterion("transaction_used_credit_amount is null");
            return (Criteria) this;
        }

        public Criteria andTransactionUsedCreditAmountIsNotNull() {
            addCriterion("transaction_used_credit_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionUsedCreditAmountEqualTo(String value) {
            addCriterion("transaction_used_credit_amount =", value, "transactionUsedCreditAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionUsedCreditAmountNotEqualTo(String value) {
            addCriterion("transaction_used_credit_amount <>", value, "transactionUsedCreditAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionUsedCreditAmountGreaterThan(String value) {
            addCriterion("transaction_used_credit_amount >", value, "transactionUsedCreditAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionUsedCreditAmountGreaterThanOrEqualTo(String value) {
            addCriterion("transaction_used_credit_amount >=", value, "transactionUsedCreditAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionUsedCreditAmountLessThan(String value) {
            addCriterion("transaction_used_credit_amount <", value, "transactionUsedCreditAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionUsedCreditAmountLessThanOrEqualTo(String value) {
            addCriterion("transaction_used_credit_amount <=", value, "transactionUsedCreditAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionUsedCreditAmountLike(String value) {
            addCriterion("transaction_used_credit_amount like", value, "transactionUsedCreditAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionUsedCreditAmountNotLike(String value) {
            addCriterion("transaction_used_credit_amount not like", value, "transactionUsedCreditAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionUsedCreditAmountIn(List<String> values) {
            addCriterion("transaction_used_credit_amount in", values, "transactionUsedCreditAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionUsedCreditAmountNotIn(List<String> values) {
            addCriterion("transaction_used_credit_amount not in", values, "transactionUsedCreditAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionUsedCreditAmountBetween(String value1, String value2) {
            addCriterion("transaction_used_credit_amount between", value1, value2, "transactionUsedCreditAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionUsedCreditAmountNotBetween(String value1, String value2) {
            addCriterion("transaction_used_credit_amount not between", value1, value2, "transactionUsedCreditAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionOverdueAmountIsNull() {
            addCriterion("transaction_overdue_amount is null");
            return (Criteria) this;
        }

        public Criteria andTransactionOverdueAmountIsNotNull() {
            addCriterion("transaction_overdue_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionOverdueAmountEqualTo(String value) {
            addCriterion("transaction_overdue_amount =", value, "transactionOverdueAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionOverdueAmountNotEqualTo(String value) {
            addCriterion("transaction_overdue_amount <>", value, "transactionOverdueAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionOverdueAmountGreaterThan(String value) {
            addCriterion("transaction_overdue_amount >", value, "transactionOverdueAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionOverdueAmountGreaterThanOrEqualTo(String value) {
            addCriterion("transaction_overdue_amount >=", value, "transactionOverdueAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionOverdueAmountLessThan(String value) {
            addCriterion("transaction_overdue_amount <", value, "transactionOverdueAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionOverdueAmountLessThanOrEqualTo(String value) {
            addCriterion("transaction_overdue_amount <=", value, "transactionOverdueAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionOverdueAmountLike(String value) {
            addCriterion("transaction_overdue_amount like", value, "transactionOverdueAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionOverdueAmountNotLike(String value) {
            addCriterion("transaction_overdue_amount not like", value, "transactionOverdueAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionOverdueAmountIn(List<String> values) {
            addCriterion("transaction_overdue_amount in", values, "transactionOverdueAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionOverdueAmountNotIn(List<String> values) {
            addCriterion("transaction_overdue_amount not in", values, "transactionOverdueAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionOverdueAmountBetween(String value1, String value2) {
            addCriterion("transaction_overdue_amount between", value1, value2, "transactionOverdueAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionOverdueAmountNotBetween(String value1, String value2) {
            addCriterion("transaction_overdue_amount not between", value1, value2, "transactionOverdueAmount");
            return (Criteria) this;
        }

        public Criteria andOverTimes5ysIsNull() {
            addCriterion("over_times_5ys is null");
            return (Criteria) this;
        }

        public Criteria andOverTimes5ysIsNotNull() {
            addCriterion("over_times_5ys is not null");
            return (Criteria) this;
        }

        public Criteria andOverTimes5ysEqualTo(String value) {
            addCriterion("over_times_5ys =", value, "overTimes5ys");
            return (Criteria) this;
        }

        public Criteria andOverTimes5ysNotEqualTo(String value) {
            addCriterion("over_times_5ys <>", value, "overTimes5ys");
            return (Criteria) this;
        }

        public Criteria andOverTimes5ysGreaterThan(String value) {
            addCriterion("over_times_5ys >", value, "overTimes5ys");
            return (Criteria) this;
        }

        public Criteria andOverTimes5ysGreaterThanOrEqualTo(String value) {
            addCriterion("over_times_5ys >=", value, "overTimes5ys");
            return (Criteria) this;
        }

        public Criteria andOverTimes5ysLessThan(String value) {
            addCriterion("over_times_5ys <", value, "overTimes5ys");
            return (Criteria) this;
        }

        public Criteria andOverTimes5ysLessThanOrEqualTo(String value) {
            addCriterion("over_times_5ys <=", value, "overTimes5ys");
            return (Criteria) this;
        }

        public Criteria andOverTimes5ysLike(String value) {
            addCriterion("over_times_5ys like", value, "overTimes5ys");
            return (Criteria) this;
        }

        public Criteria andOverTimes5ysNotLike(String value) {
            addCriterion("over_times_5ys not like", value, "overTimes5ys");
            return (Criteria) this;
        }

        public Criteria andOverTimes5ysIn(List<String> values) {
            addCriterion("over_times_5ys in", values, "overTimes5ys");
            return (Criteria) this;
        }

        public Criteria andOverTimes5ysNotIn(List<String> values) {
            addCriterion("over_times_5ys not in", values, "overTimes5ys");
            return (Criteria) this;
        }

        public Criteria andOverTimes5ysBetween(String value1, String value2) {
            addCriterion("over_times_5ys between", value1, value2, "overTimes5ys");
            return (Criteria) this;
        }

        public Criteria andOverTimes5ysNotBetween(String value1, String value2) {
            addCriterion("over_times_5ys not between", value1, value2, "overTimes5ys");
            return (Criteria) this;
        }

        public Criteria andOverTimes5ys90dsIsNull() {
            addCriterion("over_times_5ys90ds is null");
            return (Criteria) this;
        }

        public Criteria andOverTimes5ys90dsIsNotNull() {
            addCriterion("over_times_5ys90ds is not null");
            return (Criteria) this;
        }

        public Criteria andOverTimes5ys90dsEqualTo(String value) {
            addCriterion("over_times_5ys90ds =", value, "overTimes5ys90ds");
            return (Criteria) this;
        }

        public Criteria andOverTimes5ys90dsNotEqualTo(String value) {
            addCriterion("over_times_5ys90ds <>", value, "overTimes5ys90ds");
            return (Criteria) this;
        }

        public Criteria andOverTimes5ys90dsGreaterThan(String value) {
            addCriterion("over_times_5ys90ds >", value, "overTimes5ys90ds");
            return (Criteria) this;
        }

        public Criteria andOverTimes5ys90dsGreaterThanOrEqualTo(String value) {
            addCriterion("over_times_5ys90ds >=", value, "overTimes5ys90ds");
            return (Criteria) this;
        }

        public Criteria andOverTimes5ys90dsLessThan(String value) {
            addCriterion("over_times_5ys90ds <", value, "overTimes5ys90ds");
            return (Criteria) this;
        }

        public Criteria andOverTimes5ys90dsLessThanOrEqualTo(String value) {
            addCriterion("over_times_5ys90ds <=", value, "overTimes5ys90ds");
            return (Criteria) this;
        }

        public Criteria andOverTimes5ys90dsLike(String value) {
            addCriterion("over_times_5ys90ds like", value, "overTimes5ys90ds");
            return (Criteria) this;
        }

        public Criteria andOverTimes5ys90dsNotLike(String value) {
            addCriterion("over_times_5ys90ds not like", value, "overTimes5ys90ds");
            return (Criteria) this;
        }

        public Criteria andOverTimes5ys90dsIn(List<String> values) {
            addCriterion("over_times_5ys90ds in", values, "overTimes5ys90ds");
            return (Criteria) this;
        }

        public Criteria andOverTimes5ys90dsNotIn(List<String> values) {
            addCriterion("over_times_5ys90ds not in", values, "overTimes5ys90ds");
            return (Criteria) this;
        }

        public Criteria andOverTimes5ys90dsBetween(String value1, String value2) {
            addCriterion("over_times_5ys90ds between", value1, value2, "overTimes5ys90ds");
            return (Criteria) this;
        }

        public Criteria andOverTimes5ys90dsNotBetween(String value1, String value2) {
            addCriterion("over_times_5ys90ds not between", value1, value2, "overTimes5ys90ds");
            return (Criteria) this;
        }

        public Criteria andLoanBranchIsNull() {
            addCriterion("loan_branch is null");
            return (Criteria) this;
        }

        public Criteria andLoanBranchIsNotNull() {
            addCriterion("loan_branch is not null");
            return (Criteria) this;
        }

        public Criteria andLoanBranchEqualTo(String value) {
            addCriterion("loan_branch =", value, "loanBranch");
            return (Criteria) this;
        }

        public Criteria andLoanBranchNotEqualTo(String value) {
            addCriterion("loan_branch <>", value, "loanBranch");
            return (Criteria) this;
        }

        public Criteria andLoanBranchGreaterThan(String value) {
            addCriterion("loan_branch >", value, "loanBranch");
            return (Criteria) this;
        }

        public Criteria andLoanBranchGreaterThanOrEqualTo(String value) {
            addCriterion("loan_branch >=", value, "loanBranch");
            return (Criteria) this;
        }

        public Criteria andLoanBranchLessThan(String value) {
            addCriterion("loan_branch <", value, "loanBranch");
            return (Criteria) this;
        }

        public Criteria andLoanBranchLessThanOrEqualTo(String value) {
            addCriterion("loan_branch <=", value, "loanBranch");
            return (Criteria) this;
        }

        public Criteria andLoanBranchLike(String value) {
            addCriterion("loan_branch like", value, "loanBranch");
            return (Criteria) this;
        }

        public Criteria andLoanBranchNotLike(String value) {
            addCriterion("loan_branch not like", value, "loanBranch");
            return (Criteria) this;
        }

        public Criteria andLoanBranchIn(List<String> values) {
            addCriterion("loan_branch in", values, "loanBranch");
            return (Criteria) this;
        }

        public Criteria andLoanBranchNotIn(List<String> values) {
            addCriterion("loan_branch not in", values, "loanBranch");
            return (Criteria) this;
        }

        public Criteria andLoanBranchBetween(String value1, String value2) {
            addCriterion("loan_branch between", value1, value2, "loanBranch");
            return (Criteria) this;
        }

        public Criteria andLoanBranchNotBetween(String value1, String value2) {
            addCriterion("loan_branch not between", value1, value2, "loanBranch");
            return (Criteria) this;
        }

        public Criteria andTransactionEndDateIsNull() {
            addCriterion("transaction_end_date is null");
            return (Criteria) this;
        }

        public Criteria andTransactionEndDateIsNotNull() {
            addCriterion("transaction_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionEndDateEqualTo(String value) {
            addCriterion("transaction_end_date =", value, "transactionEndDate");
            return (Criteria) this;
        }

        public Criteria andTransactionEndDateNotEqualTo(String value) {
            addCriterion("transaction_end_date <>", value, "transactionEndDate");
            return (Criteria) this;
        }

        public Criteria andTransactionEndDateGreaterThan(String value) {
            addCriterion("transaction_end_date >", value, "transactionEndDate");
            return (Criteria) this;
        }

        public Criteria andTransactionEndDateGreaterThanOrEqualTo(String value) {
            addCriterion("transaction_end_date >=", value, "transactionEndDate");
            return (Criteria) this;
        }

        public Criteria andTransactionEndDateLessThan(String value) {
            addCriterion("transaction_end_date <", value, "transactionEndDate");
            return (Criteria) this;
        }

        public Criteria andTransactionEndDateLessThanOrEqualTo(String value) {
            addCriterion("transaction_end_date <=", value, "transactionEndDate");
            return (Criteria) this;
        }

        public Criteria andTransactionEndDateLike(String value) {
            addCriterion("transaction_end_date like", value, "transactionEndDate");
            return (Criteria) this;
        }

        public Criteria andTransactionEndDateNotLike(String value) {
            addCriterion("transaction_end_date not like", value, "transactionEndDate");
            return (Criteria) this;
        }

        public Criteria andTransactionEndDateIn(List<String> values) {
            addCriterion("transaction_end_date in", values, "transactionEndDate");
            return (Criteria) this;
        }

        public Criteria andTransactionEndDateNotIn(List<String> values) {
            addCriterion("transaction_end_date not in", values, "transactionEndDate");
            return (Criteria) this;
        }

        public Criteria andTransactionEndDateBetween(String value1, String value2) {
            addCriterion("transaction_end_date between", value1, value2, "transactionEndDate");
            return (Criteria) this;
        }

        public Criteria andTransactionEndDateNotBetween(String value1, String value2) {
            addCriterion("transaction_end_date not between", value1, value2, "transactionEndDate");
            return (Criteria) this;
        }

        public Criteria andTransactionLoanAmountIsNull() {
            addCriterion("transaction_loan_amount is null");
            return (Criteria) this;
        }

        public Criteria andTransactionLoanAmountIsNotNull() {
            addCriterion("transaction_loan_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionLoanAmountEqualTo(String value) {
            addCriterion("transaction_loan_amount =", value, "transactionLoanAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionLoanAmountNotEqualTo(String value) {
            addCriterion("transaction_loan_amount <>", value, "transactionLoanAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionLoanAmountGreaterThan(String value) {
            addCriterion("transaction_loan_amount >", value, "transactionLoanAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionLoanAmountGreaterThanOrEqualTo(String value) {
            addCriterion("transaction_loan_amount >=", value, "transactionLoanAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionLoanAmountLessThan(String value) {
            addCriterion("transaction_loan_amount <", value, "transactionLoanAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionLoanAmountLessThanOrEqualTo(String value) {
            addCriterion("transaction_loan_amount <=", value, "transactionLoanAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionLoanAmountLike(String value) {
            addCriterion("transaction_loan_amount like", value, "transactionLoanAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionLoanAmountNotLike(String value) {
            addCriterion("transaction_loan_amount not like", value, "transactionLoanAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionLoanAmountIn(List<String> values) {
            addCriterion("transaction_loan_amount in", values, "transactionLoanAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionLoanAmountNotIn(List<String> values) {
            addCriterion("transaction_loan_amount not in", values, "transactionLoanAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionLoanAmountBetween(String value1, String value2) {
            addCriterion("transaction_loan_amount between", value1, value2, "transactionLoanAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionLoanAmountNotBetween(String value1, String value2) {
            addCriterion("transaction_loan_amount not between", value1, value2, "transactionLoanAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionLeftCreditAmountIsNull() {
            addCriterion("transaction_left_credit_amount is null");
            return (Criteria) this;
        }

        public Criteria andTransactionLeftCreditAmountIsNotNull() {
            addCriterion("transaction_left_credit_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionLeftCreditAmountEqualTo(String value) {
            addCriterion("transaction_left_credit_amount =", value, "transactionLeftCreditAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionLeftCreditAmountNotEqualTo(String value) {
            addCriterion("transaction_left_credit_amount <>", value, "transactionLeftCreditAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionLeftCreditAmountGreaterThan(String value) {
            addCriterion("transaction_left_credit_amount >", value, "transactionLeftCreditAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionLeftCreditAmountGreaterThanOrEqualTo(String value) {
            addCriterion("transaction_left_credit_amount >=", value, "transactionLeftCreditAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionLeftCreditAmountLessThan(String value) {
            addCriterion("transaction_left_credit_amount <", value, "transactionLeftCreditAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionLeftCreditAmountLessThanOrEqualTo(String value) {
            addCriterion("transaction_left_credit_amount <=", value, "transactionLeftCreditAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionLeftCreditAmountLike(String value) {
            addCriterion("transaction_left_credit_amount like", value, "transactionLeftCreditAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionLeftCreditAmountNotLike(String value) {
            addCriterion("transaction_left_credit_amount not like", value, "transactionLeftCreditAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionLeftCreditAmountIn(List<String> values) {
            addCriterion("transaction_left_credit_amount in", values, "transactionLeftCreditAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionLeftCreditAmountNotIn(List<String> values) {
            addCriterion("transaction_left_credit_amount not in", values, "transactionLeftCreditAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionLeftCreditAmountBetween(String value1, String value2) {
            addCriterion("transaction_left_credit_amount between", value1, value2, "transactionLeftCreditAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionLeftCreditAmountNotBetween(String value1, String value2) {
            addCriterion("transaction_left_credit_amount not between", value1, value2, "transactionLeftCreditAmount");
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