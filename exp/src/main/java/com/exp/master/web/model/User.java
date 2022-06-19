package com.exp.master.web.model;

import java.util.Date;

/**
 * 用户模型
 *
 * @author 覃班
 **/
public class User {
    private Long id;

    private String username;

    private String password;

    private String state;

    private Date createTime;

    // 详细地址
    private String address;
    // 驻点 (店点区域)
    private String stagnationPoint;
    // 手机号码
    private String phone;
    // 座机电话
    private String landlinePhone;

    public User() {

    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStagnationPoint() {
        return stagnationPoint;
    }

    public void setStagnationPoint(String stagnationPoint) {
        this.stagnationPoint = stagnationPoint;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLandlinePhone() {
        return landlinePhone;
    }

    public void setLandlinePhone(String landlinePhone) {
        this.landlinePhone = landlinePhone;
    }

    @Override
    public String toString() {
        return "User [id=" + id
                + ", username=" + username
                + ", password=" + password
                + ", state=" + state
                + ", createTime=" + createTime
                + ", address=" + address
                + ", stagnationPoint="+stagnationPoint
                + ", phone="+phone
                + ", landlinePhone="+landlinePhone+"]";
    }

}