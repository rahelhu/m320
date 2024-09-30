package org.example;
/**
 * Noch Beschreibung ...... (bei allen)
 * @author  Rahel Hüppi
 * @version 1.0
 * @since   2024-09-23
 */


public class Angreifer extends Spieler{

    @Override
    public void spielen() {
        super.spielen();
        System.out.println("Angreifer");
    }

    public void jogTraining(){
        System.out.println("Hallo jogTraining");
    }
}
