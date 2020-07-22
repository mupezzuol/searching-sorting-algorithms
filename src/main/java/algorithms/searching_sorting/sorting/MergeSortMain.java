package algorithms.searching_sorting.sorting;

import algorithms.searching_sorting.interfaces.IPrintGrade;
import algorithms.searching_sorting.interfaces.ISortGrade;
import algorithms.searching_sorting.mock.GradeMock;
import algorithms.searching_sorting.models.*;

public class MergeSortMain {

    public static void main(String[] args) {
        System.out.println("------------------------- BEGIN - MergeSort");

        Grade grades[] = new GradeMock().getMockGrades();

        ISortGrade sortGrade = new SortGrade();
        IPrintGrade printGrade = new PrintGrade();

        grades = sortGrade.mergeSort(grades, 0, grades.length);
        printGrade.printGrades(grades);

        System.out.println("------------------------- END - MergeSort");
    }

}
