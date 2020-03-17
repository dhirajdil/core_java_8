package InterViewQuestion;

public class DigitToWord {
	public static void main(String[] args) {
		int a = 12345;
		int sum = 0;
		while (a > 0) {
			int m = a % 10;
			sum += m;
			a /= 10;

		}

		System.out.println(sum);

	}

}
