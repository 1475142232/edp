package com.edp.dao.domain;

import java.util.ArrayList;
import java.util.List;

public class MailInfoPoCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MailInfoPoCriteria() {
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

        public Criteria andMailNameIsNull() {
            addCriterion("mail_name is null");
            return (Criteria) this;
        }

        public Criteria andMailNameIsNotNull() {
            addCriterion("mail_name is not null");
            return (Criteria) this;
        }

        public Criteria andMailNameEqualTo(String value) {
            addCriterion("mail_name =", value, "mailName");
            return (Criteria) this;
        }

        public Criteria andMailNameNotEqualTo(String value) {
            addCriterion("mail_name <>", value, "mailName");
            return (Criteria) this;
        }

        public Criteria andMailNameGreaterThan(String value) {
            addCriterion("mail_name >", value, "mailName");
            return (Criteria) this;
        }

        public Criteria andMailNameGreaterThanOrEqualTo(String value) {
            addCriterion("mail_name >=", value, "mailName");
            return (Criteria) this;
        }

        public Criteria andMailNameLessThan(String value) {
            addCriterion("mail_name <", value, "mailName");
            return (Criteria) this;
        }

        public Criteria andMailNameLessThanOrEqualTo(String value) {
            addCriterion("mail_name <=", value, "mailName");
            return (Criteria) this;
        }

        public Criteria andMailNameLike(String value) {
            addCriterion("mail_name like", value, "mailName");
            return (Criteria) this;
        }

        public Criteria andMailNameNotLike(String value) {
            addCriterion("mail_name not like", value, "mailName");
            return (Criteria) this;
        }

        public Criteria andMailNameIn(List<String> values) {
            addCriterion("mail_name in", values, "mailName");
            return (Criteria) this;
        }

        public Criteria andMailNameNotIn(List<String> values) {
            addCriterion("mail_name not in", values, "mailName");
            return (Criteria) this;
        }

        public Criteria andMailNameBetween(String value1, String value2) {
            addCriterion("mail_name between", value1, value2, "mailName");
            return (Criteria) this;
        }

        public Criteria andMailNameNotBetween(String value1, String value2) {
            addCriterion("mail_name not between", value1, value2, "mailName");
            return (Criteria) this;
        }

        public Criteria andMailDescIsNull() {
            addCriterion("mail_desc is null");
            return (Criteria) this;
        }

        public Criteria andMailDescIsNotNull() {
            addCriterion("mail_desc is not null");
            return (Criteria) this;
        }

        public Criteria andMailDescEqualTo(String value) {
            addCriterion("mail_desc =", value, "mailDesc");
            return (Criteria) this;
        }

        public Criteria andMailDescNotEqualTo(String value) {
            addCriterion("mail_desc <>", value, "mailDesc");
            return (Criteria) this;
        }

        public Criteria andMailDescGreaterThan(String value) {
            addCriterion("mail_desc >", value, "mailDesc");
            return (Criteria) this;
        }

        public Criteria andMailDescGreaterThanOrEqualTo(String value) {
            addCriterion("mail_desc >=", value, "mailDesc");
            return (Criteria) this;
        }

        public Criteria andMailDescLessThan(String value) {
            addCriterion("mail_desc <", value, "mailDesc");
            return (Criteria) this;
        }

        public Criteria andMailDescLessThanOrEqualTo(String value) {
            addCriterion("mail_desc <=", value, "mailDesc");
            return (Criteria) this;
        }

        public Criteria andMailDescLike(String value) {
            addCriterion("mail_desc like", value, "mailDesc");
            return (Criteria) this;
        }

        public Criteria andMailDescNotLike(String value) {
            addCriterion("mail_desc not like", value, "mailDesc");
            return (Criteria) this;
        }

        public Criteria andMailDescIn(List<String> values) {
            addCriterion("mail_desc in", values, "mailDesc");
            return (Criteria) this;
        }

        public Criteria andMailDescNotIn(List<String> values) {
            addCriterion("mail_desc not in", values, "mailDesc");
            return (Criteria) this;
        }

        public Criteria andMailDescBetween(String value1, String value2) {
            addCriterion("mail_desc between", value1, value2, "mailDesc");
            return (Criteria) this;
        }

        public Criteria andMailDescNotBetween(String value1, String value2) {
            addCriterion("mail_desc not between", value1, value2, "mailDesc");
            return (Criteria) this;
        }

        public Criteria andMailCreatuserIsNull() {
            addCriterion("mail_creatuser is null");
            return (Criteria) this;
        }

        public Criteria andMailCreatuserIsNotNull() {
            addCriterion("mail_creatuser is not null");
            return (Criteria) this;
        }

        public Criteria andMailCreatuserEqualTo(String value) {
            addCriterion("mail_creatuser =", value, "mailCreatuser");
            return (Criteria) this;
        }

        public Criteria andMailCreatuserNotEqualTo(String value) {
            addCriterion("mail_creatuser <>", value, "mailCreatuser");
            return (Criteria) this;
        }

        public Criteria andMailCreatuserGreaterThan(String value) {
            addCriterion("mail_creatuser >", value, "mailCreatuser");
            return (Criteria) this;
        }

        public Criteria andMailCreatuserGreaterThanOrEqualTo(String value) {
            addCriterion("mail_creatuser >=", value, "mailCreatuser");
            return (Criteria) this;
        }

        public Criteria andMailCreatuserLessThan(String value) {
            addCriterion("mail_creatuser <", value, "mailCreatuser");
            return (Criteria) this;
        }

        public Criteria andMailCreatuserLessThanOrEqualTo(String value) {
            addCriterion("mail_creatuser <=", value, "mailCreatuser");
            return (Criteria) this;
        }

        public Criteria andMailCreatuserLike(String value) {
            addCriterion("mail_creatuser like", value, "mailCreatuser");
            return (Criteria) this;
        }

        public Criteria andMailCreatuserNotLike(String value) {
            addCriterion("mail_creatuser not like", value, "mailCreatuser");
            return (Criteria) this;
        }

        public Criteria andMailCreatuserIn(List<String> values) {
            addCriterion("mail_creatuser in", values, "mailCreatuser");
            return (Criteria) this;
        }

        public Criteria andMailCreatuserNotIn(List<String> values) {
            addCriterion("mail_creatuser not in", values, "mailCreatuser");
            return (Criteria) this;
        }

        public Criteria andMailCreatuserBetween(String value1, String value2) {
            addCriterion("mail_creatuser between", value1, value2, "mailCreatuser");
            return (Criteria) this;
        }

        public Criteria andMailCreatuserNotBetween(String value1, String value2) {
            addCriterion("mail_creatuser not between", value1, value2, "mailCreatuser");
            return (Criteria) this;
        }

        public Criteria andMailCreattiameIsNull() {
            addCriterion("mail_creattiame is null");
            return (Criteria) this;
        }

        public Criteria andMailCreattiameIsNotNull() {
            addCriterion("mail_creattiame is not null");
            return (Criteria) this;
        }

        public Criteria andMailCreattiameEqualTo(String value) {
            addCriterion("mail_creattiame =", value, "mailCreattiame");
            return (Criteria) this;
        }

        public Criteria andMailCreattiameNotEqualTo(String value) {
            addCriterion("mail_creattiame <>", value, "mailCreattiame");
            return (Criteria) this;
        }

        public Criteria andMailCreattiameGreaterThan(String value) {
            addCriterion("mail_creattiame >", value, "mailCreattiame");
            return (Criteria) this;
        }

        public Criteria andMailCreattiameGreaterThanOrEqualTo(String value) {
            addCriterion("mail_creattiame >=", value, "mailCreattiame");
            return (Criteria) this;
        }

        public Criteria andMailCreattiameLessThan(String value) {
            addCriterion("mail_creattiame <", value, "mailCreattiame");
            return (Criteria) this;
        }

        public Criteria andMailCreattiameLessThanOrEqualTo(String value) {
            addCriterion("mail_creattiame <=", value, "mailCreattiame");
            return (Criteria) this;
        }

        public Criteria andMailCreattiameLike(String value) {
            addCriterion("mail_creattiame like", value, "mailCreattiame");
            return (Criteria) this;
        }

        public Criteria andMailCreattiameNotLike(String value) {
            addCriterion("mail_creattiame not like", value, "mailCreattiame");
            return (Criteria) this;
        }

        public Criteria andMailCreattiameIn(List<String> values) {
            addCriterion("mail_creattiame in", values, "mailCreattiame");
            return (Criteria) this;
        }

        public Criteria andMailCreattiameNotIn(List<String> values) {
            addCriterion("mail_creattiame not in", values, "mailCreattiame");
            return (Criteria) this;
        }

        public Criteria andMailCreattiameBetween(String value1, String value2) {
            addCriterion("mail_creattiame between", value1, value2, "mailCreattiame");
            return (Criteria) this;
        }

        public Criteria andMailCreattiameNotBetween(String value1, String value2) {
            addCriterion("mail_creattiame not between", value1, value2, "mailCreattiame");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andMailStateIsNull() {
            addCriterion("mail_state is null");
            return (Criteria) this;
        }

        public Criteria andMailStateIsNotNull() {
            addCriterion("mail_state is not null");
            return (Criteria) this;
        }

        public Criteria andMailStateEqualTo(String value) {
            addCriterion("mail_state =", value, "mailState");
            return (Criteria) this;
        }

        public Criteria andMailStateNotEqualTo(String value) {
            addCriterion("mail_state <>", value, "mailState");
            return (Criteria) this;
        }

        public Criteria andMailStateGreaterThan(String value) {
            addCriterion("mail_state >", value, "mailState");
            return (Criteria) this;
        }

        public Criteria andMailStateGreaterThanOrEqualTo(String value) {
            addCriterion("mail_state >=", value, "mailState");
            return (Criteria) this;
        }

        public Criteria andMailStateLessThan(String value) {
            addCriterion("mail_state <", value, "mailState");
            return (Criteria) this;
        }

        public Criteria andMailStateLessThanOrEqualTo(String value) {
            addCriterion("mail_state <=", value, "mailState");
            return (Criteria) this;
        }

        public Criteria andMailStateLike(String value) {
            addCriterion("mail_state like", value, "mailState");
            return (Criteria) this;
        }

        public Criteria andMailStateNotLike(String value) {
            addCriterion("mail_state not like", value, "mailState");
            return (Criteria) this;
        }

        public Criteria andMailStateIn(List<String> values) {
            addCriterion("mail_state in", values, "mailState");
            return (Criteria) this;
        }

        public Criteria andMailStateNotIn(List<String> values) {
            addCriterion("mail_state not in", values, "mailState");
            return (Criteria) this;
        }

        public Criteria andMailStateBetween(String value1, String value2) {
            addCriterion("mail_state between", value1, value2, "mailState");
            return (Criteria) this;
        }

        public Criteria andMailStateNotBetween(String value1, String value2) {
            addCriterion("mail_state not between", value1, value2, "mailState");
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