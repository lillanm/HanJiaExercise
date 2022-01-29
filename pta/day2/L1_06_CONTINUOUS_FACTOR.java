package com.lillanm.pta.day2;

import java.util.Scanner;

public class L1_06_CONTINUOUS_FACTOR {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        long n=s.nextInt();
        long start=0,len=0;
        long sum=0;
        for(int i=2;i<Math.sqrt(n);i++) {
            sum=1;
            for(int j=i;sum*i<=n;j++) {
                sum*=j;
                if(n%sum==0&&j-i+1>len) {
                    start=i;
                    len=j-i+1;
                }
            }
        }
        if(start==0) {
            start=n;
            len=1;
        }
        System.out.println(len);
        for(int i=0;i<len-1;i++) {
            System.out.print(start+i+"*");
        }
        System.out.print(start+len-1);
    }
}
