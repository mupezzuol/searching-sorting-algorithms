package algorithms.searching_sorting.sorting;

import algorithms.searching_sorting.models.Grade;

public class GradeTestMain {

    public static void main(String[] args) {
        Grade[] gradeOfMurillo = {
                new Grade("Murillo", 4.0),
                new Grade("Gabriella", 5.0),
                new Grade("Raul", 8.5),
                new Grade("Manuela", 9.0)
        };

        Grade[] gradeOfGabriella = {
                new Grade("Adriana", 3.0),
                new Grade("Joao", 6.7),
                new Grade("Maria", 7.0),
                new Grade("Henrique", 9.3),
                new Grade("Jorge", 9.4),
                new Grade("Diego", 9.5)
        };

        Grade[] rank = merge(gradeOfMurillo, gradeOfGabriella);

        for (Grade grade: rank) {
            System.out.println("Student: " + grade.getStudent() + " - " + grade.getValue());
        }
    }

    private static Grade[] merge(Grade[] grades1, Grade[] grades2) {
        int total = grades1.length + grades2.length;
        Grade[] result = new Grade[total];

        int current1 = 0;
        int current2 = 0;
        int currentPointer = 0;

        while (current1 < grades1.length && current2 < grades2.length) {

            Grade grade1 = grades1[current1];
            Grade grade2 = grades2[current2];

            if (grade1.getValue() < grade2.getValue()){
                // murillo >
                result[currentPointer] = grade1;
                current1++;
            } else {
                // gabriella <
                result[currentPointer] = grade2;
                current2++;
            }
            currentPointer++;
        }

        while (current1 < grades1.length){
            result[currentPointer] = grades1[current1];
            currentPointer++;
            current1++;
        }

        while (current2 < grades2.length){
            result[currentPointer] = grades2[current2];
            currentPointer++;
            current2++;
        }

        return result;
    }

}
