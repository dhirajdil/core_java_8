package DailyPractice;

public class Lab1198{
	public static void main(String[] args) {
		System.out.println("main started");
		try{
			int res=10/3;
			System.out.println(res);
			return;
		}catch(Exception e){
			System.out.println("invalid input");
		}finally{
			System.out.println("finally block");
			System.out.println("main completed");
		}
		
	}
	

}
