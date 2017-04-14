package com.edp.dao.domain;

import java.util.ArrayList;
import java.util.List;

public class ProductInfoPoCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductInfoPoCriteria() {
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

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductDescIsNull() {
            addCriterion("product_desc is null");
            return (Criteria) this;
        }

        public Criteria andProductDescIsNotNull() {
            addCriterion("product_desc is not null");
            return (Criteria) this;
        }

        public Criteria andProductDescEqualTo(String value) {
            addCriterion("product_desc =", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescNotEqualTo(String value) {
            addCriterion("product_desc <>", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescGreaterThan(String value) {
            addCriterion("product_desc >", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescGreaterThanOrEqualTo(String value) {
            addCriterion("product_desc >=", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescLessThan(String value) {
            addCriterion("product_desc <", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescLessThanOrEqualTo(String value) {
            addCriterion("product_desc <=", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescLike(String value) {
            addCriterion("product_desc like", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescNotLike(String value) {
            addCriterion("product_desc not like", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescIn(List<String> values) {
            addCriterion("product_desc in", values, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescNotIn(List<String> values) {
            addCriterion("product_desc not in", values, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescBetween(String value1, String value2) {
            addCriterion("product_desc between", value1, value2, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescNotBetween(String value1, String value2) {
            addCriterion("product_desc not between", value1, value2, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNull() {
            addCriterion("product_type is null");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNotNull() {
            addCriterion("product_type is not null");
            return (Criteria) this;
        }

        public Criteria andProductTypeEqualTo(String value) {
            addCriterion("product_type =", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotEqualTo(String value) {
            addCriterion("product_type <>", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThan(String value) {
            addCriterion("product_type >", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThanOrEqualTo(String value) {
            addCriterion("product_type >=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThan(String value) {
            addCriterion("product_type <", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThanOrEqualTo(String value) {
            addCriterion("product_type <=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLike(String value) {
            addCriterion("product_type like", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotLike(String value) {
            addCriterion("product_type not like", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeIn(List<String> values) {
            addCriterion("product_type in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotIn(List<String> values) {
            addCriterion("product_type not in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeBetween(String value1, String value2) {
            addCriterion("product_type between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotBetween(String value1, String value2) {
            addCriterion("product_type not between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andProductOwnerIsNull() {
            addCriterion("product_owner is null");
            return (Criteria) this;
        }

        public Criteria andProductOwnerIsNotNull() {
            addCriterion("product_owner is not null");
            return (Criteria) this;
        }

        public Criteria andProductOwnerEqualTo(String value) {
            addCriterion("product_owner =", value, "productOwner");
            return (Criteria) this;
        }

        public Criteria andProductOwnerNotEqualTo(String value) {
            addCriterion("product_owner <>", value, "productOwner");
            return (Criteria) this;
        }

        public Criteria andProductOwnerGreaterThan(String value) {
            addCriterion("product_owner >", value, "productOwner");
            return (Criteria) this;
        }

        public Criteria andProductOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("product_owner >=", value, "productOwner");
            return (Criteria) this;
        }

        public Criteria andProductOwnerLessThan(String value) {
            addCriterion("product_owner <", value, "productOwner");
            return (Criteria) this;
        }

        public Criteria andProductOwnerLessThanOrEqualTo(String value) {
            addCriterion("product_owner <=", value, "productOwner");
            return (Criteria) this;
        }

        public Criteria andProductOwnerLike(String value) {
            addCriterion("product_owner like", value, "productOwner");
            return (Criteria) this;
        }

        public Criteria andProductOwnerNotLike(String value) {
            addCriterion("product_owner not like", value, "productOwner");
            return (Criteria) this;
        }

        public Criteria andProductOwnerIn(List<String> values) {
            addCriterion("product_owner in", values, "productOwner");
            return (Criteria) this;
        }

        public Criteria andProductOwnerNotIn(List<String> values) {
            addCriterion("product_owner not in", values, "productOwner");
            return (Criteria) this;
        }

        public Criteria andProductOwnerBetween(String value1, String value2) {
            addCriterion("product_owner between", value1, value2, "productOwner");
            return (Criteria) this;
        }

        public Criteria andProductOwnerNotBetween(String value1, String value2) {
            addCriterion("product_owner not between", value1, value2, "productOwner");
            return (Criteria) this;
        }

        public Criteria andProductCreaterIsNull() {
            addCriterion("product_creater is null");
            return (Criteria) this;
        }

        public Criteria andProductCreaterIsNotNull() {
            addCriterion("product_creater is not null");
            return (Criteria) this;
        }

        public Criteria andProductCreaterEqualTo(String value) {
            addCriterion("product_creater =", value, "productCreater");
            return (Criteria) this;
        }

        public Criteria andProductCreaterNotEqualTo(String value) {
            addCriterion("product_creater <>", value, "productCreater");
            return (Criteria) this;
        }

        public Criteria andProductCreaterGreaterThan(String value) {
            addCriterion("product_creater >", value, "productCreater");
            return (Criteria) this;
        }

        public Criteria andProductCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("product_creater >=", value, "productCreater");
            return (Criteria) this;
        }

        public Criteria andProductCreaterLessThan(String value) {
            addCriterion("product_creater <", value, "productCreater");
            return (Criteria) this;
        }

        public Criteria andProductCreaterLessThanOrEqualTo(String value) {
            addCriterion("product_creater <=", value, "productCreater");
            return (Criteria) this;
        }

        public Criteria andProductCreaterLike(String value) {
            addCriterion("product_creater like", value, "productCreater");
            return (Criteria) this;
        }

        public Criteria andProductCreaterNotLike(String value) {
            addCriterion("product_creater not like", value, "productCreater");
            return (Criteria) this;
        }

        public Criteria andProductCreaterIn(List<String> values) {
            addCriterion("product_creater in", values, "productCreater");
            return (Criteria) this;
        }

        public Criteria andProductCreaterNotIn(List<String> values) {
            addCriterion("product_creater not in", values, "productCreater");
            return (Criteria) this;
        }

        public Criteria andProductCreaterBetween(String value1, String value2) {
            addCriterion("product_creater between", value1, value2, "productCreater");
            return (Criteria) this;
        }

        public Criteria andProductCreaterNotBetween(String value1, String value2) {
            addCriterion("product_creater not between", value1, value2, "productCreater");
            return (Criteria) this;
        }

        public Criteria andProductCreatetimeIsNull() {
            addCriterion("product_createtime is null");
            return (Criteria) this;
        }

        public Criteria andProductCreatetimeIsNotNull() {
            addCriterion("product_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andProductCreatetimeEqualTo(String value) {
            addCriterion("product_createtime =", value, "productCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductCreatetimeNotEqualTo(String value) {
            addCriterion("product_createtime <>", value, "productCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductCreatetimeGreaterThan(String value) {
            addCriterion("product_createtime >", value, "productCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("product_createtime >=", value, "productCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductCreatetimeLessThan(String value) {
            addCriterion("product_createtime <", value, "productCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("product_createtime <=", value, "productCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductCreatetimeLike(String value) {
            addCriterion("product_createtime like", value, "productCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductCreatetimeNotLike(String value) {
            addCriterion("product_createtime not like", value, "productCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductCreatetimeIn(List<String> values) {
            addCriterion("product_createtime in", values, "productCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductCreatetimeNotIn(List<String> values) {
            addCriterion("product_createtime not in", values, "productCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductCreatetimeBetween(String value1, String value2) {
            addCriterion("product_createtime between", value1, value2, "productCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductCreatetimeNotBetween(String value1, String value2) {
            addCriterion("product_createtime not between", value1, value2, "productCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductModifiedtimeIsNull() {
            addCriterion("product_modifiedtime is null");
            return (Criteria) this;
        }

        public Criteria andProductModifiedtimeIsNotNull() {
            addCriterion("product_modifiedtime is not null");
            return (Criteria) this;
        }

        public Criteria andProductModifiedtimeEqualTo(String value) {
            addCriterion("product_modifiedtime =", value, "productModifiedtime");
            return (Criteria) this;
        }

        public Criteria andProductModifiedtimeNotEqualTo(String value) {
            addCriterion("product_modifiedtime <>", value, "productModifiedtime");
            return (Criteria) this;
        }

        public Criteria andProductModifiedtimeGreaterThan(String value) {
            addCriterion("product_modifiedtime >", value, "productModifiedtime");
            return (Criteria) this;
        }

        public Criteria andProductModifiedtimeGreaterThanOrEqualTo(String value) {
            addCriterion("product_modifiedtime >=", value, "productModifiedtime");
            return (Criteria) this;
        }

        public Criteria andProductModifiedtimeLessThan(String value) {
            addCriterion("product_modifiedtime <", value, "productModifiedtime");
            return (Criteria) this;
        }

        public Criteria andProductModifiedtimeLessThanOrEqualTo(String value) {
            addCriterion("product_modifiedtime <=", value, "productModifiedtime");
            return (Criteria) this;
        }

        public Criteria andProductModifiedtimeLike(String value) {
            addCriterion("product_modifiedtime like", value, "productModifiedtime");
            return (Criteria) this;
        }

        public Criteria andProductModifiedtimeNotLike(String value) {
            addCriterion("product_modifiedtime not like", value, "productModifiedtime");
            return (Criteria) this;
        }

        public Criteria andProductModifiedtimeIn(List<String> values) {
            addCriterion("product_modifiedtime in", values, "productModifiedtime");
            return (Criteria) this;
        }

        public Criteria andProductModifiedtimeNotIn(List<String> values) {
            addCriterion("product_modifiedtime not in", values, "productModifiedtime");
            return (Criteria) this;
        }

        public Criteria andProductModifiedtimeBetween(String value1, String value2) {
            addCriterion("product_modifiedtime between", value1, value2, "productModifiedtime");
            return (Criteria) this;
        }

        public Criteria andProductModifiedtimeNotBetween(String value1, String value2) {
            addCriterion("product_modifiedtime not between", value1, value2, "productModifiedtime");
            return (Criteria) this;
        }

        public Criteria andProductModifiedpersonIsNull() {
            addCriterion("product_modifiedPerson is null");
            return (Criteria) this;
        }

        public Criteria andProductModifiedpersonIsNotNull() {
            addCriterion("product_modifiedPerson is not null");
            return (Criteria) this;
        }

        public Criteria andProductModifiedpersonEqualTo(String value) {
            addCriterion("product_modifiedPerson =", value, "productModifiedperson");
            return (Criteria) this;
        }

        public Criteria andProductModifiedpersonNotEqualTo(String value) {
            addCriterion("product_modifiedPerson <>", value, "productModifiedperson");
            return (Criteria) this;
        }

        public Criteria andProductModifiedpersonGreaterThan(String value) {
            addCriterion("product_modifiedPerson >", value, "productModifiedperson");
            return (Criteria) this;
        }

        public Criteria andProductModifiedpersonGreaterThanOrEqualTo(String value) {
            addCriterion("product_modifiedPerson >=", value, "productModifiedperson");
            return (Criteria) this;
        }

        public Criteria andProductModifiedpersonLessThan(String value) {
            addCriterion("product_modifiedPerson <", value, "productModifiedperson");
            return (Criteria) this;
        }

        public Criteria andProductModifiedpersonLessThanOrEqualTo(String value) {
            addCriterion("product_modifiedPerson <=", value, "productModifiedperson");
            return (Criteria) this;
        }

        public Criteria andProductModifiedpersonLike(String value) {
            addCriterion("product_modifiedPerson like", value, "productModifiedperson");
            return (Criteria) this;
        }

        public Criteria andProductModifiedpersonNotLike(String value) {
            addCriterion("product_modifiedPerson not like", value, "productModifiedperson");
            return (Criteria) this;
        }

        public Criteria andProductModifiedpersonIn(List<String> values) {
            addCriterion("product_modifiedPerson in", values, "productModifiedperson");
            return (Criteria) this;
        }

        public Criteria andProductModifiedpersonNotIn(List<String> values) {
            addCriterion("product_modifiedPerson not in", values, "productModifiedperson");
            return (Criteria) this;
        }

        public Criteria andProductModifiedpersonBetween(String value1, String value2) {
            addCriterion("product_modifiedPerson between", value1, value2, "productModifiedperson");
            return (Criteria) this;
        }

        public Criteria andProductModifiedpersonNotBetween(String value1, String value2) {
            addCriterion("product_modifiedPerson not between", value1, value2, "productModifiedperson");
            return (Criteria) this;
        }

        public Criteria andProductStateIsNull() {
            addCriterion("product_state is null");
            return (Criteria) this;
        }

        public Criteria andProductStateIsNotNull() {
            addCriterion("product_state is not null");
            return (Criteria) this;
        }

        public Criteria andProductStateEqualTo(String value) {
            addCriterion("product_state =", value, "productState");
            return (Criteria) this;
        }

        public Criteria andProductStateNotEqualTo(String value) {
            addCriterion("product_state <>", value, "productState");
            return (Criteria) this;
        }

        public Criteria andProductStateGreaterThan(String value) {
            addCriterion("product_state >", value, "productState");
            return (Criteria) this;
        }

        public Criteria andProductStateGreaterThanOrEqualTo(String value) {
            addCriterion("product_state >=", value, "productState");
            return (Criteria) this;
        }

        public Criteria andProductStateLessThan(String value) {
            addCriterion("product_state <", value, "productState");
            return (Criteria) this;
        }

        public Criteria andProductStateLessThanOrEqualTo(String value) {
            addCriterion("product_state <=", value, "productState");
            return (Criteria) this;
        }

        public Criteria andProductStateLike(String value) {
            addCriterion("product_state like", value, "productState");
            return (Criteria) this;
        }

        public Criteria andProductStateNotLike(String value) {
            addCriterion("product_state not like", value, "productState");
            return (Criteria) this;
        }

        public Criteria andProductStateIn(List<String> values) {
            addCriterion("product_state in", values, "productState");
            return (Criteria) this;
        }

        public Criteria andProductStateNotIn(List<String> values) {
            addCriterion("product_state not in", values, "productState");
            return (Criteria) this;
        }

        public Criteria andProductStateBetween(String value1, String value2) {
            addCriterion("product_state between", value1, value2, "productState");
            return (Criteria) this;
        }

        public Criteria andProductStateNotBetween(String value1, String value2) {
            addCriterion("product_state not between", value1, value2, "productState");
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