package com.baizhi.vo;

import java.io.Serializable;

/**
 * Created by asus on 2017/6/13.
 */
public class TwoDealtype  implements Serializable {
    private String oid;
    private String twoid;
    private String oname;
    private String twoname;

    public TwoDealtype() {
    }

    @Override
    public String toString() {
        return "TwoDealtype{" +
                "oid='" + oid + '\'' +
                ", twoid='" + twoid + '\'' +
                ", oname='" + oname + '\'' +
                ", twoname='" + twoname + '\'' +
                '}';
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getTwoid() {
        return twoid;
    }

    public void setTwoid(String twoid) {
        this.twoid = twoid;
    }

    public String getOname() {
        return oname;
    }

    public void setOname(String oname) {
        this.oname = oname;
    }

    public String getTwoname() {
        return twoname;
    }

    public void setTwoname(String twoname) {
        this.twoname = twoname;
    }
}
