package com.fosun.paymng.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PayCheckBillsFileExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PayCheckBillsFileExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected PayCheckBillsFileExample(PayCheckBillsFileExample example) {
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

        public Criteria andChnlMchntIdIsNull() {
            addCriterion("chnl_mchnt_id is null");
            return (Criteria) this;
        }

        public Criteria andChnlMchntIdIsNotNull() {
            addCriterion("chnl_mchnt_id is not null");
            return (Criteria) this;
        }

        public Criteria andChnlMchntIdEqualTo(String value) {
            addCriterion("chnl_mchnt_id =", value, "chnlMchntId");
            return (Criteria) this;
        }

        public Criteria andChnlMchntIdNotEqualTo(String value) {
            addCriterion("chnl_mchnt_id <>", value, "chnlMchntId");
            return (Criteria) this;
        }

        public Criteria andChnlMchntIdGreaterThan(String value) {
            addCriterion("chnl_mchnt_id >", value, "chnlMchntId");
            return (Criteria) this;
        }

        public Criteria andChnlMchntIdGreaterThanOrEqualTo(String value) {
            addCriterion("chnl_mchnt_id >=", value, "chnlMchntId");
            return (Criteria) this;
        }

        public Criteria andChnlMchntIdLessThan(String value) {
            addCriterion("chnl_mchnt_id <", value, "chnlMchntId");
            return (Criteria) this;
        }

        public Criteria andChnlMchntIdLessThanOrEqualTo(String value) {
            addCriterion("chnl_mchnt_id <=", value, "chnlMchntId");
            return (Criteria) this;
        }

        public Criteria andChnlMchntIdLike(String value) {
            addCriterion("chnl_mchnt_id like", value, "chnlMchntId");
            return (Criteria) this;
        }

        public Criteria andChnlMchntIdNotLike(String value) {
            addCriterion("chnl_mchnt_id not like", value, "chnlMchntId");
            return (Criteria) this;
        }

        public Criteria andChnlMchntIdIn(List<String> values) {
            addCriterion("chnl_mchnt_id in", values, "chnlMchntId");
            return (Criteria) this;
        }

        public Criteria andChnlMchntIdNotIn(List<String> values) {
            addCriterion("chnl_mchnt_id not in", values, "chnlMchntId");
            return (Criteria) this;
        }

        public Criteria andChnlMchntIdBetween(String value1, String value2) {
            addCriterion("chnl_mchnt_id between", value1, value2, "chnlMchntId");
            return (Criteria) this;
        }

        public Criteria andChnlMchntIdNotBetween(String value1, String value2) {
            addCriterion("chnl_mchnt_id not between", value1, value2, "chnlMchntId");
            return (Criteria) this;
        }

        public Criteria andCheckDateIsNull() {
            addCriterion("CHECK_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCheckDateIsNotNull() {
            addCriterion("CHECK_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCheckDateEqualTo(String value) {
            addCriterion("CHECK_DATE =", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateNotEqualTo(String value) {
            addCriterion("CHECK_DATE <>", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateGreaterThan(String value) {
            addCriterion("CHECK_DATE >", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_DATE >=", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateLessThan(String value) {
            addCriterion("CHECK_DATE <", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateLessThanOrEqualTo(String value) {
            addCriterion("CHECK_DATE <=", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateLike(String value) {
            addCriterion("CHECK_DATE like", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateNotLike(String value) {
            addCriterion("CHECK_DATE not like", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateIn(List<String> values) {
            addCriterion("CHECK_DATE in", values, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateNotIn(List<String> values) {
            addCriterion("CHECK_DATE not in", values, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateBetween(String value1, String value2) {
            addCriterion("CHECK_DATE between", value1, value2, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateNotBetween(String value1, String value2) {
            addCriterion("CHECK_DATE not between", value1, value2, "checkDate");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNull() {
            addCriterion("FILE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNotNull() {
            addCriterion("FILE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFileNameEqualTo(String value) {
            addCriterion("FILE_NAME =", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotEqualTo(String value) {
            addCriterion("FILE_NAME <>", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThan(String value) {
            addCriterion("FILE_NAME >", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("FILE_NAME >=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThan(String value) {
            addCriterion("FILE_NAME <", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThanOrEqualTo(String value) {
            addCriterion("FILE_NAME <=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLike(String value) {
            addCriterion("FILE_NAME like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotLike(String value) {
            addCriterion("FILE_NAME not like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameIn(List<String> values) {
            addCriterion("FILE_NAME in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotIn(List<String> values) {
            addCriterion("FILE_NAME not in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameBetween(String value1, String value2) {
            addCriterion("FILE_NAME between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotBetween(String value1, String value2) {
            addCriterion("FILE_NAME not between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andImageIdIsNull() {
            addCriterion("IMAGE_ID is null");
            return (Criteria) this;
        }

        public Criteria andImageIdIsNotNull() {
            addCriterion("IMAGE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andImageIdEqualTo(String value) {
            addCriterion("IMAGE_ID =", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdNotEqualTo(String value) {
            addCriterion("IMAGE_ID <>", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdGreaterThan(String value) {
            addCriterion("IMAGE_ID >", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdGreaterThanOrEqualTo(String value) {
            addCriterion("IMAGE_ID >=", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdLessThan(String value) {
            addCriterion("IMAGE_ID <", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdLessThanOrEqualTo(String value) {
            addCriterion("IMAGE_ID <=", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdLike(String value) {
            addCriterion("IMAGE_ID like", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdNotLike(String value) {
            addCriterion("IMAGE_ID not like", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdIn(List<String> values) {
            addCriterion("IMAGE_ID in", values, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdNotIn(List<String> values) {
            addCriterion("IMAGE_ID not in", values, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdBetween(String value1, String value2) {
            addCriterion("IMAGE_ID between", value1, value2, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdNotBetween(String value1, String value2) {
            addCriterion("IMAGE_ID not between", value1, value2, "imageId");
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

        public Criteria andCrtTimeIsNull() {
            addCriterion("CRT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCrtTimeIsNotNull() {
            addCriterion("CRT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCrtTimeEqualTo(Date value) {
            addCriterion("CRT_TIME =", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeNotEqualTo(Date value) {
            addCriterion("CRT_TIME <>", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeGreaterThan(Date value) {
            addCriterion("CRT_TIME >", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CRT_TIME >=", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeLessThan(Date value) {
            addCriterion("CRT_TIME <", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeLessThanOrEqualTo(Date value) {
            addCriterion("CRT_TIME <=", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeIn(List<Date> values) {
            addCriterion("CRT_TIME in", values, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeNotIn(List<Date> values) {
            addCriterion("CRT_TIME not in", values, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeBetween(Date value1, Date value2) {
            addCriterion("CRT_TIME between", value1, value2, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeNotBetween(Date value1, Date value2) {
            addCriterion("CRT_TIME not between", value1, value2, "crtTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
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

        public Criteria andChnlFileSumIsNull() {
            addCriterion("CHNL_FILE_SUM is null");
            return (Criteria) this;
        }

        public Criteria andChnlFileSumIsNotNull() {
            addCriterion("CHNL_FILE_SUM is not null");
            return (Criteria) this;
        }

        public Criteria andChnlFileSumEqualTo(Integer value) {
            addCriterion("CHNL_FILE_SUM =", value, "chnlFileSum");
            return (Criteria) this;
        }

        public Criteria andChnlFileSumNotEqualTo(Integer value) {
            addCriterion("CHNL_FILE_SUM <>", value, "chnlFileSum");
            return (Criteria) this;
        }

        public Criteria andChnlFileSumGreaterThan(Integer value) {
            addCriterion("CHNL_FILE_SUM >", value, "chnlFileSum");
            return (Criteria) this;
        }

        public Criteria andChnlFileSumGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHNL_FILE_SUM >=", value, "chnlFileSum");
            return (Criteria) this;
        }

        public Criteria andChnlFileSumLessThan(Integer value) {
            addCriterion("CHNL_FILE_SUM <", value, "chnlFileSum");
            return (Criteria) this;
        }

        public Criteria andChnlFileSumLessThanOrEqualTo(Integer value) {
            addCriterion("CHNL_FILE_SUM <=", value, "chnlFileSum");
            return (Criteria) this;
        }

        public Criteria andChnlFileSumIn(List<Integer> values) {
            addCriterion("CHNL_FILE_SUM in", values, "chnlFileSum");
            return (Criteria) this;
        }

        public Criteria andChnlFileSumNotIn(List<Integer> values) {
            addCriterion("CHNL_FILE_SUM not in", values, "chnlFileSum");
            return (Criteria) this;
        }

        public Criteria andChnlFileSumBetween(Integer value1, Integer value2) {
            addCriterion("CHNL_FILE_SUM between", value1, value2, "chnlFileSum");
            return (Criteria) this;
        }

        public Criteria andChnlFileSumNotBetween(Integer value1, Integer value2) {
            addCriterion("CHNL_FILE_SUM not between", value1, value2, "chnlFileSum");
            return (Criteria) this;
        }

        public Criteria andChnlFileIdxIsNull() {
            addCriterion("CHNL_FILE_IDX is null");
            return (Criteria) this;
        }

        public Criteria andChnlFileIdxIsNotNull() {
            addCriterion("CHNL_FILE_IDX is not null");
            return (Criteria) this;
        }

        public Criteria andChnlFileIdxEqualTo(Integer value) {
            addCriterion("CHNL_FILE_IDX =", value, "chnlFileIdx");
            return (Criteria) this;
        }

        public Criteria andChnlFileIdxNotEqualTo(Integer value) {
            addCriterion("CHNL_FILE_IDX <>", value, "chnlFileIdx");
            return (Criteria) this;
        }

        public Criteria andChnlFileIdxGreaterThan(Integer value) {
            addCriterion("CHNL_FILE_IDX >", value, "chnlFileIdx");
            return (Criteria) this;
        }

        public Criteria andChnlFileIdxGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHNL_FILE_IDX >=", value, "chnlFileIdx");
            return (Criteria) this;
        }

        public Criteria andChnlFileIdxLessThan(Integer value) {
            addCriterion("CHNL_FILE_IDX <", value, "chnlFileIdx");
            return (Criteria) this;
        }

        public Criteria andChnlFileIdxLessThanOrEqualTo(Integer value) {
            addCriterion("CHNL_FILE_IDX <=", value, "chnlFileIdx");
            return (Criteria) this;
        }

        public Criteria andChnlFileIdxIn(List<Integer> values) {
            addCriterion("CHNL_FILE_IDX in", values, "chnlFileIdx");
            return (Criteria) this;
        }

        public Criteria andChnlFileIdxNotIn(List<Integer> values) {
            addCriterion("CHNL_FILE_IDX not in", values, "chnlFileIdx");
            return (Criteria) this;
        }

        public Criteria andChnlFileIdxBetween(Integer value1, Integer value2) {
            addCriterion("CHNL_FILE_IDX between", value1, value2, "chnlFileIdx");
            return (Criteria) this;
        }

        public Criteria andChnlFileIdxNotBetween(Integer value1, Integer value2) {
            addCriterion("CHNL_FILE_IDX not between", value1, value2, "chnlFileIdx");
            return (Criteria) this;
        }

        public Criteria andFileStatusIsNull() {
            addCriterion("FILE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andFileStatusIsNotNull() {
            addCriterion("FILE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andFileStatusEqualTo(String value) {
            addCriterion("FILE_STATUS =", value, "fileStatus");
            return (Criteria) this;
        }

        public Criteria andFileStatusNotEqualTo(String value) {
            addCriterion("FILE_STATUS <>", value, "fileStatus");
            return (Criteria) this;
        }

        public Criteria andFileStatusGreaterThan(String value) {
            addCriterion("FILE_STATUS >", value, "fileStatus");
            return (Criteria) this;
        }

        public Criteria andFileStatusGreaterThanOrEqualTo(String value) {
            addCriterion("FILE_STATUS >=", value, "fileStatus");
            return (Criteria) this;
        }

        public Criteria andFileStatusLessThan(String value) {
            addCriterion("FILE_STATUS <", value, "fileStatus");
            return (Criteria) this;
        }

        public Criteria andFileStatusLessThanOrEqualTo(String value) {
            addCriterion("FILE_STATUS <=", value, "fileStatus");
            return (Criteria) this;
        }

        public Criteria andFileStatusLike(String value) {
            addCriterion("FILE_STATUS like", value, "fileStatus");
            return (Criteria) this;
        }

        public Criteria andFileStatusNotLike(String value) {
            addCriterion("FILE_STATUS not like", value, "fileStatus");
            return (Criteria) this;
        }

        public Criteria andFileStatusIn(List<String> values) {
            addCriterion("FILE_STATUS in", values, "fileStatus");
            return (Criteria) this;
        }

        public Criteria andFileStatusNotIn(List<String> values) {
            addCriterion("FILE_STATUS not in", values, "fileStatus");
            return (Criteria) this;
        }

        public Criteria andFileStatusBetween(String value1, String value2) {
            addCriterion("FILE_STATUS between", value1, value2, "fileStatus");
            return (Criteria) this;
        }

        public Criteria andFileStatusNotBetween(String value1, String value2) {
            addCriterion("FILE_STATUS not between", value1, value2, "fileStatus");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}