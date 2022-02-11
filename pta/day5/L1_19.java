package com.lillanm.pta.day5;

import java.util.Scanner;

public class L1_19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int n = sc.nextInt();
        A[] array = new A[n];
        for(int i=0 ;i<n ;i++){
            array[i] = new A(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
        }

        int ah = 0;		//	A喝的次数
        int bh = 0;		//	B喝的次数
        for(int i=0 ;i<n ;i++){
            if(array[i].sum==array[i].b2 && array[i].sum!=array[i].a2){
                b--;
                bh++;
            }
            if(array[i].sum==array[i].a2 && array[i].sum!=array[i].b2){
                a--;
                ah++;
            }

            if(a<0||b<0){	//注意跳出条件，题目给出的是 "最多能喝多少杯不倒"
                break;
            }
        }

        if(a<0){
            System.out.println("A");
            System.out.println(bh);
        }
        if(b<0){
            System.out.println("B");
            System.out.println(ah);
        }
    }
}
class A{
    int a1;
    int a2;
    int b1;
    int b2;

    int sum;

    A(int a1,int a2,int b1,int b2){
        this.a1 = a1;
        this.a2 = a2;
        this.b1 = b1;
        this.b2 = b2;
        this.sum = a1+b1;
    }
}
