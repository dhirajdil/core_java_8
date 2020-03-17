package DataStructure.Recursive;

public class Bubble {
	public static void main(String[] args) {
		int a[]= {19,2,0,5,8,1};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				int temp=0;
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int k=0;k<=a.length;k++) {
			System.out.println(a[k]);
		}
	}

}
