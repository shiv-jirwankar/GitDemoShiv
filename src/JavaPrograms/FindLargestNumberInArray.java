package JavaPrograms;

import java.util.Arrays;

public class FindLargestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a={99,8,44,55,6,33,8};

Arrays.sort(a);
System.out.println(Arrays.toString(a));

//By using iterative loop---->

//int max=a[0];

/*for(int i=1;i<a.length;i++)
{
	if(a[i]>=max)
	{
		max=a[i];
	}
}
System.out.println("The largest number in the array is: "+max);
	}*/
	}
}
