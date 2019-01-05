package strings;
public class PalindromeString
{
	public static void main(String[] args)
	{
		String rv1="DAD";
		String rv2="";
		for(int i=rv1.length()-1;i>=0;i--)
		{
			rv2=rv2+rv1.charAt(i);
		}
		System.out.println("The Original String is: "+rv1);
		System.out.println("The Reversed String is: "+rv2);
		if(rv1.equalsIgnoreCase(rv2))
			System.out.println("The Given String is a Palindrome");
		else
			System.out.println("The Given String is not a Palindrome");
	}
}
