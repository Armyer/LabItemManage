package com.edu.szu.csse.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author tools.49db.cn
 * @version 1.0
 * @date 2020-06-13
 */
public class DeviceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public DeviceExample() {
        oredCriteria = new ArrayList<Criteria>();
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

    public void setPage(Page page) {
        this.page=page;
    }

    public Page getPage() {
        return page;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNull() {
            addCriterion("device_id is null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNotNull() {
            addCriterion("device_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdEqualTo(String value) {
            addCriterion("device_id =", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotEqualTo(String value) {
            addCriterion("device_id <>", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThan(String value) {
            addCriterion("device_id >", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThanOrEqualTo(String value) {
            addCriterion("device_id >=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThan(String value) {
            addCriterion("device_id <", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThanOrEqualTo(String value) {
            addCriterion("device_id <=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLike(String value) {
            addCriterion("device_id like", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotLike(String value) {
            addCriterion("device_id not like", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIn(List<String> values) {
            addCriterion("device_id in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotIn(List<String> values) {
            addCriterion("device_id not in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdBetween(String value1, String value2) {
            addCriterion("device_id between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotBetween(String value1, String value2) {
            addCriterion("device_id not between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIsNull() {
            addCriterion("device_name is null");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIsNotNull() {
            addCriterion("device_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceNameEqualTo(String value) {
            addCriterion("device_name =", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotEqualTo(String value) {
            addCriterion("device_name <>", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameGreaterThan(String value) {
            addCriterion("device_name >", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameGreaterThanOrEqualTo(String value) {
            addCriterion("device_name >=", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLessThan(String value) {
            addCriterion("device_name <", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLessThanOrEqualTo(String value) {
            addCriterion("device_name <=", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLike(String value) {
            addCriterion("device_name like", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotLike(String value) {
            addCriterion("device_name not like", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIn(List<String> values) {
            addCriterion("device_name in", values, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotIn(List<String> values) {
            addCriterion("device_name not in", values, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameBetween(String value1, String value2) {
            addCriterion("device_name between", value1, value2, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotBetween(String value1, String value2) {
            addCriterion("device_name not between", value1, value2, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceValueIsNull() {
            addCriterion("device_value is null");
            return (Criteria) this;
        }

        public Criteria andDeviceValueIsNotNull() {
            addCriterion("device_value is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceValueEqualTo(String value) {
            addCriterion("device_value =", value, "deviceValue");
            return (Criteria) this;
        }

        public Criteria andDeviceValueNotEqualTo(String value) {
            addCriterion("device_value <>", value, "deviceValue");
            return (Criteria) this;
        }

        public Criteria andDeviceValueGreaterThan(String value) {
            addCriterion("device_value >", value, "deviceValue");
            return (Criteria) this;
        }

        public Criteria andDeviceValueGreaterThanOrEqualTo(String value) {
            addCriterion("device_value >=", value, "deviceValue");
            return (Criteria) this;
        }

        public Criteria andDeviceValueLessThan(String value) {
            addCriterion("device_value <", value, "deviceValue");
            return (Criteria) this;
        }

        public Criteria andDeviceValueLessThanOrEqualTo(String value) {
            addCriterion("device_value <=", value, "deviceValue");
            return (Criteria) this;
        }

        public Criteria andDeviceValueLike(String value) {
            addCriterion("device_value like", value, "deviceValue");
            return (Criteria) this;
        }

        public Criteria andDeviceValueNotLike(String value) {
            addCriterion("device_value not like", value, "deviceValue");
            return (Criteria) this;
        }

        public Criteria andDeviceValueIn(List<String> values) {
            addCriterion("device_value in", values, "deviceValue");
            return (Criteria) this;
        }

        public Criteria andDeviceValueNotIn(List<String> values) {
            addCriterion("device_value not in", values, "deviceValue");
            return (Criteria) this;
        }

        public Criteria andDeviceValueBetween(String value1, String value2) {
            addCriterion("device_value between", value1, value2, "deviceValue");
            return (Criteria) this;
        }

        public Criteria andDeviceValueNotBetween(String value1, String value2) {
            addCriterion("device_value not between", value1, value2, "deviceValue");
            return (Criteria) this;
        }

        public Criteria andDeviceTimeIsNull() {
            addCriterion("device_time is null");
            return (Criteria) this;
        }

        public Criteria andDeviceTimeIsNotNull() {
            addCriterion("device_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceTimeEqualTo(Date value) {
            addCriterion("device_time =", value, "deviceTime");
            return (Criteria) this;
        }

        public Criteria andDeviceTimeNotEqualTo(Date value) {
            addCriterion("device_time <>", value, "deviceTime");
            return (Criteria) this;
        }

        public Criteria andDeviceTimeGreaterThan(Date value) {
            addCriterion("device_time >", value, "deviceTime");
            return (Criteria) this;
        }

        public Criteria andDeviceTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("device_time >=", value, "deviceTime");
            return (Criteria) this;
        }

        public Criteria andDeviceTimeLessThan(Date value) {
            addCriterion("device_time <", value, "deviceTime");
            return (Criteria) this;
        }

        public Criteria andDeviceTimeLessThanOrEqualTo(Date value) {
            addCriterion("device_time <=", value, "deviceTime");
            return (Criteria) this;
        }

        public Criteria andDeviceTimeIn(List<Date> values) {
            addCriterion("device_time in", values, "deviceTime");
            return (Criteria) this;
        }

        public Criteria andDeviceTimeNotIn(List<Date> values) {
            addCriterion("device_time not in", values, "deviceTime");
            return (Criteria) this;
        }

        public Criteria andDeviceTimeBetween(Date value1, Date value2) {
            addCriterion("device_time between", value1, value2, "deviceTime");
            return (Criteria) this;
        }

        public Criteria andDeviceTimeNotBetween(Date value1, Date value2) {
            addCriterion("device_time not between", value1, value2, "deviceTime");
            return (Criteria) this;
        }

        public Criteria andDeviceRemarkIsNull() {
            addCriterion("device_remark is null");
            return (Criteria) this;
        }

        public Criteria andDeviceRemarkIsNotNull() {
            addCriterion("device_remark is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceRemarkEqualTo(String value) {
            addCriterion("device_remark =", value, "deviceRemark");
            return (Criteria) this;
        }

        public Criteria andDeviceRemarkNotEqualTo(String value) {
            addCriterion("device_remark <>", value, "deviceRemark");
            return (Criteria) this;
        }

        public Criteria andDeviceRemarkGreaterThan(String value) {
            addCriterion("device_remark >", value, "deviceRemark");
            return (Criteria) this;
        }

        public Criteria andDeviceRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("device_remark >=", value, "deviceRemark");
            return (Criteria) this;
        }

        public Criteria andDeviceRemarkLessThan(String value) {
            addCriterion("device_remark <", value, "deviceRemark");
            return (Criteria) this;
        }

        public Criteria andDeviceRemarkLessThanOrEqualTo(String value) {
            addCriterion("device_remark <=", value, "deviceRemark");
            return (Criteria) this;
        }

        public Criteria andDeviceRemarkLike(String value) {
            addCriterion("device_remark like", value, "deviceRemark");
            return (Criteria) this;
        }

        public Criteria andDeviceRemarkNotLike(String value) {
            addCriterion("device_remark not like", value, "deviceRemark");
            return (Criteria) this;
        }

        public Criteria andDeviceRemarkIn(List<String> values) {
            addCriterion("device_remark in", values, "deviceRemark");
            return (Criteria) this;
        }

        public Criteria andDeviceRemarkNotIn(List<String> values) {
            addCriterion("device_remark not in", values, "deviceRemark");
            return (Criteria) this;
        }

        public Criteria andDeviceRemarkBetween(String value1, String value2) {
            addCriterion("device_remark between", value1, value2, "deviceRemark");
            return (Criteria) this;
        }

        public Criteria andDeviceRemarkNotBetween(String value1, String value2) {
            addCriterion("device_remark not between", value1, value2, "deviceRemark");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}