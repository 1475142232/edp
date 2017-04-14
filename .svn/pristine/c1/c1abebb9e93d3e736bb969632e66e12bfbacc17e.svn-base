package com.edp.dao.domain;

import java.util.ArrayList;
import java.util.List;

public class MenuInfoPoCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MenuInfoPoCriteria() {
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

        public Criteria andMenuNameIsNull() {
            addCriterion("menu_name is null");
            return (Criteria) this;
        }

        public Criteria andMenuNameIsNotNull() {
            addCriterion("menu_name is not null");
            return (Criteria) this;
        }

        public Criteria andMenuNameEqualTo(String value) {
            addCriterion("menu_name =", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotEqualTo(String value) {
            addCriterion("menu_name <>", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThan(String value) {
            addCriterion("menu_name >", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThanOrEqualTo(String value) {
            addCriterion("menu_name >=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThan(String value) {
            addCriterion("menu_name <", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThanOrEqualTo(String value) {
            addCriterion("menu_name <=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLike(String value) {
            addCriterion("menu_name like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotLike(String value) {
            addCriterion("menu_name not like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameIn(List<String> values) {
            addCriterion("menu_name in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotIn(List<String> values) {
            addCriterion("menu_name not in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameBetween(String value1, String value2) {
            addCriterion("menu_name between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotBetween(String value1, String value2) {
            addCriterion("menu_name not between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuValueIsNull() {
            addCriterion("menu_value is null");
            return (Criteria) this;
        }

        public Criteria andMenuValueIsNotNull() {
            addCriterion("menu_value is not null");
            return (Criteria) this;
        }

        public Criteria andMenuValueEqualTo(String value) {
            addCriterion("menu_value =", value, "menuValue");
            return (Criteria) this;
        }

        public Criteria andMenuValueNotEqualTo(String value) {
            addCriterion("menu_value <>", value, "menuValue");
            return (Criteria) this;
        }

        public Criteria andMenuValueGreaterThan(String value) {
            addCriterion("menu_value >", value, "menuValue");
            return (Criteria) this;
        }

        public Criteria andMenuValueGreaterThanOrEqualTo(String value) {
            addCriterion("menu_value >=", value, "menuValue");
            return (Criteria) this;
        }

        public Criteria andMenuValueLessThan(String value) {
            addCriterion("menu_value <", value, "menuValue");
            return (Criteria) this;
        }

        public Criteria andMenuValueLessThanOrEqualTo(String value) {
            addCriterion("menu_value <=", value, "menuValue");
            return (Criteria) this;
        }

        public Criteria andMenuValueLike(String value) {
            addCriterion("menu_value like", value, "menuValue");
            return (Criteria) this;
        }

        public Criteria andMenuValueNotLike(String value) {
            addCriterion("menu_value not like", value, "menuValue");
            return (Criteria) this;
        }

        public Criteria andMenuValueIn(List<String> values) {
            addCriterion("menu_value in", values, "menuValue");
            return (Criteria) this;
        }

        public Criteria andMenuValueNotIn(List<String> values) {
            addCriterion("menu_value not in", values, "menuValue");
            return (Criteria) this;
        }

        public Criteria andMenuValueBetween(String value1, String value2) {
            addCriterion("menu_value between", value1, value2, "menuValue");
            return (Criteria) this;
        }

        public Criteria andMenuValueNotBetween(String value1, String value2) {
            addCriterion("menu_value not between", value1, value2, "menuValue");
            return (Criteria) this;
        }

        public Criteria andMenuSpecIsNull() {
            addCriterion("menu_spec is null");
            return (Criteria) this;
        }

        public Criteria andMenuSpecIsNotNull() {
            addCriterion("menu_spec is not null");
            return (Criteria) this;
        }

        public Criteria andMenuSpecEqualTo(String value) {
            addCriterion("menu_spec =", value, "menuSpec");
            return (Criteria) this;
        }

        public Criteria andMenuSpecNotEqualTo(String value) {
            addCriterion("menu_spec <>", value, "menuSpec");
            return (Criteria) this;
        }

        public Criteria andMenuSpecGreaterThan(String value) {
            addCriterion("menu_spec >", value, "menuSpec");
            return (Criteria) this;
        }

        public Criteria andMenuSpecGreaterThanOrEqualTo(String value) {
            addCriterion("menu_spec >=", value, "menuSpec");
            return (Criteria) this;
        }

        public Criteria andMenuSpecLessThan(String value) {
            addCriterion("menu_spec <", value, "menuSpec");
            return (Criteria) this;
        }

        public Criteria andMenuSpecLessThanOrEqualTo(String value) {
            addCriterion("menu_spec <=", value, "menuSpec");
            return (Criteria) this;
        }

        public Criteria andMenuSpecLike(String value) {
            addCriterion("menu_spec like", value, "menuSpec");
            return (Criteria) this;
        }

        public Criteria andMenuSpecNotLike(String value) {
            addCriterion("menu_spec not like", value, "menuSpec");
            return (Criteria) this;
        }

        public Criteria andMenuSpecIn(List<String> values) {
            addCriterion("menu_spec in", values, "menuSpec");
            return (Criteria) this;
        }

        public Criteria andMenuSpecNotIn(List<String> values) {
            addCriterion("menu_spec not in", values, "menuSpec");
            return (Criteria) this;
        }

        public Criteria andMenuSpecBetween(String value1, String value2) {
            addCriterion("menu_spec between", value1, value2, "menuSpec");
            return (Criteria) this;
        }

        public Criteria andMenuSpecNotBetween(String value1, String value2) {
            addCriterion("menu_spec not between", value1, value2, "menuSpec");
            return (Criteria) this;
        }

        public Criteria andMenuCreateIsNull() {
            addCriterion("menu_create is null");
            return (Criteria) this;
        }

        public Criteria andMenuCreateIsNotNull() {
            addCriterion("menu_create is not null");
            return (Criteria) this;
        }

        public Criteria andMenuCreateEqualTo(String value) {
            addCriterion("menu_create =", value, "menuCreate");
            return (Criteria) this;
        }

        public Criteria andMenuCreateNotEqualTo(String value) {
            addCriterion("menu_create <>", value, "menuCreate");
            return (Criteria) this;
        }

        public Criteria andMenuCreateGreaterThan(String value) {
            addCriterion("menu_create >", value, "menuCreate");
            return (Criteria) this;
        }

        public Criteria andMenuCreateGreaterThanOrEqualTo(String value) {
            addCriterion("menu_create >=", value, "menuCreate");
            return (Criteria) this;
        }

        public Criteria andMenuCreateLessThan(String value) {
            addCriterion("menu_create <", value, "menuCreate");
            return (Criteria) this;
        }

        public Criteria andMenuCreateLessThanOrEqualTo(String value) {
            addCriterion("menu_create <=", value, "menuCreate");
            return (Criteria) this;
        }

        public Criteria andMenuCreateLike(String value) {
            addCriterion("menu_create like", value, "menuCreate");
            return (Criteria) this;
        }

        public Criteria andMenuCreateNotLike(String value) {
            addCriterion("menu_create not like", value, "menuCreate");
            return (Criteria) this;
        }

        public Criteria andMenuCreateIn(List<String> values) {
            addCriterion("menu_create in", values, "menuCreate");
            return (Criteria) this;
        }

        public Criteria andMenuCreateNotIn(List<String> values) {
            addCriterion("menu_create not in", values, "menuCreate");
            return (Criteria) this;
        }

        public Criteria andMenuCreateBetween(String value1, String value2) {
            addCriterion("menu_create between", value1, value2, "menuCreate");
            return (Criteria) this;
        }

        public Criteria andMenuCreateNotBetween(String value1, String value2) {
            addCriterion("menu_create not between", value1, value2, "menuCreate");
            return (Criteria) this;
        }

        public Criteria andMenuCreatetimeIsNull() {
            addCriterion("menu_createtime is null");
            return (Criteria) this;
        }

        public Criteria andMenuCreatetimeIsNotNull() {
            addCriterion("menu_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andMenuCreatetimeEqualTo(String value) {
            addCriterion("menu_createtime =", value, "menuCreatetime");
            return (Criteria) this;
        }

        public Criteria andMenuCreatetimeNotEqualTo(String value) {
            addCriterion("menu_createtime <>", value, "menuCreatetime");
            return (Criteria) this;
        }

        public Criteria andMenuCreatetimeGreaterThan(String value) {
            addCriterion("menu_createtime >", value, "menuCreatetime");
            return (Criteria) this;
        }

        public Criteria andMenuCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("menu_createtime >=", value, "menuCreatetime");
            return (Criteria) this;
        }

        public Criteria andMenuCreatetimeLessThan(String value) {
            addCriterion("menu_createtime <", value, "menuCreatetime");
            return (Criteria) this;
        }

        public Criteria andMenuCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("menu_createtime <=", value, "menuCreatetime");
            return (Criteria) this;
        }

        public Criteria andMenuCreatetimeLike(String value) {
            addCriterion("menu_createtime like", value, "menuCreatetime");
            return (Criteria) this;
        }

        public Criteria andMenuCreatetimeNotLike(String value) {
            addCriterion("menu_createtime not like", value, "menuCreatetime");
            return (Criteria) this;
        }

        public Criteria andMenuCreatetimeIn(List<String> values) {
            addCriterion("menu_createtime in", values, "menuCreatetime");
            return (Criteria) this;
        }

        public Criteria andMenuCreatetimeNotIn(List<String> values) {
            addCriterion("menu_createtime not in", values, "menuCreatetime");
            return (Criteria) this;
        }

        public Criteria andMenuCreatetimeBetween(String value1, String value2) {
            addCriterion("menu_createtime between", value1, value2, "menuCreatetime");
            return (Criteria) this;
        }

        public Criteria andMenuCreatetimeNotBetween(String value1, String value2) {
            addCriterion("menu_createtime not between", value1, value2, "menuCreatetime");
            return (Criteria) this;
        }

        public Criteria andMenuParentIsNull() {
            addCriterion("menu_parent is null");
            return (Criteria) this;
        }

        public Criteria andMenuParentIsNotNull() {
            addCriterion("menu_parent is not null");
            return (Criteria) this;
        }

        public Criteria andMenuParentEqualTo(Integer value) {
            addCriterion("menu_parent =", value, "menuParent");
            return (Criteria) this;
        }

        public Criteria andMenuParentNotEqualTo(Integer value) {
            addCriterion("menu_parent <>", value, "menuParent");
            return (Criteria) this;
        }

        public Criteria andMenuParentGreaterThan(Integer value) {
            addCriterion("menu_parent >", value, "menuParent");
            return (Criteria) this;
        }

        public Criteria andMenuParentGreaterThanOrEqualTo(Integer value) {
            addCriterion("menu_parent >=", value, "menuParent");
            return (Criteria) this;
        }

        public Criteria andMenuParentLessThan(Integer value) {
            addCriterion("menu_parent <", value, "menuParent");
            return (Criteria) this;
        }

        public Criteria andMenuParentLessThanOrEqualTo(Integer value) {
            addCriterion("menu_parent <=", value, "menuParent");
            return (Criteria) this;
        }

        public Criteria andMenuParentIn(List<Integer> values) {
            addCriterion("menu_parent in", values, "menuParent");
            return (Criteria) this;
        }

        public Criteria andMenuParentNotIn(List<Integer> values) {
            addCriterion("menu_parent not in", values, "menuParent");
            return (Criteria) this;
        }

        public Criteria andMenuParentBetween(Integer value1, Integer value2) {
            addCriterion("menu_parent between", value1, value2, "menuParent");
            return (Criteria) this;
        }

        public Criteria andMenuParentNotBetween(Integer value1, Integer value2) {
            addCriterion("menu_parent not between", value1, value2, "menuParent");
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