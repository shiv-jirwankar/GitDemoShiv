package Java_Questions;

import java.util.Scanner;

class Sum_Of_Odd_Digits_Method{
	public static int checkSum(int n)
	{
	    int sum=0;
	    int r;
		while(n!=0)
		{
			int n1=n%10;
			if(n1%2!=0)
			{
				sum=sum+n1;
			}
			n=n/10;
		}
		if(sum%2==0)
		{
			r=-1;
		}
		else
		{
			r=1;
		}
		return r;
	}
	
}
public class Sum_Of_Odd_Digits {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner S=new Scanner(System.in);
        int n=S.nextInt();
        int r=Sum_Of_Odd_Digits_Method.checkSum(n);
        if(r==-1)
        {
        	System.out.println("The sum of odd digits are Even");
        }
        else if(r==1)
        {
        	System.out.println("The sum of odd digits are Odd");
        }
	}

}
