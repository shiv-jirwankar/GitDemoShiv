package JavaArray;

public class SumOfCommonElementsInArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]={5,4,3,7,8};
    int b[]={6,3,8,2,1};
    int sum=0;
    for(int i=0;i<a.length;i++)
    {
    	for(int j=0;j<b.length;j++)
    	{
    		if(a[i]==b[j])
    		{
    		sum=sum+a[i];
    		}
    	}
    }
    System.out.println(sum);
	}

}
