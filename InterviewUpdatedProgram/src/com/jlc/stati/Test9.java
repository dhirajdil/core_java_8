package com.jlc.stati;

public class Test9 {
	public static void main(String[] args) {
		if(Hello.process(0))
			System.out.println("if");
		else
			System.out.println("else");
	}

}
class Hello{
	static boolean process(int x){
		if(x>0)
			return true;
		else 
			return false;
	}

	
}
