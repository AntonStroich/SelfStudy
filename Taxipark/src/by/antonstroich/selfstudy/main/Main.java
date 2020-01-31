package by.antonstroich.selfstudy.main;

import by.antonstroich.selfstudy.cars.Car;
import by.antonstroich.selfstudy.cars.Coupe;
import by.antonstroich.selfstudy.cars.Minivan;
import by.antonstroich.selfstudy.cars.Sedan;
import by.antonstroich.selfstudy.taxipark.TaxiparkCost;
import by.antonstroich.selfstudy.taxipark.PrintingTaxipark;
import by.antonstroich.selfstudy.taxipark.SearchingTaxipark;
import by.antonstroich.selfstudy.taxipark.SortingTaxipark;
import by.antonstroich.selfstudy.taxipark.Taxipark;

public class Main {

	public static void main(String[] args) {
		Taxipark taxipark1 = new Taxipark();
		taxipark1.add(new Sedan("Ford", 78956789, 12000, 2));
		taxipark1.add(new Sedan("Ford", 78956789, 18000, 3));
		taxipark1.add(new Sedan("Lada", 88956789, 11000, 2));
		taxipark1.add(new Coupe("Mersedes", 98956789, 21000, 4));
		taxipark1.add(new Coupe("Lada", 38956789, 20000, 2));
		taxipark1.add(new Minivan("Opel", 18956789, 32000, 4));
		taxipark1.add(new Coupe("Ford", 438956789, 18000, 3));
		taxipark1.add(new Minivan("Opel", 28956789, 28000, 5));
		System.out.println("Park cost: " + TaxiparkCost.calculateTaxiparkCost(taxipark1));
		PrintingTaxipark.printTaxipark(taxipark1);
		Taxipark taxipark2 = SortingTaxipark.sortTaxiparkByFuelSpend(taxipark1);
		System.out.println("Taxipark is sorted by fuel spend");
		PrintingTaxipark.printTaxipark(taxipark2);
		Taxipark taxipark3 = new Taxipark();
		taxipark3 = SearchingTaxipark.sortTaxipark(taxipark1, "Ford", 18000);
		PrintingTaxipark.printTaxipark(taxipark3);

	}

}
