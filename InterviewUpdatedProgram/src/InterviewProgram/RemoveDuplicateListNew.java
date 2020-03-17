package InterviewProgram;

import java.util.*;

public class RemoveDuplicateListNew {
public static void main(String[] args){
    
    ArrayList<String> al = new ArrayList<String>();
    
    al.add("java");
    al.add("java");
    al.add("java");
    al.add("jsp");
    al.add("jsp");
    al.add("servlet");
    al.add("servlet");
    al.add("hibernate");
    al.add("hibernate");
    al.add("hibernate");
    
    
System.out.println("Before Remove Duplicate elements:"+al);
 
for(int i=0;i<al.size();i++){
 
 for(int j=i+1;j<al.size();j++){
            if(al.get(i).equals(al.get(j))){
                al.remove(j);
                j--;
            }
    }
 
 }
 
    System.out.println("After Removing duplicate elements:"+al);
 
}
 
}
