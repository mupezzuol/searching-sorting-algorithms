package algorithms.searching_sorting.interfaces;

import algorithms.searching_sorting.models.Car;

public interface ISortCar {

    Car[] selectionSort(Car[] cars, int numberOfElements);
    Car[] insertionSort(Car[] cars, int numberOfElements);
    void changePosition(Car[] cars, int first, int second);

}
