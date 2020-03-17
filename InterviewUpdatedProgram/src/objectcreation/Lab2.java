package objectcreation;

public class Lab2 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class cls=Class.forName("B");
		B b=(B)cls.newInstance();
		b.add();
				
	}

}
class B{
	void add() {
		System.out.println("ab");
	}
	
}
