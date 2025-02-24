package com.o;

public class Books {
    private String name;
    private int year;
    private int price;  

    public Books(String name, int year, int price) {
        this.name = name;
        this.year = year;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }
}


