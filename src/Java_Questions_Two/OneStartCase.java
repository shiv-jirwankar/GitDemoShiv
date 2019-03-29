package Java_Questions_Two;

import java.util.Scanner;
import java.util.StringTokenizer;

public class OneStartCase {

	public static String methodStartCase(String S)
	{
		StringBuffer sb=new StringBuffer();
		StringTokenizer st=new StringTokenizer(S," ");
		
		while(st.hasMoreTokens())
		{
			String s1=st.nextToken();
			String s2=s1.substring(0, 1);
			
			String s3=s1.substring(1, s1.length());
			
			sb.append(s2.toUpperCase()).append(s3).append(" ");
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println();
String S=sc.nextLine();

System.out.println(OneStartCase.methodStartCase(S));
sc.close();

	}

}
