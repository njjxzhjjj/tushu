package com.xiexin.bean;

import java.util.ArrayList;
import java.util.List;

public class StaffExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public StaffExample() {
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

        public Criteria andEmpnumIsNull() {
            addCriterion("empNum is null");
            return (Criteria) this;
        }

        public Criteria andEmpnumIsNotNull() {
            addCriterion("empNum is not null");
            return (Criteria) this;
        }

        public Criteria andEmpnumEqualTo(Integer value) {
            addCriterion("empNum =", value, "empnum");
            return (Criteria) this;
        }

        public Criteria andEmpnumNotEqualTo(Integer value) {
            addCriterion("empNum <>", value, "empnum");
            return (Criteria) this;
        }

        public Criteria andEmpnumGreaterThan(Integer value) {
            addCriterion("empNum >", value, "empnum");
            return (Criteria) this;
        }

        public Criteria andEmpnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("empNum >=", value, "empnum");
            return (Criteria) this;
        }

        public Criteria andEmpnumLessThan(Integer value) {
            addCriterion("empNum <", value, "empnum");
            return (Criteria) this;
        }

        public Criteria andEmpnumLessThanOrEqualTo(Integer value) {
            addCriterion("empNum <=", value, "empnum");
            return (Criteria) this;
        }

        public Criteria andEmpnumIn(List<Integer> values) {
            addCriterion("empNum in", values, "empnum");
            return (Criteria) this;
        }

        public Criteria andEmpnumNotIn(List<Integer> values) {
            addCriterion("empNum not in", values, "empnum");
            return (Criteria) this;
        }

        public Criteria andEmpnumBetween(Integer value1, Integer value2) {
            addCriterion("empNum between", value1, value2, "empnum");
            return (Criteria) this;
        }

        public Criteria andEmpnumNotBetween(Integer value1, Integer value2) {
            addCriterion("empNum not between", value1, value2, "empnum");
            return (Criteria) this;
        }

        public Criteria andEmpnameIsNull() {
            addCriterion("empName is null");
            return (Criteria) this;
        }

        public Criteria andEmpnameIsNotNull() {
            addCriterion("empName is not null");
            return (Criteria) this;
        }

        public Criteria andEmpnameEqualTo(String value) {
            addCriterion("empName =", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameNotEqualTo(String value) {
            addCriterion("empName <>", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameGreaterThan(String value) {
            addCriterion("empName >", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameGreaterThanOrEqualTo(String value) {
            addCriterion("empName >=", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameLessThan(String value) {
            addCriterion("empName <", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameLessThanOrEqualTo(String value) {
            addCriterion("empName <=", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameLike(String value) {
            addCriterion("empName like", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameNotLike(String value) {
            addCriterion("empName not like", value, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameIn(List<String> values) {
            addCriterion("empName in", values, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameNotIn(List<String> values) {
            addCriterion("empName not in", values, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameBetween(String value1, String value2) {
            addCriterion("empName between", value1, value2, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpnameNotBetween(String value1, String value2) {
            addCriterion("empName not between", value1, value2, "empname");
            return (Criteria) this;
        }

        public Criteria andEmpsexIsNull() {
            addCriterion("empSex is null");
            return (Criteria) this;
        }

        public Criteria andEmpsexIsNotNull() {
            addCriterion("empSex is not null");
            return (Criteria) this;
        }

        public Criteria andEmpsexEqualTo(String value) {
            addCriterion("empSex =", value, "empsex");
            return (Criteria) this;
        }

        public Criteria andEmpsexNotEqualTo(String value) {
            addCriterion("empSex <>", value, "empsex");
            return (Criteria) this;
        }

        public Criteria andEmpsexGreaterThan(String value) {
            addCriterion("empSex >", value, "empsex");
            return (Criteria) this;
        }

        public Criteria andEmpsexGreaterThanOrEqualTo(String value) {
            addCriterion("empSex >=", value, "empsex");
            return (Criteria) this;
        }

        public Criteria andEmpsexLessThan(String value) {
            addCriterion("empSex <", value, "empsex");
            return (Criteria) this;
        }

        public Criteria andEmpsexLessThanOrEqualTo(String value) {
            addCriterion("empSex <=", value, "empsex");
            return (Criteria) this;
        }

        public Criteria andEmpsexLike(String value) {
            addCriterion("empSex like", value, "empsex");
            return (Criteria) this;
        }

        public Criteria andEmpsexNotLike(String value) {
            addCriterion("empSex not like", value, "empsex");
            return (Criteria) this;
        }

        public Criteria andEmpsexIn(List<String> values) {
            addCriterion("empSex in", values, "empsex");
            return (Criteria) this;
        }

        public Criteria andEmpsexNotIn(List<String> values) {
            addCriterion("empSex not in", values, "empsex");
            return (Criteria) this;
        }

        public Criteria andEmpsexBetween(String value1, String value2) {
            addCriterion("empSex between", value1, value2, "empsex");
            return (Criteria) this;
        }

        public Criteria andEmpsexNotBetween(String value1, String value2) {
            addCriterion("empSex not between", value1, value2, "empsex");
            return (Criteria) this;
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