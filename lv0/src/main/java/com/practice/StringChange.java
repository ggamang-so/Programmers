package com.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringChange {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = br.readLine();
        StringBuilder answer = new StringBuilder();
        for(Character a : string.toCharArray()){
           if(Character.isLowerCase(a)){
               answer.append(Character.toUpperCase(a));
           }else {
               answer.append(Character.toLowerCase(a));
           }
        }
        System.out.println(answer);
    }
}