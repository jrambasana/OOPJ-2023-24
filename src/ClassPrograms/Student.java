package ClassPrograms;

import java.util.Objects;

public class Student {
	private String name;
	private int age;
	
	public Student() {
		this.name = "";
		this.age = 0;
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student stud = (Student) obj;
		return (Objects.equals(name, stud.name) && age == stud.age);
	}

	@Override
	public void finalize() throws Throwable{
		System.out.println("Object destroyed: " + this.toString());
	}
	
	public int compareTo(Student s1, Student s2) {
		if (s1.equals(s2))
			return 0;
		if (s1.age > s2.age)
			return 1;
		else
			return -1;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		Student s1, s2, s3;
		
		s1 = new Student("Bhavesh", 21);
		
		s2 = new Student();
		s2.setName("Hitesh");
		s2.setAge(22);
		
		s3 = new Student("Bhavesh", 21);
		
		s2 = null;
		System.gc();

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s3.equals(s2));		
	}
}