package InterViewQuestion;

public class FibbonicSeries {
	public static void main(String[] args) {
		int febCount = 15;
		int FebCount[] = new int[febCount];
		FebCount[0] = 0;
		FebCount[1] = 1;
		for (int i = 2; i < FebCount.length; i++) {
			FebCount[i] = FebCount[i - 1] + FebCount[i - 2];
		}
		for (int i = 0; i < FebCount.length; i++) {
			System.out.println(FebCount[i]);
		}
	}

}
