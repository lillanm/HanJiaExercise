package com.lillanm.pta.day1;

import java.util.Scanner;

public class L1_02_PRINTING_HOURGLASS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int high  = 0,cot = 6,cnt = 1;
        while (true){


            if(cnt>num){
                break;
            }else {
                high++;
            }
            cnt+=cot;
            cot+=4;
        }
        cot-=4;
        cnt-=cot;
        String a = sc.next();
//控制上部分
        for (int i = 1; i<=high ; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < cot/2-2*i; j++) {
                System.out.print(a);
            }
            System.out.println();
        }
        //控制下半部分
        for (int i = 1; i <=high-1 ; i++) {
            for (int j = 1; j <high-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*(i+1)-1; j++) {
                System.out.print(a);
            }
            System.out.println();
        }
        System.out.println(num-cnt);
    }
}
