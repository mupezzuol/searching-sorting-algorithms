package algorithms.searching_sorting.insertion_selection_sort;

import algorithms.searching_sorting.mock.CarMock;
import algorithms.searching_sorting.model.Car;
import algorithms.searching_sorting.model.SortCar;
import algorithms.searching_sorting.print.PrintCar;

public class SelectionSortMain {

	public static void main(String[] args) {
		System.out.println("------------------------- BEGIN - Selection Sort");

		Car cars[] = new CarMock().getMockCars();

		SortCar sortCar = new SortCar();
		PrintCar printCar = new PrintCar();

		cars = sortCar.selectionSort(cars, cars.length);
		printCar.printCars(cars);

		System.out.println("------------------------- END - Selection Sort");
	}

}
