package ClassPrograms;

public class Scope {
	int x = 100;
	public static void main(String[] args) {
		int x;
		x = 10;   // known to all code within main
		if (x == 10)
		{			
			int y =20;  // known to only this block
			System.out.println ("x and y: - "+ x+" "+y);
			x = y*2;
			
		}
//		y = 100;  // error y is not known here
		System.out.println ("x is "+x);
	}
}
