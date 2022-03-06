package com.lillanm.pta.day9;

import java.util.Scanner;

public class L1_51 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            double s=scan.nextDouble();
            double i=scan.nextInt();
            double n=s*i*0.10;
            System.out.println(String.format("%.2f",n));
        }


}
