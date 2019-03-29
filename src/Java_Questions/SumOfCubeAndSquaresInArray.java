package Java_Questions;

import java.util.Scanner;

class Method{
	public static int MethodM(int[] a)
	{
		int n1=0;
		int n2=0;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2==0)
			{
				n1=n1+a[i]*a[i];
			}
			else
			{
				n2=n2+a[i]*a[i]*a[i];
			}
			
			
		}
		
		
		return n1+n2;
		
	}
}

public class SumOfCubeAndSquaresInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner Sc=new Scanner(System.in);
System.out.println("Enter the size of array");
int size=Sc.nextInt();
int[] a=new int[size];

System.out.println("Enter the elements of array");
for(int i=0;i<a.length; i++)
{
  	a[i]=Sc.nextInt();
}
System.out.println("The sum is: "+Method.MethodM(a));

Sc.close();
	}

}
