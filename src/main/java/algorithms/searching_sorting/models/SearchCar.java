package algorithms.searching_sorting.models;

import algorithms.searching_sorting.interfaces.ISearchCar;

public class SearchCar implements ISearchCar {

	@Override
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
