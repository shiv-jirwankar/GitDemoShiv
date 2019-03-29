package Java_Questions_Two;

import java.util.Scanner;

public class fourPanCard {
public static void methodPanCard(String pan)
{
	if(pan.matches("[A-Z]{3}[0-9]{4}[A-Z]{1}"))
	{
		System.out.println("PAN card number is verified successfully");
	}
	else
		System.out.println("PAN card number is not valid");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String pan=sc.next();
fourPanCard.methodPanCard(pan);
sc.close();
	}

}
