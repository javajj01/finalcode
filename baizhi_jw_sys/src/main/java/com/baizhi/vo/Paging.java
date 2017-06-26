package com.baizhi.vo;

import com.baizhi.entity.Lawertype;

import java.io.Serializable;
import java.util.List;

/**
 * Created by asus on 2017/6/12.
 */
public class Paging<T>  implements Serializable {
    private Integer total;
    private List<T> rows;

    public Paging() {
    }

    public Paging(Integer total, List<T> rows) {
        this.total = total;
        this.rows = rows;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
