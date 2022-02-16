package com.lillanm.pta.day7;

import java.util.Scanner;

public class L1_31 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String str [] [] =new String [n][2];
        for(int i=0;i<n;i++) {
            for(int j=0;j<2;j++) {
                str[i][j]=sc.next();
            }
        }

        for(int i=0;i<n;i++) {
            double wei=(Integer.parseInt(str[i][0])-100)*0.9*2;
            int weight=Integer.parseInt(str[i][1]);

            if(Math.abs(weight-wei)<wei*0.1) {
                System.out.println("You are wan mei!");
            }
            else if(weight>wei){
                System.out.println("You are tai pang le!");
            }
            else {
                System.out.println("You are tai shou le!");
            }
        }

    }
}

