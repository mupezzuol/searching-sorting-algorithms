package algorithms.searching_sorting.searching;

import algorithms.searching_sorting.mock.GradeMock;
import algorithms.searching_sorting.model.Grade;
import algorithms.searching_sorting.print.PrintGrade;

public class SearchPivotMain {
	
	public static void main(String[] args) {
		System.out.println("------------------------- BEGIN - Finding the Pivot in an array");
		
		Grade grades[] = new GradeMock().getMockGrades();

		Search searchCar = new Search();
		PrintGrade printGrade = new PrintGrade();

		int pivotPosition = searchCar.breakPivot(grades, 0, grades.length);
		printGrade.printGrades(grades);
		System.out.println("## The pivot is in position "+pivotPosition);

		System.out.println("------------------------- END - Finding the Pivot in an array");
	}
}
