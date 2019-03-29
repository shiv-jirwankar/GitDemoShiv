package Java_Questions_Two;

import java.util.Scanner;

public class twoMaximumDifference {

	public static int methodMaxDiff(int[] a)
	{
		int diff;
		int max=0;
		int indexPosition = 0;
		for(int i=0;i<a.length-1;i++)
		{
			diff=a[i]-a[i+1];
			
			if(diff<0)
			{
				diff=diff*(-1);
			}
			
			if(diff>=max)
				{
					max=diff;
					 indexPosition=i;
				}
			
			
			
		}
		return indexPosition;
			
				
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);

System.out.println("enter the length of integer array");
int length=sc.nextInt();

//defining the array
int b[]=new int[length];

//accepting array of integers as input
System.out.println("Enter the "+length+" number of elements");
for(int i=0; i<b.length; i++)
{
	b[i]=sc.nextInt();
}

System.out.println(twoMaximumDifference.methodMaxDiff(b));

sc.close();
	}

}
