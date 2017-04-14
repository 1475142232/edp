package com.edp.dao.domain;

import java.util.ArrayList;
import java.util.List;

public class BytearrayInfoPoCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BytearrayInfoPoCriteria() {
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

        public Criteria andFileNameIsNull() {
            addCriterion("file_name is null");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNotNull() {
            addCriterion("file_name is not null");
            return (Criteria) this;
        }

        public Criteria andFileNameEqualTo(String value) {
            addCriterion("file_name =", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotEqualTo(String value) {
            addCriterion("file_name <>", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThan(String value) {
            addCriterion("file_name >", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("file_name >=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThan(String value) {
            addCriterion("file_name <", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThanOrEqualTo(String value) {
            addCriterion("file_name <=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLike(String value) {
            addCriterion("file_name like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotLike(String value) {
            addCriterion("file_name not like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameIn(List<String> values) {
            addCriterion("file_name in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotIn(List<String> values) {
            addCriterion("file_name not in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameBetween(String value1, String value2) {
            addCriterion("file_name between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotBetween(String value1, String value2) {
            addCriterion("file_name not between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileTypeIsNull() {
            addCriterion("file_type is null");
            return (Criteria) this;
        }

        public Criteria andFileTypeIsNotNull() {
            addCriterion("file_type is not null");
            return (Criteria) this;
        }

        public Criteria andFileTypeEqualTo(String value) {
            addCriterion("file_type =", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotEqualTo(String value) {
            addCriterion("file_type <>", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeGreaterThan(String value) {
            addCriterion("file_type >", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeGreaterThanOrEqualTo(String value) {
            addCriterion("file_type >=", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLessThan(String value) {
            addCriterion("file_type <", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLessThanOrEqualTo(String value) {
            addCriterion("file_type <=", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLike(String value) {
            addCriterion("file_type like", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotLike(String value) {
            addCriterion("file_type not like", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeIn(List<String> values) {
            addCriterion("file_type in", values, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotIn(List<String> values) {
            addCriterion("file_type not in", values, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeBetween(String value1, String value2) {
            addCriterion("file_type between", value1, value2, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotBetween(String value1, String value2) {
            addCriterion("file_type not between", value1, value2, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileVersionIsNull() {
            addCriterion("file_version is null");
            return (Criteria) this;
        }

        public Criteria andFileVersionIsNotNull() {
            addCriterion("file_version is not null");
            return (Criteria) this;
        }

        public Criteria andFileVersionEqualTo(Integer value) {
            addCriterion("file_version =", value, "fileVersion");
            return (Criteria) this;
        }

        public Criteria andFileVersionNotEqualTo(Integer value) {
            addCriterion("file_version <>", value, "fileVersion");
            return (Criteria) this;
        }

        public Criteria andFileVersionGreaterThan(Integer value) {
            addCriterion("file_version >", value, "fileVersion");
            return (Criteria) this;
        }

        public Criteria andFileVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("file_version >=", value, "fileVersion");
            return (Criteria) this;
        }

        public Criteria andFileVersionLessThan(Integer value) {
            addCriterion("file_version <", value, "fileVersion");
            return (Criteria) this;
        }

        public Criteria andFileVersionLessThanOrEqualTo(Integer value) {
            addCriterion("file_version <=", value, "fileVersion");
            return (Criteria) this;
        }

        public Criteria andFileVersionIn(List<Integer> values) {
            addCriterion("file_version in", values, "fileVersion");
            return (Criteria) this;
        }

        public Criteria andFileVersionNotIn(List<Integer> values) {
            addCriterion("file_version not in", values, "fileVersion");
            return (Criteria) this;
        }

        public Criteria andFileVersionBetween(Integer value1, Integer value2) {
            addCriterion("file_version between", value1, value2, "fileVersion");
            return (Criteria) this;
        }

        public Criteria andFileVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("file_version not between", value1, value2, "fileVersion");
            return (Criteria) this;
        }

        public Criteria andFileTargetidIsNull() {
            addCriterion("file_targetid is null");
            return (Criteria) this;
        }

        public Criteria andFileTargetidIsNotNull() {
            addCriterion("file_targetid is not null");
            return (Criteria) this;
        }

        public Criteria andFileTargetidEqualTo(String value) {
            addCriterion("file_targetid =", value, "fileTargetid");
            return (Criteria) this;
        }

        public Criteria andFileTargetidNotEqualTo(String value) {
            addCriterion("file_targetid <>", value, "fileTargetid");
            return (Criteria) this;
        }

        public Criteria andFileTargetidGreaterThan(String value) {
            addCriterion("file_targetid >", value, "fileTargetid");
            return (Criteria) this;
        }

        public Criteria andFileTargetidGreaterThanOrEqualTo(String value) {
            addCriterion("file_targetid >=", value, "fileTargetid");
            return (Criteria) this;
        }

        public Criteria andFileTargetidLessThan(String value) {
            addCriterion("file_targetid <", value, "fileTargetid");
            return (Criteria) this;
        }

        public Criteria andFileTargetidLessThanOrEqualTo(String value) {
            addCriterion("file_targetid <=", value, "fileTargetid");
            return (Criteria) this;
        }

        public Criteria andFileTargetidLike(String value) {
            addCriterion("file_targetid like", value, "fileTargetid");
            return (Criteria) this;
        }

        public Criteria andFileTargetidNotLike(String value) {
            addCriterion("file_targetid not like", value, "fileTargetid");
            return (Criteria) this;
        }

        public Criteria andFileTargetidIn(List<String> values) {
            addCriterion("file_targetid in", values, "fileTargetid");
            return (Criteria) this;
        }

        public Criteria andFileTargetidNotIn(List<String> values) {
            addCriterion("file_targetid not in", values, "fileTargetid");
            return (Criteria) this;
        }

        public Criteria andFileTargetidBetween(String value1, String value2) {
            addCriterion("file_targetid between", value1, value2, "fileTargetid");
            return (Criteria) this;
        }

        public Criteria andFileTargetidNotBetween(String value1, String value2) {
            addCriterion("file_targetid not between", value1, value2, "fileTargetid");
            return (Criteria) this;
        }

        public Criteria andFileCreateTimeIsNull() {
            addCriterion("file_create_time is null");
            return (Criteria) this;
        }

        public Criteria andFileCreateTimeIsNotNull() {
            addCriterion("file_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andFileCreateTimeEqualTo(String value) {
            addCriterion("file_create_time =", value, "fileCreateTime");
            return (Criteria) this;
        }

        public Criteria andFileCreateTimeNotEqualTo(String value) {
            addCriterion("file_create_time <>", value, "fileCreateTime");
            return (Criteria) this;
        }

        public Criteria andFileCreateTimeGreaterThan(String value) {
            addCriterion("file_create_time >", value, "fileCreateTime");
            return (Criteria) this;
        }

        public Criteria andFileCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("file_create_time >=", value, "fileCreateTime");
            return (Criteria) this;
        }

        public Criteria andFileCreateTimeLessThan(String value) {
            addCriterion("file_create_time <", value, "fileCreateTime");
            return (Criteria) this;
        }

        public Criteria andFileCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("file_create_time <=", value, "fileCreateTime");
            return (Criteria) this;
        }

        public Criteria andFileCreateTimeLike(String value) {
            addCriterion("file_create_time like", value, "fileCreateTime");
            return (Criteria) this;
        }

        public Criteria andFileCreateTimeNotLike(String value) {
            addCriterion("file_create_time not like", value, "fileCreateTime");
            return (Criteria) this;
        }

        public Criteria andFileCreateTimeIn(List<String> values) {
            addCriterion("file_create_time in", values, "fileCreateTime");
            return (Criteria) this;
        }

        public Criteria andFileCreateTimeNotIn(List<String> values) {
            addCriterion("file_create_time not in", values, "fileCreateTime");
            return (Criteria) this;
        }

        public Criteria andFileCreateTimeBetween(String value1, String value2) {
            addCriterion("file_create_time between", value1, value2, "fileCreateTime");
            return (Criteria) this;
        }

        public Criteria andFileCreateTimeNotBetween(String value1, String value2) {
            addCriterion("file_create_time not between", value1, value2, "fileCreateTime");
            return (Criteria) this;
        }

        public Criteria andFileCreatorIsNull() {
            addCriterion("file_creator is null");
            return (Criteria) this;
        }

        public Criteria andFileCreatorIsNotNull() {
            addCriterion("file_creator is not null");
            return (Criteria) this;
        }

        public Criteria andFileCreatorEqualTo(String value) {
            addCriterion("file_creator =", value, "fileCreator");
            return (Criteria) this;
        }

        public Criteria andFileCreatorNotEqualTo(String value) {
            addCriterion("file_creator <>", value, "fileCreator");
            return (Criteria) this;
        }

        public Criteria andFileCreatorGreaterThan(String value) {
            addCriterion("file_creator >", value, "fileCreator");
            return (Criteria) this;
        }

        public Criteria andFileCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("file_creator >=", value, "fileCreator");
            return (Criteria) this;
        }

        public Criteria andFileCreatorLessThan(String value) {
            addCriterion("file_creator <", value, "fileCreator");
            return (Criteria) this;
        }

        public Criteria andFileCreatorLessThanOrEqualTo(String value) {
            addCriterion("file_creator <=", value, "fileCreator");
            return (Criteria) this;
        }

        public Criteria andFileCreatorLike(String value) {
            addCriterion("file_creator like", value, "fileCreator");
            return (Criteria) this;
        }

        public Criteria andFileCreatorNotLike(String value) {
            addCriterion("file_creator not like", value, "fileCreator");
            return (Criteria) this;
        }

        public Criteria andFileCreatorIn(List<String> values) {
            addCriterion("file_creator in", values, "fileCreator");
            return (Criteria) this;
        }

        public Criteria andFileCreatorNotIn(List<String> values) {
            addCriterion("file_creator not in", values, "fileCreator");
            return (Criteria) this;
        }

        public Criteria andFileCreatorBetween(String value1, String value2) {
            addCriterion("file_creator between", value1, value2, "fileCreator");
            return (Criteria) this;
        }

        public Criteria andFileCreatorNotBetween(String value1, String value2) {
            addCriterion("file_creator not between", value1, value2, "fileCreator");
            return (Criteria) this;
        }

        public Criteria andFileLastModifiedByIsNull() {
            addCriterion("file_last_modified_by is null");
            return (Criteria) this;
        }

        public Criteria andFileLastModifiedByIsNotNull() {
            addCriterion("file_last_modified_by is not null");
            return (Criteria) this;
        }

        public Criteria andFileLastModifiedByEqualTo(String value) {
            addCriterion("file_last_modified_by =", value, "fileLastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andFileLastModifiedByNotEqualTo(String value) {
            addCriterion("file_last_modified_by <>", value, "fileLastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andFileLastModifiedByGreaterThan(String value) {
            addCriterion("file_last_modified_by >", value, "fileLastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andFileLastModifiedByGreaterThanOrEqualTo(String value) {
            addCriterion("file_last_modified_by >=", value, "fileLastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andFileLastModifiedByLessThan(String value) {
            addCriterion("file_last_modified_by <", value, "fileLastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andFileLastModifiedByLessThanOrEqualTo(String value) {
            addCriterion("file_last_modified_by <=", value, "fileLastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andFileLastModifiedByLike(String value) {
            addCriterion("file_last_modified_by like", value, "fileLastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andFileLastModifiedByNotLike(String value) {
            addCriterion("file_last_modified_by not like", value, "fileLastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andFileLastModifiedByIn(List<String> values) {
            addCriterion("file_last_modified_by in", values, "fileLastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andFileLastModifiedByNotIn(List<String> values) {
            addCriterion("file_last_modified_by not in", values, "fileLastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andFileLastModifiedByBetween(String value1, String value2) {
            addCriterion("file_last_modified_by between", value1, value2, "fileLastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andFileLastModifiedByNotBetween(String value1, String value2) {
            addCriterion("file_last_modified_by not between", value1, value2, "fileLastModifiedBy");
            return (Criteria) this;
        }

        public Criteria andFileLastModifiedTimeIsNull() {
            addCriterion("file_last_modified_time is null");
            return (Criteria) this;
        }

        public Criteria andFileLastModifiedTimeIsNotNull() {
            addCriterion("file_last_modified_time is not null");
            return (Criteria) this;
        }

        public Criteria andFileLastModifiedTimeEqualTo(String value) {
            addCriterion("file_last_modified_time =", value, "fileLastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andFileLastModifiedTimeNotEqualTo(String value) {
            addCriterion("file_last_modified_time <>", value, "fileLastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andFileLastModifiedTimeGreaterThan(String value) {
            addCriterion("file_last_modified_time >", value, "fileLastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andFileLastModifiedTimeGreaterThanOrEqualTo(String value) {
            addCriterion("file_last_modified_time >=", value, "fileLastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andFileLastModifiedTimeLessThan(String value) {
            addCriterion("file_last_modified_time <", value, "fileLastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andFileLastModifiedTimeLessThanOrEqualTo(String value) {
            addCriterion("file_last_modified_time <=", value, "fileLastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andFileLastModifiedTimeLike(String value) {
            addCriterion("file_last_modified_time like", value, "fileLastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andFileLastModifiedTimeNotLike(String value) {
            addCriterion("file_last_modified_time not like", value, "fileLastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andFileLastModifiedTimeIn(List<String> values) {
            addCriterion("file_last_modified_time in", values, "fileLastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andFileLastModifiedTimeNotIn(List<String> values) {
            addCriterion("file_last_modified_time not in", values, "fileLastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andFileLastModifiedTimeBetween(String value1, String value2) {
            addCriterion("file_last_modified_time between", value1, value2, "fileLastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andFileLastModifiedTimeNotBetween(String value1, String value2) {
            addCriterion("file_last_modified_time not between", value1, value2, "fileLastModifiedTime");
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