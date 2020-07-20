package com.gvn.cleancode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConstructionPriceCalculationTest {

	@Test
	void constructionCostStandard()
	{
		ConstructionPriceCalculation standardMaterial=new ConstructionPriceCalculation();
		standardMaterial.takeInputParameters(55,"standard",false);
		double constructionPrice=standardMaterial.calculateConstructionCost();
		assertEquals(66000,constructionPrice,1);
	}
	@Test
	void constructionCostAboveStandard()
	{
		ConstructionPriceCalculation aboveStandardMaterial=new ConstructionPriceCalculation();
		aboveStandardMaterial.takeInputParameters(60,"aboveStandard");
		double constructionPrice=aboveStandardMaterial.calculateConstructionCost();
		assertEquals(90000,constructionPrice,1);
	}
	@Test
	void constructionCostHighStandard()
	{
		ConstructionPriceCalculation highStandardMaterial=new ConstructionPriceCalculation();
		highStandardMaterial.takeInputParameters(100,"highStandard",false);
		double constructionPrice=highStandardMaterial.calculateConstructionCost();
		assertEquals(180000,constructionPrice,1);
	}
	@Test
	void constructionCostHighStandardAutoHome()
	{
		ConstructionPriceCalculation highStandardMaterialAuto=new ConstructionPriceCalculation();
		highStandardMaterialAuto.takeInputParameters(400,"highStandard",true);
		double constructionPrice=highStandardMaterialAuto.calculateConstructionCost();
		assertEquals(1000000,constructionPrice,1);
	}
}
