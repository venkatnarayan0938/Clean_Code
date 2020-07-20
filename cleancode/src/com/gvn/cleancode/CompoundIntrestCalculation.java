package com.gvn.cleancode;

public class CompoundIntrestCalculation {

	double principle,time,rateOfInterest;
	CompoundIntrestCalculation(double principle,double time,double rateOfInterest)
	{
		this.principle=principle;
		this.time=time;
		this.rateOfInterest=rateOfInterest;
	}
	public double calculateCompoundIntrest()
	{
		return principle*(Math.pow((1+(rateOfInterest/100)),time));
	}
}
