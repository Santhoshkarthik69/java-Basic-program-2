package java_basic_programs;
import java.util.Scanner;
public class Largest_among_numbers
{
	void operation(int a,int b,int c,int d)
	{
	if(a>b&&a>c&&a>d)
	{
		System.out.println( a+" is a largenumber");
	}
	else if(b>a&&b>c&&b>d)
	{
		System.out.println(b+" is a largest number");
	}
	else if(c>a&&c>b&&c>d)
	{
		System.out.println(c+" is a largest number");
	}
	else if(d>a&&d>b&&d>c)
	{
		System.out.println(c+" is a largest number");
	}
}	
	public static void main(String[] args)
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("Enter numbers :");
		int a=ab.nextInt();
		int b=ab.nextInt();
		int c=ab.nextInt();
		int d=ab.nextInt();
		Largest_among_numbers ln=new Largest_among_numbers();
		ln.operation(a, b, c, d);
	}
}
