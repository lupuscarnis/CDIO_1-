package dicegame2;

public class Player {

	private String name;
	private int points;
	private Cup cup;
	private int pairStreak;
	private boolean pair;
	private int lastFaceValue;

	public Player(String name) {
		this.points = 0;
		this.name = name;
		this.cup = new Cup();
		this.pairStreak = 0;
		this.lastFaceValue = 0;
		
	}

	public void kastTerninger() {
		// throw dice
		cup.twoDice();
		
			lastFaceValue = cup.getSumOfFaceValue();
				/*reset points if player rolled double 1, meaning the total value of dice throw is 2
				 * added reset condition points<40 to prevent it from resetting points if the game is won
				 */
				if(cup.getSumOfFaceValue()==2 && getPoints()<40) {
					points = 0;
				}
				//adding to variable for wincondition "two pair of sixths in a row" and adding to point total
				else if(cup.getSumOfFaceValue()==12){
					pairStreak += 1;
					points += cup.getSumOfFaceValue();	
				}
					else {
						//add points to total and resets counter for pairs of sixths if not rolled
						pairStreak=0;
						points += cup.getSumOfFaceValue();	
					}
			
		}

	public String getName() {
		return name;
	}

	public int getPoints() {
		return points;
	}
	
	public int getStreak() {
		return pairStreak;
	}
	
	public int getLastFaceValue() {
		return lastFaceValue;
	}
	
	public boolean getPairStreak() {
		pair=cup.getPair();
		return pair;
	}
}