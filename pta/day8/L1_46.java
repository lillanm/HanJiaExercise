package com.lillanm.pta.day8;

import java.math.BigInteger;
import java.util.Scanner;

public class L1_46 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        BigInteger num = new BigInteger("0");
        BigInteger bi = sc.nextBigInteger();

        for (int i = 0; ; i++) {
            num = num.multiply(new BigInteger("10"));
            num = num.add(new BigInteger("1"));
            if (num.mod(bi).equals(new BigInteger("0"))) {
                System.out.println(num.divide(bi).toString() + " " + (i + 1));
                break;
            }
        }

    }


}
