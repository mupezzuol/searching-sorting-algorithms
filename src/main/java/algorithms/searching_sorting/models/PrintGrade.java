package algorithms.searching_sorting.models;

import algorithms.searching_sorting.interfaces.IPrintCar;
import algorithms.searching_sorting.interfaces.IPrintGrade;

public class PrintGrade implements IPrintGrade {

    @Override
    public void printGrades(Grade[] grades) {
        for (Grade grade: grades) {
            System.out.println("Student: " + grade.getStudent() + " - " + grade.getValue());
        }
    }

}
