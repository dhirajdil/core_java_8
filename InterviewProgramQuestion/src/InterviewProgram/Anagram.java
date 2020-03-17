package InterviewProgram;

import java.util.Arrays;

public class Anagram {
	private static boolean isAnagram(String st1, String st2) {
		if (st1.length() != st2.length()) {
			return false;
		}
		st1 = sortCharacters(st1);
		st2 = sortCharacters(st2);

		if (st1.equals(st2)) {
			return true;
		}
		return false;
	}

	private static String sortCharacters(String str) {
		char[] charArray = str.toLowerCase().toCharArray();
		Arrays.sort(charArray);
		return String.valueOf(charArray);
	}

	public static void main(String[] args) {
		String st1 = "Dhiraj";
		String st2 = "jdiarj";
		if (isAnagram(st1, st2)) {
			System.out.println(st2 + "is Anagram of " + st1);

		} else {
			System.out.println("String is not anagrams");
		}
	}

}
