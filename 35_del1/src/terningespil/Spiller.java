package terningespil;

public class Spiller {

	
	private String navn;
	private int point;
	private Bæger bæger;
	private int parStreak;
	private boolean par;
	private int senestØjne;

	public Spiller(String navn) {
		this.point = 0;
		this.navn = navn;
		this.bæger = new Bæger();
		this.parStreak = 0;
		this.senestØjne = 0;
		
	}

	public void kastTerninger() {
		// throw dice
		bæger.toTerninger();
		
			senestØjne = bæger.getSumAfØjne();
				/*reset points if player rolled double 1, meaning the total value of dice throw is 2
				 * added reset condition points<40 to prevent it from resetting points if the game is won
				 */
				if(bæger.getSumAfØjne()==2 && getPoint()<40) {
					point = 0;
					System.out.println("Det var ærgerligt! du mistede dine point.");
				}
				//adding to variable for wincondition "two pair of sixths in a row" and adding to point total
				else if(bæger.getSumAfØjne()==12){
					parStreak += 1;
					point += bæger.getSumAfØjne();	
				}
					else {
						//add points to total and resets counter for pairs of sixths if not rolled
						parStreak=0;
						point += bæger.getSumAfØjne();	
					}
			
		}

	public String getNavn() {
		return navn;
	}

	public int getPoint() {
		return point;
	}
	
	public int getStreak() {
		return parStreak;
	}
	
	public int getSenestØjne() {
		return senestØjne;
	}
	
	public boolean getParStreak() {
		par=bæger.getPar();
		return par;
	}
}