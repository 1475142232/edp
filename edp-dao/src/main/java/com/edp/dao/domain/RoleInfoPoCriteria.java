package com.edp.dao.domain;

import java.util.ArrayList;
import java.util.List;

public class RoleInfoPoCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoleInfoPoCriteria() {
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

        public Criteria andRoleNameIsNull() {
            addCriterion("role_name is null");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNotNull() {
            addCriterion("role_name is not null");
            return (Criteria) this;
        }

        public Criteria andRoleNameEqualTo(String value) {
            addCriterion("role_name =", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotEqualTo(String value) {
            addCriterion("role_name <>", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThan(String value) {
            addCriterion("role_name >", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThanOrEqualTo(String value) {
            addCriterion("role_name >=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThan(String value) {
            addCriterion("role_name <", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThanOrEqualTo(String value) {
            addCriterion("role_name <=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLike(String value) {
            addCriterion("role_name like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotLike(String value) {
            addCriterion("role_name not like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameIn(List<String> values) {
            addCriterion("role_name in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotIn(List<String> values) {
            addCriterion("role_name not in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameBetween(String value1, String value2) {
            addCriterion("role_name between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotBetween(String value1, String value2) {
            addCriterion("role_name not between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleSpecIsNull() {
            addCriterion("role_spec is null");
            return (Criteria) this;
        }

        public Criteria andRoleSpecIsNotNull() {
            addCriterion("role_spec is not null");
            return (Criteria) this;
        }

        public Criteria andRoleSpecEqualTo(String value) {
            addCriterion("role_spec =", value, "roleSpec");
            return (Criteria) this;
        }

        public Criteria andRoleSpecNotEqualTo(String value) {
            addCriterion("role_spec <>", value, "roleSpec");
            return (Criteria) this;
        }

        public Criteria andRoleSpecGreaterThan(String value) {
            addCriterion("role_spec >", value, "roleSpec");
            return (Criteria) this;
        }

        public Criteria andRoleSpecGreaterThanOrEqualTo(String value) {
            addCriterion("role_spec >=", value, "roleSpec");
            return (Criteria) this;
        }

        public Criteria andRoleSpecLessThan(String value) {
            addCriterion("role_spec <", value, "roleSpec");
            return (Criteria) this;
        }

        public Criteria andRoleSpecLessThanOrEqualTo(String value) {
            addCriterion("role_spec <=", value, "roleSpec");
            return (Criteria) this;
        }

        public Criteria andRoleSpecLike(String value) {
            addCriterion("role_spec like", value, "roleSpec");
            return (Criteria) this;
        }

        public Criteria andRoleSpecNotLike(String value) {
            addCriterion("role_spec not like", value, "roleSpec");
            return (Criteria) this;
        }

        public Criteria andRoleSpecIn(List<String> values) {
            addCriterion("role_spec in", values, "roleSpec");
            return (Criteria) this;
        }

        public Criteria andRoleSpecNotIn(List<String> values) {
            addCriterion("role_spec not in", values, "roleSpec");
            return (Criteria) this;
        }

        public Criteria andRoleSpecBetween(String value1, String value2) {
            addCriterion("role_spec between", value1, value2, "roleSpec");
            return (Criteria) this;
        }

        public Criteria andRoleSpecNotBetween(String value1, String value2) {
            addCriterion("role_spec not between", value1, value2, "roleSpec");
            return (Criteria) this;
        }

        public Criteria andRoleDeptIsNull() {
            addCriterion("role_dept is null");
            return (Criteria) this;
        }

        public Criteria andRoleDeptIsNotNull() {
            addCriterion("role_dept is not null");
            return (Criteria) this;
        }

        public Criteria andRoleDeptEqualTo(String value) {
            addCriterion("role_dept =", value, "roleDept");
            return (Criteria) this;
        }

        public Criteria andRoleDeptNotEqualTo(String value) {
            addCriterion("role_dept <>", value, "roleDept");
            return (Criteria) this;
        }

        public Criteria andRoleDeptGreaterThan(String value) {
            addCriterion("role_dept >", value, "roleDept");
            return (Criteria) this;
        }

        public Criteria andRoleDeptGreaterThanOrEqualTo(String value) {
            addCriterion("role_dept >=", value, "roleDept");
            return (Criteria) this;
        }

        public Criteria andRoleDeptLessThan(String value) {
            addCriterion("role_dept <", value, "roleDept");
            return (Criteria) this;
        }

        public Criteria andRoleDeptLessThanOrEqualTo(String value) {
            addCriterion("role_dept <=", value, "roleDept");
            return (Criteria) this;
        }

        public Criteria andRoleDeptLike(String value) {
            addCriterion("role_dept like", value, "roleDept");
            return (Criteria) this;
        }

        public Criteria andRoleDeptNotLike(String value) {
            addCriterion("role_dept not like", value, "roleDept");
            return (Criteria) this;
        }

        public Criteria andRoleDeptIn(List<String> values) {
            addCriterion("role_dept in", values, "roleDept");
            return (Criteria) this;
        }

        public Criteria andRoleDeptNotIn(List<String> values) {
            addCriterion("role_dept not in", values, "roleDept");
            return (Criteria) this;
        }

        public Criteria andRoleDeptBetween(String value1, String value2) {
            addCriterion("role_dept between", value1, value2, "roleDept");
            return (Criteria) this;
        }

        public Criteria andRoleDeptNotBetween(String value1, String value2) {
            addCriterion("role_dept not between", value1, value2, "roleDept");
            return (Criteria) this;
        }

        public Criteria andRoleTypeIsNull() {
            addCriterion("role_type is null");
            return (Criteria) this;
        }

        public Criteria andRoleTypeIsNotNull() {
            addCriterion("role_type is not null");
            return (Criteria) this;
        }

        public Criteria andRoleTypeEqualTo(String value) {
            addCriterion("role_type =", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeNotEqualTo(String value) {
            addCriterion("role_type <>", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeGreaterThan(String value) {
            addCriterion("role_type >", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("role_type >=", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeLessThan(String value) {
            addCriterion("role_type <", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeLessThanOrEqualTo(String value) {
            addCriterion("role_type <=", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeLike(String value) {
            addCriterion("role_type like", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeNotLike(String value) {
            addCriterion("role_type not like", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeIn(List<String> values) {
            addCriterion("role_type in", values, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeNotIn(List<String> values) {
            addCriterion("role_type not in", values, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeBetween(String value1, String value2) {
            addCriterion("role_type between", value1, value2, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeNotBetween(String value1, String value2) {
            addCriterion("role_type not between", value1, value2, "roleType");
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