package constructor;

public class student {

	int rollno;

	String name;

	String addr;

	public student(int rollno, String name, String addr) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.addr = addr;
	}

	public static void main(String[] args) {

		student stu = new student(11,"Pratiksha","Kolhapur");
		System.out.println(stu.rollno);
		System.out.println(stu.name);
		System.out.println(stu.addr);
	}
}
