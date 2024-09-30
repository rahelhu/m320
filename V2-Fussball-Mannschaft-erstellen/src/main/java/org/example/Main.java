package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");

        Scanner objScanner = new Scanner(System.in);
        Mannschaft mannschaft = new Mannschaft();

        System.out.println("Wie viele Angreifer möchten Sie hinzufügen?");
        int anzAngreifer = objScanner.nextInt();
        mannschaft.addAngreifer(anzAngreifer);

        System.out.println("Wie viele Verteidiger möchten Sie hinzufügen?");
        int anzVerteidiger = objScanner.nextInt();
        mannschaft.addVerteidiger(anzVerteidiger);

        System.out.println(mannschaft);
    }
}