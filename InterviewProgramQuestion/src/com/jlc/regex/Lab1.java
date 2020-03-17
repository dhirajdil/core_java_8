package com.jlc.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class Lab1 {
 
   public static void main(String[] args) {
 
      String str = "ab2c$def^ghi#jklA";
 
      Pattern p = Pattern.compile("[^a-z ]", Pattern.CASE_INSENSITIVE);
      Matcher m = p.matcher(str);
 
      System.out.println(str);
      int count = 0;
      while (m.find()) {
         count = count+1;
         System.out.println("position "  + m.start() + ": " + str.charAt(m.start()));
      }
      System.out.println("There are " + count + " special characters");
   }
}
