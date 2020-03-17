package InterviewProgram;

import java.util.*;

public class DuplicateValueMap {
	public static void main(String args[]) {
		int a = 123;
		String st = "" + a;
		System.out.println(st);
		String st1 = String.valueOf(a);
		System.out.println(st1);
		// byte to string
		byte b = 12;
		String st4 = Byte.toString(b);
		System.out.println(st4);

		// String to permitive
		String str = "99";
		int a1 = Integer.parseInt(str);
		System.out.println(a1);
		Byte bt = Byte.parseByte(str);
		System.out.println(bt);
		String str1 = "ABCD";
		char ch = str1.charAt(0);
		System.out.println(ch);
	}
}