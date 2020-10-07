package algorithms.searching_sorting.print;

import algorithms.searching_sorting.model.Grade;

public class PrintGrade {

    public void printGrades(Grade[] grades) {
        for (Grade grade: grades) {
        	System.out.println("Student: "+grade.getStudent());
            System.out.println("Grade: "+grade.getValue());
            System.out.println();
        }
    }

}
