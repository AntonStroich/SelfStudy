package by.antonstroich.selfstudy.taxipark;

import java.util.ArrayList;
import java.util.List;
import by.antonstroich.selfstudy.cars.Car;

public class Taxipark {

	List<Car> taxipark = new ArrayList<Car>();

	public List<Car> getTaxipark() {
		return taxipark;
	}

	public void add(Car car) {
		taxipark.add(car);

	}

	public void delete(Car car) {
		taxipark.remove(car);
	}

}
