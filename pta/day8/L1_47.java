package com.lillanm.pta.day8;

import java.util.Scanner;

public class L1_47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str[] = new String[n];
        int m[] = new int[n];
        int m1[] = new int[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
            m[i] = sc.nextInt();
            m1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (m[i] < 15 || m[i] > 20 || m1[i] < 50 || m1[i] > 70) {
                System.out.println(str[i]);
            }
        }
    }


}
