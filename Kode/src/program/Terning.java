package program;

public class Terning {

	private int _øjne;

	public Terning() {
		this._øjne = MyRandom.randInt(Spil.MIN, Spil.MAX);
	}

	public void rul() {

		this._øjne = MyRandom.randInt(Spil.MIN, Spil.MAX);

		System.out.println("Terningen rullede " + _øjne);
	}

	public int getØjne() {
		return _øjne;
	}
}
