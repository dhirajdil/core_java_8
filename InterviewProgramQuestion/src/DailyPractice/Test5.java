package DailyPractice;

class Employee {
	private int id;
	private String name;

	private String userId;
	private String password;

	Employee(String userId, String password) {
		this.userId = userId;
		this.password = password;
	}

	public int getId() {

		if (userId.equalsIgnoreCase("Dhiraj") && password.equalsIgnoreCase("Sandeep")) {
			return id;
		} else {
			throw new RuntimeException("This User is Not Valid");
		}

	}

	public void setId(int id) {

		if (userId.equalsIgnoreCase("Dhiraj") && password.equalsIgnoreCase("Sandeep")) {
			this.id = id;
		} else {
			throw new RuntimeException("This User is Not Valid");
		}
	}

	public String getName() {
		if (userId.equalsIgnoreCase("Dhiraj") && password.equalsIgnoreCase("Sandeep")) {
			return name;
		} else {
			throw new RuntimeException("This User is Not Valid");
		}
	}

	public void setName(String name) {

		if (userId.equalsIgnoreCase("Dhiraj") && password.equalsIgnoreCase("Sandeep")) {
			this.name = name;
		} else {
			throw new RuntimeException("This User is Not Valid");
		}
	}

}

public class Test5 {

	public static void main(String arg[])
	{
		Employee e1 = new Employee("Dhiraj1","Sandeep2");
		e1.setId(100);
		e1.setName("Ajay");
		
		System.out.println(e1.getId()+ "- "+e1.getName());
	}
}
