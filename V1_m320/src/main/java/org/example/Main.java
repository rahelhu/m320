package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Media> media = new ArrayList<Media>();

        CD newCd = new CD(3.3f, 2000, "CD", "CD-Band");
        media.add(newCd);

        DVD newDvd = new DVD(17, 1008, "DVD", 1);
        media.add(newDvd);

        Book newBook = new Book(12, 2006, "Buch", "978-3-7375-0553-6");
        media.add(newBook);

        for (Media curr : media) {
            System.out.println(curr.getTitle());
        }

    }
}