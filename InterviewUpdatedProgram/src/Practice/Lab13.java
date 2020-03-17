package Practice;


class Pare{
	public void add(String st){
		System.out.println("parents");
	}
	
}
class Chi extends Pare{
	public void add(int x){
		System.out.println("chailed");
	}
}
public class Lab13 {
	public static void main(String[] args) {
		Pare p=new Chi();
		p.add("dhiraj");
	}

}
