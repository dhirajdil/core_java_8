package InterviewProgram;

public class ArraySecond {
	public static void main(String[] args) {
		int a[]={1,3,6,5,9,2,8};
		int max=0;
		int n=0;
		int m=0;
		int len=a.length;
		for (int i = 0; i < len; i++) {
			if(a[i]>max){
				n=max;
				m=n;
				max=a[i];
			}else if(a[i]>n){
				n=a[i];
			}else if(a[i]>m){
				m=a[i];
			}
		
		}
		System.out.println(max);
		System.out.println(n);
		System.out.println(m);
	}

}
