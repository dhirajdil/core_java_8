package DailyPractice;

import java.util.Arrays;
import java.lang.*;

public class Anagram{
	public static boolean  isAnagram(String st1,String st2){
		if(st1.length()!=st2.length()){
			return false;
		}
		st1=sortChar(st1);
		st2=sortChar(st2);
		if(st1.equals(st1)){
			return true;
		}
		return false;
	}
	public static String sortChar(String st){
		char arr[]=st.toCharArray();
				Arrays.sort(arr);
		return String.valueOf(arr);
	}
	public static void main(String[] args) {
		String st1="dhiraj";
		String st2="rajdh";
		if(isAnagram(st1,st2)){
			System.out.println("anagram");
		}else{
			System.out.println("not anagram");
		}
	}

}
