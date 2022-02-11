package com.lillanm.pta.day5;

import java.util.Scanner;

public class L1_22 {
    public static void main(String args[])
    {
        int m=0,n=0;
        Scanner std=new Scanner(System.in);
        int N=std.nextInt();
        int[] a=new int[N];
        for(int i=0;i<N;i++) {
            a[i]=std.nextInt();
            //System.out.print(a[i]);
        }
        for(int i=0;i<N;i++) {
            if(a[i]%2==0)m++;
            else n++;
        }
        System.out.print(n+" "+m);

    }

}
