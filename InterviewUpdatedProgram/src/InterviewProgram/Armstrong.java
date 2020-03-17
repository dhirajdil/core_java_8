package InterviewProgram;

public class Armstrong {
	public static void main(String[] args) {
		int a = 123;
		int sum = 0;
		while (a > 0) {
			int d = a % 10;
			int q = d * d * d;
			sum += q;
			a /= 10;
		}
		System.out.println(sum);
	}

}
