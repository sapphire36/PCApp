package com.dou.domain;

import java.util.ArrayList;
import java.util.List;

public class PumbExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PumbExample() {
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

        public Criteria andPumbIdIsNull() {
            addCriterion("pumb_id is null");
            return (Criteria) this;
        }

        public Criteria andPumbIdIsNotNull() {
            addCriterion("pumb_id is not null");
            return (Criteria) this;
        }

        public Criteria andPumbIdEqualTo(Integer value) {
            addCriterion("pumb_id =", value, "pumbId");
            return (Criteria) this;
        }

        public Criteria andPumbIdNotEqualTo(Integer value) {
            addCriterion("pumb_id <>", value, "pumbId");
            return (Criteria) this;
        }

        public Criteria andPumbIdGreaterThan(Integer value) {
            addCriterion("pumb_id >", value, "pumbId");
            return (Criteria) this;
        }

        public Criteria andPumbIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pumb_id >=", value, "pumbId");
            return (Criteria) this;
        }

        public Criteria andPumbIdLessThan(Integer value) {
            addCriterion("pumb_id <", value, "pumbId");
            return (Criteria) this;
        }

        public Criteria andPumbIdLessThanOrEqualTo(Integer value) {
            addCriterion("pumb_id <=", value, "pumbId");
            return (Criteria) this;
        }

        public Criteria andPumbIdIn(List<Integer> values) {
            addCriterion("pumb_id in", values, "pumbId");
            return (Criteria) this;
        }

        public Criteria andPumbIdNotIn(List<Integer> values) {
            addCriterion("pumb_id not in", values, "pumbId");
            return (Criteria) this;
        }

        public Criteria andPumbIdBetween(Integer value1, Integer value2) {
            addCriterion("pumb_id between", value1, value2, "pumbId");
            return (Criteria) this;
        }

        public Criteria andPumbIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pumb_id not between", value1, value2, "pumbId");
            return (Criteria) this;
        }

        public Criteria andMachinecdeIsNull() {
            addCriterion("machinecde is null");
            return (Criteria) this;
        }

        public Criteria andMachinecdeIsNotNull() {
            addCriterion("machinecde is not null");
            return (Criteria) this;
        }

        public Criteria andMachinecdeEqualTo(String value) {
            addCriterion("machinecde =", value, "machinecde");
            return (Criteria) this;
        }

        public Criteria andMachinecdeNotEqualTo(String value) {
            addCriterion("machinecde <>", value, "machinecde");
            return (Criteria) this;
        }

        public Criteria andMachinecdeGreaterThan(String value) {
            addCriterion("machinecde >", value, "machinecde");
            return (Criteria) this;
        }

        public Criteria andMachinecdeGreaterThanOrEqualTo(String value) {
            addCriterion("machinecde >=", value, "machinecde");
            return (Criteria) this;
        }

        public Criteria andMachinecdeLessThan(String value) {
            addCriterion("machinecde <", value, "machinecde");
            return (Criteria) this;
        }

        public Criteria andMachinecdeLessThanOrEqualTo(String value) {
            addCriterion("machinecde <=", value, "machinecde");
            return (Criteria) this;
        }

        public Criteria andMachinecdeLike(String value) {
            addCriterion("machinecde like", value, "machinecde");
            return (Criteria) this;
        }

        public Criteria andMachinecdeNotLike(String value) {
            addCriterion("machinecde not like", value, "machinecde");
            return (Criteria) this;
        }

        public Criteria andMachinecdeIn(List<String> values) {
            addCriterion("machinecde in", values, "machinecde");
            return (Criteria) this;
        }

        public Criteria andMachinecdeNotIn(List<String> values) {
            addCriterion("machinecde not in", values, "machinecde");
            return (Criteria) this;
        }

        public Criteria andMachinecdeBetween(String value1, String value2) {
            addCriterion("machinecde between", value1, value2, "machinecde");
            return (Criteria) this;
        }

        public Criteria andMachinecdeNotBetween(String value1, String value2) {
            addCriterion("machinecde not between", value1, value2, "machinecde");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andLocalcodingIsNull() {
            addCriterion("localcoding is null");
            return (Criteria) this;
        }

        public Criteria andLocalcodingIsNotNull() {
            addCriterion("localcoding is not null");
            return (Criteria) this;
        }

        public Criteria andLocalcodingEqualTo(String value) {
            addCriterion("localcoding =", value, "localcoding");
            return (Criteria) this;
        }

        public Criteria andLocalcodingNotEqualTo(String value) {
            addCriterion("localcoding <>", value, "localcoding");
            return (Criteria) this;
        }

        public Criteria andLocalcodingGreaterThan(String value) {
            addCriterion("localcoding >", value, "localcoding");
            return (Criteria) this;
        }

        public Criteria andLocalcodingGreaterThanOrEqualTo(String value) {
            addCriterion("localcoding >=", value, "localcoding");
            return (Criteria) this;
        }

        public Criteria andLocalcodingLessThan(String value) {
            addCriterion("localcoding <", value, "localcoding");
            return (Criteria) this;
        }

        public Criteria andLocalcodingLessThanOrEqualTo(String value) {
            addCriterion("localcoding <=", value, "localcoding");
            return (Criteria) this;
        }

        public Criteria andLocalcodingLike(String value) {
            addCriterion("localcoding like", value, "localcoding");
            return (Criteria) this;
        }

        public Criteria andLocalcodingNotLike(String value) {
            addCriterion("localcoding not like", value, "localcoding");
            return (Criteria) this;
        }

        public Criteria andLocalcodingIn(List<String> values) {
            addCriterion("localcoding in", values, "localcoding");
            return (Criteria) this;
        }

        public Criteria andLocalcodingNotIn(List<String> values) {
            addCriterion("localcoding not in", values, "localcoding");
            return (Criteria) this;
        }

        public Criteria andLocalcodingBetween(String value1, String value2) {
            addCriterion("localcoding between", value1, value2, "localcoding");
            return (Criteria) this;
        }

        public Criteria andLocalcodingNotBetween(String value1, String value2) {
            addCriterion("localcoding not between", value1, value2, "localcoding");
            return (Criteria) this;
        }

        public Criteria andUsestatusIsNull() {
            addCriterion("usestatus is null");
            return (Criteria) this;
        }

        public Criteria andUsestatusIsNotNull() {
            addCriterion("usestatus is not null");
            return (Criteria) this;
        }

        public Criteria andUsestatusEqualTo(Integer value) {
            addCriterion("usestatus =", value, "usestatus");
            return (Criteria) this;
        }

        public Criteria andUsestatusNotEqualTo(Integer value) {
            addCriterion("usestatus <>", value, "usestatus");
            return (Criteria) this;
        }

        public Criteria andUsestatusGreaterThan(Integer value) {
            addCriterion("usestatus >", value, "usestatus");
            return (Criteria) this;
        }

        public Criteria andUsestatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("usestatus >=", value, "usestatus");
            return (Criteria) this;
        }

        public Criteria andUsestatusLessThan(Integer value) {
            addCriterion("usestatus <", value, "usestatus");
            return (Criteria) this;
        }

        public Criteria andUsestatusLessThanOrEqualTo(Integer value) {
            addCriterion("usestatus <=", value, "usestatus");
            return (Criteria) this;
        }

        public Criteria andUsestatusIn(List<Integer> values) {
            addCriterion("usestatus in", values, "usestatus");
            return (Criteria) this;
        }

        public Criteria andUsestatusNotIn(List<Integer> values) {
            addCriterion("usestatus not in", values, "usestatus");
            return (Criteria) this;
        }

        public Criteria andUsestatusBetween(Integer value1, Integer value2) {
            addCriterion("usestatus between", value1, value2, "usestatus");
            return (Criteria) this;
        }

        public Criteria andUsestatusNotBetween(Integer value1, Integer value2) {
            addCriterion("usestatus not between", value1, value2, "usestatus");
            return (Criteria) this;
        }

        public Criteria andDtuIsNull() {
            addCriterion("dtu is null");
            return (Criteria) this;
        }

        public Criteria andDtuIsNotNull() {
            addCriterion("dtu is not null");
            return (Criteria) this;
        }

        public Criteria andDtuEqualTo(String value) {
            addCriterion("dtu =", value, "dtu");
            return (Criteria) this;
        }

        public Criteria andDtuNotEqualTo(String value) {
            addCriterion("dtu <>", value, "dtu");
            return (Criteria) this;
        }

        public Criteria andDtuGreaterThan(String value) {
            addCriterion("dtu >", value, "dtu");
            return (Criteria) this;
        }

        public Criteria andDtuGreaterThanOrEqualTo(String value) {
            addCriterion("dtu >=", value, "dtu");
            return (Criteria) this;
        }

        public Criteria andDtuLessThan(String value) {
            addCriterion("dtu <", value, "dtu");
            return (Criteria) this;
        }

        public Criteria andDtuLessThanOrEqualTo(String value) {
            addCriterion("dtu <=", value, "dtu");
            return (Criteria) this;
        }

        public Criteria andDtuLike(String value) {
            addCriterion("dtu like", value, "dtu");
            return (Criteria) this;
        }

        public Criteria andDtuNotLike(String value) {
            addCriterion("dtu not like", value, "dtu");
            return (Criteria) this;
        }

        public Criteria andDtuIn(List<String> values) {
            addCriterion("dtu in", values, "dtu");
            return (Criteria) this;
        }

        public Criteria andDtuNotIn(List<String> values) {
            addCriterion("dtu not in", values, "dtu");
            return (Criteria) this;
        }

        public Criteria andDtuBetween(String value1, String value2) {
            addCriterion("dtu between", value1, value2, "dtu");
            return (Criteria) this;
        }

        public Criteria andDtuNotBetween(String value1, String value2) {
            addCriterion("dtu not between", value1, value2, "dtu");
            return (Criteria) this;
        }

        public Criteria andDtuportIsNull() {
            addCriterion("dtuport is null");
            return (Criteria) this;
        }

        public Criteria andDtuportIsNotNull() {
            addCriterion("dtuport is not null");
            return (Criteria) this;
        }

        public Criteria andDtuportEqualTo(String value) {
            addCriterion("dtuport =", value, "dtuport");
            return (Criteria) this;
        }

        public Criteria andDtuportNotEqualTo(String value) {
            addCriterion("dtuport <>", value, "dtuport");
            return (Criteria) this;
        }

        public Criteria andDtuportGreaterThan(String value) {
            addCriterion("dtuport >", value, "dtuport");
            return (Criteria) this;
        }

        public Criteria andDtuportGreaterThanOrEqualTo(String value) {
            addCriterion("dtuport >=", value, "dtuport");
            return (Criteria) this;
        }

        public Criteria andDtuportLessThan(String value) {
            addCriterion("dtuport <", value, "dtuport");
            return (Criteria) this;
        }

        public Criteria andDtuportLessThanOrEqualTo(String value) {
            addCriterion("dtuport <=", value, "dtuport");
            return (Criteria) this;
        }

        public Criteria andDtuportLike(String value) {
            addCriterion("dtuport like", value, "dtuport");
            return (Criteria) this;
        }

        public Criteria andDtuportNotLike(String value) {
            addCriterion("dtuport not like", value, "dtuport");
            return (Criteria) this;
        }

        public Criteria andDtuportIn(List<String> values) {
            addCriterion("dtuport in", values, "dtuport");
            return (Criteria) this;
        }

        public Criteria andDtuportNotIn(List<String> values) {
            addCriterion("dtuport not in", values, "dtuport");
            return (Criteria) this;
        }

        public Criteria andDtuportBetween(String value1, String value2) {
            addCriterion("dtuport between", value1, value2, "dtuport");
            return (Criteria) this;
        }

        public Criteria andDtuportNotBetween(String value1, String value2) {
            addCriterion("dtuport not between", value1, value2, "dtuport");
            return (Criteria) this;
        }

        public Criteria andVillagersIsNull() {
            addCriterion("villagers is null");
            return (Criteria) this;
        }

        public Criteria andVillagersIsNotNull() {
            addCriterion("villagers is not null");
            return (Criteria) this;
        }

        public Criteria andVillagersEqualTo(String value) {
            addCriterion("villagers =", value, "villagers");
            return (Criteria) this;
        }

        public Criteria andVillagersNotEqualTo(String value) {
            addCriterion("villagers <>", value, "villagers");
            return (Criteria) this;
        }

        public Criteria andVillagersGreaterThan(String value) {
            addCriterion("villagers >", value, "villagers");
            return (Criteria) this;
        }

        public Criteria andVillagersGreaterThanOrEqualTo(String value) {
            addCriterion("villagers >=", value, "villagers");
            return (Criteria) this;
        }

        public Criteria andVillagersLessThan(String value) {
            addCriterion("villagers <", value, "villagers");
            return (Criteria) this;
        }

        public Criteria andVillagersLessThanOrEqualTo(String value) {
            addCriterion("villagers <=", value, "villagers");
            return (Criteria) this;
        }

        public Criteria andVillagersLike(String value) {
            addCriterion("villagers like", value, "villagers");
            return (Criteria) this;
        }

        public Criteria andVillagersNotLike(String value) {
            addCriterion("villagers not like", value, "villagers");
            return (Criteria) this;
        }

        public Criteria andVillagersIn(List<String> values) {
            addCriterion("villagers in", values, "villagers");
            return (Criteria) this;
        }

        public Criteria andVillagersNotIn(List<String> values) {
            addCriterion("villagers not in", values, "villagers");
            return (Criteria) this;
        }

        public Criteria andVillagersBetween(String value1, String value2) {
            addCriterion("villagers between", value1, value2, "villagers");
            return (Criteria) this;
        }

        public Criteria andVillagersNotBetween(String value1, String value2) {
            addCriterion("villagers not between", value1, value2, "villagers");
            return (Criteria) this;
        }

        public Criteria andControlmodeIsNull() {
            addCriterion("controlmode is null");
            return (Criteria) this;
        }

        public Criteria andControlmodeIsNotNull() {
            addCriterion("controlmode is not null");
            return (Criteria) this;
        }

        public Criteria andControlmodeEqualTo(Integer value) {
            addCriterion("controlmode =", value, "controlmode");
            return (Criteria) this;
        }

        public Criteria andControlmodeNotEqualTo(Integer value) {
            addCriterion("controlmode <>", value, "controlmode");
            return (Criteria) this;
        }

        public Criteria andControlmodeGreaterThan(Integer value) {
            addCriterion("controlmode >", value, "controlmode");
            return (Criteria) this;
        }

        public Criteria andControlmodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("controlmode >=", value, "controlmode");
            return (Criteria) this;
        }

        public Criteria andControlmodeLessThan(Integer value) {
            addCriterion("controlmode <", value, "controlmode");
            return (Criteria) this;
        }

        public Criteria andControlmodeLessThanOrEqualTo(Integer value) {
            addCriterion("controlmode <=", value, "controlmode");
            return (Criteria) this;
        }

        public Criteria andControlmodeIn(List<Integer> values) {
            addCriterion("controlmode in", values, "controlmode");
            return (Criteria) this;
        }

        public Criteria andControlmodeNotIn(List<Integer> values) {
            addCriterion("controlmode not in", values, "controlmode");
            return (Criteria) this;
        }

        public Criteria andControlmodeBetween(Integer value1, Integer value2) {
            addCriterion("controlmode between", value1, value2, "controlmode");
            return (Criteria) this;
        }

        public Criteria andControlmodeNotBetween(Integer value1, Integer value2) {
            addCriterion("controlmode not between", value1, value2, "controlmode");
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