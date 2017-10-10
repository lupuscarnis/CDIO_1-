package terningespil;

import java.util.Scanner;

public class Spil {
	
	public Spil() {
		
	}
	
	
	void visMenu() {
        System.out.println();
        System.out.println("(1) Start et nyt spil");
        System.out.println("(2) Spilleregler");
        System.out.println("(3) Afslut program");
        System.out.print("Indtast :"+'"'+"1"+'"'+", "+'"'+"2"+'"'+" eller "+'"'+"3"+'"'+" for at vælge option.");
    }
	
	void spilleregler() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
		System.out.println();
		System.out.println("Hvordan spiller man?");
			System.out.println("(1) Vælg " + '"' + "Start et nyt spil" +'"'+" i menuen");
			System.out.println("(2) Indtast navn på spiller1 og spiller 2");
			System.out.println("(3) Indtast "+'"'+"r"+'"'+" for at slå med terningerne eller "+'"'+"restart"+'"'+" for at komme ud i menuen igen");
			System.out.println("(4) Spillet fortsætter til en spiller har opfyldt et sejrskriterium");
		System.out.println();
		System.out.println();
	   		System.out.println("Man kan vinde på følgende måder:");
	        System.out.println("(1) Slå to seksere to gange i træk");
	        System.out.println("(2) Slå to ens efter at man har opnået 40 point");
	    System.out.println();
	    System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	
	void vælgMenu(int menuValg) {
        switch (menuValg) {
            case 1:
                spilletKører=true;
                break;
            case 2:
                this.spilleregler();
                break;
            case 3:
            	menuenKører=false;
            	System.out.println();
            	System.out.print("Spillet er slut");
            	break;
            
            default:
                break;
        }
	}
	
	public final static int TERNING_MIN = 1;
	public final static int TERNING_MAX = 6;
	public final static int SUM_MIN = 2;
	public final static int SUM_MAX = 12;
	private final static int WINPOINTS = 40;
	private static boolean kastIgen;
	private static boolean spilletKører;
	private static boolean menuenKører;
	private static String string; 
	

	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	do {
	Spil spil = new Spil();
	menuenKører=true;
	spil.visMenu();
	spil.vælgMenu(scan.nextInt());
		
			
		while(spilletKører) {	
			System.out.println();
			System.out.print("Spiller1 navn: ");
			Spiller spiller1 = new Spiller(scan.next());
			System.out.println();
			System.out.print("Spiller2 navn: ");
			Spiller spiller2 = new Spiller(scan.next());
			System.out.println();
			
			while (true) {
				
				// keep rolling dices as long as you get pairs
				do {
					kastIgen=false;
					System.out.println();
					System.out.print(spiller1.getNavn()+" har raflebægeret: ");
					string=scan.next();
					if(string.equals("restart")) {
					System.out.print(spiller1.getNavn()+" er en dårlig taber!!");
					spilletKører=false;
					break;
					}
					// stops the loop if player1 has won, even if allowed another dice throw
						else if(string.equals("r")){
							
							System.out.println("Terningerne er kastet!");
							spiller1.kastTerninger();
							System.out.printf("%s now has %s points.", spiller1.getNavn(), spiller1.getPoint());
							System.out.println();
							//System.out.printf("%s har nu et par seks streak på %s", player1.getName(), player1.getStreak());
							//System.out.println();
							}
						
							else {
								kastIgen=true;
								System.out.println("skriv r for at slå med terningen");
							}
				}
				while((spiller1.getParStreak()||kastIgen)&&!hasWon(spiller1));
			// Stops the game
			if (hasWon(spiller1)) {
				System.out.println();
				System.out.printf("%s has won!!", spiller1.getNavn());
				System.out.println();System.out.println();System.out.println();
				
				spilletKører=false;	
				break;
			}
			else if(string.equals("restart")) {
				System.out.println();
				System.out.printf("%s has won!!", spiller2.getNavn());
				System.out.println();System.out.println();System.out.println();
				
				spilletKører=false;	
				break;
			}
				// keep rolling dices as long as you get pairs
				do {
					System.out.println();
					kastIgen=false;
					System.out.print(spiller2.getNavn()+" har raflebægeret: ");
					string=scan.next();
					if(string.equals("restart")) {
						System.out.print(spiller2.getNavn()+" er en dårlig taber!!");
						spilletKører=false;
					break;
					}
					// stops the loop if player1 has won, even if allowed another dice throw
						else if(string.equals("r")){		
						
							System.out.println("Terningerne er kastet!");
							spiller2.kastTerninger();
							System.out.printf("%s har nu %s point.", spiller2.getNavn(), spiller2.getPoint());
							System.out.println();
							//System.out.printf("%s har nu et par seks streak på %s", player1.getName(), player1.getStreak());
							//System.out.println();
							}
						
							else {
								kastIgen=true;
								System.out.println("skriv r for at slå med terningen");
							}
				}
				while((spiller2.getParStreak()||kastIgen)&&!hasWon(spiller2));
			// Stops the game
			if (hasWon(spiller2)) {
				System.out.println();
				System.out.printf("%s has won!!", spiller2.getNavn());
				System.out.println();System.out.println();System.out.println();
				
				spilletKører=false;	
			break;
			}
			else if(string.equals("restart")) {
				System.out.println();
				System.out.printf("%s has won!!", spiller1.getNavn());
				System.out.println();System.out.println();System.out.println();
				
				spilletKører=false;	
			break;
			}
		}
		}
		
				
	}
	while(menuenKører);
	scan.close();
	}
	
	// Checking win conditions, returning false if not has been met
	private static boolean hasWon(Spiller player) {
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
			else if (player.getPoint() >= (WINPOINTS+player.getSenestØjne()) && player.getParStreak()) {
				return true;
			}
		
				else {
					return false;
					}
		}
}





