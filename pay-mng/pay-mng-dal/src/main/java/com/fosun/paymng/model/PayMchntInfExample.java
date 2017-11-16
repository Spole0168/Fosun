package com.fosun.paymng.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PayMchntInfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PayMchntInfExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected PayMchntInfExample(PayMchntInfExample example) {
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

        public Criteria andMchntNmIsNull() {
            addCriterion("mchnt_nm is null");
            return (Criteria) this;
        }

        public Criteria andMchntNmIsNotNull() {
            addCriterion("mchnt_nm is not null");
            return (Criteria) this;
        }

        public Criteria andMchntNmEqualTo(String value) {
            addCriterion("mchnt_nm =", value, "mchntNm");
            return (Criteria) this;
        }

        public Criteria andMchntNmNotEqualTo(String value) {
            addCriterion("mchnt_nm <>", value, "mchntNm");
            return (Criteria) this;
        }

        public Criteria andMchntNmGreaterThan(String value) {
            addCriterion("mchnt_nm >", value, "mchntNm");
            return (Criteria) this;
        }

        public Criteria andMchntNmGreaterThanOrEqualTo(String value) {
            addCriterion("mchnt_nm >=", value, "mchntNm");
            return (Criteria) this;
        }

        public Criteria andMchntNmLessThan(String value) {
            addCriterion("mchnt_nm <", value, "mchntNm");
            return (Criteria) this;
        }

        public Criteria andMchntNmLessThanOrEqualTo(String value) {
            addCriterion("mchnt_nm <=", value, "mchntNm");
            return (Criteria) this;
        }

        public Criteria andMchntNmLike(String value) {
            addCriterion("mchnt_nm like", value, "mchntNm");
            return (Criteria) this;
        }

        public Criteria andMchntNmNotLike(String value) {
            addCriterion("mchnt_nm not like", value, "mchntNm");
            return (Criteria) this;
        }

        public Criteria andMchntNmIn(List<String> values) {
            addCriterion("mchnt_nm in", values, "mchntNm");
            return (Criteria) this;
        }

        public Criteria andMchntNmNotIn(List<String> values) {
            addCriterion("mchnt_nm not in", values, "mchntNm");
            return (Criteria) this;
        }

        public Criteria andMchntNmBetween(String value1, String value2) {
            addCriterion("mchnt_nm between", value1, value2, "mchntNm");
            return (Criteria) this;
        }

        public Criteria andMchntNmNotBetween(String value1, String value2) {
            addCriterion("mchnt_nm not between", value1, value2, "mchntNm");
            return (Criteria) this;
        }

        public Criteria andMchntAbbrIsNull() {
            addCriterion("mchnt_abbr is null");
            return (Criteria) this;
        }

        public Criteria andMchntAbbrIsNotNull() {
            addCriterion("mchnt_abbr is not null");
            return (Criteria) this;
        }

        public Criteria andMchntAbbrEqualTo(String value) {
            addCriterion("mchnt_abbr =", value, "mchntAbbr");
            return (Criteria) this;
        }

        public Criteria andMchntAbbrNotEqualTo(String value) {
            addCriterion("mchnt_abbr <>", value, "mchntAbbr");
            return (Criteria) this;
        }

        public Criteria andMchntAbbrGreaterThan(String value) {
            addCriterion("mchnt_abbr >", value, "mchntAbbr");
            return (Criteria) this;
        }

        public Criteria andMchntAbbrGreaterThanOrEqualTo(String value) {
            addCriterion("mchnt_abbr >=", value, "mchntAbbr");
            return (Criteria) this;
        }

        public Criteria andMchntAbbrLessThan(String value) {
            addCriterion("mchnt_abbr <", value, "mchntAbbr");
            return (Criteria) this;
        }

        public Criteria andMchntAbbrLessThanOrEqualTo(String value) {
            addCriterion("mchnt_abbr <=", value, "mchntAbbr");
            return (Criteria) this;
        }

        public Criteria andMchntAbbrLike(String value) {
            addCriterion("mchnt_abbr like", value, "mchntAbbr");
            return (Criteria) this;
        }

        public Criteria andMchntAbbrNotLike(String value) {
            addCriterion("mchnt_abbr not like", value, "mchntAbbr");
            return (Criteria) this;
        }

        public Criteria andMchntAbbrIn(List<String> values) {
            addCriterion("mchnt_abbr in", values, "mchntAbbr");
            return (Criteria) this;
        }

        public Criteria andMchntAbbrNotIn(List<String> values) {
            addCriterion("mchnt_abbr not in", values, "mchntAbbr");
            return (Criteria) this;
        }

        public Criteria andMchntAbbrBetween(String value1, String value2) {
            addCriterion("mchnt_abbr between", value1, value2, "mchntAbbr");
            return (Criteria) this;
        }

        public Criteria andMchntAbbrNotBetween(String value1, String value2) {
            addCriterion("mchnt_abbr not between", value1, value2, "mchntAbbr");
            return (Criteria) this;
        }

        public Criteria andContactPersonNmIsNull() {
            addCriterion("contact_person_nm is null");
            return (Criteria) this;
        }

        public Criteria andContactPersonNmIsNotNull() {
            addCriterion("contact_person_nm is not null");
            return (Criteria) this;
        }

        public Criteria andContactPersonNmEqualTo(String value) {
            addCriterion("contact_person_nm =", value, "contactPersonNm");
            return (Criteria) this;
        }

        public Criteria andContactPersonNmNotEqualTo(String value) {
            addCriterion("contact_person_nm <>", value, "contactPersonNm");
            return (Criteria) this;
        }

        public Criteria andContactPersonNmGreaterThan(String value) {
            addCriterion("contact_person_nm >", value, "contactPersonNm");
            return (Criteria) this;
        }

        public Criteria andContactPersonNmGreaterThanOrEqualTo(String value) {
            addCriterion("contact_person_nm >=", value, "contactPersonNm");
            return (Criteria) this;
        }

        public Criteria andContactPersonNmLessThan(String value) {
            addCriterion("contact_person_nm <", value, "contactPersonNm");
            return (Criteria) this;
        }

        public Criteria andContactPersonNmLessThanOrEqualTo(String value) {
            addCriterion("contact_person_nm <=", value, "contactPersonNm");
            return (Criteria) this;
        }

        public Criteria andContactPersonNmLike(String value) {
            addCriterion("contact_person_nm like", value, "contactPersonNm");
            return (Criteria) this;
        }

        public Criteria andContactPersonNmNotLike(String value) {
            addCriterion("contact_person_nm not like", value, "contactPersonNm");
            return (Criteria) this;
        }

        public Criteria andContactPersonNmIn(List<String> values) {
            addCriterion("contact_person_nm in", values, "contactPersonNm");
            return (Criteria) this;
        }

        public Criteria andContactPersonNmNotIn(List<String> values) {
            addCriterion("contact_person_nm not in", values, "contactPersonNm");
            return (Criteria) this;
        }

        public Criteria andContactPersonNmBetween(String value1, String value2) {
            addCriterion("contact_person_nm between", value1, value2, "contactPersonNm");
            return (Criteria) this;
        }

        public Criteria andContactPersonNmNotBetween(String value1, String value2) {
            addCriterion("contact_person_nm not between", value1, value2, "contactPersonNm");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIsNull() {
            addCriterion("contact_phone is null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIsNotNull() {
            addCriterion("contact_phone is not null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneEqualTo(String value) {
            addCriterion("contact_phone =", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotEqualTo(String value) {
            addCriterion("contact_phone <>", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneGreaterThan(String value) {
            addCriterion("contact_phone >", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("contact_phone >=", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLessThan(String value) {
            addCriterion("contact_phone <", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLessThanOrEqualTo(String value) {
            addCriterion("contact_phone <=", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLike(String value) {
            addCriterion("contact_phone like", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotLike(String value) {
            addCriterion("contact_phone not like", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIn(List<String> values) {
            addCriterion("contact_phone in", values, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotIn(List<String> values) {
            addCriterion("contact_phone not in", values, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneBetween(String value1, String value2) {
            addCriterion("contact_phone between", value1, value2, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotBetween(String value1, String value2) {
            addCriterion("contact_phone not between", value1, value2, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactMailIsNull() {
            addCriterion("contact_mail is null");
            return (Criteria) this;
        }

        public Criteria andContactMailIsNotNull() {
            addCriterion("contact_mail is not null");
            return (Criteria) this;
        }

        public Criteria andContactMailEqualTo(String value) {
            addCriterion("contact_mail =", value, "contactMail");
            return (Criteria) this;
        }

        public Criteria andContactMailNotEqualTo(String value) {
            addCriterion("contact_mail <>", value, "contactMail");
            return (Criteria) this;
        }

        public Criteria andContactMailGreaterThan(String value) {
            addCriterion("contact_mail >", value, "contactMail");
            return (Criteria) this;
        }

        public Criteria andContactMailGreaterThanOrEqualTo(String value) {
            addCriterion("contact_mail >=", value, "contactMail");
            return (Criteria) this;
        }

        public Criteria andContactMailLessThan(String value) {
            addCriterion("contact_mail <", value, "contactMail");
            return (Criteria) this;
        }

        public Criteria andContactMailLessThanOrEqualTo(String value) {
            addCriterion("contact_mail <=", value, "contactMail");
            return (Criteria) this;
        }

        public Criteria andContactMailLike(String value) {
            addCriterion("contact_mail like", value, "contactMail");
            return (Criteria) this;
        }

        public Criteria andContactMailNotLike(String value) {
            addCriterion("contact_mail not like", value, "contactMail");
            return (Criteria) this;
        }

        public Criteria andContactMailIn(List<String> values) {
            addCriterion("contact_mail in", values, "contactMail");
            return (Criteria) this;
        }

        public Criteria andContactMailNotIn(List<String> values) {
            addCriterion("contact_mail not in", values, "contactMail");
            return (Criteria) this;
        }

        public Criteria andContactMailBetween(String value1, String value2) {
            addCriterion("contact_mail between", value1, value2, "contactMail");
            return (Criteria) this;
        }

        public Criteria andContactMailNotBetween(String value1, String value2) {
            addCriterion("contact_mail not between", value1, value2, "contactMail");
            return (Criteria) this;
        }

        public Criteria andBillRetUrlIsNull() {
            addCriterion("bill_ret_url is null");
            return (Criteria) this;
        }

        public Criteria andBillRetUrlIsNotNull() {
            addCriterion("bill_ret_url is not null");
            return (Criteria) this;
        }

        public Criteria andBillRetUrlEqualTo(String value) {
            addCriterion("bill_ret_url =", value, "billRetUrl");
            return (Criteria) this;
        }

        public Criteria andBillRetUrlNotEqualTo(String value) {
            addCriterion("bill_ret_url <>", value, "billRetUrl");
            return (Criteria) this;
        }

        public Criteria andBillRetUrlGreaterThan(String value) {
            addCriterion("bill_ret_url >", value, "billRetUrl");
            return (Criteria) this;
        }

        public Criteria andBillRetUrlGreaterThanOrEqualTo(String value) {
            addCriterion("bill_ret_url >=", value, "billRetUrl");
            return (Criteria) this;
        }

        public Criteria andBillRetUrlLessThan(String value) {
            addCriterion("bill_ret_url <", value, "billRetUrl");
            return (Criteria) this;
        }

        public Criteria andBillRetUrlLessThanOrEqualTo(String value) {
            addCriterion("bill_ret_url <=", value, "billRetUrl");
            return (Criteria) this;
        }

        public Criteria andBillRetUrlLike(String value) {
            addCriterion("bill_ret_url like", value, "billRetUrl");
            return (Criteria) this;
        }

        public Criteria andBillRetUrlNotLike(String value) {
            addCriterion("bill_ret_url not like", value, "billRetUrl");
            return (Criteria) this;
        }

        public Criteria andBillRetUrlIn(List<String> values) {
            addCriterion("bill_ret_url in", values, "billRetUrl");
            return (Criteria) this;
        }

        public Criteria andBillRetUrlNotIn(List<String> values) {
            addCriterion("bill_ret_url not in", values, "billRetUrl");
            return (Criteria) this;
        }

        public Criteria andBillRetUrlBetween(String value1, String value2) {
            addCriterion("bill_ret_url between", value1, value2, "billRetUrl");
            return (Criteria) this;
        }

        public Criteria andBillRetUrlNotBetween(String value1, String value2) {
            addCriterion("bill_ret_url not between", value1, value2, "billRetUrl");
            return (Criteria) this;
        }

        public Criteria andMchntValidStIsNull() {
            addCriterion("mchnt_valid_st is null");
            return (Criteria) this;
        }

        public Criteria andMchntValidStIsNotNull() {
            addCriterion("mchnt_valid_st is not null");
            return (Criteria) this;
        }

        public Criteria andMchntValidStEqualTo(String value) {
            addCriterion("mchnt_valid_st =", value, "mchntValidSt");
            return (Criteria) this;
        }

        public Criteria andMchntValidStNotEqualTo(String value) {
            addCriterion("mchnt_valid_st <>", value, "mchntValidSt");
            return (Criteria) this;
        }

        public Criteria andMchntValidStGreaterThan(String value) {
            addCriterion("mchnt_valid_st >", value, "mchntValidSt");
            return (Criteria) this;
        }

        public Criteria andMchntValidStGreaterThanOrEqualTo(String value) {
            addCriterion("mchnt_valid_st >=", value, "mchntValidSt");
            return (Criteria) this;
        }

        public Criteria andMchntValidStLessThan(String value) {
            addCriterion("mchnt_valid_st <", value, "mchntValidSt");
            return (Criteria) this;
        }

        public Criteria andMchntValidStLessThanOrEqualTo(String value) {
            addCriterion("mchnt_valid_st <=", value, "mchntValidSt");
            return (Criteria) this;
        }

        public Criteria andMchntValidStLike(String value) {
            addCriterion("mchnt_valid_st like", value, "mchntValidSt");
            return (Criteria) this;
        }

        public Criteria andMchntValidStNotLike(String value) {
            addCriterion("mchnt_valid_st not like", value, "mchntValidSt");
            return (Criteria) this;
        }

        public Criteria andMchntValidStIn(List<String> values) {
            addCriterion("mchnt_valid_st in", values, "mchntValidSt");
            return (Criteria) this;
        }

        public Criteria andMchntValidStNotIn(List<String> values) {
            addCriterion("mchnt_valid_st not in", values, "mchntValidSt");
            return (Criteria) this;
        }

        public Criteria andMchntValidStBetween(String value1, String value2) {
            addCriterion("mchnt_valid_st between", value1, value2, "mchntValidSt");
            return (Criteria) this;
        }

        public Criteria andMchntValidStNotBetween(String value1, String value2) {
            addCriterion("mchnt_valid_st not between", value1, value2, "mchntValidSt");
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