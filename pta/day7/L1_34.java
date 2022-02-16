package com.lillanm.pta.day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class L1_34 {
        public static void main(String[] args) throws IOException {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(in.readLine());
            String[][] like = new String[N][];
            int[] numbers = new int[1001];
            for (int i = 0; i < N; i++) {
                like[i] = in.readLine().split(" ");
                for (int j = 1; j < like[i].length; j++) {
                    int idx = Integer.parseInt(like[i][j]);
                    numbers[idx]++;
                }
            }
            int max = numbers[1];
            int idx = 1;
            for (int i = 2; i < numbers.length; i++) {
                if (max <= numbers[i]) {
                    max = numbers[i];
                    idx = i;
                }
            }
            System.out.println(idx + " " + max);
        }



}
