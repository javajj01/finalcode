package com.baizhi.entity;

import java.util.List;

public class User {
    private String id;

    private String name;

    private String phone;

    private Double money;
    private List<Order> orders;
    private List<Lawer> lawers;

    private List<Redpackage> redpackages;

    public List<Redpackage> getRedpackages() {
        return redpackages;
    }

    public void setRedpackages(List<Redpackage> redpackages) {
        this.redpackages = redpackages;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", money=" + money +
                '}';
    }

    public User(String id, String name, String phone, Double money) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.money = money;
    }

    public User() {
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}