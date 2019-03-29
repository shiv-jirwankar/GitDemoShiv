package Java_Questions;

import java.util.Scanner;
import java.util.StringTokenizer;

class IdValidatorM{
   public static Boolean IdValidatorMethod(String ID, String locationID)
   {
	   Boolean b = null;
	   StringTokenizer St=new StringTokenizer(ID,"-");
	   String s1=St.nextToken();
	   String s2=St.nextToken();
	   String s3=St.nextToken();
	   String LLL=locationID.substring(0,3);
	   
	   if(s1.equals("CTS") && s2.equals(LLL) && s3.matches("[0-9]{4}"))
	   {
		   b=true;
	   
		   
	   }
	   else
		   b=false;
	   return b;
   }

}

public class IdValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner Sc= new Scanner(System.in);
     System.out.println("Enter the ID");
     String ID=Sc.next();
     
     System.out.println("Enter the location");
     String locationID=Sc.next();
     Boolean b2=IdValidatorM.IdValidatorMethod(ID, locationID);
    // System.out.println(b2);
    	if(b2==true)
    	{
    		System.out.println("ID is valid");
    		
    	}
    	else if(b2==false)
    		System.out.println("ID is invalid");
	 Sc.close();	
	}

}
