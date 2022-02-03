package com.lillanm.pta.day3;

import java.util.Scanner;

public class L1_13 {
    public static void main(String[] args) {
        int add = 1;
        int answer = 0;
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 1; i <= N; i++) {
            add *= i;
            answer += add;
        }
        System.out.print(answer);
    }
}
