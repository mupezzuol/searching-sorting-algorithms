package algorithms.searching_sorting.models;

import algorithms.searching_sorting.interfaces.ISortGrade;

public class SortGrade implements ISortGrade {

    @Override
    public Grade[] mergeSort(Grade[] grades, int begin, int end) {
        order(grades, begin, end);
        return grades;
    }

    @Override
    public void order(Grade[] grades, int begin, int end) {
        int count = end - begin;
        if (count > 1){
            int middle = (begin + end) / 2;
            order(grades, begin, middle); // order first middle (recursive)
            order(grades, middle, end); // order second middle (recursive)
            merge(grades, begin, middle, end); // merge two parts already ordered
        }
    }

    @Override
    public void merge(Grade[] grades, int begin, int middle, int end) {
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

        // rest of itens for add
        for (int count = 0; count < currentPointer; count++){
            grades[begin + count] = result[count];
        }
    }

}
