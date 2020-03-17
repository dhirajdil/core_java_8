package InterviewProgram;

public class Palindrom {
	public static void main(String[] args) {
		 
		int a=123;
		int p=a;
		int st=0;
		while(a>0){
			int b=a%10;
			st=(10*st)+b;
			a/=10;
			
		}
		System.out.println(st);
	if(st==p){
		System.out.println("palindrom");
	}else{
		System.out.println("not palindrom");
	}
			
		
	}

}
