package com.lillanm.pta.day4;

import java.util.Scanner;

public class L1_17 {
    public static void main(String[] args) {
        String num;
        Scanner sc = new Scanner(System.in);
        num = sc.next();
        char[] ch = num.toCharArray();
        double ans = 0;
        boolean flag = false;
        boolean flag2 = false;
        if (ch[0] == '-') {
            flag = true;
        }
        int N = ch[ch.length - 1] - '0';
        if (N % 2 == 0) {
            flag2 = true;
        }
        if (flag) {
            int sum = 0;
            for (int i = 1; i < ch.length; i++) {
                if (ch[i] == '2') {
                    sum++;
                }
            }
            if (flag2) {
                ans = sum * 1.0 / (ch.length - 1) * 1.5 * 2;
            } else {
                ans = sum * 1.0 / (ch.length - 1) * 1.5;
            }
        } else {
            int sum2 = 0;
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] == '2') {
                    sum2++;
                }
            }
            if (flag2) {
                ans = sum2 * 1.0 / (ch.length) * 2;
            } else {
                ans = sum2 * 1.0 / (ch.length);
            }
        }
        ans *= 100;
        System.out.print(String.format("%.2f", ans) + "%");
    }
}
