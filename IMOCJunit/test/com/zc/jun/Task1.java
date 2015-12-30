package com.zc.jun;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Task1 {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("this is before class....Task1");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("this is afterClass....Task1");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("this is before Task1");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("this is after Task1");
	}

	@Test
	public void test() {
		System.out.println("task1");
	}
}
