package com.baizhi.vo;

/**
 * Created by asus on 2017/6/13.
 */
public class OrderDetail {
    private String id;
    private String content;
    private String type;
    private Integer status;
    private String username;
    private String userid;
    private String lawername;
    private String lid;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "id='" + id + '\'' +
                ", content='" + content + '\'' +
                ", type='" + type + '\'' +
                ", status=" + status +
                ", username='" + username + '\'' +
                ", userid='" + userid + '\'' +
                ", lawername='" + lawername + '\'' +
                ", lid='" + lid + '\'' +
                '}';
    }

    public OrderDetail() {
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLawername() {
        return lawername;
    }

    public void setLawername(String lawername) {
        this.lawername = lawername;
    }

    public String getLid() {
        return lid;
    }

    public void setLid(String lid) {
        this.lid = lid;
    }
}
