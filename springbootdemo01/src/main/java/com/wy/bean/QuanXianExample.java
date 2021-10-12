package com.wy.bean;

import java.util.ArrayList;
import java.util.List;

public class QuanXianExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public QuanXianExample() {
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

        public Criteria andQuanXianIdIsNull() {
            addCriterion("quan_xian_id is null");
            return (Criteria) this;
        }

        public Criteria andQuanXianIdIsNotNull() {
            addCriterion("quan_xian_id is not null");
            return (Criteria) this;
        }

        public Criteria andQuanXianIdEqualTo(Integer value) {
            addCriterion("quan_xian_id =", value, "quanXianId");
            return (Criteria) this;
        }

        public Criteria andQuanXianIdNotEqualTo(Integer value) {
            addCriterion("quan_xian_id <>", value, "quanXianId");
            return (Criteria) this;
        }

        public Criteria andQuanXianIdGreaterThan(Integer value) {
            addCriterion("quan_xian_id >", value, "quanXianId");
            return (Criteria) this;
        }

        public Criteria andQuanXianIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("quan_xian_id >=", value, "quanXianId");
            return (Criteria) this;
        }

        public Criteria andQuanXianIdLessThan(Integer value) {
            addCriterion("quan_xian_id <", value, "quanXianId");
            return (Criteria) this;
        }

        public Criteria andQuanXianIdLessThanOrEqualTo(Integer value) {
            addCriterion("quan_xian_id <=", value, "quanXianId");
            return (Criteria) this;
        }

        public Criteria andQuanXianIdIn(List<Integer> values) {
            addCriterion("quan_xian_id in", values, "quanXianId");
            return (Criteria) this;
        }

        public Criteria andQuanXianIdNotIn(List<Integer> values) {
            addCriterion("quan_xian_id not in", values, "quanXianId");
            return (Criteria) this;
        }

        public Criteria andQuanXianIdBetween(Integer value1, Integer value2) {
            addCriterion("quan_xian_id between", value1, value2, "quanXianId");
            return (Criteria) this;
        }

        public Criteria andQuanXianIdNotBetween(Integer value1, Integer value2) {
            addCriterion("quan_xian_id not between", value1, value2, "quanXianId");
            return (Criteria) this;
        }

        public Criteria andQuanXianCodeIsNull() {
            addCriterion("quan_xian_code is null");
            return (Criteria) this;
        }

        public Criteria andQuanXianCodeIsNotNull() {
            addCriterion("quan_xian_code is not null");
            return (Criteria) this;
        }

        public Criteria andQuanXianCodeEqualTo(String value) {
            addCriterion("quan_xian_code =", value, "quanXianCode");
            return (Criteria) this;
        }

        public Criteria andQuanXianCodeNotEqualTo(String value) {
            addCriterion("quan_xian_code <>", value, "quanXianCode");
            return (Criteria) this;
        }

        public Criteria andQuanXianCodeGreaterThan(String value) {
            addCriterion("quan_xian_code >", value, "quanXianCode");
            return (Criteria) this;
        }

        public Criteria andQuanXianCodeGreaterThanOrEqualTo(String value) {
            addCriterion("quan_xian_code >=", value, "quanXianCode");
            return (Criteria) this;
        }

        public Criteria andQuanXianCodeLessThan(String value) {
            addCriterion("quan_xian_code <", value, "quanXianCode");
            return (Criteria) this;
        }

        public Criteria andQuanXianCodeLessThanOrEqualTo(String value) {
            addCriterion("quan_xian_code <=", value, "quanXianCode");
            return (Criteria) this;
        }

        public Criteria andQuanXianCodeLike(String value) {
            addCriterion("quan_xian_code like", value, "quanXianCode");
            return (Criteria) this;
        }

        public Criteria andQuanXianCodeNotLike(String value) {
            addCriterion("quan_xian_code not like", value, "quanXianCode");
            return (Criteria) this;
        }

        public Criteria andQuanXianCodeIn(List<String> values) {
            addCriterion("quan_xian_code in", values, "quanXianCode");
            return (Criteria) this;
        }

        public Criteria andQuanXianCodeNotIn(List<String> values) {
            addCriterion("quan_xian_code not in", values, "quanXianCode");
            return (Criteria) this;
        }

        public Criteria andQuanXianCodeBetween(String value1, String value2) {
            addCriterion("quan_xian_code between", value1, value2, "quanXianCode");
            return (Criteria) this;
        }

        public Criteria andQuanXianCodeNotBetween(String value1, String value2) {
            addCriterion("quan_xian_code not between", value1, value2, "quanXianCode");
            return (Criteria) this;
        }

        public Criteria andQuanXianNameIsNull() {
            addCriterion("quan_xian_name is null");
            return (Criteria) this;
        }

        public Criteria andQuanXianNameIsNotNull() {
            addCriterion("quan_xian_name is not null");
            return (Criteria) this;
        }

        public Criteria andQuanXianNameEqualTo(String value) {
            addCriterion("quan_xian_name =", value, "quanXianName");
            return (Criteria) this;
        }

        public Criteria andQuanXianNameNotEqualTo(String value) {
            addCriterion("quan_xian_name <>", value, "quanXianName");
            return (Criteria) this;
        }

        public Criteria andQuanXianNameGreaterThan(String value) {
            addCriterion("quan_xian_name >", value, "quanXianName");
            return (Criteria) this;
        }

        public Criteria andQuanXianNameGreaterThanOrEqualTo(String value) {
            addCriterion("quan_xian_name >=", value, "quanXianName");
            return (Criteria) this;
        }

        public Criteria andQuanXianNameLessThan(String value) {
            addCriterion("quan_xian_name <", value, "quanXianName");
            return (Criteria) this;
        }

        public Criteria andQuanXianNameLessThanOrEqualTo(String value) {
            addCriterion("quan_xian_name <=", value, "quanXianName");
            return (Criteria) this;
        }

        public Criteria andQuanXianNameLike(String value) {
            addCriterion("quan_xian_name like", value, "quanXianName");
            return (Criteria) this;
        }

        public Criteria andQuanXianNameNotLike(String value) {
            addCriterion("quan_xian_name not like", value, "quanXianName");
            return (Criteria) this;
        }

        public Criteria andQuanXianNameIn(List<String> values) {
            addCriterion("quan_xian_name in", values, "quanXianName");
            return (Criteria) this;
        }

        public Criteria andQuanXianNameNotIn(List<String> values) {
            addCriterion("quan_xian_name not in", values, "quanXianName");
            return (Criteria) this;
        }

        public Criteria andQuanXianNameBetween(String value1, String value2) {
            addCriterion("quan_xian_name between", value1, value2, "quanXianName");
            return (Criteria) this;
        }

        public Criteria andQuanXianNameNotBetween(String value1, String value2) {
            addCriterion("quan_xian_name not between", value1, value2, "quanXianName");
            return (Criteria) this;
        }

        public Criteria andQuanXianPermsIsNull() {
            addCriterion("quan_xian_perms is null");
            return (Criteria) this;
        }

        public Criteria andQuanXianPermsIsNotNull() {
            addCriterion("quan_xian_perms is not null");
            return (Criteria) this;
        }

        public Criteria andQuanXianPermsEqualTo(String value) {
            addCriterion("quan_xian_perms =", value, "quanXianPerms");
            return (Criteria) this;
        }

        public Criteria andQuanXianPermsNotEqualTo(String value) {
            addCriterion("quan_xian_perms <>", value, "quanXianPerms");
            return (Criteria) this;
        }

        public Criteria andQuanXianPermsGreaterThan(String value) {
            addCriterion("quan_xian_perms >", value, "quanXianPerms");
            return (Criteria) this;
        }

        public Criteria andQuanXianPermsGreaterThanOrEqualTo(String value) {
            addCriterion("quan_xian_perms >=", value, "quanXianPerms");
            return (Criteria) this;
        }

        public Criteria andQuanXianPermsLessThan(String value) {
            addCriterion("quan_xian_perms <", value, "quanXianPerms");
            return (Criteria) this;
        }

        public Criteria andQuanXianPermsLessThanOrEqualTo(String value) {
            addCriterion("quan_xian_perms <=", value, "quanXianPerms");
            return (Criteria) this;
        }

        public Criteria andQuanXianPermsLike(String value) {
            addCriterion("quan_xian_perms like", value, "quanXianPerms");
            return (Criteria) this;
        }

        public Criteria andQuanXianPermsNotLike(String value) {
            addCriterion("quan_xian_perms not like", value, "quanXianPerms");
            return (Criteria) this;
        }

        public Criteria andQuanXianPermsIn(List<String> values) {
            addCriterion("quan_xian_perms in", values, "quanXianPerms");
            return (Criteria) this;
        }

        public Criteria andQuanXianPermsNotIn(List<String> values) {
            addCriterion("quan_xian_perms not in", values, "quanXianPerms");
            return (Criteria) this;
        }

        public Criteria andQuanXianPermsBetween(String value1, String value2) {
            addCriterion("quan_xian_perms between", value1, value2, "quanXianPerms");
            return (Criteria) this;
        }

        public Criteria andQuanXianPermsNotBetween(String value1, String value2) {
            addCriterion("quan_xian_perms not between", value1, value2, "quanXianPerms");
            return (Criteria) this;
        }

        public Criteria andQuanXianUrlIsNull() {
            addCriterion("quan_xian_url is null");
            return (Criteria) this;
        }

        public Criteria andQuanXianUrlIsNotNull() {
            addCriterion("quan_xian_url is not null");
            return (Criteria) this;
        }

        public Criteria andQuanXianUrlEqualTo(String value) {
            addCriterion("quan_xian_url =", value, "quanXianUrl");
            return (Criteria) this;
        }

        public Criteria andQuanXianUrlNotEqualTo(String value) {
            addCriterion("quan_xian_url <>", value, "quanXianUrl");
            return (Criteria) this;
        }

        public Criteria andQuanXianUrlGreaterThan(String value) {
            addCriterion("quan_xian_url >", value, "quanXianUrl");
            return (Criteria) this;
        }

        public Criteria andQuanXianUrlGreaterThanOrEqualTo(String value) {
            addCriterion("quan_xian_url >=", value, "quanXianUrl");
            return (Criteria) this;
        }

        public Criteria andQuanXianUrlLessThan(String value) {
            addCriterion("quan_xian_url <", value, "quanXianUrl");
            return (Criteria) this;
        }

        public Criteria andQuanXianUrlLessThanOrEqualTo(String value) {
            addCriterion("quan_xian_url <=", value, "quanXianUrl");
            return (Criteria) this;
        }

        public Criteria andQuanXianUrlLike(String value) {
            addCriterion("quan_xian_url like", value, "quanXianUrl");
            return (Criteria) this;
        }

        public Criteria andQuanXianUrlNotLike(String value) {
            addCriterion("quan_xian_url not like", value, "quanXianUrl");
            return (Criteria) this;
        }

        public Criteria andQuanXianUrlIn(List<String> values) {
            addCriterion("quan_xian_url in", values, "quanXianUrl");
            return (Criteria) this;
        }

        public Criteria andQuanXianUrlNotIn(List<String> values) {
            addCriterion("quan_xian_url not in", values, "quanXianUrl");
            return (Criteria) this;
        }

        public Criteria andQuanXianUrlBetween(String value1, String value2) {
            addCriterion("quan_xian_url between", value1, value2, "quanXianUrl");
            return (Criteria) this;
        }

        public Criteria andQuanXianUrlNotBetween(String value1, String value2) {
            addCriterion("quan_xian_url not between", value1, value2, "quanXianUrl");
            return (Criteria) this;
        }

        public Criteria andQuanXianMethodIsNull() {
            addCriterion("quan_xian_method is null");
            return (Criteria) this;
        }

        public Criteria andQuanXianMethodIsNotNull() {
            addCriterion("quan_xian_method is not null");
            return (Criteria) this;
        }

        public Criteria andQuanXianMethodEqualTo(String value) {
            addCriterion("quan_xian_method =", value, "quanXianMethod");
            return (Criteria) this;
        }

        public Criteria andQuanXianMethodNotEqualTo(String value) {
            addCriterion("quan_xian_method <>", value, "quanXianMethod");
            return (Criteria) this;
        }

        public Criteria andQuanXianMethodGreaterThan(String value) {
            addCriterion("quan_xian_method >", value, "quanXianMethod");
            return (Criteria) this;
        }

        public Criteria andQuanXianMethodGreaterThanOrEqualTo(String value) {
            addCriterion("quan_xian_method >=", value, "quanXianMethod");
            return (Criteria) this;
        }

        public Criteria andQuanXianMethodLessThan(String value) {
            addCriterion("quan_xian_method <", value, "quanXianMethod");
            return (Criteria) this;
        }

        public Criteria andQuanXianMethodLessThanOrEqualTo(String value) {
            addCriterion("quan_xian_method <=", value, "quanXianMethod");
            return (Criteria) this;
        }

        public Criteria andQuanXianMethodLike(String value) {
            addCriterion("quan_xian_method like", value, "quanXianMethod");
            return (Criteria) this;
        }

        public Criteria andQuanXianMethodNotLike(String value) {
            addCriterion("quan_xian_method not like", value, "quanXianMethod");
            return (Criteria) this;
        }

        public Criteria andQuanXianMethodIn(List<String> values) {
            addCriterion("quan_xian_method in", values, "quanXianMethod");
            return (Criteria) this;
        }

        public Criteria andQuanXianMethodNotIn(List<String> values) {
            addCriterion("quan_xian_method not in", values, "quanXianMethod");
            return (Criteria) this;
        }

        public Criteria andQuanXianMethodBetween(String value1, String value2) {
            addCriterion("quan_xian_method between", value1, value2, "quanXianMethod");
            return (Criteria) this;
        }

        public Criteria andQuanXianMethodNotBetween(String value1, String value2) {
            addCriterion("quan_xian_method not between", value1, value2, "quanXianMethod");
            return (Criteria) this;
        }

        public Criteria andQuanXianPidIsNull() {
            addCriterion("quan_xian_pid is null");
            return (Criteria) this;
        }

        public Criteria andQuanXianPidIsNotNull() {
            addCriterion("quan_xian_pid is not null");
            return (Criteria) this;
        }

        public Criteria andQuanXianPidEqualTo(Integer value) {
            addCriterion("quan_xian_pid =", value, "quanXianPid");
            return (Criteria) this;
        }

        public Criteria andQuanXianPidNotEqualTo(Integer value) {
            addCriterion("quan_xian_pid <>", value, "quanXianPid");
            return (Criteria) this;
        }

        public Criteria andQuanXianPidGreaterThan(Integer value) {
            addCriterion("quan_xian_pid >", value, "quanXianPid");
            return (Criteria) this;
        }

        public Criteria andQuanXianPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("quan_xian_pid >=", value, "quanXianPid");
            return (Criteria) this;
        }

        public Criteria andQuanXianPidLessThan(Integer value) {
            addCriterion("quan_xian_pid <", value, "quanXianPid");
            return (Criteria) this;
        }

        public Criteria andQuanXianPidLessThanOrEqualTo(Integer value) {
            addCriterion("quan_xian_pid <=", value, "quanXianPid");
            return (Criteria) this;
        }

        public Criteria andQuanXianPidIn(List<Integer> values) {
            addCriterion("quan_xian_pid in", values, "quanXianPid");
            return (Criteria) this;
        }

        public Criteria andQuanXianPidNotIn(List<Integer> values) {
            addCriterion("quan_xian_pid not in", values, "quanXianPid");
            return (Criteria) this;
        }

        public Criteria andQuanXianPidBetween(Integer value1, Integer value2) {
            addCriterion("quan_xian_pid between", value1, value2, "quanXianPid");
            return (Criteria) this;
        }

        public Criteria andQuanXianPidNotBetween(Integer value1, Integer value2) {
            addCriterion("quan_xian_pid not between", value1, value2, "quanXianPid");
            return (Criteria) this;
        }

        public Criteria andQuanXianOrderIsNull() {
            addCriterion("quan_xian_order is null");
            return (Criteria) this;
        }

        public Criteria andQuanXianOrderIsNotNull() {
            addCriterion("quan_xian_order is not null");
            return (Criteria) this;
        }

        public Criteria andQuanXianOrderEqualTo(Integer value) {
            addCriterion("quan_xian_order =", value, "quanXianOrder");
            return (Criteria) this;
        }

        public Criteria andQuanXianOrderNotEqualTo(Integer value) {
            addCriterion("quan_xian_order <>", value, "quanXianOrder");
            return (Criteria) this;
        }

        public Criteria andQuanXianOrderGreaterThan(Integer value) {
            addCriterion("quan_xian_order >", value, "quanXianOrder");
            return (Criteria) this;
        }

        public Criteria andQuanXianOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("quan_xian_order >=", value, "quanXianOrder");
            return (Criteria) this;
        }

        public Criteria andQuanXianOrderLessThan(Integer value) {
            addCriterion("quan_xian_order <", value, "quanXianOrder");
            return (Criteria) this;
        }

        public Criteria andQuanXianOrderLessThanOrEqualTo(Integer value) {
            addCriterion("quan_xian_order <=", value, "quanXianOrder");
            return (Criteria) this;
        }

        public Criteria andQuanXianOrderIn(List<Integer> values) {
            addCriterion("quan_xian_order in", values, "quanXianOrder");
            return (Criteria) this;
        }

        public Criteria andQuanXianOrderNotIn(List<Integer> values) {
            addCriterion("quan_xian_order not in", values, "quanXianOrder");
            return (Criteria) this;
        }

        public Criteria andQuanXianOrderBetween(Integer value1, Integer value2) {
            addCriterion("quan_xian_order between", value1, value2, "quanXianOrder");
            return (Criteria) this;
        }

        public Criteria andQuanXianOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("quan_xian_order not between", value1, value2, "quanXianOrder");
            return (Criteria) this;
        }

        public Criteria andQuanXianTypeIsNull() {
            addCriterion("quan_xian_type is null");
            return (Criteria) this;
        }

        public Criteria andQuanXianTypeIsNotNull() {
            addCriterion("quan_xian_type is not null");
            return (Criteria) this;
        }

        public Criteria andQuanXianTypeEqualTo(Integer value) {
            addCriterion("quan_xian_type =", value, "quanXianType");
            return (Criteria) this;
        }

        public Criteria andQuanXianTypeNotEqualTo(Integer value) {
            addCriterion("quan_xian_type <>", value, "quanXianType");
            return (Criteria) this;
        }

        public Criteria andQuanXianTypeGreaterThan(Integer value) {
            addCriterion("quan_xian_type >", value, "quanXianType");
            return (Criteria) this;
        }

        public Criteria andQuanXianTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("quan_xian_type >=", value, "quanXianType");
            return (Criteria) this;
        }

        public Criteria andQuanXianTypeLessThan(Integer value) {
            addCriterion("quan_xian_type <", value, "quanXianType");
            return (Criteria) this;
        }

        public Criteria andQuanXianTypeLessThanOrEqualTo(Integer value) {
            addCriterion("quan_xian_type <=", value, "quanXianType");
            return (Criteria) this;
        }

        public Criteria andQuanXianTypeIn(List<Integer> values) {
            addCriterion("quan_xian_type in", values, "quanXianType");
            return (Criteria) this;
        }

        public Criteria andQuanXianTypeNotIn(List<Integer> values) {
            addCriterion("quan_xian_type not in", values, "quanXianType");
            return (Criteria) this;
        }

        public Criteria andQuanXianTypeBetween(Integer value1, Integer value2) {
            addCriterion("quan_xian_type between", value1, value2, "quanXianType");
            return (Criteria) this;
        }

        public Criteria andQuanXianTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("quan_xian_type not between", value1, value2, "quanXianType");
            return (Criteria) this;
        }

        public Criteria andQuanXianStatusIsNull() {
            addCriterion("quan_xian_status is null");
            return (Criteria) this;
        }

        public Criteria andQuanXianStatusIsNotNull() {
            addCriterion("quan_xian_status is not null");
            return (Criteria) this;
        }

        public Criteria andQuanXianStatusEqualTo(Integer value) {
            addCriterion("quan_xian_status =", value, "quanXianStatus");
            return (Criteria) this;
        }

        public Criteria andQuanXianStatusNotEqualTo(Integer value) {
            addCriterion("quan_xian_status <>", value, "quanXianStatus");
            return (Criteria) this;
        }

        public Criteria andQuanXianStatusGreaterThan(Integer value) {
            addCriterion("quan_xian_status >", value, "quanXianStatus");
            return (Criteria) this;
        }

        public Criteria andQuanXianStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("quan_xian_status >=", value, "quanXianStatus");
            return (Criteria) this;
        }

        public Criteria andQuanXianStatusLessThan(Integer value) {
            addCriterion("quan_xian_status <", value, "quanXianStatus");
            return (Criteria) this;
        }

        public Criteria andQuanXianStatusLessThanOrEqualTo(Integer value) {
            addCriterion("quan_xian_status <=", value, "quanXianStatus");
            return (Criteria) this;
        }

        public Criteria andQuanXianStatusIn(List<Integer> values) {
            addCriterion("quan_xian_status in", values, "quanXianStatus");
            return (Criteria) this;
        }

        public Criteria andQuanXianStatusNotIn(List<Integer> values) {
            addCriterion("quan_xian_status not in", values, "quanXianStatus");
            return (Criteria) this;
        }

        public Criteria andQuanXianStatusBetween(Integer value1, Integer value2) {
            addCriterion("quan_xian_status between", value1, value2, "quanXianStatus");
            return (Criteria) this;
        }

        public Criteria andQuanXianStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("quan_xian_status not between", value1, value2, "quanXianStatus");
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