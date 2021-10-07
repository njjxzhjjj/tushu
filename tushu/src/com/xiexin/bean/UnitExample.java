package com.xiexin.bean;

import java.util.ArrayList;
import java.util.List;

public class UnitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public UnitExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
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

        public Criteria andDeptnumIsNull() {
            addCriterion("deptNum is null");
            return (Criteria) this;
        }

        public Criteria andDeptnumIsNotNull() {
            addCriterion("deptNum is not null");
            return (Criteria) this;
        }

        public Criteria andDeptnumEqualTo(Integer value) {
            addCriterion("deptNum =", value, "deptnum");
            return (Criteria) this;
        }

        public Criteria andDeptnumNotEqualTo(Integer value) {
            addCriterion("deptNum <>", value, "deptnum");
            return (Criteria) this;
        }

        public Criteria andDeptnumGreaterThan(Integer value) {
            addCriterion("deptNum >", value, "deptnum");
            return (Criteria) this;
        }

        public Criteria andDeptnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("deptNum >=", value, "deptnum");
            return (Criteria) this;
        }

        public Criteria andDeptnumLessThan(Integer value) {
            addCriterion("deptNum <", value, "deptnum");
            return (Criteria) this;
        }

        public Criteria andDeptnumLessThanOrEqualTo(Integer value) {
            addCriterion("deptNum <=", value, "deptnum");
            return (Criteria) this;
        }

        public Criteria andDeptnumIn(List<Integer> values) {
            addCriterion("deptNum in", values, "deptnum");
            return (Criteria) this;
        }

        public Criteria andDeptnumNotIn(List<Integer> values) {
            addCriterion("deptNum not in", values, "deptnum");
            return (Criteria) this;
        }

        public Criteria andDeptnumBetween(Integer value1, Integer value2) {
            addCriterion("deptNum between", value1, value2, "deptnum");
            return (Criteria) this;
        }

        public Criteria andDeptnumNotBetween(Integer value1, Integer value2) {
            addCriterion("deptNum not between", value1, value2, "deptnum");
            return (Criteria) this;
        }

        public Criteria andDeptnameIsNull() {
            addCriterion("deptName is null");
            return (Criteria) this;
        }

        public Criteria andDeptnameIsNotNull() {
            addCriterion("deptName is not null");
            return (Criteria) this;
        }

        public Criteria andDeptnameEqualTo(String value) {
            addCriterion("deptName =", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotEqualTo(String value) {
            addCriterion("deptName <>", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameGreaterThan(String value) {
            addCriterion("deptName >", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameGreaterThanOrEqualTo(String value) {
            addCriterion("deptName >=", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameLessThan(String value) {
            addCriterion("deptName <", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameLessThanOrEqualTo(String value) {
            addCriterion("deptName <=", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameLike(String value) {
            addCriterion("deptName like", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotLike(String value) {
            addCriterion("deptName not like", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameIn(List<String> values) {
            addCriterion("deptName in", values, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotIn(List<String> values) {
            addCriterion("deptName not in", values, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameBetween(String value1, String value2) {
            addCriterion("deptName between", value1, value2, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotBetween(String value1, String value2) {
            addCriterion("deptName not between", value1, value2, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptaddrIsNull() {
            addCriterion("deptAddr is null");
            return (Criteria) this;
        }

        public Criteria andDeptaddrIsNotNull() {
            addCriterion("deptAddr is not null");
            return (Criteria) this;
        }

        public Criteria andDeptaddrEqualTo(String value) {
            addCriterion("deptAddr =", value, "deptaddr");
            return (Criteria) this;
        }

        public Criteria andDeptaddrNotEqualTo(String value) {
            addCriterion("deptAddr <>", value, "deptaddr");
            return (Criteria) this;
        }

        public Criteria andDeptaddrGreaterThan(String value) {
            addCriterion("deptAddr >", value, "deptaddr");
            return (Criteria) this;
        }

        public Criteria andDeptaddrGreaterThanOrEqualTo(String value) {
            addCriterion("deptAddr >=", value, "deptaddr");
            return (Criteria) this;
        }

        public Criteria andDeptaddrLessThan(String value) {
            addCriterion("deptAddr <", value, "deptaddr");
            return (Criteria) this;
        }

        public Criteria andDeptaddrLessThanOrEqualTo(String value) {
            addCriterion("deptAddr <=", value, "deptaddr");
            return (Criteria) this;
        }

        public Criteria andDeptaddrLike(String value) {
            addCriterion("deptAddr like", value, "deptaddr");
            return (Criteria) this;
        }

        public Criteria andDeptaddrNotLike(String value) {
            addCriterion("deptAddr not like", value, "deptaddr");
            return (Criteria) this;
        }

        public Criteria andDeptaddrIn(List<String> values) {
            addCriterion("deptAddr in", values, "deptaddr");
            return (Criteria) this;
        }

        public Criteria andDeptaddrNotIn(List<String> values) {
            addCriterion("deptAddr not in", values, "deptaddr");
            return (Criteria) this;
        }

        public Criteria andDeptaddrBetween(String value1, String value2) {
            addCriterion("deptAddr between", value1, value2, "deptaddr");
            return (Criteria) this;
        }

        public Criteria andDeptaddrNotBetween(String value1, String value2) {
            addCriterion("deptAddr not between", value1, value2, "deptaddr");
            return (Criteria) this;
        }

        public Criteria andParentnumIsNull() {
            addCriterion("parentNum is null");
            return (Criteria) this;
        }

        public Criteria andParentnumIsNotNull() {
            addCriterion("parentNum is not null");
            return (Criteria) this;
        }

        public Criteria andParentnumEqualTo(Integer value) {
            addCriterion("parentNum =", value, "parentnum");
            return (Criteria) this;
        }

        public Criteria andParentnumNotEqualTo(Integer value) {
            addCriterion("parentNum <>", value, "parentnum");
            return (Criteria) this;
        }

        public Criteria andParentnumGreaterThan(Integer value) {
            addCriterion("parentNum >", value, "parentnum");
            return (Criteria) this;
        }

        public Criteria andParentnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("parentNum >=", value, "parentnum");
            return (Criteria) this;
        }

        public Criteria andParentnumLessThan(Integer value) {
            addCriterion("parentNum <", value, "parentnum");
            return (Criteria) this;
        }

        public Criteria andParentnumLessThanOrEqualTo(Integer value) {
            addCriterion("parentNum <=", value, "parentnum");
            return (Criteria) this;
        }

        public Criteria andParentnumIn(List<Integer> values) {
            addCriterion("parentNum in", values, "parentnum");
            return (Criteria) this;
        }

        public Criteria andParentnumNotIn(List<Integer> values) {
            addCriterion("parentNum not in", values, "parentnum");
            return (Criteria) this;
        }

        public Criteria andParentnumBetween(Integer value1, Integer value2) {
            addCriterion("parentNum between", value1, value2, "parentnum");
            return (Criteria) this;
        }

        public Criteria andParentnumNotBetween(Integer value1, Integer value2) {
            addCriterion("parentNum not between", value1, value2, "parentnum");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("`status` like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("`status` not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }
    }

    /**
     */
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