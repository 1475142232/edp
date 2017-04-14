package com.edp.dao.domain;

import java.util.ArrayList;
import java.util.List;

public class DataInfoPoCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DataInfoPoCriteria() {
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

        public Criteria andDataNameIsNull() {
            addCriterion("data_name is null");
            return (Criteria) this;
        }

        public Criteria andDataNameIsNotNull() {
            addCriterion("data_name is not null");
            return (Criteria) this;
        }

        public Criteria andDataNameEqualTo(String value) {
            addCriterion("data_name =", value, "dataName");
            return (Criteria) this;
        }

        public Criteria andDataNameNotEqualTo(String value) {
            addCriterion("data_name <>", value, "dataName");
            return (Criteria) this;
        }

        public Criteria andDataNameGreaterThan(String value) {
            addCriterion("data_name >", value, "dataName");
            return (Criteria) this;
        }

        public Criteria andDataNameGreaterThanOrEqualTo(String value) {
            addCriterion("data_name >=", value, "dataName");
            return (Criteria) this;
        }

        public Criteria andDataNameLessThan(String value) {
            addCriterion("data_name <", value, "dataName");
            return (Criteria) this;
        }

        public Criteria andDataNameLessThanOrEqualTo(String value) {
            addCriterion("data_name <=", value, "dataName");
            return (Criteria) this;
        }

        public Criteria andDataNameLike(String value) {
            addCriterion("data_name like", value, "dataName");
            return (Criteria) this;
        }

        public Criteria andDataNameNotLike(String value) {
            addCriterion("data_name not like", value, "dataName");
            return (Criteria) this;
        }

        public Criteria andDataNameIn(List<String> values) {
            addCriterion("data_name in", values, "dataName");
            return (Criteria) this;
        }

        public Criteria andDataNameNotIn(List<String> values) {
            addCriterion("data_name not in", values, "dataName");
            return (Criteria) this;
        }

        public Criteria andDataNameBetween(String value1, String value2) {
            addCriterion("data_name between", value1, value2, "dataName");
            return (Criteria) this;
        }

        public Criteria andDataNameNotBetween(String value1, String value2) {
            addCriterion("data_name not between", value1, value2, "dataName");
            return (Criteria) this;
        }

        public Criteria andDataDescIsNull() {
            addCriterion("data_desc is null");
            return (Criteria) this;
        }

        public Criteria andDataDescIsNotNull() {
            addCriterion("data_desc is not null");
            return (Criteria) this;
        }

        public Criteria andDataDescEqualTo(String value) {
            addCriterion("data_desc =", value, "dataDesc");
            return (Criteria) this;
        }

        public Criteria andDataDescNotEqualTo(String value) {
            addCriterion("data_desc <>", value, "dataDesc");
            return (Criteria) this;
        }

        public Criteria andDataDescGreaterThan(String value) {
            addCriterion("data_desc >", value, "dataDesc");
            return (Criteria) this;
        }

        public Criteria andDataDescGreaterThanOrEqualTo(String value) {
            addCriterion("data_desc >=", value, "dataDesc");
            return (Criteria) this;
        }

        public Criteria andDataDescLessThan(String value) {
            addCriterion("data_desc <", value, "dataDesc");
            return (Criteria) this;
        }

        public Criteria andDataDescLessThanOrEqualTo(String value) {
            addCriterion("data_desc <=", value, "dataDesc");
            return (Criteria) this;
        }

        public Criteria andDataDescLike(String value) {
            addCriterion("data_desc like", value, "dataDesc");
            return (Criteria) this;
        }

        public Criteria andDataDescNotLike(String value) {
            addCriterion("data_desc not like", value, "dataDesc");
            return (Criteria) this;
        }

        public Criteria andDataDescIn(List<String> values) {
            addCriterion("data_desc in", values, "dataDesc");
            return (Criteria) this;
        }

        public Criteria andDataDescNotIn(List<String> values) {
            addCriterion("data_desc not in", values, "dataDesc");
            return (Criteria) this;
        }

        public Criteria andDataDescBetween(String value1, String value2) {
            addCriterion("data_desc between", value1, value2, "dataDesc");
            return (Criteria) this;
        }

        public Criteria andDataDescNotBetween(String value1, String value2) {
            addCriterion("data_desc not between", value1, value2, "dataDesc");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(String value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(String value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(String value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(String value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(String value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(String value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLike(String value) {
            addCriterion("product_id like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotLike(String value) {
            addCriterion("product_id not like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<String> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<String> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(String value1, String value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(String value1, String value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andDataStateIsNull() {
            addCriterion("data_state is null");
            return (Criteria) this;
        }

        public Criteria andDataStateIsNotNull() {
            addCriterion("data_state is not null");
            return (Criteria) this;
        }

        public Criteria andDataStateEqualTo(String value) {
            addCriterion("data_state =", value, "dataState");
            return (Criteria) this;
        }

        public Criteria andDataStateNotEqualTo(String value) {
            addCriterion("data_state <>", value, "dataState");
            return (Criteria) this;
        }

        public Criteria andDataStateGreaterThan(String value) {
            addCriterion("data_state >", value, "dataState");
            return (Criteria) this;
        }

        public Criteria andDataStateGreaterThanOrEqualTo(String value) {
            addCriterion("data_state >=", value, "dataState");
            return (Criteria) this;
        }

        public Criteria andDataStateLessThan(String value) {
            addCriterion("data_state <", value, "dataState");
            return (Criteria) this;
        }

        public Criteria andDataStateLessThanOrEqualTo(String value) {
            addCriterion("data_state <=", value, "dataState");
            return (Criteria) this;
        }

        public Criteria andDataStateLike(String value) {
            addCriterion("data_state like", value, "dataState");
            return (Criteria) this;
        }

        public Criteria andDataStateNotLike(String value) {
            addCriterion("data_state not like", value, "dataState");
            return (Criteria) this;
        }

        public Criteria andDataStateIn(List<String> values) {
            addCriterion("data_state in", values, "dataState");
            return (Criteria) this;
        }

        public Criteria andDataStateNotIn(List<String> values) {
            addCriterion("data_state not in", values, "dataState");
            return (Criteria) this;
        }

        public Criteria andDataStateBetween(String value1, String value2) {
            addCriterion("data_state between", value1, value2, "dataState");
            return (Criteria) this;
        }

        public Criteria andDataStateNotBetween(String value1, String value2) {
            addCriterion("data_state not between", value1, value2, "dataState");
            return (Criteria) this;
        }

        public Criteria andDataCreatIsNull() {
            addCriterion("data_creat is null");
            return (Criteria) this;
        }

        public Criteria andDataCreatIsNotNull() {
            addCriterion("data_creat is not null");
            return (Criteria) this;
        }

        public Criteria andDataCreatEqualTo(String value) {
            addCriterion("data_creat =", value, "dataCreat");
            return (Criteria) this;
        }

        public Criteria andDataCreatNotEqualTo(String value) {
            addCriterion("data_creat <>", value, "dataCreat");
            return (Criteria) this;
        }

        public Criteria andDataCreatGreaterThan(String value) {
            addCriterion("data_creat >", value, "dataCreat");
            return (Criteria) this;
        }

        public Criteria andDataCreatGreaterThanOrEqualTo(String value) {
            addCriterion("data_creat >=", value, "dataCreat");
            return (Criteria) this;
        }

        public Criteria andDataCreatLessThan(String value) {
            addCriterion("data_creat <", value, "dataCreat");
            return (Criteria) this;
        }

        public Criteria andDataCreatLessThanOrEqualTo(String value) {
            addCriterion("data_creat <=", value, "dataCreat");
            return (Criteria) this;
        }

        public Criteria andDataCreatLike(String value) {
            addCriterion("data_creat like", value, "dataCreat");
            return (Criteria) this;
        }

        public Criteria andDataCreatNotLike(String value) {
            addCriterion("data_creat not like", value, "dataCreat");
            return (Criteria) this;
        }

        public Criteria andDataCreatIn(List<String> values) {
            addCriterion("data_creat in", values, "dataCreat");
            return (Criteria) this;
        }

        public Criteria andDataCreatNotIn(List<String> values) {
            addCriterion("data_creat not in", values, "dataCreat");
            return (Criteria) this;
        }

        public Criteria andDataCreatBetween(String value1, String value2) {
            addCriterion("data_creat between", value1, value2, "dataCreat");
            return (Criteria) this;
        }

        public Criteria andDataCreatNotBetween(String value1, String value2) {
            addCriterion("data_creat not between", value1, value2, "dataCreat");
            return (Criteria) this;
        }

        public Criteria andDataCreattimeIsNull() {
            addCriterion("data_creattime is null");
            return (Criteria) this;
        }

        public Criteria andDataCreattimeIsNotNull() {
            addCriterion("data_creattime is not null");
            return (Criteria) this;
        }

        public Criteria andDataCreattimeEqualTo(String value) {
            addCriterion("data_creattime =", value, "dataCreattime");
            return (Criteria) this;
        }

        public Criteria andDataCreattimeNotEqualTo(String value) {
            addCriterion("data_creattime <>", value, "dataCreattime");
            return (Criteria) this;
        }

        public Criteria andDataCreattimeGreaterThan(String value) {
            addCriterion("data_creattime >", value, "dataCreattime");
            return (Criteria) this;
        }

        public Criteria andDataCreattimeGreaterThanOrEqualTo(String value) {
            addCriterion("data_creattime >=", value, "dataCreattime");
            return (Criteria) this;
        }

        public Criteria andDataCreattimeLessThan(String value) {
            addCriterion("data_creattime <", value, "dataCreattime");
            return (Criteria) this;
        }

        public Criteria andDataCreattimeLessThanOrEqualTo(String value) {
            addCriterion("data_creattime <=", value, "dataCreattime");
            return (Criteria) this;
        }

        public Criteria andDataCreattimeLike(String value) {
            addCriterion("data_creattime like", value, "dataCreattime");
            return (Criteria) this;
        }

        public Criteria andDataCreattimeNotLike(String value) {
            addCriterion("data_creattime not like", value, "dataCreattime");
            return (Criteria) this;
        }

        public Criteria andDataCreattimeIn(List<String> values) {
            addCriterion("data_creattime in", values, "dataCreattime");
            return (Criteria) this;
        }

        public Criteria andDataCreattimeNotIn(List<String> values) {
            addCriterion("data_creattime not in", values, "dataCreattime");
            return (Criteria) this;
        }

        public Criteria andDataCreattimeBetween(String value1, String value2) {
            addCriterion("data_creattime between", value1, value2, "dataCreattime");
            return (Criteria) this;
        }

        public Criteria andDataCreattimeNotBetween(String value1, String value2) {
            addCriterion("data_creattime not between", value1, value2, "dataCreattime");
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