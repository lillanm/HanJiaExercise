package com.lillanm.pta.day6;

import java.math.BigDecimal;
import java.util.Scanner;

public class L1_29 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double N = s.nextDouble();
        double rs = (N-100)*1.8;
        System.out.println(String.format("%.1f",rs));
    }
}
