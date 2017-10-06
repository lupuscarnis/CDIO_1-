package program;

import java.util.Random;

public class MyRandom {
	
	private static Random _rand = new Random();
	
		// Metoden fandt jeg her:
		// https://stackoverflow.com/questions/363681/how-do-i-generate-random-integers-within-a-specific-range-in-java
		public static int randInt(int min, int max) {

			// TODO: Måske dumt at instantiere en ny hver gang?
			

			// nextInt is normally exclusive of the top value,
			// so add 1 to make it inclusive
			int randomNum = _rand.nextInt((max - min) + 1) + min;

			return randomNum;
		}
}
