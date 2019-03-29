import java.util.Arrays;


public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]={100,67,66,33};
System.out.println("The numbers before sorting are:");
for(int i=0;i<a.length;i++)
{
	System.out.println(a[i]);
}
Arrays.sort(a);
System.out.println("The numbers after sorting are:");
for(int i=0;i<a.length;i++)
{
	System.out.println(a[i]);
}
	}

}
