package DailyPractice;

interface Lam{
	int add(int a,int b);
}

public class Lamda {
	public static void main(String[] args) {
	Lam lm=(int a,int b)->(a+b);
	System.out.println(lm.add(10, 10));
	}
}
