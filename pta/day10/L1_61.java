package com.lillanm.pta.day10;

import java.util.Scanner;

public class L1_61 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double d1 = scan.nextDouble();//体重kg;
        double d2 = scan.nextDouble();//身高m;
        double m = d1 / (Math.pow(d2, 2));
        if (m > 25) System.out.printf("%.1f\nPANG", m);
        else System.out.printf("%.1f\nHai Xing", m);
    }

}
