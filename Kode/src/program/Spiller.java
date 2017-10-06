package program;

public class Spiller {

	private String _navn;
	private int _points;
	private B�ger _b�ger;

	public Spiller(String navn) {
		this._points = 0;
		this._navn = navn;
		this._b�ger = new B�ger();
	}

	public void kastTerninger() {
		// kast
		_b�ger.Kast();

		// opdater points
		_points += _b�ger.getSumAf�jne();
	}

	public String getNavn() {
		return _navn;
	}

	public int getPoint() {
		return _points;
	}
}
