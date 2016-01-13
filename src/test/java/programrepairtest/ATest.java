package programrepairtest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ATest {

	@Test
	public void testGetPrivateInteger() {
		A a = new A();

		assertEquals(42, a.getPrivateInteger());
	}

	@Test
	public void testGetPrivateString() {
		A a = new A();

		assertEquals("BEEF", a.getPrivateString());
	}

	@Test
	public void testModulo42() {
		A a = new A();

		assertEquals(24, a.modulo42(24));
	}
}
