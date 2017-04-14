package com.edp.dao.domain;

import java.util.ArrayList;
import java.util.List;

public class DeptInfoPoCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeptInfoPoCriteria() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNull() {
            addCriterion("dept_name is null");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNotNull() {
            addCriterion("dept_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeptNameEqualTo(String value) {
            addCriterion("dept_name =", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotEqualTo(String value) {
            addCriterion("dept_name <>", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThan(String value) {
            addCriterion("dept_name >", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThanOrEqualTo(String value) {
            addCriterion("dept_name >=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThan(String value) {
            addCriterion("dept_name <", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThanOrEqualTo(String value) {
            addCriterion("dept_name <=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLike(String value) {
            addCriterion("dept_name like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotLike(String value) {
            addCriterion("dept_name not like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameIn(List<String> values) {
            addCriterion("dept_name in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotIn(List<String> values) {
            addCriterion("dept_name not in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameBetween(String value1, String value2) {
            addCriterion("dept_name between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotBetween(String value1, String value2) {
            addCriterion("dept_name not between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptSpecIsNull() {
            addCriterion("dept_spec is null");
            return (Criteria) this;
        }

        public Criteria andDeptSpecIsNotNull() {
            addCriterion("dept_spec is not null");
            return (Criteria) this;
        }

        public Criteria andDeptSpecEqualTo(String value) {
            addCriterion("dept_spec =", value, "deptSpec");
            return (Criteria) this;
        }

        public Criteria andDeptSpecNotEqualTo(String value) {
            addCriterion("dept_spec <>", value, "deptSpec");
            return (Criteria) this;
        }

        public Criteria andDeptSpecGreaterThan(String value) {
            addCriterion("dept_spec >", value, "deptSpec");
            return (Criteria) this;
        }

        public Criteria andDeptSpecGreaterThanOrEqualTo(String value) {
            addCriterion("dept_spec >=", value, "deptSpec");
            return (Criteria) this;
        }

        public Criteria andDeptSpecLessThan(String value) {
            addCriterion("dept_spec <", value, "deptSpec");
            return (Criteria) this;
        }

        public Criteria andDeptSpecLessThanOrEqualTo(String value) {
            addCriterion("dept_spec <=", value, "deptSpec");
            return (Criteria) this;
        }

        public Criteria andDeptSpecLike(String value) {
            addCriterion("dept_spec like", value, "deptSpec");
            return (Criteria) this;
        }

        public Criteria andDeptSpecNotLike(String value) {
            addCriterion("dept_spec not like", value, "deptSpec");
            return (Criteria) this;
        }

        public Criteria andDeptSpecIn(List<String> values) {
            addCriterion("dept_spec in", values, "deptSpec");
            return (Criteria) this;
        }

        public Criteria andDeptSpecNotIn(List<String> values) {
            addCriterion("dept_spec not in", values, "deptSpec");
            return (Criteria) this;
        }

        public Criteria andDeptSpecBetween(String value1, String value2) {
            addCriterion("dept_spec between", value1, value2, "deptSpec");
            return (Criteria) this;
        }

        public Criteria andDeptSpecNotBetween(String value1, String value2) {
            addCriterion("dept_spec not between", value1, value2, "deptSpec");
            return (Criteria) this;
        }

        public Criteria andDeptCreatetimeIsNull() {
            addCriterion("dept_createtime is null");
            return (Criteria) this;
        }

        public Criteria andDeptCreatetimeIsNotNull() {
            addCriterion("dept_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andDeptCreatetimeEqualTo(String value) {
            addCriterion("dept_createtime =", value, "deptCreatetime");
            return (Criteria) this;
        }

        public Criteria andDeptCreatetimeNotEqualTo(String value) {
            addCriterion("dept_createtime <>", value, "deptCreatetime");
            return (Criteria) this;
        }

        public Criteria andDeptCreatetimeGreaterThan(String value) {
            addCriterion("dept_createtime >", value, "deptCreatetime");
            return (Criteria) this;
        }

        public Criteria andDeptCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("dept_createtime >=", value, "deptCreatetime");
            return (Criteria) this;
        }

        public Criteria andDeptCreatetimeLessThan(String value) {
            addCriterion("dept_createtime <", value, "deptCreatetime");
            return (Criteria) this;
        }

        public Criteria andDeptCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("dept_createtime <=", value, "deptCreatetime");
            return (Criteria) this;
        }

        public Criteria andDeptCreatetimeLike(String value) {
            addCriterion("dept_createtime like", value, "deptCreatetime");
            return (Criteria) this;
        }

        public Criteria andDeptCreatetimeNotLike(String value) {
            addCriterion("dept_createtime not like", value, "deptCreatetime");
            return (Criteria) this;
        }

        public Criteria andDeptCreatetimeIn(List<String> values) {
            addCriterion("dept_createtime in", values, "deptCreatetime");
            return (Criteria) this;
        }

        public Criteria andDeptCreatetimeNotIn(List<String> values) {
            addCriterion("dept_createtime not in", values, "deptCreatetime");
            return (Criteria) this;
        }

        public Criteria andDeptCreatetimeBetween(String value1, String value2) {
            addCriterion("dept_createtime between", value1, value2, "deptCreatetime");
            return (Criteria) this;
        }

        public Criteria andDeptCreatetimeNotBetween(String value1, String value2) {
            addCriterion("dept_createtime not between", value1, value2, "deptCreatetime");
            return (Criteria) this;
        }

        public Criteria andDeptCreateIsNull() {
            addCriterion("dept_create is null");
            return (Criteria) this;
        }

        public Criteria andDeptCreateIsNotNull() {
            addCriterion("dept_create is not null");
            return (Criteria) this;
        }

        public Criteria andDeptCreateEqualTo(String value) {
            addCriterion("dept_create =", value, "deptCreate");
            return (Criteria) this;
        }

        public Criteria andDeptCreateNotEqualTo(String value) {
            addCriterion("dept_create <>", value, "deptCreate");
            return (Criteria) this;
        }

        public Criteria andDeptCreateGreaterThan(String value) {
            addCriterion("dept_create >", value, "deptCreate");
            return (Criteria) this;
        }

        public Criteria andDeptCreateGreaterThanOrEqualTo(String value) {
            addCriterion("dept_create >=", value, "deptCreate");
            return (Criteria) this;
        }

        public Criteria andDeptCreateLessThan(String value) {
            addCriterion("dept_create <", value, "deptCreate");
            return (Criteria) this;
        }

        public Criteria andDeptCreateLessThanOrEqualTo(String value) {
            addCriterion("dept_create <=", value, "deptCreate");
            return (Criteria) this;
        }

        public Criteria andDeptCreateLike(String value) {
            addCriterion("dept_create like", value, "deptCreate");
            return (Criteria) this;
        }

        public Criteria andDeptCreateNotLike(String value) {
            addCriterion("dept_create not like", value, "deptCreate");
            return (Criteria) this;
        }

        public Criteria andDeptCreateIn(List<String> values) {
            addCriterion("dept_create in", values, "deptCreate");
            return (Criteria) this;
        }

        public Criteria andDeptCreateNotIn(List<String> values) {
            addCriterion("dept_create not in", values, "deptCreate");
            return (Criteria) this;
        }

        public Criteria andDeptCreateBetween(String value1, String value2) {
            addCriterion("dept_create between", value1, value2, "deptCreate");
            return (Criteria) this;
        }

        public Criteria andDeptCreateNotBetween(String value1, String value2) {
            addCriterion("dept_create not between", value1, value2, "deptCreate");
            return (Criteria) this;
        }

        public Criteria andDeptPhoneIsNull() {
            addCriterion("dept_phone is null");
            return (Criteria) this;
        }

        public Criteria andDeptPhoneIsNotNull() {
            addCriterion("dept_phone is not null");
            return (Criteria) this;
        }

        public Criteria andDeptPhoneEqualTo(String value) {
            addCriterion("dept_phone =", value, "deptPhone");
            return (Criteria) this;
        }

        public Criteria andDeptPhoneNotEqualTo(String value) {
            addCriterion("dept_phone <>", value, "deptPhone");
            return (Criteria) this;
        }

        public Criteria andDeptPhoneGreaterThan(String value) {
            addCriterion("dept_phone >", value, "deptPhone");
            return (Criteria) this;
        }

        public Criteria andDeptPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("dept_phone >=", value, "deptPhone");
            return (Criteria) this;
        }

        public Criteria andDeptPhoneLessThan(String value) {
            addCriterion("dept_phone <", value, "deptPhone");
            return (Criteria) this;
        }

        public Criteria andDeptPhoneLessThanOrEqualTo(String value) {
            addCriterion("dept_phone <=", value, "deptPhone");
            return (Criteria) this;
        }

        public Criteria andDeptPhoneLike(String value) {
            addCriterion("dept_phone like", value, "deptPhone");
            return (Criteria) this;
        }

        public Criteria andDeptPhoneNotLike(String value) {
            addCriterion("dept_phone not like", value, "deptPhone");
            return (Criteria) this;
        }

        public Criteria andDeptPhoneIn(List<String> values) {
            addCriterion("dept_phone in", values, "deptPhone");
            return (Criteria) this;
        }

        public Criteria andDeptPhoneNotIn(List<String> values) {
            addCriterion("dept_phone not in", values, "deptPhone");
            return (Criteria) this;
        }

        public Criteria andDeptPhoneBetween(String value1, String value2) {
            addCriterion("dept_phone between", value1, value2, "deptPhone");
            return (Criteria) this;
        }

        public Criteria andDeptPhoneNotBetween(String value1, String value2) {
            addCriterion("dept_phone not between", value1, value2, "deptPhone");
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