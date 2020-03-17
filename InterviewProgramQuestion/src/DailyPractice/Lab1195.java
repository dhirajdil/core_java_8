package DailyPractice;

public class Lab1195{
	public static void main(String[] args) {
		System.out.println("main started");
		try{
			int res=0/10;
			System.out.println(res);
		}catch(ArithmeticException e){
			e.printStackTrace();
			System.out.println("arithemetic exception occur");
		}
		System.out.println("dhiraj");
	}

}
