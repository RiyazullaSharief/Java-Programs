package numbers;
import java.util.Scanner;
public class SwapNumber
{
	public static void main(String[] args)
	{
		int i,j;
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two numbers");
		i=scan.nextInt();
		j=scan.nextInt();
		System.out.println("Before swap...");
		System.out.println("First number="+i);
		System.out.println("Second number="+j);
		i=i+j-(j=i);
		//i=i*j/(j=i);
		System.out.println("---------------------");
		System.out.println("After swap...");
		System.out.println("First number="+i);
		System.out.println("Second number="+j);
	}
}
