package com.techelevator;

public class SpuBiz extends Postal implements DeliveryDriver{

	public SpuBiz(int distance, int weight) {
		super(distance, weight);
	}
	public double calculatedRate(int distance, int weight) {
		return rate = (weight * 0.050) * distance;
		
	}
	public String getName() {
		return "SPU (2-day Business)";
	}
}
