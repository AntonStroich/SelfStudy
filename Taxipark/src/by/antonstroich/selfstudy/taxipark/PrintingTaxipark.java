package by.antonstroich.selfstudy.taxipark;

import by.antonstroich.selfstudy.cars.Car;

public class PrintingTaxipark {

	public static void printTaxipark(Taxipark taxipark) {

		for (Car car : taxipark.getTaxipark()) {
			System.out.println("model: " + car.getModelCar() + " , registration number: " + car.getRegistrationNumber()
					+ " , car cost: " + car.getCarCost() + " , fuel spend: " + car.getFuelSpend()
					+ " , number of seats: " + car.getSeatNumber() + ".");

		}

	}

}
