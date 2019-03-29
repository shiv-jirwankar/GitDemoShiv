package JavaArray;

public class rightShiftArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]={4,5,6,7,8,9};
System.out.println("The original array is: ");
for(int i=0;i<a.length;i++)
{
	System.out.print(a[i]+" ");
}

int n=1;

for(int i=0;i<n;i++)
{
	int last=a[a.length-1];
	
	for(int j=a.length-1;j>0;j--)
	{
		a[j]=a[j-1];
	}
    a[0]=last;
}

System.out.println("The new array is :");
for(int k=0;k<a.length;k++)
{
	System.out.print(a[k]+" ");
}

	}

}
