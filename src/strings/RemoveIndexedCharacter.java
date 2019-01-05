package strings;
public class RemoveIndexedCharacter
{
	static void test(String rv,int index)
	{
		String s1=rv.substring(0,index);
		String s2=rv.substring(index+1);
		String s3=s1+s2;
		System.out.println(s3);
	}
	
	public static void main(String[] args)
	{
		test("QSPIDERS",1);
		test("QSPIDERS",2);
		test("QSPIDERS",3);
	}
}
