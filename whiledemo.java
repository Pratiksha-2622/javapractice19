package iterativestatment;
import java.util.Scanner;
public class whiledemo {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		int i=sc.nextInt();
		while(i<=10)
		{
			System.out.println(i);
			i++;
			
		}
	}

}
