package org.example;

/**
 * Ein Spieler kann unterschiedliche Rollen haben. Mehrere Spieler bilden eine Mannschaft.
 * @author  Rahel Hüppi
 * @version 1.0
 * @since   2024-09-23
 */

public class Spieler {
    String name;


    public Spieler() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void spielen(){
        System.out.println("Hallo");
    }

}
