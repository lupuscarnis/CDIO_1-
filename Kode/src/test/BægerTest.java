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
	public void Bæger_testForKorrekteSandsynlighederOver1000Kast() {

		int antalKørsler = 1000;
		int[] tmp = new int[11];

		for (int i = 0; i < tmp.length; i++) {
			tmp[i] = 0;
		}

		for (int i = 0; i < antalKørsler; i++) {

			// kast to terninger
			b.toTerninger();

			// hent sum
			int sum = b.getSumAfØjne();

			tmp[(sum - 2)]++;
		}

		System.out.println("Udskriv test array; ");

		double out=1;
		int sumAfØjne = 1;
		for (int i = 0; i < tmp.length; i=i+1) {
			sumAfØjne += 1;
			switch (sumAfØjne) {
		      case 2: out = 2.77;
		      	break;
		      case 3: out = 5.55;
		      	break;
		      case 4: out = 8.33;
		      	break;
		      case 5: out = 11.11;
		      	break;
		      case 6: out = 13.88;
		      	break;
		      case 7: out = 16.66;
		      	break;
		      case 8: out = 13.88;
		      	break;
		      case 9: out = 11.11;
	          	break;
		      case 10: out = 8.33;
	          	break;
		      case 11: out = 5.55;
	          	break;
		      case 12: out = 2.77;
	          	break;
		    
	          // udføres hvis ingen værdier matcher
		      default: out = 0;
		    }

			int sum = tmp[i];
			
			double procent = Math.round(((sum / (double) antalKørsler) * 100)*100.00)/100.00;
			double afvigelse = Math.round((procent-out)*100.00)/100.00;
			System.out.println("Sum: " + (i + 2) + " Antal: " + sum + " Procent: " + procent + "% " + "Afvigelse: " + afvigelse + "%");
			
			assertTrue(afvigelse/procent<0.05);
		}
		
	}
}
