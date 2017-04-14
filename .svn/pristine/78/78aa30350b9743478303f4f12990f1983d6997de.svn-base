package com.edp.dao.domain;

import java.util.ArrayList;
import java.util.List;

public class StencilTreePoCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StencilTreePoCriteria() {
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

        public Criteria andTreeNodeNameIsNull() {
            addCriterion("tree_node_name is null");
            return (Criteria) this;
        }

        public Criteria andTreeNodeNameIsNotNull() {
            addCriterion("tree_node_name is not null");
            return (Criteria) this;
        }

        public Criteria andTreeNodeNameEqualTo(String value) {
            addCriterion("tree_node_name =", value, "treeNodeName");
            return (Criteria) this;
        }

        public Criteria andTreeNodeNameNotEqualTo(String value) {
            addCriterion("tree_node_name <>", value, "treeNodeName");
            return (Criteria) this;
        }

        public Criteria andTreeNodeNameGreaterThan(String value) {
            addCriterion("tree_node_name >", value, "treeNodeName");
            return (Criteria) this;
        }

        public Criteria andTreeNodeNameGreaterThanOrEqualTo(String value) {
            addCriterion("tree_node_name >=", value, "treeNodeName");
            return (Criteria) this;
        }

        public Criteria andTreeNodeNameLessThan(String value) {
            addCriterion("tree_node_name <", value, "treeNodeName");
            return (Criteria) this;
        }

        public Criteria andTreeNodeNameLessThanOrEqualTo(String value) {
            addCriterion("tree_node_name <=", value, "treeNodeName");
            return (Criteria) this;
        }

        public Criteria andTreeNodeNameLike(String value) {
            addCriterion("tree_node_name like", value, "treeNodeName");
            return (Criteria) this;
        }

        public Criteria andTreeNodeNameNotLike(String value) {
            addCriterion("tree_node_name not like", value, "treeNodeName");
            return (Criteria) this;
        }

        public Criteria andTreeNodeNameIn(List<String> values) {
            addCriterion("tree_node_name in", values, "treeNodeName");
            return (Criteria) this;
        }

        public Criteria andTreeNodeNameNotIn(List<String> values) {
            addCriterion("tree_node_name not in", values, "treeNodeName");
            return (Criteria) this;
        }

        public Criteria andTreeNodeNameBetween(String value1, String value2) {
            addCriterion("tree_node_name between", value1, value2, "treeNodeName");
            return (Criteria) this;
        }

        public Criteria andTreeNodeNameNotBetween(String value1, String value2) {
            addCriterion("tree_node_name not between", value1, value2, "treeNodeName");
            return (Criteria) this;
        }

        public Criteria andTreeNodeTypeIsNull() {
            addCriterion("tree_node_type is null");
            return (Criteria) this;
        }

        public Criteria andTreeNodeTypeIsNotNull() {
            addCriterion("tree_node_type is not null");
            return (Criteria) this;
        }

        public Criteria andTreeNodeTypeEqualTo(String value) {
            addCriterion("tree_node_type =", value, "treeNodeType");
            return (Criteria) this;
        }

        public Criteria andTreeNodeTypeNotEqualTo(String value) {
            addCriterion("tree_node_type <>", value, "treeNodeType");
            return (Criteria) this;
        }

        public Criteria andTreeNodeTypeGreaterThan(String value) {
            addCriterion("tree_node_type >", value, "treeNodeType");
            return (Criteria) this;
        }

        public Criteria andTreeNodeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("tree_node_type >=", value, "treeNodeType");
            return (Criteria) this;
        }

        public Criteria andTreeNodeTypeLessThan(String value) {
            addCriterion("tree_node_type <", value, "treeNodeType");
            return (Criteria) this;
        }

        public Criteria andTreeNodeTypeLessThanOrEqualTo(String value) {
            addCriterion("tree_node_type <=", value, "treeNodeType");
            return (Criteria) this;
        }

        public Criteria andTreeNodeTypeLike(String value) {
            addCriterion("tree_node_type like", value, "treeNodeType");
            return (Criteria) this;
        }

        public Criteria andTreeNodeTypeNotLike(String value) {
            addCriterion("tree_node_type not like", value, "treeNodeType");
            return (Criteria) this;
        }

        public Criteria andTreeNodeTypeIn(List<String> values) {
            addCriterion("tree_node_type in", values, "treeNodeType");
            return (Criteria) this;
        }

        public Criteria andTreeNodeTypeNotIn(List<String> values) {
            addCriterion("tree_node_type not in", values, "treeNodeType");
            return (Criteria) this;
        }

        public Criteria andTreeNodeTypeBetween(String value1, String value2) {
            addCriterion("tree_node_type between", value1, value2, "treeNodeType");
            return (Criteria) this;
        }

        public Criteria andTreeNodeTypeNotBetween(String value1, String value2) {
            addCriterion("tree_node_type not between", value1, value2, "treeNodeType");
            return (Criteria) this;
        }

        public Criteria andTreeNodeDescIsNull() {
            addCriterion("tree_node_desc is null");
            return (Criteria) this;
        }

        public Criteria andTreeNodeDescIsNotNull() {
            addCriterion("tree_node_desc is not null");
            return (Criteria) this;
        }

        public Criteria andTreeNodeDescEqualTo(String value) {
            addCriterion("tree_node_desc =", value, "treeNodeDesc");
            return (Criteria) this;
        }

        public Criteria andTreeNodeDescNotEqualTo(String value) {
            addCriterion("tree_node_desc <>", value, "treeNodeDesc");
            return (Criteria) this;
        }

        public Criteria andTreeNodeDescGreaterThan(String value) {
            addCriterion("tree_node_desc >", value, "treeNodeDesc");
            return (Criteria) this;
        }

        public Criteria andTreeNodeDescGreaterThanOrEqualTo(String value) {
            addCriterion("tree_node_desc >=", value, "treeNodeDesc");
            return (Criteria) this;
        }

        public Criteria andTreeNodeDescLessThan(String value) {
            addCriterion("tree_node_desc <", value, "treeNodeDesc");
            return (Criteria) this;
        }

        public Criteria andTreeNodeDescLessThanOrEqualTo(String value) {
            addCriterion("tree_node_desc <=", value, "treeNodeDesc");
            return (Criteria) this;
        }

        public Criteria andTreeNodeDescLike(String value) {
            addCriterion("tree_node_desc like", value, "treeNodeDesc");
            return (Criteria) this;
        }

        public Criteria andTreeNodeDescNotLike(String value) {
            addCriterion("tree_node_desc not like", value, "treeNodeDesc");
            return (Criteria) this;
        }

        public Criteria andTreeNodeDescIn(List<String> values) {
            addCriterion("tree_node_desc in", values, "treeNodeDesc");
            return (Criteria) this;
        }

        public Criteria andTreeNodeDescNotIn(List<String> values) {
            addCriterion("tree_node_desc not in", values, "treeNodeDesc");
            return (Criteria) this;
        }

        public Criteria andTreeNodeDescBetween(String value1, String value2) {
            addCriterion("tree_node_desc between", value1, value2, "treeNodeDesc");
            return (Criteria) this;
        }

        public Criteria andTreeNodeDescNotBetween(String value1, String value2) {
            addCriterion("tree_node_desc not between", value1, value2, "treeNodeDesc");
            return (Criteria) this;
        }

        public Criteria andTreeNodeStateIsNull() {
            addCriterion("tree_node_state is null");
            return (Criteria) this;
        }

        public Criteria andTreeNodeStateIsNotNull() {
            addCriterion("tree_node_state is not null");
            return (Criteria) this;
        }

        public Criteria andTreeNodeStateEqualTo(String value) {
            addCriterion("tree_node_state =", value, "treeNodeState");
            return (Criteria) this;
        }

        public Criteria andTreeNodeStateNotEqualTo(String value) {
            addCriterion("tree_node_state <>", value, "treeNodeState");
            return (Criteria) this;
        }

        public Criteria andTreeNodeStateGreaterThan(String value) {
            addCriterion("tree_node_state >", value, "treeNodeState");
            return (Criteria) this;
        }

        public Criteria andTreeNodeStateGreaterThanOrEqualTo(String value) {
            addCriterion("tree_node_state >=", value, "treeNodeState");
            return (Criteria) this;
        }

        public Criteria andTreeNodeStateLessThan(String value) {
            addCriterion("tree_node_state <", value, "treeNodeState");
            return (Criteria) this;
        }

        public Criteria andTreeNodeStateLessThanOrEqualTo(String value) {
            addCriterion("tree_node_state <=", value, "treeNodeState");
            return (Criteria) this;
        }

        public Criteria andTreeNodeStateLike(String value) {
            addCriterion("tree_node_state like", value, "treeNodeState");
            return (Criteria) this;
        }

        public Criteria andTreeNodeStateNotLike(String value) {
            addCriterion("tree_node_state not like", value, "treeNodeState");
            return (Criteria) this;
        }

        public Criteria andTreeNodeStateIn(List<String> values) {
            addCriterion("tree_node_state in", values, "treeNodeState");
            return (Criteria) this;
        }

        public Criteria andTreeNodeStateNotIn(List<String> values) {
            addCriterion("tree_node_state not in", values, "treeNodeState");
            return (Criteria) this;
        }

        public Criteria andTreeNodeStateBetween(String value1, String value2) {
            addCriterion("tree_node_state between", value1, value2, "treeNodeState");
            return (Criteria) this;
        }

        public Criteria andTreeNodeStateNotBetween(String value1, String value2) {
            addCriterion("tree_node_state not between", value1, value2, "treeNodeState");
            return (Criteria) this;
        }

        public Criteria andTreeNodeParentIsNull() {
            addCriterion("tree_node_parent is null");
            return (Criteria) this;
        }

        public Criteria andTreeNodeParentIsNotNull() {
            addCriterion("tree_node_parent is not null");
            return (Criteria) this;
        }

        public Criteria andTreeNodeParentEqualTo(String value) {
            addCriterion("tree_node_parent =", value, "treeNodeParent");
            return (Criteria) this;
        }

        public Criteria andTreeNodeParentNotEqualTo(String value) {
            addCriterion("tree_node_parent <>", value, "treeNodeParent");
            return (Criteria) this;
        }

        public Criteria andTreeNodeParentGreaterThan(String value) {
            addCriterion("tree_node_parent >", value, "treeNodeParent");
            return (Criteria) this;
        }

        public Criteria andTreeNodeParentGreaterThanOrEqualTo(String value) {
            addCriterion("tree_node_parent >=", value, "treeNodeParent");
            return (Criteria) this;
        }

        public Criteria andTreeNodeParentLessThan(String value) {
            addCriterion("tree_node_parent <", value, "treeNodeParent");
            return (Criteria) this;
        }

        public Criteria andTreeNodeParentLessThanOrEqualTo(String value) {
            addCriterion("tree_node_parent <=", value, "treeNodeParent");
            return (Criteria) this;
        }

        public Criteria andTreeNodeParentLike(String value) {
            addCriterion("tree_node_parent like", value, "treeNodeParent");
            return (Criteria) this;
        }

        public Criteria andTreeNodeParentNotLike(String value) {
            addCriterion("tree_node_parent not like", value, "treeNodeParent");
            return (Criteria) this;
        }

        public Criteria andTreeNodeParentIn(List<String> values) {
            addCriterion("tree_node_parent in", values, "treeNodeParent");
            return (Criteria) this;
        }

        public Criteria andTreeNodeParentNotIn(List<String> values) {
            addCriterion("tree_node_parent not in", values, "treeNodeParent");
            return (Criteria) this;
        }

        public Criteria andTreeNodeParentBetween(String value1, String value2) {
            addCriterion("tree_node_parent between", value1, value2, "treeNodeParent");
            return (Criteria) this;
        }

        public Criteria andTreeNodeParentNotBetween(String value1, String value2) {
            addCriterion("tree_node_parent not between", value1, value2, "treeNodeParent");
            return (Criteria) this;
        }

        public Criteria andTreeNodeIfLeafIsNull() {
            addCriterion("tree_node_if_leaf is null");
            return (Criteria) this;
        }

        public Criteria andTreeNodeIfLeafIsNotNull() {
            addCriterion("tree_node_if_leaf is not null");
            return (Criteria) this;
        }

        public Criteria andTreeNodeIfLeafEqualTo(String value) {
            addCriterion("tree_node_if_leaf =", value, "treeNodeIfLeaf");
            return (Criteria) this;
        }

        public Criteria andTreeNodeIfLeafNotEqualTo(String value) {
            addCriterion("tree_node_if_leaf <>", value, "treeNodeIfLeaf");
            return (Criteria) this;
        }

        public Criteria andTreeNodeIfLeafGreaterThan(String value) {
            addCriterion("tree_node_if_leaf >", value, "treeNodeIfLeaf");
            return (Criteria) this;
        }

        public Criteria andTreeNodeIfLeafGreaterThanOrEqualTo(String value) {
            addCriterion("tree_node_if_leaf >=", value, "treeNodeIfLeaf");
            return (Criteria) this;
        }

        public Criteria andTreeNodeIfLeafLessThan(String value) {
            addCriterion("tree_node_if_leaf <", value, "treeNodeIfLeaf");
            return (Criteria) this;
        }

        public Criteria andTreeNodeIfLeafLessThanOrEqualTo(String value) {
            addCriterion("tree_node_if_leaf <=", value, "treeNodeIfLeaf");
            return (Criteria) this;
        }

        public Criteria andTreeNodeIfLeafLike(String value) {
            addCriterion("tree_node_if_leaf like", value, "treeNodeIfLeaf");
            return (Criteria) this;
        }

        public Criteria andTreeNodeIfLeafNotLike(String value) {
            addCriterion("tree_node_if_leaf not like", value, "treeNodeIfLeaf");
            return (Criteria) this;
        }

        public Criteria andTreeNodeIfLeafIn(List<String> values) {
            addCriterion("tree_node_if_leaf in", values, "treeNodeIfLeaf");
            return (Criteria) this;
        }

        public Criteria andTreeNodeIfLeafNotIn(List<String> values) {
            addCriterion("tree_node_if_leaf not in", values, "treeNodeIfLeaf");
            return (Criteria) this;
        }

        public Criteria andTreeNodeIfLeafBetween(String value1, String value2) {
            addCriterion("tree_node_if_leaf between", value1, value2, "treeNodeIfLeaf");
            return (Criteria) this;
        }

        public Criteria andTreeNodeIfLeafNotBetween(String value1, String value2) {
            addCriterion("tree_node_if_leaf not between", value1, value2, "treeNodeIfLeaf");
            return (Criteria) this;
        }

        public Criteria andTreeNodeCreatetimeIsNull() {
            addCriterion("tree_node_createtime is null");
            return (Criteria) this;
        }

        public Criteria andTreeNodeCreatetimeIsNotNull() {
            addCriterion("tree_node_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andTreeNodeCreatetimeEqualTo(String value) {
            addCriterion("tree_node_createtime =", value, "treeNodeCreatetime");
            return (Criteria) this;
        }

        public Criteria andTreeNodeCreatetimeNotEqualTo(String value) {
            addCriterion("tree_node_createtime <>", value, "treeNodeCreatetime");
            return (Criteria) this;
        }

        public Criteria andTreeNodeCreatetimeGreaterThan(String value) {
            addCriterion("tree_node_createtime >", value, "treeNodeCreatetime");
            return (Criteria) this;
        }

        public Criteria andTreeNodeCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("tree_node_createtime >=", value, "treeNodeCreatetime");
            return (Criteria) this;
        }

        public Criteria andTreeNodeCreatetimeLessThan(String value) {
            addCriterion("tree_node_createtime <", value, "treeNodeCreatetime");
            return (Criteria) this;
        }

        public Criteria andTreeNodeCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("tree_node_createtime <=", value, "treeNodeCreatetime");
            return (Criteria) this;
        }

        public Criteria andTreeNodeCreatetimeLike(String value) {
            addCriterion("tree_node_createtime like", value, "treeNodeCreatetime");
            return (Criteria) this;
        }

        public Criteria andTreeNodeCreatetimeNotLike(String value) {
            addCriterion("tree_node_createtime not like", value, "treeNodeCreatetime");
            return (Criteria) this;
        }

        public Criteria andTreeNodeCreatetimeIn(List<String> values) {
            addCriterion("tree_node_createtime in", values, "treeNodeCreatetime");
            return (Criteria) this;
        }

        public Criteria andTreeNodeCreatetimeNotIn(List<String> values) {
            addCriterion("tree_node_createtime not in", values, "treeNodeCreatetime");
            return (Criteria) this;
        }

        public Criteria andTreeNodeCreatetimeBetween(String value1, String value2) {
            addCriterion("tree_node_createtime between", value1, value2, "treeNodeCreatetime");
            return (Criteria) this;
        }

        public Criteria andTreeNodeCreatetimeNotBetween(String value1, String value2) {
            addCriterion("tree_node_createtime not between", value1, value2, "treeNodeCreatetime");
            return (Criteria) this;
        }

        public Criteria andTreeNodeCreatepersonIsNull() {
            addCriterion("tree_node_createperson is null");
            return (Criteria) this;
        }

        public Criteria andTreeNodeCreatepersonIsNotNull() {
            addCriterion("tree_node_createperson is not null");
            return (Criteria) this;
        }

        public Criteria andTreeNodeCreatepersonEqualTo(String value) {
            addCriterion("tree_node_createperson =", value, "treeNodeCreateperson");
            return (Criteria) this;
        }

        public Criteria andTreeNodeCreatepersonNotEqualTo(String value) {
            addCriterion("tree_node_createperson <>", value, "treeNodeCreateperson");
            return (Criteria) this;
        }

        public Criteria andTreeNodeCreatepersonGreaterThan(String value) {
            addCriterion("tree_node_createperson >", value, "treeNodeCreateperson");
            return (Criteria) this;
        }

        public Criteria andTreeNodeCreatepersonGreaterThanOrEqualTo(String value) {
            addCriterion("tree_node_createperson >=", value, "treeNodeCreateperson");
            return (Criteria) this;
        }

        public Criteria andTreeNodeCreatepersonLessThan(String value) {
            addCriterion("tree_node_createperson <", value, "treeNodeCreateperson");
            return (Criteria) this;
        }

        public Criteria andTreeNodeCreatepersonLessThanOrEqualTo(String value) {
            addCriterion("tree_node_createperson <=", value, "treeNodeCreateperson");
            return (Criteria) this;
        }

        public Criteria andTreeNodeCreatepersonLike(String value) {
            addCriterion("tree_node_createperson like", value, "treeNodeCreateperson");
            return (Criteria) this;
        }

        public Criteria andTreeNodeCreatepersonNotLike(String value) {
            addCriterion("tree_node_createperson not like", value, "treeNodeCreateperson");
            return (Criteria) this;
        }

        public Criteria andTreeNodeCreatepersonIn(List<String> values) {
            addCriterion("tree_node_createperson in", values, "treeNodeCreateperson");
            return (Criteria) this;
        }

        public Criteria andTreeNodeCreatepersonNotIn(List<String> values) {
            addCriterion("tree_node_createperson not in", values, "treeNodeCreateperson");
            return (Criteria) this;
        }

        public Criteria andTreeNodeCreatepersonBetween(String value1, String value2) {
            addCriterion("tree_node_createperson between", value1, value2, "treeNodeCreateperson");
            return (Criteria) this;
        }

        public Criteria andTreeNodeCreatepersonNotBetween(String value1, String value2) {
            addCriterion("tree_node_createperson not between", value1, value2, "treeNodeCreateperson");
            return (Criteria) this;
        }

        public Criteria andTreeNodeModifiedtimeIsNull() {
            addCriterion("tree_node_modifiedtime is null");
            return (Criteria) this;
        }

        public Criteria andTreeNodeModifiedtimeIsNotNull() {
            addCriterion("tree_node_modifiedtime is not null");
            return (Criteria) this;
        }

        public Criteria andTreeNodeModifiedtimeEqualTo(String value) {
            addCriterion("tree_node_modifiedtime =", value, "treeNodeModifiedtime");
            return (Criteria) this;
        }

        public Criteria andTreeNodeModifiedtimeNotEqualTo(String value) {
            addCriterion("tree_node_modifiedtime <>", value, "treeNodeModifiedtime");
            return (Criteria) this;
        }

        public Criteria andTreeNodeModifiedtimeGreaterThan(String value) {
            addCriterion("tree_node_modifiedtime >", value, "treeNodeModifiedtime");
            return (Criteria) this;
        }

        public Criteria andTreeNodeModifiedtimeGreaterThanOrEqualTo(String value) {
            addCriterion("tree_node_modifiedtime >=", value, "treeNodeModifiedtime");
            return (Criteria) this;
        }

        public Criteria andTreeNodeModifiedtimeLessThan(String value) {
            addCriterion("tree_node_modifiedtime <", value, "treeNodeModifiedtime");
            return (Criteria) this;
        }

        public Criteria andTreeNodeModifiedtimeLessThanOrEqualTo(String value) {
            addCriterion("tree_node_modifiedtime <=", value, "treeNodeModifiedtime");
            return (Criteria) this;
        }

        public Criteria andTreeNodeModifiedtimeLike(String value) {
            addCriterion("tree_node_modifiedtime like", value, "treeNodeModifiedtime");
            return (Criteria) this;
        }

        public Criteria andTreeNodeModifiedtimeNotLike(String value) {
            addCriterion("tree_node_modifiedtime not like", value, "treeNodeModifiedtime");
            return (Criteria) this;
        }

        public Criteria andTreeNodeModifiedtimeIn(List<String> values) {
            addCriterion("tree_node_modifiedtime in", values, "treeNodeModifiedtime");
            return (Criteria) this;
        }

        public Criteria andTreeNodeModifiedtimeNotIn(List<String> values) {
            addCriterion("tree_node_modifiedtime not in", values, "treeNodeModifiedtime");
            return (Criteria) this;
        }

        public Criteria andTreeNodeModifiedtimeBetween(String value1, String value2) {
            addCriterion("tree_node_modifiedtime between", value1, value2, "treeNodeModifiedtime");
            return (Criteria) this;
        }

        public Criteria andTreeNodeModifiedtimeNotBetween(String value1, String value2) {
            addCriterion("tree_node_modifiedtime not between", value1, value2, "treeNodeModifiedtime");
            return (Criteria) this;
        }

        public Criteria andTreeNodeLevelsIsNull() {
            addCriterion("tree_node_levels is null");
            return (Criteria) this;
        }

        public Criteria andTreeNodeLevelsIsNotNull() {
            addCriterion("tree_node_levels is not null");
            return (Criteria) this;
        }

        public Criteria andTreeNodeLevelsEqualTo(Integer value) {
            addCriterion("tree_node_levels =", value, "treeNodeLevels");
            return (Criteria) this;
        }

        public Criteria andTreeNodeLevelsNotEqualTo(Integer value) {
            addCriterion("tree_node_levels <>", value, "treeNodeLevels");
            return (Criteria) this;
        }

        public Criteria andTreeNodeLevelsGreaterThan(Integer value) {
            addCriterion("tree_node_levels >", value, "treeNodeLevels");
            return (Criteria) this;
        }

        public Criteria andTreeNodeLevelsGreaterThanOrEqualTo(Integer value) {
            addCriterion("tree_node_levels >=", value, "treeNodeLevels");
            return (Criteria) this;
        }

        public Criteria andTreeNodeLevelsLessThan(Integer value) {
            addCriterion("tree_node_levels <", value, "treeNodeLevels");
            return (Criteria) this;
        }

        public Criteria andTreeNodeLevelsLessThanOrEqualTo(Integer value) {
            addCriterion("tree_node_levels <=", value, "treeNodeLevels");
            return (Criteria) this;
        }

        public Criteria andTreeNodeLevelsIn(List<Integer> values) {
            addCriterion("tree_node_levels in", values, "treeNodeLevels");
            return (Criteria) this;
        }

        public Criteria andTreeNodeLevelsNotIn(List<Integer> values) {
            addCriterion("tree_node_levels not in", values, "treeNodeLevels");
            return (Criteria) this;
        }

        public Criteria andTreeNodeLevelsBetween(Integer value1, Integer value2) {
            addCriterion("tree_node_levels between", value1, value2, "treeNodeLevels");
            return (Criteria) this;
        }

        public Criteria andTreeNodeLevelsNotBetween(Integer value1, Integer value2) {
            addCriterion("tree_node_levels not between", value1, value2, "treeNodeLevels");
            return (Criteria) this;
        }

        public Criteria andTreeNodeModifiedpersonIsNull() {
            addCriterion("tree_node_modifiedperson is null");
            return (Criteria) this;
        }

        public Criteria andTreeNodeModifiedpersonIsNotNull() {
            addCriterion("tree_node_modifiedperson is not null");
            return (Criteria) this;
        }

        public Criteria andTreeNodeModifiedpersonEqualTo(String value) {
            addCriterion("tree_node_modifiedperson =", value, "treeNodeModifiedperson");
            return (Criteria) this;
        }

        public Criteria andTreeNodeModifiedpersonNotEqualTo(String value) {
            addCriterion("tree_node_modifiedperson <>", value, "treeNodeModifiedperson");
            return (Criteria) this;
        }

        public Criteria andTreeNodeModifiedpersonGreaterThan(String value) {
            addCriterion("tree_node_modifiedperson >", value, "treeNodeModifiedperson");
            return (Criteria) this;
        }

        public Criteria andTreeNodeModifiedpersonGreaterThanOrEqualTo(String value) {
            addCriterion("tree_node_modifiedperson >=", value, "treeNodeModifiedperson");
            return (Criteria) this;
        }

        public Criteria andTreeNodeModifiedpersonLessThan(String value) {
            addCriterion("tree_node_modifiedperson <", value, "treeNodeModifiedperson");
            return (Criteria) this;
        }

        public Criteria andTreeNodeModifiedpersonLessThanOrEqualTo(String value) {
            addCriterion("tree_node_modifiedperson <=", value, "treeNodeModifiedperson");
            return (Criteria) this;
        }

        public Criteria andTreeNodeModifiedpersonLike(String value) {
            addCriterion("tree_node_modifiedperson like", value, "treeNodeModifiedperson");
            return (Criteria) this;
        }

        public Criteria andTreeNodeModifiedpersonNotLike(String value) {
            addCriterion("tree_node_modifiedperson not like", value, "treeNodeModifiedperson");
            return (Criteria) this;
        }

        public Criteria andTreeNodeModifiedpersonIn(List<String> values) {
            addCriterion("tree_node_modifiedperson in", values, "treeNodeModifiedperson");
            return (Criteria) this;
        }

        public Criteria andTreeNodeModifiedpersonNotIn(List<String> values) {
            addCriterion("tree_node_modifiedperson not in", values, "treeNodeModifiedperson");
            return (Criteria) this;
        }

        public Criteria andTreeNodeModifiedpersonBetween(String value1, String value2) {
            addCriterion("tree_node_modifiedperson between", value1, value2, "treeNodeModifiedperson");
            return (Criteria) this;
        }

        public Criteria andTreeNodeModifiedpersonNotBetween(String value1, String value2) {
            addCriterion("tree_node_modifiedperson not between", value1, value2, "treeNodeModifiedperson");
            return (Criteria) this;
        }

        public Criteria andTreeNodeIdIsNull() {
            addCriterion("tree_node_id is null");
            return (Criteria) this;
        }

        public Criteria andTreeNodeIdIsNotNull() {
            addCriterion("tree_node_id is not null");
            return (Criteria) this;
        }

        public Criteria andTreeNodeIdEqualTo(String value) {
            addCriterion("tree_node_id =", value, "treeNodeId");
            return (Criteria) this;
        }

        public Criteria andTreeNodeIdNotEqualTo(String value) {
            addCriterion("tree_node_id <>", value, "treeNodeId");
            return (Criteria) this;
        }

        public Criteria andTreeNodeIdGreaterThan(String value) {
            addCriterion("tree_node_id >", value, "treeNodeId");
            return (Criteria) this;
        }

        public Criteria andTreeNodeIdGreaterThanOrEqualTo(String value) {
            addCriterion("tree_node_id >=", value, "treeNodeId");
            return (Criteria) this;
        }

        public Criteria andTreeNodeIdLessThan(String value) {
            addCriterion("tree_node_id <", value, "treeNodeId");
            return (Criteria) this;
        }

        public Criteria andTreeNodeIdLessThanOrEqualTo(String value) {
            addCriterion("tree_node_id <=", value, "treeNodeId");
            return (Criteria) this;
        }

        public Criteria andTreeNodeIdLike(String value) {
            addCriterion("tree_node_id like", value, "treeNodeId");
            return (Criteria) this;
        }

        public Criteria andTreeNodeIdNotLike(String value) {
            addCriterion("tree_node_id not like", value, "treeNodeId");
            return (Criteria) this;
        }

        public Criteria andTreeNodeIdIn(List<String> values) {
            addCriterion("tree_node_id in", values, "treeNodeId");
            return (Criteria) this;
        }

        public Criteria andTreeNodeIdNotIn(List<String> values) {
            addCriterion("tree_node_id not in", values, "treeNodeId");
            return (Criteria) this;
        }

        public Criteria andTreeNodeIdBetween(String value1, String value2) {
            addCriterion("tree_node_id between", value1, value2, "treeNodeId");
            return (Criteria) this;
        }

        public Criteria andTreeNodeIdNotBetween(String value1, String value2) {
            addCriterion("tree_node_id not between", value1, value2, "treeNodeId");
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