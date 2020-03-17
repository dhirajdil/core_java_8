
package InterviewProgram;

//marker Interface

public interface AgradeCollege{

}
 class College1 implements AgradeCollege{

}
 class College2{

}

class CustomeMarkerInterface{
private static void Tester(Object obj){
System.out.println("best collrge");
}
public static void main(String args[]){
College1 c1=new College1();
College2 c2=new College2();
Tester(c1);
Tester(c2);
}
}