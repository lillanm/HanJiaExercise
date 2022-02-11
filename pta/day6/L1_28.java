package com.lillanm.pta.day6;
import java.util.Scanner;

public class L1_28 {
    public static void main(String args[]) {
        Scanner std=new Scanner(System.in);
        int Num=std.nextInt();
        int[] arr=new int[Num];
        for(int i=0;i<Num;i++) {
            arr[i]=std.nextInt();
        }
        for(int i=0;i<Num;i++) {
            if(isprime(arr[i])) {
                System.out.println("Yes");
            }
            else System.out.println("No");
        }
    }

    public static boolean isprime(int n)
    {
        if(n<2)
            return false;
        else
        {
            for(int i=2;i<Math.sqrt(n);i++)
            {
                if(n%i==0)
                    return false;
            }
        }
        return true;
    }
}