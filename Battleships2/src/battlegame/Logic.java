package battlegame;

public class Logic {

	PlayerGrid p = new PlayerGrid(12, 12);
	AIGrid ai = new AIGrid(12, 12);

	public void gameLoop() {
		p.showGrid();
		p.createShip();
		ai.createShip();
		p.addShipToGrid();
		ai.addShipToGrid();

		boolean playerHit = true;
		boolean AiHit = true;

		do {
			do {
				playerHit = p.chooseShots(ai);
				System.out.println("--------------------------------------------------"
						+ "--------------------------------------------------");
				p.checkStatus(p, ai);
				p.showShotsOnEnemyGrid(ai);
			} while (playerHit && !ai.dead(ai));
			do {
				if (!ai.dead(ai)) {
					AiHit = ai.generateShots(p);
					System.out.println("--------------------------------------------------"
							+ "--------------------------------------------------");
					ai.checkStatus(p, ai);
					p.showGrid();
					p.showShotsOnEnemyGrid(ai);
				} else {
					break;
				}
			} while (AiHit && !p.dead(p));
			
		} while (!(p.dead(p) | ai.dead(ai)));
		if (ai.dead(ai)) {
			System.out.println("You win!");
		} else {
			System.out.println("You lost! AI wins!");
		}
	}
}
