package InterviewProgram;
//Program for sort array and String

public class Test1 {
	public static void main(String[] args) {
		String st = "asartiwqtlz";
		char[] c = st.toCharArray();
		
		int len = c.length;
		for (int i = 0; i < len; i++) {
			int temp = 0;
			for (int j = i + 1; j < len; j++) {
				if (c[i] > c[j]) {
					temp = c[i];
					c[i] = c[j];
					c[j] = (char) temp;
				}

			}
			
		}
		for (int k = 0; k < len; k++) {
			System.out.print(c[k]);
		}
	}
	
}
