package InterViewQuestion;

//Program for swaped two integer without using third variable

public class SwapNo {
	public static void main(String[] args) {
		int a = 40;
		int b = 60;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a);
		System.out.println(b);
	}

}
