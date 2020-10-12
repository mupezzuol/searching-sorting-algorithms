package algorithms.searching_sorting.searching;

import algorithms.searching_sorting.mock.CarMock;
import algorithms.searching_sorting.model.Car;
import algorithms.searching_sorting.print.PrintCar;

public class SearchLowestValueMain {
	
	public static void main(String[] args) {
		System.out.println("------------------------- BEGIN - Finding the lowest value in an array");
		
		Car cars[] = new CarMock().getMockCars();

		Search searchCar = new Search();
		PrintCar printCar = new PrintCar();
		
		int cheaper = searchCar.searchLowestValue(cars, 0, cars.length-1);

		Car carCheaper = cars[cheaper];
		printCar.printCar(carCheaper);
		
		System.out.println("------------------------- END - Finding the lowest value in an array");
	}

}
