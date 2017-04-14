package com.edp.dao.domain;

import java.util.ArrayList;
import java.util.List;

public class ReqChangeInfoPoCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReqChangeInfoPoCriteria() {
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

        public Criteria andFunctionIdIsNull() {
            addCriterion("function_id is null");
            return (Criteria) this;
        }

        public Criteria andFunctionIdIsNotNull() {
            addCriterion("function_id is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionIdEqualTo(String value) {
            addCriterion("function_id =", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdNotEqualTo(String value) {
            addCriterion("function_id <>", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdGreaterThan(String value) {
            addCriterion("function_id >", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdGreaterThanOrEqualTo(String value) {
            addCriterion("function_id >=", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdLessThan(String value) {
            addCriterion("function_id <", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdLessThanOrEqualTo(String value) {
            addCriterion("function_id <=", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdLike(String value) {
            addCriterion("function_id like", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdNotLike(String value) {
            addCriterion("function_id not like", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdIn(List<String> values) {
            addCriterion("function_id in", values, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdNotIn(List<String> values) {
            addCriterion("function_id not in", values, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdBetween(String value1, String value2) {
            addCriterion("function_id between", value1, value2, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdNotBetween(String value1, String value2) {
            addCriterion("function_id not between", value1, value2, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionNameIsNull() {
            addCriterion("function_name is null");
            return (Criteria) this;
        }

        public Criteria andFunctionNameIsNotNull() {
            addCriterion("function_name is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionNameEqualTo(String value) {
            addCriterion("function_name =", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameNotEqualTo(String value) {
            addCriterion("function_name <>", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameGreaterThan(String value) {
            addCriterion("function_name >", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameGreaterThanOrEqualTo(String value) {
            addCriterion("function_name >=", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameLessThan(String value) {
            addCriterion("function_name <", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameLessThanOrEqualTo(String value) {
            addCriterion("function_name <=", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameLike(String value) {
            addCriterion("function_name like", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameNotLike(String value) {
            addCriterion("function_name not like", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameIn(List<String> values) {
            addCriterion("function_name in", values, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameNotIn(List<String> values) {
            addCriterion("function_name not in", values, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameBetween(String value1, String value2) {
            addCriterion("function_name between", value1, value2, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameNotBetween(String value1, String value2) {
            addCriterion("function_name not between", value1, value2, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionSpecIsNull() {
            addCriterion("function_spec is null");
            return (Criteria) this;
        }

        public Criteria andFunctionSpecIsNotNull() {
            addCriterion("function_spec is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionSpecEqualTo(String value) {
            addCriterion("function_spec =", value, "functionSpec");
            return (Criteria) this;
        }

        public Criteria andFunctionSpecNotEqualTo(String value) {
            addCriterion("function_spec <>", value, "functionSpec");
            return (Criteria) this;
        }

        public Criteria andFunctionSpecGreaterThan(String value) {
            addCriterion("function_spec >", value, "functionSpec");
            return (Criteria) this;
        }

        public Criteria andFunctionSpecGreaterThanOrEqualTo(String value) {
            addCriterion("function_spec >=", value, "functionSpec");
            return (Criteria) this;
        }

        public Criteria andFunctionSpecLessThan(String value) {
            addCriterion("function_spec <", value, "functionSpec");
            return (Criteria) this;
        }

        public Criteria andFunctionSpecLessThanOrEqualTo(String value) {
            addCriterion("function_spec <=", value, "functionSpec");
            return (Criteria) this;
        }

        public Criteria andFunctionSpecLike(String value) {
            addCriterion("function_spec like", value, "functionSpec");
            return (Criteria) this;
        }

        public Criteria andFunctionSpecNotLike(String value) {
            addCriterion("function_spec not like", value, "functionSpec");
            return (Criteria) this;
        }

        public Criteria andFunctionSpecIn(List<String> values) {
            addCriterion("function_spec in", values, "functionSpec");
            return (Criteria) this;
        }

        public Criteria andFunctionSpecNotIn(List<String> values) {
            addCriterion("function_spec not in", values, "functionSpec");
            return (Criteria) this;
        }

        public Criteria andFunctionSpecBetween(String value1, String value2) {
            addCriterion("function_spec between", value1, value2, "functionSpec");
            return (Criteria) this;
        }

        public Criteria andFunctionSpecNotBetween(String value1, String value2) {
            addCriterion("function_spec not between", value1, value2, "functionSpec");
            return (Criteria) this;
        }

        public Criteria andFunctionEnNameIsNull() {
            addCriterion("function_en_name is null");
            return (Criteria) this;
        }

        public Criteria andFunctionEnNameIsNotNull() {
            addCriterion("function_en_name is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionEnNameEqualTo(String value) {
            addCriterion("function_en_name =", value, "functionEnName");
            return (Criteria) this;
        }

        public Criteria andFunctionEnNameNotEqualTo(String value) {
            addCriterion("function_en_name <>", value, "functionEnName");
            return (Criteria) this;
        }

        public Criteria andFunctionEnNameGreaterThan(String value) {
            addCriterion("function_en_name >", value, "functionEnName");
            return (Criteria) this;
        }

        public Criteria andFunctionEnNameGreaterThanOrEqualTo(String value) {
            addCriterion("function_en_name >=", value, "functionEnName");
            return (Criteria) this;
        }

        public Criteria andFunctionEnNameLessThan(String value) {
            addCriterion("function_en_name <", value, "functionEnName");
            return (Criteria) this;
        }

        public Criteria andFunctionEnNameLessThanOrEqualTo(String value) {
            addCriterion("function_en_name <=", value, "functionEnName");
            return (Criteria) this;
        }

        public Criteria andFunctionEnNameLike(String value) {
            addCriterion("function_en_name like", value, "functionEnName");
            return (Criteria) this;
        }

        public Criteria andFunctionEnNameNotLike(String value) {
            addCriterion("function_en_name not like", value, "functionEnName");
            return (Criteria) this;
        }

        public Criteria andFunctionEnNameIn(List<String> values) {
            addCriterion("function_en_name in", values, "functionEnName");
            return (Criteria) this;
        }

        public Criteria andFunctionEnNameNotIn(List<String> values) {
            addCriterion("function_en_name not in", values, "functionEnName");
            return (Criteria) this;
        }

        public Criteria andFunctionEnNameBetween(String value1, String value2) {
            addCriterion("function_en_name between", value1, value2, "functionEnName");
            return (Criteria) this;
        }

        public Criteria andFunctionEnNameNotBetween(String value1, String value2) {
            addCriterion("function_en_name not between", value1, value2, "functionEnName");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("reason not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andImpactIsNull() {
            addCriterion("impact is null");
            return (Criteria) this;
        }

        public Criteria andImpactIsNotNull() {
            addCriterion("impact is not null");
            return (Criteria) this;
        }

        public Criteria andImpactEqualTo(String value) {
            addCriterion("impact =", value, "impact");
            return (Criteria) this;
        }

        public Criteria andImpactNotEqualTo(String value) {
            addCriterion("impact <>", value, "impact");
            return (Criteria) this;
        }

        public Criteria andImpactGreaterThan(String value) {
            addCriterion("impact >", value, "impact");
            return (Criteria) this;
        }

        public Criteria andImpactGreaterThanOrEqualTo(String value) {
            addCriterion("impact >=", value, "impact");
            return (Criteria) this;
        }

        public Criteria andImpactLessThan(String value) {
            addCriterion("impact <", value, "impact");
            return (Criteria) this;
        }

        public Criteria andImpactLessThanOrEqualTo(String value) {
            addCriterion("impact <=", value, "impact");
            return (Criteria) this;
        }

        public Criteria andImpactLike(String value) {
            addCriterion("impact like", value, "impact");
            return (Criteria) this;
        }

        public Criteria andImpactNotLike(String value) {
            addCriterion("impact not like", value, "impact");
            return (Criteria) this;
        }

        public Criteria andImpactIn(List<String> values) {
            addCriterion("impact in", values, "impact");
            return (Criteria) this;
        }

        public Criteria andImpactNotIn(List<String> values) {
            addCriterion("impact not in", values, "impact");
            return (Criteria) this;
        }

        public Criteria andImpactBetween(String value1, String value2) {
            addCriterion("impact between", value1, value2, "impact");
            return (Criteria) this;
        }

        public Criteria andImpactNotBetween(String value1, String value2) {
            addCriterion("impact not between", value1, value2, "impact");
            return (Criteria) this;
        }

        public Criteria andApplyorIsNull() {
            addCriterion("applyor is null");
            return (Criteria) this;
        }

        public Criteria andApplyorIsNotNull() {
            addCriterion("applyor is not null");
            return (Criteria) this;
        }

        public Criteria andApplyorEqualTo(String value) {
            addCriterion("applyor =", value, "applyor");
            return (Criteria) this;
        }

        public Criteria andApplyorNotEqualTo(String value) {
            addCriterion("applyor <>", value, "applyor");
            return (Criteria) this;
        }

        public Criteria andApplyorGreaterThan(String value) {
            addCriterion("applyor >", value, "applyor");
            return (Criteria) this;
        }

        public Criteria andApplyorGreaterThanOrEqualTo(String value) {
            addCriterion("applyor >=", value, "applyor");
            return (Criteria) this;
        }

        public Criteria andApplyorLessThan(String value) {
            addCriterion("applyor <", value, "applyor");
            return (Criteria) this;
        }

        public Criteria andApplyorLessThanOrEqualTo(String value) {
            addCriterion("applyor <=", value, "applyor");
            return (Criteria) this;
        }

        public Criteria andApplyorLike(String value) {
            addCriterion("applyor like", value, "applyor");
            return (Criteria) this;
        }

        public Criteria andApplyorNotLike(String value) {
            addCriterion("applyor not like", value, "applyor");
            return (Criteria) this;
        }

        public Criteria andApplyorIn(List<String> values) {
            addCriterion("applyor in", values, "applyor");
            return (Criteria) this;
        }

        public Criteria andApplyorNotIn(List<String> values) {
            addCriterion("applyor not in", values, "applyor");
            return (Criteria) this;
        }

        public Criteria andApplyorBetween(String value1, String value2) {
            addCriterion("applyor between", value1, value2, "applyor");
            return (Criteria) this;
        }

        public Criteria andApplyorNotBetween(String value1, String value2) {
            addCriterion("applyor not between", value1, value2, "applyor");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNull() {
            addCriterion("apply_time is null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNotNull() {
            addCriterion("apply_time is not null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeEqualTo(String value) {
            addCriterion("apply_time =", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotEqualTo(String value) {
            addCriterion("apply_time <>", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThan(String value) {
            addCriterion("apply_time >", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThanOrEqualTo(String value) {
            addCriterion("apply_time >=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThan(String value) {
            addCriterion("apply_time <", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThanOrEqualTo(String value) {
            addCriterion("apply_time <=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLike(String value) {
            addCriterion("apply_time like", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotLike(String value) {
            addCriterion("apply_time not like", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIn(List<String> values) {
            addCriterion("apply_time in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotIn(List<String> values) {
            addCriterion("apply_time not in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeBetween(String value1, String value2) {
            addCriterion("apply_time between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotBetween(String value1, String value2) {
            addCriterion("apply_time not between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyorIsNull() {
            addCriterion("verifyor is null");
            return (Criteria) this;
        }

        public Criteria andVerifyorIsNotNull() {
            addCriterion("verifyor is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyorEqualTo(String value) {
            addCriterion("verifyor =", value, "verifyor");
            return (Criteria) this;
        }

        public Criteria andVerifyorNotEqualTo(String value) {
            addCriterion("verifyor <>", value, "verifyor");
            return (Criteria) this;
        }

        public Criteria andVerifyorGreaterThan(String value) {
            addCriterion("verifyor >", value, "verifyor");
            return (Criteria) this;
        }

        public Criteria andVerifyorGreaterThanOrEqualTo(String value) {
            addCriterion("verifyor >=", value, "verifyor");
            return (Criteria) this;
        }

        public Criteria andVerifyorLessThan(String value) {
            addCriterion("verifyor <", value, "verifyor");
            return (Criteria) this;
        }

        public Criteria andVerifyorLessThanOrEqualTo(String value) {
            addCriterion("verifyor <=", value, "verifyor");
            return (Criteria) this;
        }

        public Criteria andVerifyorLike(String value) {
            addCriterion("verifyor like", value, "verifyor");
            return (Criteria) this;
        }

        public Criteria andVerifyorNotLike(String value) {
            addCriterion("verifyor not like", value, "verifyor");
            return (Criteria) this;
        }

        public Criteria andVerifyorIn(List<String> values) {
            addCriterion("verifyor in", values, "verifyor");
            return (Criteria) this;
        }

        public Criteria andVerifyorNotIn(List<String> values) {
            addCriterion("verifyor not in", values, "verifyor");
            return (Criteria) this;
        }

        public Criteria andVerifyorBetween(String value1, String value2) {
            addCriterion("verifyor between", value1, value2, "verifyor");
            return (Criteria) this;
        }

        public Criteria andVerifyorNotBetween(String value1, String value2) {
            addCriterion("verifyor not between", value1, value2, "verifyor");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeIsNull() {
            addCriterion("verify_time is null");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeIsNotNull() {
            addCriterion("verify_time is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeEqualTo(String value) {
            addCriterion("verify_time =", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeNotEqualTo(String value) {
            addCriterion("verify_time <>", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeGreaterThan(String value) {
            addCriterion("verify_time >", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeGreaterThanOrEqualTo(String value) {
            addCriterion("verify_time >=", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeLessThan(String value) {
            addCriterion("verify_time <", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeLessThanOrEqualTo(String value) {
            addCriterion("verify_time <=", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeLike(String value) {
            addCriterion("verify_time like", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeNotLike(String value) {
            addCriterion("verify_time not like", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeIn(List<String> values) {
            addCriterion("verify_time in", values, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeNotIn(List<String> values) {
            addCriterion("verify_time not in", values, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeBetween(String value1, String value2) {
            addCriterion("verify_time between", value1, value2, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeNotBetween(String value1, String value2) {
            addCriterion("verify_time not between", value1, value2, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVarifyResultIsNull() {
            addCriterion("varify_result is null");
            return (Criteria) this;
        }

        public Criteria andVarifyResultIsNotNull() {
            addCriterion("varify_result is not null");
            return (Criteria) this;
        }

        public Criteria andVarifyResultEqualTo(String value) {
            addCriterion("varify_result =", value, "varifyResult");
            return (Criteria) this;
        }

        public Criteria andVarifyResultNotEqualTo(String value) {
            addCriterion("varify_result <>", value, "varifyResult");
            return (Criteria) this;
        }

        public Criteria andVarifyResultGreaterThan(String value) {
            addCriterion("varify_result >", value, "varifyResult");
            return (Criteria) this;
        }

        public Criteria andVarifyResultGreaterThanOrEqualTo(String value) {
            addCriterion("varify_result >=", value, "varifyResult");
            return (Criteria) this;
        }

        public Criteria andVarifyResultLessThan(String value) {
            addCriterion("varify_result <", value, "varifyResult");
            return (Criteria) this;
        }

        public Criteria andVarifyResultLessThanOrEqualTo(String value) {
            addCriterion("varify_result <=", value, "varifyResult");
            return (Criteria) this;
        }

        public Criteria andVarifyResultLike(String value) {
            addCriterion("varify_result like", value, "varifyResult");
            return (Criteria) this;
        }

        public Criteria andVarifyResultNotLike(String value) {
            addCriterion("varify_result not like", value, "varifyResult");
            return (Criteria) this;
        }

        public Criteria andVarifyResultIn(List<String> values) {
            addCriterion("varify_result in", values, "varifyResult");
            return (Criteria) this;
        }

        public Criteria andVarifyResultNotIn(List<String> values) {
            addCriterion("varify_result not in", values, "varifyResult");
            return (Criteria) this;
        }

        public Criteria andVarifyResultBetween(String value1, String value2) {
            addCriterion("varify_result between", value1, value2, "varifyResult");
            return (Criteria) this;
        }

        public Criteria andVarifyResultNotBetween(String value1, String value2) {
            addCriterion("varify_result not between", value1, value2, "varifyResult");
            return (Criteria) this;
        }

        public Criteria andVerifySpecIsNull() {
            addCriterion("verify_spec is null");
            return (Criteria) this;
        }

        public Criteria andVerifySpecIsNotNull() {
            addCriterion("verify_spec is not null");
            return (Criteria) this;
        }

        public Criteria andVerifySpecEqualTo(String value) {
            addCriterion("verify_spec =", value, "verifySpec");
            return (Criteria) this;
        }

        public Criteria andVerifySpecNotEqualTo(String value) {
            addCriterion("verify_spec <>", value, "verifySpec");
            return (Criteria) this;
        }

        public Criteria andVerifySpecGreaterThan(String value) {
            addCriterion("verify_spec >", value, "verifySpec");
            return (Criteria) this;
        }

        public Criteria andVerifySpecGreaterThanOrEqualTo(String value) {
            addCriterion("verify_spec >=", value, "verifySpec");
            return (Criteria) this;
        }

        public Criteria andVerifySpecLessThan(String value) {
            addCriterion("verify_spec <", value, "verifySpec");
            return (Criteria) this;
        }

        public Criteria andVerifySpecLessThanOrEqualTo(String value) {
            addCriterion("verify_spec <=", value, "verifySpec");
            return (Criteria) this;
        }

        public Criteria andVerifySpecLike(String value) {
            addCriterion("verify_spec like", value, "verifySpec");
            return (Criteria) this;
        }

        public Criteria andVerifySpecNotLike(String value) {
            addCriterion("verify_spec not like", value, "verifySpec");
            return (Criteria) this;
        }

        public Criteria andVerifySpecIn(List<String> values) {
            addCriterion("verify_spec in", values, "verifySpec");
            return (Criteria) this;
        }

        public Criteria andVerifySpecNotIn(List<String> values) {
            addCriterion("verify_spec not in", values, "verifySpec");
            return (Criteria) this;
        }

        public Criteria andVerifySpecBetween(String value1, String value2) {
            addCriterion("verify_spec between", value1, value2, "verifySpec");
            return (Criteria) this;
        }

        public Criteria andVerifySpecNotBetween(String value1, String value2) {
            addCriterion("verify_spec not between", value1, value2, "verifySpec");
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