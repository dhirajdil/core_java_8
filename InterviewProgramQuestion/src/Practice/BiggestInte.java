package Practice;

class BiggestInte{
	public static void main(String args[]){
	int a[]={3,8,5,12,4,28,45};
	int max=0;
	int smax=0;
	for(int i=0;i<a.length;i++){
	if(a[i]>max){
		smax=max;
	max=a[i];
	}else if(a[i]>smax) {
		smax=a[i];
	}
	
	}

	System.out.println(max);
	System.out.println(smax);
	}
	}