package com.baizhi.vo;

import java.util.Date;

/**
 * Created by asus on 2017/6/14.
 */
public class UserOrder {
    private String oid;
    private String uid;
    private String username;
    private String ordercontent;
    private String comment;
    private String lid;
    private String lawername;
    private Integer status;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getOrdercontent() {
        return ordercontent;
    }

    public void setOrdercontent(String ordercontent) {
        this.ordercontent = ordercontent;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getLid() {
        return lid;
    }

    public void setLid(String lid) {
        this.lid = lid;
    }

    public String getLawername() {
        return lawername;
    }

    public void setLawername(String lawername) {
        this.lawername = lawername;
    }



    public UserOrder() {
    }
}
