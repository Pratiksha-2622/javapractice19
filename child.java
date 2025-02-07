package superkeyword;

public class child extends parent{
	
int a=50;
public void print() {

	System.out.println(a);
	System.out.println(super.a);
}
public void m1() {
	System.out.println("m1 method of Child class");
	super.m1();
}


public static void main(String[] args) {

	child c = new child();
	c.print();
	c.m1();
}
}
