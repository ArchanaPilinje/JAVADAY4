package cloneClassShallow;

public class EmployeeShallow implements Cloneable {
	private int id;
	private String name;
	private float salary;
	
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

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public EmployeeShallow() {
		
	}

	public EmployeeShallow(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	void print() {
		System.out.println("Id=" + id);
		System.out.println("Name=" + name);
		System.out.println("Salary=" + salary);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
//		EmployeeShallow temp = new EmployeeShallow(this.id,this.name,this.salary);
//
//		return temp;
		return super.clone();
	}
	
}

