
public class Employee implements Cloneable {
private int id;
private String name;
private double totalSal;
private int baseSal;
private double hra;
private double da;
private Address ad;

	public Employee() {
		
	}

	public Employee(int id, String name, int baseSal,Address ad) {
		this.id = id;
		this.name = name;
		this.baseSal = baseSal;
		this.ad=ad;
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

	public double getTotalSal() {
		return totalSal;
	}

	public void setTotalSal(double totalSal) {
		this.totalSal = totalSal;
	}

	public int getBaseSal() {
		return baseSal;
	}

	public void setBaseSal(int baseSal) {
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
	
	
	public void calSalary() {
		baseSal=getBaseSal();
		double hra=0.15*baseSal;
		double da=0.20*baseSal;
		double totalSal=baseSal+hra+da;
		setHra(hra);
		setDa(da);
		setTotalSal(totalSal);
		
	}
	
	public void printDetails() {
		System.out.println("ID:"+this.id);
		System.out.println("Name:"+this.name);
		System.out.println("Base Salary:"+this.baseSal);
		System.out.println("House Rental Allowance:"+this.hra);
		System.out.println("Dearness Allowance:"+this.da);
		System.out.println("Total Salary:"+this.totalSal);
		ad.printAdress();
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
	return super.clone();
	}

}
