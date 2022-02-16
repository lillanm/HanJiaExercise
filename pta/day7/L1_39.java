package com.lillanm.pta.day7;

import java.util.Scanner;

public class L1_39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();                  // 读取换行符
        String str = scanner.nextLine();
        char[] data = str.toCharArray();

        int len = data.length;
        // 如果字符长度不是 N 的整数倍，则要增加长度，补充空格
        while (len % N != 0) {
            len++;
        }

        // 一行一行打印
        for (int i = N; i > 0; i--) {
            // 设置每行起始字符的索引
            int begin = len - i;

            // 如果起始字符索引大于字符长度，则补空格
            while (begin >= data.length) {
                // 每列字符的索引相差N，因为一共N行
                begin -= N;
                System.out.print(" ");
            }

            // 开始打印有效字符，列索引 -= N
            for (int j = begin; j >= 0; j -= N) {
                System.out.print(data[j]);
            }

            System.out.println();
        }
    }

}
