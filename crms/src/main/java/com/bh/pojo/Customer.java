package com.bh.pojo;

import lombok.Data;

import java.sql.Date;

@Data
public class Customer {
    private String cid;     //客户id
    private String cname;       //客户姓名
    private String gender;      //客户性别
    private Date birthday;      //客户生日
    private String cellphone;       //客户电话
    private String email;       //客户邮箱
    private String description;     //客户描述
    private String enable;      //删除标志位（1-删除  0-未删除）

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable;
    }
}
