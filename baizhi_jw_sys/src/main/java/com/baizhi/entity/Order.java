package com.baizhi.entity;

import java.util.List;

public class Order {
    private String id;


    private String content;

    private String type;

    private Integer status;

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

    public Order(String id, String content, String type, Integer status) {
        this.id = id;
        this.content = content;
        this.type = type;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", content='" + content + '\'' +
                ", type='" + type + '\'' +
                ", status=" + status +
                '}';
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