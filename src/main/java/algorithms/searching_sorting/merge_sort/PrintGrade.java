package algorithms.searching_sorting.merge_sort;

public class PrintGrade {

    public void printGrades(Grade[] grades) {
        for (Grade grade: grades) {
            System.out.println("Student: " + grade.getStudent() + " - " + grade.getValue());
        }
    }

}
