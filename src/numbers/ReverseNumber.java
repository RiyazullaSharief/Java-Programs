package numbers;
import java.util.Scanner;
public class ReverseNumber
{
	public static void main(String[] args)
	{
		int num,rem=0,rev=0;
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		num=scan.nextInt();
		while(num!=0)
		{
			rem=num%10;
		    rev=rem+rev*10;
			num=num/10;
		}
		System.out.println(rev);
	}
}
