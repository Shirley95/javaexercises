package game;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		System.out.println("What's your name?");
		String s = reader.nextLine();
		
		System.out.println("You awaken to find yourself in a Barren Moore.");
		System.out.println("Grey foggy clouds float oppressively close to you, ");		
		System.out.println("Some black plants barely poke out of the shallow water.");
		System.out.println("You notice a small watch-like device in your left hand. \n" + 
				"It has hands like a watch, but the hands don't seem to tell time." + "\n");
		System.out.println("Choose a direction to move in order to find your treasure! ");
		System.out.println("Remember to enter the number adjacent to the direction you want" + "\n");
		
		Manage game = new Manage();
		game.setUp();

		
		

	}

}
