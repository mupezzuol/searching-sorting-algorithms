package algorithms.searching_sorting.searching;

import algorithms.searching_sorting.mock.GradeMock;
import algorithms.searching_sorting.model.Grade;
import algorithms.searching_sorting.print.PrintGrade;

public class BinarySearchMain {

    public static void main(String[] args) {
        System.out.println("------------------------- BEGIN - Binary Searching");

        Grade grades[] = new GradeMock().getMockGrades();

        Search search = new Search();
        PrintGrade printGrade = new PrintGrade();

        grades = search.quickSort(grades, 0, grades.length);

        double value = 9.3;
        int positionFound = search.binarySearch(grades, 0, grades.length, value);

        if (positionFound >= 0) {
            System.out.println("The "+value+" value is in the "+positionFound+" position");
        } else {
            System.out.println("The "+value+" value is not found");
        }

        printGrade.printGrades(grades);

        System.out.println("------------------------- END - Binary Searching");
    }
}
