public class Employee1 {
	private String id;
	private String name;
	private double salary;
	
	public Employee1(String id,String name,double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public Employee1(String id,String name) {
		this.id=id;
		this.name=name;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
}