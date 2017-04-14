package com.edp.dao.domain;

import java.util.ArrayList;
import java.util.List;

public class ColumnRuleRefPoCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ColumnRuleRefPoCriteria() {
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

        public Criteria andRuleValueIsNull() {
            addCriterion("Rule_value is null");
            return (Criteria) this;
        }

        public Criteria andRuleValueIsNotNull() {
            addCriterion("Rule_value is not null");
            return (Criteria) this;
        }

        public Criteria andRuleValueEqualTo(String value) {
            addCriterion("Rule_value =", value, "ruleValue");
            return (Criteria) this;
        }

        public Criteria andRuleValueNotEqualTo(String value) {
            addCriterion("Rule_value <>", value, "ruleValue");
            return (Criteria) this;
        }

        public Criteria andRuleValueGreaterThan(String value) {
            addCriterion("Rule_value >", value, "ruleValue");
            return (Criteria) this;
        }

        public Criteria andRuleValueGreaterThanOrEqualTo(String value) {
            addCriterion("Rule_value >=", value, "ruleValue");
            return (Criteria) this;
        }

        public Criteria andRuleValueLessThan(String value) {
            addCriterion("Rule_value <", value, "ruleValue");
            return (Criteria) this;
        }

        public Criteria andRuleValueLessThanOrEqualTo(String value) {
            addCriterion("Rule_value <=", value, "ruleValue");
            return (Criteria) this;
        }

        public Criteria andRuleValueLike(String value) {
            addCriterion("Rule_value like", value, "ruleValue");
            return (Criteria) this;
        }

        public Criteria andRuleValueNotLike(String value) {
            addCriterion("Rule_value not like", value, "ruleValue");
            return (Criteria) this;
        }

        public Criteria andRuleValueIn(List<String> values) {
            addCriterion("Rule_value in", values, "ruleValue");
            return (Criteria) this;
        }

        public Criteria andRuleValueNotIn(List<String> values) {
            addCriterion("Rule_value not in", values, "ruleValue");
            return (Criteria) this;
        }

        public Criteria andRuleValueBetween(String value1, String value2) {
            addCriterion("Rule_value between", value1, value2, "ruleValue");
            return (Criteria) this;
        }

        public Criteria andRuleValueNotBetween(String value1, String value2) {
            addCriterion("Rule_value not between", value1, value2, "ruleValue");
            return (Criteria) this;
        }

        public Criteria andColumnIdIsNull() {
            addCriterion("Column_id is null");
            return (Criteria) this;
        }

        public Criteria andColumnIdIsNotNull() {
            addCriterion("Column_id is not null");
            return (Criteria) this;
        }

        public Criteria andColumnIdEqualTo(String value) {
            addCriterion("Column_id =", value, "columnId");
            return (Criteria) this;
        }

        public Criteria andColumnIdNotEqualTo(String value) {
            addCriterion("Column_id <>", value, "columnId");
            return (Criteria) this;
        }

        public Criteria andColumnIdGreaterThan(String value) {
            addCriterion("Column_id >", value, "columnId");
            return (Criteria) this;
        }

        public Criteria andColumnIdGreaterThanOrEqualTo(String value) {
            addCriterion("Column_id >=", value, "columnId");
            return (Criteria) this;
        }

        public Criteria andColumnIdLessThan(String value) {
            addCriterion("Column_id <", value, "columnId");
            return (Criteria) this;
        }

        public Criteria andColumnIdLessThanOrEqualTo(String value) {
            addCriterion("Column_id <=", value, "columnId");
            return (Criteria) this;
        }

        public Criteria andColumnIdLike(String value) {
            addCriterion("Column_id like", value, "columnId");
            return (Criteria) this;
        }

        public Criteria andColumnIdNotLike(String value) {
            addCriterion("Column_id not like", value, "columnId");
            return (Criteria) this;
        }

        public Criteria andColumnIdIn(List<String> values) {
            addCriterion("Column_id in", values, "columnId");
            return (Criteria) this;
        }

        public Criteria andColumnIdNotIn(List<String> values) {
            addCriterion("Column_id not in", values, "columnId");
            return (Criteria) this;
        }

        public Criteria andColumnIdBetween(String value1, String value2) {
            addCriterion("Column_id between", value1, value2, "columnId");
            return (Criteria) this;
        }

        public Criteria andColumnIdNotBetween(String value1, String value2) {
            addCriterion("Column_id not between", value1, value2, "columnId");
            return (Criteria) this;
        }

        public Criteria andRuleIdIsNull() {
            addCriterion("Rule_id is null");
            return (Criteria) this;
        }

        public Criteria andRuleIdIsNotNull() {
            addCriterion("Rule_id is not null");
            return (Criteria) this;
        }

        public Criteria andRuleIdEqualTo(String value) {
            addCriterion("Rule_id =", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdNotEqualTo(String value) {
            addCriterion("Rule_id <>", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdGreaterThan(String value) {
            addCriterion("Rule_id >", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdGreaterThanOrEqualTo(String value) {
            addCriterion("Rule_id >=", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdLessThan(String value) {
            addCriterion("Rule_id <", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdLessThanOrEqualTo(String value) {
            addCriterion("Rule_id <=", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdLike(String value) {
            addCriterion("Rule_id like", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdNotLike(String value) {
            addCriterion("Rule_id not like", value, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdIn(List<String> values) {
            addCriterion("Rule_id in", values, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdNotIn(List<String> values) {
            addCriterion("Rule_id not in", values, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdBetween(String value1, String value2) {
            addCriterion("Rule_id between", value1, value2, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleIdNotBetween(String value1, String value2) {
            addCriterion("Rule_id not between", value1, value2, "ruleId");
            return (Criteria) this;
        }

        public Criteria andRuleNameIsNull() {
            addCriterion("Rule_name is null");
            return (Criteria) this;
        }

        public Criteria andRuleNameIsNotNull() {
            addCriterion("Rule_name is not null");
            return (Criteria) this;
        }

        public Criteria andRuleNameEqualTo(String value) {
            addCriterion("Rule_name =", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotEqualTo(String value) {
            addCriterion("Rule_name <>", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameGreaterThan(String value) {
            addCriterion("Rule_name >", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameGreaterThanOrEqualTo(String value) {
            addCriterion("Rule_name >=", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameLessThan(String value) {
            addCriterion("Rule_name <", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameLessThanOrEqualTo(String value) {
            addCriterion("Rule_name <=", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameLike(String value) {
            addCriterion("Rule_name like", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotLike(String value) {
            addCriterion("Rule_name not like", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameIn(List<String> values) {
            addCriterion("Rule_name in", values, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotIn(List<String> values) {
            addCriterion("Rule_name not in", values, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameBetween(String value1, String value2) {
            addCriterion("Rule_name between", value1, value2, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotBetween(String value1, String value2) {
            addCriterion("Rule_name not between", value1, value2, "ruleName");
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