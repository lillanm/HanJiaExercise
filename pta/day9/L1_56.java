package com.lillanm.pta.day9;

import java.util.Scanner;

public class L1_56 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int shu[] = new int[n];
        String name[] = new String[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            name[i] = input.next();
            shu[i] = input.nextInt();
            sum = sum + shu[i];
        }
        int average = sum / n / 2;
        for (int i = 0; i < n; i++) {
            int s = shu[i] - average;
            if (s > 0) {
                shu[i] = s;
            } else {
                shu[i] = s * -1;
            }
        }
        int min = shu[0];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (min > shu[i]) {
                min = shu[i];
                index = i;
            }
        }
        System.out.println(average + " " + name[index]);

    }
}
