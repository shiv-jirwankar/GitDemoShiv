class StuMarks{
	int phy,che,maths,eng,cs;
	int total;
	//int percentage;
	
	StuMarks(int phy,int che,int maths,int eng,int cs)
	{
		this.phy=phy;
		this.che=che;
		this.maths=maths;
		this.eng=eng;
		this.cs=cs;
	}
	public void total()
	{
		total=phy+che+maths+eng+cs;
		System.out.println("The total marks obtained is: "+total);
	}
	public void percentage()
	{
		int	percentage= ((total)/500)*100;
		System.out.println("the percentage marks scored is :"+percentage);
	}
}
public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StuMarks M= new StuMarks(66,77,88,99,55);
		M.total();
		M.percentage();

	}

}
