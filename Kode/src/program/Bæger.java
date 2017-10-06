package program;

public class Bæger {
	private Terning terning1, terning2;

	public Bæger() {
		this.terning1 = new Terning();
		this.terning2 = new Terning();
	}

	public void Kast() {
		terning1.rul();
		terning2.rul();
	}

	public int getSumAfØjne() {
		return terning1.getØjne() + terning2.getØjne();
	}
}
