package com.fosun.paymng.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PayBankInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PayBankInfExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected PayBankInfExample(PayBankInfExample example) {
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

        public Criteria andBankIdIsNull() {
            addCriterion("bank_id is null");
            return (Criteria) this;
        }

        public Criteria andBankIdIsNotNull() {
            addCriterion("bank_id is not null");
            return (Criteria) this;
        }

        public Criteria andBankIdEqualTo(String value) {
            addCriterion("bank_id =", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotEqualTo(String value) {
            addCriterion("bank_id <>", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdGreaterThan(String value) {
            addCriterion("bank_id >", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdGreaterThanOrEqualTo(String value) {
            addCriterion("bank_id >=", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLessThan(String value) {
            addCriterion("bank_id <", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLessThanOrEqualTo(String value) {
            addCriterion("bank_id <=", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLike(String value) {
            addCriterion("bank_id like", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotLike(String value) {
            addCriterion("bank_id not like", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdIn(List<String> values) {
            addCriterion("bank_id in", values, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotIn(List<String> values) {
            addCriterion("bank_id not in", values, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdBetween(String value1, String value2) {
            addCriterion("bank_id between", value1, value2, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotBetween(String value1, String value2) {
            addCriterion("bank_id not between", value1, value2, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankEcdIsNull() {
            addCriterion("bank_ecd is null");
            return (Criteria) this;
        }

        public Criteria andBankEcdIsNotNull() {
            addCriterion("bank_ecd is not null");
            return (Criteria) this;
        }

        public Criteria andBankEcdEqualTo(String value) {
            addCriterion("bank_ecd =", value, "bankEcd");
            return (Criteria) this;
        }

        public Criteria andBankEcdNotEqualTo(String value) {
            addCriterion("bank_ecd <>", value, "bankEcd");
            return (Criteria) this;
        }

        public Criteria andBankEcdGreaterThan(String value) {
            addCriterion("bank_ecd >", value, "bankEcd");
            return (Criteria) this;
        }

        public Criteria andBankEcdGreaterThanOrEqualTo(String value) {
            addCriterion("bank_ecd >=", value, "bankEcd");
            return (Criteria) this;
        }

        public Criteria andBankEcdLessThan(String value) {
            addCriterion("bank_ecd <", value, "bankEcd");
            return (Criteria) this;
        }

        public Criteria andBankEcdLessThanOrEqualTo(String value) {
            addCriterion("bank_ecd <=", value, "bankEcd");
            return (Criteria) this;
        }

        public Criteria andBankEcdLike(String value) {
            addCriterion("bank_ecd like", value, "bankEcd");
            return (Criteria) this;
        }

        public Criteria andBankEcdNotLike(String value) {
            addCriterion("bank_ecd not like", value, "bankEcd");
            return (Criteria) this;
        }

        public Criteria andBankEcdIn(List<String> values) {
            addCriterion("bank_ecd in", values, "bankEcd");
            return (Criteria) this;
        }

        public Criteria andBankEcdNotIn(List<String> values) {
            addCriterion("bank_ecd not in", values, "bankEcd");
            return (Criteria) this;
        }

        public Criteria andBankEcdBetween(String value1, String value2) {
            addCriterion("bank_ecd between", value1, value2, "bankEcd");
            return (Criteria) this;
        }

        public Criteria andBankEcdNotBetween(String value1, String value2) {
            addCriterion("bank_ecd not between", value1, value2, "bankEcd");
            return (Criteria) this;
        }

        public Criteria andSwiftCodeIsNull() {
            addCriterion("swift_code is null");
            return (Criteria) this;
        }

        public Criteria andSwiftCodeIsNotNull() {
            addCriterion("swift_code is not null");
            return (Criteria) this;
        }

        public Criteria andSwiftCodeEqualTo(String value) {
            addCriterion("swift_code =", value, "swiftCode");
            return (Criteria) this;
        }

        public Criteria andSwiftCodeNotEqualTo(String value) {
            addCriterion("swift_code <>", value, "swiftCode");
            return (Criteria) this;
        }

        public Criteria andSwiftCodeGreaterThan(String value) {
            addCriterion("swift_code >", value, "swiftCode");
            return (Criteria) this;
        }

        public Criteria andSwiftCodeGreaterThanOrEqualTo(String value) {
            addCriterion("swift_code >=", value, "swiftCode");
            return (Criteria) this;
        }

        public Criteria andSwiftCodeLessThan(String value) {
            addCriterion("swift_code <", value, "swiftCode");
            return (Criteria) this;
        }

        public Criteria andSwiftCodeLessThanOrEqualTo(String value) {
            addCriterion("swift_code <=", value, "swiftCode");
            return (Criteria) this;
        }

        public Criteria andSwiftCodeLike(String value) {
            addCriterion("swift_code like", value, "swiftCode");
            return (Criteria) this;
        }

        public Criteria andSwiftCodeNotLike(String value) {
            addCriterion("swift_code not like", value, "swiftCode");
            return (Criteria) this;
        }

        public Criteria andSwiftCodeIn(List<String> values) {
            addCriterion("swift_code in", values, "swiftCode");
            return (Criteria) this;
        }

        public Criteria andSwiftCodeNotIn(List<String> values) {
            addCriterion("swift_code not in", values, "swiftCode");
            return (Criteria) this;
        }

        public Criteria andSwiftCodeBetween(String value1, String value2) {
            addCriterion("swift_code between", value1, value2, "swiftCode");
            return (Criteria) this;
        }

        public Criteria andSwiftCodeNotBetween(String value1, String value2) {
            addCriterion("swift_code not between", value1, value2, "swiftCode");
            return (Criteria) this;
        }

        public Criteria andBankNmIsNull() {
            addCriterion("bank_nm is null");
            return (Criteria) this;
        }

        public Criteria andBankNmIsNotNull() {
            addCriterion("bank_nm is not null");
            return (Criteria) this;
        }

        public Criteria andBankNmEqualTo(String value) {
            addCriterion("bank_nm =", value, "bankNm");
            return (Criteria) this;
        }

        public Criteria andBankNmNotEqualTo(String value) {
            addCriterion("bank_nm <>", value, "bankNm");
            return (Criteria) this;
        }

        public Criteria andBankNmGreaterThan(String value) {
            addCriterion("bank_nm >", value, "bankNm");
            return (Criteria) this;
        }

        public Criteria andBankNmGreaterThanOrEqualTo(String value) {
            addCriterion("bank_nm >=", value, "bankNm");
            return (Criteria) this;
        }

        public Criteria andBankNmLessThan(String value) {
            addCriterion("bank_nm <", value, "bankNm");
            return (Criteria) this;
        }

        public Criteria andBankNmLessThanOrEqualTo(String value) {
            addCriterion("bank_nm <=", value, "bankNm");
            return (Criteria) this;
        }

        public Criteria andBankNmLike(String value) {
            addCriterion("bank_nm like", value, "bankNm");
            return (Criteria) this;
        }

        public Criteria andBankNmNotLike(String value) {
            addCriterion("bank_nm not like", value, "bankNm");
            return (Criteria) this;
        }

        public Criteria andBankNmIn(List<String> values) {
            addCriterion("bank_nm in", values, "bankNm");
            return (Criteria) this;
        }

        public Criteria andBankNmNotIn(List<String> values) {
            addCriterion("bank_nm not in", values, "bankNm");
            return (Criteria) this;
        }

        public Criteria andBankNmBetween(String value1, String value2) {
            addCriterion("bank_nm between", value1, value2, "bankNm");
            return (Criteria) this;
        }

        public Criteria andBankNmNotBetween(String value1, String value2) {
            addCriterion("bank_nm not between", value1, value2, "bankNm");
            return (Criteria) this;
        }

        public Criteria andImageUrlIsNull() {
            addCriterion("image_url is null");
            return (Criteria) this;
        }

        public Criteria andImageUrlIsNotNull() {
            addCriterion("image_url is not null");
            return (Criteria) this;
        }

        public Criteria andImageUrlEqualTo(String value) {
            addCriterion("image_url =", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotEqualTo(String value) {
            addCriterion("image_url <>", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlGreaterThan(String value) {
            addCriterion("image_url >", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("image_url >=", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLessThan(String value) {
            addCriterion("image_url <", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLessThanOrEqualTo(String value) {
            addCriterion("image_url <=", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLike(String value) {
            addCriterion("image_url like", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotLike(String value) {
            addCriterion("image_url not like", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlIn(List<String> values) {
            addCriterion("image_url in", values, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotIn(List<String> values) {
            addCriterion("image_url not in", values, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlBetween(String value1, String value2) {
            addCriterion("image_url between", value1, value2, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotBetween(String value1, String value2) {
            addCriterion("image_url not between", value1, value2, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andDispOrderIsNull() {
            addCriterion("disp_order is null");
            return (Criteria) this;
        }

        public Criteria andDispOrderIsNotNull() {
            addCriterion("disp_order is not null");
            return (Criteria) this;
        }

        public Criteria andDispOrderEqualTo(Integer value) {
            addCriterion("disp_order =", value, "dispOrder");
            return (Criteria) this;
        }

        public Criteria andDispOrderNotEqualTo(Integer value) {
            addCriterion("disp_order <>", value, "dispOrder");
            return (Criteria) this;
        }

        public Criteria andDispOrderGreaterThan(Integer value) {
            addCriterion("disp_order >", value, "dispOrder");
            return (Criteria) this;
        }

        public Criteria andDispOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("disp_order >=", value, "dispOrder");
            return (Criteria) this;
        }

        public Criteria andDispOrderLessThan(Integer value) {
            addCriterion("disp_order <", value, "dispOrder");
            return (Criteria) this;
        }

        public Criteria andDispOrderLessThanOrEqualTo(Integer value) {
            addCriterion("disp_order <=", value, "dispOrder");
            return (Criteria) this;
        }

        public Criteria andDispOrderIn(List<Integer> values) {
            addCriterion("disp_order in", values, "dispOrder");
            return (Criteria) this;
        }

        public Criteria andDispOrderNotIn(List<Integer> values) {
            addCriterion("disp_order not in", values, "dispOrder");
            return (Criteria) this;
        }

        public Criteria andDispOrderBetween(Integer value1, Integer value2) {
            addCriterion("disp_order between", value1, value2, "dispOrder");
            return (Criteria) this;
        }

        public Criteria andDispOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("disp_order not between", value1, value2, "dispOrder");
            return (Criteria) this;
        }

        public Criteria andValidStIsNull() {
            addCriterion("valid_st is null");
            return (Criteria) this;
        }

        public Criteria andValidStIsNotNull() {
            addCriterion("valid_st is not null");
            return (Criteria) this;
        }

        public Criteria andValidStEqualTo(String value) {
            addCriterion("valid_st =", value, "validSt");
            return (Criteria) this;
        }

        public Criteria andValidStNotEqualTo(String value) {
            addCriterion("valid_st <>", value, "validSt");
            return (Criteria) this;
        }

        public Criteria andValidStGreaterThan(String value) {
            addCriterion("valid_st >", value, "validSt");
            return (Criteria) this;
        }

        public Criteria andValidStGreaterThanOrEqualTo(String value) {
            addCriterion("valid_st >=", value, "validSt");
            return (Criteria) this;
        }

        public Criteria andValidStLessThan(String value) {
            addCriterion("valid_st <", value, "validSt");
            return (Criteria) this;
        }

        public Criteria andValidStLessThanOrEqualTo(String value) {
            addCriterion("valid_st <=", value, "validSt");
            return (Criteria) this;
        }

        public Criteria andValidStLike(String value) {
            addCriterion("valid_st like", value, "validSt");
            return (Criteria) this;
        }

        public Criteria andValidStNotLike(String value) {
            addCriterion("valid_st not like", value, "validSt");
            return (Criteria) this;
        }

        public Criteria andValidStIn(List<String> values) {
            addCriterion("valid_st in", values, "validSt");
            return (Criteria) this;
        }

        public Criteria andValidStNotIn(List<String> values) {
            addCriterion("valid_st not in", values, "validSt");
            return (Criteria) this;
        }

        public Criteria andValidStBetween(String value1, String value2) {
            addCriterion("valid_st between", value1, value2, "validSt");
            return (Criteria) this;
        }

        public Criteria andValidStNotBetween(String value1, String value2) {
            addCriterion("valid_st not between", value1, value2, "validSt");
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