package algorithms.searching_sorting.searching;

import algorithms.searching_sorting.model.Car;
import algorithms.searching_sorting.model.Grade;

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

	public Grade[] quickSort(Grade[] grades, int begin, int end) {
		order(grades, begin, end);
		return grades;
	}

	public void order(Grade[] grades, int from, int to) {
		int elements = to - from;
		if (elements > 1){
			int pivotPosition = breakPivot(grades, from, to);
			order(grades, from, pivotPosition); // Order Left on Pivot
			order(grades, pivotPosition + 1, to); // Order Right on Pivot
		}
	}

	public int breakPivot(Grade[] grades, int beginPosition, int endPosition) {
		Grade pivot = grades[endPosition - 1];

		int minorFound = 0;
		for (int analyze = 0; analyze < endPosition - 1; analyze++) {
			Grade gradeCurrent = grades[analyze];
			if (gradeCurrent.getValue() <= pivot.getValue()) {
				changePosition(grades, analyze, minorFound);
				minorFound++;
			}
		}

		changePosition(grades, endPosition - 1, minorFound);
		return minorFound;
	}

	public void changePosition(Grade[] grades, int from, int to){
		System.out.println("Exchanging the " +from+ " with the " +to);

		Grade gradeFrom = grades[from];
		Grade gradeTo = grades[to];

		System.out.println("Exchanging the " +gradeFrom.getStudent()+ " with the " +gradeTo.getStudent());

		grades[to] = gradeFrom;
		grades[from] = gradeTo;
	}
}
