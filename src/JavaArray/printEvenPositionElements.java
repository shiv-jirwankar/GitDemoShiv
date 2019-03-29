package JavaArray;

import java.util.Scanner;

public class printEvenPositionElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the length of array");
		int length=sc.nextInt();
		int[] a=new int[length];
		
		System.out.println("Enter the elements of the array");
		for(int i=0;i<length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				System.out.print(a[i]+" ");
			}
		}
		
	}

}
