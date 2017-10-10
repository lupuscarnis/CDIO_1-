package test;

import program.Bæger;
import program.Terning;

public class FalskBæger extends Bæger {

	private FalskTerning terning1, terning2;	
	private int _sumØjne = -1;
	
	public FalskBæger(int øjneTerning1, int øjneTerning2) {
		this.terning1 = new FalskTerning(øjneTerning1);
		this.terning2 = new FalskTerning(øjneTerning2);
	}
	public FalskBæger(int øjneTerning1, int øjneTerning2, int sumØjne) {
		this.terning1 = new FalskTerning(øjneTerning1);
		this.terning2 = new FalskTerning(øjneTerning2);
		_sumØjne = sumØjne;
	}

	public void Kast() {		
	}

	public Terning getTerning1() {
		return terning1;
	}
	public Terning getTerning2() {
		return terning2;
	}
	
	public int getSumAfØjne() {
		
		if(_sumØjne!=-1)
			return _sumØjne;
		
		return (terning1.getØjne() + terning2.getØjne());
	}
}
