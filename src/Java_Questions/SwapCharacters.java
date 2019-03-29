package Java_Questions;

import java.util.Scanner;

class SwapCharactersM{
	public static StringBuffer SwapCharactersMM(String S)
	{
		int str_length=S.length();
		StringBuffer sb=new StringBuffer();
		if(str_length%2==0)
		{
			for(int i=0; i<str_length-1;i=i+2)
			{
				char a=S.charAt(i);
				char b=S.charAt(i+1);
				sb.append(b).append(a);
			}
		}
		else
		{
			for(int i=0;i<str_length-1;i=i+2)
			{
				char c=S.charAt(i);
				char d=S.charAt(i+1);
				sb.append(d).append(c);
			}
		sb.append(S.charAt(str_length-1));
	}
		return sb;
}
}

public class SwapCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string");
String St=sc.next();

System.out.println(SwapCharactersM.SwapCharactersMM(St));
sc.close();

	}

}
