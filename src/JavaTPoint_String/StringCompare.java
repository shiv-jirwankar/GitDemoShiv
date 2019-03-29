package JavaTPoint_String;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String S1= "Hello Shiv!";
String S2= new String("Hello Shiv!");

//String comparison using .equals method
Boolean Result=S1.equalsIgnoreCase(S2);
System.out.println("The result of strings comparisons is: "+Result);

//String comparison using CompareTo()--> It will return the ASCII difference of the very first Odd value in a string.
int ASCIIdiff = S1.compareTo(S2);
System.out.println("The ASCII differnce between the two Strigs are: "+ASCIIdiff);

//Strings comparison using == operator. This will return a boolean value.
//Boolean result2= (S1==S2);
System.out.println(S1==S2);
	}
}
