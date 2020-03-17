package comPractice;

public class Lab2 {
	public static void main(String[] args) {
		int a[]= {2,5,7,9,1};
		int len=a.length;
		for(int i=0;i<=len;i++) {
			int temp=0;
			for(int j=i+1;j<len;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int j=0;j<len;j++) {
			System.out.println(a[j]);
		}
	}

}
