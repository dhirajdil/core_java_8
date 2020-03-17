package Prep_2020.prep.Lamda;


interface Employee{
	public void say();
}
public class Lab1 {
	public static void main(String[] args) {
		Employee emp=()->{
			System.out.println("my name is dhiraj kumar");
		};
		emp.say();
	}

}
