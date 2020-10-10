
public class ConsultantEmployee extends Employee {
	private int numDays;
	private double chargePerDay;
	private double incentives;

	public ConsultantEmployee() {
		super();

	}

	public ConsultantEmployee(int empId, String empName, double salary, int numDays, double chargePerDay,
			double incentives) {
		super(empId, empName, salary);
		this.numDays = numDays;
		this.chargePerDay = chargePerDay;
		this.incentives = incentives;

	}
	
	public ConsultantEmployee(int empId, String empName, int numDays, double chargePerDay,
			double incentives) {
		this.empId=empId;
		this.empName=empName;
		this.numDays = numDays;
		this.chargePerDay = chargePerDay;
		this.incentives = incentives;

	}


	public int getNumDays() {
		return numDays;
	}

	public void setNumDays(int numDays) {
		this.numDays = numDays;
	}

	public double getChargePerDay() {
		return chargePerDay;
	}

	public void setChargePerDay(double chargePerDay) {
		this.chargePerDay = chargePerDay;
	}

	public double getIncentives() {
		return incentives;
	}

	public void setIncentives(double incentives) {
		this.incentives = incentives;
	}
	
	
	public void calculateSalary() {
		super.calculateSalary();
		double sal=(numDays*chargePerDay)+incentives;
		super.setSalary(sal);
		
	}
	
	public void print() {
		super.print();
		System.out.println("Number of Days"+numDays);
		System.out.println("Charge Per Day"+chargePerDay);
		System.out.println("Incentives"+incentives);
	}

	@Override
	public String toString() {
		
		return "ConsultantEmployee ["+super.toString()+",numDays=" + numDays + ", chargePerDay=" + chargePerDay + ", incentives="
				+ incentives + "]";
	}
	
	
	
 
}
