package com.lillanm.pta.day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L1_32 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] t = br.readLine().split(" ");
        int n = Integer.parseInt(t[0]);
        String c = t[1];
        String s = br.readLine();
        StringBuffer res = new StringBuffer("");
        int len = s.length();
        if(n<=len) {
            res.append(s.substring(len-n));
        }
        else {
            for(int i=0;i<n-len;i++) {
                res.append(c);
            }
            res.append(s);
        }
        System.out.println(res);
        br.close();
    }

}
