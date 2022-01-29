package com.lillanm.pta.day2;

import java.util.Scanner;

public class L1_10_COMPARISON_SIZE {
    public static void main(String[] args) {
        int[] arr    = new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] =sc.nextInt();
        }
        Sort(arr);
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i]+"->");
        }
        System.out.println(arr[2] );
    }
    public static void Sort(int[]arr){
        int max = arr[0],min= arr[0],sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }

        }
        arr[0] = min;
        arr[1] = sum-min-max;
        arr[2]   =max;
    }
}
