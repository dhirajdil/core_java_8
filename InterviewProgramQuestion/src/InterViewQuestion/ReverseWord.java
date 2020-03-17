package InterViewQuestion;

public class ReverseWord {
	public static void main(String[] args) {
		String st="Ram is a good boy";
		String st1[]=st.split(" ");
		int len=st1.length;
		String st2="";
		for(int i=len-1;i>=0;i--){
			String st3=st1[i];
			st2+=" "+st3;
		}
		System.out.println(st2);
	}

}
