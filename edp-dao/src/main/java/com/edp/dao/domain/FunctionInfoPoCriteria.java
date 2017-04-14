package com.edp.dao.domain;

import java.util.ArrayList;
import java.util.List;

public class FunctionInfoPoCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FunctionInfoPoCriteria() {
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

        public Criteria andFunctionNameIsNull() {
            addCriterion("function_name is null");
            return (Criteria) this;
        }

        public Criteria andFunctionNameIsNotNull() {
            addCriterion("function_name is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionNameEqualTo(String value) {
            addCriterion("function_name =", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameNotEqualTo(String value) {
            addCriterion("function_name <>", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameGreaterThan(String value) {
            addCriterion("function_name >", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameGreaterThanOrEqualTo(String value) {
            addCriterion("function_name >=", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameLessThan(String value) {
            addCriterion("function_name <", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameLessThanOrEqualTo(String value) {
            addCriterion("function_name <=", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameLike(String value) {
            addCriterion("function_name like", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameNotLike(String value) {
            addCriterion("function_name not like", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameIn(List<String> values) {
            addCriterion("function_name in", values, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameNotIn(List<String> values) {
            addCriterion("function_name not in", values, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameBetween(String value1, String value2) {
            addCriterion("function_name between", value1, value2, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameNotBetween(String value1, String value2) {
            addCriterion("function_name not between", value1, value2, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionInputIsNull() {
            addCriterion("function_input is null");
            return (Criteria) this;
        }

        public Criteria andFunctionInputIsNotNull() {
            addCriterion("function_input is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionInputEqualTo(String value) {
            addCriterion("function_input =", value, "functionInput");
            return (Criteria) this;
        }

        public Criteria andFunctionInputNotEqualTo(String value) {
            addCriterion("function_input <>", value, "functionInput");
            return (Criteria) this;
        }

        public Criteria andFunctionInputGreaterThan(String value) {
            addCriterion("function_input >", value, "functionInput");
            return (Criteria) this;
        }

        public Criteria andFunctionInputGreaterThanOrEqualTo(String value) {
            addCriterion("function_input >=", value, "functionInput");
            return (Criteria) this;
        }

        public Criteria andFunctionInputLessThan(String value) {
            addCriterion("function_input <", value, "functionInput");
            return (Criteria) this;
        }

        public Criteria andFunctionInputLessThanOrEqualTo(String value) {
            addCriterion("function_input <=", value, "functionInput");
            return (Criteria) this;
        }

        public Criteria andFunctionInputLike(String value) {
            addCriterion("function_input like", value, "functionInput");
            return (Criteria) this;
        }

        public Criteria andFunctionInputNotLike(String value) {
            addCriterion("function_input not like", value, "functionInput");
            return (Criteria) this;
        }

        public Criteria andFunctionInputIn(List<String> values) {
            addCriterion("function_input in", values, "functionInput");
            return (Criteria) this;
        }

        public Criteria andFunctionInputNotIn(List<String> values) {
            addCriterion("function_input not in", values, "functionInput");
            return (Criteria) this;
        }

        public Criteria andFunctionInputBetween(String value1, String value2) {
            addCriterion("function_input between", value1, value2, "functionInput");
            return (Criteria) this;
        }

        public Criteria andFunctionInputNotBetween(String value1, String value2) {
            addCriterion("function_input not between", value1, value2, "functionInput");
            return (Criteria) this;
        }

        public Criteria andFunctionOutIsNull() {
            addCriterion("function_out is null");
            return (Criteria) this;
        }

        public Criteria andFunctionOutIsNotNull() {
            addCriterion("function_out is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionOutEqualTo(String value) {
            addCriterion("function_out =", value, "functionOut");
            return (Criteria) this;
        }

        public Criteria andFunctionOutNotEqualTo(String value) {
            addCriterion("function_out <>", value, "functionOut");
            return (Criteria) this;
        }

        public Criteria andFunctionOutGreaterThan(String value) {
            addCriterion("function_out >", value, "functionOut");
            return (Criteria) this;
        }

        public Criteria andFunctionOutGreaterThanOrEqualTo(String value) {
            addCriterion("function_out >=", value, "functionOut");
            return (Criteria) this;
        }

        public Criteria andFunctionOutLessThan(String value) {
            addCriterion("function_out <", value, "functionOut");
            return (Criteria) this;
        }

        public Criteria andFunctionOutLessThanOrEqualTo(String value) {
            addCriterion("function_out <=", value, "functionOut");
            return (Criteria) this;
        }

        public Criteria andFunctionOutLike(String value) {
            addCriterion("function_out like", value, "functionOut");
            return (Criteria) this;
        }

        public Criteria andFunctionOutNotLike(String value) {
            addCriterion("function_out not like", value, "functionOut");
            return (Criteria) this;
        }

        public Criteria andFunctionOutIn(List<String> values) {
            addCriterion("function_out in", values, "functionOut");
            return (Criteria) this;
        }

        public Criteria andFunctionOutNotIn(List<String> values) {
            addCriterion("function_out not in", values, "functionOut");
            return (Criteria) this;
        }

        public Criteria andFunctionOutBetween(String value1, String value2) {
            addCriterion("function_out between", value1, value2, "functionOut");
            return (Criteria) this;
        }

        public Criteria andFunctionOutNotBetween(String value1, String value2) {
            addCriterion("function_out not between", value1, value2, "functionOut");
            return (Criteria) this;
        }

        public Criteria andFunctionPicIsNull() {
            addCriterion("function_pic is null");
            return (Criteria) this;
        }

        public Criteria andFunctionPicIsNotNull() {
            addCriterion("function_pic is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionPicEqualTo(String value) {
            addCriterion("function_pic =", value, "functionPic");
            return (Criteria) this;
        }

        public Criteria andFunctionPicNotEqualTo(String value) {
            addCriterion("function_pic <>", value, "functionPic");
            return (Criteria) this;
        }

        public Criteria andFunctionPicGreaterThan(String value) {
            addCriterion("function_pic >", value, "functionPic");
            return (Criteria) this;
        }

        public Criteria andFunctionPicGreaterThanOrEqualTo(String value) {
            addCriterion("function_pic >=", value, "functionPic");
            return (Criteria) this;
        }

        public Criteria andFunctionPicLessThan(String value) {
            addCriterion("function_pic <", value, "functionPic");
            return (Criteria) this;
        }

        public Criteria andFunctionPicLessThanOrEqualTo(String value) {
            addCriterion("function_pic <=", value, "functionPic");
            return (Criteria) this;
        }

        public Criteria andFunctionPicLike(String value) {
            addCriterion("function_pic like", value, "functionPic");
            return (Criteria) this;
        }

        public Criteria andFunctionPicNotLike(String value) {
            addCriterion("function_pic not like", value, "functionPic");
            return (Criteria) this;
        }

        public Criteria andFunctionPicIn(List<String> values) {
            addCriterion("function_pic in", values, "functionPic");
            return (Criteria) this;
        }

        public Criteria andFunctionPicNotIn(List<String> values) {
            addCriterion("function_pic not in", values, "functionPic");
            return (Criteria) this;
        }

        public Criteria andFunctionPicBetween(String value1, String value2) {
            addCriterion("function_pic between", value1, value2, "functionPic");
            return (Criteria) this;
        }

        public Criteria andFunctionPicNotBetween(String value1, String value2) {
            addCriterion("function_pic not between", value1, value2, "functionPic");
            return (Criteria) this;
        }

        public Criteria andFunctionSceneIsNull() {
            addCriterion("function_scene is null");
            return (Criteria) this;
        }

        public Criteria andFunctionSceneIsNotNull() {
            addCriterion("function_scene is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionSceneEqualTo(String value) {
            addCriterion("function_scene =", value, "functionScene");
            return (Criteria) this;
        }

        public Criteria andFunctionSceneNotEqualTo(String value) {
            addCriterion("function_scene <>", value, "functionScene");
            return (Criteria) this;
        }

        public Criteria andFunctionSceneGreaterThan(String value) {
            addCriterion("function_scene >", value, "functionScene");
            return (Criteria) this;
        }

        public Criteria andFunctionSceneGreaterThanOrEqualTo(String value) {
            addCriterion("function_scene >=", value, "functionScene");
            return (Criteria) this;
        }

        public Criteria andFunctionSceneLessThan(String value) {
            addCriterion("function_scene <", value, "functionScene");
            return (Criteria) this;
        }

        public Criteria andFunctionSceneLessThanOrEqualTo(String value) {
            addCriterion("function_scene <=", value, "functionScene");
            return (Criteria) this;
        }

        public Criteria andFunctionSceneLike(String value) {
            addCriterion("function_scene like", value, "functionScene");
            return (Criteria) this;
        }

        public Criteria andFunctionSceneNotLike(String value) {
            addCriterion("function_scene not like", value, "functionScene");
            return (Criteria) this;
        }

        public Criteria andFunctionSceneIn(List<String> values) {
            addCriterion("function_scene in", values, "functionScene");
            return (Criteria) this;
        }

        public Criteria andFunctionSceneNotIn(List<String> values) {
            addCriterion("function_scene not in", values, "functionScene");
            return (Criteria) this;
        }

        public Criteria andFunctionSceneBetween(String value1, String value2) {
            addCriterion("function_scene between", value1, value2, "functionScene");
            return (Criteria) this;
        }

        public Criteria andFunctionSceneNotBetween(String value1, String value2) {
            addCriterion("function_scene not between", value1, value2, "functionScene");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlIsNull() {
            addCriterion("function_url is null");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlIsNotNull() {
            addCriterion("function_url is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlEqualTo(String value) {
            addCriterion("function_url =", value, "functionUrl");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlNotEqualTo(String value) {
            addCriterion("function_url <>", value, "functionUrl");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlGreaterThan(String value) {
            addCriterion("function_url >", value, "functionUrl");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlGreaterThanOrEqualTo(String value) {
            addCriterion("function_url >=", value, "functionUrl");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlLessThan(String value) {
            addCriterion("function_url <", value, "functionUrl");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlLessThanOrEqualTo(String value) {
            addCriterion("function_url <=", value, "functionUrl");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlLike(String value) {
            addCriterion("function_url like", value, "functionUrl");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlNotLike(String value) {
            addCriterion("function_url not like", value, "functionUrl");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlIn(List<String> values) {
            addCriterion("function_url in", values, "functionUrl");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlNotIn(List<String> values) {
            addCriterion("function_url not in", values, "functionUrl");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlBetween(String value1, String value2) {
            addCriterion("function_url between", value1, value2, "functionUrl");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlNotBetween(String value1, String value2) {
            addCriterion("function_url not between", value1, value2, "functionUrl");
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