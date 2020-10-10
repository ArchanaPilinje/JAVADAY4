package cloneClassShallow;

public class TestShallow {

	public static void main(String[] args) throws Exception{
		EmployeeShallow e1=new EmployeeShallow(1,"Archana",12000);
		EmployeeShallow e2=(EmployeeShallow)e1.clone();
		e1.print();
		e2.print();
	}

}
