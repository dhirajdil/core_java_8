package InterViewQuestion;

//Program for sort array and String

public class Test1 {
	public static void main(String[] args) {
		String st = "asartiwqtlz";
		char[] c = st.toCharArray();
		System.out.println(c);
		int len = c.length;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				char t1 = c[i];
				char t2 = c[j];
				int temp = 0;
				if (t1 > t2) {
					temp = t1;
					t2 = t1;
					t2 = (char) temp;
				}

			}
		}
		for (int k = 0; k < len; k++) {
			System.out.print(c[k]);
		}
	}
}
