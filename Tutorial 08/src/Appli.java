import java.util.Scanner;

public class Appli {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*System.out.println("Enter Number: ");
		int value = scanner.nextInt();
		while (value!=5) {
			System.out.println("Try again pal: ");
			value=scanner.nextInt();
		}*/
		int value=0;
		do {
			System.out.println("Enter Number: ");
			value = scanner.nextInt();
		}
		while (value!=5);
		
		System.out.println("GOTCHA!");
	}
}
