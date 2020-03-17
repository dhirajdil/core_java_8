package InterViewQuestion;

public class IntegerToText {
	public static void main(String[] args) {
		int a = 123;
		String st = "" + a;
		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			System.out.println(ch);

		}
	}

}
