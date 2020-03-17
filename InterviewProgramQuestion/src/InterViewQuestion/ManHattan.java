package InterViewQuestion;

public class ManHattan {
	public static void main(String[] args) {
		for (int i = 1; i <= 50; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("manHatanAssociates" + "\t" + i);
			} else if (i % 5 == 0) {
				System.out.println("Associates" + "\t" + i);
			} else if (i % 3 == 0) {
				System.out.println("manHatan" + "\t" + i);
			}
		}
	}
}
