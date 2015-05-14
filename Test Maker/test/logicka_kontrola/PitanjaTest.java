package logicka_kontrola;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PitanjaTest {

	private Pitanja pitanje;

	@Before
	public void setUp() throws Exception {
		pitanje = new Pitanja();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSetPitanje() {
		pitanje.setPitanje("Pitanje je?");
		pitanje.setOdgovor("Odgovor je.");

		assertEquals("Pitanje je?", pitanje.getPitanje());
		assertEquals("Odgovor je.", pitanje.getOdgovor());
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetPitanjeNull() {
		pitanje.setPitanje(null);
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetPitanjeEmtryString() {
		pitanje.setPitanje("");
	}

}
