package com.lillanm.pta.day5;

import java.util.Scanner;

public class L1_18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] arr = str.split(":");
        int hh = Integer.parseInt(arr[0]);
        int mm = Integer.parseInt(arr[1]);
        if (hh >= 0 && hh <= 12) {
            System.out.println("Only " + str + ".  Too early to Dang.");
        }
        if (mm == 0) {
            for (int i = 0; i < hh - 12; i++) {
                System.out.print("Dang");
            }
        } else {
            for (int i = 0; i < hh + 1 - 12; i++) {
                System.out.print("Dang");
            }
        }
    }

}
