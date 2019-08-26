package com.dou.domain;

import java.util.ArrayList;
import java.util.List;

public class MachineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MachineExample() {
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

        public Criteria andMachineIdIsNull() {
            addCriterion("machine_id is null");
            return (Criteria) this;
        }

        public Criteria andMachineIdIsNotNull() {
            addCriterion("machine_id is not null");
            return (Criteria) this;
        }

        public Criteria andMachineIdEqualTo(Integer value) {
            addCriterion("machine_id =", value, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdNotEqualTo(Integer value) {
            addCriterion("machine_id <>", value, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdGreaterThan(Integer value) {
            addCriterion("machine_id >", value, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("machine_id >=", value, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdLessThan(Integer value) {
            addCriterion("machine_id <", value, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdLessThanOrEqualTo(Integer value) {
            addCriterion("machine_id <=", value, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdIn(List<Integer> values) {
            addCriterion("machine_id in", values, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdNotIn(List<Integer> values) {
            addCriterion("machine_id not in", values, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdBetween(Integer value1, Integer value2) {
            addCriterion("machine_id between", value1, value2, "machineId");
            return (Criteria) this;
        }

        public Criteria andMachineIdNotBetween(Integer value1, Integer value2) {
            addCriterion("machine_id not between", value1, value2, "machineId");
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

        public Criteria andPlugspecIsNull() {
            addCriterion("plugspec is null");
            return (Criteria) this;
        }

        public Criteria andPlugspecIsNotNull() {
            addCriterion("plugspec is not null");
            return (Criteria) this;
        }

        public Criteria andPlugspecEqualTo(String value) {
            addCriterion("plugspec =", value, "plugspec");
            return (Criteria) this;
        }

        public Criteria andPlugspecNotEqualTo(String value) {
            addCriterion("plugspec <>", value, "plugspec");
            return (Criteria) this;
        }

        public Criteria andPlugspecGreaterThan(String value) {
            addCriterion("plugspec >", value, "plugspec");
            return (Criteria) this;
        }

        public Criteria andPlugspecGreaterThanOrEqualTo(String value) {
            addCriterion("plugspec >=", value, "plugspec");
            return (Criteria) this;
        }

        public Criteria andPlugspecLessThan(String value) {
            addCriterion("plugspec <", value, "plugspec");
            return (Criteria) this;
        }

        public Criteria andPlugspecLessThanOrEqualTo(String value) {
            addCriterion("plugspec <=", value, "plugspec");
            return (Criteria) this;
        }

        public Criteria andPlugspecLike(String value) {
            addCriterion("plugspec like", value, "plugspec");
            return (Criteria) this;
        }

        public Criteria andPlugspecNotLike(String value) {
            addCriterion("plugspec not like", value, "plugspec");
            return (Criteria) this;
        }

        public Criteria andPlugspecIn(List<String> values) {
            addCriterion("plugspec in", values, "plugspec");
            return (Criteria) this;
        }

        public Criteria andPlugspecNotIn(List<String> values) {
            addCriterion("plugspec not in", values, "plugspec");
            return (Criteria) this;
        }

        public Criteria andPlugspecBetween(String value1, String value2) {
            addCriterion("plugspec between", value1, value2, "plugspec");
            return (Criteria) this;
        }

        public Criteria andPlugspecNotBetween(String value1, String value2) {
            addCriterion("plugspec not between", value1, value2, "plugspec");
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

        public Criteria andVoltageIsNull() {
            addCriterion("voltage is null");
            return (Criteria) this;
        }

        public Criteria andVoltageIsNotNull() {
            addCriterion("voltage is not null");
            return (Criteria) this;
        }

        public Criteria andVoltageEqualTo(Float value) {
            addCriterion("voltage =", value, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageNotEqualTo(Float value) {
            addCriterion("voltage <>", value, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageGreaterThan(Float value) {
            addCriterion("voltage >", value, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageGreaterThanOrEqualTo(Float value) {
            addCriterion("voltage >=", value, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageLessThan(Float value) {
            addCriterion("voltage <", value, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageLessThanOrEqualTo(Float value) {
            addCriterion("voltage <=", value, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageIn(List<Float> values) {
            addCriterion("voltage in", values, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageNotIn(List<Float> values) {
            addCriterion("voltage not in", values, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageBetween(Float value1, Float value2) {
            addCriterion("voltage between", value1, value2, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageNotBetween(Float value1, Float value2) {
            addCriterion("voltage not between", value1, value2, "voltage");
            return (Criteria) this;
        }

        public Criteria andCurrentIsNull() {
            addCriterion("current is null");
            return (Criteria) this;
        }

        public Criteria andCurrentIsNotNull() {
            addCriterion("current is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentEqualTo(Float value) {
            addCriterion("current =", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentNotEqualTo(Float value) {
            addCriterion("current <>", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentGreaterThan(Float value) {
            addCriterion("current >", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentGreaterThanOrEqualTo(Float value) {
            addCriterion("current >=", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentLessThan(Float value) {
            addCriterion("current <", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentLessThanOrEqualTo(Float value) {
            addCriterion("current <=", value, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentIn(List<Float> values) {
            addCriterion("current in", values, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentNotIn(List<Float> values) {
            addCriterion("current not in", values, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentBetween(Float value1, Float value2) {
            addCriterion("current between", value1, value2, "current");
            return (Criteria) this;
        }

        public Criteria andCurrentNotBetween(Float value1, Float value2) {
            addCriterion("current not between", value1, value2, "current");
            return (Criteria) this;
        }

        public Criteria andPowerIsNull() {
            addCriterion("power is null");
            return (Criteria) this;
        }

        public Criteria andPowerIsNotNull() {
            addCriterion("power is not null");
            return (Criteria) this;
        }

        public Criteria andPowerEqualTo(Float value) {
            addCriterion("power =", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotEqualTo(Float value) {
            addCriterion("power <>", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerGreaterThan(Float value) {
            addCriterion("power >", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerGreaterThanOrEqualTo(Float value) {
            addCriterion("power >=", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLessThan(Float value) {
            addCriterion("power <", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLessThanOrEqualTo(Float value) {
            addCriterion("power <=", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerIn(List<Float> values) {
            addCriterion("power in", values, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotIn(List<Float> values) {
            addCriterion("power not in", values, "power");
            return (Criteria) this;
        }

        public Criteria andPowerBetween(Float value1, Float value2) {
            addCriterion("power between", value1, value2, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotBetween(Float value1, Float value2) {
            addCriterion("power not between", value1, value2, "power");
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

        public Criteria andDevicepeopleIsNull() {
            addCriterion("devicepeople is null");
            return (Criteria) this;
        }

        public Criteria andDevicepeopleIsNotNull() {
            addCriterion("devicepeople is not null");
            return (Criteria) this;
        }

        public Criteria andDevicepeopleEqualTo(String value) {
            addCriterion("devicepeople =", value, "devicepeople");
            return (Criteria) this;
        }

        public Criteria andDevicepeopleNotEqualTo(String value) {
            addCriterion("devicepeople <>", value, "devicepeople");
            return (Criteria) this;
        }

        public Criteria andDevicepeopleGreaterThan(String value) {
            addCriterion("devicepeople >", value, "devicepeople");
            return (Criteria) this;
        }

        public Criteria andDevicepeopleGreaterThanOrEqualTo(String value) {
            addCriterion("devicepeople >=", value, "devicepeople");
            return (Criteria) this;
        }

        public Criteria andDevicepeopleLessThan(String value) {
            addCriterion("devicepeople <", value, "devicepeople");
            return (Criteria) this;
        }

        public Criteria andDevicepeopleLessThanOrEqualTo(String value) {
            addCriterion("devicepeople <=", value, "devicepeople");
            return (Criteria) this;
        }

        public Criteria andDevicepeopleLike(String value) {
            addCriterion("devicepeople like", value, "devicepeople");
            return (Criteria) this;
        }

        public Criteria andDevicepeopleNotLike(String value) {
            addCriterion("devicepeople not like", value, "devicepeople");
            return (Criteria) this;
        }

        public Criteria andDevicepeopleIn(List<String> values) {
            addCriterion("devicepeople in", values, "devicepeople");
            return (Criteria) this;
        }

        public Criteria andDevicepeopleNotIn(List<String> values) {
            addCriterion("devicepeople not in", values, "devicepeople");
            return (Criteria) this;
        }

        public Criteria andDevicepeopleBetween(String value1, String value2) {
            addCriterion("devicepeople between", value1, value2, "devicepeople");
            return (Criteria) this;
        }

        public Criteria andDevicepeopleNotBetween(String value1, String value2) {
            addCriterion("devicepeople not between", value1, value2, "devicepeople");
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

        public Criteria andElelockstaIsNull() {
            addCriterion("elelocksta is null");
            return (Criteria) this;
        }

        public Criteria andElelockstaIsNotNull() {
            addCriterion("elelocksta is not null");
            return (Criteria) this;
        }

        public Criteria andElelockstaEqualTo(Integer value) {
            addCriterion("elelocksta =", value, "elelocksta");
            return (Criteria) this;
        }

        public Criteria andElelockstaNotEqualTo(Integer value) {
            addCriterion("elelocksta <>", value, "elelocksta");
            return (Criteria) this;
        }

        public Criteria andElelockstaGreaterThan(Integer value) {
            addCriterion("elelocksta >", value, "elelocksta");
            return (Criteria) this;
        }

        public Criteria andElelockstaGreaterThanOrEqualTo(Integer value) {
            addCriterion("elelocksta >=", value, "elelocksta");
            return (Criteria) this;
        }

        public Criteria andElelockstaLessThan(Integer value) {
            addCriterion("elelocksta <", value, "elelocksta");
            return (Criteria) this;
        }

        public Criteria andElelockstaLessThanOrEqualTo(Integer value) {
            addCriterion("elelocksta <=", value, "elelocksta");
            return (Criteria) this;
        }

        public Criteria andElelockstaIn(List<Integer> values) {
            addCriterion("elelocksta in", values, "elelocksta");
            return (Criteria) this;
        }

        public Criteria andElelockstaNotIn(List<Integer> values) {
            addCriterion("elelocksta not in", values, "elelocksta");
            return (Criteria) this;
        }

        public Criteria andElelockstaBetween(Integer value1, Integer value2) {
            addCriterion("elelocksta between", value1, value2, "elelocksta");
            return (Criteria) this;
        }

        public Criteria andElelockstaNotBetween(Integer value1, Integer value2) {
            addCriterion("elelocksta not between", value1, value2, "elelocksta");
            return (Criteria) this;
        }

        public Criteria andValvestaIsNull() {
            addCriterion("valvesta is null");
            return (Criteria) this;
        }

        public Criteria andValvestaIsNotNull() {
            addCriterion("valvesta is not null");
            return (Criteria) this;
        }

        public Criteria andValvestaEqualTo(Integer value) {
            addCriterion("valvesta =", value, "valvesta");
            return (Criteria) this;
        }

        public Criteria andValvestaNotEqualTo(Integer value) {
            addCriterion("valvesta <>", value, "valvesta");
            return (Criteria) this;
        }

        public Criteria andValvestaGreaterThan(Integer value) {
            addCriterion("valvesta >", value, "valvesta");
            return (Criteria) this;
        }

        public Criteria andValvestaGreaterThanOrEqualTo(Integer value) {
            addCriterion("valvesta >=", value, "valvesta");
            return (Criteria) this;
        }

        public Criteria andValvestaLessThan(Integer value) {
            addCriterion("valvesta <", value, "valvesta");
            return (Criteria) this;
        }

        public Criteria andValvestaLessThanOrEqualTo(Integer value) {
            addCriterion("valvesta <=", value, "valvesta");
            return (Criteria) this;
        }

        public Criteria andValvestaIn(List<Integer> values) {
            addCriterion("valvesta in", values, "valvesta");
            return (Criteria) this;
        }

        public Criteria andValvestaNotIn(List<Integer> values) {
            addCriterion("valvesta not in", values, "valvesta");
            return (Criteria) this;
        }

        public Criteria andValvestaBetween(Integer value1, Integer value2) {
            addCriterion("valvesta between", value1, value2, "valvesta");
            return (Criteria) this;
        }

        public Criteria andValvestaNotBetween(Integer value1, Integer value2) {
            addCriterion("valvesta not between", value1, value2, "valvesta");
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