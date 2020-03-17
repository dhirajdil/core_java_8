package InterviewProgram;

import java.lang.reflect.Constructor;

public class ReverseWord {
	public static void main(String[] args) throws Exception{
		/*String st="Ram is a good boy";
		String st1[]=st.split(" ");
		int len=st1.length;
		String st2="";
		for(int i=len-1;i>=0;i--){
			String st3=st1[i];
			st2+=" "+st3;
		}
		System.out.println(st2);*/
		System.out.println("in main");
		/*Class cl=Class.forName("InterviewProgram.Employe1");
		
		//Class fooClazz = Class.forName("path.to.package.Foo");
		Constructor<Employe1> constructor = cl.getDeclaredConstructor();
		constructor.setAccessible(true); 
		Employe1 e1 = constructor.newInstance("Employe1"); 
		//System.out.println(obj);
*/		
		// reflection concept to get constructor of a Singleton class.  
		Constructor<Employe1> constructor = Employe1.class.getDeclaredConstructor();

		// change the accessibility of constructor for outside a class object creation.  
		constructor.setAccessible(true);

		// creates object of a class as constructor is accessible now.  
		Employe1 e1 = constructor.newInstance();
		
		//Employe1 e1=(Employe1) cl.newInstance();
		e1.m1();
	}

}
class Employe1{
	private Employe1() {
		// TODO Auto-generated constructor stub
	}
	public void m1(){
		System.out.println("Employee------m1");
	}
}
