package com.lillanm.pta.day9;

import java.util.Scanner;

public class L1_54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        sc.nextLine();
        int[][] img = new int[n][n];
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < n; j++) {
                if (str.charAt(j) == '@') {
                    img[i][j] = 1;
                }
            }
        }
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (img[i][j] != img[n - i - 1][n - j - 1]) {
                    flag = false;
                }
            }
        }
        if (flag) {
            System.out.println("bu yong dao le");
        }
        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (img[i][j] == 1) {
                    System.out.print(s);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

}
