import java.util.Scanner;
public class EmployeeSalary {

	public static void main(String[] args) throws Exception {
		/*
		 * Employee e1=new Employee(1,"John Doe",12000); 
		 * e1.calSalary();
		 * e1.printDetails();
		 */
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the  number of employees");
//		int e=sc.nextInt();
//		Employee[] employees=new Employee[e];
//		for(int i=0;i<e;i++) {
//			System.out.println("Enter the id,name and base salary of Employee"+(i+1));
//			int id=sc.nextInt();
//			sc.nextLine() ;
//			String s=sc.nextLine(); 
//			int sal=sc.nextInt(); 
//			employees[i]=new Employee(id,s,sal);
//		}
//		
//		for(Employee e1:employees) {
//			e1.calSalary();
//			e1.printDetails();
//			System.out.println("*********************");
//			
//		}
		Address a;
		Employee e,e1;
		System.out.println("Enter the adress line,city,pincode and state of the Employee");
		String li=sc.nextLine();
		String ci=sc.nextLine();
		String pi=sc.nextLine();
		String st=sc.nextLine();
		a=new Address(li,ci,pi,st);
		System.out.println("Enter the id,name and base salary of the Employee");
		int id=sc.nextInt();
		sc.nextLine();
		String name=sc.nextLine();
		int salary=sc.nextInt();
		e=new Employee(id,name,salary,a);
		e.calSalary();
		e.printDetails();
		e1=(Employee)e.clone();
		e1.printDetails();
		
	}

	
}
