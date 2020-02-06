package by.antonstroich.selfstudy.taxipark;

import java.util.ArrayList;
import java.util.List;
import by.antonstroich.selfstudy.cars.Car;

public class Taxipark {

	private List<Car> taxipark = new ArrayList<Car>();
	public int taxiParkCost;

	public Taxipark() {

	}

	public Taxipark(List<Car> taxipark) {
		this.taxipark = taxipark;
		this.taxiParkCost = calculateTaxiparkCost(taxipark);
	}

	public List<Car> getTaxipark() {
		return taxipark;
	}

	public void addCar(Car car) {
		taxipark.add(car);
		taxiParkCost += car.getCarCost();
	}

	public void deleteCar(Car car) {
		taxipark.remove(car);
		taxiParkCost -= car.getCarCost();
	}

	public void printTaxipark() {
		for (Car car : taxipark) {
			System.out.println(car.toString());
		}
	}

	public void showTaxiparkCost() {
		System.out.println("Taxipark cost: " + taxiParkCost);
	}

	public List<Car> getSearchedCars(String model, int cost) {
		List<Car> filteredTaxipark = new ArrayList<Car>();
		for (Car car : taxipark) {
			if (car.getModelCar() == model && car.getCarCost() == cost) {
				filteredTaxipark.add(car);
			}
		}
		return filteredTaxipark;
	}

	private int calculateTaxiparkCost(List<Car> taxipark) {
		int taxiParkCost = 0;
		for (Car car : taxipark) {
			taxiParkCost = taxiParkCost + car.getCarCost();
		}
		return taxiParkCost;
	}

}
