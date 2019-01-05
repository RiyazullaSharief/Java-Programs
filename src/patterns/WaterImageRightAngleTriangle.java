package patterns;
import java.util.Scanner;
public class WaterImageRightAngleTriangle
{
	public static void main(String[] args)
	{
		int i,j,num;
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the height of triangle");
		num=scan.nextInt();
		for(i=1;i<=num;i++)
		{
			for(j=num;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
