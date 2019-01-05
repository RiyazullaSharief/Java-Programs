package patterns;

import java.util.Scanner;

public class RhombusPattern
{
	public static void main(String[] args)
	{
		int i,j,num;
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of Rhombus");
		num=scan.nextInt();
		for(i=1;i<=num;i++)
		{
			for(j=1;j<=num;j++)
			{
				if(i+j==num+1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			for(j=2;j<=num;j++)
			{
				if(i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		for(i=2;i<=num;i++)
		{
			for(j=1;j<=num;j++)
			{
				if(i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}

			for(j=2;j<=num;j++)
			{
				if(i+j==num+1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
