package com.lillanm.pta.day3;

import java.util.Scanner;

public class L1_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int F = scanner.nextInt();
        String s = scanner.next();
        char ch = s.charAt(0);
        if (F % 2 == 0) {
            for (int i = 0; i < F / 2; i++) {
                for (int j = 0; j < F; j++) {
                    System.out.print(ch);
                }
                System.out.println();
            }
        } else {
            for (int i = 0; i < F / 2 + 1; i++) {
                for (int j = 0; j < F; j++) {
                    System.out.print(ch);
                }
                System.out.println();
            }
        }
    }
}
