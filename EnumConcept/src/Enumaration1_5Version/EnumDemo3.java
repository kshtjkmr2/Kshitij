package Enumaration1_5Version;

public class EnumDemo3 {

	public static void main(String[] args) {
		Month m = Month.APR;
		switch(m)
		{
		   case JAN:
		       System.out.println("First Month of year");
		       break;
		   
		   case FEB:
			   System.out.println("Second month of year");
			   break;
			   
		   case APR:
			   System.out.println("Fool Month");
			   break;
			   
		  /* case TUE:
			   System.out.println("Invalid");*/
			 
		}

	}

}
