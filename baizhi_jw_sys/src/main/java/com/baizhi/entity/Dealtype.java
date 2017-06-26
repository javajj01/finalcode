package com.baizhi.entity;

import java.io.Serializable;
import java.util.List;

public class Dealtype  implements Serializable {
    private String id;

    private String name;

    private String flag;

    private Dealtype dealtype;


    private List<Dealtype> dealtypes;

    public List<Dealtype> getDealtypes() {
        return dealtypes;
    }

    public void setDealtypes(List<Dealtype> dealtypes) {
        this.dealtypes = dealtypes;
    }

    private List<Deal> deals;

    @Override
    public String toString() {
        return "Dealtype{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", flag='" + flag + '\'' +
                '}';
    }

    public Dealtype() {
    }

    public Dealtype(String id, String name, String flag) {
        this.id = id;
        this.name = name;
        this.flag = flag;
    }

    public Dealtype getDealtype() {
        return dealtype;
    }

    public void setDealtype(Dealtype dealtype) {
        this.dealtype = dealtype;
    }

    public List<Deal> getDeals() {
        return deals;
    }

    public void setDeals(List<Deal> deals) {
        this.deals = deals;
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

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}