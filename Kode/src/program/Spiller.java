package program;

public class Spiller {

	private String _navn;
	private int _points;
	private Bæger _bæger;
	private int _terning1ForrigeTur = -1, _terning2ForrigeTur = -1;

	public Spiller(String navn, Bæger bæger) {
		this._points = 0;
		this._navn = navn;
		this._bæger = bæger;
	}

	public KastResult kastTerninger() {
		// kast
		_bæger.Kast();

		Terning t1 = _bæger.getTerning1();
		Terning t2 = _bæger.getTerning2();
		KastResult result = KastResult.FortsætSpil;

		// Spilleren mister alle sine point hvis spilleren slår to 1'ere.
		if (t1.getØjne() == 1 && t2.getØjne() == 1) {

			// Sæt "forrige slag" for næste tur.
			_terning1ForrigeTur = t1.getØjne();
			_terning2ForrigeTur = t2.getØjne();

			// Slet alle points for spiller
			_points = 0;

			return KastResult.PointsTabt;
		}

		// Spilleren skal slå to ens for at vinde spillet, efter at man har opnået 40
		// point.
		if (_points >= Spil.POINTSVUNDET) {
			if (t1.getØjne() == t2.getØjne()) {
				return KastResult.SpilVundet;
			}
		}
		// Spilleren kan vinde spillet ved at slå to 6'ere, hvis spilleren også i
		// forrige kast slog to 6'ere uanset om det er på ekstrakast eller i forrige
		// tur.
		if (_terning1ForrigeTur != -1 && _terning2ForrigeTur != -1) {

			if (_terning1ForrigeTur == 6 && _terning2ForrigeTur == 6)

				if (t1.getØjne() == 6 && t2.getØjne() == 6)
					return KastResult.SpilVundet;
		}
		// Spilleren får en ekstra tur hvis spilleren slår to ens.
		if (t1.getØjne() == t2.getØjne()) {

			System.out.println("Ekstra tur!!");
			// Sæt "forrige slag" for næste tur.
			_terning1ForrigeTur = t1.getØjne();
			_terning2ForrigeTur = t2.getØjne();

			// opdater points
			_points += _bæger.getSumAfØjne();

			return KastResult.EkstraTur;
		}

		// Sæt "forrige slag" for næste tur.
		_terning1ForrigeTur = t1.getØjne();
		_terning2ForrigeTur = t2.getØjne();

		// opdater points
		_points += _bæger.getSumAfØjne();

		return KastResult.FortsætSpil;
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
