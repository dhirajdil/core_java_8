package comPractice;

public class Lab1 {
	public static void addString(String s) {
		String revr="";
		for(int i=s.length()-1;i>=0;i--) {
			
			if(i==s.length()-1) {
				char c=' ';
				c=s.charAt(i);
				c-=32;
				revr+=c;
			}else if(i==0) {
				char c=' ';
				c=s.charAt(i);
				c+=32;
				revr+=c;
			}else {
				revr+=s.charAt(i);
			}
			
			
		}
		
		System.out.print(revr+" ");
	}
	
	public static void main(String[] args) {
		String st="Hello India world";
		String s[]=st.split(" ");
		for(int i=0;i<s.length;i++) {
			addString(s[i]);
		}
		
	}

}
