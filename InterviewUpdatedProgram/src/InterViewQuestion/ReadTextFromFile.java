package InterViewQuestion;

public class ReadTextFromFile {
	public static void main(String[] args) {
		String st="advcrt";
		char c[]=st.toCharArray();
		for(int i=0;i<st.length();i++){
			int temp=0;
			for(int j=i+2;i<st.length();j++){
				
				if(c[i]>c[j]){
					temp=c[i];
					c[j]=c[i];
					c[j]=(char) temp;
				}
			}
			for(int k=0;k<st.length();k++){
				System.out.println(c[k]);
			}
		}
	}
	

}
