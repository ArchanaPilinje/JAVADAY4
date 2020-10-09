package objectClass;

public class TestEmployee {

	public static void main(String[] args) {
		Employee e1=new Employee(12,"Archana",12000);
		Employee e2=new Employee(13,"Rajesh",14000);
		System.out.println(e1);
		System.out.println(e2);
		
		boolean flag,flag1;
		flag=e1.equals(e2);
		if(flag==true) {
			System.out.println("Both the employees are the same");
		}
		else {
			System.out.println("They are different employees");
		}
		
		Employee e3=e1;
		System.out.println(e3);
		System.out.println(e1);
		flag1=e1.equals(e3);
		if(flag1==true) {
			System.out.println("Both the employees are the same");
		}
		else {
			System.out.println("They are different employees");
		}
		
		
	}

}
