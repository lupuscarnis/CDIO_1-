package program;

public class Terning {

	private final int MIN = 2, MAX = 12;
	private int _øjne;

	public Terning() {
		this._øjne = MyRandom.randInt(MIN, MAX);
	}

	public void rul() {

		this._øjne = MyRandom.randInt(MIN, MAX);

		System.out.println("Terningen rullede " + _øjne);
	}

	public int getØjne() {
		return _øjne;
	}
}
