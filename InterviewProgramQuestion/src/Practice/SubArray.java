package Practice;
import java.util.*;

public class SubArray
{
    public static void main(String [] arg) 
    {   
    	int num[]={1,2,3,4};
    	PrintSubSet(num);
    	
    }
    public static void PrintSubSet(int[] num){
    	for(int i=0;i<num.length;i++){
    		boolean ifprint[]=new boolean[num.length];
    		PrintSubSet(num,ifprint,0,i);
    	}
    }
    public static void PrintSubSet(int[] num,boolean[] ifprint,int start,int remain){
    	if(remain==0){
    		System.out.print("{");
    		for(int i=0;i<ifprint.length;i++){
    			if(ifprint[i])
    				System.out.print(num[i]+",");
    			}
    		System.out.print("}\n");
    	}else{
    		if(start+remain>num.length);
    		else{
    		for(int i=start;i<num.length;i++){
    			if(!ifprint[i]){
    				ifprint[i]=true;
    				PrintSubSet(num,ifprint,i+1,remain-1);
    				ifprint[i]=false;
    			}
    		}
    		}
    	}
    }
}
