
public class constructors {
	int a;
	String name="Shiv";
	
	public constructors(String name, int a)
	{
		
		this.name=name;
		this.a=a;
		
	}
	public void display()
	{
		System.out.println(name+" "+a);
	}
	
	public void display2()
	{
		this();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
constructors c= new constructors("Shiv", 677);
c.display();
	}

}
