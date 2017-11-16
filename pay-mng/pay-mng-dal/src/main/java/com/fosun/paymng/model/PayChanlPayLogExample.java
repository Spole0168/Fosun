package com.fosun.paymng.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PayChanlPayLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PayChanlPayLogExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected PayChanlPayLogExample(PayChanlPayLogExample example) {
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

        public Criteria andTransPayIdIsNull() {
            addCriterion("trans_pay_id is null");
            return (Criteria) this;
        }

        public Criteria andTransPayIdIsNotNull() {
            addCriterion("trans_pay_id is not null");
            return (Criteria) this;
        }

        public Criteria andTransPayIdEqualTo(String value) {
            addCriterion("trans_pay_id =", value, "transPayId");
            return (Criteria) this;
        }

        public Criteria andTransPayIdNotEqualTo(String value) {
            addCriterion("trans_pay_id <>", value, "transPayId");
            return (Criteria) this;
        }

        public Criteria andTransPayIdGreaterThan(String value) {
            addCriterion("trans_pay_id >", value, "transPayId");
            return (Criteria) this;
        }

        public Criteria andTransPayIdGreaterThanOrEqualTo(String value) {
            addCriterion("trans_pay_id >=", value, "transPayId");
            return (Criteria) this;
        }

        public Criteria andTransPayIdLessThan(String value) {
            addCriterion("trans_pay_id <", value, "transPayId");
            return (Criteria) this;
        }

        public Criteria andTransPayIdLessThanOrEqualTo(String value) {
            addCriterion("trans_pay_id <=", value, "transPayId");
            return (Criteria) this;
        }

        public Criteria andTransPayIdLike(String value) {
            addCriterion("trans_pay_id like", value, "transPayId");
            return (Criteria) this;
        }

        public Criteria andTransPayIdNotLike(String value) {
            addCriterion("trans_pay_id not like", value, "transPayId");
            return (Criteria) this;
        }

        public Criteria andTransPayIdIn(List<String> values) {
            addCriterion("trans_pay_id in", values, "transPayId");
            return (Criteria) this;
        }

        public Criteria andTransPayIdNotIn(List<String> values) {
            addCriterion("trans_pay_id not in", values, "transPayId");
            return (Criteria) this;
        }

        public Criteria andTransPayIdBetween(String value1, String value2) {
            addCriterion("trans_pay_id between", value1, value2, "transPayId");
            return (Criteria) this;
        }

        public Criteria andTransPayIdNotBetween(String value1, String value2) {
            addCriterion("trans_pay_id not between", value1, value2, "transPayId");
            return (Criteria) this;
        }

        public Criteria andTransSeqIdIsNull() {
            addCriterion("trans_seq_id is null");
            return (Criteria) this;
        }

        public Criteria andTransSeqIdIsNotNull() {
            addCriterion("trans_seq_id is not null");
            return (Criteria) this;
        }

        public Criteria andTransSeqIdEqualTo(String value) {
            addCriterion("trans_seq_id =", value, "transSeqId");
            return (Criteria) this;
        }

        public Criteria andTransSeqIdNotEqualTo(String value) {
            addCriterion("trans_seq_id <>", value, "transSeqId");
            return (Criteria) this;
        }

        public Criteria andTransSeqIdGreaterThan(String value) {
            addCriterion("trans_seq_id >", value, "transSeqId");
            return (Criteria) this;
        }

        public Criteria andTransSeqIdGreaterThanOrEqualTo(String value) {
            addCriterion("trans_seq_id >=", value, "transSeqId");
            return (Criteria) this;
        }

        public Criteria andTransSeqIdLessThan(String value) {
            addCriterion("trans_seq_id <", value, "transSeqId");
            return (Criteria) this;
        }

        public Criteria andTransSeqIdLessThanOrEqualTo(String value) {
            addCriterion("trans_seq_id <=", value, "transSeqId");
            return (Criteria) this;
        }

        public Criteria andTransSeqIdLike(String value) {
            addCriterion("trans_seq_id like", value, "transSeqId");
            return (Criteria) this;
        }

        public Criteria andTransSeqIdNotLike(String value) {
            addCriterion("trans_seq_id not like", value, "transSeqId");
            return (Criteria) this;
        }

        public Criteria andTransSeqIdIn(List<String> values) {
            addCriterion("trans_seq_id in", values, "transSeqId");
            return (Criteria) this;
        }

        public Criteria andTransSeqIdNotIn(List<String> values) {
            addCriterion("trans_seq_id not in", values, "transSeqId");
            return (Criteria) this;
        }

        public Criteria andTransSeqIdBetween(String value1, String value2) {
            addCriterion("trans_seq_id between", value1, value2, "transSeqId");
            return (Criteria) this;
        }

        public Criteria andTransSeqIdNotBetween(String value1, String value2) {
            addCriterion("trans_seq_id not between", value1, value2, "transSeqId");
            return (Criteria) this;
        }

        public Criteria andExecuteSeqIdIsNull() {
            addCriterion("execute_seq_id is null");
            return (Criteria) this;
        }

        public Criteria andExecuteSeqIdIsNotNull() {
            addCriterion("execute_seq_id is not null");
            return (Criteria) this;
        }

        public Criteria andExecuteSeqIdEqualTo(Integer value) {
            addCriterion("execute_seq_id =", value, "executeSeqId");
            return (Criteria) this;
        }

        public Criteria andExecuteSeqIdNotEqualTo(Integer value) {
            addCriterion("execute_seq_id <>", value, "executeSeqId");
            return (Criteria) this;
        }

        public Criteria andExecuteSeqIdGreaterThan(Integer value) {
            addCriterion("execute_seq_id >", value, "executeSeqId");
            return (Criteria) this;
        }

        public Criteria andExecuteSeqIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("execute_seq_id >=", value, "executeSeqId");
            return (Criteria) this;
        }

        public Criteria andExecuteSeqIdLessThan(Integer value) {
            addCriterion("execute_seq_id <", value, "executeSeqId");
            return (Criteria) this;
        }

        public Criteria andExecuteSeqIdLessThanOrEqualTo(Integer value) {
            addCriterion("execute_seq_id <=", value, "executeSeqId");
            return (Criteria) this;
        }

        public Criteria andExecuteSeqIdIn(List<Integer> values) {
            addCriterion("execute_seq_id in", values, "executeSeqId");
            return (Criteria) this;
        }

        public Criteria andExecuteSeqIdNotIn(List<Integer> values) {
            addCriterion("execute_seq_id not in", values, "executeSeqId");
            return (Criteria) this;
        }

        public Criteria andExecuteSeqIdBetween(Integer value1, Integer value2) {
            addCriterion("execute_seq_id between", value1, value2, "executeSeqId");
            return (Criteria) this;
        }

        public Criteria andExecuteSeqIdNotBetween(Integer value1, Integer value2) {
            addCriterion("execute_seq_id not between", value1, value2, "executeSeqId");
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

        public Criteria andTransStIsNull() {
            addCriterion("trans_st is null");
            return (Criteria) this;
        }

        public Criteria andTransStIsNotNull() {
            addCriterion("trans_st is not null");
            return (Criteria) this;
        }

        public Criteria andTransStEqualTo(String value) {
            addCriterion("trans_st =", value, "transSt");
            return (Criteria) this;
        }

        public Criteria andTransStNotEqualTo(String value) {
            addCriterion("trans_st <>", value, "transSt");
            return (Criteria) this;
        }

        public Criteria andTransStGreaterThan(String value) {
            addCriterion("trans_st >", value, "transSt");
            return (Criteria) this;
        }

        public Criteria andTransStGreaterThanOrEqualTo(String value) {
            addCriterion("trans_st >=", value, "transSt");
            return (Criteria) this;
        }

        public Criteria andTransStLessThan(String value) {
            addCriterion("trans_st <", value, "transSt");
            return (Criteria) this;
        }

        public Criteria andTransStLessThanOrEqualTo(String value) {
            addCriterion("trans_st <=", value, "transSt");
            return (Criteria) this;
        }

        public Criteria andTransStLike(String value) {
            addCriterion("trans_st like", value, "transSt");
            return (Criteria) this;
        }

        public Criteria andTransStNotLike(String value) {
            addCriterion("trans_st not like", value, "transSt");
            return (Criteria) this;
        }

        public Criteria andTransStIn(List<String> values) {
            addCriterion("trans_st in", values, "transSt");
            return (Criteria) this;
        }

        public Criteria andTransStNotIn(List<String> values) {
            addCriterion("trans_st not in", values, "transSt");
            return (Criteria) this;
        }

        public Criteria andTransStBetween(String value1, String value2) {
            addCriterion("trans_st between", value1, value2, "transSt");
            return (Criteria) this;
        }

        public Criteria andTransStNotBetween(String value1, String value2) {
            addCriterion("trans_st not between", value1, value2, "transSt");
            return (Criteria) this;
        }

        public Criteria andChnlRspCdIsNull() {
            addCriterion("chnl_rsp_cd is null");
            return (Criteria) this;
        }

        public Criteria andChnlRspCdIsNotNull() {
            addCriterion("chnl_rsp_cd is not null");
            return (Criteria) this;
        }

        public Criteria andChnlRspCdEqualTo(String value) {
            addCriterion("chnl_rsp_cd =", value, "chnlRspCd");
            return (Criteria) this;
        }

        public Criteria andChnlRspCdNotEqualTo(String value) {
            addCriterion("chnl_rsp_cd <>", value, "chnlRspCd");
            return (Criteria) this;
        }

        public Criteria andChnlRspCdGreaterThan(String value) {
            addCriterion("chnl_rsp_cd >", value, "chnlRspCd");
            return (Criteria) this;
        }

        public Criteria andChnlRspCdGreaterThanOrEqualTo(String value) {
            addCriterion("chnl_rsp_cd >=", value, "chnlRspCd");
            return (Criteria) this;
        }

        public Criteria andChnlRspCdLessThan(String value) {
            addCriterion("chnl_rsp_cd <", value, "chnlRspCd");
            return (Criteria) this;
        }

        public Criteria andChnlRspCdLessThanOrEqualTo(String value) {
            addCriterion("chnl_rsp_cd <=", value, "chnlRspCd");
            return (Criteria) this;
        }

        public Criteria andChnlRspCdLike(String value) {
            addCriterion("chnl_rsp_cd like", value, "chnlRspCd");
            return (Criteria) this;
        }

        public Criteria andChnlRspCdNotLike(String value) {
            addCriterion("chnl_rsp_cd not like", value, "chnlRspCd");
            return (Criteria) this;
        }

        public Criteria andChnlRspCdIn(List<String> values) {
            addCriterion("chnl_rsp_cd in", values, "chnlRspCd");
            return (Criteria) this;
        }

        public Criteria andChnlRspCdNotIn(List<String> values) {
            addCriterion("chnl_rsp_cd not in", values, "chnlRspCd");
            return (Criteria) this;
        }

        public Criteria andChnlRspCdBetween(String value1, String value2) {
            addCriterion("chnl_rsp_cd between", value1, value2, "chnlRspCd");
            return (Criteria) this;
        }

        public Criteria andChnlRspCdNotBetween(String value1, String value2) {
            addCriterion("chnl_rsp_cd not between", value1, value2, "chnlRspCd");
            return (Criteria) this;
        }

        public Criteria andSysTransTmsIsNull() {
            addCriterion("sys_trans_tms is null");
            return (Criteria) this;
        }

        public Criteria andSysTransTmsIsNotNull() {
            addCriterion("sys_trans_tms is not null");
            return (Criteria) this;
        }

        public Criteria andSysTransTmsEqualTo(Date value) {
            addCriterion("sys_trans_tms =", value, "sysTransTms");
            return (Criteria) this;
        }

        public Criteria andSysTransTmsNotEqualTo(Date value) {
            addCriterion("sys_trans_tms <>", value, "sysTransTms");
            return (Criteria) this;
        }

        public Criteria andSysTransTmsGreaterThan(Date value) {
            addCriterion("sys_trans_tms >", value, "sysTransTms");
            return (Criteria) this;
        }

        public Criteria andSysTransTmsGreaterThanOrEqualTo(Date value) {
            addCriterion("sys_trans_tms >=", value, "sysTransTms");
            return (Criteria) this;
        }

        public Criteria andSysTransTmsLessThan(Date value) {
            addCriterion("sys_trans_tms <", value, "sysTransTms");
            return (Criteria) this;
        }

        public Criteria andSysTransTmsLessThanOrEqualTo(Date value) {
            addCriterion("sys_trans_tms <=", value, "sysTransTms");
            return (Criteria) this;
        }

        public Criteria andSysTransTmsIn(List<Date> values) {
            addCriterion("sys_trans_tms in", values, "sysTransTms");
            return (Criteria) this;
        }

        public Criteria andSysTransTmsNotIn(List<Date> values) {
            addCriterion("sys_trans_tms not in", values, "sysTransTms");
            return (Criteria) this;
        }

        public Criteria andSysTransTmsBetween(Date value1, Date value2) {
            addCriterion("sys_trans_tms between", value1, value2, "sysTransTms");
            return (Criteria) this;
        }

        public Criteria andSysTransTmsNotBetween(Date value1, Date value2) {
            addCriterion("sys_trans_tms not between", value1, value2, "sysTransTms");
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

        public Criteria andTransChnlIsNull() {
            addCriterion("trans_chnl is null");
            return (Criteria) this;
        }

        public Criteria andTransChnlIsNotNull() {
            addCriterion("trans_chnl is not null");
            return (Criteria) this;
        }

        public Criteria andTransChnlEqualTo(String value) {
            addCriterion("trans_chnl =", value, "transChnl");
            return (Criteria) this;
        }

        public Criteria andTransChnlNotEqualTo(String value) {
            addCriterion("trans_chnl <>", value, "transChnl");
            return (Criteria) this;
        }

        public Criteria andTransChnlGreaterThan(String value) {
            addCriterion("trans_chnl >", value, "transChnl");
            return (Criteria) this;
        }

        public Criteria andTransChnlGreaterThanOrEqualTo(String value) {
            addCriterion("trans_chnl >=", value, "transChnl");
            return (Criteria) this;
        }

        public Criteria andTransChnlLessThan(String value) {
            addCriterion("trans_chnl <", value, "transChnl");
            return (Criteria) this;
        }

        public Criteria andTransChnlLessThanOrEqualTo(String value) {
            addCriterion("trans_chnl <=", value, "transChnl");
            return (Criteria) this;
        }

        public Criteria andTransChnlLike(String value) {
            addCriterion("trans_chnl like", value, "transChnl");
            return (Criteria) this;
        }

        public Criteria andTransChnlNotLike(String value) {
            addCriterion("trans_chnl not like", value, "transChnl");
            return (Criteria) this;
        }

        public Criteria andTransChnlIn(List<String> values) {
            addCriterion("trans_chnl in", values, "transChnl");
            return (Criteria) this;
        }

        public Criteria andTransChnlNotIn(List<String> values) {
            addCriterion("trans_chnl not in", values, "transChnl");
            return (Criteria) this;
        }

        public Criteria andTransChnlBetween(String value1, String value2) {
            addCriterion("trans_chnl between", value1, value2, "transChnl");
            return (Criteria) this;
        }

        public Criteria andTransChnlNotBetween(String value1, String value2) {
            addCriterion("trans_chnl not between", value1, value2, "transChnl");
            return (Criteria) this;
        }

        public Criteria andChnlActNoIsNull() {
            addCriterion("chnl_act_no is null");
            return (Criteria) this;
        }

        public Criteria andChnlActNoIsNotNull() {
            addCriterion("chnl_act_no is not null");
            return (Criteria) this;
        }

        public Criteria andChnlActNoEqualTo(String value) {
            addCriterion("chnl_act_no =", value, "chnlActNo");
            return (Criteria) this;
        }

        public Criteria andChnlActNoNotEqualTo(String value) {
            addCriterion("chnl_act_no <>", value, "chnlActNo");
            return (Criteria) this;
        }

        public Criteria andChnlActNoGreaterThan(String value) {
            addCriterion("chnl_act_no >", value, "chnlActNo");
            return (Criteria) this;
        }

        public Criteria andChnlActNoGreaterThanOrEqualTo(String value) {
            addCriterion("chnl_act_no >=", value, "chnlActNo");
            return (Criteria) this;
        }

        public Criteria andChnlActNoLessThan(String value) {
            addCriterion("chnl_act_no <", value, "chnlActNo");
            return (Criteria) this;
        }

        public Criteria andChnlActNoLessThanOrEqualTo(String value) {
            addCriterion("chnl_act_no <=", value, "chnlActNo");
            return (Criteria) this;
        }

        public Criteria andChnlActNoLike(String value) {
            addCriterion("chnl_act_no like", value, "chnlActNo");
            return (Criteria) this;
        }

        public Criteria andChnlActNoNotLike(String value) {
            addCriterion("chnl_act_no not like", value, "chnlActNo");
            return (Criteria) this;
        }

        public Criteria andChnlActNoIn(List<String> values) {
            addCriterion("chnl_act_no in", values, "chnlActNo");
            return (Criteria) this;
        }

        public Criteria andChnlActNoNotIn(List<String> values) {
            addCriterion("chnl_act_no not in", values, "chnlActNo");
            return (Criteria) this;
        }

        public Criteria andChnlActNoBetween(String value1, String value2) {
            addCriterion("chnl_act_no between", value1, value2, "chnlActNo");
            return (Criteria) this;
        }

        public Criteria andChnlActNoNotBetween(String value1, String value2) {
            addCriterion("chnl_act_no not between", value1, value2, "chnlActNo");
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

        public Criteria andChnlSettleDtIsNull() {
            addCriterion("chnl_settle_dt is null");
            return (Criteria) this;
        }

        public Criteria andChnlSettleDtIsNotNull() {
            addCriterion("chnl_settle_dt is not null");
            return (Criteria) this;
        }

        public Criteria andChnlSettleDtEqualTo(String value) {
            addCriterion("chnl_settle_dt =", value, "chnlSettleDt");
            return (Criteria) this;
        }

        public Criteria andChnlSettleDtNotEqualTo(String value) {
            addCriterion("chnl_settle_dt <>", value, "chnlSettleDt");
            return (Criteria) this;
        }

        public Criteria andChnlSettleDtGreaterThan(String value) {
            addCriterion("chnl_settle_dt >", value, "chnlSettleDt");
            return (Criteria) this;
        }

        public Criteria andChnlSettleDtGreaterThanOrEqualTo(String value) {
            addCriterion("chnl_settle_dt >=", value, "chnlSettleDt");
            return (Criteria) this;
        }

        public Criteria andChnlSettleDtLessThan(String value) {
            addCriterion("chnl_settle_dt <", value, "chnlSettleDt");
            return (Criteria) this;
        }

        public Criteria andChnlSettleDtLessThanOrEqualTo(String value) {
            addCriterion("chnl_settle_dt <=", value, "chnlSettleDt");
            return (Criteria) this;
        }

        public Criteria andChnlSettleDtLike(String value) {
            addCriterion("chnl_settle_dt like", value, "chnlSettleDt");
            return (Criteria) this;
        }

        public Criteria andChnlSettleDtNotLike(String value) {
            addCriterion("chnl_settle_dt not like", value, "chnlSettleDt");
            return (Criteria) this;
        }

        public Criteria andChnlSettleDtIn(List<String> values) {
            addCriterion("chnl_settle_dt in", values, "chnlSettleDt");
            return (Criteria) this;
        }

        public Criteria andChnlSettleDtNotIn(List<String> values) {
            addCriterion("chnl_settle_dt not in", values, "chnlSettleDt");
            return (Criteria) this;
        }

        public Criteria andChnlSettleDtBetween(String value1, String value2) {
            addCriterion("chnl_settle_dt between", value1, value2, "chnlSettleDt");
            return (Criteria) this;
        }

        public Criteria andChnlSettleDtNotBetween(String value1, String value2) {
            addCriterion("chnl_settle_dt not between", value1, value2, "chnlSettleDt");
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

        public Criteria andRecUpdTransIdIsNull() {
            addCriterion("rec_upd_trans_id is null");
            return (Criteria) this;
        }

        public Criteria andRecUpdTransIdIsNotNull() {
            addCriterion("rec_upd_trans_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecUpdTransIdEqualTo(String value) {
            addCriterion("rec_upd_trans_id =", value, "recUpdTransId");
            return (Criteria) this;
        }

        public Criteria andRecUpdTransIdNotEqualTo(String value) {
            addCriterion("rec_upd_trans_id <>", value, "recUpdTransId");
            return (Criteria) this;
        }

        public Criteria andRecUpdTransIdGreaterThan(String value) {
            addCriterion("rec_upd_trans_id >", value, "recUpdTransId");
            return (Criteria) this;
        }

        public Criteria andRecUpdTransIdGreaterThanOrEqualTo(String value) {
            addCriterion("rec_upd_trans_id >=", value, "recUpdTransId");
            return (Criteria) this;
        }

        public Criteria andRecUpdTransIdLessThan(String value) {
            addCriterion("rec_upd_trans_id <", value, "recUpdTransId");
            return (Criteria) this;
        }

        public Criteria andRecUpdTransIdLessThanOrEqualTo(String value) {
            addCriterion("rec_upd_trans_id <=", value, "recUpdTransId");
            return (Criteria) this;
        }

        public Criteria andRecUpdTransIdLike(String value) {
            addCriterion("rec_upd_trans_id like", value, "recUpdTransId");
            return (Criteria) this;
        }

        public Criteria andRecUpdTransIdNotLike(String value) {
            addCriterion("rec_upd_trans_id not like", value, "recUpdTransId");
            return (Criteria) this;
        }

        public Criteria andRecUpdTransIdIn(List<String> values) {
            addCriterion("rec_upd_trans_id in", values, "recUpdTransId");
            return (Criteria) this;
        }

        public Criteria andRecUpdTransIdNotIn(List<String> values) {
            addCriterion("rec_upd_trans_id not in", values, "recUpdTransId");
            return (Criteria) this;
        }

        public Criteria andRecUpdTransIdBetween(String value1, String value2) {
            addCriterion("rec_upd_trans_id between", value1, value2, "recUpdTransId");
            return (Criteria) this;
        }

        public Criteria andRecUpdTransIdNotBetween(String value1, String value2) {
            addCriterion("rec_upd_trans_id not between", value1, value2, "recUpdTransId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}