package practicals;

import java.util.Scanner;

public class Prac04_Student {
	int studentID;
	String studentName;
	double marksSub1, marksSub2, marksSub3;
	
	public void getData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Student id: ");
		studentID = sc.nextInt();
		
		System.out.print("\nEnter Student name: ");
		studentName = sc.next();
		
		System.out.println("\nEnter Student Marks: ");
		System.out.print("Enter Subject 1 Marks: ");
		marksSub1 = sc.nextInt();
		System.out.print("\nEnter Subject 2 Marks: ");
		marksSub2 = sc.nextInt();
		System.out.print("\nEnter Subject 3 Marks: ");
		marksSub3 = sc.nextInt();
	}
	
	public void displayData() {
		System.out.println("Student ID: " + studentName);
		System.out.println("Student Name: " + studentName);
		System.out.println("Subject 1 Marks: " + marksSub1);
		System.out.println("Subject 2 Marks: " + marksSub2);
		System.out.println("Subject 3 Marks: " + marksSub3);
	}
	
	public void average() {
		System.out.println("Average of Marks: " + (marksSub1+marksSub2+marksSub3) / 3); 
	}
	public static void main(String[] args) {
		Prac04_Student s1 = new Prac04_Student();
		
		System.out.println("Enter Student Data");
		s1.getData();
		
		System.out.println("Student Data you entered is");
		s1.displayData();
		
		s1.average();

	}

}
