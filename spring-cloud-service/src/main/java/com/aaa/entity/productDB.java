package com.aaa.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 钱浩洋
 * @date 2020/2/26 - 15:46
 */
public class productDB implements Serializable {
    private Integer productid;
    private String productname;
    private Date producetime;
    private Integer providerid;

    @Override
    public String toString() {
        return "productDB{" +
                "productid=" + productid +
                ", productname='" + productname + '\'' +
                ", producetime=" + producetime +
                ", providerid=" + providerid +
                '}';
    }

    public productDB() {
    }

    public productDB(Integer productid, String productname, Date producetime, Integer providerid) {
        this.productid = productid;
        this.productname = productname;
        this.producetime = producetime;
        this.providerid = providerid;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public Date getProducetime() {
        return producetime;
    }

    public void setProducetime(Date producetime) {
        this.producetime = producetime;
    }

    public Integer getProviderid() {
        return providerid;
    }

    public void setProviderid(Integer providerid) {
        this.providerid = providerid;
    }
}

