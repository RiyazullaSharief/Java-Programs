package patterns;
import java.util.Scanner;
public class PascalTriangle
{
	public static void main(String[] args)
	{
		int i,j,s,num;
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		num=scan.nextInt();
		for(i=0;i<num;i++)
		{
			for(s=num;s>i;s--)
			{
				System.out.print(" ");
			}
			int n=1;
			for(j=0;j<=i;j++)
			{
				System.out.print(n+" ");
				n=n*(i-j)/(j+1);
			}
			System.out.println();
		}
	}
}
