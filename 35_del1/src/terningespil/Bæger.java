package terningespil;

public class Bæger {
	private Terning terning1, terning2;
	
	public Bæger() {
		this.terning1 = new Terning();
		this.terning2 = new Terning();
	}

	public void toTerninger() {
		terning1.rul();
		terning2.rul();
	}

	public Terning getTerning1() {
		return terning1;
	}
	public Terning getTerning2() {
		return terning2;
	}
	
	public int getSumAfØjne() {
		return (terning1.getØjne() + terning2.getØjne());
	}
	
	//checks if a pair has been rolled
	public boolean getPar() {
		int a=this.terning1.getØjne();
		int b=this.terning2.getØjne();
		if (a==b){
			return true;
		}
		else {
			return false;
		}
		}
	}
	
