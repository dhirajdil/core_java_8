package Practice;

public class RemoveDuplicateFromArray{
	public static void main(String[] args) {
		int a[]={1,4,6,4,2,7,4,3,3};
		int len=a.length;
		for(int i=0;i<len;i++){
			for(int j=i+1;j<len;j++){
				if(a[i]==a[j]){
					break;
				}
				
			}
			
		}
	}

}
