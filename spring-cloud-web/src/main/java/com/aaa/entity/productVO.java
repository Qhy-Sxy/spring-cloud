package com.aaa.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 钱浩洋
 * @date 2020/2/26 - 17:13
 */
public class productVO implements Serializable {
    private Integer productid;
    private String productname;
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date producetime;
    private Integer providerid;
    private String providername;

    @Override
    public String toString() {
        return "productVO{" +
                "productid=" + productid +
                ", productname='" + productname + '\'' +
                ", producetime=" + producetime +
                ", providerid=" + providerid +
                ", providername='" + providername + '\'' +
                '}';
    }

    public productVO() {
    }

    public productVO(Integer productid, String productname, Date producetime, Integer providerid, String providername) {
        this.productid = productid;
        this.productname = productname;
        this.producetime = producetime;
        this.providerid = providerid;
        this.providername = providername;
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

    public String getProvidername() {
        return providername;
    }

    public void setProvidername(String providername) {
        this.providername = providername;
    }
}

