package com.zc.jun;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatesTest {
	@Test(timeout = 344, expected = Exception.class)
	public void testAdd() {
		Assert.assertEquals(3, new Calculates().add(1, 2));
	}

	@Ignore
	@Test
	public void testDubtract() {
		Assert.assertEquals(3, new Calculates().dubtract(4, 1));
	}

	@Test
	public void testMultiply() {
		Assert.assertEquals(8, new Calculates().multiply(2, 4));
	}

	@Test
	public void testDivide() {
		Assert.assertEquals(3, new Calculates().divide(6, 2));
	}
}
