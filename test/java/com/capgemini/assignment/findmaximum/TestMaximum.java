package com.capgemini.assignment.findmaximum;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {
	
	@Test
	public void testMaximumAtFirstPosition() {
		String maximum = FindMaximum.findMaximum("Peach", "Apple", "Banana");
		boolean flag;
		if (maximum.equals("Peach"))
			flag = true;
		else
			flag = false;
		Assert.assertEquals(true, flag);
	}

	@Test
	public void testMaximumAtSecondPosition() {
		String maximum = FindMaximum.findMaximum("Apple", "Peach", "Banana");
		boolean flag;
		if (maximum.equals("Peach"))
			flag = true;
		else
			flag = false;
		Assert.assertEquals(true, flag);
	}

	@Test
	public void testMaximumAtThirdPosition() {
		String maximum = FindMaximum.findMaximum("Apple", "Banana", "Peach");
		boolean flag;
		if (maximum.equals("Peach"))
			flag = true;
		else
			flag = false;
		Assert.assertEquals(true, flag);
	}
	
}
