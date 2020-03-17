package DailyPractice;

public class ArmStrong{
	public static void main(String[] args) {
		int a=123;
		int sum=0;
		while(a>0){
			int b=a%10;
			int c=b*b*b;
			sum+=c;
			a/=10;
		}
		System.out.println(sum);
	}

}
