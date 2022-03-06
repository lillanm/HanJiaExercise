package com.lillanm.pta.day9;

import java.util.Scanner;

public class L1_55 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int count1 = 0;
        int a = scan.nextInt();
        int b = scan.nextInt();
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
            if (arr[i] == 0) {
                count++;
            }
            if (arr[i] == 1) {
                count1++;
            }
        }
        if (count == 3) {
            System.out.println("The winner is a: " + a + " + " + count);
        } else if (count1 == 3)
            System.out.println("The winner is b: " + b + " + " + count1);
        else if (a > b && count >= 1) {
            System.out.println("The winner is a: " + a + " + " + count);
        } else if (b > a && count1 >= 1) {
            System.out.println("The winner is b: " + b + " + " + count1);
        }

    }

}
