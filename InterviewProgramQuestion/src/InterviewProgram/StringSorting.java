package InterviewProgram;

//program for sort array

public class StringSorting {
	public static void main(String[] args) {

		char cArr[] = new char[] { 'b', 'a', 'c', 'd', 'a', 'z', 'w' };

		for (int i = 0; i < cArr.length; i++) {

			for (int j = i + 1; j < cArr.length; j++) {
				int temp = 0;
				if (cArr[i] > cArr[j]) {
					temp = cArr[i];
					cArr[i] = cArr[j];
					cArr[j] = (char) temp;
				}

			}
		}

		for (int k = 0; k < cArr.length; k++) {
			System.out.print(cArr[k]);
		}

	}

}
