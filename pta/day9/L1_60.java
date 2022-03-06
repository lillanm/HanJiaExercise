package com.lillanm.pta.day9;
import java.util.Scanner;

public class L1_60 {
    public class Main {
        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            int x=scan.nextInt();
            int y=scan.nextInt();
            int Area=5000-x*y/2-(100-x)*(100-y)/2-(100-x)*y;
            System.out.println(Area);
        }
    }


}
