class Student{
	
	public static final int MY_CONSTANT = 8;
	public static int count = 0;
	public String name;
	public static String studentClass;
	
	// constructor that counts objects of static variables
	public Student() {
		count++;
	}
	
	// This can access static variables too (studentClass)
	public void studentName() {
		System.out.println(name);
	}
	
	// static method can access static variables (studentClass) but not instance variables (name)
	public static void classInfo() {
		System.out.println("Java");
	}
}

public class StaticAndFinal {
	public static void main(String[] args) {

		System.out.println("Before creating objects: "+Student.count);
		
		Student student1 = new Student();
		Student student2 = new Student();
		
		System.out.println("After creating objects: "+Student.count);
		
		Student.studentClass = "Web Development Fundamentals";
		System.out.println(Student.studentClass);

		Student.classInfo();
		// static needs class before methods
		
		
		student1.name = "Steven";
		student2.name = "Daniel";
		student1.studentName();
		student2.studentName();
		
		System.out.println(Student.MY_CONSTANT);
		
		
	}
}
