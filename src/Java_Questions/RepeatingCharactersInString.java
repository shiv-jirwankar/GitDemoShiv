package Java_Questions;

import java.util.Scanner;

public class RepeatingCharactersInString {

	public static String RepeatingCharactersInStringMM(int n,String s)
	{
		StringBuffer sb=new StringBuffer(s);
		String lastNchars=s.substring(s.length()-n);
		for(int i=0;i<n;i++)
		{
			sb.append(lastNchars);
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
System.out.println(RepeatingCharactersInString.RepeatingCharactersInStringMM(num, str)); 
sc.close();
	}

}
