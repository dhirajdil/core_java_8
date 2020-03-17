package InterViewQuestion;

public class MinValue1 {
	public static void main(String[] args) {
		int a[]={10,5,3,8,4};
		int len=a.length;
		for(int i=0;i<len;i++){
			
			for(int j=i+1;i<len;j++){
				int temp=0;
				if(a[i]>a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		for(int k=0;k<len;k++){
			System.out.println(a[k]);
		}
	}
		
	}


