package com.lillanm.pta.day6;

import java.util.Scanner;

public class L1_27 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char ch[] = str.toCharArray();
        int n = str.length();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) ch[i] - 48;
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (i != j) {
                    if (ch[i] == ch[j]) {
                        ch[j] = ' ';
                    }
                }
            }
        }


        int n1 = 0;
        for (int i = 0; i < n; i++) {
            if (ch[i] != ' ') {
                n1++;
            }
        }
        int[] arr1 = new int[n1];
        int a = 0;
        for (int i = 0; i < n; i++) {
            if (ch[i] != ' ') {
                arr1[a] = (int) ch[i] - 48;
                a++;
            }

        }

        for (int i = 0; i < a - 1; i++) {
            for (int j = i + 1; j < a; j++) {
                if (arr1[i] < arr1[j]) {
                    int t = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = t;
                }
            }
        }
        int index[] = new int[11];
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < a; j++) {
                if (arr1[j] == arr[i]) {
                    index[i] = j;
                }
            }
        }
        System.out.print("int[] arr = new int[]{");
        for (int i = 0; i < n1 - 1; i++) {
            System.out.print(arr1[i] + ",");
        }
        System.out.println(arr1[n1 - 1] + "};");
        System.out.print("int[] index = new int[]{");
        for (int i = 0; i < n - 1; i++) {
            System.out.print(index[i] + ",");
        }
        System.out.println(index[n - 1] + "};");
    }

}
