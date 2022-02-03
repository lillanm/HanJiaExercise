package com.lillanm.pta.day3;

import java.util.Scanner;

public class L1_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int answer = (int) Math.pow(2,num);
        System.out.println("2^"+num+" + "+answer);
    }
}
