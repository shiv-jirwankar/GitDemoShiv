package Java_Questions;

import java.util.Scanner;

  class formNewWordMethod{
	 
 public static String formNewWordMethod1(String S, int n)
 {
	 String newString;
	 if(S.length()>n)
	 {
		 newString=S.substring(0, n)+S.substring(S.length()-n, S.length());
		 return newString;
	 }
	 else
	 {
		 return null;
	 }
 }


 }
public class formNewWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner Sc=new Scanner(System.in);
     System.out.println("Enter the word");
     String word=Sc.nextLine();
     
     System.out.println("Enter the number");
     int number=Sc.nextInt();
     String newString= formNewWordMethod.formNewWordMethod1(word, number);
     System.out.println(newString);
     Sc.close();
	}

}
