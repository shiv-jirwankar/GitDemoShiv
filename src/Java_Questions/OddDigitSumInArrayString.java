package Java_Questions;

import java.util.Scanner;

public class OddDigitSumInArrayString {

	public static int OddDigitSumInArrayStringMM(int n,String[] str)
	{
		int sum=0;
		
		for(int i=0;i<str.length;i++)
		{
			for(int j=0;j<str[i].length();j++)
			{
				char c=str[i].charAt(j);
				if(Character.isDigit(c))
				{
					if(c%2!=0)
					{
						String t=String.valueOf(c);
						int num=Integer.parseInt(t);
						 sum=sum+num;
					}
				}
			}
		}
		return sum;
		
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the count of strings");
		int n=Sc.nextInt();
		
		String[] a=new String[n];
		
		System.out.println("Enter the "+n+" "+"Strings");
		
		for(int i=0;i<n;i++)
		{
		   a[i]=Sc.next();
		}
		System.out.println(OddDigitSumInArrayString.OddDigitSumInArrayStringMM(n, a));
		Sc.close();
	}

}
