package Practice;

public class Lab54 {
	

	public static void main(String[] args) {
		String st="dhiraj";
		char a[]=st.toCharArray();
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println("palindrom");
				}else {
					System.out.println(" not palindrom");
				}
			}
		
			
		}
	}

}
