package Prep_2020.prep.Lamda;

interface A{
	public String firstName(String name);
}

public class lab3 {
	public static void main(String[] args) {
		A a=(name)->{
			return name;
		};
		//String s=a.firstName("dhiraj");
		System.out.println(a.firstName("dhiraj"));
	}

}
