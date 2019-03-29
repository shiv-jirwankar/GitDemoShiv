package JavaTPoint_String;


//example where we are concatenating multiple string objects.


public class Concat2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String S1="Hey there!";
String S2="What's up?";
String S3="Let's meet.";

String S4=S1.concat(S2);
String S5=S1.concat(S2).concat(S3);

System.out.println(S4);
System.out.println(S5);
	}

}
