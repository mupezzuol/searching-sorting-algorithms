package algorithms.searching_sorting.sorting;

import algorithms.searching_sorting.interfaces.IPrintCar;
import algorithms.searching_sorting.interfaces.ISortCar;
import algorithms.searching_sorting.models.Car;
import algorithms.searching_sorting.models.PrintCar;
import algorithms.searching_sorting.models.SortCar;

public class SelectionSort {

	public static void main(String[] args) {
		System.out.println("------------------------- BEGIN - SelectionSort");


		Car cars[] = new Car().mockCars();

		ISortCar sortCar = new SortCar();
		IPrintCar printCar = new PrintCar();

		cars = sortCar.selectionSort(cars, cars.length);

		printCar.printCars(cars);

		System.out.println("------------------------- END - SelectionSort");
	}



	
	

}
