package org.example;

public class DVD extends Media {
    private float filmLength;

    public DVD(float price, int year, String title, float filmLength) {
        super(price, year, title);
        this.filmLength = filmLength;
    }

    public float getFilmLength() {
        return filmLength;
    }
}
