package collectionsTopic;
import java.util.ArrayList;
public class Tester3
{
	public static void main(String[] args)
	{
		ArrayList list1=new ArrayList();
		ArrayList list2=new ArrayList();
		ArrayList list3=new ArrayList();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		
		list2.add(10.5);
		list2.add(20.5);
		list2.add(30.5);
		
		list3.add("Hi");
		list3.add("Hello");
		
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
		System.out.println("=====================");
		list1.addAll(list2);
		//list2.addAll(list3);
		System.out.println(list1);
		System.out.println(list2);
		list2.addAll(1,list3);
		System.out.println(list2);
	}
}
