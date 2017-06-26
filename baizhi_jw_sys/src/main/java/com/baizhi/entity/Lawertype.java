package com.baizhi.entity;

import java.io.Serializable;
import java.util.List;

public class Lawertype  implements Serializable {
    private String id;

    private String name;

    private List<Lawer> lawers;


    public Lawertype(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Lawertype() {
    }

    public List<Lawer> getLawers() {
        return lawers;
    }

    public void setLawers(List<Lawer> lawers) {
        this.lawers = lawers;
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
}