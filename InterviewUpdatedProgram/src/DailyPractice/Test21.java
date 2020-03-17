package DailyPractice;

public class Test21 {
	public static void main(String[] args) {
		String st="aaab";
		char c[]=st.toCharArray();
		
		int len=st.length();
		for(int i=0;i<len;i++){
			for(int j=0;j<len;j++){
				if(c[i]!=c[j]){
					System.out.println(c[i]);
				}
			}
				}
			
		}
	}


