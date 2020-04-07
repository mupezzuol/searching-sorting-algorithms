package algorithms.searching_sorting.searching;

import algorithms.searching_sorting.interfaces.IPrintCar;
import algorithms.searching_sorting.interfaces.ISearchCar;
import algorithms.searching_sorting.models.Car;
import algorithms.searching_sorting.models.PrintCar;
import algorithms.searching_sorting.models.SearchCar;

public class SearchLowestValueMain {
	
	public static void main(String[] args) {
		System.out.println("------------------------- BEGIN - Finding the lowest value in an array");
		
		
		Car cars[] = new Car().mockCars();
		
		ISearchCar searchCar = new SearchCar();
		IPrintCar printCar = new PrintCar();
		
		int cheaper = searchCar.searchLowestValue(cars, 0, cars.length-1);

		Car carCheaper = cars[cheaper];
		printCar.printCar(carCheaper);
		
		
		System.out.println("------------------------- END - Finding the lowest value in an array");
	}


}
