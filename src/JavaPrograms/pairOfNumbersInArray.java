package JavaPrograms;

public class pairOfNumbersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {4, 5, 7, 11, 9, 13, 8, 12};

for(int i=0;i<a.length;i++)
{
	for(int j=i+1;j<a.length;j++)
	{
		if(a[i]+a[j]==20)
		{
			System.out.println("The two pair are: "+a[i]+" "+a[j]);
		}
		
	}
}
	}

}
