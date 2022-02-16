package com.lillanm.pta.day8;
import java.io.IOException;
import java.io.*;
import java.util.*;
public class L1_49 {


    //** Class for buffered reading int and double values *//*
    class Reader {
        static BufferedReader reader;
        static StringTokenizer tokenizer;

        // ** call this method to initialize reader for InputStream *//*
        static void init(InputStream input) {
            reader = new BufferedReader(new InputStreamReader(input));
            tokenizer = new StringTokenizer("");
        }

        // ** get next word *//*
        static String next() throws IOException {
            while (!tokenizer.hasMoreTokens()) {
                // TODO add check for eof if necessary
                tokenizer = new StringTokenizer(reader.readLine());
            }
            return tokenizer.nextToken();
        }

        static String nextLine() throws IOException {
            return reader.readLine();
        }

        static int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        static long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        static double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }
    }
        public static void main(String[] args) throws IOException {
            Reader.init(System.in);
            int n = Reader.nextInt();
            int []m = new int[1000];//每个学校的队员数
            int []re = new int[1000];//每个学校的队员数,不会改变,最后输出用
            int [][]seat = new int[1000][1000];
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                int team = Reader.nextInt();
                m[i] = team*10;
                re[i] = m[i];
                sum+=m[i];
            }
            int last = 0;//上一个座位放的是哪一个学校队员
            int jump = 1;//座位跳数,只剩一个学校跳数为2
            int zw = 0;//座位编号
            for (int i = 1; sum>0; i++) {//i是队员
                for (int j = 1; j <=n ; j++) {//j是学校
                    if (m[j]!=0) {//如果这个学校还有没分配的队员
                        if (last==j) {//如果上一个分配的队员还是这个学校的,跳数为2
                            jump=2;
                        }
                        zw+=jump;
                        seat[j][i]=zw;
                        sum--;
                        m[j]--;
                        last=j;
                    }
                }
            }
            for (int i = 1; i <=n; i++) {
                System.out.println("#"+i);
                for (int j = 1; j <=re[i]; j++) {
                    System.out.print(seat[i][j]);
                    if (j%10==0) {
                        System.out.println();
                    }else {
                        System.out.print(" ");
                    }
                }
            }
        }



}
