package InterViewQuestion;

public class StrRev {
	public static void Rev(String st2){
		String revStr="";
		for(int j=st2.length();j>=0;j--){
			if(j==st2.length()-1){
				char c=' ';
				c=st2.charAt(j);
				c-=32;
				revStr+=c;
			}
			else if(j==0){
				char c=' ';
				c=st2.charAt(j);
				c+=32;
				revStr+=c;
			}
			else{
				revStr=revStr+st2.charAt(j);
			}
			System.out.println(revStr);
		}
	}
		
	public static void main(String[] args) {
		String st="Dhiraj Kumar";
		String st2[]=st.split(" ");
		for(int i=0;i<st2.length;i++){
			StrRev.Rev(st2[i]);
		}
		}
	}


