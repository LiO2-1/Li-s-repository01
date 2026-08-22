package com.qiyuesan.arraylist;

public class Foods {
    private String name;
    private double price;
    private String desc;

    public Foods(String name, double price, String desc) {
        this.name = name;
        this.price = price;
        this.desc = desc;
    }

    public Foods() {
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
