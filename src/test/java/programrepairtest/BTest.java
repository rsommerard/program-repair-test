package programrepairtest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BTest {

	@Test
	public void testGetPrivateBoolean() {
		B b = new B();
		
		assertEquals(true, b.getPrivateBoolean());
	}
	
	@Test
	public void testSetPrivateBoolean() {
		B b = new B();
		b.setPrivateBoolean(false);
		
		assertEquals(false, b.getPrivateBoolean());
	}
	
	@Test
	public void testInversePrivateBoolean() {
		B b = new B();
		
		assertEquals(false, b.inversePrivateBoolean());
	}
}
