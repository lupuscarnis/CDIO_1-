package test;

import program.Terning;

public class FalskTerning extends Terning {
	
	int _øjne = -1;
	
	public FalskTerning(int øjne)
	{
		_øjne = øjne;
	}
	
	public int getØjne() {
		
		return _øjne;
	}
}
