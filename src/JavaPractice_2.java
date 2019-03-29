
public class JavaPractice_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        EmpSalary Alex= new EmpSalary(); 
        Alex.EmpID= 100;  //Initialising the object---means storing the value in object.
        Alex.EmpName= "Alex Roy";  //Initialising the object---means storing the value in object.
        Alex.Bonus=10000;  //Initialising the object---means storing the value in object.
        Alex.Basic=2500;   //Initialising the object---means storing the value in object.
        Alex.calculateTotalSalary();
        System.out.println("Total salary is "+ Alex.TotalSalary);
	}

}
