package com.zc.jun;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculatesPerTest {
	int	expected	= 0;
	int	inputone	= 0;
	int	inputtwo	= 0;

	@Parameters
	public static Collection<Object[]> t() {
		return Arrays.asList(new Object[][] { { 3, 1, 2 }, { 7, 3, 4 }, { 5, 3, 2 }, { 4, 2, 2 } });
	}

	public CalculatesPerTest(int expected, int inputone, int inputtwo) {
		super();
		this.expected = expected;
		this.inputone = inputone;
		this.inputtwo = inputtwo;
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("this is before class....");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("this is afterClass....");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("this is before");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("this is after");
	}

	@Test
	public void testAdd() {
		Assert.assertEquals(3, new Calculates().add(1, 2));
	}

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

	@Test
	public void testA() {
		Assert.assertEquals(expected, new Calculates().add(inputone, inputtwo));
	}
}
