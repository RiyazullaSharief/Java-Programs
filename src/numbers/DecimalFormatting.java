package marriott;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;
public class DecimalFormatting
{
	public static double round(double value, int places)
	{
		if (places < 0) throw new IllegalArgumentException();
	    BigDecimal bd = new BigDecimal(value);
	    bd = bd.setScale(places, RoundingMode.HALF_UP);
	    return bd.doubleValue();
	}
	
	public static void main(String[] args) throws InterruptedException
	{		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter the Base price");
		String rate=scan.nextLine();
		System.out.println("Please Enter the taxes");
		String taxes=scan.nextLine();
		Double averageRate=Double.parseDouble(rate);
		Double averageTaxes=Double.parseDouble(taxes);
		double averageTotal=averageRate+averageTaxes;
		System.out.println("Average Total= "+averageTotal);
		
//		System.out.println(round(25.0,2)); //No matter whether decimal exists or not, always hold the values upto 2 decimal even if it needs to pad additional zeros.
		
		//** Reverse of it...
		/*double value = 1.125879D;
		double valueRounded = Math.round(value * 100D)/100D;
		System.out.println("Value Rounded= "+valueRounded);
		//** End of this...*/		
		
		//This works
		
		DecimalFormat two = new DecimalFormat("0.00"); //Make new decimal format
		double value=150.10;
		String value1=two.format(value);
		System.out.println("Value1= "+value1);
		String averageTotalValue=two.format(averageTotal);
		System.out.println("AverageTotalValue= "+averageTotalValue);
	    System.out.println("Value= "+two.format(value)); 
	    System.out.println("Value= "+two.format(25.00d));
	    System.out.println("Value= "+two.format(25));
	    System.out.println("Value= "+two.format(25.666));
	}
}
