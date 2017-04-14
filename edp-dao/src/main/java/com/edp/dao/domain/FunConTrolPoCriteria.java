package com.edp.dao.domain;

import java.util.ArrayList;
import java.util.List;

public class FunConTrolPoCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FunConTrolPoCriteria() {
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

        public Criteria andFuncIdIsNull() {
            addCriterion("func_id is null");
            return (Criteria) this;
        }

        public Criteria andFuncIdIsNotNull() {
            addCriterion("func_id is not null");
            return (Criteria) this;
        }

        public Criteria andFuncIdEqualTo(String value) {
            addCriterion("func_id =", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdNotEqualTo(String value) {
            addCriterion("func_id <>", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdGreaterThan(String value) {
            addCriterion("func_id >", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdGreaterThanOrEqualTo(String value) {
            addCriterion("func_id >=", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdLessThan(String value) {
            addCriterion("func_id <", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdLessThanOrEqualTo(String value) {
            addCriterion("func_id <=", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdLike(String value) {
            addCriterion("func_id like", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdNotLike(String value) {
            addCriterion("func_id not like", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdIn(List<String> values) {
            addCriterion("func_id in", values, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdNotIn(List<String> values) {
            addCriterion("func_id not in", values, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdBetween(String value1, String value2) {
            addCriterion("func_id between", value1, value2, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdNotBetween(String value1, String value2) {
            addCriterion("func_id not between", value1, value2, "funcId");
            return (Criteria) this;
        }

        public Criteria andControlIdIsNull() {
            addCriterion("control_id is null");
            return (Criteria) this;
        }

        public Criteria andControlIdIsNotNull() {
            addCriterion("control_id is not null");
            return (Criteria) this;
        }

        public Criteria andControlIdEqualTo(String value) {
            addCriterion("control_id =", value, "controlId");
            return (Criteria) this;
        }

        public Criteria andControlIdNotEqualTo(String value) {
            addCriterion("control_id <>", value, "controlId");
            return (Criteria) this;
        }

        public Criteria andControlIdGreaterThan(String value) {
            addCriterion("control_id >", value, "controlId");
            return (Criteria) this;
        }

        public Criteria andControlIdGreaterThanOrEqualTo(String value) {
            addCriterion("control_id >=", value, "controlId");
            return (Criteria) this;
        }

        public Criteria andControlIdLessThan(String value) {
            addCriterion("control_id <", value, "controlId");
            return (Criteria) this;
        }

        public Criteria andControlIdLessThanOrEqualTo(String value) {
            addCriterion("control_id <=", value, "controlId");
            return (Criteria) this;
        }

        public Criteria andControlIdLike(String value) {
            addCriterion("control_id like", value, "controlId");
            return (Criteria) this;
        }

        public Criteria andControlIdNotLike(String value) {
            addCriterion("control_id not like", value, "controlId");
            return (Criteria) this;
        }

        public Criteria andControlIdIn(List<String> values) {
            addCriterion("control_id in", values, "controlId");
            return (Criteria) this;
        }

        public Criteria andControlIdNotIn(List<String> values) {
            addCriterion("control_id not in", values, "controlId");
            return (Criteria) this;
        }

        public Criteria andControlIdBetween(String value1, String value2) {
            addCriterion("control_id between", value1, value2, "controlId");
            return (Criteria) this;
        }

        public Criteria andControlIdNotBetween(String value1, String value2) {
            addCriterion("control_id not between", value1, value2, "controlId");
            return (Criteria) this;
        }

        public Criteria andFcStateIsNull() {
            addCriterion("fc_state is null");
            return (Criteria) this;
        }

        public Criteria andFcStateIsNotNull() {
            addCriterion("fc_state is not null");
            return (Criteria) this;
        }

        public Criteria andFcStateEqualTo(String value) {
            addCriterion("fc_state =", value, "fcState");
            return (Criteria) this;
        }

        public Criteria andFcStateNotEqualTo(String value) {
            addCriterion("fc_state <>", value, "fcState");
            return (Criteria) this;
        }

        public Criteria andFcStateGreaterThan(String value) {
            addCriterion("fc_state >", value, "fcState");
            return (Criteria) this;
        }

        public Criteria andFcStateGreaterThanOrEqualTo(String value) {
            addCriterion("fc_state >=", value, "fcState");
            return (Criteria) this;
        }

        public Criteria andFcStateLessThan(String value) {
            addCriterion("fc_state <", value, "fcState");
            return (Criteria) this;
        }

        public Criteria andFcStateLessThanOrEqualTo(String value) {
            addCriterion("fc_state <=", value, "fcState");
            return (Criteria) this;
        }

        public Criteria andFcStateLike(String value) {
            addCriterion("fc_state like", value, "fcState");
            return (Criteria) this;
        }

        public Criteria andFcStateNotLike(String value) {
            addCriterion("fc_state not like", value, "fcState");
            return (Criteria) this;
        }

        public Criteria andFcStateIn(List<String> values) {
            addCriterion("fc_state in", values, "fcState");
            return (Criteria) this;
        }

        public Criteria andFcStateNotIn(List<String> values) {
            addCriterion("fc_state not in", values, "fcState");
            return (Criteria) this;
        }

        public Criteria andFcStateBetween(String value1, String value2) {
            addCriterion("fc_state between", value1, value2, "fcState");
            return (Criteria) this;
        }

        public Criteria andFcStateNotBetween(String value1, String value2) {
            addCriterion("fc_state not between", value1, value2, "fcState");
            return (Criteria) this;
        }

        public Criteria andFcVersionIsNull() {
            addCriterion("fc_version is null");
            return (Criteria) this;
        }

        public Criteria andFcVersionIsNotNull() {
            addCriterion("fc_version is not null");
            return (Criteria) this;
        }

        public Criteria andFcVersionEqualTo(Byte value) {
            addCriterion("fc_version =", value, "fcVersion");
            return (Criteria) this;
        }

        public Criteria andFcVersionNotEqualTo(Byte value) {
            addCriterion("fc_version <>", value, "fcVersion");
            return (Criteria) this;
        }

        public Criteria andFcVersionGreaterThan(Byte value) {
            addCriterion("fc_version >", value, "fcVersion");
            return (Criteria) this;
        }

        public Criteria andFcVersionGreaterThanOrEqualTo(Byte value) {
            addCriterion("fc_version >=", value, "fcVersion");
            return (Criteria) this;
        }

        public Criteria andFcVersionLessThan(Byte value) {
            addCriterion("fc_version <", value, "fcVersion");
            return (Criteria) this;
        }

        public Criteria andFcVersionLessThanOrEqualTo(Byte value) {
            addCriterion("fc_version <=", value, "fcVersion");
            return (Criteria) this;
        }

        public Criteria andFcVersionIn(List<Byte> values) {
            addCriterion("fc_version in", values, "fcVersion");
            return (Criteria) this;
        }

        public Criteria andFcVersionNotIn(List<Byte> values) {
            addCriterion("fc_version not in", values, "fcVersion");
            return (Criteria) this;
        }

        public Criteria andFcVersionBetween(Byte value1, Byte value2) {
            addCriterion("fc_version between", value1, value2, "fcVersion");
            return (Criteria) this;
        }

        public Criteria andFcVersionNotBetween(Byte value1, Byte value2) {
            addCriterion("fc_version not between", value1, value2, "fcVersion");
            return (Criteria) this;
        }

        public Criteria andFcNameIsNull() {
            addCriterion("fc_name is null");
            return (Criteria) this;
        }

        public Criteria andFcNameIsNotNull() {
            addCriterion("fc_name is not null");
            return (Criteria) this;
        }

        public Criteria andFcNameEqualTo(String value) {
            addCriterion("fc_name =", value, "fcName");
            return (Criteria) this;
        }

        public Criteria andFcNameNotEqualTo(String value) {
            addCriterion("fc_name <>", value, "fcName");
            return (Criteria) this;
        }

        public Criteria andFcNameGreaterThan(String value) {
            addCriterion("fc_name >", value, "fcName");
            return (Criteria) this;
        }

        public Criteria andFcNameGreaterThanOrEqualTo(String value) {
            addCriterion("fc_name >=", value, "fcName");
            return (Criteria) this;
        }

        public Criteria andFcNameLessThan(String value) {
            addCriterion("fc_name <", value, "fcName");
            return (Criteria) this;
        }

        public Criteria andFcNameLessThanOrEqualTo(String value) {
            addCriterion("fc_name <=", value, "fcName");
            return (Criteria) this;
        }

        public Criteria andFcNameLike(String value) {
            addCriterion("fc_name like", value, "fcName");
            return (Criteria) this;
        }

        public Criteria andFcNameNotLike(String value) {
            addCriterion("fc_name not like", value, "fcName");
            return (Criteria) this;
        }

        public Criteria andFcNameIn(List<String> values) {
            addCriterion("fc_name in", values, "fcName");
            return (Criteria) this;
        }

        public Criteria andFcNameNotIn(List<String> values) {
            addCriterion("fc_name not in", values, "fcName");
            return (Criteria) this;
        }

        public Criteria andFcNameBetween(String value1, String value2) {
            addCriterion("fc_name between", value1, value2, "fcName");
            return (Criteria) this;
        }

        public Criteria andFcNameNotBetween(String value1, String value2) {
            addCriterion("fc_name not between", value1, value2, "fcName");
            return (Criteria) this;
        }

        public Criteria andSceneIdIsNull() {
            addCriterion("scene_id is null");
            return (Criteria) this;
        }

        public Criteria andSceneIdIsNotNull() {
            addCriterion("scene_id is not null");
            return (Criteria) this;
        }

        public Criteria andSceneIdEqualTo(String value) {
            addCriterion("scene_id =", value, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdNotEqualTo(String value) {
            addCriterion("scene_id <>", value, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdGreaterThan(String value) {
            addCriterion("scene_id >", value, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdGreaterThanOrEqualTo(String value) {
            addCriterion("scene_id >=", value, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdLessThan(String value) {
            addCriterion("scene_id <", value, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdLessThanOrEqualTo(String value) {
            addCriterion("scene_id <=", value, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdLike(String value) {
            addCriterion("scene_id like", value, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdNotLike(String value) {
            addCriterion("scene_id not like", value, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdIn(List<String> values) {
            addCriterion("scene_id in", values, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdNotIn(List<String> values) {
            addCriterion("scene_id not in", values, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdBetween(String value1, String value2) {
            addCriterion("scene_id between", value1, value2, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdNotBetween(String value1, String value2) {
            addCriterion("scene_id not between", value1, value2, "sceneId");
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