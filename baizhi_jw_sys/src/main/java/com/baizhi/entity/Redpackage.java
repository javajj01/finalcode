package com.baizhi.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class Redpackage  implements Serializable {
    private String id;

    private BigDecimal redpackage;

    private String content;

    private User user;
    private Lawer lawer;


    @Override
    public String toString() {
        return "Redpackage{" +
                "id='" + id + '\'' +
                ", redpackage=" + redpackage +
                ", content='" + content + '\'' +
                '}';
    }

    public Redpackage() {
    }

    public Redpackage(String id, BigDecimal redpackage, String content) {
        this.id = id;
        this.redpackage = redpackage;
        this.content = content;
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

    public BigDecimal getRedpackage() {
        return redpackage;
    }

    public void setRedpackage(BigDecimal redpackage) {
        this.redpackage = redpackage;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}