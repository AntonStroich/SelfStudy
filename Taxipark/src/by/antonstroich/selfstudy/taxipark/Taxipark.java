package by.antonstroich.selfstudy.taxipark;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import by.antonstroich.selfstudy.cars.Car;

public class Taxipark {

    private List<Car> taxipark = new ArrayList<Car>();

    public Taxipark() {

    }

    public Taxipark(List<Car> taxipark) {
        this.taxipark = taxipark;
    }

    public List<Car> getTaxipark() {
        return taxipark;
    }

    public void addCar(Car car) {
        taxipark.add(car);
    }

    public void deleteCar(Car car) {
        taxipark.remove(car);
    }

    public void printTaxipark() {
        for (Car car : taxipark) {
            System.out.println(car.toString());
        }
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

    public int calculateTaxiparkCost() {
        int taxiparkCost = 0;
        for (Car car : taxipark) {
            taxiparkCost = taxiparkCost + car.getCarCost();
        }
        return taxiparkCost;
    }

    public void showTaxiparkCost() {
        System.out.println("Taxipark cost: " + calculateTaxiparkCost());
    }
}
