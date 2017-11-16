package com.fosun.paymng.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PayFundCfgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PayFundCfgExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected PayFundCfgExample(PayFundCfgExample example) {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNull() {
            addCriterion("PAY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("PAY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(String value) {
            addCriterion("PAY_TYPE =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(String value) {
            addCriterion("PAY_TYPE <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(String value) {
            addCriterion("PAY_TYPE >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_TYPE >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(String value) {
            addCriterion("PAY_TYPE <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(String value) {
            addCriterion("PAY_TYPE <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLike(String value) {
            addCriterion("PAY_TYPE like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotLike(String value) {
            addCriterion("PAY_TYPE not like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<String> values) {
            addCriterion("PAY_TYPE in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<String> values) {
            addCriterion("PAY_TYPE not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(String value1, String value2) {
            addCriterion("PAY_TYPE between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(String value1, String value2) {
            addCriterion("PAY_TYPE not between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andMchntIdIsNull() {
            addCriterion("MCHNT_ID is null");
            return (Criteria) this;
        }

        public Criteria andMchntIdIsNotNull() {
            addCriterion("MCHNT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMchntIdEqualTo(String value) {
            addCriterion("MCHNT_ID =", value, "mchntId");
            return (Criteria) this;
        }

        public Criteria andMchntIdNotEqualTo(String value) {
            addCriterion("MCHNT_ID <>", value, "mchntId");
            return (Criteria) this;
        }

        public Criteria andMchntIdGreaterThan(String value) {
            addCriterion("MCHNT_ID >", value, "mchntId");
            return (Criteria) this;
        }

        public Criteria andMchntIdGreaterThanOrEqualTo(String value) {
            addCriterion("MCHNT_ID >=", value, "mchntId");
            return (Criteria) this;
        }

        public Criteria andMchntIdLessThan(String value) {
            addCriterion("MCHNT_ID <", value, "mchntId");
            return (Criteria) this;
        }

        public Criteria andMchntIdLessThanOrEqualTo(String value) {
            addCriterion("MCHNT_ID <=", value, "mchntId");
            return (Criteria) this;
        }

        public Criteria andMchntIdLike(String value) {
            addCriterion("MCHNT_ID like", value, "mchntId");
            return (Criteria) this;
        }

        public Criteria andMchntIdNotLike(String value) {
            addCriterion("MCHNT_ID not like", value, "mchntId");
            return (Criteria) this;
        }

        public Criteria andMchntIdIn(List<String> values) {
            addCriterion("MCHNT_ID in", values, "mchntId");
            return (Criteria) this;
        }

        public Criteria andMchntIdNotIn(List<String> values) {
            addCriterion("MCHNT_ID not in", values, "mchntId");
            return (Criteria) this;
        }

        public Criteria andMchntIdBetween(String value1, String value2) {
            addCriterion("MCHNT_ID between", value1, value2, "mchntId");
            return (Criteria) this;
        }

        public Criteria andMchntIdNotBetween(String value1, String value2) {
            addCriterion("MCHNT_ID not between", value1, value2, "mchntId");
            return (Criteria) this;
        }

        public Criteria andFundCodeIsNull() {
            addCriterion("FUND_CODE is null");
            return (Criteria) this;
        }

        public Criteria andFundCodeIsNotNull() {
            addCriterion("FUND_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andFundCodeEqualTo(String value) {
            addCriterion("FUND_CODE =", value, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeNotEqualTo(String value) {
            addCriterion("FUND_CODE <>", value, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeGreaterThan(String value) {
            addCriterion("FUND_CODE >", value, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeGreaterThanOrEqualTo(String value) {
            addCriterion("FUND_CODE >=", value, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeLessThan(String value) {
            addCriterion("FUND_CODE <", value, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeLessThanOrEqualTo(String value) {
            addCriterion("FUND_CODE <=", value, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeLike(String value) {
            addCriterion("FUND_CODE like", value, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeNotLike(String value) {
            addCriterion("FUND_CODE not like", value, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeIn(List<String> values) {
            addCriterion("FUND_CODE in", values, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeNotIn(List<String> values) {
            addCriterion("FUND_CODE not in", values, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeBetween(String value1, String value2) {
            addCriterion("FUND_CODE between", value1, value2, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeNotBetween(String value1, String value2) {
            addCriterion("FUND_CODE not between", value1, value2, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundNameIsNull() {
            addCriterion("FUND_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFundNameIsNotNull() {
            addCriterion("FUND_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFundNameEqualTo(String value) {
            addCriterion("FUND_NAME =", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameNotEqualTo(String value) {
            addCriterion("FUND_NAME <>", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameGreaterThan(String value) {
            addCriterion("FUND_NAME >", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameGreaterThanOrEqualTo(String value) {
            addCriterion("FUND_NAME >=", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameLessThan(String value) {
            addCriterion("FUND_NAME <", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameLessThanOrEqualTo(String value) {
            addCriterion("FUND_NAME <=", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameLike(String value) {
            addCriterion("FUND_NAME like", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameNotLike(String value) {
            addCriterion("FUND_NAME not like", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameIn(List<String> values) {
            addCriterion("FUND_NAME in", values, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameNotIn(List<String> values) {
            addCriterion("FUND_NAME not in", values, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameBetween(String value1, String value2) {
            addCriterion("FUND_NAME between", value1, value2, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameNotBetween(String value1, String value2) {
            addCriterion("FUND_NAME not between", value1, value2, "fundName");
            return (Criteria) this;
        }

        public Criteria andActNoIsNull() {
            addCriterion("ACT_NO is null");
            return (Criteria) this;
        }

        public Criteria andActNoIsNotNull() {
            addCriterion("ACT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andActNoEqualTo(String value) {
            addCriterion("ACT_NO =", value, "actNo");
            return (Criteria) this;
        }

        public Criteria andActNoNotEqualTo(String value) {
            addCriterion("ACT_NO <>", value, "actNo");
            return (Criteria) this;
        }

        public Criteria andActNoGreaterThan(String value) {
            addCriterion("ACT_NO >", value, "actNo");
            return (Criteria) this;
        }

        public Criteria andActNoGreaterThanOrEqualTo(String value) {
            addCriterion("ACT_NO >=", value, "actNo");
            return (Criteria) this;
        }

        public Criteria andActNoLessThan(String value) {
            addCriterion("ACT_NO <", value, "actNo");
            return (Criteria) this;
        }

        public Criteria andActNoLessThanOrEqualTo(String value) {
            addCriterion("ACT_NO <=", value, "actNo");
            return (Criteria) this;
        }

        public Criteria andActNoLike(String value) {
            addCriterion("ACT_NO like", value, "actNo");
            return (Criteria) this;
        }

        public Criteria andActNoNotLike(String value) {
            addCriterion("ACT_NO not like", value, "actNo");
            return (Criteria) this;
        }

        public Criteria andActNoIn(List<String> values) {
            addCriterion("ACT_NO in", values, "actNo");
            return (Criteria) this;
        }

        public Criteria andActNoNotIn(List<String> values) {
            addCriterion("ACT_NO not in", values, "actNo");
            return (Criteria) this;
        }

        public Criteria andActNoBetween(String value1, String value2) {
            addCriterion("ACT_NO between", value1, value2, "actNo");
            return (Criteria) this;
        }

        public Criteria andActNoNotBetween(String value1, String value2) {
            addCriterion("ACT_NO not between", value1, value2, "actNo");
            return (Criteria) this;
        }

        public Criteria andPfxFileNameIsNull() {
            addCriterion("PFX_FILE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPfxFileNameIsNotNull() {
            addCriterion("PFX_FILE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPfxFileNameEqualTo(String value) {
            addCriterion("PFX_FILE_NAME =", value, "pfxFileName");
            return (Criteria) this;
        }

        public Criteria andPfxFileNameNotEqualTo(String value) {
            addCriterion("PFX_FILE_NAME <>", value, "pfxFileName");
            return (Criteria) this;
        }

        public Criteria andPfxFileNameGreaterThan(String value) {
            addCriterion("PFX_FILE_NAME >", value, "pfxFileName");
            return (Criteria) this;
        }

        public Criteria andPfxFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("PFX_FILE_NAME >=", value, "pfxFileName");
            return (Criteria) this;
        }

        public Criteria andPfxFileNameLessThan(String value) {
            addCriterion("PFX_FILE_NAME <", value, "pfxFileName");
            return (Criteria) this;
        }

        public Criteria andPfxFileNameLessThanOrEqualTo(String value) {
            addCriterion("PFX_FILE_NAME <=", value, "pfxFileName");
            return (Criteria) this;
        }

        public Criteria andPfxFileNameLike(String value) {
            addCriterion("PFX_FILE_NAME like", value, "pfxFileName");
            return (Criteria) this;
        }

        public Criteria andPfxFileNameNotLike(String value) {
            addCriterion("PFX_FILE_NAME not like", value, "pfxFileName");
            return (Criteria) this;
        }

        public Criteria andPfxFileNameIn(List<String> values) {
            addCriterion("PFX_FILE_NAME in", values, "pfxFileName");
            return (Criteria) this;
        }

        public Criteria andPfxFileNameNotIn(List<String> values) {
            addCriterion("PFX_FILE_NAME not in", values, "pfxFileName");
            return (Criteria) this;
        }

        public Criteria andPfxFileNameBetween(String value1, String value2) {
            addCriterion("PFX_FILE_NAME between", value1, value2, "pfxFileName");
            return (Criteria) this;
        }

        public Criteria andPfxFileNameNotBetween(String value1, String value2) {
            addCriterion("PFX_FILE_NAME not between", value1, value2, "pfxFileName");
            return (Criteria) this;
        }

        public Criteria andPubFileNameIsNull() {
            addCriterion("PUB_FILE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPubFileNameIsNotNull() {
            addCriterion("PUB_FILE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPubFileNameEqualTo(String value) {
            addCriterion("PUB_FILE_NAME =", value, "pubFileName");
            return (Criteria) this;
        }

        public Criteria andPubFileNameNotEqualTo(String value) {
            addCriterion("PUB_FILE_NAME <>", value, "pubFileName");
            return (Criteria) this;
        }

        public Criteria andPubFileNameGreaterThan(String value) {
            addCriterion("PUB_FILE_NAME >", value, "pubFileName");
            return (Criteria) this;
        }

        public Criteria andPubFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("PUB_FILE_NAME >=", value, "pubFileName");
            return (Criteria) this;
        }

        public Criteria andPubFileNameLessThan(String value) {
            addCriterion("PUB_FILE_NAME <", value, "pubFileName");
            return (Criteria) this;
        }

        public Criteria andPubFileNameLessThanOrEqualTo(String value) {
            addCriterion("PUB_FILE_NAME <=", value, "pubFileName");
            return (Criteria) this;
        }

        public Criteria andPubFileNameLike(String value) {
            addCriterion("PUB_FILE_NAME like", value, "pubFileName");
            return (Criteria) this;
        }

        public Criteria andPubFileNameNotLike(String value) {
            addCriterion("PUB_FILE_NAME not like", value, "pubFileName");
            return (Criteria) this;
        }

        public Criteria andPubFileNameIn(List<String> values) {
            addCriterion("PUB_FILE_NAME in", values, "pubFileName");
            return (Criteria) this;
        }

        public Criteria andPubFileNameNotIn(List<String> values) {
            addCriterion("PUB_FILE_NAME not in", values, "pubFileName");
            return (Criteria) this;
        }

        public Criteria andPubFileNameBetween(String value1, String value2) {
            addCriterion("PUB_FILE_NAME between", value1, value2, "pubFileName");
            return (Criteria) this;
        }

        public Criteria andPubFileNameNotBetween(String value1, String value2) {
            addCriterion("PUB_FILE_NAME not between", value1, value2, "pubFileName");
            return (Criteria) this;
        }

        public Criteria andPriPsdIsNull() {
            addCriterion("PRI_PSD is null");
            return (Criteria) this;
        }

        public Criteria andPriPsdIsNotNull() {
            addCriterion("PRI_PSD is not null");
            return (Criteria) this;
        }

        public Criteria andPriPsdEqualTo(String value) {
            addCriterion("PRI_PSD =", value, "priPsd");
            return (Criteria) this;
        }

        public Criteria andPriPsdNotEqualTo(String value) {
            addCriterion("PRI_PSD <>", value, "priPsd");
            return (Criteria) this;
        }

        public Criteria andPriPsdGreaterThan(String value) {
            addCriterion("PRI_PSD >", value, "priPsd");
            return (Criteria) this;
        }

        public Criteria andPriPsdGreaterThanOrEqualTo(String value) {
            addCriterion("PRI_PSD >=", value, "priPsd");
            return (Criteria) this;
        }

        public Criteria andPriPsdLessThan(String value) {
            addCriterion("PRI_PSD <", value, "priPsd");
            return (Criteria) this;
        }

        public Criteria andPriPsdLessThanOrEqualTo(String value) {
            addCriterion("PRI_PSD <=", value, "priPsd");
            return (Criteria) this;
        }

        public Criteria andPriPsdLike(String value) {
            addCriterion("PRI_PSD like", value, "priPsd");
            return (Criteria) this;
        }

        public Criteria andPriPsdNotLike(String value) {
            addCriterion("PRI_PSD not like", value, "priPsd");
            return (Criteria) this;
        }

        public Criteria andPriPsdIn(List<String> values) {
            addCriterion("PRI_PSD in", values, "priPsd");
            return (Criteria) this;
        }

        public Criteria andPriPsdNotIn(List<String> values) {
            addCriterion("PRI_PSD not in", values, "priPsd");
            return (Criteria) this;
        }

        public Criteria andPriPsdBetween(String value1, String value2) {
            addCriterion("PRI_PSD between", value1, value2, "priPsd");
            return (Criteria) this;
        }

        public Criteria andPriPsdNotBetween(String value1, String value2) {
            addCriterion("PRI_PSD not between", value1, value2, "priPsd");
            return (Criteria) this;
        }

        public Criteria andBillFlagIsNull() {
            addCriterion("BILL_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andBillFlagIsNotNull() {
            addCriterion("BILL_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andBillFlagEqualTo(String value) {
            addCriterion("BILL_FLAG =", value, "billFlag");
            return (Criteria) this;
        }

        public Criteria andBillFlagNotEqualTo(String value) {
            addCriterion("BILL_FLAG <>", value, "billFlag");
            return (Criteria) this;
        }

        public Criteria andBillFlagGreaterThan(String value) {
            addCriterion("BILL_FLAG >", value, "billFlag");
            return (Criteria) this;
        }

        public Criteria andBillFlagGreaterThanOrEqualTo(String value) {
            addCriterion("BILL_FLAG >=", value, "billFlag");
            return (Criteria) this;
        }

        public Criteria andBillFlagLessThan(String value) {
            addCriterion("BILL_FLAG <", value, "billFlag");
            return (Criteria) this;
        }

        public Criteria andBillFlagLessThanOrEqualTo(String value) {
            addCriterion("BILL_FLAG <=", value, "billFlag");
            return (Criteria) this;
        }

        public Criteria andBillFlagLike(String value) {
            addCriterion("BILL_FLAG like", value, "billFlag");
            return (Criteria) this;
        }

        public Criteria andBillFlagNotLike(String value) {
            addCriterion("BILL_FLAG not like", value, "billFlag");
            return (Criteria) this;
        }

        public Criteria andBillFlagIn(List<String> values) {
            addCriterion("BILL_FLAG in", values, "billFlag");
            return (Criteria) this;
        }

        public Criteria andBillFlagNotIn(List<String> values) {
            addCriterion("BILL_FLAG not in", values, "billFlag");
            return (Criteria) this;
        }

        public Criteria andBillFlagBetween(String value1, String value2) {
            addCriterion("BILL_FLAG between", value1, value2, "billFlag");
            return (Criteria) this;
        }

        public Criteria andBillFlagNotBetween(String value1, String value2) {
            addCriterion("BILL_FLAG not between", value1, value2, "billFlag");
            return (Criteria) this;
        }

        public Criteria andTerminalIsNull() {
            addCriterion("TERMINAL is null");
            return (Criteria) this;
        }

        public Criteria andTerminalIsNotNull() {
            addCriterion("TERMINAL is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalEqualTo(String value) {
            addCriterion("TERMINAL =", value, "terminal");
            return (Criteria) this;
        }

        public Criteria andTerminalNotEqualTo(String value) {
            addCriterion("TERMINAL <>", value, "terminal");
            return (Criteria) this;
        }

        public Criteria andTerminalGreaterThan(String value) {
            addCriterion("TERMINAL >", value, "terminal");
            return (Criteria) this;
        }

        public Criteria andTerminalGreaterThanOrEqualTo(String value) {
            addCriterion("TERMINAL >=", value, "terminal");
            return (Criteria) this;
        }

        public Criteria andTerminalLessThan(String value) {
            addCriterion("TERMINAL <", value, "terminal");
            return (Criteria) this;
        }

        public Criteria andTerminalLessThanOrEqualTo(String value) {
            addCriterion("TERMINAL <=", value, "terminal");
            return (Criteria) this;
        }

        public Criteria andTerminalLike(String value) {
            addCriterion("TERMINAL like", value, "terminal");
            return (Criteria) this;
        }

        public Criteria andTerminalNotLike(String value) {
            addCriterion("TERMINAL not like", value, "terminal");
            return (Criteria) this;
        }

        public Criteria andTerminalIn(List<String> values) {
            addCriterion("TERMINAL in", values, "terminal");
            return (Criteria) this;
        }

        public Criteria andTerminalNotIn(List<String> values) {
            addCriterion("TERMINAL not in", values, "terminal");
            return (Criteria) this;
        }

        public Criteria andTerminalBetween(String value1, String value2) {
            addCriterion("TERMINAL between", value1, value2, "terminal");
            return (Criteria) this;
        }

        public Criteria andTerminalNotBetween(String value1, String value2) {
            addCriterion("TERMINAL not between", value1, value2, "terminal");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}