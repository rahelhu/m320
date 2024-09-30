package org.example;

public class Account {
    int kontoNr;
    double saldo;
    double limite;

    public Account(double parLimite) {
        saldo = 100.00;
        limite = parLimite;
    }

    public int getKontoNr() {
        return kontoNr;
    }

    public void setKontoNr(int kontoNr) {
        this.kontoNr = kontoNr;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public double einzahlen(double amount){
        saldo = saldo + amount;
        if (saldo > limite) {
            System.out.println("Kann nicht eingezahlt werden; Limite überschritten");
            saldo = saldo - amount;
            return  saldo;
        }
        return saldo;
    }


    public double abheben(double amount){
        saldo = saldo - amount;
        if (saldo < 0) {
            System.out.println("Warnung: Ihr Saldo ist unter 0.00");
            return  saldo;
        }
        return saldo;
    }


    public double ueberweisen(String toAccount, double amount){
        saldo = saldo - amount;
        return saldo;
    }
}
