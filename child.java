package inheritance;

public class child extends parent {
	int b = 983;
	public void m2() {
		System.out.println("m2 method of Child class");
	}
	
	
	public static void main(String[] args) {
		
		child c=new child();
		System.out.println(c.a);
		System.out.println(c.b);
		c.m1();
		c.m2();
		
	}
}
