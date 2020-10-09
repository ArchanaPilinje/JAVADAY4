package objectClass;

public class Employee {
	int id;
	String name;
	float salary;
	
	public Employee() {

	}

	public Employee(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		//return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
		return String.format("ID= %d \t Name=%s\t Salary=%.2f  ",id,name,salary);
	}

	@Override
	public boolean equals(Object obj) {
		return (obj instanceof Employee && this.id == ((Employee) obj).id) ? true : false;
	}

	void print() {
		System.out.println("Id=" + id);
		System.out.println("Name=" + name);
		System.out.println("Salary=" + salary);
	}
}
