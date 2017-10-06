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
	public void get�jne_Korrekt�jneEfterInstantiering_ReturnsTrue() {
		assertTrue(terning.get�jne() >= Spil.MIN);
		assertTrue(terning.get�jne() <= Spil.MAX);
	}

}
