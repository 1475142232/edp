package com.edp.dao.domain;

import java.util.ArrayList;
import java.util.List;

public class ModuleInfoPoCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ModuleInfoPoCriteria() {
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

        public Criteria andModuleNameIsNull() {
            addCriterion("module_name is null");
            return (Criteria) this;
        }

        public Criteria andModuleNameIsNotNull() {
            addCriterion("module_name is not null");
            return (Criteria) this;
        }

        public Criteria andModuleNameEqualTo(String value) {
            addCriterion("module_name =", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotEqualTo(String value) {
            addCriterion("module_name <>", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameGreaterThan(String value) {
            addCriterion("module_name >", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameGreaterThanOrEqualTo(String value) {
            addCriterion("module_name >=", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameLessThan(String value) {
            addCriterion("module_name <", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameLessThanOrEqualTo(String value) {
            addCriterion("module_name <=", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameLike(String value) {
            addCriterion("module_name like", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotLike(String value) {
            addCriterion("module_name not like", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameIn(List<String> values) {
            addCriterion("module_name in", values, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotIn(List<String> values) {
            addCriterion("module_name not in", values, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameBetween(String value1, String value2) {
            addCriterion("module_name between", value1, value2, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotBetween(String value1, String value2) {
            addCriterion("module_name not between", value1, value2, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleSpecIsNull() {
            addCriterion("module_spec is null");
            return (Criteria) this;
        }

        public Criteria andModuleSpecIsNotNull() {
            addCriterion("module_spec is not null");
            return (Criteria) this;
        }

        public Criteria andModuleSpecEqualTo(String value) {
            addCriterion("module_spec =", value, "moduleSpec");
            return (Criteria) this;
        }

        public Criteria andModuleSpecNotEqualTo(String value) {
            addCriterion("module_spec <>", value, "moduleSpec");
            return (Criteria) this;
        }

        public Criteria andModuleSpecGreaterThan(String value) {
            addCriterion("module_spec >", value, "moduleSpec");
            return (Criteria) this;
        }

        public Criteria andModuleSpecGreaterThanOrEqualTo(String value) {
            addCriterion("module_spec >=", value, "moduleSpec");
            return (Criteria) this;
        }

        public Criteria andModuleSpecLessThan(String value) {
            addCriterion("module_spec <", value, "moduleSpec");
            return (Criteria) this;
        }

        public Criteria andModuleSpecLessThanOrEqualTo(String value) {
            addCriterion("module_spec <=", value, "moduleSpec");
            return (Criteria) this;
        }

        public Criteria andModuleSpecLike(String value) {
            addCriterion("module_spec like", value, "moduleSpec");
            return (Criteria) this;
        }

        public Criteria andModuleSpecNotLike(String value) {
            addCriterion("module_spec not like", value, "moduleSpec");
            return (Criteria) this;
        }

        public Criteria andModuleSpecIn(List<String> values) {
            addCriterion("module_spec in", values, "moduleSpec");
            return (Criteria) this;
        }

        public Criteria andModuleSpecNotIn(List<String> values) {
            addCriterion("module_spec not in", values, "moduleSpec");
            return (Criteria) this;
        }

        public Criteria andModuleSpecBetween(String value1, String value2) {
            addCriterion("module_spec between", value1, value2, "moduleSpec");
            return (Criteria) this;
        }

        public Criteria andModuleSpecNotBetween(String value1, String value2) {
            addCriterion("module_spec not between", value1, value2, "moduleSpec");
            return (Criteria) this;
        }

        public Criteria andModuleCreatetimeIsNull() {
            addCriterion("module_createtime is null");
            return (Criteria) this;
        }

        public Criteria andModuleCreatetimeIsNotNull() {
            addCriterion("module_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andModuleCreatetimeEqualTo(String value) {
            addCriterion("module_createtime =", value, "moduleCreatetime");
            return (Criteria) this;
        }

        public Criteria andModuleCreatetimeNotEqualTo(String value) {
            addCriterion("module_createtime <>", value, "moduleCreatetime");
            return (Criteria) this;
        }

        public Criteria andModuleCreatetimeGreaterThan(String value) {
            addCriterion("module_createtime >", value, "moduleCreatetime");
            return (Criteria) this;
        }

        public Criteria andModuleCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("module_createtime >=", value, "moduleCreatetime");
            return (Criteria) this;
        }

        public Criteria andModuleCreatetimeLessThan(String value) {
            addCriterion("module_createtime <", value, "moduleCreatetime");
            return (Criteria) this;
        }

        public Criteria andModuleCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("module_createtime <=", value, "moduleCreatetime");
            return (Criteria) this;
        }

        public Criteria andModuleCreatetimeLike(String value) {
            addCriterion("module_createtime like", value, "moduleCreatetime");
            return (Criteria) this;
        }

        public Criteria andModuleCreatetimeNotLike(String value) {
            addCriterion("module_createtime not like", value, "moduleCreatetime");
            return (Criteria) this;
        }

        public Criteria andModuleCreatetimeIn(List<String> values) {
            addCriterion("module_createtime in", values, "moduleCreatetime");
            return (Criteria) this;
        }

        public Criteria andModuleCreatetimeNotIn(List<String> values) {
            addCriterion("module_createtime not in", values, "moduleCreatetime");
            return (Criteria) this;
        }

        public Criteria andModuleCreatetimeBetween(String value1, String value2) {
            addCriterion("module_createtime between", value1, value2, "moduleCreatetime");
            return (Criteria) this;
        }

        public Criteria andModuleCreatetimeNotBetween(String value1, String value2) {
            addCriterion("module_createtime not between", value1, value2, "moduleCreatetime");
            return (Criteria) this;
        }

        public Criteria andModuleCreaterIsNull() {
            addCriterion("module_creater is null");
            return (Criteria) this;
        }

        public Criteria andModuleCreaterIsNotNull() {
            addCriterion("module_creater is not null");
            return (Criteria) this;
        }

        public Criteria andModuleCreaterEqualTo(String value) {
            addCriterion("module_creater =", value, "moduleCreater");
            return (Criteria) this;
        }

        public Criteria andModuleCreaterNotEqualTo(String value) {
            addCriterion("module_creater <>", value, "moduleCreater");
            return (Criteria) this;
        }

        public Criteria andModuleCreaterGreaterThan(String value) {
            addCriterion("module_creater >", value, "moduleCreater");
            return (Criteria) this;
        }

        public Criteria andModuleCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("module_creater >=", value, "moduleCreater");
            return (Criteria) this;
        }

        public Criteria andModuleCreaterLessThan(String value) {
            addCriterion("module_creater <", value, "moduleCreater");
            return (Criteria) this;
        }

        public Criteria andModuleCreaterLessThanOrEqualTo(String value) {
            addCriterion("module_creater <=", value, "moduleCreater");
            return (Criteria) this;
        }

        public Criteria andModuleCreaterLike(String value) {
            addCriterion("module_creater like", value, "moduleCreater");
            return (Criteria) this;
        }

        public Criteria andModuleCreaterNotLike(String value) {
            addCriterion("module_creater not like", value, "moduleCreater");
            return (Criteria) this;
        }

        public Criteria andModuleCreaterIn(List<String> values) {
            addCriterion("module_creater in", values, "moduleCreater");
            return (Criteria) this;
        }

        public Criteria andModuleCreaterNotIn(List<String> values) {
            addCriterion("module_creater not in", values, "moduleCreater");
            return (Criteria) this;
        }

        public Criteria andModuleCreaterBetween(String value1, String value2) {
            addCriterion("module_creater between", value1, value2, "moduleCreater");
            return (Criteria) this;
        }

        public Criteria andModuleCreaterNotBetween(String value1, String value2) {
            addCriterion("module_creater not between", value1, value2, "moduleCreater");
            return (Criteria) this;
        }

        public Criteria andModuleModifiedTimeIsNull() {
            addCriterion("module_modified_time is null");
            return (Criteria) this;
        }

        public Criteria andModuleModifiedTimeIsNotNull() {
            addCriterion("module_modified_time is not null");
            return (Criteria) this;
        }

        public Criteria andModuleModifiedTimeEqualTo(String value) {
            addCriterion("module_modified_time =", value, "moduleModifiedTime");
            return (Criteria) this;
        }

        public Criteria andModuleModifiedTimeNotEqualTo(String value) {
            addCriterion("module_modified_time <>", value, "moduleModifiedTime");
            return (Criteria) this;
        }

        public Criteria andModuleModifiedTimeGreaterThan(String value) {
            addCriterion("module_modified_time >", value, "moduleModifiedTime");
            return (Criteria) this;
        }

        public Criteria andModuleModifiedTimeGreaterThanOrEqualTo(String value) {
            addCriterion("module_modified_time >=", value, "moduleModifiedTime");
            return (Criteria) this;
        }

        public Criteria andModuleModifiedTimeLessThan(String value) {
            addCriterion("module_modified_time <", value, "moduleModifiedTime");
            return (Criteria) this;
        }

        public Criteria andModuleModifiedTimeLessThanOrEqualTo(String value) {
            addCriterion("module_modified_time <=", value, "moduleModifiedTime");
            return (Criteria) this;
        }

        public Criteria andModuleModifiedTimeLike(String value) {
            addCriterion("module_modified_time like", value, "moduleModifiedTime");
            return (Criteria) this;
        }

        public Criteria andModuleModifiedTimeNotLike(String value) {
            addCriterion("module_modified_time not like", value, "moduleModifiedTime");
            return (Criteria) this;
        }

        public Criteria andModuleModifiedTimeIn(List<String> values) {
            addCriterion("module_modified_time in", values, "moduleModifiedTime");
            return (Criteria) this;
        }

        public Criteria andModuleModifiedTimeNotIn(List<String> values) {
            addCriterion("module_modified_time not in", values, "moduleModifiedTime");
            return (Criteria) this;
        }

        public Criteria andModuleModifiedTimeBetween(String value1, String value2) {
            addCriterion("module_modified_time between", value1, value2, "moduleModifiedTime");
            return (Criteria) this;
        }

        public Criteria andModuleModifiedTimeNotBetween(String value1, String value2) {
            addCriterion("module_modified_time not between", value1, value2, "moduleModifiedTime");
            return (Criteria) this;
        }

        public Criteria andModuleModifiedPersonIsNull() {
            addCriterion("module_modified_person is null");
            return (Criteria) this;
        }

        public Criteria andModuleModifiedPersonIsNotNull() {
            addCriterion("module_modified_person is not null");
            return (Criteria) this;
        }

        public Criteria andModuleModifiedPersonEqualTo(String value) {
            addCriterion("module_modified_person =", value, "moduleModifiedPerson");
            return (Criteria) this;
        }

        public Criteria andModuleModifiedPersonNotEqualTo(String value) {
            addCriterion("module_modified_person <>", value, "moduleModifiedPerson");
            return (Criteria) this;
        }

        public Criteria andModuleModifiedPersonGreaterThan(String value) {
            addCriterion("module_modified_person >", value, "moduleModifiedPerson");
            return (Criteria) this;
        }

        public Criteria andModuleModifiedPersonGreaterThanOrEqualTo(String value) {
            addCriterion("module_modified_person >=", value, "moduleModifiedPerson");
            return (Criteria) this;
        }

        public Criteria andModuleModifiedPersonLessThan(String value) {
            addCriterion("module_modified_person <", value, "moduleModifiedPerson");
            return (Criteria) this;
        }

        public Criteria andModuleModifiedPersonLessThanOrEqualTo(String value) {
            addCriterion("module_modified_person <=", value, "moduleModifiedPerson");
            return (Criteria) this;
        }

        public Criteria andModuleModifiedPersonLike(String value) {
            addCriterion("module_modified_person like", value, "moduleModifiedPerson");
            return (Criteria) this;
        }

        public Criteria andModuleModifiedPersonNotLike(String value) {
            addCriterion("module_modified_person not like", value, "moduleModifiedPerson");
            return (Criteria) this;
        }

        public Criteria andModuleModifiedPersonIn(List<String> values) {
            addCriterion("module_modified_person in", values, "moduleModifiedPerson");
            return (Criteria) this;
        }

        public Criteria andModuleModifiedPersonNotIn(List<String> values) {
            addCriterion("module_modified_person not in", values, "moduleModifiedPerson");
            return (Criteria) this;
        }

        public Criteria andModuleModifiedPersonBetween(String value1, String value2) {
            addCriterion("module_modified_person between", value1, value2, "moduleModifiedPerson");
            return (Criteria) this;
        }

        public Criteria andModuleModifiedPersonNotBetween(String value1, String value2) {
            addCriterion("module_modified_person not between", value1, value2, "moduleModifiedPerson");
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