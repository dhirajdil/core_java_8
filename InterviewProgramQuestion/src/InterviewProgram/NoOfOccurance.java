package InterviewProgram;

public class NoOfOccurance {
	public static void main(String[] args) {
		String s="aaadddbbbaacccbbbddd";
		char[] ch=s.toCharArray();
		String s1="";
		int c=1;
		for (int i = 0; i < ch.length;) {
			
			for (int j = i+1; j < ch.length; j++) {
				if(ch[i]!=ch[j]){
					break;
				}
				c++;
			}
			s1=s1+ch[i]+c;
			i=i+c;
			c=1;
			
		}
		System.out.println(s1);
	}

}