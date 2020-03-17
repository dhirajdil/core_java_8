package DailyPractice;

public class Lab1196{
	public static void main(String[] args) {
		System.out.println("main started");
		try{
			int res=10/0;
			System.out.println(res);
		}catch(NumberFormatException e){
			System.out.println("invalid output");
		}finally{
			System.out.println("finally block");
			System.out.println("main completed");
		}
	}

}
