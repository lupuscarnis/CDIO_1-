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
		_b�ger.Kast();
	}
}
