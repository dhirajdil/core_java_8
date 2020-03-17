package Practice;

public class Lab605 {
	public static void main(String[] args) {
		Student stu1=new Student(88,"srinivas");
		stu1.show();
		Student stu2=new Student(88,"srinivas");
		stu2.show();
	}

}
class Student{
	int sid;
	String name;
	Student(int sid,String name){
		sid=sid;
		name=name;
		
	}
	void show() {
		System.out.println(sid+""+name);
		
	}
}
