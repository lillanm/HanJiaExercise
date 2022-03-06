package com.lillanm.pta.day10;

import java.util.Scanner;

public class L1_63 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // int sex=sc.nextInt();
        int count;
        count = sc.nextInt();
        int[] sex = new int[count];
        int[] height = new int[count];
        int[] weight = new int[count];

        for (int i = 0; i < count; i++) {
            sex[i] = sc.nextInt();
            height[i] = sc.nextInt();
            weight[i] = sc.nextInt();
        }
        for (int i = 0; i < count; i++) {

            if (sex[i] == 1) {
                if (height[i] < 130) {
                    System.out.print("duo chi yu!");
                    System.out.print(" ");
                }
                if (height[i] > 130) {
                    System.out.print("ni li hai!");
                    System.out.print(" ");
                }
                if (height[i] == 130) {
                    System.out.print("wan mei!");
                    System.out.print(" ");
                }
                if (weight[i] < 27) {
                    System.out.print("duo chi rou!");
                    System.out.println("");
                }
                if (weight[i] > 27) {
                    System.out.print("shao chi rou!");
                    System.out.println("");
                }
                if (weight[i] == 27) {
                    System.out.print("wan mei!");
                    System.out.println("");
                }
            }
            if (sex[i] == 0) {
                if (height[i] < 129) {
                    System.out.print("duo chi yu!");
                    System.out.print(" ");
                }
                if (height[i] > 129) {
                    System.out.print("ni li hai!");
                    System.out.print(" ");
                }
                if (height[i] == 129) {
                    System.out.print("wan mei!");
                    System.out.print(" "
                            + "");
                }
                if (weight[i] < 25) {
                    System.out.print("duo chi rou!");
                    System.out.println("");
                }
                if (weight[i] > 25) {
                    System.out.print("shao chi rou!");
                    System.out.println("");
                }
                if (weight[i] == 25) {
                    System.out.print("wan mei!");
                    System.out.println("");
                }
            }
        }

    }

}
