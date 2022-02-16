package com.lillanm.pta.day8;

import java.util.Scanner;

public class L1_42 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        char[]ch = str.toCharArray();
        for (int i = 6; i <= 9; i++) {
            System.out.print(ch[i]);
        }
        System.out.print("-"+ch[0]+ch[1]+"-"+ch[3]+ch[4]);
    }
}
