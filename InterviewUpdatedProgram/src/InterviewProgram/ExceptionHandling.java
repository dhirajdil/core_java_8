package InterviewProgram;

public class ExceptionHandling {
	public static void main(String[] args) {
		int a[]=new int[5];
		try {
			a[8]=50/0;
		}catch(ArithmeticException e) {
			System.out.println("ArithMeticException");
		}catch(ArrayIndexOutOfBoundsException a1) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}
	}

}
