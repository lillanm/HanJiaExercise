package com.lillanm.pta.day3;

import java.util.Scanner;

public class L1_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        char s[] = A.toCharArray();
        String B = sc.nextLine();
        char m[] = B.toCharArray();
        int flag[] = new int[256];
        for (int i = 0; i < m.length; i++) {
            flag[m[i]] = 1;
        }
        for (int i = 0; i < s.length; i++) {
            if (flag[s[i]] != 1)
                System.out.print(s[i]);
        }
    }
}
