package com.lillanm.pta.day1;

import java.util.Scanner;

public class L1_03_SINGLE_DIGIT_STATISTICS {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            //long n = scan.nextLong();
            String str = scan.nextLine();
            char[] ch = new char[1001];
            int[] arr = new int[1001];
            ch = str.toCharArray();//转换成字符数组;
            for (int i = 0; i < str.length(); i++) {
                if (ch[i] == '0') arr[0]++;
                else if (ch[i] == '1') arr[1]++;
                else if (ch[i] == '2') arr[2]++;
                else if (ch[i] == '3') arr[3]++;
                else if (ch[i] == '4') arr[4]++;
                else if (ch[i] == '5') arr[5]++;
                else if (ch[i] == '6') arr[6]++;
                else if (ch[i] == '7') arr[7]++;
                else if (ch[i] == '8') arr[8]++;
                else if (ch[i] == '9') arr[9]++;

            }
            for (int i = 0; i <= 9; i++) {
                if (arr[i] != 0) System.out.println(i + ":" + arr[i]);
            }
        }

}