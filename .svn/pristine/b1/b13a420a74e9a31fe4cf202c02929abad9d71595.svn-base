package com.edp.dao.domain;

import java.util.ArrayList;
import java.util.List;

public class ColumnInfoPoCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ColumnInfoPoCriteria() {
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

        public Criteria andColumnNameIsNull() {
            addCriterion("column_name is null");
            return (Criteria) this;
        }

        public Criteria andColumnNameIsNotNull() {
            addCriterion("column_name is not null");
            return (Criteria) this;
        }

        public Criteria andColumnNameEqualTo(String value) {
            addCriterion("column_name =", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameNotEqualTo(String value) {
            addCriterion("column_name <>", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameGreaterThan(String value) {
            addCriterion("column_name >", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameGreaterThanOrEqualTo(String value) {
            addCriterion("column_name >=", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameLessThan(String value) {
            addCriterion("column_name <", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameLessThanOrEqualTo(String value) {
            addCriterion("column_name <=", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameLike(String value) {
            addCriterion("column_name like", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameNotLike(String value) {
            addCriterion("column_name not like", value, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameIn(List<String> values) {
            addCriterion("column_name in", values, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameNotIn(List<String> values) {
            addCriterion("column_name not in", values, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameBetween(String value1, String value2) {
            addCriterion("column_name between", value1, value2, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnNameNotBetween(String value1, String value2) {
            addCriterion("column_name not between", value1, value2, "columnName");
            return (Criteria) this;
        }

        public Criteria andColumnDescIsNull() {
            addCriterion("column_desc is null");
            return (Criteria) this;
        }

        public Criteria andColumnDescIsNotNull() {
            addCriterion("column_desc is not null");
            return (Criteria) this;
        }

        public Criteria andColumnDescEqualTo(String value) {
            addCriterion("column_desc =", value, "columnDesc");
            return (Criteria) this;
        }

        public Criteria andColumnDescNotEqualTo(String value) {
            addCriterion("column_desc <>", value, "columnDesc");
            return (Criteria) this;
        }

        public Criteria andColumnDescGreaterThan(String value) {
            addCriterion("column_desc >", value, "columnDesc");
            return (Criteria) this;
        }

        public Criteria andColumnDescGreaterThanOrEqualTo(String value) {
            addCriterion("column_desc >=", value, "columnDesc");
            return (Criteria) this;
        }

        public Criteria andColumnDescLessThan(String value) {
            addCriterion("column_desc <", value, "columnDesc");
            return (Criteria) this;
        }

        public Criteria andColumnDescLessThanOrEqualTo(String value) {
            addCriterion("column_desc <=", value, "columnDesc");
            return (Criteria) this;
        }

        public Criteria andColumnDescLike(String value) {
            addCriterion("column_desc like", value, "columnDesc");
            return (Criteria) this;
        }

        public Criteria andColumnDescNotLike(String value) {
            addCriterion("column_desc not like", value, "columnDesc");
            return (Criteria) this;
        }

        public Criteria andColumnDescIn(List<String> values) {
            addCriterion("column_desc in", values, "columnDesc");
            return (Criteria) this;
        }

        public Criteria andColumnDescNotIn(List<String> values) {
            addCriterion("column_desc not in", values, "columnDesc");
            return (Criteria) this;
        }

        public Criteria andColumnDescBetween(String value1, String value2) {
            addCriterion("column_desc between", value1, value2, "columnDesc");
            return (Criteria) this;
        }

        public Criteria andColumnDescNotBetween(String value1, String value2) {
            addCriterion("column_desc not between", value1, value2, "columnDesc");
            return (Criteria) this;
        }

        public Criteria andColumnCreatIsNull() {
            addCriterion("column_creat is null");
            return (Criteria) this;
        }

        public Criteria andColumnCreatIsNotNull() {
            addCriterion("column_creat is not null");
            return (Criteria) this;
        }

        public Criteria andColumnCreatEqualTo(String value) {
            addCriterion("column_creat =", value, "columnCreat");
            return (Criteria) this;
        }

        public Criteria andColumnCreatNotEqualTo(String value) {
            addCriterion("column_creat <>", value, "columnCreat");
            return (Criteria) this;
        }

        public Criteria andColumnCreatGreaterThan(String value) {
            addCriterion("column_creat >", value, "columnCreat");
            return (Criteria) this;
        }

        public Criteria andColumnCreatGreaterThanOrEqualTo(String value) {
            addCriterion("column_creat >=", value, "columnCreat");
            return (Criteria) this;
        }

        public Criteria andColumnCreatLessThan(String value) {
            addCriterion("column_creat <", value, "columnCreat");
            return (Criteria) this;
        }

        public Criteria andColumnCreatLessThanOrEqualTo(String value) {
            addCriterion("column_creat <=", value, "columnCreat");
            return (Criteria) this;
        }

        public Criteria andColumnCreatLike(String value) {
            addCriterion("column_creat like", value, "columnCreat");
            return (Criteria) this;
        }

        public Criteria andColumnCreatNotLike(String value) {
            addCriterion("column_creat not like", value, "columnCreat");
            return (Criteria) this;
        }

        public Criteria andColumnCreatIn(List<String> values) {
            addCriterion("column_creat in", values, "columnCreat");
            return (Criteria) this;
        }

        public Criteria andColumnCreatNotIn(List<String> values) {
            addCriterion("column_creat not in", values, "columnCreat");
            return (Criteria) this;
        }

        public Criteria andColumnCreatBetween(String value1, String value2) {
            addCriterion("column_creat between", value1, value2, "columnCreat");
            return (Criteria) this;
        }

        public Criteria andColumnCreatNotBetween(String value1, String value2) {
            addCriterion("column_creat not between", value1, value2, "columnCreat");
            return (Criteria) this;
        }

        public Criteria andColumnCreattimeIsNull() {
            addCriterion("column_creattime is null");
            return (Criteria) this;
        }

        public Criteria andColumnCreattimeIsNotNull() {
            addCriterion("column_creattime is not null");
            return (Criteria) this;
        }

        public Criteria andColumnCreattimeEqualTo(String value) {
            addCriterion("column_creattime =", value, "columnCreattime");
            return (Criteria) this;
        }

        public Criteria andColumnCreattimeNotEqualTo(String value) {
            addCriterion("column_creattime <>", value, "columnCreattime");
            return (Criteria) this;
        }

        public Criteria andColumnCreattimeGreaterThan(String value) {
            addCriterion("column_creattime >", value, "columnCreattime");
            return (Criteria) this;
        }

        public Criteria andColumnCreattimeGreaterThanOrEqualTo(String value) {
            addCriterion("column_creattime >=", value, "columnCreattime");
            return (Criteria) this;
        }

        public Criteria andColumnCreattimeLessThan(String value) {
            addCriterion("column_creattime <", value, "columnCreattime");
            return (Criteria) this;
        }

        public Criteria andColumnCreattimeLessThanOrEqualTo(String value) {
            addCriterion("column_creattime <=", value, "columnCreattime");
            return (Criteria) this;
        }

        public Criteria andColumnCreattimeLike(String value) {
            addCriterion("column_creattime like", value, "columnCreattime");
            return (Criteria) this;
        }

        public Criteria andColumnCreattimeNotLike(String value) {
            addCriterion("column_creattime not like", value, "columnCreattime");
            return (Criteria) this;
        }

        public Criteria andColumnCreattimeIn(List<String> values) {
            addCriterion("column_creattime in", values, "columnCreattime");
            return (Criteria) this;
        }

        public Criteria andColumnCreattimeNotIn(List<String> values) {
            addCriterion("column_creattime not in", values, "columnCreattime");
            return (Criteria) this;
        }

        public Criteria andColumnCreattimeBetween(String value1, String value2) {
            addCriterion("column_creattime between", value1, value2, "columnCreattime");
            return (Criteria) this;
        }

        public Criteria andColumnCreattimeNotBetween(String value1, String value2) {
            addCriterion("column_creattime not between", value1, value2, "columnCreattime");
            return (Criteria) this;
        }

        public Criteria andTableIdIsNull() {
            addCriterion("table_id is null");
            return (Criteria) this;
        }

        public Criteria andTableIdIsNotNull() {
            addCriterion("table_id is not null");
            return (Criteria) this;
        }

        public Criteria andTableIdEqualTo(String value) {
            addCriterion("table_id =", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdNotEqualTo(String value) {
            addCriterion("table_id <>", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdGreaterThan(String value) {
            addCriterion("table_id >", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdGreaterThanOrEqualTo(String value) {
            addCriterion("table_id >=", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdLessThan(String value) {
            addCriterion("table_id <", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdLessThanOrEqualTo(String value) {
            addCriterion("table_id <=", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdLike(String value) {
            addCriterion("table_id like", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdNotLike(String value) {
            addCriterion("table_id not like", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdIn(List<String> values) {
            addCriterion("table_id in", values, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdNotIn(List<String> values) {
            addCriterion("table_id not in", values, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdBetween(String value1, String value2) {
            addCriterion("table_id between", value1, value2, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdNotBetween(String value1, String value2) {
            addCriterion("table_id not between", value1, value2, "tableId");
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

        public Criteria andColumnStateIsNull() {
            addCriterion("column_state is null");
            return (Criteria) this;
        }

        public Criteria andColumnStateIsNotNull() {
            addCriterion("column_state is not null");
            return (Criteria) this;
        }

        public Criteria andColumnStateEqualTo(String value) {
            addCriterion("column_state =", value, "columnState");
            return (Criteria) this;
        }

        public Criteria andColumnStateNotEqualTo(String value) {
            addCriterion("column_state <>", value, "columnState");
            return (Criteria) this;
        }

        public Criteria andColumnStateGreaterThan(String value) {
            addCriterion("column_state >", value, "columnState");
            return (Criteria) this;
        }

        public Criteria andColumnStateGreaterThanOrEqualTo(String value) {
            addCriterion("column_state >=", value, "columnState");
            return (Criteria) this;
        }

        public Criteria andColumnStateLessThan(String value) {
            addCriterion("column_state <", value, "columnState");
            return (Criteria) this;
        }

        public Criteria andColumnStateLessThanOrEqualTo(String value) {
            addCriterion("column_state <=", value, "columnState");
            return (Criteria) this;
        }

        public Criteria andColumnStateLike(String value) {
            addCriterion("column_state like", value, "columnState");
            return (Criteria) this;
        }

        public Criteria andColumnStateNotLike(String value) {
            addCriterion("column_state not like", value, "columnState");
            return (Criteria) this;
        }

        public Criteria andColumnStateIn(List<String> values) {
            addCriterion("column_state in", values, "columnState");
            return (Criteria) this;
        }

        public Criteria andColumnStateNotIn(List<String> values) {
            addCriterion("column_state not in", values, "columnState");
            return (Criteria) this;
        }

        public Criteria andColumnStateBetween(String value1, String value2) {
            addCriterion("column_state between", value1, value2, "columnState");
            return (Criteria) this;
        }

        public Criteria andColumnStateNotBetween(String value1, String value2) {
            addCriterion("column_state not between", value1, value2, "columnState");
            return (Criteria) this;
        }

        public Criteria andColumnTypeIsNull() {
            addCriterion("column_type is null");
            return (Criteria) this;
        }

        public Criteria andColumnTypeIsNotNull() {
            addCriterion("column_type is not null");
            return (Criteria) this;
        }

        public Criteria andColumnTypeEqualTo(String value) {
            addCriterion("column_type =", value, "columnType");
            return (Criteria) this;
        }

        public Criteria andColumnTypeNotEqualTo(String value) {
            addCriterion("column_type <>", value, "columnType");
            return (Criteria) this;
        }

        public Criteria andColumnTypeGreaterThan(String value) {
            addCriterion("column_type >", value, "columnType");
            return (Criteria) this;
        }

        public Criteria andColumnTypeGreaterThanOrEqualTo(String value) {
            addCriterion("column_type >=", value, "columnType");
            return (Criteria) this;
        }

        public Criteria andColumnTypeLessThan(String value) {
            addCriterion("column_type <", value, "columnType");
            return (Criteria) this;
        }

        public Criteria andColumnTypeLessThanOrEqualTo(String value) {
            addCriterion("column_type <=", value, "columnType");
            return (Criteria) this;
        }

        public Criteria andColumnTypeLike(String value) {
            addCriterion("column_type like", value, "columnType");
            return (Criteria) this;
        }

        public Criteria andColumnTypeNotLike(String value) {
            addCriterion("column_type not like", value, "columnType");
            return (Criteria) this;
        }

        public Criteria andColumnTypeIn(List<String> values) {
            addCriterion("column_type in", values, "columnType");
            return (Criteria) this;
        }

        public Criteria andColumnTypeNotIn(List<String> values) {
            addCriterion("column_type not in", values, "columnType");
            return (Criteria) this;
        }

        public Criteria andColumnTypeBetween(String value1, String value2) {
            addCriterion("column_type between", value1, value2, "columnType");
            return (Criteria) this;
        }

        public Criteria andColumnTypeNotBetween(String value1, String value2) {
            addCriterion("column_type not between", value1, value2, "columnType");
            return (Criteria) this;
        }

        public Criteria andColumnRequiredIsNull() {
            addCriterion("column_required is null");
            return (Criteria) this;
        }

        public Criteria andColumnRequiredIsNotNull() {
            addCriterion("column_required is not null");
            return (Criteria) this;
        }

        public Criteria andColumnRequiredEqualTo(String value) {
            addCriterion("column_required =", value, "columnRequired");
            return (Criteria) this;
        }

        public Criteria andColumnRequiredNotEqualTo(String value) {
            addCriterion("column_required <>", value, "columnRequired");
            return (Criteria) this;
        }

        public Criteria andColumnRequiredGreaterThan(String value) {
            addCriterion("column_required >", value, "columnRequired");
            return (Criteria) this;
        }

        public Criteria andColumnRequiredGreaterThanOrEqualTo(String value) {
            addCriterion("column_required >=", value, "columnRequired");
            return (Criteria) this;
        }

        public Criteria andColumnRequiredLessThan(String value) {
            addCriterion("column_required <", value, "columnRequired");
            return (Criteria) this;
        }

        public Criteria andColumnRequiredLessThanOrEqualTo(String value) {
            addCriterion("column_required <=", value, "columnRequired");
            return (Criteria) this;
        }

        public Criteria andColumnRequiredLike(String value) {
            addCriterion("column_required like", value, "columnRequired");
            return (Criteria) this;
        }

        public Criteria andColumnRequiredNotLike(String value) {
            addCriterion("column_required not like", value, "columnRequired");
            return (Criteria) this;
        }

        public Criteria andColumnRequiredIn(List<String> values) {
            addCriterion("column_required in", values, "columnRequired");
            return (Criteria) this;
        }

        public Criteria andColumnRequiredNotIn(List<String> values) {
            addCriterion("column_required not in", values, "columnRequired");
            return (Criteria) this;
        }

        public Criteria andColumnRequiredBetween(String value1, String value2) {
            addCriterion("column_required between", value1, value2, "columnRequired");
            return (Criteria) this;
        }

        public Criteria andColumnRequiredNotBetween(String value1, String value2) {
            addCriterion("column_required not between", value1, value2, "columnRequired");
            return (Criteria) this;
        }

        public Criteria andColumnKeyIsNull() {
            addCriterion("column_key is null");
            return (Criteria) this;
        }

        public Criteria andColumnKeyIsNotNull() {
            addCriterion("column_key is not null");
            return (Criteria) this;
        }

        public Criteria andColumnKeyEqualTo(String value) {
            addCriterion("column_key =", value, "columnKey");
            return (Criteria) this;
        }

        public Criteria andColumnKeyNotEqualTo(String value) {
            addCriterion("column_key <>", value, "columnKey");
            return (Criteria) this;
        }

        public Criteria andColumnKeyGreaterThan(String value) {
            addCriterion("column_key >", value, "columnKey");
            return (Criteria) this;
        }

        public Criteria andColumnKeyGreaterThanOrEqualTo(String value) {
            addCriterion("column_key >=", value, "columnKey");
            return (Criteria) this;
        }

        public Criteria andColumnKeyLessThan(String value) {
            addCriterion("column_key <", value, "columnKey");
            return (Criteria) this;
        }

        public Criteria andColumnKeyLessThanOrEqualTo(String value) {
            addCriterion("column_key <=", value, "columnKey");
            return (Criteria) this;
        }

        public Criteria andColumnKeyLike(String value) {
            addCriterion("column_key like", value, "columnKey");
            return (Criteria) this;
        }

        public Criteria andColumnKeyNotLike(String value) {
            addCriterion("column_key not like", value, "columnKey");
            return (Criteria) this;
        }

        public Criteria andColumnKeyIn(List<String> values) {
            addCriterion("column_key in", values, "columnKey");
            return (Criteria) this;
        }

        public Criteria andColumnKeyNotIn(List<String> values) {
            addCriterion("column_key not in", values, "columnKey");
            return (Criteria) this;
        }

        public Criteria andColumnKeyBetween(String value1, String value2) {
            addCriterion("column_key between", value1, value2, "columnKey");
            return (Criteria) this;
        }

        public Criteria andColumnKeyNotBetween(String value1, String value2) {
            addCriterion("column_key not between", value1, value2, "columnKey");
            return (Criteria) this;
        }

        public Criteria andColumnLengthIsNull() {
            addCriterion("column_length is null");
            return (Criteria) this;
        }

        public Criteria andColumnLengthIsNotNull() {
            addCriterion("column_length is not null");
            return (Criteria) this;
        }

        public Criteria andColumnLengthEqualTo(Integer value) {
            addCriterion("column_length =", value, "columnLength");
            return (Criteria) this;
        }

        public Criteria andColumnLengthNotEqualTo(Integer value) {
            addCriterion("column_length <>", value, "columnLength");
            return (Criteria) this;
        }

        public Criteria andColumnLengthGreaterThan(Integer value) {
            addCriterion("column_length >", value, "columnLength");
            return (Criteria) this;
        }

        public Criteria andColumnLengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("column_length >=", value, "columnLength");
            return (Criteria) this;
        }

        public Criteria andColumnLengthLessThan(Integer value) {
            addCriterion("column_length <", value, "columnLength");
            return (Criteria) this;
        }

        public Criteria andColumnLengthLessThanOrEqualTo(Integer value) {
            addCriterion("column_length <=", value, "columnLength");
            return (Criteria) this;
        }

        public Criteria andColumnLengthIn(List<Integer> values) {
            addCriterion("column_length in", values, "columnLength");
            return (Criteria) this;
        }

        public Criteria andColumnLengthNotIn(List<Integer> values) {
            addCriterion("column_length not in", values, "columnLength");
            return (Criteria) this;
        }

        public Criteria andColumnLengthBetween(Integer value1, Integer value2) {
            addCriterion("column_length between", value1, value2, "columnLength");
            return (Criteria) this;
        }

        public Criteria andColumnLengthNotBetween(Integer value1, Integer value2) {
            addCriterion("column_length not between", value1, value2, "columnLength");
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