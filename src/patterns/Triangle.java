package patterns;
import java.util.Scanner;
public class Triangle
{
	public static void main(String[] args)
	{
		int i,j,s,num;
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the height of triangle");
		num=scan.nextInt();
		for(i=1;i<=num;i++)
		{
			for(s=num;s>i;s--)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
