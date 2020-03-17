package DataStructure.Recursive;

public class BiggestNumber {
	public static void main(String[] args) {
		int a[]= {7,5,9,6,12,3};
		int num=0;
		
//		int len=a.length;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>num) {
				num=a[i];
				
			}
			
		}
		System.out.println(num);
	}

}
