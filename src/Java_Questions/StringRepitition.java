package Java_Questions;

import java.util.Scanner;

public class StringRepitition {

	public static String StringRepititionMM(String s, int n)
	{
		StringBuffer sb=new StringBuffer();
		if(n>=3)
		{
			String new_string=s.substring(0,3);
			for(int i=0;i<n;i++)
			{
			sb.append(new_string).append(" ");
			}
		}
		else if(n==2)
		{
			String new_string=s.substring(0, 2);
			sb.append(new_string).append(" ").append(new_string);
		}
		else if(n==1)
		{
			String new_string=s.substring(0, 1);
			sb.append(new_string);
		}
        return sb.toString();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		
		String str=sc.next();
		
		System.out.println("Enter the value of n");
		int num=sc.nextInt();
		
		System.out.println(StringRepitition.StringRepititionMM(str, num));
		sc.close();
	}

}
