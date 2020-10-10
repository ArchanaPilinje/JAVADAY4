import java.util.Scanner;
public class EmployeeSalary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/* To input 1 employee at a time*/
//		int flag=0;
//		do {
//		System.out.println("Please select from the following options");
//		System.out.println("1.Permanent Employee\n2.Consultant Employee");
//		int ch=sc.nextInt();
//		
//		
//		switch(ch) {
//		case 1: PermanentEmployee p=new PermanentEmployee();
//				System.out.println("Enter the ID,Name,Base Sal,Bonus of the Permanent Employee");
//				p.setEmpId(sc.nextInt());
//				sc.nextLine();
//				p.setEmpName(sc.nextLine());
//				p.setBaseSal(sc.nextDouble());
//				p.setBonus(sc.nextDouble());
//				p.calculateSalary();
//				p.print();
//				break;
//		
//		case 2: ConsultantEmployee c=new ConsultantEmployee();
//				System.out.println("Enter the ID,Name,Number of days,Charge Per Day and Incentive of the Permanent EMployee");
//				c.setEmpId(sc.nextInt());
//				sc.nextLine();
//				c.setEmpName(sc.nextLine());
//				c.setNumDays(sc.nextInt());
//				c.setChargePerDay(sc.nextDouble());
//				c.setIncentives(sc.nextDouble());
//				c.calculateSalary();
//				c.print();
//				break;
//				
//		}
//		System.out.println("Press the Corresponding option:\n1.Continue 0. Exit");
//		flag = sc.nextInt();
//		}while(flag==1);
		/*To input multiple employee*/
		
		System.out.println("Enter the number of employees");
		int num = sc.nextInt();
		Employee e[]=new Employee[num];
		for (int i = 0; i < num; i++) {
			System.out.println("1.Permanent\n 2.Consultant");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				
				System.out.println("Enter the ID,Name,Base Sal,Bonus of the Permanent Employee");
				int idp=sc.nextInt();
				sc.nextLine();
				String namep=sc.nextLine();
				double baseSal=sc.nextDouble();
				double bonus=sc.nextDouble();
				e[i] = new PermanentEmployee(idp,namep,baseSal,bonus);
				break;
				
				
			case 2:
				
				System.out.println(
						"Enter the ID,Name,Number of days,Charge Per Day and Incentive of the Permanent EMployee");
				int idc=sc.nextInt();
				sc.nextLine();
				String namec=sc.nextLine();
				int numD=sc.nextInt();
				double charge=sc.nextDouble();
				double incentive=sc.nextDouble();
				e[i] = new ConsultantEmployee(idc,namec,numD,charge,incentive);
				break;
			}
		}
		
		for(int i=0;i<num;i++) {
			e[i].calculateSalary();
		}
		
		for(int i=0;i<num;i++) {
			e[i].print();
		}
		
		for(int i=0;i<num;i++) {
			System.out.println(e[i]);
		}
		

	}

}
