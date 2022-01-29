package com.lillanm.pta.day2;

import java.util.Scanner;

public class C_PRONUNCIATIONC_NUMBER {
    public static void main(String[] args) {
        Scanner scanner  =new Scanner(System.in);
        String num = scanner.next();
        int len = num.length();
        char[]ch = new char[100];
        ch = num.toCharArray();
        for (int i = 0; i < len-1; i++) {
            if (ch[i] == '-') System.out.print("fu"+" ");
            else if (ch[i]== '0') System.out.print("ling"+" ");
            else if (ch[i]== '1') System.out.print("yi"+" ");
            else if (ch[i]== '2') System.out.print("er"+" ");
            else if (ch[i]== '3') System.out.print("san"+" ");
            else if (ch[i]== '4') System.out.print("si"+" ");
            else if (ch[i]== '5') System.out.print("wu"+" ");
            else if (ch[i]== '6') System.out.print("liu"+" ");
            else if (ch[i]== '7') System.out.print("qi"+" ");
            else if (ch[i]== '8') System.out.print("ba"+" ");
            else if (ch[i]== '9') System.out.print("jiu"+" ");
        }
        if (ch[len-1] == '-') System.out.print("fu"+" ");
        else if (ch[len-1]== '0') System.out.print("ling");
        else if (ch[len-1]== '1') System.out.print("yi");
        else if (ch[len-1]== '2') System.out.print("er");
        else if (ch[len-1]== '3') System.out.print("san");
        else if (ch[len-1]== '4') System.out.print("si");
        else if (ch[len-1]== '5') System.out.print("wu");
        else if (ch[len-1]== '6') System.out.print("liu");
        else if (ch[len-1]== '7') System.out.print("qi");
        else if (ch[len-1]== '8') System.out.print("ba");
        else if (ch[len-1]== '9') System.out.print("jiu");
    }
}
