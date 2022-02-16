package com.lillanm.pta.day8;

import java.util.Scanner;

public class L1_48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Ra = scanner.nextInt();
        int Ca = scanner.nextInt();
        int[][] A = new int[Ra][Ca];

        // input matrixA
        for (int i = 0; i < Ra; i++) {
            for (int j = 0; j < Ca; j++) {
                A[i][j] = scanner.nextInt();
            }
        }

        int Rb = scanner.nextInt();

        if (Ca == Rb) {
            int Cb = scanner.nextInt();
            int[][] B = new int[Rb][Cb];

            // input matrixB
            for (int i = 0; i < Rb; i++) {
                for (int j = 0; j < Cb; j++) {
                    B[i][j] = scanner.nextInt();
                }
            }

            System.out.println(Ra + " " + Cb);
            int[][] C = new int[Ra][Cb];

            for (int i = 0; i < Ra; i++) {
                for (int j = 0; j < Cb; j++) {
                    for (int k = 0; k < Ca; k++) {
                        C[i][j] += A[i][k] * B[k][j];
                    }
                    System.out.print(C[i][j]);

                    if (j != Cb - 1) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

        } else {
            System.out.println("Error: " + Ca + " != " + Rb);
        }


    }

}
