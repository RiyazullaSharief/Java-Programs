package strings;
import java.util.Scanner;
public class ReverseString
{
	public static void main(String[] args)
	{
		String rv;
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String");
		rv=scan.nextLine();
		//String rv="EMOCLEW";
		System.out.println("Original string is: "+rv);
		System.out.print("Reversed string is: ");
		for(int i=rv.length()-1;i>=0;i--)
		{
			System.out.print(rv.charAt(i));
		}
	}
}
