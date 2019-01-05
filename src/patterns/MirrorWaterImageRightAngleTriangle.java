package patterns;
import java.util.Scanner;
public class MirrorWaterImageRightAngleTriangle
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
			for(s=1;s<i;s++)
			{
				System.out.print(" ");
			}
			for(j=num;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
