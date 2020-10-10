
public class PermanentEmployee extends Employee {
	private double baseSal;
	private double hra;
	private double da;
	private double bonus;

	public PermanentEmployee(int empId, String empName, double salary, double baseSal, double hra, double da,
			double bonus) {
		super(empId, empName, salary);
		this.baseSal = baseSal;
		this.hra = hra;
		this.da = da;
		this.bonus = bonus;
	}
	
	public PermanentEmployee(int empId, String empName, double baseSal,double bonus)
	{
	    this.empId=empId;
	    this.empName=empName;
		this.baseSal = baseSal;
		this.bonus=bonus;
	}
	public PermanentEmployee() {
		super();
	}

	public double getBaseSal() {
		return baseSal;
	}

	public void setBaseSal(double baseSal) {
		this.baseSal = baseSal;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public double getDa() {
		return da;
	}

	public void setDa(double da) {
		this.da = da;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public void calculateSalary() {
		super.calculateSalary();
		double hra = 0.15 * baseSal;
		double da = 0.20 * baseSal;
		double totalSal = baseSal + hra + da + bonus;
		setHra(hra);
		setDa(da);
		super.setSalary(totalSal);
	}

	public void print() {
		super.print();
		System.out.println("Base Salary:" + baseSal);
		System.out.println("HRA:" + hra);
		System.out.println("DA:" + da);
		System.out.println("Bonus:" + bonus);
	}

	@Override
	public String toString() {
		
		return "PermanentEmployee [ "+super.toString()+ " ,baseSal=" + baseSal + ", hra=" + hra + ", da=" + da + ", bonus=" + bonus
				+ "]";
	}
	
	

}
