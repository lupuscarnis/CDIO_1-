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
		assertTrue(terning.getØjne() >= Spil.MIN);
		assertTrue(terning.getØjne() <= Spil.MAX);
	}

	@Test
	public void rul_ViserKorrektØjneEfter10000Rul_ViserRetteVærdi() {

		for (int i = 0; i < 10000; i++) {
			terning.rul();

			assertTrue(terning.getØjne() >= Spil.MIN && terning.getØjne() <= Spil.MAX);
		}
	}

}
