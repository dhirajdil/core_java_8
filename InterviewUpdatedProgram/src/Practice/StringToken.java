package Practice;

import java.util.StringTokenizer;

public class StringToken {
	public static void main(String[] args) {
		StringTokenizer st=new StringTokenizer("my name is dhiraj");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
