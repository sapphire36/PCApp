package com.dou.domain;

public class Machine {
    private Integer machineId;

    private String machinecde;

    private String plugspec;

    private String code;

    private Integer usestatus;

    private Float voltage;

    private Float current;

    private Float power;

    private String dtu;

    private String dtuport;

    private String devicepeople;

    private String localcoding;

    private Integer elelocksta;

    private Integer valvesta;

    public Integer getMachineId() {
        return machineId;
    }

    public void setMachineId(Integer machineId) {
        this.machineId = machineId;
    }

    public String getMachinecde() {
        return machinecde;
    }

    public void setMachinecde(String machinecde) {
        this.machinecde = machinecde == null ? null : machinecde.trim();
    }

    public String getPlugspec() {
        return plugspec;
    }

    public void setPlugspec(String plugspec) {
        this.plugspec = plugspec == null ? null : plugspec.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Integer getUsestatus() {
        return usestatus;
    }

    public void setUsestatus(Integer usestatus) {
        this.usestatus = usestatus;
    }

    public Float getVoltage() {
        return voltage;
    }

    public void setVoltage(Float voltage) {
        this.voltage = voltage;
    }

    public Float getCurrent() {
        return current;
    }

    public void setCurrent(Float current) {
        this.current = current;
    }

    public Float getPower() {
        return power;
    }

    public void setPower(Float power) {
        this.power = power;
    }

    public String getDtu() {
        return dtu;
    }

    public void setDtu(String dtu) {
        this.dtu = dtu == null ? null : dtu.trim();
    }

    public String getDtuport() {
        return dtuport;
    }

    public void setDtuport(String dtuport) {
        this.dtuport = dtuport == null ? null : dtuport.trim();
    }

    public String getDevicepeople() {
        return devicepeople;
    }

    public void setDevicepeople(String devicepeople) {
        this.devicepeople = devicepeople == null ? null : devicepeople.trim();
    }

    public String getLocalcoding() {
        return localcoding;
    }

    public void setLocalcoding(String localcoding) {
        this.localcoding = localcoding == null ? null : localcoding.trim();
    }

    public Integer getElelocksta() {
        return elelocksta;
    }

    public void setElelocksta(Integer elelocksta) {
        this.elelocksta = elelocksta;
    }

    public Integer getValvesta() {
        return valvesta;
    }

    public void setValvesta(Integer valvesta) {
        this.valvesta = valvesta;
    }
}