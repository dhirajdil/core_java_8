package Prep_2020.prep.Lamda;


interface Employe{
	public void say(String name);
}
public class Lab2 {
	public static void main(String[] args) {
		Employe emp=(name)->{
			System.out.println(name);
		};
		emp.say("dhiraj");
	}

}
