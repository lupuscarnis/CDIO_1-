package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import program.Bæger;
import program.Spil;

public class BægerTest {

	Bæger b = null;

	@Before
	public void setUp() throws Exception {
		b = new Bæger();
	}

	@Test
	public void Bæger_TjekInitialStateForTerningerIBæger_100Times() {

		for (int i = 0; i < 100; i++) {
			b = new Bæger();
			assertTrue(b.getSumAfØjne() >= Spil.SUM_MIN && b.getSumAfØjne() <= Spil.SUM_MAX);
		}
	}

	@Test
	public void kast_TjekForKorrektSumEfterKast_100Times() {

		for (int i = 0; i < 100; i++) {

			// kast
			b.Kast();

			// hent øjne på hver terning
			int værdi1 = b.getTerning1().getØjne();
			int værdi2 = b.getTerning2().getØjne();
			int sum = b.getSumAfØjne();

			assertTrue(sum == (værdi1 + værdi2));
		}
	}

}
