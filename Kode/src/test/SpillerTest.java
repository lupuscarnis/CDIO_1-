package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import program.KastResult;
import program.Spiller;
import program.Terning;

public class SpillerTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void kast_TestAtKorrektResultReturneres() {

		// Spilleren mister alle sine point hvis spilleren slår to 1'ere.
		Spiller s = new Spiller("Frederik", new FalskBæger(1, 1));
		assertTrue(s.kastTerninger() == KastResult.PointsTabt);

		// Spilleren får en ekstra tur hvis spilleren slår to ens.
		s = new Spiller("Frederik", new FalskBæger(2, 2));
		assertTrue(s.kastTerninger() == KastResult.EkstraTur);
		s = new Spiller("Frederik", new FalskBæger(3, 3));
		assertTrue(s.kastTerninger() == KastResult.EkstraTur);
		s = new Spiller("Frederik", new FalskBæger(4, 4));
		assertTrue(s.kastTerninger() == KastResult.EkstraTur);
		s = new Spiller("Frederik", new FalskBæger(5, 5));
		assertTrue(s.kastTerninger() == KastResult.EkstraTur);
		s = new Spiller("Frederik", new FalskBæger(6, 6));
		assertTrue(s.kastTerninger() == KastResult.EkstraTur);

		// Spilleren kan vinde spillet ved at slå to 6'ere, hvis spilleren også i
		// forrige kast slog to 6'ere uanset om det er på ekstrakast eller i forrige
		// tur.
		s = new Spiller("Frederik", new FalskBæger(6, 6));
		s.kastTerninger();
		assertTrue(s.kastTerninger() == KastResult.SpilVundet);		
		
		// Spilleren skal slå to ens for at vinde spillet, efter at man har opnået 40
		// point.
		s = new Spiller("Frederik", new FalskBæger(5, 5, 40));	
		s.kastTerninger();
		assertTrue(s.kastTerninger() == KastResult.SpilVundet);
	}
}
