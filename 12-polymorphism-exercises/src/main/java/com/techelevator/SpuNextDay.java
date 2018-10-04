package com.techelevator;

public class SpuNextDay extends Postal implements DeliveryDriver {

	public SpuNextDay(int distance, int weight) {
		super(distance, weight);
	}

	@Override
	public double calculateRate() {
		return rate = (weight * 0.075) / 16 * distance;

	}

	public String getName() {
		return "SPU (Next-Day)            ";
	}
}