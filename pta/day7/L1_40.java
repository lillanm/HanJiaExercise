package com.lillanm.pta.day7;

import java.util.Scanner;

public class L1_40 {
        public static void main(String agrs[]) {
            Scanner std=new Scanner(System.in);
            int num=std.nextInt();
            String[] sex=new String[num];
            float[] high=new float[num];
            for(int i=0;i<num;i++) {
                sex[i]=std.next();
                high[i]=std.nextFloat();
            }

            for(int i=0;i<num;i++) {
                if(sex[i].charAt(0)-77==0) {
                    System.out.printf("%.2f\n",high[i]/1.09);
                }
                else if(sex[i].charAt(0)-70==0) {
                    System.out.printf("%.2f\n",high[i]*1.09);
                }
            }
        }

}
