package pkg1;

public class Student {
	int age, rollno;
	
	public void display1() {
		System.out.println("welcome all of you");
	}

	public void display2() {
		System.out.println("Automation is very easy ");
	}
	public static void main(String[] args) {
		Student d=new Student();
		d.display1();
		d.display2();
		d.age=12;
		d.rollno=1234;
		System.out.println(d.age);
		System.out.println(d.rollno); 
	}
}
