package com.baizhi.vo;

import java.io.Serializable;

/**
 * Created by asus on 2017/6/14.
 */
public class UserLawer  implements Serializable {
    private String uid;
    private String username;
    private String lid;
    private String lawername;
    private String laweraddress;
    private String lawerphone;

    public UserLawer() {
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLid() {
        return lid;
    }

    public void setLid(String lid) {
        this.lid = lid;
    }

    public String getLawername() {
        return lawername;
    }

    public void setLawername(String lawername) {
        this.lawername = lawername;
    }

    public String getLaweraddress() {
        return laweraddress;
    }

    public void setLaweraddress(String laweraddress) {
        this.laweraddress = laweraddress;
    }

    public String getLawerphone() {
        return lawerphone;
    }

    public void setLawerphone(String lawerphone) {
        this.lawerphone = lawerphone;
    }
}
