package InterViewQuestion;

import java.util.*;

public class FebonicSeroesRecursion {
	int fibo(int n) {
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else
			return fibo(n - 1) + fibo(n - 2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int n = sc.nextInt();
		System.out.println("Febbonici series is" + n);
		FebonicSeroesRecursion c = new FebonicSeroesRecursion();
		for (int i = 0; i < n; i++) {
			System.out.println(" " + c.fibo(i));
		}

	}

}