package com.fosun.data.dataTask.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataThirdReqInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DataThirdReqInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected DataThirdReqInfoExample(DataThirdReqInfoExample example) {
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

        public Criteria andTaskTypeIsNull() {
            addCriterion("task_type is null");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIsNotNull() {
            addCriterion("task_type is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTypeEqualTo(String value) {
            addCriterion("task_type =", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotEqualTo(String value) {
            addCriterion("task_type <>", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeGreaterThan(String value) {
            addCriterion("task_type >", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeGreaterThanOrEqualTo(String value) {
            addCriterion("task_type >=", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLessThan(String value) {
            addCriterion("task_type <", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLessThanOrEqualTo(String value) {
            addCriterion("task_type <=", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLike(String value) {
            addCriterion("task_type like", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotLike(String value) {
            addCriterion("task_type not like", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIn(List<String> values) {
            addCriterion("task_type in", values, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotIn(List<String> values) {
            addCriterion("task_type not in", values, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeBetween(String value1, String value2) {
            addCriterion("task_type between", value1, value2, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotBetween(String value1, String value2) {
            addCriterion("task_type not between", value1, value2, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNull() {
            addCriterion("task_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("task_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(String value) {
            addCriterion("task_id =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(String value) {
            addCriterion("task_id <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(String value) {
            addCriterion("task_id >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(String value) {
            addCriterion("task_id >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(String value) {
            addCriterion("task_id <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(String value) {
            addCriterion("task_id <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLike(String value) {
            addCriterion("task_id like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotLike(String value) {
            addCriterion("task_id not like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<String> values) {
            addCriterion("task_id in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<String> values) {
            addCriterion("task_id not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(String value1, String value2) {
            addCriterion("task_id between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(String value1, String value2) {
            addCriterion("task_id not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andReqNoIsNull() {
            addCriterion("req_no is null");
            return (Criteria) this;
        }

        public Criteria andReqNoIsNotNull() {
            addCriterion("req_no is not null");
            return (Criteria) this;
        }

        public Criteria andReqNoEqualTo(String value) {
            addCriterion("req_no =", value, "reqNo");
            return (Criteria) this;
        }

        public Criteria andReqNoNotEqualTo(String value) {
            addCriterion("req_no <>", value, "reqNo");
            return (Criteria) this;
        }

        public Criteria andReqNoGreaterThan(String value) {
            addCriterion("req_no >", value, "reqNo");
            return (Criteria) this;
        }

        public Criteria andReqNoGreaterThanOrEqualTo(String value) {
            addCriterion("req_no >=", value, "reqNo");
            return (Criteria) this;
        }

        public Criteria andReqNoLessThan(String value) {
            addCriterion("req_no <", value, "reqNo");
            return (Criteria) this;
        }

        public Criteria andReqNoLessThanOrEqualTo(String value) {
            addCriterion("req_no <=", value, "reqNo");
            return (Criteria) this;
        }

        public Criteria andReqNoLike(String value) {
            addCriterion("req_no like", value, "reqNo");
            return (Criteria) this;
        }

        public Criteria andReqNoNotLike(String value) {
            addCriterion("req_no not like", value, "reqNo");
            return (Criteria) this;
        }

        public Criteria andReqNoIn(List<String> values) {
            addCriterion("req_no in", values, "reqNo");
            return (Criteria) this;
        }

        public Criteria andReqNoNotIn(List<String> values) {
            addCriterion("req_no not in", values, "reqNo");
            return (Criteria) this;
        }

        public Criteria andReqNoBetween(String value1, String value2) {
            addCriterion("req_no between", value1, value2, "reqNo");
            return (Criteria) this;
        }

        public Criteria andReqNoNotBetween(String value1, String value2) {
            addCriterion("req_no not between", value1, value2, "reqNo");
            return (Criteria) this;
        }

        public Criteria andReqSysNameIsNull() {
            addCriterion("req_sys_name is null");
            return (Criteria) this;
        }

        public Criteria andReqSysNameIsNotNull() {
            addCriterion("req_sys_name is not null");
            return (Criteria) this;
        }

        public Criteria andReqSysNameEqualTo(String value) {
            addCriterion("req_sys_name =", value, "reqSysName");
            return (Criteria) this;
        }

        public Criteria andReqSysNameNotEqualTo(String value) {
            addCriterion("req_sys_name <>", value, "reqSysName");
            return (Criteria) this;
        }

        public Criteria andReqSysNameGreaterThan(String value) {
            addCriterion("req_sys_name >", value, "reqSysName");
            return (Criteria) this;
        }

        public Criteria andReqSysNameGreaterThanOrEqualTo(String value) {
            addCriterion("req_sys_name >=", value, "reqSysName");
            return (Criteria) this;
        }

        public Criteria andReqSysNameLessThan(String value) {
            addCriterion("req_sys_name <", value, "reqSysName");
            return (Criteria) this;
        }

        public Criteria andReqSysNameLessThanOrEqualTo(String value) {
            addCriterion("req_sys_name <=", value, "reqSysName");
            return (Criteria) this;
        }

        public Criteria andReqSysNameLike(String value) {
            addCriterion("req_sys_name like", value, "reqSysName");
            return (Criteria) this;
        }

        public Criteria andReqSysNameNotLike(String value) {
            addCriterion("req_sys_name not like", value, "reqSysName");
            return (Criteria) this;
        }

        public Criteria andReqSysNameIn(List<String> values) {
            addCriterion("req_sys_name in", values, "reqSysName");
            return (Criteria) this;
        }

        public Criteria andReqSysNameNotIn(List<String> values) {
            addCriterion("req_sys_name not in", values, "reqSysName");
            return (Criteria) this;
        }

        public Criteria andReqSysNameBetween(String value1, String value2) {
            addCriterion("req_sys_name between", value1, value2, "reqSysName");
            return (Criteria) this;
        }

        public Criteria andReqSysNameNotBetween(String value1, String value2) {
            addCriterion("req_sys_name not between", value1, value2, "reqSysName");
            return (Criteria) this;
        }

        public Criteria andReqDtIsNull() {
            addCriterion("req_dt is null");
            return (Criteria) this;
        }

        public Criteria andReqDtIsNotNull() {
            addCriterion("req_dt is not null");
            return (Criteria) this;
        }

        public Criteria andReqDtEqualTo(Date value) {
            addCriterion("req_dt =", value, "reqDt");
            return (Criteria) this;
        }

        public Criteria andReqDtNotEqualTo(Date value) {
            addCriterion("req_dt <>", value, "reqDt");
            return (Criteria) this;
        }

        public Criteria andReqDtGreaterThan(Date value) {
            addCriterion("req_dt >", value, "reqDt");
            return (Criteria) this;
        }

        public Criteria andReqDtGreaterThanOrEqualTo(Date value) {
            addCriterion("req_dt >=", value, "reqDt");
            return (Criteria) this;
        }

        public Criteria andReqDtLessThan(Date value) {
            addCriterion("req_dt <", value, "reqDt");
            return (Criteria) this;
        }

        public Criteria andReqDtLessThanOrEqualTo(Date value) {
            addCriterion("req_dt <=", value, "reqDt");
            return (Criteria) this;
        }

        public Criteria andReqDtIn(List<Date> values) {
            addCriterion("req_dt in", values, "reqDt");
            return (Criteria) this;
        }

        public Criteria andReqDtNotIn(List<Date> values) {
            addCriterion("req_dt not in", values, "reqDt");
            return (Criteria) this;
        }

        public Criteria andReqDtBetween(Date value1, Date value2) {
            addCriterion("req_dt between", value1, value2, "reqDt");
            return (Criteria) this;
        }

        public Criteria andReqDtNotBetween(Date value1, Date value2) {
            addCriterion("req_dt not between", value1, value2, "reqDt");
            return (Criteria) this;
        }

        public Criteria andReqParamNameIsNull() {
            addCriterion("req_param_name is null");
            return (Criteria) this;
        }

        public Criteria andReqParamNameIsNotNull() {
            addCriterion("req_param_name is not null");
            return (Criteria) this;
        }

        public Criteria andReqParamNameEqualTo(String value) {
            addCriterion("req_param_name =", value, "reqParamName");
            return (Criteria) this;
        }

        public Criteria andReqParamNameNotEqualTo(String value) {
            addCriterion("req_param_name <>", value, "reqParamName");
            return (Criteria) this;
        }

        public Criteria andReqParamNameGreaterThan(String value) {
            addCriterion("req_param_name >", value, "reqParamName");
            return (Criteria) this;
        }

        public Criteria andReqParamNameGreaterThanOrEqualTo(String value) {
            addCriterion("req_param_name >=", value, "reqParamName");
            return (Criteria) this;
        }

        public Criteria andReqParamNameLessThan(String value) {
            addCriterion("req_param_name <", value, "reqParamName");
            return (Criteria) this;
        }

        public Criteria andReqParamNameLessThanOrEqualTo(String value) {
            addCriterion("req_param_name <=", value, "reqParamName");
            return (Criteria) this;
        }

        public Criteria andReqParamNameLike(String value) {
            addCriterion("req_param_name like", value, "reqParamName");
            return (Criteria) this;
        }

        public Criteria andReqParamNameNotLike(String value) {
            addCriterion("req_param_name not like", value, "reqParamName");
            return (Criteria) this;
        }

        public Criteria andReqParamNameIn(List<String> values) {
            addCriterion("req_param_name in", values, "reqParamName");
            return (Criteria) this;
        }

        public Criteria andReqParamNameNotIn(List<String> values) {
            addCriterion("req_param_name not in", values, "reqParamName");
            return (Criteria) this;
        }

        public Criteria andReqParamNameBetween(String value1, String value2) {
            addCriterion("req_param_name between", value1, value2, "reqParamName");
            return (Criteria) this;
        }

        public Criteria andReqParamNameNotBetween(String value1, String value2) {
            addCriterion("req_param_name not between", value1, value2, "reqParamName");
            return (Criteria) this;
        }

        public Criteria andReqParamIdentityIsNull() {
            addCriterion("req_param_identity is null");
            return (Criteria) this;
        }

        public Criteria andReqParamIdentityIsNotNull() {
            addCriterion("req_param_identity is not null");
            return (Criteria) this;
        }

        public Criteria andReqParamIdentityEqualTo(String value) {
            addCriterion("req_param_identity =", value, "reqParamIdentity");
            return (Criteria) this;
        }

        public Criteria andReqParamIdentityNotEqualTo(String value) {
            addCriterion("req_param_identity <>", value, "reqParamIdentity");
            return (Criteria) this;
        }

        public Criteria andReqParamIdentityGreaterThan(String value) {
            addCriterion("req_param_identity >", value, "reqParamIdentity");
            return (Criteria) this;
        }

        public Criteria andReqParamIdentityGreaterThanOrEqualTo(String value) {
            addCriterion("req_param_identity >=", value, "reqParamIdentity");
            return (Criteria) this;
        }

        public Criteria andReqParamIdentityLessThan(String value) {
            addCriterion("req_param_identity <", value, "reqParamIdentity");
            return (Criteria) this;
        }

        public Criteria andReqParamIdentityLessThanOrEqualTo(String value) {
            addCriterion("req_param_identity <=", value, "reqParamIdentity");
            return (Criteria) this;
        }

        public Criteria andReqParamIdentityLike(String value) {
            addCriterion("req_param_identity like", value, "reqParamIdentity");
            return (Criteria) this;
        }

        public Criteria andReqParamIdentityNotLike(String value) {
            addCriterion("req_param_identity not like", value, "reqParamIdentity");
            return (Criteria) this;
        }

        public Criteria andReqParamIdentityIn(List<String> values) {
            addCriterion("req_param_identity in", values, "reqParamIdentity");
            return (Criteria) this;
        }

        public Criteria andReqParamIdentityNotIn(List<String> values) {
            addCriterion("req_param_identity not in", values, "reqParamIdentity");
            return (Criteria) this;
        }

        public Criteria andReqParamIdentityBetween(String value1, String value2) {
            addCriterion("req_param_identity between", value1, value2, "reqParamIdentity");
            return (Criteria) this;
        }

        public Criteria andReqParamIdentityNotBetween(String value1, String value2) {
            addCriterion("req_param_identity not between", value1, value2, "reqParamIdentity");
            return (Criteria) this;
        }

        public Criteria andReqParamMobileIsNull() {
            addCriterion("req_param_mobile is null");
            return (Criteria) this;
        }

        public Criteria andReqParamMobileIsNotNull() {
            addCriterion("req_param_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andReqParamMobileEqualTo(String value) {
            addCriterion("req_param_mobile =", value, "reqParamMobile");
            return (Criteria) this;
        }

        public Criteria andReqParamMobileNotEqualTo(String value) {
            addCriterion("req_param_mobile <>", value, "reqParamMobile");
            return (Criteria) this;
        }

        public Criteria andReqParamMobileGreaterThan(String value) {
            addCriterion("req_param_mobile >", value, "reqParamMobile");
            return (Criteria) this;
        }

        public Criteria andReqParamMobileGreaterThanOrEqualTo(String value) {
            addCriterion("req_param_mobile >=", value, "reqParamMobile");
            return (Criteria) this;
        }

        public Criteria andReqParamMobileLessThan(String value) {
            addCriterion("req_param_mobile <", value, "reqParamMobile");
            return (Criteria) this;
        }

        public Criteria andReqParamMobileLessThanOrEqualTo(String value) {
            addCriterion("req_param_mobile <=", value, "reqParamMobile");
            return (Criteria) this;
        }

        public Criteria andReqParamMobileLike(String value) {
            addCriterion("req_param_mobile like", value, "reqParamMobile");
            return (Criteria) this;
        }

        public Criteria andReqParamMobileNotLike(String value) {
            addCriterion("req_param_mobile not like", value, "reqParamMobile");
            return (Criteria) this;
        }

        public Criteria andReqParamMobileIn(List<String> values) {
            addCriterion("req_param_mobile in", values, "reqParamMobile");
            return (Criteria) this;
        }

        public Criteria andReqParamMobileNotIn(List<String> values) {
            addCriterion("req_param_mobile not in", values, "reqParamMobile");
            return (Criteria) this;
        }

        public Criteria andReqParamMobileBetween(String value1, String value2) {
            addCriterion("req_param_mobile between", value1, value2, "reqParamMobile");
            return (Criteria) this;
        }

        public Criteria andReqParamMobileNotBetween(String value1, String value2) {
            addCriterion("req_param_mobile not between", value1, value2, "reqParamMobile");
            return (Criteria) this;
        }

        public Criteria andReqParamInterfaceNameIsNull() {
            addCriterion("req_param_interface_name is null");
            return (Criteria) this;
        }

        public Criteria andReqParamInterfaceNameIsNotNull() {
            addCriterion("req_param_interface_name is not null");
            return (Criteria) this;
        }

        public Criteria andReqParamInterfaceNameEqualTo(String value) {
            addCriterion("req_param_interface_name =", value, "reqParamInterfaceName");
            return (Criteria) this;
        }

        public Criteria andReqParamInterfaceNameNotEqualTo(String value) {
            addCriterion("req_param_interface_name <>", value, "reqParamInterfaceName");
            return (Criteria) this;
        }

        public Criteria andReqParamInterfaceNameGreaterThan(String value) {
            addCriterion("req_param_interface_name >", value, "reqParamInterfaceName");
            return (Criteria) this;
        }

        public Criteria andReqParamInterfaceNameGreaterThanOrEqualTo(String value) {
            addCriterion("req_param_interface_name >=", value, "reqParamInterfaceName");
            return (Criteria) this;
        }

        public Criteria andReqParamInterfaceNameLessThan(String value) {
            addCriterion("req_param_interface_name <", value, "reqParamInterfaceName");
            return (Criteria) this;
        }

        public Criteria andReqParamInterfaceNameLessThanOrEqualTo(String value) {
            addCriterion("req_param_interface_name <=", value, "reqParamInterfaceName");
            return (Criteria) this;
        }

        public Criteria andReqParamInterfaceNameLike(String value) {
            addCriterion("req_param_interface_name like", value, "reqParamInterfaceName");
            return (Criteria) this;
        }

        public Criteria andReqParamInterfaceNameNotLike(String value) {
            addCriterion("req_param_interface_name not like", value, "reqParamInterfaceName");
            return (Criteria) this;
        }

        public Criteria andReqParamInterfaceNameIn(List<String> values) {
            addCriterion("req_param_interface_name in", values, "reqParamInterfaceName");
            return (Criteria) this;
        }

        public Criteria andReqParamInterfaceNameNotIn(List<String> values) {
            addCriterion("req_param_interface_name not in", values, "reqParamInterfaceName");
            return (Criteria) this;
        }

        public Criteria andReqParamInterfaceNameBetween(String value1, String value2) {
            addCriterion("req_param_interface_name between", value1, value2, "reqParamInterfaceName");
            return (Criteria) this;
        }

        public Criteria andReqParamInterfaceNameNotBetween(String value1, String value2) {
            addCriterion("req_param_interface_name not between", value1, value2, "reqParamInterfaceName");
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