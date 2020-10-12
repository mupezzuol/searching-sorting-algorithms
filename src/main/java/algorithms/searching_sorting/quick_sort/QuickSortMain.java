package algorithms.searching_sorting.quick_sort;

import algorithms.searching_sorting.mock.GradeMock;
import algorithms.searching_sorting.model.Grade;
import algorithms.searching_sorting.print.PrintGrade;
import algorithms.searching_sorting.searching.Search;

public class QuickSortMain {
	
	public static void main(String[] args) {
		System.out.println("------------------------- BEGIN - Quick Sort using Pivot");
		
		Grade grades[] = new GradeMock().getMockGrades();

		Search searchCar = new Search();
		PrintGrade printGrade = new PrintGrade();

		grades = searchCar.quickSort(grades, 0, grades.length);

		printGrade.printGrades(grades);

		System.out.println("------------------------- END - Quick Sort using Pivot");
	}
}
