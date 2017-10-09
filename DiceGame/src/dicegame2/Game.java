package dicegame2;

public class Game {

	public final static int DICE_MIN = 1;
	public final static int DICE_MAX = 6;
	public final static int SUM_MIN = 2;
	public final static int SUM_MAX = 12;
	private final static int WINPOINTS = 40;
	
	public static void main(String[] args) {
		Player player1 = new Player("Nynne");
		Player player2 = new Player("Eskild");

		while (true) {
			// keep rolling dices as long as you get pairs
			do {
				System.out.println();
				System.out.printf("%s throws the dice:", player1.getName());			
				System.out.println();
				player1.kastTerninger();
				System.out.printf("%s now has %s points.", player1.getName(), player1.getPoints());
				System.out.println();
				//System.out.printf("%s har nu et par seks streak på %s", player1.getName(), player1.getStreak());
				//System.out.println();
				
	
				// stops the loop if player1 has won, even if allowed another dice throw
				if (hasWon(player1)) {
					System.out.println();
					System.out.printf("%s has won!!", player1.getName());
					break;
				}
			}
			while(player1.getPairStreak());
		// Stops the game
		if (hasWon(player1)) {
				break;
		}
				do {
					System.out.println();
					System.out.printf("%s throws the dice:", player2.getName());			
					System.out.println();
					player2.kastTerninger();
					System.out.printf("%s now has %s points.", player2.getName(), player2.getPoints());
					System.out.println();
					//System.out.printf("%s har nu et par seks streak på %s", player2.getName(), player2.getStreak());
					//System.out.println();
				
					// stops the loop if player2 has won, even if allowed another dice throw
					if (hasWon(player2)) {
						System.out.println();
						System.out.printf("%s has won!!", player2.getName());
						
						break;
					}
						
				}
				while(player2.getPairStreak());
		//Stops the game
		if (hasWon(player2)) {
			break;
			}		
		}
	}
	// Checking win conditions, returning false if not has been met
	private static boolean hasWon(Player player) {
			//Checks if the player has rolled two sixth's twice in a row
			if(player.getStreak()==2) {	
				return true;
			}
			/*Checks whether the player has reached 40 points AND rolled a pair.
			 * todo: Does it have to include {1,1} as a win condition (rolling that specific pair will reset the point counter before
			 * checking the win condition) - solution done for including.
			 * todo: Decide if it's good enough that you can win by reaching 40 and rolling a pair
			 * as opposed to rolling a pair only AFTER reaching 40 points - solution done by adjusting winpoint condition in hasWon
			 * by new variable LastFaceValue
			 */
			else if (player.getPoints() >= (WINPOINTS+player.getLastFaceValue()) && player.getPairStreak()) {
				return true;
			}
		
				else {
					return false;
					}
		}
}




