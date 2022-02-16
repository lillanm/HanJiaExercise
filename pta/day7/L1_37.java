package com.lillanm.pta.day7;

import java.util.Scanner;

public class L1_37 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        if (n2 == 0) {
            System.out.println(n1 + "/0=Error");
        } else if (n2 < 0) {
            System.out.println(n1 + "/(" + n2 + ")=" + String.format("%.2f", n1 * 1.0 / n2));
        } else {
            System.out.println(n1 + "/" + n2 + "=" + String.format("%.2f", n1 * 1.0 / n2));
        }
    }
}
