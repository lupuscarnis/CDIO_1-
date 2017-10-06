package program;

public class Terning {

	private int _øjne;

	public Terning() {
		this._øjne = MyRandom.randInt(Spil.TERNING_MIN, Spil.TERNING_MAX);
	}

	public void rul() {

		this._øjne = MyRandom.randInt(Spil.TERNING_MIN, Spil.TERNING_MAX);

		System.out.println("Terningen rullede " + _øjne);
	}

	public int getØjne() {
		return _øjne;
	}
}
