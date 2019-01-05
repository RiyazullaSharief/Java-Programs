package strings;
public class CountTotalWords
{
	public static void main(String[] args)
	{
		String rv="How are you";
		String[] ref=rv.split(" ");
		System.out.println("The total characters are: "+ref.length);
		System.out.println("The words are:");
		for(String s:ref)
		{
			System.out.println(s);
		}
	}
}
