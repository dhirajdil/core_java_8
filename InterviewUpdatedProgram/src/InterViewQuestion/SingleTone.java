package InterViewQuestion;

public class SingleTone {
	public static void main(String[] args) {
		Rat rat = Rat.getRat();
		System.out.println(rat);
		System.out.println(Rat.getRat());
		System.out.println(Rat.getRat());
	}

}

class Rat {
	private static Rat INS = new Rat();

	private Rat() {
	}

	public static Rat getRat() {
		return INS;
	}

}
