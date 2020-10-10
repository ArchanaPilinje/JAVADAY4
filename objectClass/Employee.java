
public class Employee {
	protected int empId;
	protected String empName;
	protected double salary;
	
	public Employee(int empId, String empName, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	
	
	public Employee() {
		
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void calculateSalary() {
		
	}
	
	public void print() {
		System.out.println("Employeed ID:"+empId);
		System.out.println("Employee Name:"+empName);
		System.out.println("Employee Salary:"+salary);
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
	}
	
	
	
	
}
