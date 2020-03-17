package InterViewQuestion;

public class DuplicateMethod {
	public static void Sorted(String st1[]){
		
		for(int i=0;i<st1.length;i++){
		
			boolean isDistnict=true;
			for(int j=i+1;j<st1.length;j++){
				
				if(st1[i].equals(st1[j])){
					
					isDistnict=false;
					
					break;
				}
		
				
			}
			
			if(!isDistnict){
				
				System.out.println(st1[i]);
			}
			
		}
		
		}
	
	public static void main(String[] args) {
		String st="Animal is a Animal. it is god gifted Animal a";
		String st1[]=st.split(" ");
		DuplicateMethod.Sorted(st1);
	}

}
