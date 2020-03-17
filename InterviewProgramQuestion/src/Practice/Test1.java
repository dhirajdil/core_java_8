package Practice;

public class Test1 {
	public static void main(String[] args) {
		String st="Hello Java";
		String rev="";
		String s[]=st.split(" ");
		int len=s.length;
		
		for(int i=0;i<len;i++) {
			 rev=s[i];
			 isReverse(rev);
			
		}
		
		
	}
	static void isReverse(String st) {
		int leng=st.length();
		String str="";
		for(int j=leng-1;j>=0;j--) {
			if(j==leng-1) {
				char c=' ';
				c=st.charAt(j);
				c-=32;
				str+=c;
			}else if(j==0) {
				char c=' ';
				c=st.charAt(j);
				c+=32;
				str+=c;
			}else {
				str+=st.charAt(j);
			}
			
		}
		System.out.println(str);
	}

}
