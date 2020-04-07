package algorithms.searching_sorting.models;

import algorithms.searching_sorting.interfaces.ISearchCar;
import algorithms.searching_sorting.interfaces.ISortCar;

public class SortCar implements ISortCar {

    @Override
    public Car[] selectionSort(Car[] cars, int numberOfElements) {
        ISearchCar searchCar = new SearchCar();

        System.out.println();
        System.out.println("BEGIN - Running SelectionSort");
        for (int current = 0; current < numberOfElements - 1; current++) {
            int lowestValue = searchCar.searchLowestValue(cars, current, numberOfElements - 1);

            System.out.println("Exchanging the " +current+ " with the " +lowestValue);
            Car carCurrent = cars[current];
            Car carLowesValue = cars[lowestValue];
            System.out.println("Exchanging the " +carCurrent.getName()+ " with the " +carLowesValue.getName());

            cars[current] = carLowesValue;
            cars[lowestValue] = carCurrent;
        }
        System.out.println("END - Running SelectionSort");
        System.out.println();

        return cars;
    }

}
