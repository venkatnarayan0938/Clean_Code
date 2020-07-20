package com.gvn.cleancode;

public class IntrestCalculation {

	public double findSimpleInterest(double principle,double time,double rateOfInterest)
	{
		SimpleIntrestCalculation SimpleInterest=new SimpleIntrestCalculation(principle,time,rateOfInterest);
		return SimpleInterest.calculateSimpleInterest();
	}
	public double findCompoundInterest(double principle,double time,double rateOfInterest)
	{
		CompoundIntrestCalculation CompoundIntrest=new CompoundIntrestCalculation(principle,time,rateOfInterest);
		return CompoundIntrest.calculateCompoundIntrest();
	}
}
