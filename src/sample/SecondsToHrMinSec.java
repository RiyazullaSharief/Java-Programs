package sample;
import java.util.Scanner;
public class SecondsToHrMinSec
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
        int seconds;
        int minutes ;
        int hours;
        System.out.println("Enter the number of seconds : ");
        seconds=input.nextInt();
        hours=seconds/3600;
        minutes=(seconds%3600)/60;
        int seconds_output=(seconds%3600)%60;
        System.out.println("The time entered in hours,minutes and seconds is:");
        System.out.println(hours+" hours : "+minutes +" minutes : "+seconds_output+" seconds");
	}
}
