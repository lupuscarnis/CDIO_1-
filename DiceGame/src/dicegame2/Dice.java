package dicegame2;

public class Dice {

	private int faceValue;

	public Dice() {
		this.faceValue = MyRandom.randInt(Game.DICE_MIN, Game.DICE_MAX);
	}

	public void roll() {

		this.faceValue = MyRandom.randInt(Game.DICE_MIN, Game.DICE_MAX);

		System.out.println("The die rolled " + faceValue);
	}

	public int getFaceValue() {
		return faceValue;
	}
}