package by.antonstroich.selfstudy.taxipark;

import java.util.Collections;

import by.antonstroich.selfstudy.cars.CompareCars;

public class SortingTaxipark {

    public static Taxipark sortTaxiparkByFuelSpend(Taxipark taxipark) {
        Taxipark sortedTaxipark = new Taxipark(taxipark.getTaxipark());
        Collections.sort(sortedTaxipark.getTaxipark(), new CompareCars());
        return sortedTaxipark;
    }
}
