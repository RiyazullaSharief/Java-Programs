package numbers;
import java.util.Scanner;
public class PrimeNumber
{
	public static void main(String[] args)
	{
		int num;
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		num=scan.nextInt();
		boolean flag=true;
		for(int i=2;i<=num-1;i++)
		{
			if(num%i==0)
			{
				flag=false;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("Prime Number...");
		}
		else
			System.out.println("Not a prime number...");
	}
}
