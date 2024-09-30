package org.example;

import java.util.ArrayList;

/*
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

    public void addVerteidiger(int anzVerteidiger){
        for (int i = 0; i > anzVerteidiger; i++){
            mitglieder.add(new Verteidiger());
        }
    }

    public void addAngreifer(int anzAngreifer){
        for (int i = 0; i > anzAngreifer; i++){
            mitglieder.add(new Angreifer());
        }
    }
}
