
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


}