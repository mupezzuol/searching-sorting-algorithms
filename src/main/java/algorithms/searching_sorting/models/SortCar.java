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
            changePosition(cars, current, lowestValue);
        }
        System.out.println("END - Running SelectionSort");
        System.out.println();

        return cars;
    }

    @Override
    public Car[] insertionSort(Car[] cars, int numberOfElements) {
        System.out.println();
        System.out.println("BEGIN - Running InsertionSort");
        for(int current = 1; current < numberOfElements; current++){
            int analyze = current;
            while (analyze > 0 && cars[analyze].getPrice() < cars[analyze-1].getPrice()){
                changePosition(cars, analyze, analyze-1);
                analyze--;
            }
        }
        System.out.println("END - Running InsertionSort");
        System.out.println();
        return cars;
    }

    @Override
    public void changePosition(Car[] cars, int first, int second){
        System.out.println("Exchanging the " +first+ " with the " +second);

        Car firstCar = cars[first];
        Car secondCar = cars[second];

        System.out.println("Exchanging the " +firstCar.getName()+ " with the " +secondCar.getName());

        cars[first] = secondCar;
        cars[second] = firstCar;
    }

}
