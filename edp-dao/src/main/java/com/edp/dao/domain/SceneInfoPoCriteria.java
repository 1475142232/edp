package com.edp.dao.domain;

import java.util.ArrayList;
import java.util.List;

public class SceneInfoPoCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SceneInfoPoCriteria() {
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

        public Criteria andSceneNameIsNull() {
            addCriterion("scene_name is null");
            return (Criteria) this;
        }

        public Criteria andSceneNameIsNotNull() {
            addCriterion("scene_name is not null");
            return (Criteria) this;
        }

        public Criteria andSceneNameEqualTo(String value) {
            addCriterion("scene_name =", value, "sceneName");
            return (Criteria) this;
        }

        public Criteria andSceneNameNotEqualTo(String value) {
            addCriterion("scene_name <>", value, "sceneName");
            return (Criteria) this;
        }

        public Criteria andSceneNameGreaterThan(String value) {
            addCriterion("scene_name >", value, "sceneName");
            return (Criteria) this;
        }

        public Criteria andSceneNameGreaterThanOrEqualTo(String value) {
            addCriterion("scene_name >=", value, "sceneName");
            return (Criteria) this;
        }

        public Criteria andSceneNameLessThan(String value) {
            addCriterion("scene_name <", value, "sceneName");
            return (Criteria) this;
        }

        public Criteria andSceneNameLessThanOrEqualTo(String value) {
            addCriterion("scene_name <=", value, "sceneName");
            return (Criteria) this;
        }

        public Criteria andSceneNameLike(String value) {
            addCriterion("scene_name like", value, "sceneName");
            return (Criteria) this;
        }

        public Criteria andSceneNameNotLike(String value) {
            addCriterion("scene_name not like", value, "sceneName");
            return (Criteria) this;
        }

        public Criteria andSceneNameIn(List<String> values) {
            addCriterion("scene_name in", values, "sceneName");
            return (Criteria) this;
        }

        public Criteria andSceneNameNotIn(List<String> values) {
            addCriterion("scene_name not in", values, "sceneName");
            return (Criteria) this;
        }

        public Criteria andSceneNameBetween(String value1, String value2) {
            addCriterion("scene_name between", value1, value2, "sceneName");
            return (Criteria) this;
        }

        public Criteria andSceneNameNotBetween(String value1, String value2) {
            addCriterion("scene_name not between", value1, value2, "sceneName");
            return (Criteria) this;
        }

        public Criteria andSceneSpecIsNull() {
            addCriterion("scene_spec is null");
            return (Criteria) this;
        }

        public Criteria andSceneSpecIsNotNull() {
            addCriterion("scene_spec is not null");
            return (Criteria) this;
        }

        public Criteria andSceneSpecEqualTo(String value) {
            addCriterion("scene_spec =", value, "sceneSpec");
            return (Criteria) this;
        }

        public Criteria andSceneSpecNotEqualTo(String value) {
            addCriterion("scene_spec <>", value, "sceneSpec");
            return (Criteria) this;
        }

        public Criteria andSceneSpecGreaterThan(String value) {
            addCriterion("scene_spec >", value, "sceneSpec");
            return (Criteria) this;
        }

        public Criteria andSceneSpecGreaterThanOrEqualTo(String value) {
            addCriterion("scene_spec >=", value, "sceneSpec");
            return (Criteria) this;
        }

        public Criteria andSceneSpecLessThan(String value) {
            addCriterion("scene_spec <", value, "sceneSpec");
            return (Criteria) this;
        }

        public Criteria andSceneSpecLessThanOrEqualTo(String value) {
            addCriterion("scene_spec <=", value, "sceneSpec");
            return (Criteria) this;
        }

        public Criteria andSceneSpecLike(String value) {
            addCriterion("scene_spec like", value, "sceneSpec");
            return (Criteria) this;
        }

        public Criteria andSceneSpecNotLike(String value) {
            addCriterion("scene_spec not like", value, "sceneSpec");
            return (Criteria) this;
        }

        public Criteria andSceneSpecIn(List<String> values) {
            addCriterion("scene_spec in", values, "sceneSpec");
            return (Criteria) this;
        }

        public Criteria andSceneSpecNotIn(List<String> values) {
            addCriterion("scene_spec not in", values, "sceneSpec");
            return (Criteria) this;
        }

        public Criteria andSceneSpecBetween(String value1, String value2) {
            addCriterion("scene_spec between", value1, value2, "sceneSpec");
            return (Criteria) this;
        }

        public Criteria andSceneSpecNotBetween(String value1, String value2) {
            addCriterion("scene_spec not between", value1, value2, "sceneSpec");
            return (Criteria) this;
        }

        public Criteria andSceneTypeIsNull() {
            addCriterion("scene_type is null");
            return (Criteria) this;
        }

        public Criteria andSceneTypeIsNotNull() {
            addCriterion("scene_type is not null");
            return (Criteria) this;
        }

        public Criteria andSceneTypeEqualTo(String value) {
            addCriterion("scene_type =", value, "sceneType");
            return (Criteria) this;
        }

        public Criteria andSceneTypeNotEqualTo(String value) {
            addCriterion("scene_type <>", value, "sceneType");
            return (Criteria) this;
        }

        public Criteria andSceneTypeGreaterThan(String value) {
            addCriterion("scene_type >", value, "sceneType");
            return (Criteria) this;
        }

        public Criteria andSceneTypeGreaterThanOrEqualTo(String value) {
            addCriterion("scene_type >=", value, "sceneType");
            return (Criteria) this;
        }

        public Criteria andSceneTypeLessThan(String value) {
            addCriterion("scene_type <", value, "sceneType");
            return (Criteria) this;
        }

        public Criteria andSceneTypeLessThanOrEqualTo(String value) {
            addCriterion("scene_type <=", value, "sceneType");
            return (Criteria) this;
        }

        public Criteria andSceneTypeLike(String value) {
            addCriterion("scene_type like", value, "sceneType");
            return (Criteria) this;
        }

        public Criteria andSceneTypeNotLike(String value) {
            addCriterion("scene_type not like", value, "sceneType");
            return (Criteria) this;
        }

        public Criteria andSceneTypeIn(List<String> values) {
            addCriterion("scene_type in", values, "sceneType");
            return (Criteria) this;
        }

        public Criteria andSceneTypeNotIn(List<String> values) {
            addCriterion("scene_type not in", values, "sceneType");
            return (Criteria) this;
        }

        public Criteria andSceneTypeBetween(String value1, String value2) {
            addCriterion("scene_type between", value1, value2, "sceneType");
            return (Criteria) this;
        }

        public Criteria andSceneTypeNotBetween(String value1, String value2) {
            addCriterion("scene_type not between", value1, value2, "sceneType");
            return (Criteria) this;
        }

        public Criteria andSceneCreateTimeIsNull() {
            addCriterion("scene_create_time is null");
            return (Criteria) this;
        }

        public Criteria andSceneCreateTimeIsNotNull() {
            addCriterion("scene_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andSceneCreateTimeEqualTo(String value) {
            addCriterion("scene_create_time =", value, "sceneCreateTime");
            return (Criteria) this;
        }

        public Criteria andSceneCreateTimeNotEqualTo(String value) {
            addCriterion("scene_create_time <>", value, "sceneCreateTime");
            return (Criteria) this;
        }

        public Criteria andSceneCreateTimeGreaterThan(String value) {
            addCriterion("scene_create_time >", value, "sceneCreateTime");
            return (Criteria) this;
        }

        public Criteria andSceneCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("scene_create_time >=", value, "sceneCreateTime");
            return (Criteria) this;
        }

        public Criteria andSceneCreateTimeLessThan(String value) {
            addCriterion("scene_create_time <", value, "sceneCreateTime");
            return (Criteria) this;
        }

        public Criteria andSceneCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("scene_create_time <=", value, "sceneCreateTime");
            return (Criteria) this;
        }

        public Criteria andSceneCreateTimeLike(String value) {
            addCriterion("scene_create_time like", value, "sceneCreateTime");
            return (Criteria) this;
        }

        public Criteria andSceneCreateTimeNotLike(String value) {
            addCriterion("scene_create_time not like", value, "sceneCreateTime");
            return (Criteria) this;
        }

        public Criteria andSceneCreateTimeIn(List<String> values) {
            addCriterion("scene_create_time in", values, "sceneCreateTime");
            return (Criteria) this;
        }

        public Criteria andSceneCreateTimeNotIn(List<String> values) {
            addCriterion("scene_create_time not in", values, "sceneCreateTime");
            return (Criteria) this;
        }

        public Criteria andSceneCreateTimeBetween(String value1, String value2) {
            addCriterion("scene_create_time between", value1, value2, "sceneCreateTime");
            return (Criteria) this;
        }

        public Criteria andSceneCreateTimeNotBetween(String value1, String value2) {
            addCriterion("scene_create_time not between", value1, value2, "sceneCreateTime");
            return (Criteria) this;
        }

        public Criteria andSceneCreaterIsNull() {
            addCriterion("scene_creater is null");
            return (Criteria) this;
        }

        public Criteria andSceneCreaterIsNotNull() {
            addCriterion("scene_creater is not null");
            return (Criteria) this;
        }

        public Criteria andSceneCreaterEqualTo(String value) {
            addCriterion("scene_creater =", value, "sceneCreater");
            return (Criteria) this;
        }

        public Criteria andSceneCreaterNotEqualTo(String value) {
            addCriterion("scene_creater <>", value, "sceneCreater");
            return (Criteria) this;
        }

        public Criteria andSceneCreaterGreaterThan(String value) {
            addCriterion("scene_creater >", value, "sceneCreater");
            return (Criteria) this;
        }

        public Criteria andSceneCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("scene_creater >=", value, "sceneCreater");
            return (Criteria) this;
        }

        public Criteria andSceneCreaterLessThan(String value) {
            addCriterion("scene_creater <", value, "sceneCreater");
            return (Criteria) this;
        }

        public Criteria andSceneCreaterLessThanOrEqualTo(String value) {
            addCriterion("scene_creater <=", value, "sceneCreater");
            return (Criteria) this;
        }

        public Criteria andSceneCreaterLike(String value) {
            addCriterion("scene_creater like", value, "sceneCreater");
            return (Criteria) this;
        }

        public Criteria andSceneCreaterNotLike(String value) {
            addCriterion("scene_creater not like", value, "sceneCreater");
            return (Criteria) this;
        }

        public Criteria andSceneCreaterIn(List<String> values) {
            addCriterion("scene_creater in", values, "sceneCreater");
            return (Criteria) this;
        }

        public Criteria andSceneCreaterNotIn(List<String> values) {
            addCriterion("scene_creater not in", values, "sceneCreater");
            return (Criteria) this;
        }

        public Criteria andSceneCreaterBetween(String value1, String value2) {
            addCriterion("scene_creater between", value1, value2, "sceneCreater");
            return (Criteria) this;
        }

        public Criteria andSceneCreaterNotBetween(String value1, String value2) {
            addCriterion("scene_creater not between", value1, value2, "sceneCreater");
            return (Criteria) this;
        }

        public Criteria andSceneModifiedTimeIsNull() {
            addCriterion("scene_modified_time is null");
            return (Criteria) this;
        }

        public Criteria andSceneModifiedTimeIsNotNull() {
            addCriterion("scene_modified_time is not null");
            return (Criteria) this;
        }

        public Criteria andSceneModifiedTimeEqualTo(String value) {
            addCriterion("scene_modified_time =", value, "sceneModifiedTime");
            return (Criteria) this;
        }

        public Criteria andSceneModifiedTimeNotEqualTo(String value) {
            addCriterion("scene_modified_time <>", value, "sceneModifiedTime");
            return (Criteria) this;
        }

        public Criteria andSceneModifiedTimeGreaterThan(String value) {
            addCriterion("scene_modified_time >", value, "sceneModifiedTime");
            return (Criteria) this;
        }

        public Criteria andSceneModifiedTimeGreaterThanOrEqualTo(String value) {
            addCriterion("scene_modified_time >=", value, "sceneModifiedTime");
            return (Criteria) this;
        }

        public Criteria andSceneModifiedTimeLessThan(String value) {
            addCriterion("scene_modified_time <", value, "sceneModifiedTime");
            return (Criteria) this;
        }

        public Criteria andSceneModifiedTimeLessThanOrEqualTo(String value) {
            addCriterion("scene_modified_time <=", value, "sceneModifiedTime");
            return (Criteria) this;
        }

        public Criteria andSceneModifiedTimeLike(String value) {
            addCriterion("scene_modified_time like", value, "sceneModifiedTime");
            return (Criteria) this;
        }

        public Criteria andSceneModifiedTimeNotLike(String value) {
            addCriterion("scene_modified_time not like", value, "sceneModifiedTime");
            return (Criteria) this;
        }

        public Criteria andSceneModifiedTimeIn(List<String> values) {
            addCriterion("scene_modified_time in", values, "sceneModifiedTime");
            return (Criteria) this;
        }

        public Criteria andSceneModifiedTimeNotIn(List<String> values) {
            addCriterion("scene_modified_time not in", values, "sceneModifiedTime");
            return (Criteria) this;
        }

        public Criteria andSceneModifiedTimeBetween(String value1, String value2) {
            addCriterion("scene_modified_time between", value1, value2, "sceneModifiedTime");
            return (Criteria) this;
        }

        public Criteria andSceneModifiedTimeNotBetween(String value1, String value2) {
            addCriterion("scene_modified_time not between", value1, value2, "sceneModifiedTime");
            return (Criteria) this;
        }

        public Criteria andSceneModifiedPersonIsNull() {
            addCriterion("scene_modified_person is null");
            return (Criteria) this;
        }

        public Criteria andSceneModifiedPersonIsNotNull() {
            addCriterion("scene_modified_person is not null");
            return (Criteria) this;
        }

        public Criteria andSceneModifiedPersonEqualTo(String value) {
            addCriterion("scene_modified_person =", value, "sceneModifiedPerson");
            return (Criteria) this;
        }

        public Criteria andSceneModifiedPersonNotEqualTo(String value) {
            addCriterion("scene_modified_person <>", value, "sceneModifiedPerson");
            return (Criteria) this;
        }

        public Criteria andSceneModifiedPersonGreaterThan(String value) {
            addCriterion("scene_modified_person >", value, "sceneModifiedPerson");
            return (Criteria) this;
        }

        public Criteria andSceneModifiedPersonGreaterThanOrEqualTo(String value) {
            addCriterion("scene_modified_person >=", value, "sceneModifiedPerson");
            return (Criteria) this;
        }

        public Criteria andSceneModifiedPersonLessThan(String value) {
            addCriterion("scene_modified_person <", value, "sceneModifiedPerson");
            return (Criteria) this;
        }

        public Criteria andSceneModifiedPersonLessThanOrEqualTo(String value) {
            addCriterion("scene_modified_person <=", value, "sceneModifiedPerson");
            return (Criteria) this;
        }

        public Criteria andSceneModifiedPersonLike(String value) {
            addCriterion("scene_modified_person like", value, "sceneModifiedPerson");
            return (Criteria) this;
        }

        public Criteria andSceneModifiedPersonNotLike(String value) {
            addCriterion("scene_modified_person not like", value, "sceneModifiedPerson");
            return (Criteria) this;
        }

        public Criteria andSceneModifiedPersonIn(List<String> values) {
            addCriterion("scene_modified_person in", values, "sceneModifiedPerson");
            return (Criteria) this;
        }

        public Criteria andSceneModifiedPersonNotIn(List<String> values) {
            addCriterion("scene_modified_person not in", values, "sceneModifiedPerson");
            return (Criteria) this;
        }

        public Criteria andSceneModifiedPersonBetween(String value1, String value2) {
            addCriterion("scene_modified_person between", value1, value2, "sceneModifiedPerson");
            return (Criteria) this;
        }

        public Criteria andSceneModifiedPersonNotBetween(String value1, String value2) {
            addCriterion("scene_modified_person not between", value1, value2, "sceneModifiedPerson");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Byte value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Byte value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Byte value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Byte value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Byte value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Byte value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Byte> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Byte> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Byte value1, Byte value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Byte value1, Byte value2) {
            addCriterion("version not between", value1, value2, "version");
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