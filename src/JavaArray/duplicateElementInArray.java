package JavaArray;

public class duplicateElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a={1,2,3,2,2,4,5,7,8,8,3};
for(int i=0;i<a.length;i++)
{
	for(int j=i+1;j<a.length;j++)
	{
		if(a[i]==a[j])
		{
			System.out.println("The duplicate element is "+a[i]);
			break;
		}
	}
}
	}

}
