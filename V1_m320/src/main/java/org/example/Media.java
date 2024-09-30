package org.example;

public class Media {
    private String title;
    private int year;
    private float price;

    public Media(float price, int year, String title) {
        this.price = price;
        this.year = year;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public float getPrice() {
        return price;
    }
}
