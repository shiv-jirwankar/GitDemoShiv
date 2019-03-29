package JavaArray;

public class HighestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]={2,9,15,4,20,9,6};
int min=a[0];

for(int i=1;i<a.length; i++)
{
	if(a[i]<min)
	{
		min=a[i];
	}
	
}

System.out.println("smallest number is: "+min);
	}

}
