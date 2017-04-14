package com.edp.dao.domain;

import java.util.ArrayList;
import java.util.List;

public class FunctionChangeHisPoCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FunctionChangeHisPoCriteria() {
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

        public Criteria andFuncIdIsNull() {
            addCriterion("func_id is null");
            return (Criteria) this;
        }

        public Criteria andFuncIdIsNotNull() {
            addCriterion("func_id is not null");
            return (Criteria) this;
        }

        public Criteria andFuncIdEqualTo(String value) {
            addCriterion("func_id =", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdNotEqualTo(String value) {
            addCriterion("func_id <>", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdGreaterThan(String value) {
            addCriterion("func_id >", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdGreaterThanOrEqualTo(String value) {
            addCriterion("func_id >=", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdLessThan(String value) {
            addCriterion("func_id <", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdLessThanOrEqualTo(String value) {
            addCriterion("func_id <=", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdLike(String value) {
            addCriterion("func_id like", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdNotLike(String value) {
            addCriterion("func_id not like", value, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdIn(List<String> values) {
            addCriterion("func_id in", values, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdNotIn(List<String> values) {
            addCriterion("func_id not in", values, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdBetween(String value1, String value2) {
            addCriterion("func_id between", value1, value2, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncIdNotBetween(String value1, String value2) {
            addCriterion("func_id not between", value1, value2, "funcId");
            return (Criteria) this;
        }

        public Criteria andFuncNameIsNull() {
            addCriterion("func_name is null");
            return (Criteria) this;
        }

        public Criteria andFuncNameIsNotNull() {
            addCriterion("func_name is not null");
            return (Criteria) this;
        }

        public Criteria andFuncNameEqualTo(String value) {
            addCriterion("func_name =", value, "funcName");
            return (Criteria) this;
        }

        public Criteria andFuncNameNotEqualTo(String value) {
            addCriterion("func_name <>", value, "funcName");
            return (Criteria) this;
        }

        public Criteria andFuncNameGreaterThan(String value) {
            addCriterion("func_name >", value, "funcName");
            return (Criteria) this;
        }

        public Criteria andFuncNameGreaterThanOrEqualTo(String value) {
            addCriterion("func_name >=", value, "funcName");
            return (Criteria) this;
        }

        public Criteria andFuncNameLessThan(String value) {
            addCriterion("func_name <", value, "funcName");
            return (Criteria) this;
        }

        public Criteria andFuncNameLessThanOrEqualTo(String value) {
            addCriterion("func_name <=", value, "funcName");
            return (Criteria) this;
        }

        public Criteria andFuncNameLike(String value) {
            addCriterion("func_name like", value, "funcName");
            return (Criteria) this;
        }

        public Criteria andFuncNameNotLike(String value) {
            addCriterion("func_name not like", value, "funcName");
            return (Criteria) this;
        }

        public Criteria andFuncNameIn(List<String> values) {
            addCriterion("func_name in", values, "funcName");
            return (Criteria) this;
        }

        public Criteria andFuncNameNotIn(List<String> values) {
            addCriterion("func_name not in", values, "funcName");
            return (Criteria) this;
        }

        public Criteria andFuncNameBetween(String value1, String value2) {
            addCriterion("func_name between", value1, value2, "funcName");
            return (Criteria) this;
        }

        public Criteria andFuncNameNotBetween(String value1, String value2) {
            addCriterion("func_name not between", value1, value2, "funcName");
            return (Criteria) this;
        }

        public Criteria andFuncEnNameIsNull() {
            addCriterion("func_en_name is null");
            return (Criteria) this;
        }

        public Criteria andFuncEnNameIsNotNull() {
            addCriterion("func_en_name is not null");
            return (Criteria) this;
        }

        public Criteria andFuncEnNameEqualTo(String value) {
            addCriterion("func_en_name =", value, "funcEnName");
            return (Criteria) this;
        }

        public Criteria andFuncEnNameNotEqualTo(String value) {
            addCriterion("func_en_name <>", value, "funcEnName");
            return (Criteria) this;
        }

        public Criteria andFuncEnNameGreaterThan(String value) {
            addCriterion("func_en_name >", value, "funcEnName");
            return (Criteria) this;
        }

        public Criteria andFuncEnNameGreaterThanOrEqualTo(String value) {
            addCriterion("func_en_name >=", value, "funcEnName");
            return (Criteria) this;
        }

        public Criteria andFuncEnNameLessThan(String value) {
            addCriterion("func_en_name <", value, "funcEnName");
            return (Criteria) this;
        }

        public Criteria andFuncEnNameLessThanOrEqualTo(String value) {
            addCriterion("func_en_name <=", value, "funcEnName");
            return (Criteria) this;
        }

        public Criteria andFuncEnNameLike(String value) {
            addCriterion("func_en_name like", value, "funcEnName");
            return (Criteria) this;
        }

        public Criteria andFuncEnNameNotLike(String value) {
            addCriterion("func_en_name not like", value, "funcEnName");
            return (Criteria) this;
        }

        public Criteria andFuncEnNameIn(List<String> values) {
            addCriterion("func_en_name in", values, "funcEnName");
            return (Criteria) this;
        }

        public Criteria andFuncEnNameNotIn(List<String> values) {
            addCriterion("func_en_name not in", values, "funcEnName");
            return (Criteria) this;
        }

        public Criteria andFuncEnNameBetween(String value1, String value2) {
            addCriterion("func_en_name between", value1, value2, "funcEnName");
            return (Criteria) this;
        }

        public Criteria andFuncEnNameNotBetween(String value1, String value2) {
            addCriterion("func_en_name not between", value1, value2, "funcEnName");
            return (Criteria) this;
        }

        public Criteria andFuncSpecIsNull() {
            addCriterion("func_spec is null");
            return (Criteria) this;
        }

        public Criteria andFuncSpecIsNotNull() {
            addCriterion("func_spec is not null");
            return (Criteria) this;
        }

        public Criteria andFuncSpecEqualTo(String value) {
            addCriterion("func_spec =", value, "funcSpec");
            return (Criteria) this;
        }

        public Criteria andFuncSpecNotEqualTo(String value) {
            addCriterion("func_spec <>", value, "funcSpec");
            return (Criteria) this;
        }

        public Criteria andFuncSpecGreaterThan(String value) {
            addCriterion("func_spec >", value, "funcSpec");
            return (Criteria) this;
        }

        public Criteria andFuncSpecGreaterThanOrEqualTo(String value) {
            addCriterion("func_spec >=", value, "funcSpec");
            return (Criteria) this;
        }

        public Criteria andFuncSpecLessThan(String value) {
            addCriterion("func_spec <", value, "funcSpec");
            return (Criteria) this;
        }

        public Criteria andFuncSpecLessThanOrEqualTo(String value) {
            addCriterion("func_spec <=", value, "funcSpec");
            return (Criteria) this;
        }

        public Criteria andFuncSpecLike(String value) {
            addCriterion("func_spec like", value, "funcSpec");
            return (Criteria) this;
        }

        public Criteria andFuncSpecNotLike(String value) {
            addCriterion("func_spec not like", value, "funcSpec");
            return (Criteria) this;
        }

        public Criteria andFuncSpecIn(List<String> values) {
            addCriterion("func_spec in", values, "funcSpec");
            return (Criteria) this;
        }

        public Criteria andFuncSpecNotIn(List<String> values) {
            addCriterion("func_spec not in", values, "funcSpec");
            return (Criteria) this;
        }

        public Criteria andFuncSpecBetween(String value1, String value2) {
            addCriterion("func_spec between", value1, value2, "funcSpec");
            return (Criteria) this;
        }

        public Criteria andFuncSpecNotBetween(String value1, String value2) {
            addCriterion("func_spec not between", value1, value2, "funcSpec");
            return (Criteria) this;
        }

        public Criteria andFuncCreateTimeIsNull() {
            addCriterion("func_create_time is null");
            return (Criteria) this;
        }

        public Criteria andFuncCreateTimeIsNotNull() {
            addCriterion("func_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andFuncCreateTimeEqualTo(String value) {
            addCriterion("func_create_time =", value, "funcCreateTime");
            return (Criteria) this;
        }

        public Criteria andFuncCreateTimeNotEqualTo(String value) {
            addCriterion("func_create_time <>", value, "funcCreateTime");
            return (Criteria) this;
        }

        public Criteria andFuncCreateTimeGreaterThan(String value) {
            addCriterion("func_create_time >", value, "funcCreateTime");
            return (Criteria) this;
        }

        public Criteria andFuncCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("func_create_time >=", value, "funcCreateTime");
            return (Criteria) this;
        }

        public Criteria andFuncCreateTimeLessThan(String value) {
            addCriterion("func_create_time <", value, "funcCreateTime");
            return (Criteria) this;
        }

        public Criteria andFuncCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("func_create_time <=", value, "funcCreateTime");
            return (Criteria) this;
        }

        public Criteria andFuncCreateTimeLike(String value) {
            addCriterion("func_create_time like", value, "funcCreateTime");
            return (Criteria) this;
        }

        public Criteria andFuncCreateTimeNotLike(String value) {
            addCriterion("func_create_time not like", value, "funcCreateTime");
            return (Criteria) this;
        }

        public Criteria andFuncCreateTimeIn(List<String> values) {
            addCriterion("func_create_time in", values, "funcCreateTime");
            return (Criteria) this;
        }

        public Criteria andFuncCreateTimeNotIn(List<String> values) {
            addCriterion("func_create_time not in", values, "funcCreateTime");
            return (Criteria) this;
        }

        public Criteria andFuncCreateTimeBetween(String value1, String value2) {
            addCriterion("func_create_time between", value1, value2, "funcCreateTime");
            return (Criteria) this;
        }

        public Criteria andFuncCreateTimeNotBetween(String value1, String value2) {
            addCriterion("func_create_time not between", value1, value2, "funcCreateTime");
            return (Criteria) this;
        }

        public Criteria andFuncCreaterIsNull() {
            addCriterion("func_creater is null");
            return (Criteria) this;
        }

        public Criteria andFuncCreaterIsNotNull() {
            addCriterion("func_creater is not null");
            return (Criteria) this;
        }

        public Criteria andFuncCreaterEqualTo(String value) {
            addCriterion("func_creater =", value, "funcCreater");
            return (Criteria) this;
        }

        public Criteria andFuncCreaterNotEqualTo(String value) {
            addCriterion("func_creater <>", value, "funcCreater");
            return (Criteria) this;
        }

        public Criteria andFuncCreaterGreaterThan(String value) {
            addCriterion("func_creater >", value, "funcCreater");
            return (Criteria) this;
        }

        public Criteria andFuncCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("func_creater >=", value, "funcCreater");
            return (Criteria) this;
        }

        public Criteria andFuncCreaterLessThan(String value) {
            addCriterion("func_creater <", value, "funcCreater");
            return (Criteria) this;
        }

        public Criteria andFuncCreaterLessThanOrEqualTo(String value) {
            addCriterion("func_creater <=", value, "funcCreater");
            return (Criteria) this;
        }

        public Criteria andFuncCreaterLike(String value) {
            addCriterion("func_creater like", value, "funcCreater");
            return (Criteria) this;
        }

        public Criteria andFuncCreaterNotLike(String value) {
            addCriterion("func_creater not like", value, "funcCreater");
            return (Criteria) this;
        }

        public Criteria andFuncCreaterIn(List<String> values) {
            addCriterion("func_creater in", values, "funcCreater");
            return (Criteria) this;
        }

        public Criteria andFuncCreaterNotIn(List<String> values) {
            addCriterion("func_creater not in", values, "funcCreater");
            return (Criteria) this;
        }

        public Criteria andFuncCreaterBetween(String value1, String value2) {
            addCriterion("func_creater between", value1, value2, "funcCreater");
            return (Criteria) this;
        }

        public Criteria andFuncCreaterNotBetween(String value1, String value2) {
            addCriterion("func_creater not between", value1, value2, "funcCreater");
            return (Criteria) this;
        }

        public Criteria andFuncModifiedTimeIsNull() {
            addCriterion("func_modified_time is null");
            return (Criteria) this;
        }

        public Criteria andFuncModifiedTimeIsNotNull() {
            addCriterion("func_modified_time is not null");
            return (Criteria) this;
        }

        public Criteria andFuncModifiedTimeEqualTo(String value) {
            addCriterion("func_modified_time =", value, "funcModifiedTime");
            return (Criteria) this;
        }

        public Criteria andFuncModifiedTimeNotEqualTo(String value) {
            addCriterion("func_modified_time <>", value, "funcModifiedTime");
            return (Criteria) this;
        }

        public Criteria andFuncModifiedTimeGreaterThan(String value) {
            addCriterion("func_modified_time >", value, "funcModifiedTime");
            return (Criteria) this;
        }

        public Criteria andFuncModifiedTimeGreaterThanOrEqualTo(String value) {
            addCriterion("func_modified_time >=", value, "funcModifiedTime");
            return (Criteria) this;
        }

        public Criteria andFuncModifiedTimeLessThan(String value) {
            addCriterion("func_modified_time <", value, "funcModifiedTime");
            return (Criteria) this;
        }

        public Criteria andFuncModifiedTimeLessThanOrEqualTo(String value) {
            addCriterion("func_modified_time <=", value, "funcModifiedTime");
            return (Criteria) this;
        }

        public Criteria andFuncModifiedTimeLike(String value) {
            addCriterion("func_modified_time like", value, "funcModifiedTime");
            return (Criteria) this;
        }

        public Criteria andFuncModifiedTimeNotLike(String value) {
            addCriterion("func_modified_time not like", value, "funcModifiedTime");
            return (Criteria) this;
        }

        public Criteria andFuncModifiedTimeIn(List<String> values) {
            addCriterion("func_modified_time in", values, "funcModifiedTime");
            return (Criteria) this;
        }

        public Criteria andFuncModifiedTimeNotIn(List<String> values) {
            addCriterion("func_modified_time not in", values, "funcModifiedTime");
            return (Criteria) this;
        }

        public Criteria andFuncModifiedTimeBetween(String value1, String value2) {
            addCriterion("func_modified_time between", value1, value2, "funcModifiedTime");
            return (Criteria) this;
        }

        public Criteria andFuncModifiedTimeNotBetween(String value1, String value2) {
            addCriterion("func_modified_time not between", value1, value2, "funcModifiedTime");
            return (Criteria) this;
        }

        public Criteria andFuncModifiedPersonIsNull() {
            addCriterion("func_modified_person is null");
            return (Criteria) this;
        }

        public Criteria andFuncModifiedPersonIsNotNull() {
            addCriterion("func_modified_person is not null");
            return (Criteria) this;
        }

        public Criteria andFuncModifiedPersonEqualTo(String value) {
            addCriterion("func_modified_person =", value, "funcModifiedPerson");
            return (Criteria) this;
        }

        public Criteria andFuncModifiedPersonNotEqualTo(String value) {
            addCriterion("func_modified_person <>", value, "funcModifiedPerson");
            return (Criteria) this;
        }

        public Criteria andFuncModifiedPersonGreaterThan(String value) {
            addCriterion("func_modified_person >", value, "funcModifiedPerson");
            return (Criteria) this;
        }

        public Criteria andFuncModifiedPersonGreaterThanOrEqualTo(String value) {
            addCriterion("func_modified_person >=", value, "funcModifiedPerson");
            return (Criteria) this;
        }

        public Criteria andFuncModifiedPersonLessThan(String value) {
            addCriterion("func_modified_person <", value, "funcModifiedPerson");
            return (Criteria) this;
        }

        public Criteria andFuncModifiedPersonLessThanOrEqualTo(String value) {
            addCriterion("func_modified_person <=", value, "funcModifiedPerson");
            return (Criteria) this;
        }

        public Criteria andFuncModifiedPersonLike(String value) {
            addCriterion("func_modified_person like", value, "funcModifiedPerson");
            return (Criteria) this;
        }

        public Criteria andFuncModifiedPersonNotLike(String value) {
            addCriterion("func_modified_person not like", value, "funcModifiedPerson");
            return (Criteria) this;
        }

        public Criteria andFuncModifiedPersonIn(List<String> values) {
            addCriterion("func_modified_person in", values, "funcModifiedPerson");
            return (Criteria) this;
        }

        public Criteria andFuncModifiedPersonNotIn(List<String> values) {
            addCriterion("func_modified_person not in", values, "funcModifiedPerson");
            return (Criteria) this;
        }

        public Criteria andFuncModifiedPersonBetween(String value1, String value2) {
            addCriterion("func_modified_person between", value1, value2, "funcModifiedPerson");
            return (Criteria) this;
        }

        public Criteria andFuncModifiedPersonNotBetween(String value1, String value2) {
            addCriterion("func_modified_person not between", value1, value2, "funcModifiedPerson");
            return (Criteria) this;
        }

        public Criteria andFuncPicIsNull() {
            addCriterion("func_pic is null");
            return (Criteria) this;
        }

        public Criteria andFuncPicIsNotNull() {
            addCriterion("func_pic is not null");
            return (Criteria) this;
        }

        public Criteria andFuncPicEqualTo(String value) {
            addCriterion("func_pic =", value, "funcPic");
            return (Criteria) this;
        }

        public Criteria andFuncPicNotEqualTo(String value) {
            addCriterion("func_pic <>", value, "funcPic");
            return (Criteria) this;
        }

        public Criteria andFuncPicGreaterThan(String value) {
            addCriterion("func_pic >", value, "funcPic");
            return (Criteria) this;
        }

        public Criteria andFuncPicGreaterThanOrEqualTo(String value) {
            addCriterion("func_pic >=", value, "funcPic");
            return (Criteria) this;
        }

        public Criteria andFuncPicLessThan(String value) {
            addCriterion("func_pic <", value, "funcPic");
            return (Criteria) this;
        }

        public Criteria andFuncPicLessThanOrEqualTo(String value) {
            addCriterion("func_pic <=", value, "funcPic");
            return (Criteria) this;
        }

        public Criteria andFuncPicLike(String value) {
            addCriterion("func_pic like", value, "funcPic");
            return (Criteria) this;
        }

        public Criteria andFuncPicNotLike(String value) {
            addCriterion("func_pic not like", value, "funcPic");
            return (Criteria) this;
        }

        public Criteria andFuncPicIn(List<String> values) {
            addCriterion("func_pic in", values, "funcPic");
            return (Criteria) this;
        }

        public Criteria andFuncPicNotIn(List<String> values) {
            addCriterion("func_pic not in", values, "funcPic");
            return (Criteria) this;
        }

        public Criteria andFuncPicBetween(String value1, String value2) {
            addCriterion("func_pic between", value1, value2, "funcPic");
            return (Criteria) this;
        }

        public Criteria andFuncPicNotBetween(String value1, String value2) {
            addCriterion("func_pic not between", value1, value2, "funcPic");
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