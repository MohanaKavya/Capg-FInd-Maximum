package com.capgemini.assignment.findmaximum;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {
	
	@Test
	public void testMaximumAtFirstPosition() {
		Integer maximum = FindMaximum.findMaximum(30, 15, 19);
		boolean flag;
		if(maximum.equals(30))
			flag=true;
		else
			flag=false;
		Assert.assertEquals(true, flag);
	}
}
