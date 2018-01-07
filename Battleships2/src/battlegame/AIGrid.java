package battlegame;

import java.util.Random;

public class AIGrid extends Grid {

	public AIGrid(int numOfRow, int numOfColumn) {
		super(numOfRow, numOfColumn);
		// TODO Auto-generated constructor stub
	}

	public void showGrid() {
		System.out.println("\nAI Grid\n");

		super.showGrid();

		for (int row = 0; row < getGridSize().length; row++) {
			System.out.print("\n\n" + row);
			for (int column = 0; column < getGridSize().length; column++) {
				String print = "";

				if (getGridSize()[row][column] == 1) {
					print += "H";
				}
				else if (getGridSize()[row][column] == -1) {
					print += "M";
				}
				else if (getGridSize()[row][column] != 0) {
					print += "B";
				}

				System.out.print("\t*" + print);
			}
		}

		System.out.println("\n------------------------------------------------" 
		+ "--------------------------------------------------");
	}

	public void addShipToGrid() {
		Random random = new Random();
		for (int i = 0; i < shipList.size(); i++) {
			boolean correct = false;

			do {
				int xrandom = random.nextInt(getNumOfRow());
				int yrandom = random.nextInt(getNumOfRow());
				int ranDirection = random.nextInt(Direction.values().length -1);
				Direction d = Direction.values()[ranDirection];
				
				// check AI coordinates
//				System.out.println("AI ship: " + shipList.get(i).getName() + ", shipID of " + shipList.get(i).getShipID());
//				System.out.println(xrandom + " " + yrandom + " " + d);
//				
				if (placeShip(shipList.get(i), xrandom, yrandom, d))
					correct = true;

			} while (!correct);
		}
//		showGrid();
	}
	
	public boolean generateShots(Grid opposite)
	{
		Random random = new Random();
		int xRanShot = random.nextInt(getGridSize().length);
		int yRanShot = random.nextInt(getGridSize().length);
		return fireShot(opposite, xRanShot, yRanShot);	
	}

	
}
