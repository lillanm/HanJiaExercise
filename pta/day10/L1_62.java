package com.lillanm.pta.day10;

import java.util.Scanner;

public class L1_62 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        while (a-- > 0) {
            String b = input.next();
            if (b.charAt(0) + b.charAt(1) + b.charAt(2) == b.charAt(3) + b.charAt(4) + b.charAt(5))
                System.out.println("You are lucky!");
            else
                System.out.println("Wish you good luck.");
        }

    }

}
