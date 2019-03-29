package Java_Questions;

import java.util.Scanner;
import java.util.StringTokenizer;

class methodIntial{
	public static String methodMM(String Name)
	{
		StringBuffer sb=new StringBuffer();
		StringTokenizer st=new StringTokenizer(Name, " ");
		
		String FN=st.nextToken();
		String LN=st.nextToken();
		
		sb.append(LN).append(",");
		sb.append(FN.substring(0,1));
		
		return sb.toString();
	}
}

public class InitialFormatTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner Sc=new Scanner(System.in);
	
	System.out.println("Enter the name");
	String Name=Sc.nextLine();
	
	System.out.println(methodIntial.methodMM(Name));

	Sc.close();
	}

}
