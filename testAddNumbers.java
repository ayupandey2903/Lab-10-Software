package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers
{
	@Test
	public void test()
	{
		assertEquals(300,jUnitTest.addNumbers(100,200));
		assertEquals(500,jUnitTest.addNumbers(300,200));
		assertEquals(800,jUnitTest.addNumbers(600,200));
		assertEquals(1000,jUnitTest.addNumbers(100,900));
		assertEquals(120,jUnitTest.addNumbers(100,20));
	}

}