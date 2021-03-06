package by.antonstroich.selfstudy.main;

import by.antonstroich.selfstudy.cars.Car;
import by.antonstroich.selfstudy.cars.Coupe;
import by.antonstroich.selfstudy.cars.Minivan;
import by.antonstroich.selfstudy.cars.Sedan;
import by.antonstroich.selfstudy.taxipark.SortingTaxipark;
import by.antonstroich.selfstudy.taxipark.Taxipark;

public class Main {

    public static void main(String[] args) {
        Taxipark taxipark1 = new Taxipark();
        Car car1 = new Sedan("Ford", 78956789, 12000, 2);
        Car car2 = new Sedan("Ford", 78956789, 18000, 3);
        Car car3 = new Sedan("Lada", 88956789, 11000, 2);
        Car car4 = new Coupe("Mersedes", 98956789, 21000, 4);
        Car car5 = new Coupe("Lada", 38956789, 20000, 2);
        Car car6 = new Minivan("Opel", 18956789, 32000, 4);
        Car car7 = new Coupe("Ford", 438956789, 18000, 3);
        Car car8 = new Minivan("Opel", 28956789, 28000, 5);
        Car car9 = new Minivan("Opel", 28956789, 28000, 5);
        taxipark1.showTaxiparkCost();
        taxipark1.addCar(car1);
        taxipark1.addCar(car2);
        taxipark1.addCar(car3);
        taxipark1.addCar(car4);
        taxipark1.addCar(car5);
        taxipark1.addCar(car6);
        taxipark1.addCar(car7);
        taxipark1.addCar(car8);
        taxipark1.showTaxiparkCost();
        taxipark1.addCar(car9);
        taxipark1.showTaxiparkCost();
        taxipark1.printTaxipark();
        Taxipark taxipark2 = SortingTaxipark.sortTaxiparkByFuelSpend(taxipark1);
        taxipark1.deleteCar(car5);
        taxipark1.showTaxiparkCost();
        taxipark1.printTaxipark();
        System.out.println("Taxipark is sorted by fuel spend");
        taxipark2.printTaxipark();
        Taxipark taxipark3 = new Taxipark(taxipark1.getSearchedCars("Ford", 18000));
        System.out.println("Searching results: ");
        taxipark3.printTaxipark();
        taxipark3.showTaxiparkCost();

    }

}
