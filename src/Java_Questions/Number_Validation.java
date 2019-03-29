package Java_Questions;

import java.util.Scanner;

class Number_Validation_Method{
	public static int validateNumber(String Number)
	{
		int r;
		if(Number.matches("[0-9]{3}[-]{1}[0-9]{3}[-]{1}[0-9]{4}"))
		{
			r=1;	

		}
		else
		{
			r=-1;
		}
		return r;
}
}
public class Number_Validation {

	public void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Phone number");
		Scanner N=new Scanner(System.in);
		String Number=N.next();
		int r=Number_Validation_Method.validateNumber(Number);
		if(r==1)
		{
			System.out.println("The Phone number entered is in the form of XXX-XXX-XXXX");
		}
		else{
			System.out.println("The Phone number entered is not in the form of XXX-XXX-XXXX");
		}
		N.close();
	}
}
	



