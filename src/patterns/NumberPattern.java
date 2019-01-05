package patterns;
import java.util.Scanner;
public class NumberPattern
{
	public static void main(String[] args)
	{
		//int count=1; //For --a
		int count=0;
		int i,j,num;
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		num=scan.nextInt();
		for(i=1;i<=num;i++)
		{
			for(j=1;j<=i;j++)
			{
				count++;
			}
			//System.out.print("count= "+count+" ");
			int a=count;
			for(j=1;j<=i;j++)
			{
				//System.out.print(--a);  //When count=1
				System.out.print(a-- +" ");
			}
			System.out.println();
		}
	}
}
