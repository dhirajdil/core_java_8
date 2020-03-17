package InterviewProgram;

public class DuplicateMethod {
	public static void Sorted(String st1[]){
		int top=0;
		for(int i=0;i<st1.length;i++){
			
			boolean isDistnict=true;
			for(int j=i+1;j<st1.length;j++){
				top=1;
				if(st1[i].equals(st1[j])){
					
					isDistnict=false;
					top++;
					break;
				}
		
				
			}
			
			if(!isDistnict){
				
				System.out.println(st1[i]+""+top);
			}
			
		}
		
		}
	
	public static void main(String[] args) {
		String st="Animal is a Animal. it is god gifted Animal a Animal";
		String st1[]=st.split(" ");
		DuplicateMethod.Sorted(st1);
	}

}
