package com.lillanm.pta.day6;

import java.util.Scanner;

public class L1_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();

        if (day !=5) {
            System.out.println((day+2)%7);
        }else {
            System.out.println(7);
        }
    }
}
