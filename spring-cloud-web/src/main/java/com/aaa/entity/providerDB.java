package com.aaa.entity;

import java.io.Serializable;

/**
 * @author 钱浩洋
 * @date 2020/2/26 - 17:12
 */
public class providerDB implements Serializable {
    private Integer providerid;
    private String providername;

    @Override
    public String toString() {
        return "providerDB{" +
                "providerid=" + providerid +
                ", providername='" + providername + '\'' +
                '}';
    }

    public providerDB() {
    }

    public providerDB(Integer providerid, String providername) {
        this.providerid = providerid;
        this.providername = providername;
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


