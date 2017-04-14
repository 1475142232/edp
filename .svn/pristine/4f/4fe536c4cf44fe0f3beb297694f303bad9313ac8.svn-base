package com.edp.dao.domain;

import java.util.ArrayList;
import java.util.List;

public class TeamInfoPoCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeamInfoPoCriteria() {
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

        public Criteria andTeamNameIsNull() {
            addCriterion("team_name is null");
            return (Criteria) this;
        }

        public Criteria andTeamNameIsNotNull() {
            addCriterion("team_name is not null");
            return (Criteria) this;
        }

        public Criteria andTeamNameEqualTo(String value) {
            addCriterion("team_name =", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotEqualTo(String value) {
            addCriterion("team_name <>", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameGreaterThan(String value) {
            addCriterion("team_name >", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameGreaterThanOrEqualTo(String value) {
            addCriterion("team_name >=", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameLessThan(String value) {
            addCriterion("team_name <", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameLessThanOrEqualTo(String value) {
            addCriterion("team_name <=", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameLike(String value) {
            addCriterion("team_name like", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotLike(String value) {
            addCriterion("team_name not like", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameIn(List<String> values) {
            addCriterion("team_name in", values, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotIn(List<String> values) {
            addCriterion("team_name not in", values, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameBetween(String value1, String value2) {
            addCriterion("team_name between", value1, value2, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotBetween(String value1, String value2) {
            addCriterion("team_name not between", value1, value2, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamCreatIsNull() {
            addCriterion("team_creat is null");
            return (Criteria) this;
        }

        public Criteria andTeamCreatIsNotNull() {
            addCriterion("team_creat is not null");
            return (Criteria) this;
        }

        public Criteria andTeamCreatEqualTo(String value) {
            addCriterion("team_creat =", value, "teamCreat");
            return (Criteria) this;
        }

        public Criteria andTeamCreatNotEqualTo(String value) {
            addCriterion("team_creat <>", value, "teamCreat");
            return (Criteria) this;
        }

        public Criteria andTeamCreatGreaterThan(String value) {
            addCriterion("team_creat >", value, "teamCreat");
            return (Criteria) this;
        }

        public Criteria andTeamCreatGreaterThanOrEqualTo(String value) {
            addCriterion("team_creat >=", value, "teamCreat");
            return (Criteria) this;
        }

        public Criteria andTeamCreatLessThan(String value) {
            addCriterion("team_creat <", value, "teamCreat");
            return (Criteria) this;
        }

        public Criteria andTeamCreatLessThanOrEqualTo(String value) {
            addCriterion("team_creat <=", value, "teamCreat");
            return (Criteria) this;
        }

        public Criteria andTeamCreatLike(String value) {
            addCriterion("team_creat like", value, "teamCreat");
            return (Criteria) this;
        }

        public Criteria andTeamCreatNotLike(String value) {
            addCriterion("team_creat not like", value, "teamCreat");
            return (Criteria) this;
        }

        public Criteria andTeamCreatIn(List<String> values) {
            addCriterion("team_creat in", values, "teamCreat");
            return (Criteria) this;
        }

        public Criteria andTeamCreatNotIn(List<String> values) {
            addCriterion("team_creat not in", values, "teamCreat");
            return (Criteria) this;
        }

        public Criteria andTeamCreatBetween(String value1, String value2) {
            addCriterion("team_creat between", value1, value2, "teamCreat");
            return (Criteria) this;
        }

        public Criteria andTeamCreatNotBetween(String value1, String value2) {
            addCriterion("team_creat not between", value1, value2, "teamCreat");
            return (Criteria) this;
        }

        public Criteria andTeamCreattimeIsNull() {
            addCriterion("team_creattime is null");
            return (Criteria) this;
        }

        public Criteria andTeamCreattimeIsNotNull() {
            addCriterion("team_creattime is not null");
            return (Criteria) this;
        }

        public Criteria andTeamCreattimeEqualTo(String value) {
            addCriterion("team_creattime =", value, "teamCreattime");
            return (Criteria) this;
        }

        public Criteria andTeamCreattimeNotEqualTo(String value) {
            addCriterion("team_creattime <>", value, "teamCreattime");
            return (Criteria) this;
        }

        public Criteria andTeamCreattimeGreaterThan(String value) {
            addCriterion("team_creattime >", value, "teamCreattime");
            return (Criteria) this;
        }

        public Criteria andTeamCreattimeGreaterThanOrEqualTo(String value) {
            addCriterion("team_creattime >=", value, "teamCreattime");
            return (Criteria) this;
        }

        public Criteria andTeamCreattimeLessThan(String value) {
            addCriterion("team_creattime <", value, "teamCreattime");
            return (Criteria) this;
        }

        public Criteria andTeamCreattimeLessThanOrEqualTo(String value) {
            addCriterion("team_creattime <=", value, "teamCreattime");
            return (Criteria) this;
        }

        public Criteria andTeamCreattimeLike(String value) {
            addCriterion("team_creattime like", value, "teamCreattime");
            return (Criteria) this;
        }

        public Criteria andTeamCreattimeNotLike(String value) {
            addCriterion("team_creattime not like", value, "teamCreattime");
            return (Criteria) this;
        }

        public Criteria andTeamCreattimeIn(List<String> values) {
            addCriterion("team_creattime in", values, "teamCreattime");
            return (Criteria) this;
        }

        public Criteria andTeamCreattimeNotIn(List<String> values) {
            addCriterion("team_creattime not in", values, "teamCreattime");
            return (Criteria) this;
        }

        public Criteria andTeamCreattimeBetween(String value1, String value2) {
            addCriterion("team_creattime between", value1, value2, "teamCreattime");
            return (Criteria) this;
        }

        public Criteria andTeamCreattimeNotBetween(String value1, String value2) {
            addCriterion("team_creattime not between", value1, value2, "teamCreattime");
            return (Criteria) this;
        }

        public Criteria andR3IsNull() {
            addCriterion("r3 is null");
            return (Criteria) this;
        }

        public Criteria andR3IsNotNull() {
            addCriterion("r3 is not null");
            return (Criteria) this;
        }

        public Criteria andR3EqualTo(String value) {
            addCriterion("r3 =", value, "r3");
            return (Criteria) this;
        }

        public Criteria andR3NotEqualTo(String value) {
            addCriterion("r3 <>", value, "r3");
            return (Criteria) this;
        }

        public Criteria andR3GreaterThan(String value) {
            addCriterion("r3 >", value, "r3");
            return (Criteria) this;
        }

        public Criteria andR3GreaterThanOrEqualTo(String value) {
            addCriterion("r3 >=", value, "r3");
            return (Criteria) this;
        }

        public Criteria andR3LessThan(String value) {
            addCriterion("r3 <", value, "r3");
            return (Criteria) this;
        }

        public Criteria andR3LessThanOrEqualTo(String value) {
            addCriterion("r3 <=", value, "r3");
            return (Criteria) this;
        }

        public Criteria andR3Like(String value) {
            addCriterion("r3 like", value, "r3");
            return (Criteria) this;
        }

        public Criteria andR3NotLike(String value) {
            addCriterion("r3 not like", value, "r3");
            return (Criteria) this;
        }

        public Criteria andR3In(List<String> values) {
            addCriterion("r3 in", values, "r3");
            return (Criteria) this;
        }

        public Criteria andR3NotIn(List<String> values) {
            addCriterion("r3 not in", values, "r3");
            return (Criteria) this;
        }

        public Criteria andR3Between(String value1, String value2) {
            addCriterion("r3 between", value1, value2, "r3");
            return (Criteria) this;
        }

        public Criteria andR3NotBetween(String value1, String value2) {
            addCriterion("r3 not between", value1, value2, "r3");
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