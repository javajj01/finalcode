package com.baizhi.vo;

import java.io.Serializable;

/**
 * Created by asus on 2017/6/13.
 */
public class LawerLawerType  implements Serializable {
    private String id;
    private String name;
    private String typename;

    public LawerLawerType() {
    }

    @Override
    public String toString() {
        return "LawerLawerType{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", typename='" + typename + '\'' +
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

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public LawerLawerType(String id, String name, String typename) {
        this.id = id;
        this.name = name;
        this.typename = typename;
    }
}
