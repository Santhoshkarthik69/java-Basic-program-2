package java_basic_programs;

import java.util.Scanner;

public class Lcm 
{
	static void operation(int no1,int no2)
	{
		int lcm=no1 > no2 ? no1:no2;
		while(true)
		{
		if(lcm % no1 ==0 && lcm % no2 ==0)
		{
			System.out.println("Least common multiple :"+lcm);
			break;
		}
		lcm++;
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number 1 :");
		int no1=sc.nextInt();
		System.out.println("enter number 2 :");
		int no2=sc.nextInt();
		
	}
}
