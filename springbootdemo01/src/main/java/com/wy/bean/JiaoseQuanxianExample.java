package com.wy.bean;

import java.util.ArrayList;
import java.util.List;

public class JiaoseQuanxianExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public JiaoseQuanxianExample() {
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

        public Criteria andJiaoseQuanxianIdIsNull() {
            addCriterion("jiaose_quanxian_id is null");
            return (Criteria) this;
        }

        public Criteria andJiaoseQuanxianIdIsNotNull() {
            addCriterion("jiaose_quanxian_id is not null");
            return (Criteria) this;
        }

        public Criteria andJiaoseQuanxianIdEqualTo(Integer value) {
            addCriterion("jiaose_quanxian_id =", value, "jiaoseQuanxianId");
            return (Criteria) this;
        }

        public Criteria andJiaoseQuanxianIdNotEqualTo(Integer value) {
            addCriterion("jiaose_quanxian_id <>", value, "jiaoseQuanxianId");
            return (Criteria) this;
        }

        public Criteria andJiaoseQuanxianIdGreaterThan(Integer value) {
            addCriterion("jiaose_quanxian_id >", value, "jiaoseQuanxianId");
            return (Criteria) this;
        }

        public Criteria andJiaoseQuanxianIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("jiaose_quanxian_id >=", value, "jiaoseQuanxianId");
            return (Criteria) this;
        }

        public Criteria andJiaoseQuanxianIdLessThan(Integer value) {
            addCriterion("jiaose_quanxian_id <", value, "jiaoseQuanxianId");
            return (Criteria) this;
        }

        public Criteria andJiaoseQuanxianIdLessThanOrEqualTo(Integer value) {
            addCriterion("jiaose_quanxian_id <=", value, "jiaoseQuanxianId");
            return (Criteria) this;
        }

        public Criteria andJiaoseQuanxianIdIn(List<Integer> values) {
            addCriterion("jiaose_quanxian_id in", values, "jiaoseQuanxianId");
            return (Criteria) this;
        }

        public Criteria andJiaoseQuanxianIdNotIn(List<Integer> values) {
            addCriterion("jiaose_quanxian_id not in", values, "jiaoseQuanxianId");
            return (Criteria) this;
        }

        public Criteria andJiaoseQuanxianIdBetween(Integer value1, Integer value2) {
            addCriterion("jiaose_quanxian_id between", value1, value2, "jiaoseQuanxianId");
            return (Criteria) this;
        }

        public Criteria andJiaoseQuanxianIdNotBetween(Integer value1, Integer value2) {
            addCriterion("jiaose_quanxian_id not between", value1, value2, "jiaoseQuanxianId");
            return (Criteria) this;
        }

        public Criteria andJiaoseIdIsNull() {
            addCriterion("jiaose_id is null");
            return (Criteria) this;
        }

        public Criteria andJiaoseIdIsNotNull() {
            addCriterion("jiaose_id is not null");
            return (Criteria) this;
        }

        public Criteria andJiaoseIdEqualTo(Integer value) {
            addCriterion("jiaose_id =", value, "jiaoseId");
            return (Criteria) this;
        }

        public Criteria andJiaoseIdNotEqualTo(Integer value) {
            addCriterion("jiaose_id <>", value, "jiaoseId");
            return (Criteria) this;
        }

        public Criteria andJiaoseIdGreaterThan(Integer value) {
            addCriterion("jiaose_id >", value, "jiaoseId");
            return (Criteria) this;
        }

        public Criteria andJiaoseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("jiaose_id >=", value, "jiaoseId");
            return (Criteria) this;
        }

        public Criteria andJiaoseIdLessThan(Integer value) {
            addCriterion("jiaose_id <", value, "jiaoseId");
            return (Criteria) this;
        }

        public Criteria andJiaoseIdLessThanOrEqualTo(Integer value) {
            addCriterion("jiaose_id <=", value, "jiaoseId");
            return (Criteria) this;
        }

        public Criteria andJiaoseIdIn(List<Integer> values) {
            addCriterion("jiaose_id in", values, "jiaoseId");
            return (Criteria) this;
        }

        public Criteria andJiaoseIdNotIn(List<Integer> values) {
            addCriterion("jiaose_id not in", values, "jiaoseId");
            return (Criteria) this;
        }

        public Criteria andJiaoseIdBetween(Integer value1, Integer value2) {
            addCriterion("jiaose_id between", value1, value2, "jiaoseId");
            return (Criteria) this;
        }

        public Criteria andJiaoseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("jiaose_id not between", value1, value2, "jiaoseId");
            return (Criteria) this;
        }

        public Criteria andQuanxianIdIsNull() {
            addCriterion("quanxian_id is null");
            return (Criteria) this;
        }

        public Criteria andQuanxianIdIsNotNull() {
            addCriterion("quanxian_id is not null");
            return (Criteria) this;
        }

        public Criteria andQuanxianIdEqualTo(Integer value) {
            addCriterion("quanxian_id =", value, "quanxianId");
            return (Criteria) this;
        }

        public Criteria andQuanxianIdNotEqualTo(Integer value) {
            addCriterion("quanxian_id <>", value, "quanxianId");
            return (Criteria) this;
        }

        public Criteria andQuanxianIdGreaterThan(Integer value) {
            addCriterion("quanxian_id >", value, "quanxianId");
            return (Criteria) this;
        }

        public Criteria andQuanxianIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("quanxian_id >=", value, "quanxianId");
            return (Criteria) this;
        }

        public Criteria andQuanxianIdLessThan(Integer value) {
            addCriterion("quanxian_id <", value, "quanxianId");
            return (Criteria) this;
        }

        public Criteria andQuanxianIdLessThanOrEqualTo(Integer value) {
            addCriterion("quanxian_id <=", value, "quanxianId");
            return (Criteria) this;
        }

        public Criteria andQuanxianIdIn(List<Integer> values) {
            addCriterion("quanxian_id in", values, "quanxianId");
            return (Criteria) this;
        }

        public Criteria andQuanxianIdNotIn(List<Integer> values) {
            addCriterion("quanxian_id not in", values, "quanxianId");
            return (Criteria) this;
        }

        public Criteria andQuanxianIdBetween(Integer value1, Integer value2) {
            addCriterion("quanxian_id between", value1, value2, "quanxianId");
            return (Criteria) this;
        }

        public Criteria andQuanxianIdNotBetween(Integer value1, Integer value2) {
            addCriterion("quanxian_id not between", value1, value2, "quanxianId");
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