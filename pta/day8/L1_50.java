package com.lillanm.pta.day8;
import java.util.Scanner;
public class L1_50 {


        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            // 字符串的长度
            int L = in.nextInt();
            // 倒数第 N 个字符串
            int N = in.nextInt();
            // 字符串总数
            int sum = (int) Math.pow(26, L);
            // 从0开始正数
            int x = sum - N;
            StringBuilder sb = new StringBuilder();
            int cnt = 0;
            while (cnt != L) {
                sb.insert(0, (char) (97 + x % 26));
                x /= 26;
                cnt++;
            }
            System.out.println(sb);
        }



}
