package Java_Questions;

import java.util.Scanner;

class ValidateStringM{
	public static int validateStringM2(String S)
	{
		int d = 0;
		if(S.length()>=8)
		{
			if(S.contains("#") || S.contains("@") || S.contains("_"))
			{
				char A=S.charAt(0);
				if(Character.isAlphabetic(A))
				{
					char B=S.charAt(S.length()-1);
					if(Character.isAlphabetic(B) ||Character.isDigit(B))
					{
						if(S.matches(".*[0-9]{1,}.*") || S.matches(".*[a-zA-Z]{1,}.*"))
						{
							d=1;
						}
					}
				}
			}
		}
		else
		
			d=-1;
		return d;
		
	}
}
public class ValidateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner Sc=new Scanner(System.in);
System.out.println("Enter the string");
String S1=Sc.next();
int p=ValidateStringM.validateStringM2(S1);
if(p==1)
{
	System.out.println("The string is valid");
}
else
{
	System.out.println("The string is invalid");
}
Sc.close();
	}

}
