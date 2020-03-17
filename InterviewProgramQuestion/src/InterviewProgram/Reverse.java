package InterviewProgram;

public class Reverse {
	public static void main(String[] args) {
		String st = "Hello";
		String st1="";
		String res[] = st.split(" ");
		int len=res.length;
		for (int i = len-1; i>=0; i--) {
			
			if(i==len-1){
				char c=st.charAt(i);
				c-=32;
				st1+=c;
			}
			else if(i==0){
				char c=st.charAt(i);
				c+=32;
				st1+=c;
			}
			else{
				st1=st1+st.charAt(i);
			}
				
		}

	}

}
