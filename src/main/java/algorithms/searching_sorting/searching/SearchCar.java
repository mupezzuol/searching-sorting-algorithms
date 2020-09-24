package algorithms.searching_sorting.searching;

import algorithms.searching_sorting.model.Car;

public class SearchCar {

	public int searchLowestValue(Car[] cars, int beginPosition, int endPosition) {
		int cheaper = beginPosition;
		for (int current = beginPosition; current <= endPosition; current++) {
			if (cars[current].getPrice() < cars[cheaper].getPrice()) {
				cheaper = current;
			}
		}
		return cheaper;
	}

}
