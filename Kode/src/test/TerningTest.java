/**
 * 
 */
package test;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

//import junit.framework.Assert;
//import junit.framework.Assert;
import program.Spil;
import program.Terning;

/**
 * @author Frederik
 *
 */
public class TerningTest {

	Terning terning;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		terning = new Terning();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void getØjne_KorrektØjneEfterInstantiering_ReturnsTrue() {
		assertTrue(terning.getØjne() >= Spil.TERNING_MIN && terning.getØjne() <= Spil.TERNING_MAX);
	}

	@Test
	public void rul_ViserKorrektØjneEfter1000Rul_ViserRetteVærdi() {

		for (int i = 0; i < 1000; i++) {
			terning.rul();

			assertTrue(terning.getØjne() >= Spil.TERNING_MIN && terning.getØjne() <= Spil.TERNING_MAX);
		}
	}
	
	@Test
	public void testFordelingAfØjne() {
		
		int antalKørsler = 1000;
		int[] tmp = new int[6];

		for (int i = 0; i < tmp.length; i=i+1) {
			tmp[i] = 0;
		}

		for (int i = 0; i < antalKørsler; i=i+1) {

			// kast to terninger
			terning.rul();

			// hent sum
			int vat = terning.getØjne();
			tmp[(vat-1)]++;

		}

		System.out.println("Udskriv test array; ");
		double out = 16.66;
		for (int i = 0; i < tmp.length; i++) {
			int sum = tmp[i];
			
			double procent = Math.round(((sum / (double) antalKørsler) * 100)*100.00)/100.00;
			double afvigelse = Math.round((procent-out)*100.00)/100.00;
			System.out.println("Sum: " + (i + 2) + " Antal: " + sum + " Procent: " + procent + "% " + "Afvigelse: " + afvigelse + "%");
			
			assertTrue(afvigelse/procent<0.05);

		}
	}

}
