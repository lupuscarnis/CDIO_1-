package program;

public class Terning {

	private int _�jne;

	public Terning() {
		this._�jne = MyRandom.randInt(Spil.MIN, Spil.MAX);
	}

	public void rul() {

		this._�jne = MyRandom.randInt(Spil.MIN, Spil.MAX);

		System.out.println("Terningen rullede " + _�jne);
	}

	public int get�jne() {
		return _�jne;
	}
}
