public class Student{
	String name = "Test";
	int age;
	double gpa;
	boolean isEnrolled;

	Student(String name, int age, double cgpa) {
		this.name = name;
		this.age = age;
		this.gpa = cgpa;
		this.isEnrolled = true;
	}

	void study() {
		System.out.println(this.name + " is studying.");
	}

}