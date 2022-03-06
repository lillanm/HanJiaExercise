package com.lillanm.pta.day9;

import java.util.Scanner;

public class L1_58 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        s = s.replaceAll("6{10,}", "27");
        s = s.replaceAll("6{4,9}", "9");
        System.out.println(s);

    }
}
