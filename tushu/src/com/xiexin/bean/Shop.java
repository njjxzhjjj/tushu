package com.xiexin.bean;

import java.io.Serializable;

/**
 * shop
 * @author 
 */
public class Shop implements Serializable {
    private Integer bid;

    @Override
    public String toString() {
        return "Shop{" +
                "bid=" + bid +
                ", bookname='" + bookname + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    private String bookname;

    private String province;

    private String city;

    private String author;

    private Float price;

    private static final long serialVersionUID = 1L;

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}