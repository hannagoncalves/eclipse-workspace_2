import java.util.Scanner;

public class Aplli {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter command: ");
		String text = input.nextLine();

		switch (text) {
		case "start":
			System.out.println("Machine STARTED");
			break;
		case "stop":
			System.out.println("Machine STOPPED");
			break;
		default:
			System.out.println("Command not found");
		}
	}
}
