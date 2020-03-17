package InterviewProgram;

public class LongestString {
	public static void main(String[] args) {
		String arr[] = { "dhiraj", "kumar", "ghanshyam", "bihar" };

		int max = 0;
		String longest = null;
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			String name = arr[i];
			int leng = name.length();
			if (leng > max) {
				max = leng;
				longest = name;
			}

		}
		System.out.println(longest);
	}
}
