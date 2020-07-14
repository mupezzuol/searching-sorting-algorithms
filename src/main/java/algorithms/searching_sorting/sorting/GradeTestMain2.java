package algorithms.searching_sorting.sorting;

import algorithms.searching_sorting.models.Grade;

public class GradeTestMain2 {

    public static void main(String[] args) {
        Grade[] grades = {
                new Grade("Murillo", 4.0),
                new Grade("Gabriella", 5.0),
                new Grade("Raul", 8.5),
                new Grade("Manuela", 9.0),
                new Grade("Adriana", 3.0),
                new Grade("Joao", 6.7),
                new Grade("Maria", 7.0),
                new Grade("Henrique", 9.3),
                new Grade("Jorge", 9.4),
                new Grade("Diego", 9.5)
        };

        Grade[] rank = merge(grades, 0, 4, grades.length);

        for (Grade grade: rank) {
            System.out.println("Student: " + grade.getStudent() + " - " + grade.getValue());
        }
    }

    private static Grade[] merge(Grade[] grades, int begin, int middle, int end) {
        Grade[] result = new Grade[end - begin];

        int current1 = begin;
        int current2 = middle; // from middle
        int currentPointer = 0;

        while (current1 < middle && current2 < end) {

            Grade grade1 = grades[current1];
            Grade grade2 = grades[current2];

            if (grade1.getValue() < grade2.getValue()){
                result[currentPointer] = grade1;
                current1++;
            } else {
                result[currentPointer] = grade2;
                current2++;
            }
            currentPointer++;
        }

        // first part of the array chosen to the middle
        while (current1 < middle){
            result[currentPointer] = grades[current1];
            currentPointer++;
            current1++;
        }

        // the middle to the end
        while (current2 < end){
            result[currentPointer] = grades[current2];
            currentPointer++;
            current2++;
        }

        for (int count = 0; count < currentPointer; count++){
            grades[begin + count] = result[count];
        }

        return grades;
    }

}
