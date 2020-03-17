package InterViewQuestion;

public class ManHat {
	public static void main(String[] args) {
		int result = 0;
		Boolean b1 = new Boolean("TRUE");
		Boolean b2 = new Boolean("true");
		Boolean b3 = new Boolean("tRuE");
		Boolean b4 = new Boolean("false");

		System.out.println("HashCode");
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		System.out.println(b3.hashCode());
		System.out.println(b4.hashCode());

		if (b1 == b2)
			result = result + 1;
		if (b1.equals(b2))
			result = result + 10;
		if (b2 == b3)
			result = result + 100;
		if (b2.equals(b3))
			result = result + 1000;
		if (b3.equals(b4))
			result = result + 10000;

		System.out.println(result);

	}

}
