package com.dou.domain;

public class Pumb {
    private Integer pumbId;

    private String machinecde;

    private String code;

    private String localcoding;

    private Integer usestatus;

    private String dtu;

    private String dtuport;

    private String villagers;

    private Integer controlmode;

    public Integer getPumbId() {
        return pumbId;
    }

    public void setPumbId(Integer pumbId) {
        this.pumbId = pumbId;
    }

    public String getMachinecde() {
        return machinecde;
    }

    public void setMachinecde(String machinecde) {
        this.machinecde = machinecde == null ? null : machinecde.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getLocalcoding() {
        return localcoding;
    }

    public void setLocalcoding(String localcoding) {
        this.localcoding = localcoding == null ? null : localcoding.trim();
    }

    public Integer getUsestatus() {
        return usestatus;
    }

    public void setUsestatus(Integer usestatus) {
        this.usestatus = usestatus;
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

    public String getVillagers() {
        return villagers;
    }

    public void setVillagers(String villagers) {
        this.villagers = villagers == null ? null : villagers.trim();
    }

    public Integer getControlmode() {
        return controlmode;
    }

    public void setControlmode(Integer controlmode) {
        this.controlmode = controlmode;
    }
}