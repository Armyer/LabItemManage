package com.edu.szu.csse.bean;

import java.util.ArrayList;
import java.util.List;
/**
 * TeacherExample
 *
 * @author CS
 * @date 2020/6/6
 */
public class TeacherExample {
        protected String orderByClause;

        protected boolean distinct;

        protected List<Criteria> oredCriteria;

//        protected Page page;

        public TeacherExample() {
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

//        public void setPage(Page page) {
//            this.page=page;
//        }
//
//        public Page getPage() {
//            return page;
//        }

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

            public Criteria andTeacherIdIsNull() {
                addCriterion("teacher_id is null");
                return (Criteria) this;
            }

            public Criteria andTeacherIdIsNotNull() {
                addCriterion("teacher_id is not null");
                return (Criteria) this;
            }

            public Criteria andTeacherIdEqualTo(String value) {
                addCriterion("teacher_id =", value, "teacherId");
                return (Criteria) this;
            }

            public Criteria andTeacherIdNotEqualTo(String value) {
                addCriterion("teacher_id <>", value, "teacherId");
                return (Criteria) this;
            }

            public Criteria andTeacherIdGreaterThan(String value) {
                addCriterion("teacher_id >", value, "teacherId");
                return (Criteria) this;
            }

            public Criteria andTeacherIdGreaterThanOrEqualTo(String value) {
                addCriterion("teacher_id >=", value, "teacherId");
                return (Criteria) this;
            }

            public Criteria andTeacherIdLessThan(String value) {
                addCriterion("teacher_id <", value, "teacherId");
                return (Criteria) this;
            }

            public Criteria andTeacherIdLessThanOrEqualTo(String value) {
                addCriterion("teacher_id <=", value, "teacherId");
                return (Criteria) this;
            }

            public Criteria andTeacherIdLike(String value) {
                addCriterion("teacher_id like", value, "teacherId");
                return (Criteria) this;
            }

            public Criteria andTeacherIdNotLike(String value) {
                addCriterion("teacher_id not like", value, "teacherId");
                return (Criteria) this;
            }

            public Criteria andTeacherIdIn(List<String> values) {
                addCriterion("teacher_id in", values, "teacherId");
                return (Criteria) this;
            }

            public Criteria andTeacherIdNotIn(List<String> values) {
                addCriterion("teacher_id not in", values, "teacherId");
                return (Criteria) this;
            }

            public Criteria andTeacherIdBetween(String value1, String value2) {
                addCriterion("teacher_id between", value1, value2, "teacherId");
                return (Criteria) this;
            }

            public Criteria andTeacherIdNotBetween(String value1, String value2) {
                addCriterion("teacher_id not between", value1, value2, "teacherId");
                return (Criteria) this;
            }

            public Criteria andTeacherNameIsNull() {
                addCriterion("teacher_name is null");
                return (Criteria) this;
            }

            public Criteria andTeacherNameIsNotNull() {
                addCriterion("teacher_name is not null");
                return (Criteria) this;
            }

            public Criteria andTeacherNameEqualTo(String value) {
                addCriterion("teacher_name =", value, "teacherName");
                return (Criteria) this;
            }

            public Criteria andTeacherNameNotEqualTo(String value) {
                addCriterion("teacher_name <>", value, "teacherName");
                return (Criteria) this;
            }

            public Criteria andTeacherNameGreaterThan(String value) {
                addCriterion("teacher_name >", value, "teacherName");
                return (Criteria) this;
            }

            public Criteria andTeacherNameGreaterThanOrEqualTo(String value) {
                addCriterion("teacher_name >=", value, "teacherName");
                return (Criteria) this;
            }

            public Criteria andTeacherNameLessThan(String value) {
                addCriterion("teacher_name <", value, "teacherName");
                return (Criteria) this;
            }

            public Criteria andTeacherNameLessThanOrEqualTo(String value) {
                addCriterion("teacher_name <=", value, "teacherName");
                return (Criteria) this;
            }

            public Criteria andTeacherNameLike(String value) {
                addCriterion("teacher_name like", value, "teacherName");
                return (Criteria) this;
            }

            public Criteria andTeacherNameNotLike(String value) {
                addCriterion("teacher_name not like", value, "teacherName");
                return (Criteria) this;
            }

            public Criteria andTeacherNameIn(List<String> values) {
                addCriterion("teacher_name in", values, "teacherName");
                return (Criteria) this;
            }

            public Criteria andTeacherNameNotIn(List<String> values) {
                addCriterion("teacher_name not in", values, "teacherName");
                return (Criteria) this;
            }

            public Criteria andTeacherNameBetween(String value1, String value2) {
                addCriterion("teacher_name between", value1, value2, "teacherName");
                return (Criteria) this;
            }

            public Criteria andTeacherNameNotBetween(String value1, String value2) {
                addCriterion("teacher_name not between", value1, value2, "teacherName");
                return (Criteria) this;
            }

            public Criteria andMobileIsNull() {
                addCriterion("mobile is null");
                return (Criteria) this;
            }

            public Criteria andMobileIsNotNull() {
                addCriterion("mobile is not null");
                return (Criteria) this;
            }

            public Criteria andMobileEqualTo(String value) {
                addCriterion("mobile =", value, "mobile");
                return (Criteria) this;
            }

            public Criteria andMobileNotEqualTo(String value) {
                addCriterion("mobile <>", value, "mobile");
                return (Criteria) this;
            }

            public Criteria andMobileGreaterThan(String value) {
                addCriterion("mobile >", value, "mobile");
                return (Criteria) this;
            }

            public Criteria andMobileGreaterThanOrEqualTo(String value) {
                addCriterion("mobile >=", value, "mobile");
                return (Criteria) this;
            }

            public Criteria andMobileLessThan(String value) {
                addCriterion("mobile <", value, "mobile");
                return (Criteria) this;
            }

            public Criteria andMobileLessThanOrEqualTo(String value) {
                addCriterion("mobile <=", value, "mobile");
                return (Criteria) this;
            }

            public Criteria andMobileLike(String value) {
                addCriterion("mobile like", value, "mobile");
                return (Criteria) this;
            }

            public Criteria andMobileNotLike(String value) {
                addCriterion("mobile not like", value, "mobile");
                return (Criteria) this;
            }

            public Criteria andMobileIn(List<String> values) {
                addCriterion("mobile in", values, "mobile");
                return (Criteria) this;
            }

            public Criteria andMobileNotIn(List<String> values) {
                addCriterion("mobile not in", values, "mobile");
                return (Criteria) this;
            }

            public Criteria andMobileBetween(String value1, String value2) {
                addCriterion("mobile between", value1, value2, "mobile");
                return (Criteria) this;
            }

            public Criteria andMobileNotBetween(String value1, String value2) {
                addCriterion("mobile not between", value1, value2, "mobile");
                return (Criteria) this;
            }

            public Criteria andEmailIsNull() {
                addCriterion("email is null");
                return (Criteria) this;
            }

            public Criteria andEmailIsNotNull() {
                addCriterion("email is not null");
                return (Criteria) this;
            }

            public Criteria andEmailEqualTo(String value) {
                addCriterion("email =", value, "email");
                return (Criteria) this;
            }

            public Criteria andEmailNotEqualTo(String value) {
                addCriterion("email <>", value, "email");
                return (Criteria) this;
            }

            public Criteria andEmailGreaterThan(String value) {
                addCriterion("email >", value, "email");
                return (Criteria) this;
            }

            public Criteria andEmailGreaterThanOrEqualTo(String value) {
                addCriterion("email >=", value, "email");
                return (Criteria) this;
            }

            public Criteria andEmailLessThan(String value) {
                addCriterion("email <", value, "email");
                return (Criteria) this;
            }

            public Criteria andEmailLessThanOrEqualTo(String value) {
                addCriterion("email <=", value, "email");
                return (Criteria) this;
            }

            public Criteria andEmailLike(String value) {
                addCriterion("email like", value, "email");
                return (Criteria) this;
            }

            public Criteria andEmailNotLike(String value) {
                addCriterion("email not like", value, "email");
                return (Criteria) this;
            }

            public Criteria andEmailIn(List<String> values) {
                addCriterion("email in", values, "email");
                return (Criteria) this;
            }

            public Criteria andEmailNotIn(List<String> values) {
                addCriterion("email not in", values, "email");
                return (Criteria) this;
            }

            public Criteria andEmailBetween(String value1, String value2) {
                addCriterion("email between", value1, value2, "email");
                return (Criteria) this;
            }

            public Criteria andEmailNotBetween(String value1, String value2) {
                addCriterion("email not between", value1, value2, "email");
                return (Criteria) this;
            }

            public Criteria andCreateTimeIsNull() {
                addCriterion("create_time is null");
                return (Criteria) this;
            }

            public Criteria andCreateTimeIsNotNull() {
                addCriterion("create_time is not null");
                return (Criteria) this;
            }

            public Criteria andCreateTimeEqualTo(Long value) {
                addCriterion("create_time =", value, "createTime");
                return (Criteria) this;
            }

            public Criteria andCreateTimeNotEqualTo(Long value) {
                addCriterion("create_time <>", value, "createTime");
                return (Criteria) this;
            }

            public Criteria andCreateTimeGreaterThan(Long value) {
                addCriterion("create_time >", value, "createTime");
                return (Criteria) this;
            }

            public Criteria andCreateTimeGreaterThanOrEqualTo(Long value) {
                addCriterion("create_time >=", value, "createTime");
                return (Criteria) this;
            }

            public Criteria andCreateTimeLessThan(Long value) {
                addCriterion("create_time <", value, "createTime");
                return (Criteria) this;
            }

            public Criteria andCreateTimeLessThanOrEqualTo(Long value) {
                addCriterion("create_time <=", value, "createTime");
                return (Criteria) this;
            }

            public Criteria andCreateTimeIn(List<Long> values) {
                addCriterion("create_time in", values, "createTime");
                return (Criteria) this;
            }

            public Criteria andCreateTimeNotIn(List<Long> values) {
                addCriterion("create_time not in", values, "createTime");
                return (Criteria) this;
            }

            public Criteria andCreateTimeBetween(Long value1, Long value2) {
                addCriterion("create_time between", value1, value2, "createTime");
                return (Criteria) this;
            }

            public Criteria andCreateTimeNotBetween(Long value1, Long value2) {
                addCriterion("create_time not between", value1, value2, "createTime");
                return (Criteria) this;
            }

            public Criteria andStatusIsNull() {
                addCriterion("status is null");
                return (Criteria) this;
            }

            public Criteria andStatusIsNotNull() {
                addCriterion("status is not null");
                return (Criteria) this;
            }

            public Criteria andStatusEqualTo(String value) {
                addCriterion("status =", value, "status");
                return (Criteria) this;
            }

            public Criteria andStatusNotEqualTo(String value) {
                addCriterion("status <>", value, "status");
                return (Criteria) this;
            }

            public Criteria andStatusGreaterThan(String value) {
                addCriterion("status >", value, "status");
                return (Criteria) this;
            }

            public Criteria andStatusGreaterThanOrEqualTo(String value) {
                addCriterion("status >=", value, "status");
                return (Criteria) this;
            }

            public Criteria andStatusLessThan(String value) {
                addCriterion("status <", value, "status");
                return (Criteria) this;
            }

            public Criteria andStatusLessThanOrEqualTo(String value) {
                addCriterion("status <=", value, "status");
                return (Criteria) this;
            }

            public Criteria andStatusLike(String value) {
                addCriterion("status like", value, "status");
                return (Criteria) this;
            }

            public Criteria andStatusNotLike(String value) {
                addCriterion("status not like", value, "status");
                return (Criteria) this;
            }

            public Criteria andStatusIn(List<String> values) {
                addCriterion("status in", values, "status");
                return (Criteria) this;
            }

            public Criteria andStatusNotIn(List<String> values) {
                addCriterion("status not in", values, "status");
                return (Criteria) this;
            }

            public Criteria andStatusBetween(String value1, String value2) {
                addCriterion("status between", value1, value2, "status");
                return (Criteria) this;
            }

            public Criteria andStatusNotBetween(String value1, String value2) {
                addCriterion("status not between", value1, value2, "status");
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
