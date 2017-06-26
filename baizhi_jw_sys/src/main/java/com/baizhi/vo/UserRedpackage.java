package com.baizhi.vo;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by asus on 2017/6/14.
 */
public class UserRedpackage  implements Serializable {
    private String id;
    private String username;
    private BigDecimal redpackage;
    private String content;
    private String lawerid;
    private String lawername;

    public UserRedpackage() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getLawerid() {
        return lawerid;
    }

    public void setLawerid(String lawerid) {
        this.lawerid = lawerid;
    }

    public String getLawername() {
        return lawername;
    }

    public void setLawername(String lawername) {
        this.lawername = lawername;
    }
}
