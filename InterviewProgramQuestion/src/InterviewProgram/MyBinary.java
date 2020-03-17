package InterviewProgram;

class MyBinary{
	public static boolean isBinary(int binary){
		boolean status=true;
			while(true){
				if(binary==0){
					break;
				}else{
					int temp=binary%10;
					if(temp>1){
						status =false;
						break;
					}
					binary=binary/10;
				}
			}
			return status;
		}
	
			public static void main(String args[]){
						int a=1000112;
						
						System.out.println(isBinary(a));
	}
	}
