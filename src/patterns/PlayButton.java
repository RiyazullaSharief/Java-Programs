package patterns;
import java.util.Scanner;
public class PlayButton
{
	public static void main(String[] args)
	{
		int i,j,num;
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of play button in number");
		num=scan.nextInt();
		for(i=1;i<=num;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=2;i<=num;i++)
		{
			for(j=num;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
