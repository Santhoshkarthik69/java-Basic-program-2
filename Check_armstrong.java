package java_basic_programs;
import java.util.Scanner;
public class Check_armstrong
{
	public static void main(String[] args)
	{
		int arm=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :");
		int n1=sc.nextInt();
			int origional=n1;
		while(n1>0)
		{
			int rem=n1%10;
			arm=arm+(rem*rem*rem);
			n1=n1/10;
		}
if(origional==arm)
{
	System.out.println("It is a armstrong");
}
else 
{
	System.out.println("Not a armstrong");
}
	}
}
	


