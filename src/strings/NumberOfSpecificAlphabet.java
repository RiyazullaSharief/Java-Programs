package strings;
public class NumberOfSpecificAlphabet
{
	public static void main(String[] args)
	{
		String str="Shankar Mahadevan";
		int cntr=0;
		/*for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a')
			{
				cntr++;
			}
		}
		System.out.println(cntr+" times");*/
	
		/*==================OR==================*/
		
		int index=0;
		for(int i=0;i<str.length();i++)
		{
			while((index=str.indexOf('a',i))!=-1)
			{
				/*System.out.println("i= "+i);
				System.out.println("index= "+index);
				System.out.println("cntr= "+cntr);*/
				cntr++;
				i=index+1;
			}
		}
		System.out.println("No of occurances are "+cntr);
	}
}
