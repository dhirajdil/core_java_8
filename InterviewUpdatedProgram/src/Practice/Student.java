package Practice;

public class Student {
    int id;
    String name;
    String email;
    String add;
    
    Student(int id,String name,String email,String add){
    	this.id=id;
    	this.name=name;
    	this.email=email;
    	this.add=add;
    	
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAdd() {
		return add;
	}


	public void setAdd(String add) {
		this.add = add;
	}


	public void show(){
    	System.out.println(id+" "+email+" "+add+" "+name);
    }
    
}
