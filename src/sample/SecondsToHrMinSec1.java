package sample;
import java.util.Scanner;
public class SecondsToHrMinSec1
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
	    System.out.println("Enter seconds");
	    int s=scan.nextInt();
	    
	    int sec=s%60;
	    int min=(s/60)%60;
	    int hours=(s/60)/60;

	    System.out.println(hours + ":" + min + ":" + sec);
	}
}
