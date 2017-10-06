package program;

public class Spiller {

	private String _navn;
	private int _points;
	private Bæger _bæger;

	public Spiller(String navn) {
		this._points = 0;
		this._navn = navn;
		this._bæger = new Bæger();
	}

	public void kastTerninger() {
		_bæger.Kast();
	}
}
