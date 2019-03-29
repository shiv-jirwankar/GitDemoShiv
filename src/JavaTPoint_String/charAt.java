//example where we are counting frequency of a character in the string.

package JavaTPoint_String;

public class charAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Welcome to Jungle";
int count=0;
for(int i=0; i<=str.length()-1; i++)
{
	if(str.charAt(i)=='e')
	{
		count++;
	}
}
System.out.println("the frequency of e is: "+count);
	}

}
