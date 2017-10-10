package terningespil;

public class Terning {

	private int antalØjne;

	public Terning() {
		this.antalØjne = MinRandom.randInt(Spil.TERNING_MIN, Spil.TERNING_MAX);
	}

	public void rul() {

		this.antalØjne = MinRandom.randInt(Spil.TERNING_MIN, Spil.TERNING_MAX);

		System.out.println("Terningen viser " + antalØjne);
	}

	public int getØjne() {
		return antalØjne;
	}
}