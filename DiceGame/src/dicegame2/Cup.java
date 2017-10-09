package dicegame2;

public class Cup {
	private Dice die1, die2;
	
	public Cup() {
		this.die1 = new Dice();
		this.die2 = new Dice();
	}

	public void twoDice() {
		die1.roll();
		die2.roll();
	}

	public Dice getTerning1() {
		return die1;
	}
	public Dice getTerning2() {
		return die2;
	}
	
	public int getSumOfFaceValue() {
		return (die1.getFaceValue() + die2.getFaceValue());
	}
	
	//checks if a pair has been rolled
	public boolean getPair() {
		int a=this.die1.getFaceValue();
		int b=this.die2.getFaceValue();
		if (a==b){
			return true;
		}
		else {
			return false;
		}
		}
	}
	
