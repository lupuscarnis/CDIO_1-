package program;

import java.util.Random;

public class Spil {

	private final static int POINTSVUNDET = 40;

	public static void main(String[] args) {
		Spiller spiller1 = new Spiller("Nynne");
		Spiller spiller2 = new Spiller("Eskild");

		while (true) {
	
			System.out.printf("%s kaster sine terninger:", spiller1.getNavn());			
			System.out.println();
			spiller1.kastTerninger();
			System.out.printf("%s har nu %s point.", spiller1.getNavn(), spiller1.getPoint());
			System.out.println();

			// Check at spiller 1 ikke har fundet
			if (hasWon(spiller1)) {
				System.out.println();
				System.out.printf("%s har vundet!!", spiller1.getNavn());
				break;
			}

			System.out.println();
			System.out.printf("%s kaster sine terninger:", spiller2.getNavn());			
			System.out.println();
			spiller2.kastTerninger();
			System.out.printf("%s har nu %s point.", spiller2.getNavn(), spiller2.getPoint());
			System.out.println();

			// Check at spiller 2 ikke har fundet
			if (hasWon(spiller2)) {
				System.out.println();
				System.out.printf("%s har vundet!!", spiller2.getNavn());
				System.out.println("");
				break;
			}
			System.out.println();	
		}
	}

	private static boolean hasWon(Spiller spiller) {

		if (spiller.getPoint() < POINTSVUNDET)
			return false;

		return true;
	}
}
