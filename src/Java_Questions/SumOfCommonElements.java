package Java_Questions;

import java.util.Scanner;

public class SumOfCommonElements {

	public static int SumOfCommonElementsMM(int[] a,int[] b)
	{
		int sum=0;
		for(int i=0; i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
				if(a[i]==b[j])
				{
					sum=sum+a[i];
				}
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the size of first array");
   int size_1=sc.nextInt();
   
   System.out.println("Enter the size of second array");
   int size_2=sc.nextInt();
   
   int[] a1=new int[size_1];
   int[] b1=new int[size_2];
   
   System.out.println("enter the first array elements");
   for(int i=0;i<a1.length; i++)
   {
	   a1[i]=sc.nextInt();
   }
   
   System.out.println("enter the second array elements");
   for(int i=0;i<b1.length; i++)
   {
	   b1[i]=sc.nextInt();
   }
   
   System.out.println(SumOfCommonElements.SumOfCommonElementsMM(a1, b1));
   sc.close();
	}

}
