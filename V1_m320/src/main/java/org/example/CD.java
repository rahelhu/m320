package org.example;

public class CD extends Media {
    private String band;

    public CD(float price, int year, String title, String band) {
        super(price, year, title);
        this.band = band;
    }

    public String getBand() {
        return band;
    }
}
