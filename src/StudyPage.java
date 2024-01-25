import java.util.Scanner;

public class StudyPage {

	public static void main(String[] args) {
		Scanner scanterm = new Scanner(System.in);
		String termvar;
		System.out.println("Enter a study term");
		termvar = scanterm.nextLine();
		String termdef;
		System.out.println("Enter a definition");
		termdef = scanterm.nextLine();
		System.out.println(termvar+":  "+termdef);
	}
}
