package InterviewProgram;

//program for string length without using .length

public class StringLengthWithoutUsingLength {
	public static void main(String[] args) {
		String blah = "HellO";
		int count = 0;
		for (char c : blah.toCharArray()) {
			count++;
		}
		System.out.println("blah's length: " + count);
	}

}
