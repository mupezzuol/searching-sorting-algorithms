package algorithms.searching_sorting.searching;

import algorithms.searching_sorting.models.Car;
import algorithms.searching_sorting.models.SearchCar;

public class SearchLowestValueMain {
	
	public static void main(String[] args) {
		System.out.println("------------------------- BEGIN - Finding the lowest value in an array");
		
		
		Car cars[] = new Car().mockCars();
		
		int cheaper = new SearchCar().searchLowestValue(cars, 0, cars.length-1);
		
		System.out.println("CHEAPEST CAR");
		System.out.println("Car: "+ cars[cheaper].getName().toString());
		System.out.println("Price: "+ cars[cheaper].getPrice().toString());
		
		
		System.out.println("------------------------- END - Finding the lowest value in an array");
	}


}
