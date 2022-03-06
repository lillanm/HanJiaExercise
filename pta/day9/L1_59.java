package com.lillanm.pta.day9;

import java.util.Scanner;

public class L1_59 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str, s;
        s = in.nextLine();
        int n = Integer.parseInt(s);
        for (int i = 1; i <= n; i++) {
            str = in.nextLine();
            if (str.matches(".*?ong,.*?ong\\.")) {
                str = str.replaceAll(" [a-z]+ [a-z]+ [a-z]+\\.", " qiao ben zhong.");
                System.out.println(str);
            } else
                System.out.println("Skipped");
        }
    }


}
