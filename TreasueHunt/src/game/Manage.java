package game;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Manage {

	Random rand = new Random();
	Player p = new Player(50, 50);
	Treasure t = new Treasure((rand.nextInt(100) + 1), (rand.nextInt(100) + 1));
	Scanner choice = new Scanner(System.in);

	int userInput = -1;
	boolean running = true;

	public void setUp() {

		while (running) {
			// runs the checkInput method if -1, it will continue to run until while loop condition is not satisfied then it will jump out of loop
			checkInput();

			p.move(userInput);

			System.out.println("---------------------------------");
			System.out.println("\n" + "You're heading " + Direction.values()[userInput - 1]);
			System.out.printf("The distance between is %.3f\n", p.distanceBetween(t));
			if (p.getxPoint() == t.getxPoint() && p.getyPoint() == t.getyPoint()) {
				System.out.println("You've found the treasure!");
				running = false;
				// break;
			}
		}

	}
	

	public void checkInput() {
		do {
			try {
				System.out.println("Player at " + p.getxPoint() + ", " + p.getyPoint() + "\n");
				p.chooseDirection();

				userInput = choice.nextInt();

				if (userInput < 1 || userInput > 5) {
					System.out.println("Invalid command");
					userInput = -1;
				}
			} catch (InputMismatchException e) {
				System.out.println("Invalid command");
			}
		} while ((userInput == -1));

	}

}
