import java.text.SimpleDateFormat;
import java.util.Date;


public class SimpleDataFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Date date=new Date();
SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
String date1=sdf.format(date);

SimpleDateFormat sdf2=new SimpleDateFormat("hh:mm:ss");
String time=sdf2.format(date);
System.out.println("Date is "+date1+" Time is "+time);
		
	
	}

}
