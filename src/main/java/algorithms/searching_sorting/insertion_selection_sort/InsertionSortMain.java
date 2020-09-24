package algorithms.searching_sorting.insertion_selection_sort;

import algorithms.searching_sorting.mock.CarMock;

public class InsertionSortMain {

	public static void main(String[] args) {
		System.out.println("------------------------- BEGIN - SelectionSort");

		Car cars[] = new CarMock().getMockCars();

		SortCar sortCar = new SortCar();
		PrintCar printCar = new PrintCar();

		cars = sortCar.insertionSort(cars, cars.length);
		printCar.printCars(cars);

		System.out.println("------------------------- END - SelectionSort");
	}

}
