class Area{
	int r_cir, r_cyl, l, b,h;
	float area_c, area_cylinder, area_rec;
	float pi=3.14f;
	public int parentVariable;
	void area_circle(int a)
	{
		r_cir=a;
	}
	void display_area_cricle()
	{
		area_c=pi*r_cir*r_cir;
	    System.out.println("The area of the circle is:"+area_c);
	}
	void area_cylinder(int x, int y)
	{
		r_cyl=x;
		h=y;
	}
	void display_area_cylinder()
	{
		area_cylinder=2*pi*r_cyl*h;
		System.out.println("The area of the cylinder is:"+area_cylinder);
	}
	void area_rectangle(int f, int g)
	{
		l=f;
		b=g;
	}
	void display_area_rectangle()
	{
		area_rec=l*b;
		System.out.println("The area of the rectangle is: "+area_rec);
	}
}
public class Area_New {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area Ar= new Area();
		Ar.area_circle(7);
		Ar.display_area_cricle();
		Ar.area_cylinder(17,7);
		Ar.display_area_cylinder();
		Ar.area_rectangle(5, 6);
		Ar.display_area_rectangle();
	
          
	}

}
