package junitTesting;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayIntListTest {

	@Test
	public void testAddAndGet() {
		ArrayIntList list = new ArrayIntList();
		
		list.add(10);
		assertEquals(20, list.get(0));
	}

}
