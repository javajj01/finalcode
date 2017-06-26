package com.baizhi.entity;

import java.io.Serializable;
import java.util.List;

public class Order implements Serializable {
    private String id;


    private String content;

    private String type;

    private Integer status;
    private Double ordermoney;

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", content='" + content + '\'' +
                ", type='" + type + '\'' +
                ", status=" + status +
                ", ordermoney=" + ordermoney +
                '}';
    }

    public Order(String id, String content, String type, Integer status, Double ordermoney) {
        this.id = id;
        this.content = content;
        this.type = type;
        this.status = status;
        this.ordermoney = ordermoney;
    }

    public Double getOrdermoney() {
        return ordermoney;
    }

    public void setOrdermoney(Double ordermoney) {
        this.ordermoney = ordermoney;
    }

    private User user;
    private Lawer lawer;
    private Comment comment;

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public Order() {
    }





    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Lawer getLawer() {
        return lawer;
    }

    public void setLawer(Lawer lawer) {
        this.lawer = lawer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }





    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}