package com.edp.dao.domain;

import java.util.ArrayList;
import java.util.List;

public class TableInfoPoCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TableInfoPoCriteria() {
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

        public Criteria andTableNameIsNull() {
            addCriterion("table_name is null");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNotNull() {
            addCriterion("table_name is not null");
            return (Criteria) this;
        }

        public Criteria andTableNameEqualTo(String value) {
            addCriterion("table_name =", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotEqualTo(String value) {
            addCriterion("table_name <>", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThan(String value) {
            addCriterion("table_name >", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThanOrEqualTo(String value) {
            addCriterion("table_name >=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThan(String value) {
            addCriterion("table_name <", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThanOrEqualTo(String value) {
            addCriterion("table_name <=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLike(String value) {
            addCriterion("table_name like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotLike(String value) {
            addCriterion("table_name not like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameIn(List<String> values) {
            addCriterion("table_name in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotIn(List<String> values) {
            addCriterion("table_name not in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameBetween(String value1, String value2) {
            addCriterion("table_name between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotBetween(String value1, String value2) {
            addCriterion("table_name not between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andDataIdIsNull() {
            addCriterion("data_id is null");
            return (Criteria) this;
        }

        public Criteria andDataIdIsNotNull() {
            addCriterion("data_id is not null");
            return (Criteria) this;
        }

        public Criteria andDataIdEqualTo(String value) {
            addCriterion("data_id =", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotEqualTo(String value) {
            addCriterion("data_id <>", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdGreaterThan(String value) {
            addCriterion("data_id >", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdGreaterThanOrEqualTo(String value) {
            addCriterion("data_id >=", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdLessThan(String value) {
            addCriterion("data_id <", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdLessThanOrEqualTo(String value) {
            addCriterion("data_id <=", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdLike(String value) {
            addCriterion("data_id like", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotLike(String value) {
            addCriterion("data_id not like", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdIn(List<String> values) {
            addCriterion("data_id in", values, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotIn(List<String> values) {
            addCriterion("data_id not in", values, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdBetween(String value1, String value2) {
            addCriterion("data_id between", value1, value2, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotBetween(String value1, String value2) {
            addCriterion("data_id not between", value1, value2, "dataId");
            return (Criteria) this;
        }

        public Criteria andTableCreatIsNull() {
            addCriterion("table_creat is null");
            return (Criteria) this;
        }

        public Criteria andTableCreatIsNotNull() {
            addCriterion("table_creat is not null");
            return (Criteria) this;
        }

        public Criteria andTableCreatEqualTo(String value) {
            addCriterion("table_creat =", value, "tableCreat");
            return (Criteria) this;
        }

        public Criteria andTableCreatNotEqualTo(String value) {
            addCriterion("table_creat <>", value, "tableCreat");
            return (Criteria) this;
        }

        public Criteria andTableCreatGreaterThan(String value) {
            addCriterion("table_creat >", value, "tableCreat");
            return (Criteria) this;
        }

        public Criteria andTableCreatGreaterThanOrEqualTo(String value) {
            addCriterion("table_creat >=", value, "tableCreat");
            return (Criteria) this;
        }

        public Criteria andTableCreatLessThan(String value) {
            addCriterion("table_creat <", value, "tableCreat");
            return (Criteria) this;
        }

        public Criteria andTableCreatLessThanOrEqualTo(String value) {
            addCriterion("table_creat <=", value, "tableCreat");
            return (Criteria) this;
        }

        public Criteria andTableCreatLike(String value) {
            addCriterion("table_creat like", value, "tableCreat");
            return (Criteria) this;
        }

        public Criteria andTableCreatNotLike(String value) {
            addCriterion("table_creat not like", value, "tableCreat");
            return (Criteria) this;
        }

        public Criteria andTableCreatIn(List<String> values) {
            addCriterion("table_creat in", values, "tableCreat");
            return (Criteria) this;
        }

        public Criteria andTableCreatNotIn(List<String> values) {
            addCriterion("table_creat not in", values, "tableCreat");
            return (Criteria) this;
        }

        public Criteria andTableCreatBetween(String value1, String value2) {
            addCriterion("table_creat between", value1, value2, "tableCreat");
            return (Criteria) this;
        }

        public Criteria andTableCreatNotBetween(String value1, String value2) {
            addCriterion("table_creat not between", value1, value2, "tableCreat");
            return (Criteria) this;
        }

        public Criteria andTableCreattimeIsNull() {
            addCriterion("table_creattime is null");
            return (Criteria) this;
        }

        public Criteria andTableCreattimeIsNotNull() {
            addCriterion("table_creattime is not null");
            return (Criteria) this;
        }

        public Criteria andTableCreattimeEqualTo(String value) {
            addCriterion("table_creattime =", value, "tableCreattime");
            return (Criteria) this;
        }

        public Criteria andTableCreattimeNotEqualTo(String value) {
            addCriterion("table_creattime <>", value, "tableCreattime");
            return (Criteria) this;
        }

        public Criteria andTableCreattimeGreaterThan(String value) {
            addCriterion("table_creattime >", value, "tableCreattime");
            return (Criteria) this;
        }

        public Criteria andTableCreattimeGreaterThanOrEqualTo(String value) {
            addCriterion("table_creattime >=", value, "tableCreattime");
            return (Criteria) this;
        }

        public Criteria andTableCreattimeLessThan(String value) {
            addCriterion("table_creattime <", value, "tableCreattime");
            return (Criteria) this;
        }

        public Criteria andTableCreattimeLessThanOrEqualTo(String value) {
            addCriterion("table_creattime <=", value, "tableCreattime");
            return (Criteria) this;
        }

        public Criteria andTableCreattimeLike(String value) {
            addCriterion("table_creattime like", value, "tableCreattime");
            return (Criteria) this;
        }

        public Criteria andTableCreattimeNotLike(String value) {
            addCriterion("table_creattime not like", value, "tableCreattime");
            return (Criteria) this;
        }

        public Criteria andTableCreattimeIn(List<String> values) {
            addCriterion("table_creattime in", values, "tableCreattime");
            return (Criteria) this;
        }

        public Criteria andTableCreattimeNotIn(List<String> values) {
            addCriterion("table_creattime not in", values, "tableCreattime");
            return (Criteria) this;
        }

        public Criteria andTableCreattimeBetween(String value1, String value2) {
            addCriterion("table_creattime between", value1, value2, "tableCreattime");
            return (Criteria) this;
        }

        public Criteria andTableCreattimeNotBetween(String value1, String value2) {
            addCriterion("table_creattime not between", value1, value2, "tableCreattime");
            return (Criteria) this;
        }

        public Criteria andTableDescIsNull() {
            addCriterion("table_desc is null");
            return (Criteria) this;
        }

        public Criteria andTableDescIsNotNull() {
            addCriterion("table_desc is not null");
            return (Criteria) this;
        }

        public Criteria andTableDescEqualTo(String value) {
            addCriterion("table_desc =", value, "tableDesc");
            return (Criteria) this;
        }

        public Criteria andTableDescNotEqualTo(String value) {
            addCriterion("table_desc <>", value, "tableDesc");
            return (Criteria) this;
        }

        public Criteria andTableDescGreaterThan(String value) {
            addCriterion("table_desc >", value, "tableDesc");
            return (Criteria) this;
        }

        public Criteria andTableDescGreaterThanOrEqualTo(String value) {
            addCriterion("table_desc >=", value, "tableDesc");
            return (Criteria) this;
        }

        public Criteria andTableDescLessThan(String value) {
            addCriterion("table_desc <", value, "tableDesc");
            return (Criteria) this;
        }

        public Criteria andTableDescLessThanOrEqualTo(String value) {
            addCriterion("table_desc <=", value, "tableDesc");
            return (Criteria) this;
        }

        public Criteria andTableDescLike(String value) {
            addCriterion("table_desc like", value, "tableDesc");
            return (Criteria) this;
        }

        public Criteria andTableDescNotLike(String value) {
            addCriterion("table_desc not like", value, "tableDesc");
            return (Criteria) this;
        }

        public Criteria andTableDescIn(List<String> values) {
            addCriterion("table_desc in", values, "tableDesc");
            return (Criteria) this;
        }

        public Criteria andTableDescNotIn(List<String> values) {
            addCriterion("table_desc not in", values, "tableDesc");
            return (Criteria) this;
        }

        public Criteria andTableDescBetween(String value1, String value2) {
            addCriterion("table_desc between", value1, value2, "tableDesc");
            return (Criteria) this;
        }

        public Criteria andTableDescNotBetween(String value1, String value2) {
            addCriterion("table_desc not between", value1, value2, "tableDesc");
            return (Criteria) this;
        }

        public Criteria andModifyCreatIsNull() {
            addCriterion("modify_creat is null");
            return (Criteria) this;
        }

        public Criteria andModifyCreatIsNotNull() {
            addCriterion("modify_creat is not null");
            return (Criteria) this;
        }

        public Criteria andModifyCreatEqualTo(String value) {
            addCriterion("modify_creat =", value, "modifyCreat");
            return (Criteria) this;
        }

        public Criteria andModifyCreatNotEqualTo(String value) {
            addCriterion("modify_creat <>", value, "modifyCreat");
            return (Criteria) this;
        }

        public Criteria andModifyCreatGreaterThan(String value) {
            addCriterion("modify_creat >", value, "modifyCreat");
            return (Criteria) this;
        }

        public Criteria andModifyCreatGreaterThanOrEqualTo(String value) {
            addCriterion("modify_creat >=", value, "modifyCreat");
            return (Criteria) this;
        }

        public Criteria andModifyCreatLessThan(String value) {
            addCriterion("modify_creat <", value, "modifyCreat");
            return (Criteria) this;
        }

        public Criteria andModifyCreatLessThanOrEqualTo(String value) {
            addCriterion("modify_creat <=", value, "modifyCreat");
            return (Criteria) this;
        }

        public Criteria andModifyCreatLike(String value) {
            addCriterion("modify_creat like", value, "modifyCreat");
            return (Criteria) this;
        }

        public Criteria andModifyCreatNotLike(String value) {
            addCriterion("modify_creat not like", value, "modifyCreat");
            return (Criteria) this;
        }

        public Criteria andModifyCreatIn(List<String> values) {
            addCriterion("modify_creat in", values, "modifyCreat");
            return (Criteria) this;
        }

        public Criteria andModifyCreatNotIn(List<String> values) {
            addCriterion("modify_creat not in", values, "modifyCreat");
            return (Criteria) this;
        }

        public Criteria andModifyCreatBetween(String value1, String value2) {
            addCriterion("modify_creat between", value1, value2, "modifyCreat");
            return (Criteria) this;
        }

        public Criteria andModifyCreatNotBetween(String value1, String value2) {
            addCriterion("modify_creat not between", value1, value2, "modifyCreat");
            return (Criteria) this;
        }

        public Criteria andModifyCreattimeIsNull() {
            addCriterion("modify_creattime is null");
            return (Criteria) this;
        }

        public Criteria andModifyCreattimeIsNotNull() {
            addCriterion("modify_creattime is not null");
            return (Criteria) this;
        }

        public Criteria andModifyCreattimeEqualTo(String value) {
            addCriterion("modify_creattime =", value, "modifyCreattime");
            return (Criteria) this;
        }

        public Criteria andModifyCreattimeNotEqualTo(String value) {
            addCriterion("modify_creattime <>", value, "modifyCreattime");
            return (Criteria) this;
        }

        public Criteria andModifyCreattimeGreaterThan(String value) {
            addCriterion("modify_creattime >", value, "modifyCreattime");
            return (Criteria) this;
        }

        public Criteria andModifyCreattimeGreaterThanOrEqualTo(String value) {
            addCriterion("modify_creattime >=", value, "modifyCreattime");
            return (Criteria) this;
        }

        public Criteria andModifyCreattimeLessThan(String value) {
            addCriterion("modify_creattime <", value, "modifyCreattime");
            return (Criteria) this;
        }

        public Criteria andModifyCreattimeLessThanOrEqualTo(String value) {
            addCriterion("modify_creattime <=", value, "modifyCreattime");
            return (Criteria) this;
        }

        public Criteria andModifyCreattimeLike(String value) {
            addCriterion("modify_creattime like", value, "modifyCreattime");
            return (Criteria) this;
        }

        public Criteria andModifyCreattimeNotLike(String value) {
            addCriterion("modify_creattime not like", value, "modifyCreattime");
            return (Criteria) this;
        }

        public Criteria andModifyCreattimeIn(List<String> values) {
            addCriterion("modify_creattime in", values, "modifyCreattime");
            return (Criteria) this;
        }

        public Criteria andModifyCreattimeNotIn(List<String> values) {
            addCriterion("modify_creattime not in", values, "modifyCreattime");
            return (Criteria) this;
        }

        public Criteria andModifyCreattimeBetween(String value1, String value2) {
            addCriterion("modify_creattime between", value1, value2, "modifyCreattime");
            return (Criteria) this;
        }

        public Criteria andModifyCreattimeNotBetween(String value1, String value2) {
            addCriterion("modify_creattime not between", value1, value2, "modifyCreattime");
            return (Criteria) this;
        }

        public Criteria andTableStateIsNull() {
            addCriterion("table_state is null");
            return (Criteria) this;
        }

        public Criteria andTableStateIsNotNull() {
            addCriterion("table_state is not null");
            return (Criteria) this;
        }

        public Criteria andTableStateEqualTo(String value) {
            addCriterion("table_state =", value, "tableState");
            return (Criteria) this;
        }

        public Criteria andTableStateNotEqualTo(String value) {
            addCriterion("table_state <>", value, "tableState");
            return (Criteria) this;
        }

        public Criteria andTableStateGreaterThan(String value) {
            addCriterion("table_state >", value, "tableState");
            return (Criteria) this;
        }

        public Criteria andTableStateGreaterThanOrEqualTo(String value) {
            addCriterion("table_state >=", value, "tableState");
            return (Criteria) this;
        }

        public Criteria andTableStateLessThan(String value) {
            addCriterion("table_state <", value, "tableState");
            return (Criteria) this;
        }

        public Criteria andTableStateLessThanOrEqualTo(String value) {
            addCriterion("table_state <=", value, "tableState");
            return (Criteria) this;
        }

        public Criteria andTableStateLike(String value) {
            addCriterion("table_state like", value, "tableState");
            return (Criteria) this;
        }

        public Criteria andTableStateNotLike(String value) {
            addCriterion("table_state not like", value, "tableState");
            return (Criteria) this;
        }

        public Criteria andTableStateIn(List<String> values) {
            addCriterion("table_state in", values, "tableState");
            return (Criteria) this;
        }

        public Criteria andTableStateNotIn(List<String> values) {
            addCriterion("table_state not in", values, "tableState");
            return (Criteria) this;
        }

        public Criteria andTableStateBetween(String value1, String value2) {
            addCriterion("table_state between", value1, value2, "tableState");
            return (Criteria) this;
        }

        public Criteria andTableStateNotBetween(String value1, String value2) {
            addCriterion("table_state not between", value1, value2, "tableState");
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