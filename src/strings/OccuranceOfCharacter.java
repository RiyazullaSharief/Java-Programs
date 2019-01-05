package strings;
public class OccuranceOfCharacter
{
	public static void main(String[] args)
	{
		String rv="MALAYALAM";
		int count=0;
		for(int i=0;i<=rv.length()-1;i++)
		{
			if(rv.charAt(i)=='A')
			count++;
		}
		System.out.println("The count is "+count);
	}
}
