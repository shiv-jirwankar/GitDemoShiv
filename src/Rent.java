import java.util.Scanner;


public class Rent {






	public static void main(String[] args) {
		// TODO Auto-generated method stub
        @SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
    
		System.out.println("Enter the only rent amount per head");
		int only_rent= sc.nextInt();
		
		System.out.println("Please enter the name from the following only: Shiv, Harsh, Pranshu, Rohan, Krushnakant and Arshad");
		System.out.println("Who paid the electricity bill?");
	    String elec_bill_name= sc.next();
	  
	   
	    
	    
	    System.out.println("How much was the electricity bill?");
	    float elec_bill= sc.nextFloat();
	    
	    System.out.println("Who paid the WiFi bill?");
	    String wifi_bill_name= sc.next();
	    
	  
	    
	    System.out.println("How much was the WiFi bill?");
	    float wifi_bill=sc.nextFloat();
	    
	    System.out.println("Who paid the maid fee?");
        String maid_fee_name= sc.next();
        
        //to check the invalid name
        if(maid_fee_name!="Shiv")
	    {
	    	System.out.println("You have entered wrong name of maid fee payer");
	    }
	  
      
        
        System.out.println("How much was the maid fee?");
        float maid_fee=sc.nextFloat();
        
        float elec_bill_individual= elec_bill/6;
        float wifi_bill_individual=wifi_bill/6;
        float maid_fee_individual=maid_fee/6;
        float actual_rent= only_rent+elec_bill_individual+wifi_bill_individual+maid_fee_individual;
        
        System.out.println("The total rent to pay by each person apart from "+elec_bill_name+" and "+wifi_bill_name+" and "+maid_fee_name+" is "+actual_rent);
        

		switch(elec_bill_name)
        {
        	case "Shiv":
        		float Shiv_rent= actual_rent-elec_bill;
        		System.out.println("The total rent amount for Shiv to pay is: "+Shiv_rent);
        		break;
        	case "Rohan":
        		float Rohan_rent= actual_rent-elec_bill;
        		System.out.println("The total rent amount for Rohan to pay is: "+Rohan_rent);
        		break;
        	case "Harsh":
        		float Harsh_rent= actual_rent-elec_bill;
        		System.out.println("The total rent amount for Harsh to pay is: "+Harsh_rent);
        		break;
        	case "Arshad":
        		float Arshad_rent= actual_rent-elec_bill;
        		System.out.println("The total rent amount for Arshad to pay is: "+Arshad_rent);
        		break;
        	case "Pranshu":
        		float Pranshu_rent= actual_rent-elec_bill;
        		System.out.println("The total rent amount for Pranshu to pay is: "+Pranshu_rent);
        		break;
        	case "Krupanshu":
        		float Krupanshu_rent= actual_rent-elec_bill;
        		System.out.println("The total rent amount for Krupanshu to pay is: "+Krupanshu_rent);
        		break;
        	default:
        		System.out.println("You have entered the wrong name of the payer");
        }
        
        switch(wifi_bill_name)
        {
        	case "Shiv":
        		float Shiv_rent= actual_rent-wifi_bill;
        		System.out.println("The total rent amount for Shiv to pay is: "+Shiv_rent);
        		break;
        	case "Rohan":
        		float Rohan_rent= actual_rent-wifi_bill;
        		System.out.println("The total rent amount for Rohan to pay is: "+Rohan_rent);
        		break;
        	case "Harsh":
        		float Harsh_rent= actual_rent-wifi_bill;
        		System.out.println("The total rent amount for Harsh to pay is: "+Harsh_rent);
        		break;
        	case "Arshad":
        		float Arshad_rent= actual_rent-wifi_bill;
        		System.out.println("The total rent amount for Arshad to pay is: "+Arshad_rent);
        		break;
        	case "Pranshu":
        		float Pranshu_rent= actual_rent-wifi_bill;
        		System.out.println("The total rent amount for Pranshu to pay is: "+Pranshu_rent);
        		break;
        	case "Krupanshu":
        		float Krupanshu_rent= actual_rent-wifi_bill;
        		System.out.println("The total rent amount for Krupanshu to pay is: "+Krupanshu_rent);
        		break;
        	default:
        		System.out.println("You have entered the wrong name of the payer");
        }
        
        switch(maid_fee_name)
        {
        	case "Shiv":
        		float Shiv_rent= actual_rent-maid_fee;
        		System.out.println("The total rent amount for Shiv to pay is: "+Shiv_rent);
        		break;
        	case "Rohan":
        		float Rohan_rent= actual_rent-maid_fee;
        		System.out.println("The total rent amount for Rohan to pay is: "+Rohan_rent);
        		break;
        	case "Harsh":
        		float Harsh_rent= actual_rent-maid_fee;
        		System.out.println("The total rent amount for Harsh to pay is: "+Harsh_rent);
        		break;
        	case "Arshad":
        		float Arshad_rent= actual_rent-maid_fee;
        		System.out.println("The total rent amount for Arshad to pay is: "+Arshad_rent);
        		break;
        	case "Pranshu":
        		float Pranshu_rent= actual_rent-maid_fee;
        		System.out.println("The total rent amount for Pranshu to pay is: "+Pranshu_rent);
        		break;
        	case "Krupanshu":
        		float Krupanshu_rent= actual_rent-maid_fee;
        		System.out.println("The total rent amount for Krupanshu to pay is: "+Krupanshu_rent);
        		break;
        	default:
        		System.out.println("You have entered the wrong name of the payer");
        		
        }
        
	}

}
