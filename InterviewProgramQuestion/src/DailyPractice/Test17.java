package DailyPractice;

public class Test17 {
	public static void main(String[] args) {
		String st="dhiraj kumar";
		String st1[]=st.split(" ");
			int len=st1.length;
			revString(st1);
			
	}
	public static void revString(String[] st1){
		int leng=st1.length;
		for(int j=0;j<leng;j++){
			String st3=st1[j];
			String last="";
			for(int i=0;i<leng;i++){
				if(i==0){
					char c=' ';
					c=st3.charAt(i);
					c-=32;
					last+=c;
				}else{
					st3=last+st3.charAt(i);
				}
				
			}
			System.out.println(st3);
			
			
		}
		
	}

}
