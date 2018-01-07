package battlegame;

import java.util.ArrayList;

public abstract class Grid {
	private int numOfRow;
	private int numOfColumn;
	private int[][] gridSize;

	public Grid(int numOfRow, int numOfColumn) {
		super();
		this.numOfRow = numOfRow;
		this.numOfColumn = numOfColumn;
		this.gridSize = new int[numOfRow][numOfColumn];
	}

	ArrayList<Ships> shipList = new ArrayList<>();

	public int getNumOfRow() {
		return numOfRow;
	}

	public int getNumOfColumn() {
		return numOfColumn;
	}

	public int[][] getGridSize() {
		return gridSize;
	}

	public void showGrid() {
		for (int row = 0; row < getGridSize().length; row++) {
			System.out.print("\t" + row);
		}
	}

	public void createShip() {
		// creating the ships
		Ships patrol = new Ships("patrol", 2);
		Ships patrol2 = new Ships("patrol2", 2);
		 Ships battleship = new Ships("battleship", 3);
		 Ships battleship2 = new Ships("battleship2", 3);
		 Ships submarine = new Ships("submarine", 3);
		 Ships destroyer = new Ships("destroyer", 4);
		 Ships carrier = new Ships("carrier", 5);

		// adding the ships to shipList ArrayList

		 shipList.add(carrier);
		 shipList.add(destroyer);
		 shipList.add(submarine);
		 shipList.add(battleship2);
		 shipList.add(battleship);
		shipList.add(patrol);
		shipList.add(patrol2);
	}

	public abstract void addShipToGrid() ;
			

	public boolean placeShip(Ships ship, int x, int y, Direction direction) {
		// error check - you want to choose coordinates if error therefore return false
		if (!errorCheckShipPosition(ship, x, y, direction)) {
			return false;
		}

		// placing ship

		getGridSize()[y][x] = ship.getShipID();

		int[] positionUpdate = direction.getDirection();

		for (int i = 1; i < ship.getLength(); i++) {
			x += positionUpdate[1];
			y += positionUpdate[0];

			getGridSize()[y][x] = ship.getShipID();
		}
		return true;
	}

	public boolean errorCheckShipPosition(Ships ship, int x, int y, Direction direction) {

		// check if ship goes out of boundaries
		int checker = 0;
		int[] positionCheck = direction.getDirection();

		if (positionCheck[0] != 0) {
			checker = y + positionCheck[0] * ship.getLength();
		} else {
			checker = x + positionCheck[1] * ship.getLength();
		}

		if (checker < -1 || checker > numOfRow) {
			System.out.println("\nOut of boundaries" + "\nChoose a different coordinate");
			return false;
		}

		if (getGridSize()[y][x] != 0) {
			System.out.println("\nCannot place ship here - it's overlapping with another ship!");
			return false;
		}

		// check if ship overlaps with other ships
		int[] positionUpdate = direction.getDirection();

		for (int i = 1; i < ship.getLength(); i++) {
			x += positionUpdate[1];
			y += positionUpdate[0];

			if (getGridSize()[y][x] != 0) {
				System.out.println("\nCannot place ship here - it's overlapping with another ship!");
				return false;
			}
		}
		return true;
	}

	public boolean fireShot(Grid opposite, int x, int y) {
		System.out.println("\n<--------Firing------->\n");

		// check shots
		// if hit a target ship
		int oppShipId = opposite.getGridSize()[y][x];
		if (opposite.getGridSize()[y][x] > 1) {
			System.out.println("      Enemy hit!           ");

			// check hit ship in ArrayList if so then decrease length of ship
			for (int i = 0; i < opposite.shipList.size(); i++) {
				if (opposite.shipList.get(i).getShipID() == oppShipId) {
					opposite.shipList.get(i).decreaseLength();
					
					if (opposite.shipList.get(i).getLength() == 0) {
						System.out.println("\nBoat down!\n");
					}
				}

			}

			opposite.getGridSize()[y][x] = 1;
			return true;
		} else if (opposite.getGridSize()[y][x] == 0) {
			System.out.println("You miss!");
			opposite.getGridSize()[y][x] = -1;
			return false;
		} else if (opposite.getGridSize()[y][x] == -1 || opposite.getGridSize()[y][x] == 1) {
			System.out.println("This spot has already been hit!");
			return false;
		}

		return false;
	}

	public boolean dead(Grid check) {
		for (int i = 0; i < check.shipList.size(); i++) {
			if (check.shipList.get(i).getLength() != 0)
				return false;
		}
		return true;
	}

	public void checkStatus(Grid defense, Grid enemy) {
		System.out.println("Player ships status: " + "          " + "AI ships status: \n");
		for (int i = 0; i < defense.shipList.size(); i++)
		{
			System.out.printf("%-31s%-31s\n", defense.shipList.get(i).getName() + " length " + defense.shipList.get(i).getLength(),
					enemy.shipList.get(i).getName() + " length " + enemy.shipList.get(i).getLength());
		}
			
	}

}
