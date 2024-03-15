package java_basic_programs;
import java.util.Scanner;
public class Hcf 
{
	static void operation(int no1,int no2)
	{
		int hcf=no1 < no2 ? no1:no2;
		while(true)
		{
		if(no1 % hcf ==0 && no2 % hcf ==0)
		{
			System.out.println("Highest common factor :"+hcf);
			break;
		}
		hcf--;
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no1 :");
		int no1=sc.nextInt();
		System.out.println("enter no2 :");
		int no2=sc.nextInt();
		Hcf.operation(no1, no2);
	}

}
