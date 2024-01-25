package practicals;
//Write a java program to find sum of two numbers using class and object.
import java.util.Scanner;
public class Prac1_3 {
int a, b, c;
public static void main(String[] args) {
	Prac1_3 o1 = new Prac1_3();

	Scanner sc = new Scanner(System.in);
	System.out.print("\n Enter number 1: ");
	o1.a = sc.nextInt();
	System.out.print("\n Enter number 2: ");
	o1.b = sc.nextInt();
	
	o1.c = o1.a + o1.b;
	System.out.println(o1.a + " + " + o1.b + " = " + o1.c);
}
}
