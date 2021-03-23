package com.ljz.todolistspringboot.login.model;

import java.util.ArrayList;
import java.util.List;

public class LoginuserinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public LoginuserinfoExample() {
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

        public Criteria andUserLoginIdIsNull() {
            addCriterion("user_login_id is null");
            return (Criteria) this;
        }

        public Criteria andUserLoginIdIsNotNull() {
            addCriterion("user_login_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserLoginIdEqualTo(String value) {
            addCriterion("user_login_id =", value, "userLoginId");
            return (Criteria) this;
        }

        public Criteria andUserLoginIdNotEqualTo(String value) {
            addCriterion("user_login_id <>", value, "userLoginId");
            return (Criteria) this;
        }

        public Criteria andUserLoginIdGreaterThan(String value) {
            addCriterion("user_login_id >", value, "userLoginId");
            return (Criteria) this;
        }

        public Criteria andUserLoginIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_login_id >=", value, "userLoginId");
            return (Criteria) this;
        }

        public Criteria andUserLoginIdLessThan(String value) {
            addCriterion("user_login_id <", value, "userLoginId");
            return (Criteria) this;
        }

        public Criteria andUserLoginIdLessThanOrEqualTo(String value) {
            addCriterion("user_login_id <=", value, "userLoginId");
            return (Criteria) this;
        }

        public Criteria andUserLoginIdLike(String value) {
            addCriterion("user_login_id like", value, "userLoginId");
            return (Criteria) this;
        }

        public Criteria andUserLoginIdNotLike(String value) {
            addCriterion("user_login_id not like", value, "userLoginId");
            return (Criteria) this;
        }

        public Criteria andUserLoginIdIn(List<String> values) {
            addCriterion("user_login_id in", values, "userLoginId");
            return (Criteria) this;
        }

        public Criteria andUserLoginIdNotIn(List<String> values) {
            addCriterion("user_login_id not in", values, "userLoginId");
            return (Criteria) this;
        }

        public Criteria andUserLoginIdBetween(String value1, String value2) {
            addCriterion("user_login_id between", value1, value2, "userLoginId");
            return (Criteria) this;
        }

        public Criteria andUserLoginIdNotBetween(String value1, String value2) {
            addCriterion("user_login_id not between", value1, value2, "userLoginId");
            return (Criteria) this;
        }

        public Criteria andCurrentPassWordIsNull() {
            addCriterion("current_pass_word is null");
            return (Criteria) this;
        }

        public Criteria andCurrentPassWordIsNotNull() {
            addCriterion("current_pass_word is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentPassWordEqualTo(String value) {
            addCriterion("current_pass_word =", value, "currentPassWord");
            return (Criteria) this;
        }

        public Criteria andCurrentPassWordNotEqualTo(String value) {
            addCriterion("current_pass_word <>", value, "currentPassWord");
            return (Criteria) this;
        }

        public Criteria andCurrentPassWordGreaterThan(String value) {
            addCriterion("current_pass_word >", value, "currentPassWord");
            return (Criteria) this;
        }

        public Criteria andCurrentPassWordGreaterThanOrEqualTo(String value) {
            addCriterion("current_pass_word >=", value, "currentPassWord");
            return (Criteria) this;
        }

        public Criteria andCurrentPassWordLessThan(String value) {
            addCriterion("current_pass_word <", value, "currentPassWord");
            return (Criteria) this;
        }

        public Criteria andCurrentPassWordLessThanOrEqualTo(String value) {
            addCriterion("current_pass_word <=", value, "currentPassWord");
            return (Criteria) this;
        }

        public Criteria andCurrentPassWordLike(String value) {
            addCriterion("current_pass_word like", value, "currentPassWord");
            return (Criteria) this;
        }

        public Criteria andCurrentPassWordNotLike(String value) {
            addCriterion("current_pass_word not like", value, "currentPassWord");
            return (Criteria) this;
        }

        public Criteria andCurrentPassWordIn(List<String> values) {
            addCriterion("current_pass_word in", values, "currentPassWord");
            return (Criteria) this;
        }

        public Criteria andCurrentPassWordNotIn(List<String> values) {
            addCriterion("current_pass_word not in", values, "currentPassWord");
            return (Criteria) this;
        }

        public Criteria andCurrentPassWordBetween(String value1, String value2) {
            addCriterion("current_pass_word between", value1, value2, "currentPassWord");
            return (Criteria) this;
        }

        public Criteria andCurrentPassWordNotBetween(String value1, String value2) {
            addCriterion("current_pass_word not between", value1, value2, "currentPassWord");
            return (Criteria) this;
        }

        public Criteria andUseTypeIsNull() {
            addCriterion("use_type is null");
            return (Criteria) this;
        }

        public Criteria andUseTypeIsNotNull() {
            addCriterion("use_type is not null");
            return (Criteria) this;
        }

        public Criteria andUseTypeEqualTo(String value) {
            addCriterion("use_type =", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeNotEqualTo(String value) {
            addCriterion("use_type <>", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeGreaterThan(String value) {
            addCriterion("use_type >", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("use_type >=", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeLessThan(String value) {
            addCriterion("use_type <", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeLessThanOrEqualTo(String value) {
            addCriterion("use_type <=", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeLike(String value) {
            addCriterion("use_type like", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeNotLike(String value) {
            addCriterion("use_type not like", value, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeIn(List<String> values) {
            addCriterion("use_type in", values, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeNotIn(List<String> values) {
            addCriterion("use_type not in", values, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeBetween(String value1, String value2) {
            addCriterion("use_type between", value1, value2, "useType");
            return (Criteria) this;
        }

        public Criteria andUseTypeNotBetween(String value1, String value2) {
            addCriterion("use_type not between", value1, value2, "useType");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
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