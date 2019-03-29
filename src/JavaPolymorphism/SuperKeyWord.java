package JavaPolymorphism;

class EmployeeDetails{
	String name="Shiv";
}
class EmployeeDetails2 extends EmployeeDetails {
	String name="Vijay";
	
	void printname()
	{
		System.out.println(name);
		System.out.println(super.name);
	}
}

public class SuperKeyWord {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeDetails2 N=new EmployeeDetails2();
		N.printname();
	}

}
