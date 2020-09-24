package algorithms.searching_sorting.merge_sort;

import algorithms.searching_sorting.mock.GradeMock;

public class MergeSortMain {

    public static void main(String[] args) {
        System.out.println("------------------------- BEGIN - MergeSort");

        Grade grades[] = new GradeMock().getMockGrades();

        SortGrade sortGrade = new SortGrade();
        PrintGrade printGrade = new PrintGrade();

        grades = sortGrade.mergeSort(grades, 0, grades.length);
        printGrade.printGrades(grades);

        System.out.println("------------------------- END - MergeSort");
    }

}
