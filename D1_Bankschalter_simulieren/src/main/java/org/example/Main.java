package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean repeat = true;

        Scanner objScanner = new Scanner(System.in);  // Create a Scanner object

        Account account = new Account(100000);

        do {
            System.out.println("Was möchten Sie tun?\n1. Geld abheben\n2. Geld einzahlen\n3. Saldo abfragen");
            int nextActivity = objScanner.nextInt();

            switch (nextActivity) {
                case 1:
                    System.out.println("Wie viel möchten Sie abheben?");
                    double amountAbheben = objScanner.nextDouble();
                    double saldoAbheben = account.abheben(amountAbheben);
                    System.out.println("Ihr aktueller Saldo ist: " + saldoAbheben);
                    break;
                case 2:
                    System.out.println("Wie viel möchten Sie einzahlen?");
                    double amountEinzahlen = objScanner.nextDouble();
                    double saldoEinzahlen = account.einzahlen(amountEinzahlen);
                    System.out.println("Ihr aktueller Saldo ist: " + saldoEinzahlen);
                    break;
                case 3:
                    double saldoAbfragen = account.getSaldo();
                    System.out.println("Ihr aktueller Saldo ist: " + saldoAbfragen);
                    break;
                default:
                    break;
            }
            System.out.println("Möchten Sie fortfahren (true/false)");
            repeat = objScanner.nextBoolean();

        } while (repeat);
    }
}