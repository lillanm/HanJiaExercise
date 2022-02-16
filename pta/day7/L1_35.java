package com.lillanm.pta.day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class L1_35 {
    public static void main(String[] args) throws IOException {
        InputStream in;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        List<String> s = new ArrayList<>();
        while (true) {
            String temp = bf.readLine();
            if (!".".equals(temp)) {
                s.add(temp);
            } else {
                break;
            }
        }
        if (s.size() >= 14) {
            System.out.println(s.get(1) + " and " + s.get(13) + " are inviting you to dinner...");
        } else if (s.size() >= 2) {
            System.out.println(s.get(1) + " is the only one for you...");
        } else {
            System.out.println("Momo... No one is for you ...");
        }
    }

}
