package Handson;

public class Employee implements Comparable<Employee>
{

	int id;
	String name;
	Double salary;
	String email;
	
	
	
	
	
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





	public Double getSalary() {
		return salary;
	}





	public void setSalary(Double salary) {
		this.salary = salary;
	}





	public String getEmail() {
		return email;
	}





	public void setEmail(String email) {
		this.email = email;
	}





	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}





	public Employee(int id, String name, Double salary, String email) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.email = email;
	}





	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", email=" + email + "]";
	}





	@Override
	public int compareTo(Employee o) {
		
		return 0;
	}

}
