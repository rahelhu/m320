package org.example;

/**
 * Ein Verteidiger dient zur Unterstützung des Goalies.
 * Verteidiger sorgen dafür, dass möglichst wenig Tore geschossen werden.
 * @author  Rahel Hüppi
 * @version 1.0
 * @since   2024-09-23
 */

public class Verteidiger extends Spieler{

    @Override
    public void spielen() {
        super.spielen();
        System.out.println("Verteidiger");
    }
}
