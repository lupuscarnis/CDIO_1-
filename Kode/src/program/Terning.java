package program;

public class Terning {

	private final int MIN = 2, MAX = 12;
	private int _�jne;

	public Terning() {
		this._�jne = MyRandom.randInt(MIN, MAX);
	}

	public void rul() {

		this._�jne = MyRandom.randInt(MIN, MAX);

		System.out.println("Terningen rullede " + _�jne);
	}

	public int get�jne() {
		return _�jne;
	}
}
