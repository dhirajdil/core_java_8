package InterViewQuestion;

public class Lowrcase {
	public static void main(String[] args) {
		String st1 = new String("dhiraj");
		String st=null;
		//System.out.println(st1.equals(st));
		MyClass mc= new MyClass();
		
		System.out.println(mc.equals(st));
	}

}

class MyClass{
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj==null)
		{
			return false;
			
		}
		else
		{
			String s=(String)obj;
			return this.equals(s);
		}
		
	}
}