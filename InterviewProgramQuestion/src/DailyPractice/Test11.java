package DailyPractice;

public class Test11 {
	public static void main(String[] args) {
		String st="dhiraj kumar";
		String st1[]=st.split(" ");
		getReverse(st1);
	}
	public static void getReverse(String st1[]){
		for(int i=0;i<st1.length;i++){
			String st2=st1[i];
			String st3="";
			
			for(int j=st2.length()-1;j>=0;j--){
				char c=st2.charAt(j);
				st3+=c;
			}
			System.out.println(st3);
		}
		
	}

}
