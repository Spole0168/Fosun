package com.fosun.paymng.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PayBillFileDtlExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PayBillFileDtlExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected PayBillFileDtlExample(PayBillFileDtlExample example) {
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

        public Criteria andMchntFileIdIsNull() {
            addCriterion("MCHNT_FILE_ID is null");
            return (Criteria) this;
        }

        public Criteria andMchntFileIdIsNotNull() {
            addCriterion("MCHNT_FILE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMchntFileIdEqualTo(String value) {
            addCriterion("MCHNT_FILE_ID =", value, "mchntFileId");
            return (Criteria) this;
        }

        public Criteria andMchntFileIdNotEqualTo(String value) {
            addCriterion("MCHNT_FILE_ID <>", value, "mchntFileId");
            return (Criteria) this;
        }

        public Criteria andMchntFileIdGreaterThan(String value) {
            addCriterion("MCHNT_FILE_ID >", value, "mchntFileId");
            return (Criteria) this;
        }

        public Criteria andMchntFileIdGreaterThanOrEqualTo(String value) {
            addCriterion("MCHNT_FILE_ID >=", value, "mchntFileId");
            return (Criteria) this;
        }

        public Criteria andMchntFileIdLessThan(String value) {
            addCriterion("MCHNT_FILE_ID <", value, "mchntFileId");
            return (Criteria) this;
        }

        public Criteria andMchntFileIdLessThanOrEqualTo(String value) {
            addCriterion("MCHNT_FILE_ID <=", value, "mchntFileId");
            return (Criteria) this;
        }

        public Criteria andMchntFileIdLike(String value) {
            addCriterion("MCHNT_FILE_ID like", value, "mchntFileId");
            return (Criteria) this;
        }

        public Criteria andMchntFileIdNotLike(String value) {
            addCriterion("MCHNT_FILE_ID not like", value, "mchntFileId");
            return (Criteria) this;
        }

        public Criteria andMchntFileIdIn(List<String> values) {
            addCriterion("MCHNT_FILE_ID in", values, "mchntFileId");
            return (Criteria) this;
        }

        public Criteria andMchntFileIdNotIn(List<String> values) {
            addCriterion("MCHNT_FILE_ID not in", values, "mchntFileId");
            return (Criteria) this;
        }

        public Criteria andMchntFileIdBetween(String value1, String value2) {
            addCriterion("MCHNT_FILE_ID between", value1, value2, "mchntFileId");
            return (Criteria) this;
        }

        public Criteria andMchntFileIdNotBetween(String value1, String value2) {
            addCriterion("MCHNT_FILE_ID not between", value1, value2, "mchntFileId");
            return (Criteria) this;
        }

        public Criteria andChnlFileIdIsNull() {
            addCriterion("CHNL_FILE_ID is null");
            return (Criteria) this;
        }

        public Criteria andChnlFileIdIsNotNull() {
            addCriterion("CHNL_FILE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andChnlFileIdEqualTo(String value) {
            addCriterion("CHNL_FILE_ID =", value, "chnlFileId");
            return (Criteria) this;
        }

        public Criteria andChnlFileIdNotEqualTo(String value) {
            addCriterion("CHNL_FILE_ID <>", value, "chnlFileId");
            return (Criteria) this;
        }

        public Criteria andChnlFileIdGreaterThan(String value) {
            addCriterion("CHNL_FILE_ID >", value, "chnlFileId");
            return (Criteria) this;
        }

        public Criteria andChnlFileIdGreaterThanOrEqualTo(String value) {
            addCriterion("CHNL_FILE_ID >=", value, "chnlFileId");
            return (Criteria) this;
        }

        public Criteria andChnlFileIdLessThan(String value) {
            addCriterion("CHNL_FILE_ID <", value, "chnlFileId");
            return (Criteria) this;
        }

        public Criteria andChnlFileIdLessThanOrEqualTo(String value) {
            addCriterion("CHNL_FILE_ID <=", value, "chnlFileId");
            return (Criteria) this;
        }

        public Criteria andChnlFileIdLike(String value) {
            addCriterion("CHNL_FILE_ID like", value, "chnlFileId");
            return (Criteria) this;
        }

        public Criteria andChnlFileIdNotLike(String value) {
            addCriterion("CHNL_FILE_ID not like", value, "chnlFileId");
            return (Criteria) this;
        }

        public Criteria andChnlFileIdIn(List<String> values) {
            addCriterion("CHNL_FILE_ID in", values, "chnlFileId");
            return (Criteria) this;
        }

        public Criteria andChnlFileIdNotIn(List<String> values) {
            addCriterion("CHNL_FILE_ID not in", values, "chnlFileId");
            return (Criteria) this;
        }

        public Criteria andChnlFileIdBetween(String value1, String value2) {
            addCriterion("CHNL_FILE_ID between", value1, value2, "chnlFileId");
            return (Criteria) this;
        }

        public Criteria andChnlFileIdNotBetween(String value1, String value2) {
            addCriterion("CHNL_FILE_ID not between", value1, value2, "chnlFileId");
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

        public Criteria andChnlIdIsNull() {
            addCriterion("chnl_id is null");
            return (Criteria) this;
        }

        public Criteria andChnlIdIsNotNull() {
            addCriterion("chnl_id is not null");
            return (Criteria) this;
        }

        public Criteria andChnlIdEqualTo(String value) {
            addCriterion("chnl_id =", value, "chnlId");
            return (Criteria) this;
        }

        public Criteria andChnlIdNotEqualTo(String value) {
            addCriterion("chnl_id <>", value, "chnlId");
            return (Criteria) this;
        }

        public Criteria andChnlIdGreaterThan(String value) {
            addCriterion("chnl_id >", value, "chnlId");
            return (Criteria) this;
        }

        public Criteria andChnlIdGreaterThanOrEqualTo(String value) {
            addCriterion("chnl_id >=", value, "chnlId");
            return (Criteria) this;
        }

        public Criteria andChnlIdLessThan(String value) {
            addCriterion("chnl_id <", value, "chnlId");
            return (Criteria) this;
        }

        public Criteria andChnlIdLessThanOrEqualTo(String value) {
            addCriterion("chnl_id <=", value, "chnlId");
            return (Criteria) this;
        }

        public Criteria andChnlIdLike(String value) {
            addCriterion("chnl_id like", value, "chnlId");
            return (Criteria) this;
        }

        public Criteria andChnlIdNotLike(String value) {
            addCriterion("chnl_id not like", value, "chnlId");
            return (Criteria) this;
        }

        public Criteria andChnlIdIn(List<String> values) {
            addCriterion("chnl_id in", values, "chnlId");
            return (Criteria) this;
        }

        public Criteria andChnlIdNotIn(List<String> values) {
            addCriterion("chnl_id not in", values, "chnlId");
            return (Criteria) this;
        }

        public Criteria andChnlIdBetween(String value1, String value2) {
            addCriterion("chnl_id between", value1, value2, "chnlId");
            return (Criteria) this;
        }

        public Criteria andChnlIdNotBetween(String value1, String value2) {
            addCriterion("chnl_id not between", value1, value2, "chnlId");
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

        public Criteria andSendOrderIdIsNull() {
            addCriterion("send_order_id is null");
            return (Criteria) this;
        }

        public Criteria andSendOrderIdIsNotNull() {
            addCriterion("send_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andSendOrderIdEqualTo(String value) {
            addCriterion("send_order_id =", value, "sendOrderId");
            return (Criteria) this;
        }

        public Criteria andSendOrderIdNotEqualTo(String value) {
            addCriterion("send_order_id <>", value, "sendOrderId");
            return (Criteria) this;
        }

        public Criteria andSendOrderIdGreaterThan(String value) {
            addCriterion("send_order_id >", value, "sendOrderId");
            return (Criteria) this;
        }

        public Criteria andSendOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("send_order_id >=", value, "sendOrderId");
            return (Criteria) this;
        }

        public Criteria andSendOrderIdLessThan(String value) {
            addCriterion("send_order_id <", value, "sendOrderId");
            return (Criteria) this;
        }

        public Criteria andSendOrderIdLessThanOrEqualTo(String value) {
            addCriterion("send_order_id <=", value, "sendOrderId");
            return (Criteria) this;
        }

        public Criteria andSendOrderIdLike(String value) {
            addCriterion("send_order_id like", value, "sendOrderId");
            return (Criteria) this;
        }

        public Criteria andSendOrderIdNotLike(String value) {
            addCriterion("send_order_id not like", value, "sendOrderId");
            return (Criteria) this;
        }

        public Criteria andSendOrderIdIn(List<String> values) {
            addCriterion("send_order_id in", values, "sendOrderId");
            return (Criteria) this;
        }

        public Criteria andSendOrderIdNotIn(List<String> values) {
            addCriterion("send_order_id not in", values, "sendOrderId");
            return (Criteria) this;
        }

        public Criteria andSendOrderIdBetween(String value1, String value2) {
            addCriterion("send_order_id between", value1, value2, "sendOrderId");
            return (Criteria) this;
        }

        public Criteria andSendOrderIdNotBetween(String value1, String value2) {
            addCriterion("send_order_id not between", value1, value2, "sendOrderId");
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

        public Criteria andMchntOrderIdIsNull() {
            addCriterion("mchnt_order_id is null");
            return (Criteria) this;
        }

        public Criteria andMchntOrderIdIsNotNull() {
            addCriterion("mchnt_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andMchntOrderIdEqualTo(String value) {
            addCriterion("mchnt_order_id =", value, "mchntOrderId");
            return (Criteria) this;
        }

        public Criteria andMchntOrderIdNotEqualTo(String value) {
            addCriterion("mchnt_order_id <>", value, "mchntOrderId");
            return (Criteria) this;
        }

        public Criteria andMchntOrderIdGreaterThan(String value) {
            addCriterion("mchnt_order_id >", value, "mchntOrderId");
            return (Criteria) this;
        }

        public Criteria andMchntOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("mchnt_order_id >=", value, "mchntOrderId");
            return (Criteria) this;
        }

        public Criteria andMchntOrderIdLessThan(String value) {
            addCriterion("mchnt_order_id <", value, "mchntOrderId");
            return (Criteria) this;
        }

        public Criteria andMchntOrderIdLessThanOrEqualTo(String value) {
            addCriterion("mchnt_order_id <=", value, "mchntOrderId");
            return (Criteria) this;
        }

        public Criteria andMchntOrderIdLike(String value) {
            addCriterion("mchnt_order_id like", value, "mchntOrderId");
            return (Criteria) this;
        }

        public Criteria andMchntOrderIdNotLike(String value) {
            addCriterion("mchnt_order_id not like", value, "mchntOrderId");
            return (Criteria) this;
        }

        public Criteria andMchntOrderIdIn(List<String> values) {
            addCriterion("mchnt_order_id in", values, "mchntOrderId");
            return (Criteria) this;
        }

        public Criteria andMchntOrderIdNotIn(List<String> values) {
            addCriterion("mchnt_order_id not in", values, "mchntOrderId");
            return (Criteria) this;
        }

        public Criteria andMchntOrderIdBetween(String value1, String value2) {
            addCriterion("mchnt_order_id between", value1, value2, "mchntOrderId");
            return (Criteria) this;
        }

        public Criteria andMchntOrderIdNotBetween(String value1, String value2) {
            addCriterion("mchnt_order_id not between", value1, value2, "mchntOrderId");
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

        public Criteria andTransFeeIsNull() {
            addCriterion("trans_fee is null");
            return (Criteria) this;
        }

        public Criteria andTransFeeIsNotNull() {
            addCriterion("trans_fee is not null");
            return (Criteria) this;
        }

        public Criteria andTransFeeEqualTo(Long value) {
            addCriterion("trans_fee =", value, "transFee");
            return (Criteria) this;
        }

        public Criteria andTransFeeNotEqualTo(Long value) {
            addCriterion("trans_fee <>", value, "transFee");
            return (Criteria) this;
        }

        public Criteria andTransFeeGreaterThan(Long value) {
            addCriterion("trans_fee >", value, "transFee");
            return (Criteria) this;
        }

        public Criteria andTransFeeGreaterThanOrEqualTo(Long value) {
            addCriterion("trans_fee >=", value, "transFee");
            return (Criteria) this;
        }

        public Criteria andTransFeeLessThan(Long value) {
            addCriterion("trans_fee <", value, "transFee");
            return (Criteria) this;
        }

        public Criteria andTransFeeLessThanOrEqualTo(Long value) {
            addCriterion("trans_fee <=", value, "transFee");
            return (Criteria) this;
        }

        public Criteria andTransFeeIn(List<Long> values) {
            addCriterion("trans_fee in", values, "transFee");
            return (Criteria) this;
        }

        public Criteria andTransFeeNotIn(List<Long> values) {
            addCriterion("trans_fee not in", values, "transFee");
            return (Criteria) this;
        }

        public Criteria andTransFeeBetween(Long value1, Long value2) {
            addCriterion("trans_fee between", value1, value2, "transFee");
            return (Criteria) this;
        }

        public Criteria andTransFeeNotBetween(Long value1, Long value2) {
            addCriterion("trans_fee not between", value1, value2, "transFee");
            return (Criteria) this;
        }

        public Criteria andChnlTransTmsIsNull() {
            addCriterion("chnl_trans_tms is null");
            return (Criteria) this;
        }

        public Criteria andChnlTransTmsIsNotNull() {
            addCriterion("chnl_trans_tms is not null");
            return (Criteria) this;
        }

        public Criteria andChnlTransTmsEqualTo(String value) {
            addCriterion("chnl_trans_tms =", value, "chnlTransTms");
            return (Criteria) this;
        }

        public Criteria andChnlTransTmsNotEqualTo(String value) {
            addCriterion("chnl_trans_tms <>", value, "chnlTransTms");
            return (Criteria) this;
        }

        public Criteria andChnlTransTmsGreaterThan(String value) {
            addCriterion("chnl_trans_tms >", value, "chnlTransTms");
            return (Criteria) this;
        }

        public Criteria andChnlTransTmsGreaterThanOrEqualTo(String value) {
            addCriterion("chnl_trans_tms >=", value, "chnlTransTms");
            return (Criteria) this;
        }

        public Criteria andChnlTransTmsLessThan(String value) {
            addCriterion("chnl_trans_tms <", value, "chnlTransTms");
            return (Criteria) this;
        }

        public Criteria andChnlTransTmsLessThanOrEqualTo(String value) {
            addCriterion("chnl_trans_tms <=", value, "chnlTransTms");
            return (Criteria) this;
        }

        public Criteria andChnlTransTmsLike(String value) {
            addCriterion("chnl_trans_tms like", value, "chnlTransTms");
            return (Criteria) this;
        }

        public Criteria andChnlTransTmsNotLike(String value) {
            addCriterion("chnl_trans_tms not like", value, "chnlTransTms");
            return (Criteria) this;
        }

        public Criteria andChnlTransTmsIn(List<String> values) {
            addCriterion("chnl_trans_tms in", values, "chnlTransTms");
            return (Criteria) this;
        }

        public Criteria andChnlTransTmsNotIn(List<String> values) {
            addCriterion("chnl_trans_tms not in", values, "chnlTransTms");
            return (Criteria) this;
        }

        public Criteria andChnlTransTmsBetween(String value1, String value2) {
            addCriterion("chnl_trans_tms between", value1, value2, "chnlTransTms");
            return (Criteria) this;
        }

        public Criteria andChnlTransTmsNotBetween(String value1, String value2) {
            addCriterion("chnl_trans_tms not between", value1, value2, "chnlTransTms");
            return (Criteria) this;
        }

        public Criteria andChnlTransIdIsNull() {
            addCriterion("chnl_trans_id is null");
            return (Criteria) this;
        }

        public Criteria andChnlTransIdIsNotNull() {
            addCriterion("chnl_trans_id is not null");
            return (Criteria) this;
        }

        public Criteria andChnlTransIdEqualTo(String value) {
            addCriterion("chnl_trans_id =", value, "chnlTransId");
            return (Criteria) this;
        }

        public Criteria andChnlTransIdNotEqualTo(String value) {
            addCriterion("chnl_trans_id <>", value, "chnlTransId");
            return (Criteria) this;
        }

        public Criteria andChnlTransIdGreaterThan(String value) {
            addCriterion("chnl_trans_id >", value, "chnlTransId");
            return (Criteria) this;
        }

        public Criteria andChnlTransIdGreaterThanOrEqualTo(String value) {
            addCriterion("chnl_trans_id >=", value, "chnlTransId");
            return (Criteria) this;
        }

        public Criteria andChnlTransIdLessThan(String value) {
            addCriterion("chnl_trans_id <", value, "chnlTransId");
            return (Criteria) this;
        }

        public Criteria andChnlTransIdLessThanOrEqualTo(String value) {
            addCriterion("chnl_trans_id <=", value, "chnlTransId");
            return (Criteria) this;
        }

        public Criteria andChnlTransIdLike(String value) {
            addCriterion("chnl_trans_id like", value, "chnlTransId");
            return (Criteria) this;
        }

        public Criteria andChnlTransIdNotLike(String value) {
            addCriterion("chnl_trans_id not like", value, "chnlTransId");
            return (Criteria) this;
        }

        public Criteria andChnlTransIdIn(List<String> values) {
            addCriterion("chnl_trans_id in", values, "chnlTransId");
            return (Criteria) this;
        }

        public Criteria andChnlTransIdNotIn(List<String> values) {
            addCriterion("chnl_trans_id not in", values, "chnlTransId");
            return (Criteria) this;
        }

        public Criteria andChnlTransIdBetween(String value1, String value2) {
            addCriterion("chnl_trans_id between", value1, value2, "chnlTransId");
            return (Criteria) this;
        }

        public Criteria andChnlTransIdNotBetween(String value1, String value2) {
            addCriterion("chnl_trans_id not between", value1, value2, "chnlTransId");
            return (Criteria) this;
        }

        public Criteria andOrigSndOrderIdIsNull() {
            addCriterion("orig_snd_order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrigSndOrderIdIsNotNull() {
            addCriterion("orig_snd_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrigSndOrderIdEqualTo(String value) {
            addCriterion("orig_snd_order_id =", value, "origSndOrderId");
            return (Criteria) this;
        }

        public Criteria andOrigSndOrderIdNotEqualTo(String value) {
            addCriterion("orig_snd_order_id <>", value, "origSndOrderId");
            return (Criteria) this;
        }

        public Criteria andOrigSndOrderIdGreaterThan(String value) {
            addCriterion("orig_snd_order_id >", value, "origSndOrderId");
            return (Criteria) this;
        }

        public Criteria andOrigSndOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("orig_snd_order_id >=", value, "origSndOrderId");
            return (Criteria) this;
        }

        public Criteria andOrigSndOrderIdLessThan(String value) {
            addCriterion("orig_snd_order_id <", value, "origSndOrderId");
            return (Criteria) this;
        }

        public Criteria andOrigSndOrderIdLessThanOrEqualTo(String value) {
            addCriterion("orig_snd_order_id <=", value, "origSndOrderId");
            return (Criteria) this;
        }

        public Criteria andOrigSndOrderIdLike(String value) {
            addCriterion("orig_snd_order_id like", value, "origSndOrderId");
            return (Criteria) this;
        }

        public Criteria andOrigSndOrderIdNotLike(String value) {
            addCriterion("orig_snd_order_id not like", value, "origSndOrderId");
            return (Criteria) this;
        }

        public Criteria andOrigSndOrderIdIn(List<String> values) {
            addCriterion("orig_snd_order_id in", values, "origSndOrderId");
            return (Criteria) this;
        }

        public Criteria andOrigSndOrderIdNotIn(List<String> values) {
            addCriterion("orig_snd_order_id not in", values, "origSndOrderId");
            return (Criteria) this;
        }

        public Criteria andOrigSndOrderIdBetween(String value1, String value2) {
            addCriterion("orig_snd_order_id between", value1, value2, "origSndOrderId");
            return (Criteria) this;
        }

        public Criteria andOrigSndOrderIdNotBetween(String value1, String value2) {
            addCriterion("orig_snd_order_id not between", value1, value2, "origSndOrderId");
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
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}