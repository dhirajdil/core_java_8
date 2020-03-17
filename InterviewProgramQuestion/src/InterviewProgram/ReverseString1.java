package InterviewProgram;

public class ReverseString1 {
	public static void main(String[] args) {
		String st="dhiraj";
		String st1="";
		char[] c=st.toCharArray();
		
		int len=c.length;
		for(int i=len-1;i>=0;i--) {
			char c1=c[i];
			st1+=c1;
		}
		System.out.println(st1);
		
	}

}
