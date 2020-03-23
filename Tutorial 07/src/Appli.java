import java.util.Scanner;

public class Appli {
	public static void main(String[] args) {
		//create scanner object
		Scanner input= new Scanner (System.in);
		//output the prompt
		System.out.println("How big is your dick in CM: ");
		//wait for the input
		double value=input.nextDouble();
		double pauPol=value/2.54;
		//give reply
		System.out.println("Your dick is "+pauPol+" inches long");
	}
}
