package Java_Questions;

import java.util.Scanner;
import java.util.StringTokenizer;

public class NameShrinking {
	public static StringBuffer NameShrinkingMM(String name)
	{
		StringTokenizer st=new StringTokenizer(name," ");
		String s1=st.nextToken();
		String s2=st.nextToken();
		String s3=st.nextToken();
	
		char mn=s2.charAt(0);
		char fn=s1.charAt(0);
		
		StringBuffer sb=new StringBuffer(s3);
		sb.append(" ").append(mn).append(".").append(fn);
		return sb;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the name in the format: FN MN LN");

String Name=sc.nextLine();
System.out.println(NameShrinking.NameShrinkingMM(Name));
sc.close();


	}

}
