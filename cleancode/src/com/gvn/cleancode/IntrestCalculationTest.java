package com.gvn.cleancode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IntrestCalculationTest {


	@Test
	public void testSimpleInterestCalculator()
	{
		IntrestCalculation simpleInterest=new IntrestCalculation();
		double simpleinterest1=simpleInterest.findSimpleInterest(22000,2,5);
		assertEquals(2200,simpleinterest1,1);
	}
	@Test
	public void testCompoundInterestCalculator()
	{
		IntrestCalculation compoundInterest=new IntrestCalculation();
		double compoundinterest1=compoundInterest.findCompoundInterest(12000,1,3);
		assertEquals(12360,compoundinterest1,1);
	}
}
