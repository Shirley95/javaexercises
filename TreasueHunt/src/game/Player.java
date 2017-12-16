package game;

public class Player extends LocationPoint {

	public Player(int xPoint, int yPoint) {
		super(xPoint, yPoint);
		// TODO Auto-generated constructor stub
	}
	
	public void chooseDirection()
	{
		for (int i = 1; i <= Direction.values().length; i++)
		{
			System.out.println(i + ". " + Direction.values()[i-1]);
		}
		
	}
	
	public void move(int choice)
	{
		int xchange = getxPoint();
		int ychange = getyPoint();
		switch (choice)
		{
		case 1: // north
			ychange++;
			break;
		
		case 2: //east
			xchange++;
			break;
			
		case 3: //south
			ychange--;
			break;
		
		case 4: // west
			xchange--;
			break;
		
		case 5: // quit
			System.exit(0);		
		}
		// update the player's position
		setxPoint(xchange); 
		setyPoint(ychange);
	}
	
}
