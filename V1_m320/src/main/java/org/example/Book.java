package org.example;

public class Book extends Media {
    private String isbn;

    public Book(float price, int year, String title, String isbn) {
        super(price, year, title);
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }
}
