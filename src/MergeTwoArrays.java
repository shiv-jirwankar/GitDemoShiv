import java.util.Arrays;


public class MergeTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={20,20,40,50};
		int b[]={5,7,88,44};
		int merge[]= new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			merge[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			merge[i+a.length]=b[i];
		}
		System.out.println(Arrays.toString(merge));
	}

}
