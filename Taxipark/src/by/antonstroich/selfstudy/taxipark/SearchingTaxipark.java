package by.antonstroich.selfstudy.taxipark;

import by.antonstroich.selfstudy.cars.Car;

public class SearchingTaxipark {

	public static Taxipark sortTaxipark(Taxipark taxipark, String model, int cost) {
		Taxipark filteredTaxipark = new Taxipark();
		for (Car car : taxipark.getTaxipark()) {
			if (car.getModelCar() == model || car.getCarCost() == cost) {
				filteredTaxipark.add(car);
			}
		}
		return filteredTaxipark;
	}

}
