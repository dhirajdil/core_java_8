package InterviewProgram;

public class Matrix {
	public static void main(String[] args) {
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

		for (int k = 0; k <= 5; k++) {
			for (int l = k + 1; l <= 5; l++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}

	}
}
