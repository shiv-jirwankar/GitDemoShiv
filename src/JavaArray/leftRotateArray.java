package JavaArray;

import java.util.Arrays;

public class leftRotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]={4,5,6,7,8,9};

int firstEle=a[0];
for(int i=0;i<a.length-1;i++)
{
	a[a.length-1]=a[0];
	a[i]=a[i+1];
	
}
a[a.length-1]=firstEle;
System.out.println("The new array is "+Arrays.toString(a));
	}

}
