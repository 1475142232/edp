package com.edp.dao.domain;

import java.util.ArrayList;
import java.util.List;

public class PlanTasksPOCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlanTasksPOCriteria() {
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

        public Criteria andTaskIdIsNull() {
            addCriterion("task_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("task_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(String value) {
            addCriterion("task_id =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(String value) {
            addCriterion("task_id <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(String value) {
            addCriterion("task_id >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(String value) {
            addCriterion("task_id >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(String value) {
            addCriterion("task_id <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(String value) {
            addCriterion("task_id <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLike(String value) {
            addCriterion("task_id like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotLike(String value) {
            addCriterion("task_id not like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<String> values) {
            addCriterion("task_id in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<String> values) {
            addCriterion("task_id not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(String value1, String value2) {
            addCriterion("task_id between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(String value1, String value2) {
            addCriterion("task_id not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNull() {
            addCriterion("task_name is null");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNotNull() {
            addCriterion("task_name is not null");
            return (Criteria) this;
        }

        public Criteria andTaskNameEqualTo(String value) {
            addCriterion("task_name =", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotEqualTo(String value) {
            addCriterion("task_name <>", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThan(String value) {
            addCriterion("task_name >", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThanOrEqualTo(String value) {
            addCriterion("task_name >=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThan(String value) {
            addCriterion("task_name <", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThanOrEqualTo(String value) {
            addCriterion("task_name <=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLike(String value) {
            addCriterion("task_name like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotLike(String value) {
            addCriterion("task_name not like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameIn(List<String> values) {
            addCriterion("task_name in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotIn(List<String> values) {
            addCriterion("task_name not in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameBetween(String value1, String value2) {
            addCriterion("task_name between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotBetween(String value1, String value2) {
            addCriterion("task_name not between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskReceiveTimeIsNull() {
            addCriterion("task_receive_time is null");
            return (Criteria) this;
        }

        public Criteria andTaskReceiveTimeIsNotNull() {
            addCriterion("task_receive_time is not null");
            return (Criteria) this;
        }

        public Criteria andTaskReceiveTimeEqualTo(String value) {
            addCriterion("task_receive_time =", value, "taskReceiveTime");
            return (Criteria) this;
        }

        public Criteria andTaskReceiveTimeNotEqualTo(String value) {
            addCriterion("task_receive_time <>", value, "taskReceiveTime");
            return (Criteria) this;
        }

        public Criteria andTaskReceiveTimeGreaterThan(String value) {
            addCriterion("task_receive_time >", value, "taskReceiveTime");
            return (Criteria) this;
        }

        public Criteria andTaskReceiveTimeGreaterThanOrEqualTo(String value) {
            addCriterion("task_receive_time >=", value, "taskReceiveTime");
            return (Criteria) this;
        }

        public Criteria andTaskReceiveTimeLessThan(String value) {
            addCriterion("task_receive_time <", value, "taskReceiveTime");
            return (Criteria) this;
        }

        public Criteria andTaskReceiveTimeLessThanOrEqualTo(String value) {
            addCriterion("task_receive_time <=", value, "taskReceiveTime");
            return (Criteria) this;
        }

        public Criteria andTaskReceiveTimeLike(String value) {
            addCriterion("task_receive_time like", value, "taskReceiveTime");
            return (Criteria) this;
        }

        public Criteria andTaskReceiveTimeNotLike(String value) {
            addCriterion("task_receive_time not like", value, "taskReceiveTime");
            return (Criteria) this;
        }

        public Criteria andTaskReceiveTimeIn(List<String> values) {
            addCriterion("task_receive_time in", values, "taskReceiveTime");
            return (Criteria) this;
        }

        public Criteria andTaskReceiveTimeNotIn(List<String> values) {
            addCriterion("task_receive_time not in", values, "taskReceiveTime");
            return (Criteria) this;
        }

        public Criteria andTaskReceiveTimeBetween(String value1, String value2) {
            addCriterion("task_receive_time between", value1, value2, "taskReceiveTime");
            return (Criteria) this;
        }

        public Criteria andTaskReceiveTimeNotBetween(String value1, String value2) {
            addCriterion("task_receive_time not between", value1, value2, "taskReceiveTime");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeIsNull() {
            addCriterion("task_start_time is null");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeIsNotNull() {
            addCriterion("task_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeEqualTo(String value) {
            addCriterion("task_start_time =", value, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeNotEqualTo(String value) {
            addCriterion("task_start_time <>", value, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeGreaterThan(String value) {
            addCriterion("task_start_time >", value, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("task_start_time >=", value, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeLessThan(String value) {
            addCriterion("task_start_time <", value, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeLessThanOrEqualTo(String value) {
            addCriterion("task_start_time <=", value, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeLike(String value) {
            addCriterion("task_start_time like", value, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeNotLike(String value) {
            addCriterion("task_start_time not like", value, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeIn(List<String> values) {
            addCriterion("task_start_time in", values, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeNotIn(List<String> values) {
            addCriterion("task_start_time not in", values, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeBetween(String value1, String value2) {
            addCriterion("task_start_time between", value1, value2, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeNotBetween(String value1, String value2) {
            addCriterion("task_start_time not between", value1, value2, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskDoneTimeIsNull() {
            addCriterion("task_done_time is null");
            return (Criteria) this;
        }

        public Criteria andTaskDoneTimeIsNotNull() {
            addCriterion("task_done_time is not null");
            return (Criteria) this;
        }

        public Criteria andTaskDoneTimeEqualTo(String value) {
            addCriterion("task_done_time =", value, "taskDoneTime");
            return (Criteria) this;
        }

        public Criteria andTaskDoneTimeNotEqualTo(String value) {
            addCriterion("task_done_time <>", value, "taskDoneTime");
            return (Criteria) this;
        }

        public Criteria andTaskDoneTimeGreaterThan(String value) {
            addCriterion("task_done_time >", value, "taskDoneTime");
            return (Criteria) this;
        }

        public Criteria andTaskDoneTimeGreaterThanOrEqualTo(String value) {
            addCriterion("task_done_time >=", value, "taskDoneTime");
            return (Criteria) this;
        }

        public Criteria andTaskDoneTimeLessThan(String value) {
            addCriterion("task_done_time <", value, "taskDoneTime");
            return (Criteria) this;
        }

        public Criteria andTaskDoneTimeLessThanOrEqualTo(String value) {
            addCriterion("task_done_time <=", value, "taskDoneTime");
            return (Criteria) this;
        }

        public Criteria andTaskDoneTimeLike(String value) {
            addCriterion("task_done_time like", value, "taskDoneTime");
            return (Criteria) this;
        }

        public Criteria andTaskDoneTimeNotLike(String value) {
            addCriterion("task_done_time not like", value, "taskDoneTime");
            return (Criteria) this;
        }

        public Criteria andTaskDoneTimeIn(List<String> values) {
            addCriterion("task_done_time in", values, "taskDoneTime");
            return (Criteria) this;
        }

        public Criteria andTaskDoneTimeNotIn(List<String> values) {
            addCriterion("task_done_time not in", values, "taskDoneTime");
            return (Criteria) this;
        }

        public Criteria andTaskDoneTimeBetween(String value1, String value2) {
            addCriterion("task_done_time between", value1, value2, "taskDoneTime");
            return (Criteria) this;
        }

        public Criteria andTaskDoneTimeNotBetween(String value1, String value2) {
            addCriterion("task_done_time not between", value1, value2, "taskDoneTime");
            return (Criteria) this;
        }

        public Criteria andTaskStateIsNull() {
            addCriterion("task_state is null");
            return (Criteria) this;
        }

        public Criteria andTaskStateIsNotNull() {
            addCriterion("task_state is not null");
            return (Criteria) this;
        }

        public Criteria andTaskStateEqualTo(String value) {
            addCriterion("task_state =", value, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateNotEqualTo(String value) {
            addCriterion("task_state <>", value, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateGreaterThan(String value) {
            addCriterion("task_state >", value, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateGreaterThanOrEqualTo(String value) {
            addCriterion("task_state >=", value, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateLessThan(String value) {
            addCriterion("task_state <", value, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateLessThanOrEqualTo(String value) {
            addCriterion("task_state <=", value, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateLike(String value) {
            addCriterion("task_state like", value, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateNotLike(String value) {
            addCriterion("task_state not like", value, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateIn(List<String> values) {
            addCriterion("task_state in", values, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateNotIn(List<String> values) {
            addCriterion("task_state not in", values, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateBetween(String value1, String value2) {
            addCriterion("task_state between", value1, value2, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateNotBetween(String value1, String value2) {
            addCriterion("task_state not between", value1, value2, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerIsNull() {
            addCriterion("task_owner is null");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerIsNotNull() {
            addCriterion("task_owner is not null");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerEqualTo(String value) {
            addCriterion("task_owner =", value, "taskOwner");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerNotEqualTo(String value) {
            addCriterion("task_owner <>", value, "taskOwner");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerGreaterThan(String value) {
            addCriterion("task_owner >", value, "taskOwner");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("task_owner >=", value, "taskOwner");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerLessThan(String value) {
            addCriterion("task_owner <", value, "taskOwner");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerLessThanOrEqualTo(String value) {
            addCriterion("task_owner <=", value, "taskOwner");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerLike(String value) {
            addCriterion("task_owner like", value, "taskOwner");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerNotLike(String value) {
            addCriterion("task_owner not like", value, "taskOwner");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerIn(List<String> values) {
            addCriterion("task_owner in", values, "taskOwner");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerNotIn(List<String> values) {
            addCriterion("task_owner not in", values, "taskOwner");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerBetween(String value1, String value2) {
            addCriterion("task_owner between", value1, value2, "taskOwner");
            return (Criteria) this;
        }

        public Criteria andTaskOwnerNotBetween(String value1, String value2) {
            addCriterion("task_owner not between", value1, value2, "taskOwner");
            return (Criteria) this;
        }

        public Criteria andTaskEvalTimeIsNull() {
            addCriterion("task_eval_time is null");
            return (Criteria) this;
        }

        public Criteria andTaskEvalTimeIsNotNull() {
            addCriterion("task_eval_time is not null");
            return (Criteria) this;
        }

        public Criteria andTaskEvalTimeEqualTo(Integer value) {
            addCriterion("task_eval_time =", value, "taskEvalTime");
            return (Criteria) this;
        }

        public Criteria andTaskEvalTimeNotEqualTo(Integer value) {
            addCriterion("task_eval_time <>", value, "taskEvalTime");
            return (Criteria) this;
        }

        public Criteria andTaskEvalTimeGreaterThan(Integer value) {
            addCriterion("task_eval_time >", value, "taskEvalTime");
            return (Criteria) this;
        }

        public Criteria andTaskEvalTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_eval_time >=", value, "taskEvalTime");
            return (Criteria) this;
        }

        public Criteria andTaskEvalTimeLessThan(Integer value) {
            addCriterion("task_eval_time <", value, "taskEvalTime");
            return (Criteria) this;
        }

        public Criteria andTaskEvalTimeLessThanOrEqualTo(Integer value) {
            addCriterion("task_eval_time <=", value, "taskEvalTime");
            return (Criteria) this;
        }

        public Criteria andTaskEvalTimeIn(List<Integer> values) {
            addCriterion("task_eval_time in", values, "taskEvalTime");
            return (Criteria) this;
        }

        public Criteria andTaskEvalTimeNotIn(List<Integer> values) {
            addCriterion("task_eval_time not in", values, "taskEvalTime");
            return (Criteria) this;
        }

        public Criteria andTaskEvalTimeBetween(Integer value1, Integer value2) {
            addCriterion("task_eval_time between", value1, value2, "taskEvalTime");
            return (Criteria) this;
        }

        public Criteria andTaskEvalTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("task_eval_time not between", value1, value2, "taskEvalTime");
            return (Criteria) this;
        }

        public Criteria andTaskRealTimeIsNull() {
            addCriterion("task_real_time is null");
            return (Criteria) this;
        }

        public Criteria andTaskRealTimeIsNotNull() {
            addCriterion("task_real_time is not null");
            return (Criteria) this;
        }

        public Criteria andTaskRealTimeEqualTo(Integer value) {
            addCriterion("task_real_time =", value, "taskRealTime");
            return (Criteria) this;
        }

        public Criteria andTaskRealTimeNotEqualTo(Integer value) {
            addCriterion("task_real_time <>", value, "taskRealTime");
            return (Criteria) this;
        }

        public Criteria andTaskRealTimeGreaterThan(Integer value) {
            addCriterion("task_real_time >", value, "taskRealTime");
            return (Criteria) this;
        }

        public Criteria andTaskRealTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_real_time >=", value, "taskRealTime");
            return (Criteria) this;
        }

        public Criteria andTaskRealTimeLessThan(Integer value) {
            addCriterion("task_real_time <", value, "taskRealTime");
            return (Criteria) this;
        }

        public Criteria andTaskRealTimeLessThanOrEqualTo(Integer value) {
            addCriterion("task_real_time <=", value, "taskRealTime");
            return (Criteria) this;
        }

        public Criteria andTaskRealTimeIn(List<Integer> values) {
            addCriterion("task_real_time in", values, "taskRealTime");
            return (Criteria) this;
        }

        public Criteria andTaskRealTimeNotIn(List<Integer> values) {
            addCriterion("task_real_time not in", values, "taskRealTime");
            return (Criteria) this;
        }

        public Criteria andTaskRealTimeBetween(Integer value1, Integer value2) {
            addCriterion("task_real_time between", value1, value2, "taskRealTime");
            return (Criteria) this;
        }

        public Criteria andTaskRealTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("task_real_time not between", value1, value2, "taskRealTime");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeIsNull() {
            addCriterion("task_create_time is null");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeIsNotNull() {
            addCriterion("task_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeEqualTo(String value) {
            addCriterion("task_create_time =", value, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeNotEqualTo(String value) {
            addCriterion("task_create_time <>", value, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeGreaterThan(String value) {
            addCriterion("task_create_time >", value, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("task_create_time >=", value, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeLessThan(String value) {
            addCriterion("task_create_time <", value, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("task_create_time <=", value, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeLike(String value) {
            addCriterion("task_create_time like", value, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeNotLike(String value) {
            addCriterion("task_create_time not like", value, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeIn(List<String> values) {
            addCriterion("task_create_time in", values, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeNotIn(List<String> values) {
            addCriterion("task_create_time not in", values, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeBetween(String value1, String value2) {
            addCriterion("task_create_time between", value1, value2, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskCreateTimeNotBetween(String value1, String value2) {
            addCriterion("task_create_time not between", value1, value2, "taskCreateTime");
            return (Criteria) this;
        }

        public Criteria andTaskCreateUserIsNull() {
            addCriterion("task_create_user is null");
            return (Criteria) this;
        }

        public Criteria andTaskCreateUserIsNotNull() {
            addCriterion("task_create_user is not null");
            return (Criteria) this;
        }

        public Criteria andTaskCreateUserEqualTo(String value) {
            addCriterion("task_create_user =", value, "taskCreateUser");
            return (Criteria) this;
        }

        public Criteria andTaskCreateUserNotEqualTo(String value) {
            addCriterion("task_create_user <>", value, "taskCreateUser");
            return (Criteria) this;
        }

        public Criteria andTaskCreateUserGreaterThan(String value) {
            addCriterion("task_create_user >", value, "taskCreateUser");
            return (Criteria) this;
        }

        public Criteria andTaskCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("task_create_user >=", value, "taskCreateUser");
            return (Criteria) this;
        }

        public Criteria andTaskCreateUserLessThan(String value) {
            addCriterion("task_create_user <", value, "taskCreateUser");
            return (Criteria) this;
        }

        public Criteria andTaskCreateUserLessThanOrEqualTo(String value) {
            addCriterion("task_create_user <=", value, "taskCreateUser");
            return (Criteria) this;
        }

        public Criteria andTaskCreateUserLike(String value) {
            addCriterion("task_create_user like", value, "taskCreateUser");
            return (Criteria) this;
        }

        public Criteria andTaskCreateUserNotLike(String value) {
            addCriterion("task_create_user not like", value, "taskCreateUser");
            return (Criteria) this;
        }

        public Criteria andTaskCreateUserIn(List<String> values) {
            addCriterion("task_create_user in", values, "taskCreateUser");
            return (Criteria) this;
        }

        public Criteria andTaskCreateUserNotIn(List<String> values) {
            addCriterion("task_create_user not in", values, "taskCreateUser");
            return (Criteria) this;
        }

        public Criteria andTaskCreateUserBetween(String value1, String value2) {
            addCriterion("task_create_user between", value1, value2, "taskCreateUser");
            return (Criteria) this;
        }

        public Criteria andTaskCreateUserNotBetween(String value1, String value2) {
            addCriterion("task_create_user not between", value1, value2, "taskCreateUser");
            return (Criteria) this;
        }

        public Criteria andTaskLastModifiedTimeIsNull() {
            addCriterion("task_last_modified_time is null");
            return (Criteria) this;
        }

        public Criteria andTaskLastModifiedTimeIsNotNull() {
            addCriterion("task_last_modified_time is not null");
            return (Criteria) this;
        }

        public Criteria andTaskLastModifiedTimeEqualTo(String value) {
            addCriterion("task_last_modified_time =", value, "taskLastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andTaskLastModifiedTimeNotEqualTo(String value) {
            addCriterion("task_last_modified_time <>", value, "taskLastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andTaskLastModifiedTimeGreaterThan(String value) {
            addCriterion("task_last_modified_time >", value, "taskLastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andTaskLastModifiedTimeGreaterThanOrEqualTo(String value) {
            addCriterion("task_last_modified_time >=", value, "taskLastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andTaskLastModifiedTimeLessThan(String value) {
            addCriterion("task_last_modified_time <", value, "taskLastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andTaskLastModifiedTimeLessThanOrEqualTo(String value) {
            addCriterion("task_last_modified_time <=", value, "taskLastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andTaskLastModifiedTimeLike(String value) {
            addCriterion("task_last_modified_time like", value, "taskLastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andTaskLastModifiedTimeNotLike(String value) {
            addCriterion("task_last_modified_time not like", value, "taskLastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andTaskLastModifiedTimeIn(List<String> values) {
            addCriterion("task_last_modified_time in", values, "taskLastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andTaskLastModifiedTimeNotIn(List<String> values) {
            addCriterion("task_last_modified_time not in", values, "taskLastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andTaskLastModifiedTimeBetween(String value1, String value2) {
            addCriterion("task_last_modified_time between", value1, value2, "taskLastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andTaskLastModifiedTimeNotBetween(String value1, String value2) {
            addCriterion("task_last_modified_time not between", value1, value2, "taskLastModifiedTime");
            return (Criteria) this;
        }

        public Criteria andTaskLastModifyorIsNull() {
            addCriterion("task_last_modifyor is null");
            return (Criteria) this;
        }

        public Criteria andTaskLastModifyorIsNotNull() {
            addCriterion("task_last_modifyor is not null");
            return (Criteria) this;
        }

        public Criteria andTaskLastModifyorEqualTo(String value) {
            addCriterion("task_last_modifyor =", value, "taskLastModifyor");
            return (Criteria) this;
        }

        public Criteria andTaskLastModifyorNotEqualTo(String value) {
            addCriterion("task_last_modifyor <>", value, "taskLastModifyor");
            return (Criteria) this;
        }

        public Criteria andTaskLastModifyorGreaterThan(String value) {
            addCriterion("task_last_modifyor >", value, "taskLastModifyor");
            return (Criteria) this;
        }

        public Criteria andTaskLastModifyorGreaterThanOrEqualTo(String value) {
            addCriterion("task_last_modifyor >=", value, "taskLastModifyor");
            return (Criteria) this;
        }

        public Criteria andTaskLastModifyorLessThan(String value) {
            addCriterion("task_last_modifyor <", value, "taskLastModifyor");
            return (Criteria) this;
        }

        public Criteria andTaskLastModifyorLessThanOrEqualTo(String value) {
            addCriterion("task_last_modifyor <=", value, "taskLastModifyor");
            return (Criteria) this;
        }

        public Criteria andTaskLastModifyorLike(String value) {
            addCriterion("task_last_modifyor like", value, "taskLastModifyor");
            return (Criteria) this;
        }

        public Criteria andTaskLastModifyorNotLike(String value) {
            addCriterion("task_last_modifyor not like", value, "taskLastModifyor");
            return (Criteria) this;
        }

        public Criteria andTaskLastModifyorIn(List<String> values) {
            addCriterion("task_last_modifyor in", values, "taskLastModifyor");
            return (Criteria) this;
        }

        public Criteria andTaskLastModifyorNotIn(List<String> values) {
            addCriterion("task_last_modifyor not in", values, "taskLastModifyor");
            return (Criteria) this;
        }

        public Criteria andTaskLastModifyorBetween(String value1, String value2) {
            addCriterion("task_last_modifyor between", value1, value2, "taskLastModifyor");
            return (Criteria) this;
        }

        public Criteria andTaskLastModifyorNotBetween(String value1, String value2) {
            addCriterion("task_last_modifyor not between", value1, value2, "taskLastModifyor");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIsNull() {
            addCriterion("task_type is null");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIsNotNull() {
            addCriterion("task_type is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTypeEqualTo(String value) {
            addCriterion("task_type =", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotEqualTo(String value) {
            addCriterion("task_type <>", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeGreaterThan(String value) {
            addCriterion("task_type >", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeGreaterThanOrEqualTo(String value) {
            addCriterion("task_type >=", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLessThan(String value) {
            addCriterion("task_type <", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLessThanOrEqualTo(String value) {
            addCriterion("task_type <=", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLike(String value) {
            addCriterion("task_type like", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotLike(String value) {
            addCriterion("task_type not like", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIn(List<String> values) {
            addCriterion("task_type in", values, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotIn(List<String> values) {
            addCriterion("task_type not in", values, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeBetween(String value1, String value2) {
            addCriterion("task_type between", value1, value2, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotBetween(String value1, String value2) {
            addCriterion("task_type not between", value1, value2, "taskType");
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

        public Criteria andTaskProgressIsNull() {
            addCriterion("task_progress is null");
            return (Criteria) this;
        }

        public Criteria andTaskProgressIsNotNull() {
            addCriterion("task_progress is not null");
            return (Criteria) this;
        }

        public Criteria andTaskProgressEqualTo(Integer value) {
            addCriterion("task_progress =", value, "taskProgress");
            return (Criteria) this;
        }

        public Criteria andTaskProgressNotEqualTo(Integer value) {
            addCriterion("task_progress <>", value, "taskProgress");
            return (Criteria) this;
        }

        public Criteria andTaskProgressGreaterThan(Integer value) {
            addCriterion("task_progress >", value, "taskProgress");
            return (Criteria) this;
        }

        public Criteria andTaskProgressGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_progress >=", value, "taskProgress");
            return (Criteria) this;
        }

        public Criteria andTaskProgressLessThan(Integer value) {
            addCriterion("task_progress <", value, "taskProgress");
            return (Criteria) this;
        }

        public Criteria andTaskProgressLessThanOrEqualTo(Integer value) {
            addCriterion("task_progress <=", value, "taskProgress");
            return (Criteria) this;
        }

        public Criteria andTaskProgressIn(List<Integer> values) {
            addCriterion("task_progress in", values, "taskProgress");
            return (Criteria) this;
        }

        public Criteria andTaskProgressNotIn(List<Integer> values) {
            addCriterion("task_progress not in", values, "taskProgress");
            return (Criteria) this;
        }

        public Criteria andTaskProgressBetween(Integer value1, Integer value2) {
            addCriterion("task_progress between", value1, value2, "taskProgress");
            return (Criteria) this;
        }

        public Criteria andTaskProgressNotBetween(Integer value1, Integer value2) {
            addCriterion("task_progress not between", value1, value2, "taskProgress");
            return (Criteria) this;
        }

        public Criteria andTaskVersionIsNull() {
            addCriterion("task_version is null");
            return (Criteria) this;
        }

        public Criteria andTaskVersionIsNotNull() {
            addCriterion("task_version is not null");
            return (Criteria) this;
        }

        public Criteria andTaskVersionEqualTo(Integer value) {
            addCriterion("task_version =", value, "taskVersion");
            return (Criteria) this;
        }

        public Criteria andTaskVersionNotEqualTo(Integer value) {
            addCriterion("task_version <>", value, "taskVersion");
            return (Criteria) this;
        }

        public Criteria andTaskVersionGreaterThan(Integer value) {
            addCriterion("task_version >", value, "taskVersion");
            return (Criteria) this;
        }

        public Criteria andTaskVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_version >=", value, "taskVersion");
            return (Criteria) this;
        }

        public Criteria andTaskVersionLessThan(Integer value) {
            addCriterion("task_version <", value, "taskVersion");
            return (Criteria) this;
        }

        public Criteria andTaskVersionLessThanOrEqualTo(Integer value) {
            addCriterion("task_version <=", value, "taskVersion");
            return (Criteria) this;
        }

        public Criteria andTaskVersionIn(List<Integer> values) {
            addCriterion("task_version in", values, "taskVersion");
            return (Criteria) this;
        }

        public Criteria andTaskVersionNotIn(List<Integer> values) {
            addCriterion("task_version not in", values, "taskVersion");
            return (Criteria) this;
        }

        public Criteria andTaskVersionBetween(Integer value1, Integer value2) {
            addCriterion("task_version between", value1, value2, "taskVersion");
            return (Criteria) this;
        }

        public Criteria andTaskVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("task_version not between", value1, value2, "taskVersion");
            return (Criteria) this;
        }

        public Criteria andSvnVersionIsNull() {
            addCriterion("svn_version is null");
            return (Criteria) this;
        }

        public Criteria andSvnVersionIsNotNull() {
            addCriterion("svn_version is not null");
            return (Criteria) this;
        }

        public Criteria andSvnVersionEqualTo(Integer value) {
            addCriterion("svn_version =", value, "svnVersion");
            return (Criteria) this;
        }

        public Criteria andSvnVersionNotEqualTo(Integer value) {
            addCriterion("svn_version <>", value, "svnVersion");
            return (Criteria) this;
        }

        public Criteria andSvnVersionGreaterThan(Integer value) {
            addCriterion("svn_version >", value, "svnVersion");
            return (Criteria) this;
        }

        public Criteria andSvnVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("svn_version >=", value, "svnVersion");
            return (Criteria) this;
        }

        public Criteria andSvnVersionLessThan(Integer value) {
            addCriterion("svn_version <", value, "svnVersion");
            return (Criteria) this;
        }

        public Criteria andSvnVersionLessThanOrEqualTo(Integer value) {
            addCriterion("svn_version <=", value, "svnVersion");
            return (Criteria) this;
        }

        public Criteria andSvnVersionIn(List<Integer> values) {
            addCriterion("svn_version in", values, "svnVersion");
            return (Criteria) this;
        }

        public Criteria andSvnVersionNotIn(List<Integer> values) {
            addCriterion("svn_version not in", values, "svnVersion");
            return (Criteria) this;
        }

        public Criteria andSvnVersionBetween(Integer value1, Integer value2) {
            addCriterion("svn_version between", value1, value2, "svnVersion");
            return (Criteria) this;
        }

        public Criteria andSvnVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("svn_version not between", value1, value2, "svnVersion");
            return (Criteria) this;
        }

        public Criteria andTaskComplexityIsNull() {
            addCriterion("task_complexity is null");
            return (Criteria) this;
        }

        public Criteria andTaskComplexityIsNotNull() {
            addCriterion("task_complexity is not null");
            return (Criteria) this;
        }

        public Criteria andTaskComplexityEqualTo(String value) {
            addCriterion("task_complexity =", value, "taskComplexity");
            return (Criteria) this;
        }

        public Criteria andTaskComplexityNotEqualTo(String value) {
            addCriterion("task_complexity <>", value, "taskComplexity");
            return (Criteria) this;
        }

        public Criteria andTaskComplexityGreaterThan(String value) {
            addCriterion("task_complexity >", value, "taskComplexity");
            return (Criteria) this;
        }

        public Criteria andTaskComplexityGreaterThanOrEqualTo(String value) {
            addCriterion("task_complexity >=", value, "taskComplexity");
            return (Criteria) this;
        }

        public Criteria andTaskComplexityLessThan(String value) {
            addCriterion("task_complexity <", value, "taskComplexity");
            return (Criteria) this;
        }

        public Criteria andTaskComplexityLessThanOrEqualTo(String value) {
            addCriterion("task_complexity <=", value, "taskComplexity");
            return (Criteria) this;
        }

        public Criteria andTaskComplexityLike(String value) {
            addCriterion("task_complexity like", value, "taskComplexity");
            return (Criteria) this;
        }

        public Criteria andTaskComplexityNotLike(String value) {
            addCriterion("task_complexity not like", value, "taskComplexity");
            return (Criteria) this;
        }

        public Criteria andTaskComplexityIn(List<String> values) {
            addCriterion("task_complexity in", values, "taskComplexity");
            return (Criteria) this;
        }

        public Criteria andTaskComplexityNotIn(List<String> values) {
            addCriterion("task_complexity not in", values, "taskComplexity");
            return (Criteria) this;
        }

        public Criteria andTaskComplexityBetween(String value1, String value2) {
            addCriterion("task_complexity between", value1, value2, "taskComplexity");
            return (Criteria) this;
        }

        public Criteria andTaskComplexityNotBetween(String value1, String value2) {
            addCriterion("task_complexity not between", value1, value2, "taskComplexity");
            return (Criteria) this;
        }

        public Criteria andTaskPriorityIsNull() {
            addCriterion("task_priority is null");
            return (Criteria) this;
        }

        public Criteria andTaskPriorityIsNotNull() {
            addCriterion("task_priority is not null");
            return (Criteria) this;
        }

        public Criteria andTaskPriorityEqualTo(Integer value) {
            addCriterion("task_priority =", value, "taskPriority");
            return (Criteria) this;
        }

        public Criteria andTaskPriorityNotEqualTo(Integer value) {
            addCriterion("task_priority <>", value, "taskPriority");
            return (Criteria) this;
        }

        public Criteria andTaskPriorityGreaterThan(Integer value) {
            addCriterion("task_priority >", value, "taskPriority");
            return (Criteria) this;
        }

        public Criteria andTaskPriorityGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_priority >=", value, "taskPriority");
            return (Criteria) this;
        }

        public Criteria andTaskPriorityLessThan(Integer value) {
            addCriterion("task_priority <", value, "taskPriority");
            return (Criteria) this;
        }

        public Criteria andTaskPriorityLessThanOrEqualTo(Integer value) {
            addCriterion("task_priority <=", value, "taskPriority");
            return (Criteria) this;
        }

        public Criteria andTaskPriorityIn(List<Integer> values) {
            addCriterion("task_priority in", values, "taskPriority");
            return (Criteria) this;
        }

        public Criteria andTaskPriorityNotIn(List<Integer> values) {
            addCriterion("task_priority not in", values, "taskPriority");
            return (Criteria) this;
        }

        public Criteria andTaskPriorityBetween(Integer value1, Integer value2) {
            addCriterion("task_priority between", value1, value2, "taskPriority");
            return (Criteria) this;
        }

        public Criteria andTaskPriorityNotBetween(Integer value1, Integer value2) {
            addCriterion("task_priority not between", value1, value2, "taskPriority");
            return (Criteria) this;
        }

        public Criteria andPlanIdIsNull() {
            addCriterion("plan_id is null");
            return (Criteria) this;
        }

        public Criteria andPlanIdIsNotNull() {
            addCriterion("plan_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlanIdEqualTo(String value) {
            addCriterion("plan_id =", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdNotEqualTo(String value) {
            addCriterion("plan_id <>", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdGreaterThan(String value) {
            addCriterion("plan_id >", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdGreaterThanOrEqualTo(String value) {
            addCriterion("plan_id >=", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdLessThan(String value) {
            addCriterion("plan_id <", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdLessThanOrEqualTo(String value) {
            addCriterion("plan_id <=", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdLike(String value) {
            addCriterion("plan_id like", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdNotLike(String value) {
            addCriterion("plan_id not like", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdIn(List<String> values) {
            addCriterion("plan_id in", values, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdNotIn(List<String> values) {
            addCriterion("plan_id not in", values, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdBetween(String value1, String value2) {
            addCriterion("plan_id between", value1, value2, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdNotBetween(String value1, String value2) {
            addCriterion("plan_id not between", value1, value2, "planId");
            return (Criteria) this;
        }

        public Criteria andR1IsNull() {
            addCriterion("r1 is null");
            return (Criteria) this;
        }

        public Criteria andR1IsNotNull() {
            addCriterion("r1 is not null");
            return (Criteria) this;
        }

        public Criteria andR1EqualTo(String value) {
            addCriterion("r1 =", value, "r1");
            return (Criteria) this;
        }

        public Criteria andR1NotEqualTo(String value) {
            addCriterion("r1 <>", value, "r1");
            return (Criteria) this;
        }

        public Criteria andR1GreaterThan(String value) {
            addCriterion("r1 >", value, "r1");
            return (Criteria) this;
        }

        public Criteria andR1GreaterThanOrEqualTo(String value) {
            addCriterion("r1 >=", value, "r1");
            return (Criteria) this;
        }

        public Criteria andR1LessThan(String value) {
            addCriterion("r1 <", value, "r1");
            return (Criteria) this;
        }

        public Criteria andR1LessThanOrEqualTo(String value) {
            addCriterion("r1 <=", value, "r1");
            return (Criteria) this;
        }

        public Criteria andR1Like(String value) {
            addCriterion("r1 like", value, "r1");
            return (Criteria) this;
        }

        public Criteria andR1NotLike(String value) {
            addCriterion("r1 not like", value, "r1");
            return (Criteria) this;
        }

        public Criteria andR1In(List<String> values) {
            addCriterion("r1 in", values, "r1");
            return (Criteria) this;
        }

        public Criteria andR1NotIn(List<String> values) {
            addCriterion("r1 not in", values, "r1");
            return (Criteria) this;
        }

        public Criteria andR1Between(String value1, String value2) {
            addCriterion("r1 between", value1, value2, "r1");
            return (Criteria) this;
        }

        public Criteria andR1NotBetween(String value1, String value2) {
            addCriterion("r1 not between", value1, value2, "r1");
            return (Criteria) this;
        }

        public Criteria andR2IsNull() {
            addCriterion("r2 is null");
            return (Criteria) this;
        }

        public Criteria andR2IsNotNull() {
            addCriterion("r2 is not null");
            return (Criteria) this;
        }

        public Criteria andR2EqualTo(String value) {
            addCriterion("r2 =", value, "r2");
            return (Criteria) this;
        }

        public Criteria andR2NotEqualTo(String value) {
            addCriterion("r2 <>", value, "r2");
            return (Criteria) this;
        }

        public Criteria andR2GreaterThan(String value) {
            addCriterion("r2 >", value, "r2");
            return (Criteria) this;
        }

        public Criteria andR2GreaterThanOrEqualTo(String value) {
            addCriterion("r2 >=", value, "r2");
            return (Criteria) this;
        }

        public Criteria andR2LessThan(String value) {
            addCriterion("r2 <", value, "r2");
            return (Criteria) this;
        }

        public Criteria andR2LessThanOrEqualTo(String value) {
            addCriterion("r2 <=", value, "r2");
            return (Criteria) this;
        }

        public Criteria andR2Like(String value) {
            addCriterion("r2 like", value, "r2");
            return (Criteria) this;
        }

        public Criteria andR2NotLike(String value) {
            addCriterion("r2 not like", value, "r2");
            return (Criteria) this;
        }

        public Criteria andR2In(List<String> values) {
            addCriterion("r2 in", values, "r2");
            return (Criteria) this;
        }

        public Criteria andR2NotIn(List<String> values) {
            addCriterion("r2 not in", values, "r2");
            return (Criteria) this;
        }

        public Criteria andR2Between(String value1, String value2) {
            addCriterion("r2 between", value1, value2, "r2");
            return (Criteria) this;
        }

        public Criteria andR2NotBetween(String value1, String value2) {
            addCriterion("r2 not between", value1, value2, "r2");
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