package Java_Questions;

import java.util.Scanner;

class Fetch_MiddleChars
{
	public static void getMiddleChar(String text)
	{
		//StringBuffer sb= new StringBuffer();
		if(text.length()%2==0)
		{
			String Str1= text.substring((text.length()/2)-1,(text.length()/2)+1);
			
			System.out.println("The middle two characters are: "+Str1);
				
			
		}
		else{
			System.out.println("Kindly enter the even digits name");
		}
	}
}
public class Fetching_Middle_Characters_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the  text");
String text=s.next();
//Fetch_MiddleChars MiddleChars =new Fetch_MiddleChars();
Fetch_MiddleChars.getMiddleChar(text);
s.close();
	}

}
