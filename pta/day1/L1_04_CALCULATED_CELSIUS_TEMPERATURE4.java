package com.lillanm.pta.day1;

import java.util.Scanner;

public class L1_04_CALCULATED_CELSIUS_TEMPERATURE4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int F = scan.nextInt();
        double C = 5 * ((F - 32)*1.0 / 9);
        System.out.print("Celsius = " + (int)C);
    }
}
