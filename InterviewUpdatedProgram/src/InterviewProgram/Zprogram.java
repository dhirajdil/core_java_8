package InterviewProgram;

public class Zprogram {
	public static void main(String args[]){
		int [][]a={{1,2,1},{3,4,6},{1,2,4}};
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				if(i==0||j==2||i==j){
					System.out.print(a[i][j]+" ");
				}else{
					System.out.print("");
				}
				System.out.println();
			}
		}
	}

}
