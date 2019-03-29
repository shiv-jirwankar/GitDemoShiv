package Java_Questions;

import java.util.Scanner;
import java.util.StringTokenizer;

class MethodMMM{
	public static Boolean MethodM(String ipAddress)
	{
		Boolean e=null;
		
		StringTokenizer st=new StringTokenizer(ipAddress,".");
		int a=Integer.parseInt(st.nextToken());
		int b=Integer.parseInt(st.nextToken());
		int c=Integer.parseInt(st.nextToken());
		int d=Integer.parseInt(st.nextToken());
		
		if((a>0 && a<=255) && (b>0 && b<=255) && (c>0 && c<=255) && (d>0 && d<=255))
		{
			e=true;
		}
		else
			e=false;
		return e;
	}
}


public class IPvalidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner Sc=new Scanner(System.in);
System.out.println("Enter the ip address");
String ip=Sc.next();

Boolean s=MethodMMM.MethodM(ip);
if(s==true)
{
	System.out.println("ip is valid");
}
else
{
	System.out.println("ip is invalid");
}
Sc.close();
	}

}
