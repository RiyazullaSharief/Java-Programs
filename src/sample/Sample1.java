package sample;
public class Sample1
{
	public static void main(String[] args)
	{
		int i=10000,j;
		char ch,ch1='²';
		char ch2='√';
		char ch3='ⁿ';
		char ch4='■';
		char ch5='·';
		ch=(char)i;
		j=(int)ch1;
		/*System.out.println(i);
		System.out.println(ch);*/
		System.out.println("'"+ch+"'"+" is the symbol for the ASCII value: "+i);
		System.out.println("ASCII value of "+ch1+" is: "+j);
		System.out.println("ASCII value of "+ch2+" is: "+(int)ch2);
		System.out.println("ASCII value of "+ch3+" is: "+(int)ch3);
		System.out.println("ASCII value of "+ch4+" is: "+(int)ch4);
		System.out.println("ASCII value of "+ch5+" is: "+(int)ch5);
		System.out.println('a'+""+ch1+'+'+'b'+""+ch1);
		System.out.println('a'+""+ch3+'+'+'b'+""+ch3);
		//System.out.println(ch1);
	}
}
