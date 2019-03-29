package Java_Questions;

import java.util.Scanner;

public class MiddleArray {
public static void MiddleArrayMM(int[] a)
{
	int sizeOfArray= a.length;
	int middleCharNum=(sizeOfArray-1)/2;
	System.out.println("The middle integer is :"+a[middleCharNum]);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the size of array");
		   int size=sc.nextInt();
		   int[] a1=new int[size];
		    
		   if((a1.length%2)!=0)
		   {
		   System.out.println("enter the first array elements");
		   for(int i=0;i<a1.length; i++)
		   {
			   a1[i]=sc.nextInt();
		   }
		   MiddleArray.MiddleArrayMM(a1);
		   }
		   else
			   System.out.println("The size of array is even");
		   sc.close();
		   
		
	}

}
