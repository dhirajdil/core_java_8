package InterviewProgram;

public class PrimeNumber {
	public static void main(String[] args) {
		int a=100;
		System.out.println("Prime No between 1 and "+a);
		for(int i=1;i<100;i++){
			boolean isPrimeno=true;
			for(int j=2;j<i;j++){
				if(i%j==0){
					isPrimeno=false;
					break;
				}
			}
			if(isPrimeno){
				System.out.println(i);
			}
		}
	}

}
