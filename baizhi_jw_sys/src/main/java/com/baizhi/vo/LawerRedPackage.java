package com.baizhi.vo;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by asus on 2017/6/12.
 */
public class LawerRedPackage  implements Serializable {
    private String id;
    private String name;
    private BigDecimal money;
    private String username;
    private String content;

    @Override
    public String toString() {
        return "LawerRedPackage{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", money=" + money +
                ", username='" + username + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
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

    public LawerRedPackage() {
    }
}
