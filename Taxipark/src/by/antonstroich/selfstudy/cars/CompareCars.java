package by.antonstroich.selfstudy.cars;

import java.util.Comparator;

public class CompareCars implements Comparator<Car> {

    @Override
    public int compare(Car car1, Car car2) {
        if (car1.getFuelSpend() == car2.getFuelSpend()) {
            return 0;
        }
        return (int) (car1.getFuelSpend() - car2.getFuelSpend());
    }
}
