package Java_Questions;

import java.util.Scanner;

/*Write a program to find out sum of common elements in given two arrays. If no common
elements are found print - “No common elements”.
*/
class Question26Method{
	
	public static void Question26M(int a[], int b[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					sum=sum+a[i];
				}
			}
				
		}
		System.out.println("The sum of common elements in the two arrays is: "+sum);
		if(sum==0)
		{
			System.out.println("No common element found");
		}
		
		
	}
}
public class Question26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S=new Scanner(System.in);
		
		System.out.println("Enter index value of first array");
		int n=S.nextInt();
		
		System.out.println("Enter index value of second array");
		int m=S.nextInt();
		int x=n+1;
		int y=m+1;
		
		int[] a=new int[n];
		
		int[] b=new int[m];
		
		System.out.println("Enter "+x+" values for first array");
		for(int i=0;i<n;i++)
		{
			a[i]=S.nextInt();
		}
		
		System.out.println("Enter "+y+" values for second array");
        for(int i=0;i<m;i++)
        {
        	b[i]=S.nextInt();
        }
        Question26Method.Question26M(a, b);
        S.close();
	}

}
