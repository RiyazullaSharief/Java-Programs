package patterns;
public class PlayButton1
{
	public static void main(String[] args)
	{
		int i,j,num=5;
		for(i=1;i<=num;i++)
		{
			for(j=1;j<=num;j++)
			{
				if(j<=i && i+j<=num+1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
