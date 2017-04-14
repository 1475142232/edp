package com.edp.dao.domain;

import java.util.ArrayList;
import java.util.List;

public class ReplyInfoPoCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReplyInfoPoCriteria() {
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

        public Criteria andReplyDescIsNull() {
            addCriterion("reply_desc is null");
            return (Criteria) this;
        }

        public Criteria andReplyDescIsNotNull() {
            addCriterion("reply_desc is not null");
            return (Criteria) this;
        }

        public Criteria andReplyDescEqualTo(String value) {
            addCriterion("reply_desc =", value, "replyDesc");
            return (Criteria) this;
        }

        public Criteria andReplyDescNotEqualTo(String value) {
            addCriterion("reply_desc <>", value, "replyDesc");
            return (Criteria) this;
        }

        public Criteria andReplyDescGreaterThan(String value) {
            addCriterion("reply_desc >", value, "replyDesc");
            return (Criteria) this;
        }

        public Criteria andReplyDescGreaterThanOrEqualTo(String value) {
            addCriterion("reply_desc >=", value, "replyDesc");
            return (Criteria) this;
        }

        public Criteria andReplyDescLessThan(String value) {
            addCriterion("reply_desc <", value, "replyDesc");
            return (Criteria) this;
        }

        public Criteria andReplyDescLessThanOrEqualTo(String value) {
            addCriterion("reply_desc <=", value, "replyDesc");
            return (Criteria) this;
        }

        public Criteria andReplyDescLike(String value) {
            addCriterion("reply_desc like", value, "replyDesc");
            return (Criteria) this;
        }

        public Criteria andReplyDescNotLike(String value) {
            addCriterion("reply_desc not like", value, "replyDesc");
            return (Criteria) this;
        }

        public Criteria andReplyDescIn(List<String> values) {
            addCriterion("reply_desc in", values, "replyDesc");
            return (Criteria) this;
        }

        public Criteria andReplyDescNotIn(List<String> values) {
            addCriterion("reply_desc not in", values, "replyDesc");
            return (Criteria) this;
        }

        public Criteria andReplyDescBetween(String value1, String value2) {
            addCriterion("reply_desc between", value1, value2, "replyDesc");
            return (Criteria) this;
        }

        public Criteria andReplyDescNotBetween(String value1, String value2) {
            addCriterion("reply_desc not between", value1, value2, "replyDesc");
            return (Criteria) this;
        }

        public Criteria andProblemIdIsNull() {
            addCriterion("problem_id is null");
            return (Criteria) this;
        }

        public Criteria andProblemIdIsNotNull() {
            addCriterion("problem_id is not null");
            return (Criteria) this;
        }

        public Criteria andProblemIdEqualTo(Integer value) {
            addCriterion("problem_id =", value, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdNotEqualTo(Integer value) {
            addCriterion("problem_id <>", value, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdGreaterThan(Integer value) {
            addCriterion("problem_id >", value, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("problem_id >=", value, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdLessThan(Integer value) {
            addCriterion("problem_id <", value, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdLessThanOrEqualTo(Integer value) {
            addCriterion("problem_id <=", value, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdIn(List<Integer> values) {
            addCriterion("problem_id in", values, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdNotIn(List<Integer> values) {
            addCriterion("problem_id not in", values, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdBetween(Integer value1, Integer value2) {
            addCriterion("problem_id between", value1, value2, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("problem_id not between", value1, value2, "problemId");
            return (Criteria) this;
        }

        public Criteria andReplyTimeIsNull() {
            addCriterion("reply_time is null");
            return (Criteria) this;
        }

        public Criteria andReplyTimeIsNotNull() {
            addCriterion("reply_time is not null");
            return (Criteria) this;
        }

        public Criteria andReplyTimeEqualTo(String value) {
            addCriterion("reply_time =", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeNotEqualTo(String value) {
            addCriterion("reply_time <>", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeGreaterThan(String value) {
            addCriterion("reply_time >", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeGreaterThanOrEqualTo(String value) {
            addCriterion("reply_time >=", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeLessThan(String value) {
            addCriterion("reply_time <", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeLessThanOrEqualTo(String value) {
            addCriterion("reply_time <=", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeLike(String value) {
            addCriterion("reply_time like", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeNotLike(String value) {
            addCriterion("reply_time not like", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeIn(List<String> values) {
            addCriterion("reply_time in", values, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeNotIn(List<String> values) {
            addCriterion("reply_time not in", values, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeBetween(String value1, String value2) {
            addCriterion("reply_time between", value1, value2, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeNotBetween(String value1, String value2) {
            addCriterion("reply_time not between", value1, value2, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyUserIdIsNull() {
            addCriterion("reply_user_id is null");
            return (Criteria) this;
        }

        public Criteria andReplyUserIdIsNotNull() {
            addCriterion("reply_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andReplyUserIdEqualTo(String value) {
            addCriterion("reply_user_id =", value, "replyUserId");
            return (Criteria) this;
        }

        public Criteria andReplyUserIdNotEqualTo(String value) {
            addCriterion("reply_user_id <>", value, "replyUserId");
            return (Criteria) this;
        }

        public Criteria andReplyUserIdGreaterThan(String value) {
            addCriterion("reply_user_id >", value, "replyUserId");
            return (Criteria) this;
        }

        public Criteria andReplyUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("reply_user_id >=", value, "replyUserId");
            return (Criteria) this;
        }

        public Criteria andReplyUserIdLessThan(String value) {
            addCriterion("reply_user_id <", value, "replyUserId");
            return (Criteria) this;
        }

        public Criteria andReplyUserIdLessThanOrEqualTo(String value) {
            addCriterion("reply_user_id <=", value, "replyUserId");
            return (Criteria) this;
        }

        public Criteria andReplyUserIdLike(String value) {
            addCriterion("reply_user_id like", value, "replyUserId");
            return (Criteria) this;
        }

        public Criteria andReplyUserIdNotLike(String value) {
            addCriterion("reply_user_id not like", value, "replyUserId");
            return (Criteria) this;
        }

        public Criteria andReplyUserIdIn(List<String> values) {
            addCriterion("reply_user_id in", values, "replyUserId");
            return (Criteria) this;
        }

        public Criteria andReplyUserIdNotIn(List<String> values) {
            addCriterion("reply_user_id not in", values, "replyUserId");
            return (Criteria) this;
        }

        public Criteria andReplyUserIdBetween(String value1, String value2) {
            addCriterion("reply_user_id between", value1, value2, "replyUserId");
            return (Criteria) this;
        }

        public Criteria andReplyUserIdNotBetween(String value1, String value2) {
            addCriterion("reply_user_id not between", value1, value2, "replyUserId");
            return (Criteria) this;
        }

        public Criteria andReplyUserNameIsNull() {
            addCriterion("reply_user_name is null");
            return (Criteria) this;
        }

        public Criteria andReplyUserNameIsNotNull() {
            addCriterion("reply_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andReplyUserNameEqualTo(String value) {
            addCriterion("reply_user_name =", value, "replyUserName");
            return (Criteria) this;
        }

        public Criteria andReplyUserNameNotEqualTo(String value) {
            addCriterion("reply_user_name <>", value, "replyUserName");
            return (Criteria) this;
        }

        public Criteria andReplyUserNameGreaterThan(String value) {
            addCriterion("reply_user_name >", value, "replyUserName");
            return (Criteria) this;
        }

        public Criteria andReplyUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("reply_user_name >=", value, "replyUserName");
            return (Criteria) this;
        }

        public Criteria andReplyUserNameLessThan(String value) {
            addCriterion("reply_user_name <", value, "replyUserName");
            return (Criteria) this;
        }

        public Criteria andReplyUserNameLessThanOrEqualTo(String value) {
            addCriterion("reply_user_name <=", value, "replyUserName");
            return (Criteria) this;
        }

        public Criteria andReplyUserNameLike(String value) {
            addCriterion("reply_user_name like", value, "replyUserName");
            return (Criteria) this;
        }

        public Criteria andReplyUserNameNotLike(String value) {
            addCriterion("reply_user_name not like", value, "replyUserName");
            return (Criteria) this;
        }

        public Criteria andReplyUserNameIn(List<String> values) {
            addCriterion("reply_user_name in", values, "replyUserName");
            return (Criteria) this;
        }

        public Criteria andReplyUserNameNotIn(List<String> values) {
            addCriterion("reply_user_name not in", values, "replyUserName");
            return (Criteria) this;
        }

        public Criteria andReplyUserNameBetween(String value1, String value2) {
            addCriterion("reply_user_name between", value1, value2, "replyUserName");
            return (Criteria) this;
        }

        public Criteria andReplyUserNameNotBetween(String value1, String value2) {
            addCriterion("reply_user_name not between", value1, value2, "replyUserName");
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