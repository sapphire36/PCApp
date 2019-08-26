package com.dou.domain;

import java.io.Serializable;

public class Userinfo implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 8174460821018461513L;

	private Integer userId;

    private String name;

    private String ldnumber;

    private String password;

    private String phone;

    private String machinecde;

    private String code;

    private String addr;

    private String picture;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getLdnumber() {
        return ldnumber;
    }

    public void setLdnumber(String ldnumber) {
        this.ldnumber = ldnumber == null ? null : ldnumber.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
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

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }
}