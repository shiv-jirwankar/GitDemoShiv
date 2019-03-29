package Java_Questions;

import java.util.Scanner;

public class StringManipulation {
	public static String StringManipulationMM(String s)
	{
		
		StringBuffer sb=new StringBuffer(s);

		if(s.charAt(0)!='j' && s.charAt(1)!='b')
		{
			//newString=s.substring(2,strLen);
			sb.delete(0, 2);
		}
		else if(s.charAt(0)=='j')
		{
			sb.deleteCharAt(1);
			
		}
		else if(s.charAt(1)=='b')
		{
			sb.deleteCharAt(0);
			
		}
		else if(s.charAt(0)=='j' && s.charAt(1)=='b')
		{
			System.out.println(sb);
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		
		String str=sc.next();
		System.out.println(StringManipulation.StringManipulationMM(str));
		sc.close();
	}

}
