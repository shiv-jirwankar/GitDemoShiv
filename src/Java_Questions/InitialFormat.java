package Java_Questions;

import java.util.Scanner;

class methodM
{
	public static void methodMM(String firstName, String lastName)
	{
		char a=firstName.charAt(0);
		System.out.println("The new format is: "+lastName+", "+a);
		
	}
}

public class InitialFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner Sc=new Scanner(System.in);
  
 System.out.println("Enter the First name");
 String FN=Sc.next();
 
 System.out.println("Enter the Last Name");
 String LN=Sc.next();
 
 methodM.methodMM(FN,LN);
 
 Sc.close();
	}

}
