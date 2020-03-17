package InterviewProgram;

public class Test191 {
	public static void main(String[] args) {
		int a[] = { 1, 3, 5 };
		int b[] = { 2, 4, 6, 8, 10 };

		int i;
		for (i = 0; i < a.length && i < b.length; i++) {
			System.out.println(a[i]);
			System.out.println(b[i]);
		}
		
		if(i!=a.length)
		{
			for (; i < a.length; i++) {
				System.out.println(a[i]);
			}
		}
		
		if(i!=b.length)
		{
			for (; i < b.length; i++) {
				System.out.println(b[i]);
			}
		}
		
	}
}
