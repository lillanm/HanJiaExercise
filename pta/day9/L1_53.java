package com.lillanm.pta.day9;

import java.util.Scanner;

public class L1_53 {
    public static void main(String[] args) {
        int n1;
        int n2;
        Scanner scanner =new Scanner(System.in);
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        int rs = n1 +n2;
        for (int i = 0; i < rs; i++) {
            System.out.println("Wang!");
        }
    }
}
