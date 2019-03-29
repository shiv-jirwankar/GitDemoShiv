package JavaArray;

public class copyOneArrayIntoAnotherArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]={5,6,7,8,9,4};
int b[]=new int[a.length];

//initialiaing the array b
for(int i=0;i<a.length;i++)
{
	b[i]=a[i];
}

//printing the array b
for(int i=0;i<b.length;i++)
{
	System.out.print(b[i]+" ");
}
}
}
