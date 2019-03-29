package Java_Questions;

import java.util.Scanner;

public class FlushCharacters {

	public static String FlushCharactersMM(String s)
	{
		String new_string=s.replaceAll("[a-zA-Z]", "");
		return new_string;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");

		String str=sc.next();
		System.out.println(FlushCharacters.FlushCharactersMM(str));
		sc.close();

	}

}
