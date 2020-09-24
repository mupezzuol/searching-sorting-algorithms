package algorithms.searching_sorting.searching;

import algorithms.searching_sorting.mock.CarMock;
import algorithms.searching_sorting.insertion_selection_sort.Car;
import algorithms.searching_sorting.insertion_selection_sort.PrintCar;

public class SearchLowestValueMain {
	
	public static void main(String[] args) {
		System.out.println("------------------------- BEGIN - Finding the lowest value in an array");
		
		Car cars[] = new CarMock().getMockCars();

		SearchCar searchCar = new SearchCar();
		PrintCar printCar = new PrintCar();
		
		int cheaper = searchCar.searchLowestValue(cars, 0, cars.length-1);

		Car carCheaper = cars[cheaper];
		printCar.printCar(carCheaper);
		
		System.out.println("------------------------- END - Finding the lowest value in an array");
	}

}
