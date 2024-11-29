
package com.arvindhvelrajan;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Warmup_1Test
{
	Warmup_1 warmup1 = new Warmup_1();

	@Test
	public void testSleepIn()
	{
		assertEquals(true, warmup1.sleepIn(false, false));
		assertEquals(false, warmup1.sleepIn(true, false));
		assertEquals(true, warmup1.sleepIn(false, true));
		assertEquals(true, warmup1.sleepIn(true, true));
	}

	@Test
	public void testMonkeyTrouble()
	{
		assertEquals(true, monkeyTrouble(true, true));
		assertEquals(true, monkeyTrouble(false, false));
		assertEquals(false, monkeyTrouble(true, false));
		assertEquals(false, monkeyTrouble(false, true));
	}

	@Test
	public void testSumDouble()
	{
		assertEquals(3, sumDouble(1, 2));
		assertEquals(5, sumDouble(3, 2));
		assertEquals(8, sumDouble(2, 2));
		assertEquals(-1, sumDouble(-1, 0));
		assertEquals(12, sumDouble(3, 3));
		assertEquals(0, sumDouble(0, 0));
		assertEquals(1, sumDouble(0, 1));
		assertEquals(7, sumDouble(3, 4));
	}
}