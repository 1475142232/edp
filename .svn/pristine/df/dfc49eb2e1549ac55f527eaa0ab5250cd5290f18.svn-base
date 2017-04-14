package com.edp.dao.domain;

import java.util.ArrayList;
import java.util.List;

public class ProblemInfoPoCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProblemInfoPoCriteria() {
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

        public Criteria andProblemNameIsNull() {
            addCriterion("problem_name is null");
            return (Criteria) this;
        }

        public Criteria andProblemNameIsNotNull() {
            addCriterion("problem_name is not null");
            return (Criteria) this;
        }

        public Criteria andProblemNameEqualTo(String value) {
            addCriterion("problem_name =", value, "problemName");
            return (Criteria) this;
        }

        public Criteria andProblemNameNotEqualTo(String value) {
            addCriterion("problem_name <>", value, "problemName");
            return (Criteria) this;
        }

        public Criteria andProblemNameGreaterThan(String value) {
            addCriterion("problem_name >", value, "problemName");
            return (Criteria) this;
        }

        public Criteria andProblemNameGreaterThanOrEqualTo(String value) {
            addCriterion("problem_name >=", value, "problemName");
            return (Criteria) this;
        }

        public Criteria andProblemNameLessThan(String value) {
            addCriterion("problem_name <", value, "problemName");
            return (Criteria) this;
        }

        public Criteria andProblemNameLessThanOrEqualTo(String value) {
            addCriterion("problem_name <=", value, "problemName");
            return (Criteria) this;
        }

        public Criteria andProblemNameLike(String value) {
            addCriterion("problem_name like", value, "problemName");
            return (Criteria) this;
        }

        public Criteria andProblemNameNotLike(String value) {
            addCriterion("problem_name not like", value, "problemName");
            return (Criteria) this;
        }

        public Criteria andProblemNameIn(List<String> values) {
            addCriterion("problem_name in", values, "problemName");
            return (Criteria) this;
        }

        public Criteria andProblemNameNotIn(List<String> values) {
            addCriterion("problem_name not in", values, "problemName");
            return (Criteria) this;
        }

        public Criteria andProblemNameBetween(String value1, String value2) {
            addCriterion("problem_name between", value1, value2, "problemName");
            return (Criteria) this;
        }

        public Criteria andProblemNameNotBetween(String value1, String value2) {
            addCriterion("problem_name not between", value1, value2, "problemName");
            return (Criteria) this;
        }

        public Criteria andProblemTypeIsNull() {
            addCriterion("problem_type is null");
            return (Criteria) this;
        }

        public Criteria andProblemTypeIsNotNull() {
            addCriterion("problem_type is not null");
            return (Criteria) this;
        }

        public Criteria andProblemTypeEqualTo(String value) {
            addCriterion("problem_type =", value, "problemType");
            return (Criteria) this;
        }

        public Criteria andProblemTypeNotEqualTo(String value) {
            addCriterion("problem_type <>", value, "problemType");
            return (Criteria) this;
        }

        public Criteria andProblemTypeGreaterThan(String value) {
            addCriterion("problem_type >", value, "problemType");
            return (Criteria) this;
        }

        public Criteria andProblemTypeGreaterThanOrEqualTo(String value) {
            addCriterion("problem_type >=", value, "problemType");
            return (Criteria) this;
        }

        public Criteria andProblemTypeLessThan(String value) {
            addCriterion("problem_type <", value, "problemType");
            return (Criteria) this;
        }

        public Criteria andProblemTypeLessThanOrEqualTo(String value) {
            addCriterion("problem_type <=", value, "problemType");
            return (Criteria) this;
        }

        public Criteria andProblemTypeLike(String value) {
            addCriterion("problem_type like", value, "problemType");
            return (Criteria) this;
        }

        public Criteria andProblemTypeNotLike(String value) {
            addCriterion("problem_type not like", value, "problemType");
            return (Criteria) this;
        }

        public Criteria andProblemTypeIn(List<String> values) {
            addCriterion("problem_type in", values, "problemType");
            return (Criteria) this;
        }

        public Criteria andProblemTypeNotIn(List<String> values) {
            addCriterion("problem_type not in", values, "problemType");
            return (Criteria) this;
        }

        public Criteria andProblemTypeBetween(String value1, String value2) {
            addCriterion("problem_type between", value1, value2, "problemType");
            return (Criteria) this;
        }

        public Criteria andProblemTypeNotBetween(String value1, String value2) {
            addCriterion("problem_type not between", value1, value2, "problemType");
            return (Criteria) this;
        }

        public Criteria andProblemLvIsNull() {
            addCriterion("problem_lv is null");
            return (Criteria) this;
        }

        public Criteria andProblemLvIsNotNull() {
            addCriterion("problem_lv is not null");
            return (Criteria) this;
        }

        public Criteria andProblemLvEqualTo(String value) {
            addCriterion("problem_lv =", value, "problemLv");
            return (Criteria) this;
        }

        public Criteria andProblemLvNotEqualTo(String value) {
            addCriterion("problem_lv <>", value, "problemLv");
            return (Criteria) this;
        }

        public Criteria andProblemLvGreaterThan(String value) {
            addCriterion("problem_lv >", value, "problemLv");
            return (Criteria) this;
        }

        public Criteria andProblemLvGreaterThanOrEqualTo(String value) {
            addCriterion("problem_lv >=", value, "problemLv");
            return (Criteria) this;
        }

        public Criteria andProblemLvLessThan(String value) {
            addCriterion("problem_lv <", value, "problemLv");
            return (Criteria) this;
        }

        public Criteria andProblemLvLessThanOrEqualTo(String value) {
            addCriterion("problem_lv <=", value, "problemLv");
            return (Criteria) this;
        }

        public Criteria andProblemLvLike(String value) {
            addCriterion("problem_lv like", value, "problemLv");
            return (Criteria) this;
        }

        public Criteria andProblemLvNotLike(String value) {
            addCriterion("problem_lv not like", value, "problemLv");
            return (Criteria) this;
        }

        public Criteria andProblemLvIn(List<String> values) {
            addCriterion("problem_lv in", values, "problemLv");
            return (Criteria) this;
        }

        public Criteria andProblemLvNotIn(List<String> values) {
            addCriterion("problem_lv not in", values, "problemLv");
            return (Criteria) this;
        }

        public Criteria andProblemLvBetween(String value1, String value2) {
            addCriterion("problem_lv between", value1, value2, "problemLv");
            return (Criteria) this;
        }

        public Criteria andProblemLvNotBetween(String value1, String value2) {
            addCriterion("problem_lv not between", value1, value2, "problemLv");
            return (Criteria) this;
        }

        public Criteria andProblemStarteUserIsNull() {
            addCriterion("problem_starte_user is null");
            return (Criteria) this;
        }

        public Criteria andProblemStarteUserIsNotNull() {
            addCriterion("problem_starte_user is not null");
            return (Criteria) this;
        }

        public Criteria andProblemStarteUserEqualTo(Integer value) {
            addCriterion("problem_starte_user =", value, "problemStarteUser");
            return (Criteria) this;
        }

        public Criteria andProblemStarteUserNotEqualTo(Integer value) {
            addCriterion("problem_starte_user <>", value, "problemStarteUser");
            return (Criteria) this;
        }

        public Criteria andProblemStarteUserGreaterThan(Integer value) {
            addCriterion("problem_starte_user >", value, "problemStarteUser");
            return (Criteria) this;
        }

        public Criteria andProblemStarteUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("problem_starte_user >=", value, "problemStarteUser");
            return (Criteria) this;
        }

        public Criteria andProblemStarteUserLessThan(Integer value) {
            addCriterion("problem_starte_user <", value, "problemStarteUser");
            return (Criteria) this;
        }

        public Criteria andProblemStarteUserLessThanOrEqualTo(Integer value) {
            addCriterion("problem_starte_user <=", value, "problemStarteUser");
            return (Criteria) this;
        }

        public Criteria andProblemStarteUserIn(List<Integer> values) {
            addCriterion("problem_starte_user in", values, "problemStarteUser");
            return (Criteria) this;
        }

        public Criteria andProblemStarteUserNotIn(List<Integer> values) {
            addCriterion("problem_starte_user not in", values, "problemStarteUser");
            return (Criteria) this;
        }

        public Criteria andProblemStarteUserBetween(Integer value1, Integer value2) {
            addCriterion("problem_starte_user between", value1, value2, "problemStarteUser");
            return (Criteria) this;
        }

        public Criteria andProblemStarteUserNotBetween(Integer value1, Integer value2) {
            addCriterion("problem_starte_user not between", value1, value2, "problemStarteUser");
            return (Criteria) this;
        }

        public Criteria andProblemStarteTimeIsNull() {
            addCriterion("problem_starte_time is null");
            return (Criteria) this;
        }

        public Criteria andProblemStarteTimeIsNotNull() {
            addCriterion("problem_starte_time is not null");
            return (Criteria) this;
        }

        public Criteria andProblemStarteTimeEqualTo(String value) {
            addCriterion("problem_starte_time =", value, "problemStarteTime");
            return (Criteria) this;
        }

        public Criteria andProblemStarteTimeNotEqualTo(String value) {
            addCriterion("problem_starte_time <>", value, "problemStarteTime");
            return (Criteria) this;
        }

        public Criteria andProblemStarteTimeGreaterThan(String value) {
            addCriterion("problem_starte_time >", value, "problemStarteTime");
            return (Criteria) this;
        }

        public Criteria andProblemStarteTimeGreaterThanOrEqualTo(String value) {
            addCriterion("problem_starte_time >=", value, "problemStarteTime");
            return (Criteria) this;
        }

        public Criteria andProblemStarteTimeLessThan(String value) {
            addCriterion("problem_starte_time <", value, "problemStarteTime");
            return (Criteria) this;
        }

        public Criteria andProblemStarteTimeLessThanOrEqualTo(String value) {
            addCriterion("problem_starte_time <=", value, "problemStarteTime");
            return (Criteria) this;
        }

        public Criteria andProblemStarteTimeLike(String value) {
            addCriterion("problem_starte_time like", value, "problemStarteTime");
            return (Criteria) this;
        }

        public Criteria andProblemStarteTimeNotLike(String value) {
            addCriterion("problem_starte_time not like", value, "problemStarteTime");
            return (Criteria) this;
        }

        public Criteria andProblemStarteTimeIn(List<String> values) {
            addCriterion("problem_starte_time in", values, "problemStarteTime");
            return (Criteria) this;
        }

        public Criteria andProblemStarteTimeNotIn(List<String> values) {
            addCriterion("problem_starte_time not in", values, "problemStarteTime");
            return (Criteria) this;
        }

        public Criteria andProblemStarteTimeBetween(String value1, String value2) {
            addCriterion("problem_starte_time between", value1, value2, "problemStarteTime");
            return (Criteria) this;
        }

        public Criteria andProblemStarteTimeNotBetween(String value1, String value2) {
            addCriterion("problem_starte_time not between", value1, value2, "problemStarteTime");
            return (Criteria) this;
        }

        public Criteria andProblemStarteNameIsNull() {
            addCriterion("problem_starte_name is null");
            return (Criteria) this;
        }

        public Criteria andProblemStarteNameIsNotNull() {
            addCriterion("problem_starte_name is not null");
            return (Criteria) this;
        }

        public Criteria andProblemStarteNameEqualTo(String value) {
            addCriterion("problem_starte_name =", value, "problemStarteName");
            return (Criteria) this;
        }

        public Criteria andProblemStarteNameNotEqualTo(String value) {
            addCriterion("problem_starte_name <>", value, "problemStarteName");
            return (Criteria) this;
        }

        public Criteria andProblemStarteNameGreaterThan(String value) {
            addCriterion("problem_starte_name >", value, "problemStarteName");
            return (Criteria) this;
        }

        public Criteria andProblemStarteNameGreaterThanOrEqualTo(String value) {
            addCriterion("problem_starte_name >=", value, "problemStarteName");
            return (Criteria) this;
        }

        public Criteria andProblemStarteNameLessThan(String value) {
            addCriterion("problem_starte_name <", value, "problemStarteName");
            return (Criteria) this;
        }

        public Criteria andProblemStarteNameLessThanOrEqualTo(String value) {
            addCriterion("problem_starte_name <=", value, "problemStarteName");
            return (Criteria) this;
        }

        public Criteria andProblemStarteNameLike(String value) {
            addCriterion("problem_starte_name like", value, "problemStarteName");
            return (Criteria) this;
        }

        public Criteria andProblemStarteNameNotLike(String value) {
            addCriterion("problem_starte_name not like", value, "problemStarteName");
            return (Criteria) this;
        }

        public Criteria andProblemStarteNameIn(List<String> values) {
            addCriterion("problem_starte_name in", values, "problemStarteName");
            return (Criteria) this;
        }

        public Criteria andProblemStarteNameNotIn(List<String> values) {
            addCriterion("problem_starte_name not in", values, "problemStarteName");
            return (Criteria) this;
        }

        public Criteria andProblemStarteNameBetween(String value1, String value2) {
            addCriterion("problem_starte_name between", value1, value2, "problemStarteName");
            return (Criteria) this;
        }

        public Criteria andProblemStarteNameNotBetween(String value1, String value2) {
            addCriterion("problem_starte_name not between", value1, value2, "problemStarteName");
            return (Criteria) this;
        }

        public Criteria andProblemEndUserIsNull() {
            addCriterion("problem_end_user is null");
            return (Criteria) this;
        }

        public Criteria andProblemEndUserIsNotNull() {
            addCriterion("problem_end_user is not null");
            return (Criteria) this;
        }

        public Criteria andProblemEndUserEqualTo(Integer value) {
            addCriterion("problem_end_user =", value, "problemEndUser");
            return (Criteria) this;
        }

        public Criteria andProblemEndUserNotEqualTo(Integer value) {
            addCriterion("problem_end_user <>", value, "problemEndUser");
            return (Criteria) this;
        }

        public Criteria andProblemEndUserGreaterThan(Integer value) {
            addCriterion("problem_end_user >", value, "problemEndUser");
            return (Criteria) this;
        }

        public Criteria andProblemEndUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("problem_end_user >=", value, "problemEndUser");
            return (Criteria) this;
        }

        public Criteria andProblemEndUserLessThan(Integer value) {
            addCriterion("problem_end_user <", value, "problemEndUser");
            return (Criteria) this;
        }

        public Criteria andProblemEndUserLessThanOrEqualTo(Integer value) {
            addCriterion("problem_end_user <=", value, "problemEndUser");
            return (Criteria) this;
        }

        public Criteria andProblemEndUserIn(List<Integer> values) {
            addCriterion("problem_end_user in", values, "problemEndUser");
            return (Criteria) this;
        }

        public Criteria andProblemEndUserNotIn(List<Integer> values) {
            addCriterion("problem_end_user not in", values, "problemEndUser");
            return (Criteria) this;
        }

        public Criteria andProblemEndUserBetween(Integer value1, Integer value2) {
            addCriterion("problem_end_user between", value1, value2, "problemEndUser");
            return (Criteria) this;
        }

        public Criteria andProblemEndUserNotBetween(Integer value1, Integer value2) {
            addCriterion("problem_end_user not between", value1, value2, "problemEndUser");
            return (Criteria) this;
        }

        public Criteria andProblemEndTimeIsNull() {
            addCriterion("problem_end_time is null");
            return (Criteria) this;
        }

        public Criteria andProblemEndTimeIsNotNull() {
            addCriterion("problem_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andProblemEndTimeEqualTo(String value) {
            addCriterion("problem_end_time =", value, "problemEndTime");
            return (Criteria) this;
        }

        public Criteria andProblemEndTimeNotEqualTo(String value) {
            addCriterion("problem_end_time <>", value, "problemEndTime");
            return (Criteria) this;
        }

        public Criteria andProblemEndTimeGreaterThan(String value) {
            addCriterion("problem_end_time >", value, "problemEndTime");
            return (Criteria) this;
        }

        public Criteria andProblemEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("problem_end_time >=", value, "problemEndTime");
            return (Criteria) this;
        }

        public Criteria andProblemEndTimeLessThan(String value) {
            addCriterion("problem_end_time <", value, "problemEndTime");
            return (Criteria) this;
        }

        public Criteria andProblemEndTimeLessThanOrEqualTo(String value) {
            addCriterion("problem_end_time <=", value, "problemEndTime");
            return (Criteria) this;
        }

        public Criteria andProblemEndTimeLike(String value) {
            addCriterion("problem_end_time like", value, "problemEndTime");
            return (Criteria) this;
        }

        public Criteria andProblemEndTimeNotLike(String value) {
            addCriterion("problem_end_time not like", value, "problemEndTime");
            return (Criteria) this;
        }

        public Criteria andProblemEndTimeIn(List<String> values) {
            addCriterion("problem_end_time in", values, "problemEndTime");
            return (Criteria) this;
        }

        public Criteria andProblemEndTimeNotIn(List<String> values) {
            addCriterion("problem_end_time not in", values, "problemEndTime");
            return (Criteria) this;
        }

        public Criteria andProblemEndTimeBetween(String value1, String value2) {
            addCriterion("problem_end_time between", value1, value2, "problemEndTime");
            return (Criteria) this;
        }

        public Criteria andProblemEndTimeNotBetween(String value1, String value2) {
            addCriterion("problem_end_time not between", value1, value2, "problemEndTime");
            return (Criteria) this;
        }

        public Criteria andProblemEndNameIsNull() {
            addCriterion("problem_end_name is null");
            return (Criteria) this;
        }

        public Criteria andProblemEndNameIsNotNull() {
            addCriterion("problem_end_name is not null");
            return (Criteria) this;
        }

        public Criteria andProblemEndNameEqualTo(String value) {
            addCriterion("problem_end_name =", value, "problemEndName");
            return (Criteria) this;
        }

        public Criteria andProblemEndNameNotEqualTo(String value) {
            addCriterion("problem_end_name <>", value, "problemEndName");
            return (Criteria) this;
        }

        public Criteria andProblemEndNameGreaterThan(String value) {
            addCriterion("problem_end_name >", value, "problemEndName");
            return (Criteria) this;
        }

        public Criteria andProblemEndNameGreaterThanOrEqualTo(String value) {
            addCriterion("problem_end_name >=", value, "problemEndName");
            return (Criteria) this;
        }

        public Criteria andProblemEndNameLessThan(String value) {
            addCriterion("problem_end_name <", value, "problemEndName");
            return (Criteria) this;
        }

        public Criteria andProblemEndNameLessThanOrEqualTo(String value) {
            addCriterion("problem_end_name <=", value, "problemEndName");
            return (Criteria) this;
        }

        public Criteria andProblemEndNameLike(String value) {
            addCriterion("problem_end_name like", value, "problemEndName");
            return (Criteria) this;
        }

        public Criteria andProblemEndNameNotLike(String value) {
            addCriterion("problem_end_name not like", value, "problemEndName");
            return (Criteria) this;
        }

        public Criteria andProblemEndNameIn(List<String> values) {
            addCriterion("problem_end_name in", values, "problemEndName");
            return (Criteria) this;
        }

        public Criteria andProblemEndNameNotIn(List<String> values) {
            addCriterion("problem_end_name not in", values, "problemEndName");
            return (Criteria) this;
        }

        public Criteria andProblemEndNameBetween(String value1, String value2) {
            addCriterion("problem_end_name between", value1, value2, "problemEndName");
            return (Criteria) this;
        }

        public Criteria andProblemEndNameNotBetween(String value1, String value2) {
            addCriterion("problem_end_name not between", value1, value2, "problemEndName");
            return (Criteria) this;
        }

        public Criteria andProblemStateIsNull() {
            addCriterion("problem_state is null");
            return (Criteria) this;
        }

        public Criteria andProblemStateIsNotNull() {
            addCriterion("problem_state is not null");
            return (Criteria) this;
        }

        public Criteria andProblemStateEqualTo(String value) {
            addCriterion("problem_state =", value, "problemState");
            return (Criteria) this;
        }

        public Criteria andProblemStateNotEqualTo(String value) {
            addCriterion("problem_state <>", value, "problemState");
            return (Criteria) this;
        }

        public Criteria andProblemStateGreaterThan(String value) {
            addCriterion("problem_state >", value, "problemState");
            return (Criteria) this;
        }

        public Criteria andProblemStateGreaterThanOrEqualTo(String value) {
            addCriterion("problem_state >=", value, "problemState");
            return (Criteria) this;
        }

        public Criteria andProblemStateLessThan(String value) {
            addCriterion("problem_state <", value, "problemState");
            return (Criteria) this;
        }

        public Criteria andProblemStateLessThanOrEqualTo(String value) {
            addCriterion("problem_state <=", value, "problemState");
            return (Criteria) this;
        }

        public Criteria andProblemStateLike(String value) {
            addCriterion("problem_state like", value, "problemState");
            return (Criteria) this;
        }

        public Criteria andProblemStateNotLike(String value) {
            addCriterion("problem_state not like", value, "problemState");
            return (Criteria) this;
        }

        public Criteria andProblemStateIn(List<String> values) {
            addCriterion("problem_state in", values, "problemState");
            return (Criteria) this;
        }

        public Criteria andProblemStateNotIn(List<String> values) {
            addCriterion("problem_state not in", values, "problemState");
            return (Criteria) this;
        }

        public Criteria andProblemStateBetween(String value1, String value2) {
            addCriterion("problem_state between", value1, value2, "problemState");
            return (Criteria) this;
        }

        public Criteria andProblemStateNotBetween(String value1, String value2) {
            addCriterion("problem_state not between", value1, value2, "problemState");
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