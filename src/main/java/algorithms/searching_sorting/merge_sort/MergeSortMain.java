package algorithms.searching_sorting.merge_sort;

import algorithms.searching_sorting.mock.GradeMock;
import algorithms.searching_sorting.model.Grade;
import algorithms.searching_sorting.model.SortGrade;
import algorithms.searching_sorting.print.PrintGrade;

public class MergeSortMain {

    public static void main(String[] args) {
        System.out.println("------------------------- BEGIN - Merge Sort");

        Grade grades[] = new GradeMock().getMockGrades();

        SortGrade sortGrade = new SortGrade();
        PrintGrade printGrade = new PrintGrade();

        grades = sortGrade.mergeSort(grades, 0, grades.length);
        printGrade.printGrades(grades);

        System.out.println("------------------------- END - Merge Sort");
    }

}
