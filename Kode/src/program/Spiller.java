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
		// kast
		_bæger.Kast();

		// opdater points
		_points += _bæger.getSumAfØjne();
	}

	public String getNavn() {
		return _navn;
	}

	public int getPoint() {
		return _points;
	}
	public Bæger getBæger() {
		return _bæger;
	}
}
