package patterns;
public class MirrorRhombus2
{
	public static void main(String[] args)
	{
		int i,j,n=7;
		for(i=0;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if((i+j>=n+1&&j>i)||(i+j+1<=n+1&&j<=i))
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
