package java_basic_programs;
import java.util.Scanner;
public class Fibbonacs
{
	public static void main(String[] args) 
	{
		int temp,first=0,last=1;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter n value :");
     int n=sc.nextInt();
     System.out.println(first);
     System.out.println(last);
     for(int i=1;i<=n;i++)
     {   	 
    	 temp=first+last;
    	 System.out.print(temp+" ");
    	 first=last;
    	 last=temp;  	 
     }
	}
}
