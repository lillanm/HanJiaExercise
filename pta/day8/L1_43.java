package com.lillanm.pta.day8;

import java.util.Scanner;

public class L1_43 {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            int day = input.nextInt();
            int number;
            for(int i=0;i<day;i++){
                int count=0;//每天次数
                int time=0;//每天总分钟数
                String[] book = new String[1001];//记录书籍状态
                while((number = input.nextInt())!=0){
                    char c = input.next().charAt(0);//记录是借出还是归还
                    String str =input.next();//记录时间
                    if(c=='S'){//详情请见注意的第一点
                        book[number] = str;
                    }
                    if(c=='E'&&book[number]!=null){//详情请见注意的第二点
                        count++;
                        time =time+caculate(book[number],str);
                        book[number]=null;
                    }
                }
                if(number==0){
                    input.next().charAt(0);//略过无用数据
                    input.next();//略过无用数据
                    if(count!=0)
                        System.out.println(count+" "+Math.round((double)time/count));
                    else
                        System.out.println(count+" "+0);
                }

            }
        }

        public static int caculate(String s,String r){
            int time=0;
            String[] ss = s.split(":");//将借出时间的小时和分钟分开
            String[] rr = r.split(":");//将归还时间的小时和分钟分开
            int rm = Integer.parseInt(rr[0])*60+Integer.parseInt(rr[1]);//算出归还时间是这一天的第几分钟
            int sm = Integer.parseInt(ss[0])*60+Integer.parseInt(ss[1]);//算出借出时间是这一天的第几分钟
            time = rm-sm;//返回借出的时间
            return time;
    }


}
