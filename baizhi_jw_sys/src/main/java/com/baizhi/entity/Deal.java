package com.baizhi.entity;

import java.io.Serializable;
import java.util.Date;

public class Deal  implements Serializable {
    private String id;

    private String title;

    private Date createtime;

    private String content;

    private Dealtype dt;


    public Deal() {
    }

    public Deal(String id, String title, Date createtime, String content) {
        this.id = id;
        this.title = title;
        this.createtime = createtime;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Deal{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", createtime=" + createtime +
                ", content='" + content + '\'' +
                '}';
    }

    public Dealtype getDealtype() {
        return dt;
    }

    public void setDealtype(Dealtype dealtype) {
        this.dt = dealtype;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}