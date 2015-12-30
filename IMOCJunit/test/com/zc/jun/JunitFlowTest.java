package com.zc.jun;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitFlowTest {
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
	public void test1() {
		System.out.println("test1");
	}

	@Test
	public void test2() {
		System.out.println("test2");
	}

	@Test
	public void test3() {
		System.out.println("test3");
	}
}
