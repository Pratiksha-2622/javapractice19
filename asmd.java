package ASMD;
import java.util.Scanner;
public class asmd {
	
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		  System.out.println("Enter First no");
		  int a= sc.nextInt();
		  
		  System.out.println("Enter Second no");
		  int b= sc.nextInt();
		  
		  int c=a+b;
		  System.out.println(c);
		  
		  System.out.println("Enter First no for sub");
		  int d= sc.nextInt();
		  
		  System.out.println("Enter Second no for sub");
		  int e= sc.nextInt();
		  
		  int f=d-e;
		  System.out.println(f);
		  
		  System.out.println("Enter First no multiplication");
		  int x= sc.nextInt();
		  
		  System.out.println("Enter Second no multiplication");
		  int y= sc.nextInt();
		  
		  int z=x*y;
		  System.out.println(z);
	}

}
