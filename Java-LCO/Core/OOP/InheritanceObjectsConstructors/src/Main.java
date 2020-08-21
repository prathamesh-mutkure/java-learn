public class Main {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student("Vinit");
		Student s3 = new Student("Tajas", 15);
		Student s4 = new Student("Samyak", 23, 80);


		s1.display();
		s2.display();
		s3.display();
		s4.display();
	}
}

class Student {

	String name = " ";
	int rollNo = 0;
	float marks = (float) 0.0;

	public Student() {}

	public Student(String name) {
		this.name = name;
	}

	public Student(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}

	public Student(String name, int rollNo, float marks) {
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
	}

	public void display() {
		System.out.println("\nName = " + name);
		System.out.println("Roll No = " + rollNo);
		System.out.println("Marks = " + marks);
	}
}
