package com.baizhi.vo;

import java.io.Serializable;

/**
 * Created by asus on 2017/6/12.
 */
public class Choose  implements Serializable {
    private Boolean temp;


    public Choose() {
    }

    public Boolean getTemp() {
        return temp;
    }

    public void setTemp(Boolean temp) {
        this.temp = temp;
    }

    public Choose(Boolean temp) {
        this.temp= temp;
    }
}
