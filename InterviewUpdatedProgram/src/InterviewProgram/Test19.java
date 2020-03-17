package InterviewProgram;

public class Test19 {
	public static void main(String[] args) {
		int a[]={1,3,5,7,9};
		int b[]={2,4,6,8,10};
		
		for(int i=0;i<a.length;i++){
			for(int j=i;j<=b.length;j++){
				System.out.println(a[i]);
				System.out.println(b[j]);
				break;
			}
		}
	}

}
