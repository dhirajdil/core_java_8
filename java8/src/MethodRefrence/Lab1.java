package MethodRefrence;

public class Lab1 {
	public static void saySomething() {
		System.out.println("welcome in method refrence");
	}
    public static void main(String[] args) {
		Employee emp=Lab1::saySomething;
		emp.say();
	}
}
interface Employee{
	void say();
}