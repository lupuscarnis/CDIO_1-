package program;

public class B�ger {
	private Terning terning1, terning2;

	public B�ger() {
		this.terning1 = new Terning();
		this.terning2 = new Terning();
	}

	public void Kast() {
		terning1.rul();
		terning2.rul();
	}

	public int getSumAf�jne() {
		return terning1.get�jne() + terning2.get�jne();
	}
}
