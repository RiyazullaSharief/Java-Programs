package toStringMethodTopic;
class C
{
	public String toString()
	{
		return "C Class Object";
	}
}

public class Tester3
{
	public static void main(String[] args)
	{
		C rv1=new C();
		System.out.println(rv1);
		C rv2=new C();
		System.out.println(rv2);
		Tester3 rv3=new Tester3();
		System.out.println(rv3);
	}
}
