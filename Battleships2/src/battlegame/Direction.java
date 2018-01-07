package battlegame;

public enum Direction {
	NORTH, EAST, SOUTH, WEST, QUIT;
	
	public int[] getDirection() {
		switch(this) {
		case EAST:
			return new int[] {0, 1};
		case NORTH:
			return new int[] {-1, 0};
		case QUIT:
			System.exit(0);
		case SOUTH:
			return new int[] {1, 0};
		case WEST:
			return new int[] {0, -1};
		
		}
		return null;
	}
}
