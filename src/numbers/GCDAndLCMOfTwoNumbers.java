package numbers;
import java.util.Scanner;
public class GCDAndLCMOfTwoNumbers
{
	public static void main(String[] args)
	{
		int a,b,temp,aTemp,bTemp,gcd,lcm;
        @SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
        // Take two numbers from user
        System.out.println("Enter Two Numbers");
        a=scan.nextInt();
        b=scan.nextInt();
 
        aTemp=a;
        bTemp=b;
 
        while(bTemp!=0)
        {
            temp=bTemp;
            bTemp=aTemp%bTemp;
            aTemp=temp;
        }
        gcd=aTemp;
        
        //GCD(a,b)*LCM(a,b)=a*b
        lcm=(a*b)/gcd;
        
        System.out.println("GCD="+gcd);
        System.out.println("LCM="+lcm);
	}
}
