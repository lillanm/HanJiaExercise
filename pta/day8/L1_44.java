package com.lillanm.pta.day8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
public class L1_44 {
//import java.util.Scanner;

    public class Main{
        public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int k = scanner.nextInt();
//        scanner.nextLine();
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            int k = 0;
            try {
                k = Integer.parseInt(bf.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
            List<String> list = new ArrayList<>();
            String temp = null;
            while (true){
                try {
                    temp = bf.readLine().trim();
                } catch (IOException e) {
                    e.printStackTrace();
                }
//            temp = scanner.nextLine();
                if("End".equals(temp)){
                    break;
                }
                list.add(temp);
            }
            int count = 0;
            for(int i = 0; i < list.size(); i++){
                count++;
                if(count % (k+1) == 0){
                    System.out.println(list.get(i));
                }
                else if("ChuiZi".equals(list.get(i))){
                    System.out.println("Bu");
                }
                else if("JianDao".equals(list.get(i))){
                    System.out.println("ChuiZi");
                }
                else if("Bu".equals(list.get(i))){
                    System.out.println("JianDao");
                }
            }
        }
    }


}
