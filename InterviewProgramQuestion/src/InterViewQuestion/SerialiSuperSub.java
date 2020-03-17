package InterViewQuestion;


import java.io.*;

class Father implements Serializable{
	String name;
	String email;
	String pro;
	Father(String name,String email,String pro){
		this.name=name;
		this.email=email;
		this.pro=pro;
	}
	
}
class Son extends Father{
	String sname;
	String semail;
	Son(String name, String email, String pro,String sname,String semail) {
		super(name, email, pro);
		this.semail=semail;
		this.sname=sname;
		
	}
	
	
	
}
public class SerialiSuperSub {
	public static void main(String[] args) throws Exception {
		Father fh=new Father("narendra", "narendra@gmail.com", "one lakh");
		FileOutputStream fout=new FileOutputStream("E:\\student.txt"); 
		ObjectOutputStream oos=new ObjectOutputStream(fout);
		oos.writeObject(fh);
		oos.flush();
	}

}
