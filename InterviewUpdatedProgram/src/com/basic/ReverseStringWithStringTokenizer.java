package com.basic;

import java.util.StringTokenizer;

public class ReverseStringWithStringTokenizer {
     
    public static void main(String[] args) {
         
        String s = "Java Code GeeksJava Examples";
          
        StringTokenizer st = new StringTokenizer(s);
          
        String sReversed = "";
          
        while (st.hasMoreTokens()) {
            sReversed = st.nextToken() + " " + sReversed;
        }
         
        System.out.println("Original string is : " + s);
        System.out.println("Reversed string is : " + sReversed);
         
    }
 
}