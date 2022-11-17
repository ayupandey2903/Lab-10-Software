package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddString
{
	@Test
	public void test()
	{
		assertEquals("HelloHello",jUnitTest.addStrings("Hello","Hello"));
		assertEquals("HelloRekhi",jUnitTest.addStrings("Hello","Rekhi"));
		assertEquals("HelloSatya",jUnitTest.addStrings("Hello","Satya"));
		assertEquals("HelloHellO",jUnitTest.addStrings("Hello","HellO"));
		assertEquals("Helloh",jUnitTest.addStrings("Hello","h"));
	}

}