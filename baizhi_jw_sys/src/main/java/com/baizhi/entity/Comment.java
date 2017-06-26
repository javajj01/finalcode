package com.baizhi.entity;

import java.io.Serializable;
import java.util.Date;

public class Comment  implements Serializable {
    private String id;

    private Double score;

    private String content;

    private Date createtime;

    private Order order;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id='" + id + '\'' +
                ", score=" + score +
                ", content='" + content + '\'' +
                ", createtime=" + createtime +
                '}';
    }

    public Comment() {
    }

    public Comment(String id, Double score, String content, Date createtime) {
        this.id = id;
        this.score = score;
        this.content = content;
        this.createtime = createtime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}