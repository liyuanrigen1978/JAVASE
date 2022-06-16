package com.liyuan.demo.shopcat1;

/**
 * @author liyuan_start
 * @create 2022-06-14 1:17
 */
public class Goods {

    private String name;
    private double price;
    private int buyNumber; // 购买数量

    public Goods(String name, double price, int buyNumber) {
        this.name = name;
        this.price = price;
        this.buyNumber = buyNumber;
    }

    public Goods() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getBuyNumber() {
        return buyNumber;
    }

    public void setBuyNumber(int buyNumber) {
        this.buyNumber = buyNumber;
    }
}
