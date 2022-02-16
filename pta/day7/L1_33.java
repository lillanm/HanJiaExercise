package com.lillanm.pta.day7;

import java.util.Scanner;

public class L1_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int year = 0;
        int n[] = new int[4];
        for (int i = x; ; i++) {
            int count = 1;
            n[0] = i / 1000;
            n[1] = i % 1000 / 100;
            n[2] = i % 100 / 10;
            n[3] = i % 10;
            if (n[0] != n[1] && n[0] != n[2] && n[0] != n[3])
                count++;
            if (n[1] != n[2] && n[1] != n[3])
                count++;
            if (n[2] != n[3])
                count++;
            if (count == y) {
                year = i;
                break;
            }
        }
        System.out.print(year - x + " ");
        System.out.printf("%04d", year);


    }

}
