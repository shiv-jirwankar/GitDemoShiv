
public class Area_rectangle_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   AreaRectangle R1= new AreaRectangle();
   AreaRectangle R2= new AreaRectangle();
   R1.insert(10, 5);
   R2.insert(6, 5);
   R1.CalculateArea();
   R2.CalculateArea();
   System.out.println("Rectangle R1 area is:"+ R1.area);
   System.out.println("Rectangle R2 area is: "+R2.area);
   
	}

}
