package com.baizhi.vo;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.text.Format;
import java.util.Date;

/**
 * Created by asus on 2017/6/13.
 */
public class LawerComment  implements Serializable {
    private String id;
    private String name;
    private String username;
    private String content;
    @JSONField(format = "yyyy-MM-dd")
    private Date createTime;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public LawerComment() {
    }

    @Override
    public String toString() {
        return "LawerComment{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
