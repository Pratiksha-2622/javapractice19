package iterativestatment;

import java.util.Scanner;
public class dowhiledemo {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		int i=sc.nextInt();
		 do {
			 System.out.println(i);
			 i++;
		 }while(i<=10);
		 
	}

}
