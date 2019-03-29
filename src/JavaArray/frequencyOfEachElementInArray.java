package JavaArray;

public class frequencyOfEachElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a={3,4,2,2,1,4,5,8,8,2};
int count=0;
int temp=0;
int minCount=0;
int count_new=0;
int[] minIntegerIndex=new int[7];

for(int i=0;i<a.length;i++)
{
	temp=a[i];
	for(int j=0;j<a.length;j++)
	{
		if(temp==a[j])
		{
			count++;
		}
		
	}
	
	if(count<count_new)
	{
	  minCount=count;
	  minIntegerIndex[3]=a[i];
	}
	count_new=count;
	count= 0;
	for(int k=0; k<4;k++)
	{
		
	}
}
System.out.println("The minimum count is "+minCount+ " of number "+minIntegerIndex[]);
	}

}
