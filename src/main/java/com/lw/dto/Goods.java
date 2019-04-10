package com.lw.dto;

/**
 * Created by Administrator on 2019/4/10/010.
 */
public class Goods extends BaseDTO {
    private Integer id;
    private String title;
    private String titlesub;
    private String price;
    private String priceold;
    private String pic;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitlesub() {
        return titlesub;
    }

    public void setTitlesub(String titlesub) {
        this.titlesub = titlesub;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPriceold() {
        return priceold;
    }

    public void setPriceold(String priceold) {
        this.priceold = priceold;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }
}
