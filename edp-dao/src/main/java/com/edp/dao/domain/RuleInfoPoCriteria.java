package com.edp.dao.domain;

import java.util.ArrayList;
import java.util.List;

public class RuleInfoPoCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RuleInfoPoCriteria() {
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

        public Criteria andRuleNameIsNull() {
            addCriterion("rule_name is null");
            return (Criteria) this;
        }

        public Criteria andRuleNameIsNotNull() {
            addCriterion("rule_name is not null");
            return (Criteria) this;
        }

        public Criteria andRuleNameEqualTo(String value) {
            addCriterion("rule_name =", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotEqualTo(String value) {
            addCriterion("rule_name <>", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameGreaterThan(String value) {
            addCriterion("rule_name >", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameGreaterThanOrEqualTo(String value) {
            addCriterion("rule_name >=", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameLessThan(String value) {
            addCriterion("rule_name <", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameLessThanOrEqualTo(String value) {
            addCriterion("rule_name <=", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameLike(String value) {
            addCriterion("rule_name like", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotLike(String value) {
            addCriterion("rule_name not like", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameIn(List<String> values) {
            addCriterion("rule_name in", values, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotIn(List<String> values) {
            addCriterion("rule_name not in", values, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameBetween(String value1, String value2) {
            addCriterion("rule_name between", value1, value2, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotBetween(String value1, String value2) {
            addCriterion("rule_name not between", value1, value2, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleExpressionIsNull() {
            addCriterion("rule_expression is null");
            return (Criteria) this;
        }

        public Criteria andRuleExpressionIsNotNull() {
            addCriterion("rule_expression is not null");
            return (Criteria) this;
        }

        public Criteria andRuleExpressionEqualTo(String value) {
            addCriterion("rule_expression =", value, "ruleExpression");
            return (Criteria) this;
        }

        public Criteria andRuleExpressionNotEqualTo(String value) {
            addCriterion("rule_expression <>", value, "ruleExpression");
            return (Criteria) this;
        }

        public Criteria andRuleExpressionGreaterThan(String value) {
            addCriterion("rule_expression >", value, "ruleExpression");
            return (Criteria) this;
        }

        public Criteria andRuleExpressionGreaterThanOrEqualTo(String value) {
            addCriterion("rule_expression >=", value, "ruleExpression");
            return (Criteria) this;
        }

        public Criteria andRuleExpressionLessThan(String value) {
            addCriterion("rule_expression <", value, "ruleExpression");
            return (Criteria) this;
        }

        public Criteria andRuleExpressionLessThanOrEqualTo(String value) {
            addCriterion("rule_expression <=", value, "ruleExpression");
            return (Criteria) this;
        }

        public Criteria andRuleExpressionLike(String value) {
            addCriterion("rule_expression like", value, "ruleExpression");
            return (Criteria) this;
        }

        public Criteria andRuleExpressionNotLike(String value) {
            addCriterion("rule_expression not like", value, "ruleExpression");
            return (Criteria) this;
        }

        public Criteria andRuleExpressionIn(List<String> values) {
            addCriterion("rule_expression in", values, "ruleExpression");
            return (Criteria) this;
        }

        public Criteria andRuleExpressionNotIn(List<String> values) {
            addCriterion("rule_expression not in", values, "ruleExpression");
            return (Criteria) this;
        }

        public Criteria andRuleExpressionBetween(String value1, String value2) {
            addCriterion("rule_expression between", value1, value2, "ruleExpression");
            return (Criteria) this;
        }

        public Criteria andRuleExpressionNotBetween(String value1, String value2) {
            addCriterion("rule_expression not between", value1, value2, "ruleExpression");
            return (Criteria) this;
        }

        public Criteria andRuleTypeIsNull() {
            addCriterion("rule_type is null");
            return (Criteria) this;
        }

        public Criteria andRuleTypeIsNotNull() {
            addCriterion("rule_type is not null");
            return (Criteria) this;
        }

        public Criteria andRuleTypeEqualTo(String value) {
            addCriterion("rule_type =", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNotEqualTo(String value) {
            addCriterion("rule_type <>", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeGreaterThan(String value) {
            addCriterion("rule_type >", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("rule_type >=", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeLessThan(String value) {
            addCriterion("rule_type <", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeLessThanOrEqualTo(String value) {
            addCriterion("rule_type <=", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeLike(String value) {
            addCriterion("rule_type like", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNotLike(String value) {
            addCriterion("rule_type not like", value, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeIn(List<String> values) {
            addCriterion("rule_type in", values, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNotIn(List<String> values) {
            addCriterion("rule_type not in", values, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeBetween(String value1, String value2) {
            addCriterion("rule_type between", value1, value2, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleTypeNotBetween(String value1, String value2) {
            addCriterion("rule_type not between", value1, value2, "ruleType");
            return (Criteria) this;
        }

        public Criteria andRuleSpecIsNull() {
            addCriterion("rule_spec is null");
            return (Criteria) this;
        }

        public Criteria andRuleSpecIsNotNull() {
            addCriterion("rule_spec is not null");
            return (Criteria) this;
        }

        public Criteria andRuleSpecEqualTo(String value) {
            addCriterion("rule_spec =", value, "ruleSpec");
            return (Criteria) this;
        }

        public Criteria andRuleSpecNotEqualTo(String value) {
            addCriterion("rule_spec <>", value, "ruleSpec");
            return (Criteria) this;
        }

        public Criteria andRuleSpecGreaterThan(String value) {
            addCriterion("rule_spec >", value, "ruleSpec");
            return (Criteria) this;
        }

        public Criteria andRuleSpecGreaterThanOrEqualTo(String value) {
            addCriterion("rule_spec >=", value, "ruleSpec");
            return (Criteria) this;
        }

        public Criteria andRuleSpecLessThan(String value) {
            addCriterion("rule_spec <", value, "ruleSpec");
            return (Criteria) this;
        }

        public Criteria andRuleSpecLessThanOrEqualTo(String value) {
            addCriterion("rule_spec <=", value, "ruleSpec");
            return (Criteria) this;
        }

        public Criteria andRuleSpecLike(String value) {
            addCriterion("rule_spec like", value, "ruleSpec");
            return (Criteria) this;
        }

        public Criteria andRuleSpecNotLike(String value) {
            addCriterion("rule_spec not like", value, "ruleSpec");
            return (Criteria) this;
        }

        public Criteria andRuleSpecIn(List<String> values) {
            addCriterion("rule_spec in", values, "ruleSpec");
            return (Criteria) this;
        }

        public Criteria andRuleSpecNotIn(List<String> values) {
            addCriterion("rule_spec not in", values, "ruleSpec");
            return (Criteria) this;
        }

        public Criteria andRuleSpecBetween(String value1, String value2) {
            addCriterion("rule_spec between", value1, value2, "ruleSpec");
            return (Criteria) this;
        }

        public Criteria andRuleSpecNotBetween(String value1, String value2) {
            addCriterion("rule_spec not between", value1, value2, "ruleSpec");
            return (Criteria) this;
        }

        public Criteria andRuleCreateTimeIsNull() {
            addCriterion("rule_create_time is null");
            return (Criteria) this;
        }

        public Criteria andRuleCreateTimeIsNotNull() {
            addCriterion("rule_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andRuleCreateTimeEqualTo(String value) {
            addCriterion("rule_create_time =", value, "ruleCreateTime");
            return (Criteria) this;
        }

        public Criteria andRuleCreateTimeNotEqualTo(String value) {
            addCriterion("rule_create_time <>", value, "ruleCreateTime");
            return (Criteria) this;
        }

        public Criteria andRuleCreateTimeGreaterThan(String value) {
            addCriterion("rule_create_time >", value, "ruleCreateTime");
            return (Criteria) this;
        }

        public Criteria andRuleCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("rule_create_time >=", value, "ruleCreateTime");
            return (Criteria) this;
        }

        public Criteria andRuleCreateTimeLessThan(String value) {
            addCriterion("rule_create_time <", value, "ruleCreateTime");
            return (Criteria) this;
        }

        public Criteria andRuleCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("rule_create_time <=", value, "ruleCreateTime");
            return (Criteria) this;
        }

        public Criteria andRuleCreateTimeLike(String value) {
            addCriterion("rule_create_time like", value, "ruleCreateTime");
            return (Criteria) this;
        }

        public Criteria andRuleCreateTimeNotLike(String value) {
            addCriterion("rule_create_time not like", value, "ruleCreateTime");
            return (Criteria) this;
        }

        public Criteria andRuleCreateTimeIn(List<String> values) {
            addCriterion("rule_create_time in", values, "ruleCreateTime");
            return (Criteria) this;
        }

        public Criteria andRuleCreateTimeNotIn(List<String> values) {
            addCriterion("rule_create_time not in", values, "ruleCreateTime");
            return (Criteria) this;
        }

        public Criteria andRuleCreateTimeBetween(String value1, String value2) {
            addCriterion("rule_create_time between", value1, value2, "ruleCreateTime");
            return (Criteria) this;
        }

        public Criteria andRuleCreateTimeNotBetween(String value1, String value2) {
            addCriterion("rule_create_time not between", value1, value2, "ruleCreateTime");
            return (Criteria) this;
        }

        public Criteria andRuleCreaterIsNull() {
            addCriterion("rule_creater is null");
            return (Criteria) this;
        }

        public Criteria andRuleCreaterIsNotNull() {
            addCriterion("rule_creater is not null");
            return (Criteria) this;
        }

        public Criteria andRuleCreaterEqualTo(String value) {
            addCriterion("rule_creater =", value, "ruleCreater");
            return (Criteria) this;
        }

        public Criteria andRuleCreaterNotEqualTo(String value) {
            addCriterion("rule_creater <>", value, "ruleCreater");
            return (Criteria) this;
        }

        public Criteria andRuleCreaterGreaterThan(String value) {
            addCriterion("rule_creater >", value, "ruleCreater");
            return (Criteria) this;
        }

        public Criteria andRuleCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("rule_creater >=", value, "ruleCreater");
            return (Criteria) this;
        }

        public Criteria andRuleCreaterLessThan(String value) {
            addCriterion("rule_creater <", value, "ruleCreater");
            return (Criteria) this;
        }

        public Criteria andRuleCreaterLessThanOrEqualTo(String value) {
            addCriterion("rule_creater <=", value, "ruleCreater");
            return (Criteria) this;
        }

        public Criteria andRuleCreaterLike(String value) {
            addCriterion("rule_creater like", value, "ruleCreater");
            return (Criteria) this;
        }

        public Criteria andRuleCreaterNotLike(String value) {
            addCriterion("rule_creater not like", value, "ruleCreater");
            return (Criteria) this;
        }

        public Criteria andRuleCreaterIn(List<String> values) {
            addCriterion("rule_creater in", values, "ruleCreater");
            return (Criteria) this;
        }

        public Criteria andRuleCreaterNotIn(List<String> values) {
            addCriterion("rule_creater not in", values, "ruleCreater");
            return (Criteria) this;
        }

        public Criteria andRuleCreaterBetween(String value1, String value2) {
            addCriterion("rule_creater between", value1, value2, "ruleCreater");
            return (Criteria) this;
        }

        public Criteria andRuleCreaterNotBetween(String value1, String value2) {
            addCriterion("rule_creater not between", value1, value2, "ruleCreater");
            return (Criteria) this;
        }

        public Criteria andRuleModifiedTimeIsNull() {
            addCriterion("rule_modified_time is null");
            return (Criteria) this;
        }

        public Criteria andRuleModifiedTimeIsNotNull() {
            addCriterion("rule_modified_time is not null");
            return (Criteria) this;
        }

        public Criteria andRuleModifiedTimeEqualTo(String value) {
            addCriterion("rule_modified_time =", value, "ruleModifiedTime");
            return (Criteria) this;
        }

        public Criteria andRuleModifiedTimeNotEqualTo(String value) {
            addCriterion("rule_modified_time <>", value, "ruleModifiedTime");
            return (Criteria) this;
        }

        public Criteria andRuleModifiedTimeGreaterThan(String value) {
            addCriterion("rule_modified_time >", value, "ruleModifiedTime");
            return (Criteria) this;
        }

        public Criteria andRuleModifiedTimeGreaterThanOrEqualTo(String value) {
            addCriterion("rule_modified_time >=", value, "ruleModifiedTime");
            return (Criteria) this;
        }

        public Criteria andRuleModifiedTimeLessThan(String value) {
            addCriterion("rule_modified_time <", value, "ruleModifiedTime");
            return (Criteria) this;
        }

        public Criteria andRuleModifiedTimeLessThanOrEqualTo(String value) {
            addCriterion("rule_modified_time <=", value, "ruleModifiedTime");
            return (Criteria) this;
        }

        public Criteria andRuleModifiedTimeLike(String value) {
            addCriterion("rule_modified_time like", value, "ruleModifiedTime");
            return (Criteria) this;
        }

        public Criteria andRuleModifiedTimeNotLike(String value) {
            addCriterion("rule_modified_time not like", value, "ruleModifiedTime");
            return (Criteria) this;
        }

        public Criteria andRuleModifiedTimeIn(List<String> values) {
            addCriterion("rule_modified_time in", values, "ruleModifiedTime");
            return (Criteria) this;
        }

        public Criteria andRuleModifiedTimeNotIn(List<String> values) {
            addCriterion("rule_modified_time not in", values, "ruleModifiedTime");
            return (Criteria) this;
        }

        public Criteria andRuleModifiedTimeBetween(String value1, String value2) {
            addCriterion("rule_modified_time between", value1, value2, "ruleModifiedTime");
            return (Criteria) this;
        }

        public Criteria andRuleModifiedTimeNotBetween(String value1, String value2) {
            addCriterion("rule_modified_time not between", value1, value2, "ruleModifiedTime");
            return (Criteria) this;
        }

        public Criteria andRuleModifiedPersonIsNull() {
            addCriterion("rule_modified_person is null");
            return (Criteria) this;
        }

        public Criteria andRuleModifiedPersonIsNotNull() {
            addCriterion("rule_modified_person is not null");
            return (Criteria) this;
        }

        public Criteria andRuleModifiedPersonEqualTo(String value) {
            addCriterion("rule_modified_person =", value, "ruleModifiedPerson");
            return (Criteria) this;
        }

        public Criteria andRuleModifiedPersonNotEqualTo(String value) {
            addCriterion("rule_modified_person <>", value, "ruleModifiedPerson");
            return (Criteria) this;
        }

        public Criteria andRuleModifiedPersonGreaterThan(String value) {
            addCriterion("rule_modified_person >", value, "ruleModifiedPerson");
            return (Criteria) this;
        }

        public Criteria andRuleModifiedPersonGreaterThanOrEqualTo(String value) {
            addCriterion("rule_modified_person >=", value, "ruleModifiedPerson");
            return (Criteria) this;
        }

        public Criteria andRuleModifiedPersonLessThan(String value) {
            addCriterion("rule_modified_person <", value, "ruleModifiedPerson");
            return (Criteria) this;
        }

        public Criteria andRuleModifiedPersonLessThanOrEqualTo(String value) {
            addCriterion("rule_modified_person <=", value, "ruleModifiedPerson");
            return (Criteria) this;
        }

        public Criteria andRuleModifiedPersonLike(String value) {
            addCriterion("rule_modified_person like", value, "ruleModifiedPerson");
            return (Criteria) this;
        }

        public Criteria andRuleModifiedPersonNotLike(String value) {
            addCriterion("rule_modified_person not like", value, "ruleModifiedPerson");
            return (Criteria) this;
        }

        public Criteria andRuleModifiedPersonIn(List<String> values) {
            addCriterion("rule_modified_person in", values, "ruleModifiedPerson");
            return (Criteria) this;
        }

        public Criteria andRuleModifiedPersonNotIn(List<String> values) {
            addCriterion("rule_modified_person not in", values, "ruleModifiedPerson");
            return (Criteria) this;
        }

        public Criteria andRuleModifiedPersonBetween(String value1, String value2) {
            addCriterion("rule_modified_person between", value1, value2, "ruleModifiedPerson");
            return (Criteria) this;
        }

        public Criteria andRuleModifiedPersonNotBetween(String value1, String value2) {
            addCriterion("rule_modified_person not between", value1, value2, "ruleModifiedPerson");
            return (Criteria) this;
        }

        public Criteria andRuleProductIsNull() {
            addCriterion("rule_product is null");
            return (Criteria) this;
        }

        public Criteria andRuleProductIsNotNull() {
            addCriterion("rule_product is not null");
            return (Criteria) this;
        }

        public Criteria andRuleProductEqualTo(String value) {
            addCriterion("rule_product =", value, "ruleProduct");
            return (Criteria) this;
        }

        public Criteria andRuleProductNotEqualTo(String value) {
            addCriterion("rule_product <>", value, "ruleProduct");
            return (Criteria) this;
        }

        public Criteria andRuleProductGreaterThan(String value) {
            addCriterion("rule_product >", value, "ruleProduct");
            return (Criteria) this;
        }

        public Criteria andRuleProductGreaterThanOrEqualTo(String value) {
            addCriterion("rule_product >=", value, "ruleProduct");
            return (Criteria) this;
        }

        public Criteria andRuleProductLessThan(String value) {
            addCriterion("rule_product <", value, "ruleProduct");
            return (Criteria) this;
        }

        public Criteria andRuleProductLessThanOrEqualTo(String value) {
            addCriterion("rule_product <=", value, "ruleProduct");
            return (Criteria) this;
        }

        public Criteria andRuleProductLike(String value) {
            addCriterion("rule_product like", value, "ruleProduct");
            return (Criteria) this;
        }

        public Criteria andRuleProductNotLike(String value) {
            addCriterion("rule_product not like", value, "ruleProduct");
            return (Criteria) this;
        }

        public Criteria andRuleProductIn(List<String> values) {
            addCriterion("rule_product in", values, "ruleProduct");
            return (Criteria) this;
        }

        public Criteria andRuleProductNotIn(List<String> values) {
            addCriterion("rule_product not in", values, "ruleProduct");
            return (Criteria) this;
        }

        public Criteria andRuleProductBetween(String value1, String value2) {
            addCriterion("rule_product between", value1, value2, "ruleProduct");
            return (Criteria) this;
        }

        public Criteria andRuleProductNotBetween(String value1, String value2) {
            addCriterion("rule_product not between", value1, value2, "ruleProduct");
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