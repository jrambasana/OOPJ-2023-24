import java.util.Scanner;

public class GallonsToLitres {

	public static void main(String[] args) {
		int numgallons = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("\nEnter a number in Gallons: ");
		numgallons = scan.nextInt();
		
		double converttoliters = numgallons * 3.785;
		System.out.print("\nEquivallent in Litres: " + converttoliters);

	}

}
