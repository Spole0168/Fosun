package com.fosun.data.dataTask.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataCreditDatilTransactionInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DataCreditDatilTransactionInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected DataCreditDatilTransactionInfoExample(DataCreditDatilTransactionInfoExample example) {
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

        public Criteria andTransactionLoanTypeIsNull() {
            addCriterion("transaction_loan_type is null");
            return (Criteria) this;
        }

        public Criteria andTransactionLoanTypeIsNotNull() {
            addCriterion("transaction_loan_type is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionLoanTypeEqualTo(String value) {
            addCriterion("transaction_loan_type =", value, "transactionLoanType");
            return (Criteria) this;
        }

        public Criteria andTransactionLoanTypeNotEqualTo(String value) {
            addCriterion("transaction_loan_type <>", value, "transactionLoanType");
            return (Criteria) this;
        }

        public Criteria andTransactionLoanTypeGreaterThan(String value) {
            addCriterion("transaction_loan_type >", value, "transactionLoanType");
            return (Criteria) this;
        }

        public Criteria andTransactionLoanTypeGreaterThanOrEqualTo(String value) {
            addCriterion("transaction_loan_type >=", value, "transactionLoanType");
            return (Criteria) this;
        }

        public Criteria andTransactionLoanTypeLessThan(String value) {
            addCriterion("transaction_loan_type <", value, "transactionLoanType");
            return (Criteria) this;
        }

        public Criteria andTransactionLoanTypeLessThanOrEqualTo(String value) {
            addCriterion("transaction_loan_type <=", value, "transactionLoanType");
            return (Criteria) this;
        }

        public Criteria andTransactionLoanTypeLike(String value) {
            addCriterion("transaction_loan_type like", value, "transactionLoanType");
            return (Criteria) this;
        }

        public Criteria andTransactionLoanTypeNotLike(String value) {
            addCriterion("transaction_loan_type not like", value, "transactionLoanType");
            return (Criteria) this;
        }

        public Criteria andTransactionLoanTypeIn(List<String> values) {
            addCriterion("transaction_loan_type in", values, "transactionLoanType");
            return (Criteria) this;
        }

        public Criteria andTransactionLoanTypeNotIn(List<String> values) {
            addCriterion("transaction_loan_type not in", values, "transactionLoanType");
            return (Criteria) this;
        }

        public Criteria andTransactionLoanTypeBetween(String value1, String value2) {
            addCriterion("transaction_loan_type between", value1, value2, "transactionLoanType");
            return (Criteria) this;
        }

        public Criteria andTransactionLoanTypeNotBetween(String value1, String value2) {
            addCriterion("transaction_loan_type not between", value1, value2, "transactionLoanType");
            return (Criteria) this;
        }

        public Criteria andTransactionBranchIsNull() {
            addCriterion("transaction_branch is null");
            return (Criteria) this;
        }

        public Criteria andTransactionBranchIsNotNull() {
            addCriterion("transaction_branch is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionBranchEqualTo(String value) {
            addCriterion("transaction_branch =", value, "transactionBranch");
            return (Criteria) this;
        }

        public Criteria andTransactionBranchNotEqualTo(String value) {
            addCriterion("transaction_branch <>", value, "transactionBranch");
            return (Criteria) this;
        }

        public Criteria andTransactionBranchGreaterThan(String value) {
            addCriterion("transaction_branch >", value, "transactionBranch");
            return (Criteria) this;
        }

        public Criteria andTransactionBranchGreaterThanOrEqualTo(String value) {
            addCriterion("transaction_branch >=", value, "transactionBranch");
            return (Criteria) this;
        }

        public Criteria andTransactionBranchLessThan(String value) {
            addCriterion("transaction_branch <", value, "transactionBranch");
            return (Criteria) this;
        }

        public Criteria andTransactionBranchLessThanOrEqualTo(String value) {
            addCriterion("transaction_branch <=", value, "transactionBranch");
            return (Criteria) this;
        }

        public Criteria andTransactionBranchLike(String value) {
            addCriterion("transaction_branch like", value, "transactionBranch");
            return (Criteria) this;
        }

        public Criteria andTransactionBranchNotLike(String value) {
            addCriterion("transaction_branch not like", value, "transactionBranch");
            return (Criteria) this;
        }

        public Criteria andTransactionBranchIn(List<String> values) {
            addCriterion("transaction_branch in", values, "transactionBranch");
            return (Criteria) this;
        }

        public Criteria andTransactionBranchNotIn(List<String> values) {
            addCriterion("transaction_branch not in", values, "transactionBranch");
            return (Criteria) this;
        }

        public Criteria andTransactionBranchBetween(String value1, String value2) {
            addCriterion("transaction_branch between", value1, value2, "transactionBranch");
            return (Criteria) this;
        }

        public Criteria andTransactionBranchNotBetween(String value1, String value2) {
            addCriterion("transaction_branch not between", value1, value2, "transactionBranch");
            return (Criteria) this;
        }

        public Criteria andTransactionLoanMortgageTypeIsNull() {
            addCriterion("transaction_loan_mortgage_type is null");
            return (Criteria) this;
        }

        public Criteria andTransactionLoanMortgageTypeIsNotNull() {
            addCriterion("transaction_loan_mortgage_type is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionLoanMortgageTypeEqualTo(String value) {
            addCriterion("transaction_loan_mortgage_type =", value, "transactionLoanMortgageType");
            return (Criteria) this;
        }

        public Criteria andTransactionLoanMortgageTypeNotEqualTo(String value) {
            addCriterion("transaction_loan_mortgage_type <>", value, "transactionLoanMortgageType");
            return (Criteria) this;
        }

        public Criteria andTransactionLoanMortgageTypeGreaterThan(String value) {
            addCriterion("transaction_loan_mortgage_type >", value, "transactionLoanMortgageType");
            return (Criteria) this;
        }

        public Criteria andTransactionLoanMortgageTypeGreaterThanOrEqualTo(String value) {
            addCriterion("transaction_loan_mortgage_type >=", value, "transactionLoanMortgageType");
            return (Criteria) this;
        }

        public Criteria andTransactionLoanMortgageTypeLessThan(String value) {
            addCriterion("transaction_loan_mortgage_type <", value, "transactionLoanMortgageType");
            return (Criteria) this;
        }

        public Criteria andTransactionLoanMortgageTypeLessThanOrEqualTo(String value) {
            addCriterion("transaction_loan_mortgage_type <=", value, "transactionLoanMortgageType");
            return (Criteria) this;
        }

        public Criteria andTransactionLoanMortgageTypeLike(String value) {
            addCriterion("transaction_loan_mortgage_type like", value, "transactionLoanMortgageType");
            return (Criteria) this;
        }

        public Criteria andTransactionLoanMortgageTypeNotLike(String value) {
            addCriterion("transaction_loan_mortgage_type not like", value, "transactionLoanMortgageType");
            return (Criteria) this;
        }

        public Criteria andTransactionLoanMortgageTypeIn(List<String> values) {
            addCriterion("transaction_loan_mortgage_type in", values, "transactionLoanMortgageType");
            return (Criteria) this;
        }

        public Criteria andTransactionLoanMortgageTypeNotIn(List<String> values) {
            addCriterion("transaction_loan_mortgage_type not in", values, "transactionLoanMortgageType");
            return (Criteria) this;
        }

        public Criteria andTransactionLoanMortgageTypeBetween(String value1, String value2) {
            addCriterion("transaction_loan_mortgage_type between", value1, value2, "transactionLoanMortgageType");
            return (Criteria) this;
        }

        public Criteria andTransactionLoanMortgageTypeNotBetween(String value1, String value2) {
            addCriterion("transaction_loan_mortgage_type not between", value1, value2, "transactionLoanMortgageType");
            return (Criteria) this;
        }

        public Criteria andTransactionLoanTremIsNull() {
            addCriterion("transaction_loan_trem is null");
            return (Criteria) this;
        }

        public Criteria andTransactionLoanTremIsNotNull() {
            addCriterion("transaction_loan_trem is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionLoanTremEqualTo(String value) {
            addCriterion("transaction_loan_trem =", value, "transactionLoanTrem");
            return (Criteria) this;
        }

        public Criteria andTransactionLoanTremNotEqualTo(String value) {
            addCriterion("transaction_loan_trem <>", value, "transactionLoanTrem");
            return (Criteria) this;
        }

        public Criteria andTransactionLoanTremGreaterThan(String value) {
            addCriterion("transaction_loan_trem >", value, "transactionLoanTrem");
            return (Criteria) this;
        }

        public Criteria andTransactionLoanTremGreaterThanOrEqualTo(String value) {
            addCriterion("transaction_loan_trem >=", value, "transactionLoanTrem");
            return (Criteria) this;
        }

        public Criteria andTransactionLoanTremLessThan(String value) {
            addCriterion("transaction_loan_trem <", value, "transactionLoanTrem");
            return (Criteria) this;
        }

        public Criteria andTransactionLoanTremLessThanOrEqualTo(String value) {
            addCriterion("transaction_loan_trem <=", value, "transactionLoanTrem");
            return (Criteria) this;
        }

        public Criteria andTransactionLoanTremLike(String value) {
            addCriterion("transaction_loan_trem like", value, "transactionLoanTrem");
            return (Criteria) this;
        }

        public Criteria andTransactionLoanTremNotLike(String value) {
            addCriterion("transaction_loan_trem not like", value, "transactionLoanTrem");
            return (Criteria) this;
        }

        public Criteria andTransactionLoanTremIn(List<String> values) {
            addCriterion("transaction_loan_trem in", values, "transactionLoanTrem");
            return (Criteria) this;
        }

        public Criteria andTransactionLoanTremNotIn(List<String> values) {
            addCriterion("transaction_loan_trem not in", values, "transactionLoanTrem");
            return (Criteria) this;
        }

        public Criteria andTransactionLoanTremBetween(String value1, String value2) {
            addCriterion("transaction_loan_trem between", value1, value2, "transactionLoanTrem");
            return (Criteria) this;
        }

        public Criteria andTransactionLoanTremNotBetween(String value1, String value2) {
            addCriterion("transaction_loan_trem not between", value1, value2, "transactionLoanTrem");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusIsNull() {
            addCriterion("transaction_status is null");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusIsNotNull() {
            addCriterion("transaction_status is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusEqualTo(String value) {
            addCriterion("transaction_status =", value, "transactionStatus");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusNotEqualTo(String value) {
            addCriterion("transaction_status <>", value, "transactionStatus");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusGreaterThan(String value) {
            addCriterion("transaction_status >", value, "transactionStatus");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusGreaterThanOrEqualTo(String value) {
            addCriterion("transaction_status >=", value, "transactionStatus");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusLessThan(String value) {
            addCriterion("transaction_status <", value, "transactionStatus");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusLessThanOrEqualTo(String value) {
            addCriterion("transaction_status <=", value, "transactionStatus");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusLike(String value) {
            addCriterion("transaction_status like", value, "transactionStatus");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusNotLike(String value) {
            addCriterion("transaction_status not like", value, "transactionStatus");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusIn(List<String> values) {
            addCriterion("transaction_status in", values, "transactionStatus");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusNotIn(List<String> values) {
            addCriterion("transaction_status not in", values, "transactionStatus");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusBetween(String value1, String value2) {
            addCriterion("transaction_status between", value1, value2, "transactionStatus");
            return (Criteria) this;
        }

        public Criteria andTransactionStatusNotBetween(String value1, String value2) {
            addCriterion("transaction_status not between", value1, value2, "transactionStatus");
            return (Criteria) this;
        }

        public Criteria andRansactionLoanDueDateIsNull() {
            addCriterion("ransaction_loan_due_date is null");
            return (Criteria) this;
        }

        public Criteria andRansactionLoanDueDateIsNotNull() {
            addCriterion("ransaction_loan_due_date is not null");
            return (Criteria) this;
        }

        public Criteria andRansactionLoanDueDateEqualTo(String value) {
            addCriterion("ransaction_loan_due_date =", value, "ransactionLoanDueDate");
            return (Criteria) this;
        }

        public Criteria andRansactionLoanDueDateNotEqualTo(String value) {
            addCriterion("ransaction_loan_due_date <>", value, "ransactionLoanDueDate");
            return (Criteria) this;
        }

        public Criteria andRansactionLoanDueDateGreaterThan(String value) {
            addCriterion("ransaction_loan_due_date >", value, "ransactionLoanDueDate");
            return (Criteria) this;
        }

        public Criteria andRansactionLoanDueDateGreaterThanOrEqualTo(String value) {
            addCriterion("ransaction_loan_due_date >=", value, "ransactionLoanDueDate");
            return (Criteria) this;
        }

        public Criteria andRansactionLoanDueDateLessThan(String value) {
            addCriterion("ransaction_loan_due_date <", value, "ransactionLoanDueDate");
            return (Criteria) this;
        }

        public Criteria andRansactionLoanDueDateLessThanOrEqualTo(String value) {
            addCriterion("ransaction_loan_due_date <=", value, "ransactionLoanDueDate");
            return (Criteria) this;
        }

        public Criteria andRansactionLoanDueDateLike(String value) {
            addCriterion("ransaction_loan_due_date like", value, "ransactionLoanDueDate");
            return (Criteria) this;
        }

        public Criteria andRansactionLoanDueDateNotLike(String value) {
            addCriterion("ransaction_loan_due_date not like", value, "ransactionLoanDueDate");
            return (Criteria) this;
        }

        public Criteria andRansactionLoanDueDateIn(List<String> values) {
            addCriterion("ransaction_loan_due_date in", values, "ransactionLoanDueDate");
            return (Criteria) this;
        }

        public Criteria andRansactionLoanDueDateNotIn(List<String> values) {
            addCriterion("ransaction_loan_due_date not in", values, "ransactionLoanDueDate");
            return (Criteria) this;
        }

        public Criteria andRansactionLoanDueDateBetween(String value1, String value2) {
            addCriterion("ransaction_loan_due_date between", value1, value2, "ransactionLoanDueDate");
            return (Criteria) this;
        }

        public Criteria andRansactionLoanDueDateNotBetween(String value1, String value2) {
            addCriterion("ransaction_loan_due_date not between", value1, value2, "ransactionLoanDueDate");
            return (Criteria) this;
        }

        public Criteria andRansactionLoan5classTypeIsNull() {
            addCriterion("ransaction_loan_5class_type is null");
            return (Criteria) this;
        }

        public Criteria andRansactionLoan5classTypeIsNotNull() {
            addCriterion("ransaction_loan_5class_type is not null");
            return (Criteria) this;
        }

        public Criteria andRansactionLoan5classTypeEqualTo(String value) {
            addCriterion("ransaction_loan_5class_type =", value, "ransactionLoan5classType");
            return (Criteria) this;
        }

        public Criteria andRansactionLoan5classTypeNotEqualTo(String value) {
            addCriterion("ransaction_loan_5class_type <>", value, "ransactionLoan5classType");
            return (Criteria) this;
        }

        public Criteria andRansactionLoan5classTypeGreaterThan(String value) {
            addCriterion("ransaction_loan_5class_type >", value, "ransactionLoan5classType");
            return (Criteria) this;
        }

        public Criteria andRansactionLoan5classTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ransaction_loan_5class_type >=", value, "ransactionLoan5classType");
            return (Criteria) this;
        }

        public Criteria andRansactionLoan5classTypeLessThan(String value) {
            addCriterion("ransaction_loan_5class_type <", value, "ransactionLoan5classType");
            return (Criteria) this;
        }

        public Criteria andRansactionLoan5classTypeLessThanOrEqualTo(String value) {
            addCriterion("ransaction_loan_5class_type <=", value, "ransactionLoan5classType");
            return (Criteria) this;
        }

        public Criteria andRansactionLoan5classTypeLike(String value) {
            addCriterion("ransaction_loan_5class_type like", value, "ransactionLoan5classType");
            return (Criteria) this;
        }

        public Criteria andRansactionLoan5classTypeNotLike(String value) {
            addCriterion("ransaction_loan_5class_type not like", value, "ransactionLoan5classType");
            return (Criteria) this;
        }

        public Criteria andRansactionLoan5classTypeIn(List<String> values) {
            addCriterion("ransaction_loan_5class_type in", values, "ransactionLoan5classType");
            return (Criteria) this;
        }

        public Criteria andRansactionLoan5classTypeNotIn(List<String> values) {
            addCriterion("ransaction_loan_5class_type not in", values, "ransactionLoan5classType");
            return (Criteria) this;
        }

        public Criteria andRansactionLoan5classTypeBetween(String value1, String value2) {
            addCriterion("ransaction_loan_5class_type between", value1, value2, "ransactionLoan5classType");
            return (Criteria) this;
        }

        public Criteria andRansactionLoan5classTypeNotBetween(String value1, String value2) {
            addCriterion("ransaction_loan_5class_type not between", value1, value2, "ransactionLoan5classType");
            return (Criteria) this;
        }

        public Criteria andRansactionLoanLeftPrincipalAmountIsNull() {
            addCriterion("ransaction_loan_left_principal_amount is null");
            return (Criteria) this;
        }

        public Criteria andRansactionLoanLeftPrincipalAmountIsNotNull() {
            addCriterion("ransaction_loan_left_principal_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRansactionLoanLeftPrincipalAmountEqualTo(String value) {
            addCriterion("ransaction_loan_left_principal_amount =", value, "ransactionLoanLeftPrincipalAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionLoanLeftPrincipalAmountNotEqualTo(String value) {
            addCriterion("ransaction_loan_left_principal_amount <>", value, "ransactionLoanLeftPrincipalAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionLoanLeftPrincipalAmountGreaterThan(String value) {
            addCriterion("ransaction_loan_left_principal_amount >", value, "ransactionLoanLeftPrincipalAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionLoanLeftPrincipalAmountGreaterThanOrEqualTo(String value) {
            addCriterion("ransaction_loan_left_principal_amount >=", value, "ransactionLoanLeftPrincipalAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionLoanLeftPrincipalAmountLessThan(String value) {
            addCriterion("ransaction_loan_left_principal_amount <", value, "ransactionLoanLeftPrincipalAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionLoanLeftPrincipalAmountLessThanOrEqualTo(String value) {
            addCriterion("ransaction_loan_left_principal_amount <=", value, "ransactionLoanLeftPrincipalAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionLoanLeftPrincipalAmountLike(String value) {
            addCriterion("ransaction_loan_left_principal_amount like", value, "ransactionLoanLeftPrincipalAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionLoanLeftPrincipalAmountNotLike(String value) {
            addCriterion("ransaction_loan_left_principal_amount not like", value, "ransactionLoanLeftPrincipalAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionLoanLeftPrincipalAmountIn(List<String> values) {
            addCriterion("ransaction_loan_left_principal_amount in", values, "ransactionLoanLeftPrincipalAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionLoanLeftPrincipalAmountNotIn(List<String> values) {
            addCriterion("ransaction_loan_left_principal_amount not in", values, "ransactionLoanLeftPrincipalAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionLoanLeftPrincipalAmountBetween(String value1, String value2) {
            addCriterion("ransaction_loan_left_principal_amount between", value1, value2, "ransactionLoanLeftPrincipalAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionLoanLeftPrincipalAmountNotBetween(String value1, String value2) {
            addCriterion("ransaction_loan_left_principal_amount not between", value1, value2, "ransactionLoanLeftPrincipalAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionThismonthReturnAmountIsNull() {
            addCriterion("ransaction_thismonth_return_amount is null");
            return (Criteria) this;
        }

        public Criteria andRansactionThismonthReturnAmountIsNotNull() {
            addCriterion("ransaction_thismonth_return_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRansactionThismonthReturnAmountEqualTo(String value) {
            addCriterion("ransaction_thismonth_return_amount =", value, "ransactionThismonthReturnAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionThismonthReturnAmountNotEqualTo(String value) {
            addCriterion("ransaction_thismonth_return_amount <>", value, "ransactionThismonthReturnAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionThismonthReturnAmountGreaterThan(String value) {
            addCriterion("ransaction_thismonth_return_amount >", value, "ransactionThismonthReturnAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionThismonthReturnAmountGreaterThanOrEqualTo(String value) {
            addCriterion("ransaction_thismonth_return_amount >=", value, "ransactionThismonthReturnAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionThismonthReturnAmountLessThan(String value) {
            addCriterion("ransaction_thismonth_return_amount <", value, "ransactionThismonthReturnAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionThismonthReturnAmountLessThanOrEqualTo(String value) {
            addCriterion("ransaction_thismonth_return_amount <=", value, "ransactionThismonthReturnAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionThismonthReturnAmountLike(String value) {
            addCriterion("ransaction_thismonth_return_amount like", value, "ransactionThismonthReturnAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionThismonthReturnAmountNotLike(String value) {
            addCriterion("ransaction_thismonth_return_amount not like", value, "ransactionThismonthReturnAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionThismonthReturnAmountIn(List<String> values) {
            addCriterion("ransaction_thismonth_return_amount in", values, "ransactionThismonthReturnAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionThismonthReturnAmountNotIn(List<String> values) {
            addCriterion("ransaction_thismonth_return_amount not in", values, "ransactionThismonthReturnAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionThismonthReturnAmountBetween(String value1, String value2) {
            addCriterion("ransaction_thismonth_return_amount between", value1, value2, "ransactionThismonthReturnAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionThismonthReturnAmountNotBetween(String value1, String value2) {
            addCriterion("ransaction_thismonth_return_amount not between", value1, value2, "ransactionThismonthReturnAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionThismonthReturnedAmountIsNull() {
            addCriterion("ransaction_thismonth_returned_amount is null");
            return (Criteria) this;
        }

        public Criteria andRansactionThismonthReturnedAmountIsNotNull() {
            addCriterion("ransaction_thismonth_returned_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRansactionThismonthReturnedAmountEqualTo(String value) {
            addCriterion("ransaction_thismonth_returned_amount =", value, "ransactionThismonthReturnedAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionThismonthReturnedAmountNotEqualTo(String value) {
            addCriterion("ransaction_thismonth_returned_amount <>", value, "ransactionThismonthReturnedAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionThismonthReturnedAmountGreaterThan(String value) {
            addCriterion("ransaction_thismonth_returned_amount >", value, "ransactionThismonthReturnedAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionThismonthReturnedAmountGreaterThanOrEqualTo(String value) {
            addCriterion("ransaction_thismonth_returned_amount >=", value, "ransactionThismonthReturnedAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionThismonthReturnedAmountLessThan(String value) {
            addCriterion("ransaction_thismonth_returned_amount <", value, "ransactionThismonthReturnedAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionThismonthReturnedAmountLessThanOrEqualTo(String value) {
            addCriterion("ransaction_thismonth_returned_amount <=", value, "ransactionThismonthReturnedAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionThismonthReturnedAmountLike(String value) {
            addCriterion("ransaction_thismonth_returned_amount like", value, "ransactionThismonthReturnedAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionThismonthReturnedAmountNotLike(String value) {
            addCriterion("ransaction_thismonth_returned_amount not like", value, "ransactionThismonthReturnedAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionThismonthReturnedAmountIn(List<String> values) {
            addCriterion("ransaction_thismonth_returned_amount in", values, "ransactionThismonthReturnedAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionThismonthReturnedAmountNotIn(List<String> values) {
            addCriterion("ransaction_thismonth_returned_amount not in", values, "ransactionThismonthReturnedAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionThismonthReturnedAmountBetween(String value1, String value2) {
            addCriterion("ransaction_thismonth_returned_amount between", value1, value2, "ransactionThismonthReturnedAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionThismonthReturnedAmountNotBetween(String value1, String value2) {
            addCriterion("ransaction_thismonth_returned_amount not between", value1, value2, "ransactionThismonthReturnedAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionLast24termOverdueStatusIsNull() {
            addCriterion("ransaction_last24term_overdue_status is null");
            return (Criteria) this;
        }

        public Criteria andRansactionLast24termOverdueStatusIsNotNull() {
            addCriterion("ransaction_last24term_overdue_status is not null");
            return (Criteria) this;
        }

        public Criteria andRansactionLast24termOverdueStatusEqualTo(String value) {
            addCriterion("ransaction_last24term_overdue_status =", value, "ransactionLast24termOverdueStatus");
            return (Criteria) this;
        }

        public Criteria andRansactionLast24termOverdueStatusNotEqualTo(String value) {
            addCriterion("ransaction_last24term_overdue_status <>", value, "ransactionLast24termOverdueStatus");
            return (Criteria) this;
        }

        public Criteria andRansactionLast24termOverdueStatusGreaterThan(String value) {
            addCriterion("ransaction_last24term_overdue_status >", value, "ransactionLast24termOverdueStatus");
            return (Criteria) this;
        }

        public Criteria andRansactionLast24termOverdueStatusGreaterThanOrEqualTo(String value) {
            addCriterion("ransaction_last24term_overdue_status >=", value, "ransactionLast24termOverdueStatus");
            return (Criteria) this;
        }

        public Criteria andRansactionLast24termOverdueStatusLessThan(String value) {
            addCriterion("ransaction_last24term_overdue_status <", value, "ransactionLast24termOverdueStatus");
            return (Criteria) this;
        }

        public Criteria andRansactionLast24termOverdueStatusLessThanOrEqualTo(String value) {
            addCriterion("ransaction_last24term_overdue_status <=", value, "ransactionLast24termOverdueStatus");
            return (Criteria) this;
        }

        public Criteria andRansactionLast24termOverdueStatusLike(String value) {
            addCriterion("ransaction_last24term_overdue_status like", value, "ransactionLast24termOverdueStatus");
            return (Criteria) this;
        }

        public Criteria andRansactionLast24termOverdueStatusNotLike(String value) {
            addCriterion("ransaction_last24term_overdue_status not like", value, "ransactionLast24termOverdueStatus");
            return (Criteria) this;
        }

        public Criteria andRansactionLast24termOverdueStatusIn(List<String> values) {
            addCriterion("ransaction_last24term_overdue_status in", values, "ransactionLast24termOverdueStatus");
            return (Criteria) this;
        }

        public Criteria andRansactionLast24termOverdueStatusNotIn(List<String> values) {
            addCriterion("ransaction_last24term_overdue_status not in", values, "ransactionLast24termOverdueStatus");
            return (Criteria) this;
        }

        public Criteria andRansactionLast24termOverdueStatusBetween(String value1, String value2) {
            addCriterion("ransaction_last24term_overdue_status between", value1, value2, "ransactionLast24termOverdueStatus");
            return (Criteria) this;
        }

        public Criteria andRansactionLast24termOverdueStatusNotBetween(String value1, String value2) {
            addCriterion("ransaction_last24term_overdue_status not between", value1, value2, "ransactionLast24termOverdueStatus");
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

        public Criteria andTransactionShareCreditAmountTotalIsNull() {
            addCriterion("transaction_share_credit_amount_total is null");
            return (Criteria) this;
        }

        public Criteria andTransactionShareCreditAmountTotalIsNotNull() {
            addCriterion("transaction_share_credit_amount_total is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionShareCreditAmountTotalEqualTo(String value) {
            addCriterion("transaction_share_credit_amount_total =", value, "transactionShareCreditAmountTotal");
            return (Criteria) this;
        }

        public Criteria andTransactionShareCreditAmountTotalNotEqualTo(String value) {
            addCriterion("transaction_share_credit_amount_total <>", value, "transactionShareCreditAmountTotal");
            return (Criteria) this;
        }

        public Criteria andTransactionShareCreditAmountTotalGreaterThan(String value) {
            addCriterion("transaction_share_credit_amount_total >", value, "transactionShareCreditAmountTotal");
            return (Criteria) this;
        }

        public Criteria andTransactionShareCreditAmountTotalGreaterThanOrEqualTo(String value) {
            addCriterion("transaction_share_credit_amount_total >=", value, "transactionShareCreditAmountTotal");
            return (Criteria) this;
        }

        public Criteria andTransactionShareCreditAmountTotalLessThan(String value) {
            addCriterion("transaction_share_credit_amount_total <", value, "transactionShareCreditAmountTotal");
            return (Criteria) this;
        }

        public Criteria andTransactionShareCreditAmountTotalLessThanOrEqualTo(String value) {
            addCriterion("transaction_share_credit_amount_total <=", value, "transactionShareCreditAmountTotal");
            return (Criteria) this;
        }

        public Criteria andTransactionShareCreditAmountTotalLike(String value) {
            addCriterion("transaction_share_credit_amount_total like", value, "transactionShareCreditAmountTotal");
            return (Criteria) this;
        }

        public Criteria andTransactionShareCreditAmountTotalNotLike(String value) {
            addCriterion("transaction_share_credit_amount_total not like", value, "transactionShareCreditAmountTotal");
            return (Criteria) this;
        }

        public Criteria andTransactionShareCreditAmountTotalIn(List<String> values) {
            addCriterion("transaction_share_credit_amount_total in", values, "transactionShareCreditAmountTotal");
            return (Criteria) this;
        }

        public Criteria andTransactionShareCreditAmountTotalNotIn(List<String> values) {
            addCriterion("transaction_share_credit_amount_total not in", values, "transactionShareCreditAmountTotal");
            return (Criteria) this;
        }

        public Criteria andTransactionShareCreditAmountTotalBetween(String value1, String value2) {
            addCriterion("transaction_share_credit_amount_total between", value1, value2, "transactionShareCreditAmountTotal");
            return (Criteria) this;
        }

        public Criteria andTransactionShareCreditAmountTotalNotBetween(String value1, String value2) {
            addCriterion("transaction_share_credit_amount_total not between", value1, value2, "transactionShareCreditAmountTotal");
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

        public Criteria andTransactionMaxUsedCreditAmountIsNull() {
            addCriterion("transaction_max_used_credit_amount is null");
            return (Criteria) this;
        }

        public Criteria andTransactionMaxUsedCreditAmountIsNotNull() {
            addCriterion("transaction_max_used_credit_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionMaxUsedCreditAmountEqualTo(String value) {
            addCriterion("transaction_max_used_credit_amount =", value, "transactionMaxUsedCreditAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionMaxUsedCreditAmountNotEqualTo(String value) {
            addCriterion("transaction_max_used_credit_amount <>", value, "transactionMaxUsedCreditAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionMaxUsedCreditAmountGreaterThan(String value) {
            addCriterion("transaction_max_used_credit_amount >", value, "transactionMaxUsedCreditAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionMaxUsedCreditAmountGreaterThanOrEqualTo(String value) {
            addCriterion("transaction_max_used_credit_amount >=", value, "transactionMaxUsedCreditAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionMaxUsedCreditAmountLessThan(String value) {
            addCriterion("transaction_max_used_credit_amount <", value, "transactionMaxUsedCreditAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionMaxUsedCreditAmountLessThanOrEqualTo(String value) {
            addCriterion("transaction_max_used_credit_amount <=", value, "transactionMaxUsedCreditAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionMaxUsedCreditAmountLike(String value) {
            addCriterion("transaction_max_used_credit_amount like", value, "transactionMaxUsedCreditAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionMaxUsedCreditAmountNotLike(String value) {
            addCriterion("transaction_max_used_credit_amount not like", value, "transactionMaxUsedCreditAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionMaxUsedCreditAmountIn(List<String> values) {
            addCriterion("transaction_max_used_credit_amount in", values, "transactionMaxUsedCreditAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionMaxUsedCreditAmountNotIn(List<String> values) {
            addCriterion("transaction_max_used_credit_amount not in", values, "transactionMaxUsedCreditAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionMaxUsedCreditAmountBetween(String value1, String value2) {
            addCriterion("transaction_max_used_credit_amount between", value1, value2, "transactionMaxUsedCreditAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionMaxUsedCreditAmountNotBetween(String value1, String value2) {
            addCriterion("transaction_max_used_credit_amount not between", value1, value2, "transactionMaxUsedCreditAmount");
            return (Criteria) this;
        }

        public Criteria andTransactionLast6monthUsedCreditAmountAvgIsNull() {
            addCriterion("transaction_last6month_used_credit_amount_avg is null");
            return (Criteria) this;
        }

        public Criteria andTransactionLast6monthUsedCreditAmountAvgIsNotNull() {
            addCriterion("transaction_last6month_used_credit_amount_avg is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionLast6monthUsedCreditAmountAvgEqualTo(String value) {
            addCriterion("transaction_last6month_used_credit_amount_avg =", value, "transactionLast6monthUsedCreditAmountAvg");
            return (Criteria) this;
        }

        public Criteria andTransactionLast6monthUsedCreditAmountAvgNotEqualTo(String value) {
            addCriterion("transaction_last6month_used_credit_amount_avg <>", value, "transactionLast6monthUsedCreditAmountAvg");
            return (Criteria) this;
        }

        public Criteria andTransactionLast6monthUsedCreditAmountAvgGreaterThan(String value) {
            addCriterion("transaction_last6month_used_credit_amount_avg >", value, "transactionLast6monthUsedCreditAmountAvg");
            return (Criteria) this;
        }

        public Criteria andTransactionLast6monthUsedCreditAmountAvgGreaterThanOrEqualTo(String value) {
            addCriterion("transaction_last6month_used_credit_amount_avg >=", value, "transactionLast6monthUsedCreditAmountAvg");
            return (Criteria) this;
        }

        public Criteria andTransactionLast6monthUsedCreditAmountAvgLessThan(String value) {
            addCriterion("transaction_last6month_used_credit_amount_avg <", value, "transactionLast6monthUsedCreditAmountAvg");
            return (Criteria) this;
        }

        public Criteria andTransactionLast6monthUsedCreditAmountAvgLessThanOrEqualTo(String value) {
            addCriterion("transaction_last6month_used_credit_amount_avg <=", value, "transactionLast6monthUsedCreditAmountAvg");
            return (Criteria) this;
        }

        public Criteria andTransactionLast6monthUsedCreditAmountAvgLike(String value) {
            addCriterion("transaction_last6month_used_credit_amount_avg like", value, "transactionLast6monthUsedCreditAmountAvg");
            return (Criteria) this;
        }

        public Criteria andTransactionLast6monthUsedCreditAmountAvgNotLike(String value) {
            addCriterion("transaction_last6month_used_credit_amount_avg not like", value, "transactionLast6monthUsedCreditAmountAvg");
            return (Criteria) this;
        }

        public Criteria andTransactionLast6monthUsedCreditAmountAvgIn(List<String> values) {
            addCriterion("transaction_last6month_used_credit_amount_avg in", values, "transactionLast6monthUsedCreditAmountAvg");
            return (Criteria) this;
        }

        public Criteria andTransactionLast6monthUsedCreditAmountAvgNotIn(List<String> values) {
            addCriterion("transaction_last6month_used_credit_amount_avg not in", values, "transactionLast6monthUsedCreditAmountAvg");
            return (Criteria) this;
        }

        public Criteria andTransactionLast6monthUsedCreditAmountAvgBetween(String value1, String value2) {
            addCriterion("transaction_last6month_used_credit_amount_avg between", value1, value2, "transactionLast6monthUsedCreditAmountAvg");
            return (Criteria) this;
        }

        public Criteria andTransactionLast6monthUsedCreditAmountAvgNotBetween(String value1, String value2) {
            addCriterion("transaction_last6month_used_credit_amount_avg not between", value1, value2, "transactionLast6monthUsedCreditAmountAvg");
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

        public Criteria andRansactionCurrencyIsNull() {
            addCriterion("ransaction_currency is null");
            return (Criteria) this;
        }

        public Criteria andRansactionCurrencyIsNotNull() {
            addCriterion("ransaction_currency is not null");
            return (Criteria) this;
        }

        public Criteria andRansactionCurrencyEqualTo(String value) {
            addCriterion("ransaction_currency =", value, "ransactionCurrency");
            return (Criteria) this;
        }

        public Criteria andRansactionCurrencyNotEqualTo(String value) {
            addCriterion("ransaction_currency <>", value, "ransactionCurrency");
            return (Criteria) this;
        }

        public Criteria andRansactionCurrencyGreaterThan(String value) {
            addCriterion("ransaction_currency >", value, "ransactionCurrency");
            return (Criteria) this;
        }

        public Criteria andRansactionCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("ransaction_currency >=", value, "ransactionCurrency");
            return (Criteria) this;
        }

        public Criteria andRansactionCurrencyLessThan(String value) {
            addCriterion("ransaction_currency <", value, "ransactionCurrency");
            return (Criteria) this;
        }

        public Criteria andRansactionCurrencyLessThanOrEqualTo(String value) {
            addCriterion("ransaction_currency <=", value, "ransactionCurrency");
            return (Criteria) this;
        }

        public Criteria andRansactionCurrencyLike(String value) {
            addCriterion("ransaction_currency like", value, "ransactionCurrency");
            return (Criteria) this;
        }

        public Criteria andRansactionCurrencyNotLike(String value) {
            addCriterion("ransaction_currency not like", value, "ransactionCurrency");
            return (Criteria) this;
        }

        public Criteria andRansactionCurrencyIn(List<String> values) {
            addCriterion("ransaction_currency in", values, "ransactionCurrency");
            return (Criteria) this;
        }

        public Criteria andRansactionCurrencyNotIn(List<String> values) {
            addCriterion("ransaction_currency not in", values, "ransactionCurrency");
            return (Criteria) this;
        }

        public Criteria andRansactionCurrencyBetween(String value1, String value2) {
            addCriterion("ransaction_currency between", value1, value2, "ransactionCurrency");
            return (Criteria) this;
        }

        public Criteria andRansactionCurrencyNotBetween(String value1, String value2) {
            addCriterion("ransaction_currency not between", value1, value2, "ransactionCurrency");
            return (Criteria) this;
        }

        public Criteria andRansactionCurrentOverdueAmountIsNull() {
            addCriterion("ransaction_current_overdue_amount is null");
            return (Criteria) this;
        }

        public Criteria andRansactionCurrentOverdueAmountIsNotNull() {
            addCriterion("ransaction_current_overdue_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRansactionCurrentOverdueAmountEqualTo(String value) {
            addCriterion("ransaction_current_overdue_amount =", value, "ransactionCurrentOverdueAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionCurrentOverdueAmountNotEqualTo(String value) {
            addCriterion("ransaction_current_overdue_amount <>", value, "ransactionCurrentOverdueAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionCurrentOverdueAmountGreaterThan(String value) {
            addCriterion("ransaction_current_overdue_amount >", value, "ransactionCurrentOverdueAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionCurrentOverdueAmountGreaterThanOrEqualTo(String value) {
            addCriterion("ransaction_current_overdue_amount >=", value, "ransactionCurrentOverdueAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionCurrentOverdueAmountLessThan(String value) {
            addCriterion("ransaction_current_overdue_amount <", value, "ransactionCurrentOverdueAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionCurrentOverdueAmountLessThanOrEqualTo(String value) {
            addCriterion("ransaction_current_overdue_amount <=", value, "ransactionCurrentOverdueAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionCurrentOverdueAmountLike(String value) {
            addCriterion("ransaction_current_overdue_amount like", value, "ransactionCurrentOverdueAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionCurrentOverdueAmountNotLike(String value) {
            addCriterion("ransaction_current_overdue_amount not like", value, "ransactionCurrentOverdueAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionCurrentOverdueAmountIn(List<String> values) {
            addCriterion("ransaction_current_overdue_amount in", values, "ransactionCurrentOverdueAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionCurrentOverdueAmountNotIn(List<String> values) {
            addCriterion("ransaction_current_overdue_amount not in", values, "ransactionCurrentOverdueAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionCurrentOverdueAmountBetween(String value1, String value2) {
            addCriterion("ransaction_current_overdue_amount between", value1, value2, "ransactionCurrentOverdueAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionCurrentOverdueAmountNotBetween(String value1, String value2) {
            addCriterion("ransaction_current_overdue_amount not between", value1, value2, "ransactionCurrentOverdueAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionOverdue3160daysAmountIsNull() {
            addCriterion("ransaction_overdue31_60days_amount is null");
            return (Criteria) this;
        }

        public Criteria andRansactionOverdue3160daysAmountIsNotNull() {
            addCriterion("ransaction_overdue31_60days_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRansactionOverdue3160daysAmountEqualTo(String value) {
            addCriterion("ransaction_overdue31_60days_amount =", value, "ransactionOverdue3160daysAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionOverdue3160daysAmountNotEqualTo(String value) {
            addCriterion("ransaction_overdue31_60days_amount <>", value, "ransactionOverdue3160daysAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionOverdue3160daysAmountGreaterThan(String value) {
            addCriterion("ransaction_overdue31_60days_amount >", value, "ransactionOverdue3160daysAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionOverdue3160daysAmountGreaterThanOrEqualTo(String value) {
            addCriterion("ransaction_overdue31_60days_amount >=", value, "ransactionOverdue3160daysAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionOverdue3160daysAmountLessThan(String value) {
            addCriterion("ransaction_overdue31_60days_amount <", value, "ransactionOverdue3160daysAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionOverdue3160daysAmountLessThanOrEqualTo(String value) {
            addCriterion("ransaction_overdue31_60days_amount <=", value, "ransactionOverdue3160daysAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionOverdue3160daysAmountLike(String value) {
            addCriterion("ransaction_overdue31_60days_amount like", value, "ransactionOverdue3160daysAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionOverdue3160daysAmountNotLike(String value) {
            addCriterion("ransaction_overdue31_60days_amount not like", value, "ransactionOverdue3160daysAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionOverdue3160daysAmountIn(List<String> values) {
            addCriterion("ransaction_overdue31_60days_amount in", values, "ransactionOverdue3160daysAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionOverdue3160daysAmountNotIn(List<String> values) {
            addCriterion("ransaction_overdue31_60days_amount not in", values, "ransactionOverdue3160daysAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionOverdue3160daysAmountBetween(String value1, String value2) {
            addCriterion("ransaction_overdue31_60days_amount between", value1, value2, "ransactionOverdue3160daysAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionOverdue3160daysAmountNotBetween(String value1, String value2) {
            addCriterion("ransaction_overdue31_60days_amount not between", value1, value2, "ransactionOverdue3160daysAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionOverdue6190daysAmountIsNull() {
            addCriterion("ransaction_overdue61_90days_amount is null");
            return (Criteria) this;
        }

        public Criteria andRansactionOverdue6190daysAmountIsNotNull() {
            addCriterion("ransaction_overdue61_90days_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRansactionOverdue6190daysAmountEqualTo(String value) {
            addCriterion("ransaction_overdue61_90days_amount =", value, "ransactionOverdue6190daysAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionOverdue6190daysAmountNotEqualTo(String value) {
            addCriterion("ransaction_overdue61_90days_amount <>", value, "ransactionOverdue6190daysAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionOverdue6190daysAmountGreaterThan(String value) {
            addCriterion("ransaction_overdue61_90days_amount >", value, "ransactionOverdue6190daysAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionOverdue6190daysAmountGreaterThanOrEqualTo(String value) {
            addCriterion("ransaction_overdue61_90days_amount >=", value, "ransactionOverdue6190daysAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionOverdue6190daysAmountLessThan(String value) {
            addCriterion("ransaction_overdue61_90days_amount <", value, "ransactionOverdue6190daysAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionOverdue6190daysAmountLessThanOrEqualTo(String value) {
            addCriterion("ransaction_overdue61_90days_amount <=", value, "ransactionOverdue6190daysAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionOverdue6190daysAmountLike(String value) {
            addCriterion("ransaction_overdue61_90days_amount like", value, "ransactionOverdue6190daysAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionOverdue6190daysAmountNotLike(String value) {
            addCriterion("ransaction_overdue61_90days_amount not like", value, "ransactionOverdue6190daysAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionOverdue6190daysAmountIn(List<String> values) {
            addCriterion("ransaction_overdue61_90days_amount in", values, "ransactionOverdue6190daysAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionOverdue6190daysAmountNotIn(List<String> values) {
            addCriterion("ransaction_overdue61_90days_amount not in", values, "ransactionOverdue6190daysAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionOverdue6190daysAmountBetween(String value1, String value2) {
            addCriterion("ransaction_overdue61_90days_amount between", value1, value2, "ransactionOverdue6190daysAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionOverdue6190daysAmountNotBetween(String value1, String value2) {
            addCriterion("ransaction_overdue61_90days_amount not between", value1, value2, "ransactionOverdue6190daysAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionOverdue91180daysAmountIsNull() {
            addCriterion("ransaction_overdue91_180days_amount is null");
            return (Criteria) this;
        }

        public Criteria andRansactionOverdue91180daysAmountIsNotNull() {
            addCriterion("ransaction_overdue91_180days_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRansactionOverdue91180daysAmountEqualTo(String value) {
            addCriterion("ransaction_overdue91_180days_amount =", value, "ransactionOverdue91180daysAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionOverdue91180daysAmountNotEqualTo(String value) {
            addCriterion("ransaction_overdue91_180days_amount <>", value, "ransactionOverdue91180daysAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionOverdue91180daysAmountGreaterThan(String value) {
            addCriterion("ransaction_overdue91_180days_amount >", value, "ransactionOverdue91180daysAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionOverdue91180daysAmountGreaterThanOrEqualTo(String value) {
            addCriterion("ransaction_overdue91_180days_amount >=", value, "ransactionOverdue91180daysAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionOverdue91180daysAmountLessThan(String value) {
            addCriterion("ransaction_overdue91_180days_amount <", value, "ransactionOverdue91180daysAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionOverdue91180daysAmountLessThanOrEqualTo(String value) {
            addCriterion("ransaction_overdue91_180days_amount <=", value, "ransactionOverdue91180daysAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionOverdue91180daysAmountLike(String value) {
            addCriterion("ransaction_overdue91_180days_amount like", value, "ransactionOverdue91180daysAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionOverdue91180daysAmountNotLike(String value) {
            addCriterion("ransaction_overdue91_180days_amount not like", value, "ransactionOverdue91180daysAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionOverdue91180daysAmountIn(List<String> values) {
            addCriterion("ransaction_overdue91_180days_amount in", values, "ransactionOverdue91180daysAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionOverdue91180daysAmountNotIn(List<String> values) {
            addCriterion("ransaction_overdue91_180days_amount not in", values, "ransactionOverdue91180daysAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionOverdue91180daysAmountBetween(String value1, String value2) {
            addCriterion("ransaction_overdue91_180days_amount between", value1, value2, "ransactionOverdue91180daysAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionOverdue91180daysAmountNotBetween(String value1, String value2) {
            addCriterion("ransaction_overdue91_180days_amount not between", value1, value2, "ransactionOverdue91180daysAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionOverduemore180daysAmountIsNull() {
            addCriterion("ransaction_overduemore180days_amount is null");
            return (Criteria) this;
        }

        public Criteria andRansactionOverduemore180daysAmountIsNotNull() {
            addCriterion("ransaction_overduemore180days_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRansactionOverduemore180daysAmountEqualTo(String value) {
            addCriterion("ransaction_overduemore180days_amount =", value, "ransactionOverduemore180daysAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionOverduemore180daysAmountNotEqualTo(String value) {
            addCriterion("ransaction_overduemore180days_amount <>", value, "ransactionOverduemore180daysAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionOverduemore180daysAmountGreaterThan(String value) {
            addCriterion("ransaction_overduemore180days_amount >", value, "ransactionOverduemore180daysAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionOverduemore180daysAmountGreaterThanOrEqualTo(String value) {
            addCriterion("ransaction_overduemore180days_amount >=", value, "ransactionOverduemore180daysAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionOverduemore180daysAmountLessThan(String value) {
            addCriterion("ransaction_overduemore180days_amount <", value, "ransactionOverduemore180daysAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionOverduemore180daysAmountLessThanOrEqualTo(String value) {
            addCriterion("ransaction_overduemore180days_amount <=", value, "ransactionOverduemore180daysAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionOverduemore180daysAmountLike(String value) {
            addCriterion("ransaction_overduemore180days_amount like", value, "ransactionOverduemore180daysAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionOverduemore180daysAmountNotLike(String value) {
            addCriterion("ransaction_overduemore180days_amount not like", value, "ransactionOverduemore180daysAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionOverduemore180daysAmountIn(List<String> values) {
            addCriterion("ransaction_overduemore180days_amount in", values, "ransactionOverduemore180daysAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionOverduemore180daysAmountNotIn(List<String> values) {
            addCriterion("ransaction_overduemore180days_amount not in", values, "ransactionOverduemore180daysAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionOverduemore180daysAmountBetween(String value1, String value2) {
            addCriterion("ransaction_overduemore180days_amount between", value1, value2, "ransactionOverduemore180daysAmount");
            return (Criteria) this;
        }

        public Criteria andRansactionOverduemore180daysAmountNotBetween(String value1, String value2) {
            addCriterion("ransaction_overduemore180days_amount not between", value1, value2, "ransactionOverduemore180daysAmount");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}