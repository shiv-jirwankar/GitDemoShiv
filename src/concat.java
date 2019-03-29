
public class concat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String Str1="This is just for testing";
Str1.concat("This is String concat");
System.out.println("The new concat string is: "+Str1); 
//this will print "This is just for testing", as line 7 value is not stored in any variable.

Str1=Str1.concat("The is the new one");
System.out.println("The new string is :"+Str1); 
//this will print "This is just for testingThe is the new one" as the new concat string is stroed in the varaible

	}

}
