package Java_Questions;

import java.util.Scanner;
import java.util.StringTokenizer;

class Extension{
	public static void extensionM(String fileName)
	{
		StringTokenizer st=new StringTokenizer(fileName,".");
		
		for(int i=0;i<3;i++)
		{
		st.nextToken();
		}
		String s2=st.nextToken();
		System.out.println("The file extension type is: "+s2);
	}
}

public class FileExtension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner Sc=new Scanner(System.in);

System.out.println("Enter the file name with extension");
String f_name=Sc.next();
Extension.extensionM(f_name);
Sc.close();
	}

}
