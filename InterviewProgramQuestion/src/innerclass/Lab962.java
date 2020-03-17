
package innerclass;

class Out{
	void show(){
		System.out.println("Outer->show()");
		//getClass()System.out.println(x);//inner member can access outer member but outer member cant acess inner member
		//m1();
	}
	class Inne{
		int x=11;
		void m1(){
			System.out.println("inner->m1()");
		}
	}
}
public class Lab962 {
	public static void main(String[] args) {
		
	}

}
