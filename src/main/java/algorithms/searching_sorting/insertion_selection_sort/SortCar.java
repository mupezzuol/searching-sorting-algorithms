package algorithms.searching_sorting.insertion_selection_sort;

import algorithms.searching_sorting.model.Car;
import algorithms.searching_sorting.searching.SearchCar;

public class SortCar {

    public Car[] selectionSort(Car[] cars, int numberOfElements) {
        SearchCar searchCar = new SearchCar();

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

    public void changePosition(Car[] cars, int from, int to){
        System.out.println("Exchanging the " +from+ " with the " +to);

        Car carFrom = cars[from];
        Car carTo = cars[to];

        System.out.println("Exchanging the " +carFrom.getName()+ " with the " +carTo.getName());

        cars[from] = carTo;
        cars[to] = carFrom;
    }

}
