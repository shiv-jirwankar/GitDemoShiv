package JavaPolymorphism;

//Super keyword to call the same method name from parent class
class suzuki{
	void mileage()
	{
		System.out.println("the milage is 25 Kmpl");
	}
	void maxspeed()
	{
		System.out.println("The maximum speed is 180 kmph");
	}
}

class ford extends suzuki{
	void mileage()
	{
		System.out.println("the milage is 20 kmpl");
	}
	
	void printmethod()
	{
		super.mileage();
	}
}

public class SuperKeyWord_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ford N= new ford();
		N.printmethod();
	}

}
