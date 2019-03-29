package Java_Questions;

import java.util.Scanner;

class validatePassword1{
	public static void validatePasswordMethod(String pass)
	{
		if(pass.matches(".*[0-9]{1,}.*") && pass.matches(".*[@#$]{1,}.*") && pass.length()>=6 && pass.length()<=20)
		{
			System.out.println("The password validation is successfull");
		}
		else{
			System.out.println("The password validation is failed");
		}
	}
}

public class validatePassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner Sc=new Scanner(System.in);
 
System.out.println("Enter the password");
String password=Sc.nextLine();
validatePassword1.validatePasswordMethod(password);

Sc.close();
	}

}
