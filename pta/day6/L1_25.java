package com.lillanm.pta.day6;

import java.util.Scanner;

public class L1_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.trim();
        String[] ch = s.split("\\s+");
        int f1 = 1, f2 = 1;
        int a = 0, b = 0;
        if (ch.length > 2) {
            f2 = 0;
        }
        try {
            a = Integer.valueOf(ch[0]);
            if (a < 1 || a > 1000) {
                f1 = 0;
            }
        } catch (Exception e) {//出错情况下
            f1 = 0;
        }
        try {
            b = Integer.valueOf(ch[ch.length - 1]);
            if (b < 1 || b > 1000) {
                f2 = 0;
            }
        } catch (Exception e) {
            f2 = 0;
        }
        if (f1 == 0) {
            System.out.print("? + ");
        } else {
            System.out.print(a + " + ");
        }
        if (f2 == 0) {
            System.out.print("? = ");
        } else {
            System.out.print(b + " = ");
        }
        if (f1 == 0 || f2 == 0) {
            System.out.print("?");
        } else {
            System.out.print(a + b);
        }
    }

}
