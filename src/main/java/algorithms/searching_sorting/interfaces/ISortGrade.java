package algorithms.searching_sorting.interfaces;

import algorithms.searching_sorting.models.Grade;

public interface ISortGrade {

    Grade[] mergeSort(Grade[] grades, int begin, int end);
    void order(Grade[] grades, int begin, int end);
    void merge(Grade[] grades, int begin, int middle, int end);

}
