package Practice;

public class Lab282 {
	public static void main(String[] args) {
		int c=Operation.showReminder(10, 4);
		c=Operation.showReminder(10, 0);
		System.out.println(c);
		
	}

}
class Operation{
	static int showReminder(int a,int b){
		if(b==0)
			return 89;
		System.out.println(a%b);
		return a;
	}
}
