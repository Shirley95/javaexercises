package battlegame;

import java.util.Scanner;

public class PlayerGrid extends Grid {

	Scanner scan;
	
	public PlayerGrid(int numOfRow, int numOfColumn) {
		super(numOfRow, numOfColumn);
		scan = new Scanner(System.in);
		// TODO Auto-generated constructor stub
	}
	
	public void addShipToGrid() {
		for (int i = 0; i < shipList.size(); i++) {
			System.out.println("\nChoose a coordinate to place your ship: " + shipList.get(i).getName() + " of length "
					+ shipList.get(i).getLength());

			boolean correct = false;

			do {
				int x = getUserInput("Choose your x coordinate: ");
				int y = getUserInput("Choose your y coordinate: ");
				
				
				System.out.println("Choose your direction: north, east, south, west");
				String directionInput = scan.nextLine().toUpperCase();
				try {
					if (placeShip(shipList.get(i), x, y, Direction.valueOf(directionInput))) {
						correct = true;
						// correct gets reassigned therefore while statement will stop executing as it
						// becomes while (not true)
						// takes directionInput from input and converts it to an Enum type
					}

				} catch (Exception e) {
					System.out.println("Invalid direction!");
				}

			} while (!correct);
			
			showGrid();
		}

	}
	
	private int getUserInput(String message) {
		int number = 0;
		String input;
		boolean correct = false;
		do {
			System.out.print(message);
			input = scan.nextLine();
			
			if (checkInputType(input)) {
				number = Integer.parseInt(input);
				if (number < getNumOfRow())
					correct = true;
				// if the number is in range, correct = true
				else 
					System.out.println("\nNumber outside of grid boundaries! Try again\n");
			}
			else {
				System.out.println("\nNot a number. Enter again\n");
			}
		} while (!correct);
		
		
		return number;
	}
	
	public void showGrid() {
		System.out.println("\nPlayer Grid\n");
		super.showGrid();

		for (int row = 0; row < getGridSize().length; row++) {
			System.out.print("\n\n" + row);
			for (int column = 0; column < getGridSize().length; column++) {
				String print = "";
				
				if (getGridSize()[row][column] == 1)
				{
					print += "X";
				}
				else if (getGridSize()[row][column] == -1)
				{
					print += "O";
				}
				else if (getGridSize()[row][column] != 0)
				{
					print += "B";
				}

				System.out.print("\t*" + print);
			}
		}

		System.out.println("\n------------------------------------------------"
				 + "--------------------------------------------------");
	}
	
	public void showShotsOnEnemyGrid(Grid opposite) {
		System.out.println("\nShots taken on AI Grid\n");
		for (int row = 0; row < getGridSize().length; row++)
		{
			System.out.print("\t" + row);
		}
		
		for (int row = 0; row < getGridSize().length; row++)
		{
			System.out.print("\n\n" + row);
			for (int column = 0; column < getGridSize().length; column++)
			{
				String aiPrint = "";
				if (opposite.getGridSize()[row][column] == 1)
				{
					aiPrint += "H";
				}
				else if (opposite.getGridSize()[row][column] == -1)
				{
					aiPrint += "M";
				}
				System.out.print("\t*" + aiPrint);
			}
		}
		System.out.println("\n------------------------------------------------"
				+ "--------------------------------------------------");
	}
	
	
	// choose coordinates to fire at enemy ship
	public boolean chooseShots(Grid opposite) {
		System.out.println("\n<-- TIME TO FIGHT! --> \n");
		
		int x = getUserInput("Choose your hit in x coordinate: ");
		int y = getUserInput("Choose your hit in y coordinate: ");
		
		return fireShot(opposite, x, y);
	}
	
	public boolean checkInputType(String a)
	{
		String regex = "^\\d+";
		if (!(a.matches(regex))) 
		{
			return false;
		}
		else 
		{
			return true;
		}
	}
	
}
