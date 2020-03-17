package InterViewQuestion;

public class Palindrom {
	public static void main(String[] args) {
		 
		int a=125;
		int c=a;
		int st=0;
		while(a>0){
			int b=a%10;
			st=(10*st)+b;
			a/=10;
			
		}
		System.out.println(st);
	if(st==c){
		System.out.println("palindrom");
	}else{
		System.out.println("not palindrom");
	}
			
		
	}

}
