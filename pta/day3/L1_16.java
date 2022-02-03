package com.lillanm.pta.day3;

import java.util.Scanner;

public class L1_16 {
    public static void main(String[] args) {
        int[] a = { 7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2 };
        char[] M = { '1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2' };
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] idCards = new String[n];
        for (int i = 0; i < n; i++) {
            idCards[i] = sc.next();
        }
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < 17; j++) {
                sum = sum + (idCards[i].charAt(j)-'0') * a[j];
            }
            int Z = sum%11;
            if(M[Z]!=idCards[i].charAt(17)) {
                flag = false;
                System.out.println(idCards[i]);
            }
        }
        if(flag) {
            System.out.println("All passed");
        }
    }
}

