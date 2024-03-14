package ClassPrograms;

import java.util.Scanner;
public class AssertEx {
	//program that will convert a double to an int
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		double x = in.nextDouble();
		in.close();
		System.out.println("Value of x      : " + x);
		int y = (int) (x);
		assert x < 2_147_483_647.0 : "Number too large to convert to integer";
		System.out.println("Value of y (int): " + y);
	}//end method main

//	public static void main(String[] args) {
//		String suit = "Card";
//		switch (suit) {
//		case "Clubs" : System.out.println("Clubs");
//		break;
//		case "Diamonds" : System.out.println("Diamonds");
//		break;
//		case "Hearts" : System.out.println("Hearts");
//		break;
//		case "Spades" : System.out.println("Spades");
//		break;
//		default : 
//			assert false : "Unknown playing card suit";
//			System.out.println("default reached");
//		break;
//		}//end switch
//	}//end method main
	
}//end class AssertEx