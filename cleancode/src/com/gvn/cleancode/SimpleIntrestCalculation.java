package com.gvn.cleancode;

public class SimpleIntrestCalculation {

	double principle,time,rateOfInterest;
	SimpleIntrestCalculation(double principle,double time,double rateOfInterest)
	{
		this.principle=principle;
		this.time=time;
		this.rateOfInterest=rateOfInterest;
	}
	public double calculateSimpleInterest()
	{
		return (principle*time*rateOfInterest)/100;
	}
}
