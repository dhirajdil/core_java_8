package InterviewProgram;

public class OverRideEqual {
		public static void main(String[] args) {
			Employeeeeee emp1=new Employeeeeee(10, "dhiraj");
			Employeeeeee emp2=new Employeeeeee(10, "dhiraj");
		
			System.out.println(emp1.equal(emp2));
		}
}
class Employeeeeee{
	int id;
	String name;
	
	Employeeeeee(int id,String name){
		this.id=id;
		this.name=name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public boolean equal(Object obj){
		if(obj instanceof Employeeeeee){
			Employeeeeee emp=(Employeeeeee)obj;
			return this.id==emp.id && this.name.equals(emp.name);
		}
		return true;
	}
}
