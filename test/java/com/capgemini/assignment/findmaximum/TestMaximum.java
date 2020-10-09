package com.capgemini.assignment.findmaximum;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {
	
	@Test
	public void testIntegerMaximumAtFirstPosition() {
		Integer maximum= new FindMaximum<Integer>(23, 12, 15).printMax();
		boolean flag;
		if(maximum.equals(23))
			flag=true;
		else
			flag=false;
		Assert.assertEquals(true, flag);
	}
	
	@Test
	public void testIntegerMaximumAtSecondPosition() {
		Integer maximum= new FindMaximum<Integer>(10, 20, 15).printMax();
		boolean flag;
		if(maximum.equals(20))
			flag=true;
		else
			flag=false;
		Assert.assertEquals(true, flag);
	}
	
	@Test
	public void testIntegerMaximumAtThirdPosition() {
		Integer maximum= new FindMaximum<Integer>(23, 12, 40).printMax();
		boolean flag;
		if(maximum.equals(40))
			flag=true;
		else
			flag=false;
		Assert.assertEquals(true, flag);
	}
	
	@Test
	public void testFloatMaximumAtFirstPosition() {
		Float maximum= new FindMaximum<Float>(23.2f, 12.4f, 15.6f).printMax();
		boolean flag;
		if(maximum.equals(23.2f))
			flag=true;
		else
			flag=false;
		Assert.assertEquals(true, flag);
	}
	
	@Test
	public void testFloatMaximumAtSecondPosition() {
		Float maximum= new FindMaximum<Float>(12.5f,29.6f,9.8f).printMax();
		boolean flag;
		if(maximum.equals(29.6f))
			flag=true;
		else
			flag=false;
		Assert.assertEquals(true, flag);
	}
	
	@Test
	public void testFloatMaximumAtThirdPosition() {
		Float maximum= new FindMaximum<Float>(14.5f,9.2f,15.1f).printMax();
		boolean flag;
		if(maximum.equals(15.1f))
			flag=true;
		else
			flag=false;
		Assert.assertEquals(true, flag);
	}
		
	@Test
	public void testMaximumAtFirstPosition() {
		String maximum = new FindMaximum<String>("Peach", "Apple", "Banana").printMax();
		boolean flag;
		if (maximum.equals("Peach"))
			flag = true;
		else
			flag = false;
		Assert.assertEquals(true, flag);
	}

	@Test
	public void testMaximumAtSecondPosition() {
		String maximum = new FindMaximum<String>("Apple", "Peach", "Banana").printMax();
		boolean flag;
		if (maximum.equals("Peach"))
			flag = true;
		else
			flag = false;
		Assert.assertEquals(true, flag);
	}

	@Test
	public void testMaximumAtThirdPosition() {
		String maximum = new FindMaximum<String>("Apple", "Banana", "Peach").printMax();
		boolean flag;
		if (maximum.equals("Peach"))
			flag = true;
		else
			flag = false;
		Assert.assertEquals(true, flag);
	}
	
}
