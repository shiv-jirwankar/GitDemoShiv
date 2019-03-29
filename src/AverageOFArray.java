
public class AverageOFArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[]={47,88,90,44};
      int b[]={56,64,77,99};
      int sum1=0;
      int sum2=0;
      int sum;
      float average;
      for(int i=0;i<a.length;i++)
      {
    	  sum1=sum1+a[i];
      }
      for(int i=0;i<b.length;i++)
      {
    	  sum2=sum2+b[i];
      }
      sum=sum1+sum2;
      System.out.println("the sum of two arrays elements are:"+sum);
      average=sum/(a.length+b.length);
      System.out.println("average of two arrays elements are:"+average);
	}

}
