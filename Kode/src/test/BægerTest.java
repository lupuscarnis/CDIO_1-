package test;

import static org.junit.Assert.*;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Iterator;

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

	@Test
	public void Bæger_testForKorrekteSandsynlighederOver10000Kast() {

		int antalKørsler = 2000000;
		int[] tmp = new int[11];

		for (int i = 0; i < tmp.length; i++) {
			tmp[i] = 0;
		}

		for (int i = 0; i < antalKørsler; i++) {

			// kast
			b.Kast();

			// hent sum
			int sum = b.getSumAfØjne();

			tmp[(sum - 2)]++;
		}

		System.out.println("Udskriv test array; ");

		for (int i = 0; i < tmp.length; i++) {

			int sum = tmp[i];
			double procent = (sum / (double) antalKørsler) * 100;

			System.out.println("Sum: " + (i + 2) + " Antal: " + sum + " Procent: " + Math.round(procent*100.0)/100.0 + "%");
		}
	}
}
