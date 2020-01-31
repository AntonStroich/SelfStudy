package by.antonstroich.selfstudy.taxipark;

import by.antonstroich.selfstudy.cars.Car;

public class TaxiparkCost {

	private static int taxiParkCost;

	public static int calculateTaxiparkCost(Taxipark taxipark) {
		for (Car car : taxipark.getTaxipark()) {
			taxiParkCost = taxiParkCost + car.getCarCost();
		}
		return taxiParkCost;
	}
}
