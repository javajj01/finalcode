package com.baizhi.entity;

import java.math.BigDecimal;
import java.util.List;

public class Lawer {
    private String id;

    private String name;

    private String address;

    private String year;

    private String number;

    private String workspace;

    private String description;
    private String phone;

    private BigDecimal wordprice;

    private BigDecimal phoneprice;

    private String photo;

    private String status;

    private List<Order> orders;

    private  List<Lawertype> lawertypes;

    public List<Lawertype> getLawertypes() {
        return lawertypes;
    }

    
    public void setLawertypes(List<Lawertype> lawertypes) {
        this.lawertypes = lawertypes;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    private List<Redpackage> redpackages;

    private List<Comment> comments;

    public List<Redpackage> getRedpackages() {
        return redpackages;
    }

    public void setRedpackages(List<Redpackage> redpackages) {
        this.redpackages = redpackages;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Lawer() {
    }

    @Override
    public String toString() {
        return "Lawer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", year='" + year + '\'' +
                ", number='" + number + '\'' +
                ", workspace='" + workspace + '\'' +
                ", description='" + description + '\'' +
                ", phone='" + phone + '\'' +
                ", wordprice=" + wordprice +
                ", phoneprice=" + phoneprice +
                ", photo='" + photo + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public Lawer(String id, String name, String address, String year, String number, String workspace, String description, String phone, BigDecimal wordprice, BigDecimal phoneprice, String photo, String status) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.year = year;
        this.number = number;
        this.workspace = workspace;
        this.description = description;
        this.phone = phone;
        this.wordprice = wordprice;
        this.phoneprice = phoneprice;
        this.photo = photo;
        this.status = status;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getWorkspace() {
        return workspace;
    }

    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }



    public BigDecimal getWordprice() {
        return wordprice;
    }

    public void setWordprice(BigDecimal wordprice) {
        this.wordprice = wordprice;
    }

    public BigDecimal getPhoneprice() {
        return phoneprice;
    }

    public void setPhoneprice(BigDecimal phoneprice) {
        this.phoneprice = phoneprice;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}