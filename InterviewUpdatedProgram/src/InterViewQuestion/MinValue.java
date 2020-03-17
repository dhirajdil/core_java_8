package InterViewQuestion;

public class MinValue {
	public static void main(String[] args) {
		/*int min=0;
		String smallest=null;
		int a[]={10,2,1,19,23};
		
		int len=a.length;
		for(int i=0;i<len;i++){
			int b=a[i];
			if(b>a[i]){
				
				smallest=a[i];
				
			}
		}*/
		int k=5;
		for(int i=0;i<k;i++)
		{
			for(int j=0;j<k-i;j++)
			{
				System.out.print(" ");
			}
			for(int m=0;m<=i;m++)
				System.out.print("*");
			
		System.out.println();
	}
		}

}
