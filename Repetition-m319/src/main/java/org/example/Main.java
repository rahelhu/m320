package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //get Start Temperature Unit
        Scanner objScanner = new Scanner(System.in);  // Create a Scanner object
        boolean repeat = true;
        do {
            System.out.println("1. C -> F\n2. F -> C\n3. C -> K\n4. K -> C\n5. F -> K\n6. K -> F");
            int tempUnit = objScanner.nextInt(); // Read user input
            //System.out.println("Username is: " + startTempUnit);  // Output user input

            System.out.println("Temperature to convert: ");
            double tempInput = objScanner.nextDouble();

            double result = 0;
            Convert objConvert = new Convert();
            result = switch (tempUnit) {
                case 1 -> objConvert.CtoF(tempInput);
                case 2 -> objConvert.FtoC(tempInput);
                case 3 -> objConvert.CtoK(tempInput);
                case 4 -> objConvert.KtoC(tempInput);
                case 5 -> objConvert.FtoK(tempInput);
                case 6 -> objConvert.KtoF(tempInput);
                default -> result;
            };
            System.out.println(result);

            System.out.println("Another calculation? (true/false)");
            repeat = objScanner.nextBoolean();
        } while (repeat);
    }
}
