package org.example;

public class Convert implements Interfaces{

    @Override
    public double CtoF(double temp){
        return (temp * 9 / 5) + 32;
    }

    @Override
    public double FtoC(double temp) {
        return (temp - 32) * 5 / 9;
    }

    @Override
    public double CtoK(double temp) {
        return temp + 273.15;
    }

    @Override
    public double KtoC(double temp) {
        return temp - 273.15;
    }

    @Override
    public double FtoK(double temp) {
        return (temp - 32) * 5 / 9 + 273.15;
    }

    @Override
    public double KtoF(double temp) {
        return (temp - 273.15) * 9 / 5 + 32;
    }
}
