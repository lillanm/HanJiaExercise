package com.lillanm.pta.day6;

import java.util.Scanner;

public class L1_30 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
            str[i] = s.next();
        }
        for (int i = 0; i < n / 2; i++) {
            for (int j = n - 1; j >= n / 2; j--) {
                if (a[i] == 0) {
                    if (a[j] == 1) {
                        System.out.println(str[i] + " " + str[j]);
                        a[j] = 3;
                        break;
                    } else {
                        continue;
                    }
                } else {
                    if (a[j] == 0) {
                        System.out.println(str[i] + " " + str[j]);
                        a[j] = 3;
                        break;
                    } else {
                        continue;
                    }
                }

            }
        }

    }

}
