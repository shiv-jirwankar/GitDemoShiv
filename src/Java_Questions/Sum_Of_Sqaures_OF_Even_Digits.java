package Java_Questions;

import java.util.Scanner;

class Sum_Of_Sqaures_OF_Even_Digits_Method{
	public static int sumOfSquaresOfEvenDigits(int number)
	{
		int sum=0;
		while(number!=0)
		{
		    int n1=number%10;
		    if(n1%2==0)
		    {
		    	sum=sum+n1*n1;
		    }
		    number=number/10;
		}
		return sum;
	}
}
public class Sum_Of_Sqaures_OF_Even_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		System.out.println("Enter the number");
		@SuppressWarnings("resource")
		Scanner S=new Scanner(System.in);
		int Number=S.nextInt();
		int Sum=Sum_Of_Sqaures_OF_Even_Digits_Method.sumOfSquaresOfEvenDigits(Number);
		System.out.println("The sum of squares of even integer values is: "+Sum);

	}

}
