package com.zc.jun;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Task2 {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("this is before class....Task2");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("this is afterClass....Task2");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("this is before Task2");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("this is after Task2");
	}

	@Test
	public void test() {
		System.out.println("task2");
	}
}
