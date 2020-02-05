package by.antonstroich.selfstudy.main;

import by.antonstroich.selfstudy.cars.Coupe;
import by.antonstroich.selfstudy.cars.Minivan;
import by.antonstroich.selfstudy.cars.Sedan;
import by.antonstroich.selfstudy.taxipark.TaxiparkCost;
import by.antonstroich.selfstudy.taxipark.SortingTaxipark;
import by.antonstroich.selfstudy.taxipark.Taxipark;

public class Main {

	public static void main(String[] args) {
		Taxipark taxipark1 = new Taxipark();
		taxipark1.addCar(new Sedan("Ford", 78956789, 12000, 2));
		taxipark1.addCar(new Sedan("Ford", 78956789, 18000, 3));
		taxipark1.addCar(new Sedan("Lada", 88956789, 11000, 2));
		taxipark1.addCar(new Coupe("Mersedes", 98956789, 21000, 4));
		taxipark1.addCar(new Coupe("Lada", 38956789, 20000, 2));
		taxipark1.addCar(new Minivan("Opel", 18956789, 32000, 4));
		taxipark1.addCar(new Coupe("Ford", 438956789, 18000, 3));
		taxipark1.addCar(new Minivan("Opel", 28956789, 28000, 5));
		System.out.println("Park cost: " + TaxiparkCost.calculateTaxiparkCost(taxipark1));
		taxipark1.printTaxipark();
		Taxipark taxipark2 = SortingTaxipark.sortTaxiparkByFuelSpend(taxipark1);
		System.out.println("Taxipark is sorted by fuel spend");
		taxipark2.printTaxipark();
		Taxipark taxipark3 = new Taxipark(taxipark1.getSearchedCars("Ford", 18000));
		System.out.println("Searching results: ");
		taxipark3.printTaxipark();

	}

}
