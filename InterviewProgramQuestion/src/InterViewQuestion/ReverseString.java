package InterViewQuestion;

public class ReverseString {
	public static void main(String[] args) {
		String a = "Sree";
		String st = "";
	
		int len = a.length();
		for (int i = len - 1; i >= 0; i--) {
			char c = a.charAt(i);
			st += c;
		}
		System.out.println(st);
	}

}
