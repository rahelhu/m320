package org.example;
/**
 * Ein Goalie ist dafür da zu verhindern, dass der Ball ins Tor geworfen wird.
* @author  Rahel Hüppi
* @version 1.0
* @since   2024-09-23
 */

public class Goalie extends Spieler{
    double koerperGroesse;

    @Override
    public void spielen() {
        super.spielen();
        System.out.println("Goalie");
    }
}
