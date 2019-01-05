package numbers;
public class Fibonacci
{
	public static void main(String[] args)
	{
		int a=-1,b=1,sum=0;
		for(int i=1;i<=5;i++)
		{
			sum=a+b;
			a=b;
			b=sum;
			System.out.println(sum);
		}
	}
}
