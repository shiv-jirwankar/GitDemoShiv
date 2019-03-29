package JavaPrograms;

public class SecondLargestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]={5,8,33,4,5,8,9};
int firstlargest;
int secondLargest;

int firstInt=a[0];
int secondInt=a[1];
if(firstInt>secondInt)
{
	 firstlargest=firstInt;
	 secondLargest=secondInt;
}
else
{
	 firstlargest=secondInt;
	 secondLargest=firstInt;
}

for(int i=2;i<a.length;i++)
{
	if(a[i]>firstlargest)
	{
		secondLargest=firstlargest;
		firstlargest=a[i];
	}
	
	else if(a[i]<firstlargest && a[i]>secondLargest)
	{
		secondLargest=a[i];
	}

}
System.out.println("First L: "+firstlargest+"  "+"Second L is:  "+secondLargest);
	}

}
