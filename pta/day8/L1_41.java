package com.lillanm.pta.day8;

import java.util.Scanner;

public class L1_41 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        while (scanner.nextInt() != 250) {
            i++;
        }
        System.out.println(i);
    }
}
