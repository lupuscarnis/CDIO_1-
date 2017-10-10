package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import program.Spiller;
import program.Terning;

public class SpillerTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void kast_TestAtKorrektResultReturneres() {
		
		Spiller s = new Spiller("Frederik");
		
		s.kastTerninger();
		
		Terning t1 = s.getBæger().getTerning1();
		Terning t2 = s.getBæger().getTerning1();		
		
		int sumAfTerninger = t1.getØjne()+t2.getØjne();
		
		// Test at points og øjne af terninger stemmer overens.
		assertTrue(sumAfTerninger==s.getPoint());
		
		//TODO: Mangler test af flg.
		//Spilleren mister alle sine point hvis spilleren slår to 1'ere.
		//Spilleren får en ekstra tur hvis spilleren slår to ens.
		//Spilleren kan vinde spillet ved at slå to 6'ere, hvis spilleren også i forrige kast slog to 6'ere uanset om det er på ekstrakast eller i forrige tur.
		//Spilleren skal slå to ens for at vinde spillet, efter at man har opnået 40 point.		
	}
}
