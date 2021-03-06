package com.baizhi.entity;

import java.io.Serializable;
import java.util.List;

public class Admin implements Serializable{
    private String id;

    private String adminname;

    private String password;

    private String salt;

    private List<Role> roles;

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public Admin() {
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id='" + id + '\'' +
                ", adminname='" + adminname + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                '}';
    }

    public Admin(String id, String adminname, String password, String salt) {
        this.id = id;
        this.adminname = adminname;
        this.password = password;
        this.salt = salt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }
}