package org.example;

import java.util.ArrayList;

/**
 * Eine Mannschaft besteht aus einzelnen Spieler, welche alle unterschiedliche Rollen haben.
 * Das Ziel einer Mannschaft ist, möglichst viele Tore zu schiessen.
 * @author  Rahel Hüppi
 * @version 1.0
 * @since   2024-09-23
 */

public class Mannschaft {

    public ArrayList<Spieler> mitglieder;


    public Mannschaft() {
        mitglieder = new ArrayList<>();
        mitglieder.add(new Goalie());
    }

    /**
     * @param anzVerteidiger legt fest, wie viele Verteidiger zur Mannschaft hinzugefügt werden sollen.
     */
    public void addVerteidiger(int anzVerteidiger){
        for (int i = 0; i > anzVerteidiger; i++){
            mitglieder.add(new Verteidiger());
        }
    }

    /**
     * @param anzAngreifer legt fest, wie viele Angreifer zur Mannschaft hinzugefügt werden sollen.
     */
    public void addAngreifer(int anzAngreifer){
        for (int i = 0; i > anzAngreifer; i++){
            mitglieder.add(new Angreifer());
        }
    }
}
