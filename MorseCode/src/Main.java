import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Logic l1 = new Logic();
		
		System.out.println("Choose 1 to convert from Morse Code to Letter. " + "\nChoose 2 to convert from letter to Morse Code." 
						+ "\nEnter another number it will break then you'll just have to run it again.");
		Scanner choice = new Scanner(System.in);
		int input = choice.nextInt();
		if (input == 1) {
			l1.morseToLetter();
		}
		else if (input == 2) {
			l1.letterToMorse();
		}
		else {
			System.out.println("Told you not to write other numbers. It's broken.");
		}
		choice.close();
	}

	
}
