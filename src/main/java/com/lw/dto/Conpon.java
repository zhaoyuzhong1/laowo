package com.lw.dto;

/**
 * Created by Administrator on 2019/4/10/010.
 */
public class Conpon extends BaseDTO {
    private Integer id;
    private String couponid;
    private String isuse;
    private String createdate;
    private String expdate;
    private String getmethod;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCouponid() {
        return couponid;
    }

    public void setCouponid(String couponid) {
        this.couponid = couponid;
    }

    public String getIsuse() {
        return isuse;
    }

    public void setIsuse(String isuse) {
        this.isuse = isuse;
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    public String getExpdate() {
        return expdate;
    }

    public void setExpdate(String expdate) {
        this.expdate = expdate;
    }

    public String getGetmethod() {
        return getmethod;
    }

    public void setGetmethod(String getmethod) {
        this.getmethod = getmethod;
    }
}
